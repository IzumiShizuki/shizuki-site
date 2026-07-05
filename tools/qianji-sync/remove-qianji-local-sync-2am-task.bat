@echo off
setlocal

set "TASK_NAME=ShizukiSite-QianjiLocalSync-2AM"
schtasks /Delete /TN "%TASK_NAME%" /F >nul
if errorlevel 1 (
  echo [qianji-sync] Failed to remove scheduled task "%TASK_NAME%".
  pause
  exit /b 1
)

echo [qianji-sync] Scheduled task removed: %TASK_NAME%
exit /b 0
