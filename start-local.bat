@echo off
setlocal EnableExtensions
chcp 65001 >nul

set "PROJECT_ROOT=%~dp0"
set "FRONTEND_DIR=%PROJECT_ROOT%fronted\vue3-merged"
set "ACTIVATE_SCRIPT=D:\environment\activate-shizuki-site.cmd"
set "BACKEND_SCRIPT=D:\environment\run-shizuki-monolith.cmd"

if /I "%~1"=="--help" goto :usage

if not exist "%ACTIVATE_SCRIPT%" (
  echo [ERROR] Environment activation script not found: %ACTIVATE_SCRIPT%
  goto :failure
)

if not exist "%BACKEND_SCRIPT%" (
  echo [ERROR] Backend launcher not found: %BACKEND_SCRIPT%
  goto :failure
)

if not exist "%FRONTEND_DIR%\package.json" (
  echo [ERROR] Frontend project not found: %FRONTEND_DIR%
  goto :failure
)

if not exist "%FRONTEND_DIR%\node_modules" (
  echo [ERROR] Frontend dependencies are missing.
  echo Run pnpm install from %FRONTEND_DIR% first.
  goto :failure
)

echo Starting the backend and frontend in separate terminals...
echo Backend:  http://localhost:8080
echo Frontend: http://localhost:5173
echo Middleware remains on the configured remote host 111.228.35.186.

start "Shizuki Backend" /D "%PROJECT_ROOT%" cmd.exe /d /k "call ""%BACKEND_SCRIPT%"""
start "Shizuki Frontend" /D "%FRONTEND_DIR%" cmd.exe /d /k "call ""%ACTIVATE_SCRIPT%"" ^&^& cd /d ""%FRONTEND_DIR%"" ^&^& call pnpm dev"

echo [OK] Local development processes were started.
exit /b 0

:usage
echo Usage: double-click this file to start the monolith and Vite in two terminals.
exit /b 0

:failure
echo.
echo [ERROR] Local startup was not started. Review the message above.
pause
exit /b 1
