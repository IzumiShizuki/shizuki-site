@echo off
setlocal
chcp 65001 >nul
set "PYTHONIOENCODING=utf-8"

REM Fast one-click deploy: single-archive upload + remote rebuild.
REM Progress is mirrored to deploy\logs\fast-deploy-*.log and deploy\.local-deploy.status
set "PYTHON_EXE=D:\environment\anaconda3\envs\py314\python.exe"
set "SCRIPT_FILE=%~dp0server_deploy_fast.py"

echo [0/1] Checking Python runtime...
if not exist "%PYTHON_EXE%" (
  echo [ERROR] Python runtime not found: "%PYTHON_EXE%"
  echo Please restore the existing Conda py314 environment.
  pause
  exit /b 1
)

if not exist "%SCRIPT_FILE%" (
  echo [ERROR] Deploy helper not found: "%SCRIPT_FILE%"
  pause
  exit /b 1
)

echo [1/1] Running fast server deploy...
"%PYTHON_EXE%" "%SCRIPT_FILE%" update
if errorlevel 1 (
  echo [ERROR] Fast update + deploy failed. See deploy\logs\fast-deploy-*.log
  pause
  exit /b 1
)

echo Fast update + deploy finished successfully.
pause
