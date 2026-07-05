@echo off
setlocal

set "TASK_NAME=ShizukiSite-QianjiLocalSync-Watch"
set "STARTUP_CMD=%APPDATA%\Microsoft\Windows\Start Menu\Programs\Startup\ShizukiSite-QianjiLocalSync-Watch.cmd"
set "EXIT_CODE=0"

schtasks /Delete /TN "%TASK_NAME%" /F >nul 2>nul
if errorlevel 1 set "EXIT_CODE=1"

if exist "%STARTUP_CMD%" del "%STARTUP_CMD%"
if exist "%STARTUP_CMD%" set "EXIT_CODE=1"

exit /b %EXIT_CODE%
