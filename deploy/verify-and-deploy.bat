@echo off
setlocal
chcp 65001 >nul
set "PYTHONIOENCODING=utf-8"

REM Quality-gated deploy: unit tests -> production build -> fast deploy.
REM Aborts on the first failure so a broken build never reaches the server.

set "PYTHON_EXE=D:\environment\anaconda3\envs\py314\python.exe"
set "ACTIVATE=D:\environment\activate-shizuki-site.cmd"
set "FRONTEND_DIR=%~dp0..\fronted\vue3-merged"

if exist "%ACTIVATE%" call "%ACTIVATE%"

echo [1/3] Frontend unit tests...
pushd "%FRONTEND_DIR%"
call pnpm test:unit
if errorlevel 1 (
  popd
  echo [ERROR] Unit tests failed - deployment aborted.
  pause
  exit /b 1
)

echo [2/3] Production build...
call pnpm build
if errorlevel 1 (
  popd
  echo [ERROR] Build failed - deployment aborted.
  pause
  exit /b 1
)
popd

echo [3/3] Fast deploy to server...
"%PYTHON_EXE%" "%~dp0server_deploy_fast.py" update
if errorlevel 1 (
  echo [ERROR] Deploy failed. See deploy\logs\fast-deploy-*.log
  pause
  exit /b 1
)

echo All checks passed and deployment finished.
pause
