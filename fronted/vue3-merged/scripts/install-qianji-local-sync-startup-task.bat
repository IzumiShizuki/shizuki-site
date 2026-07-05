@echo off
setlocal

set "SCRIPT_DIR=%~dp0"
set "TASK_NAME=ShizukiSite-QianjiLocalSync-Watch"
set "RUN_PS1=%SCRIPT_DIR%qianji-local-sync-watch-hidden.ps1"
set "POWERSHELL_EXE=%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe"
set "STARTUP_DIR=%APPDATA%\Microsoft\Windows\Start Menu\Programs\Startup"
set "STARTUP_CMD=%STARTUP_DIR%\ShizukiSite-QianjiLocalSync-Watch.cmd"

if not exist "%RUN_PS1%" (
  echo [qianji-sync] Missing launcher: "%RUN_PS1%"
  pause
  exit /b 1
)

if not exist "%POWERSHELL_EXE%" (
  echo [qianji-sync] Missing PowerShell: "%POWERSHELL_EXE%"
  pause
  exit /b 1
)

schtasks /Create /TN "%TASK_NAME%" /SC ONLOGON /TR "\"%POWERSHELL_EXE%\" -NoProfile -ExecutionPolicy Bypass -WindowStyle Hidden -File \"%RUN_PS1%\"" /F >nul
if not errorlevel 1 (
  echo [qianji-sync] Startup task created: %TASK_NAME%
  schtasks /Query /TN "%TASK_NAME%"
  exit /b 0
)

echo [qianji-sync] Scheduled task creation failed. Falling back to Startup folder launcher.
if not exist "%STARTUP_DIR%" mkdir "%STARTUP_DIR%"
powershell -NoProfile -Command ^
  "$q = [char]34; $content = '@echo off' + [Environment]::NewLine + $q + $env:POWERSHELL_EXE + $q + ' -NoProfile -ExecutionPolicy Bypass -WindowStyle Hidden -File ' + $q + $env:RUN_PS1 + $q; Set-Content -LiteralPath $env:STARTUP_CMD -Value $content -Encoding Ascii"
if errorlevel 1 (
  echo [qianji-sync] Failed to create Startup launcher "%STARTUP_CMD%".
  pause
  exit /b 1
)

echo [qianji-sync] Startup launcher created: %STARTUP_CMD%
exit /b 0
