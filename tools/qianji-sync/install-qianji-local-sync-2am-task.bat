@echo off
setlocal

set "SCRIPT_DIR=%~dp0"
set "TASK_NAME=ShizukiSite-QianjiLocalSync-2AM"
set "RUN_BAT=%SCRIPT_DIR%qianji-local-sync-once.bat"

if not exist "%RUN_BAT%" (
  echo [qianji-sync] Missing runner: "%RUN_BAT%"
  pause
  exit /b 1
)

schtasks /Create /TN "%TASK_NAME%" /SC DAILY /ST 02:00 /TR "\"%RUN_BAT%\"" /F >nul
if errorlevel 1 (
  echo [qianji-sync] Failed to create scheduled task "%TASK_NAME%".
  pause
  exit /b 1
)

echo [qianji-sync] Scheduled task created: %TASK_NAME%
schtasks /Query /TN "%TASK_NAME%"
exit /b 0
