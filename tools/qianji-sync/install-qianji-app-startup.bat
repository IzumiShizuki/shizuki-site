@echo off
setlocal

set "SCRIPT_DIR=%~dp0"
set "RUN_PS1=%SCRIPT_DIR%launch-qianji-app.ps1"
set "POWERSHELL_EXE=%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe"
set "STARTUP_DIR=%APPDATA%\Microsoft\Windows\Start Menu\Programs\Startup"
set "STARTUP_VBS=%STARTUP_DIR%\ShizukiSite-Qianji-App.vbs"

if not exist "%RUN_PS1%" (
  echo [qianji-app] Missing launcher: "%RUN_PS1%"
  pause
  exit /b 1
)

if not exist "%POWERSHELL_EXE%" (
  echo [qianji-app] Missing PowerShell: "%POWERSHELL_EXE%"
  pause
  exit /b 1
)

if not exist "%STARTUP_DIR%" mkdir "%STARTUP_DIR%"
> "%STARTUP_VBS%" echo Set shell = CreateObject("WScript.Shell")
>> "%STARTUP_VBS%" echo command = """" ^& "%POWERSHELL_EXE%" ^& """" ^& " -NoProfile -ExecutionPolicy Bypass -WindowStyle Hidden -File " ^& """" ^& "%RUN_PS1%" ^& """"
>> "%STARTUP_VBS%" echo shell.Run command, 0, False
if errorlevel 1 (
  echo [qianji-app] Failed to create Startup launcher "%STARTUP_VBS%".
  pause
  exit /b 1
)

echo [qianji-app] Startup launcher created: %STARTUP_VBS%
exit /b 0
