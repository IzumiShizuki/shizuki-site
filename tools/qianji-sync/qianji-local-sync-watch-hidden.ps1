$ErrorActionPreference = 'Stop'

$scriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path
$projectDir = [System.IO.Path]::GetFullPath((Join-Path $scriptDir '..'))
$configFile = Join-Path $scriptDir 'qianji-local-sync.config.jsonc'
$secretFile = Join-Path $scriptDir 'qianji-local-sync.secret.bat'
$nodeExe = 'D:\environment\nodejs\runtime\node-v24.17.0-win-x64\node.exe'
$watchScript = Join-Path $scriptDir 'qianji-local-sync.mjs'
$androidDbSyncScript = Join-Path $scriptDir 'qianji-android-db-sync.mjs'
$pythonExe = 'D:\environment\anaconda3\envs\py314\python.exe'
$logDir = 'D:\program\shizuki-site\data\qianji-sync\logs'
$logFile = Join-Path $logDir 'qianji-local-sync-watch.log'

if ($env:QIANJI_SYNC_CONFIG) {
  $configFile = $env:QIANJI_SYNC_CONFIG
}
if ($env:QIANJI_SYNC_NODE_EXE) {
  $nodeExe = $env:QIANJI_SYNC_NODE_EXE
}
if ($env:QIANJI_SYNC_PYTHON_EXE) {
  $pythonExe = $env:QIANJI_SYNC_PYTHON_EXE
}

function Import-BatchSecretEnvironment {
  param(
    [Parameter(Mandatory = $true)]
    [string]$Path
  )

  if (-not (Test-Path -LiteralPath $Path)) {
    return
  }

  $lines = & cmd.exe /d /c "call ""$Path"" >nul 2>nul && set QIANJI_SYNC_"
  foreach ($line in $lines) {
    if ($line -match '^([^=]+)=(.*)$') {
      [System.Environment]::SetEnvironmentVariable($matches[1], $matches[2], 'Process')
    }
  }
}

if (-not (Test-Path -LiteralPath $configFile)) {
  throw "[qianji-sync] Missing config: $configFile"
}

if (-not (Test-Path -LiteralPath $nodeExe)) {
  $nodeExe = 'node'
}

Import-BatchSecretEnvironment -Path $secretFile

New-Item -ItemType Directory -Force -Path $logDir | Out-Null

$timestamp = Get-Date -Format 'yyyy-MM-dd HH:mm:ss'
"[$timestamp] qianji-local-sync watcher starting" | Out-File -FilePath $logFile -Encoding utf8 -Append

Push-Location $projectDir
try {
  if (Test-Path -LiteralPath $androidDbSyncScript) {
    $syncAt = Get-Date -Format 'yyyy-MM-dd HH:mm:ss'
    "[$syncAt] qianji-android-db-sync bootstrap starting" | Out-File -FilePath $logFile -Encoding utf8 -Append
    $env:QIANJI_SYNC_PYTHON_EXE = $pythonExe
    & $nodeExe $androidDbSyncScript --config $configFile *>> $logFile
    if ($LASTEXITCODE -ne 0) {
      $failedAt = Get-Date -Format 'yyyy-MM-dd HH:mm:ss'
      "[$failedAt] qianji-android-db-sync bootstrap exited with code $LASTEXITCODE" | Out-File -FilePath $logFile -Encoding utf8 -Append
    }
  }

  $previousPreference = $ErrorActionPreference
  $ErrorActionPreference = 'Continue'
  & $nodeExe $watchScript --config $configFile --watch *>> $logFile
  $exitCode = $LASTEXITCODE
  if ($exitCode -ne 0) {
    $failedAt = Get-Date -Format 'yyyy-MM-dd HH:mm:ss'
    "[$failedAt] watcher exited with code $exitCode" | Out-File -FilePath $logFile -Encoding utf8 -Append
  }
  exit $exitCode
} finally {
  $ErrorActionPreference = $previousPreference
  Pop-Location
}
