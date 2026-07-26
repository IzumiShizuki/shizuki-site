@echo off
setlocal
chcp 65001 >nul
set "PYTHONIOENCODING=utf-8"

REM One-click Meguri gateway setup: patch server .env.server + upload sprites
REM + recreate backend. Token is read locally and never printed.
set "PYTHON_EXE=D:\environment\anaconda3\envs\py314\python.exe"
set "SCRIPT_FILE=%~dp0configure-meguri-gateway.py"

if not exist "%PYTHON_EXE%" (
  echo [ERROR] Python runtime not found: "%PYTHON_EXE%"
  pause
  exit /b 1
)

"%PYTHON_EXE%" "%SCRIPT_FILE%"
if errorlevel 1 (
  echo [ERROR] Meguri gateway configuration failed. See deploy\logs\meguri-config-*.log
  pause
  exit /b 1
)

echo Meguri gateway configured successfully.
pause
