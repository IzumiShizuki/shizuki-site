@echo off
setlocal

set "TOOL_SCRIPT=%~dp0..\..\..\tools\qianji-sync\remove-qianji-app-startup.bat"
call "%TOOL_SCRIPT%" %*
exit /b %ERRORLEVEL%
