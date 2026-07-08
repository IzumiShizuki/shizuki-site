@echo off
setlocal

set "TOOL_SCRIPT=%~dp0..\..\..\tools\qianji-sync\install-qianji-app-startup.bat"
call "%TOOL_SCRIPT%" %*
exit /b %ERRORLEVEL%
