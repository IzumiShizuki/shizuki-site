@echo off
setlocal EnableExtensions EnableDelayedExpansion

set "SCRIPT_DIR=%~dp0"
set "LOG_DIR=D:\program\shizuki-site\data\qianji-sync\logs"
set "LOG_FILE=%LOG_DIR%\qianji-local-sync-2am.log"

if not exist "%LOG_DIR%" mkdir "%LOG_DIR%"

echo [%date:~-10% %time%] qianji-local-sync scheduled run starting>>"%LOG_FILE%"
call "%SCRIPT_DIR%qianji-local-sync-once.bat" %* >>"%LOG_FILE%" 2>&1
set "EXIT_CODE=!ERRORLEVEL!"
echo [%date:~-10% %time%] qianji-local-sync scheduled run exited with code !EXIT_CODE!>>"%LOG_FILE%"
exit /b !EXIT_CODE!
