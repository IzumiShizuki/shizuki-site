@echo off
setlocal

set "STARTUP_VBS=%APPDATA%\Microsoft\Windows\Start Menu\Programs\Startup\ShizukiSite-Qianji-App.vbs"
set "EXIT_CODE=0"

if exist "%STARTUP_VBS%" del "%STARTUP_VBS%"
if exist "%STARTUP_VBS%" set "EXIT_CODE=1"

exit /b %EXIT_CODE%
