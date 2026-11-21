param(
    [Parameter(Mandatory)][string]$PostgresBin,
    [Parameter(Mandatory)][string]$OldMapperClass,
    [Parameter(Mandatory)][string]$ExpectedOldMapperSha256
)
$ErrorActionPreference = 'Stop'
$repo = (Resolve-Path "$PSScriptRoot/../../../..").Path
$report = "$repo/apps/monolith-app/target/surefire-reports/TEST-io.github.shizuki.site.monolith.filter.AuthEntryFilterTest.xml"
$classPath = (([xml](Get-Content -LiteralPath $report -Raw)).testsuite.properties.property |
    Where-Object name -eq 'java.class.path').value
if (!$classPath) { throw 'Run the backend AuthEntryFilterTest first to generate the classpath.' }
if ((Get-FileHash -LiteralPath $OldMapperClass).Hash -ne $ExpectedOldMapperSha256) { throw 'Legacy mapper digest mismatch.' }
$bin = (Resolve-Path -LiteralPath $PostgresBin).Path
$tempRoot = [IO.Path]::GetFullPath([IO.Path]::GetTempPath())
$runRoot = Join-Path $tempRoot ("todo-flyway-qa-" + [guid]::NewGuid().ToString('N'))
$null = New-Item -ItemType Directory -Path $runRoot
$started = $false
$originalQaPassword = $env:TODO_QA_TEMP_PASSWORD
try {
    $legacyPath = "$runRoot/legacy-classes/io/github/shizuki/site/content/mapper"
    $null = New-Item -ItemType Directory -Path $legacyPath -Force
    Copy-Item -LiteralPath $OldMapperClass -Destination "$legacyPath/LightAppTodoMapper.class"
    $cp = "$runRoot/legacy-classes;$runRoot;$classPath".Replace('\','/')
    $source = "$PSScriptRoot/UpgradeProbe.java".Replace('\','/')
    $argFile = "$runRoot/compiler.args"
    [IO.File]::WriteAllText($argFile, "-encoding UTF-8 -cp `"$cp`" -d `"$($runRoot.Replace('\','/'))`" `"$source`"")
    & javac "@$argFile"
    if ($LASTEXITCODE) { throw 'Compile failed.' }
    $pwFile = "$runRoot/initdb.pw"
    $env:TODO_QA_TEMP_PASSWORD = [guid]::NewGuid().ToString('N')
    [IO.File]::WriteAllText($pwFile, $env:TODO_QA_TEMP_PASSWORD)
    & "$bin/initdb.exe" -D "$runRoot/data" -U todo_qa --auth=scram-sha-256 "--pwfile=$pwFile" --no-locale --encoding=UTF8 | Out-Null
    if ($LASTEXITCODE) { throw 'initdb failed.' }
    Remove-Item -LiteralPath $pwFile
    $listener = [Net.Sockets.TcpListener]::new([Net.IPAddress]::Loopback, 0)
    $listener.Start()
    $port = $listener.LocalEndpoint.Port
    $listener.Stop()
    $startArgs = @('start','-D',"`"$runRoot/data`"",'-l',"`"$runRoot/server.log`"",
                   '-o',"`"-h 127.0.0.1 -p $port`"",'-w')
    $ctl = Start-Process -FilePath "$bin/pg_ctl.exe" -ArgumentList $startArgs -WindowStyle Hidden -PassThru
    $ctl.WaitForExit()
    if ($ctl.ExitCode) { throw 'PostgreSQL startup failed.' }
    $started = $true
    $resources = "$repo/apps/monolith-app/src/main/resources/monolith/db/migration-pg".Replace('\','/')
    $javaArgs = "-cp `"$cp`" UpgradeProbe $port `"$($runRoot.Replace('\','/'))`" `"$resources`""
    [IO.File]::WriteAllText("$runRoot/java.args", $javaArgs)
    & java "@$runRoot/java.args"
    if ($LASTEXITCODE) { throw 'Upgrade probe failed.' }
} finally {
    $env:TODO_QA_TEMP_PASSWORD = $originalQaPassword
    if ($started) {
        & "$bin/pg_ctl.exe" stop -D "$runRoot/data" -m fast -w | Out-Null
        if ($LASTEXITCODE) { throw 'Could not stop test cluster. Its data directory was retained.' }
    }
    $target = (Resolve-Path -LiteralPath $runRoot).Path
    if ([IO.Path]::GetDirectoryName($target) -eq $tempRoot.TrimEnd('\') -and
        [IO.Path]::GetFileName($target) -match '^todo-flyway-qa-[a-f0-9]{32}$') {
        Remove-Item -LiteralPath $target -Recurse -Force
    }
}
