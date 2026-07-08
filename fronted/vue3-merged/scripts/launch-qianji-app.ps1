$ErrorActionPreference = 'Stop'

$toolScript = [System.IO.Path]::GetFullPath((Join-Path (Split-Path -Parent $MyInvocation.MyCommand.Path) '..\..\..\tools\qianji-sync\launch-qianji-app.ps1'))
& $toolScript
exit $LASTEXITCODE
