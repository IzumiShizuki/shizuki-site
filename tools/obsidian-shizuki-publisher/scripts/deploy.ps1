[CmdletBinding()]
param(
    [string]$VaultPath = 'C:\Users\IzumiShizuki\Documents\Obsidian Vault',
    [string]$NodePath = 'D:\environment\nodejs\runtime\node-v24.17.0-win-x64\node.exe'
)

$ErrorActionPreference = 'Stop'
$pluginRoot = Split-Path -Parent $PSScriptRoot
$repoRoot = Split-Path -Parent (Split-Path -Parent $pluginRoot)
$resolvedVault = (Resolve-Path -LiteralPath $VaultPath).Path
$obsidianDir = Join-Path $resolvedVault '.obsidian'
$targetPluginDir = Join-Path $obsidianDir 'plugins\shizuki-site-publisher'
$drawioDir = Join-Path $obsidianDir 'plugins\drawio'
$backupDir = Join-Path $repoRoot 'tools\local\obsidian-backups'
$rawRoot = Join-Path $resolvedVault '00_Notion_Raw'

function Get-TreeDigest([string]$RootPath) {
    if (-not (Test-Path -LiteralPath $RootPath)) { return 'MISSING' }
    $lines = Get-ChildItem -LiteralPath $RootPath -Recurse -File |
        ForEach-Object {
            $relative = [System.IO.Path]::GetRelativePath($RootPath, $_.FullName).Replace('\', '/')
            $hash = (Get-FileHash -LiteralPath $_.FullName -Algorithm SHA256).Hash
            "$relative|$hash"
        } |
        Sort-Object
    $bytes = [System.Text.Encoding]::UTF8.GetBytes(($lines -join "`n"))
    return [Convert]::ToHexString([System.Security.Cryptography.SHA256]::HashData($bytes))
}

function Read-JsonObject([string]$Path) {
    if (-not (Test-Path -LiteralPath $Path)) { return [pscustomobject]@{} }
    $raw = Get-Content -LiteralPath $Path -Raw
    if ([string]::IsNullOrWhiteSpace($raw)) { return [pscustomobject]@{} }
    return $raw | ConvertFrom-Json
}

function Write-Json([string]$Path, $Value) {
    $json = $Value | ConvertTo-Json -Depth 100
    $normalized = ($json -replace "`r`n", "`n") + "`n"
    [System.IO.File]::WriteAllText($Path, $normalized, [System.Text.UTF8Encoding]::new($false))
}

function Set-ObjectProperty($Object, [string]$Name, $Value) {
    $existing = $Object.PSObject.Properties[$Name]
    if ($null -ne $existing) {
        $existing.Value = $Value
    } else {
        $Object | Add-Member -MemberType NoteProperty -Name $Name -Value $Value
    }
}

if (-not (Test-Path -LiteralPath $obsidianDir -PathType Container)) {
    throw "Not an Obsidian vault: $resolvedVault"
}
if (-not (Test-Path -LiteralPath $NodePath -PathType Leaf)) {
    throw "Node.js was not found at $NodePath"
}

$rawDigestBefore = Get-TreeDigest $rawRoot

& $NodePath --check (Join-Path $pluginRoot 'main.js')
& $NodePath --test (Join-Path $pluginRoot 'test\*.test.cjs')
if ($LASTEXITCODE -ne 0) { throw 'Plugin tests failed; deployment stopped.' }
& $NodePath (Join-Path $pluginRoot 'build.cjs')
if ($LASTEXITCODE -ne 0) { throw 'Plugin bundle failed; deployment stopped.' }
& $NodePath --check (Join-Path $pluginRoot 'dist\main.js')

New-Item -ItemType Directory -Path $targetPluginDir -Force | Out-Null
foreach ($name in @('manifest.json', 'core.js', 'styles.css')) {
    Copy-Item -LiteralPath (Join-Path $pluginRoot $name) -Destination (Join-Path $targetPluginDir $name) -Force
}
Copy-Item -LiteralPath (Join-Path $pluginRoot 'dist\main.js') -Destination (Join-Path $targetPluginDir 'main.js') -Force

$pluginDataPath = Join-Path $targetPluginDir 'data.json'
$pluginData = Read-JsonObject $pluginDataPath
foreach ($entry in ([ordered]@{
    siteUrl = 'https://shizuki.site'
    editorUrl = 'https://embed.diagrams.net/'
    defaultCategoryCode = 'life'
    defaultVisibility = 'PUBLIC'
    backgroundPath = [string]($pluginData.backgroundPath ?? '')
}).GetEnumerator()) {
    Set-ObjectProperty $pluginData $entry.Key $entry.Value
}
Write-Json $pluginDataPath $pluginData

$communityPath = Join-Path $obsidianDir 'community-plugins.json'
$enabled = @((Get-Content -LiteralPath $communityPath -Raw | ConvertFrom-Json))
$enabled = @($enabled | Where-Object { $_ -ne 'dynamic-theme-background' })
if ($enabled -notcontains 'shizuki-site-publisher') { $enabled += 'shizuki-site-publisher' }
Write-Json $communityPath $enabled

$appearancePath = Join-Path $obsidianDir 'appearance.json'
$appearance = Read-JsonObject $appearancePath
Set-ObjectProperty $appearance 'theme' 'obsidian'
Set-ObjectProperty $appearance 'accentColor' '#8577e8'
Write-Json $appearancePath $appearance

$backgroundFolder = Join-Path $resolvedVault '90-Assets\images\Backgrounds'
New-Item -ItemType Directory -Path $backgroundFolder -Force | Out-Null

$hearthDataPath = Join-Path $obsidianDir 'plugins\hearth\data.json'
if (Test-Path -LiteralPath $hearthDataPath) {
    $hearth = Read-JsonObject $hearthDataPath
    Set-ObjectProperty $hearth 'backgroundKind' 'color'
    Set-ObjectProperty $hearth 'backgroundValue' '#101218'
    Set-ObjectProperty $hearth 'backgroundOpacity' 1
    foreach ($dashboard in @($hearth.dashboards)) {
        if ($null -eq $dashboard.background) {
            Set-ObjectProperty $dashboard 'background' ([pscustomobject]@{})
        }
        Set-ObjectProperty $dashboard.background 'kind' 'color'
        Set-ObjectProperty $dashboard.background 'value' '#101218'
        Set-ObjectProperty $dashboard.background 'opacity' 1
        Set-ObjectProperty $dashboard.background 'blur' 0
    }
    Write-Json $hearthDataPath $hearth
}

$drawioMainPath = Join-Path $drawioDir 'main.js'
$drawioDataPath = Join-Path $drawioDir 'data.json'
if (-not (Test-Path -LiteralPath $drawioMainPath -PathType Leaf)) {
    throw "Draw.io plugin runtime was not found: $drawioMainPath"
}
New-Item -ItemType Directory -Path $backupDir -Force | Out-Null
$backupPath = Join-Path $backupDir 'drawio-3.1.1-main.js.bak'
if (-not (Test-Path -LiteralPath $backupPath)) {
    Copy-Item -LiteralPath $drawioMainPath -Destination $backupPath
}
& $NodePath (Join-Path $pluginRoot 'drawio-patch.cjs') --file $drawioMainPath
if ($LASTEXITCODE -ne 0) { throw 'Draw.io adapter patch failed.' }

$drawioData = Read-JsonObject $drawioDataPath
Set-ObjectProperty $drawioData 'editorUrl' 'https://embed.diagrams.net/'
Set-ObjectProperty $drawioData 'EditorTheme' 'dark'
Set-ObjectProperty $drawioData 'clientAutoUpdate' $false
Write-Json $drawioDataPath $drawioData

$partialDrawioZip = Join-Path $drawioDir 'webapp.zip'
if (Test-Path -LiteralPath $partialDrawioZip -PathType Leaf) {
    Remove-Item -LiteralPath $partialDrawioZip -Force
    Write-Host 'Removed the incomplete draw.io offline-client download (webapp.zip).'
}

$rawDigestAfter = Get-TreeDigest $rawRoot
if ($rawDigestAfter -ne $rawDigestBefore) {
    throw '00_Notion_Raw changed during deployment; inspect the vault before continuing.'
}

Write-Host "Installed Shizuki Site Publisher at $targetPluginDir"
Write-Host 'Disabled conflicting plugin: dynamic-theme-background'
Write-Host 'Configured neutral dark appearance and shared diagrams.net editor.'
Write-Host "00_Notion_Raw digest preserved: $rawDigestAfter"
