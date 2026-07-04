@echo off
setlocal

REM One-click upload local code + rebuild & deploy containers for shizuki-site
set "PYTHON_EXE=D:\environment\anaconda3\envs\py314\python.exe"
set "SCRIPT_FILE=%~dp0server_deploy.py"

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

echo [1/1] Running Windows-native server deploy...
"%PYTHON_EXE%" "%SCRIPT_FILE%" update
if errorlevel 1 (
  echo [ERROR] Update code + deploy failed.
  pause
  exit /b 1
)

echo Update code + deploy finished successfully.
pause
