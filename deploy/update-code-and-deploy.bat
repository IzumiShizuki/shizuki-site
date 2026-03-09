@echo off
setlocal

REM One-click upload local code + rebuild & deploy containers for shizuki-site
set "REMOTE_HOST=111.228.35.186"
set "REMOTE_USER=root"
set "REMOTE_PASS=Izumi2486"
set "REMOTE_APP_DIR=/opt/shizuki-site"
set "REMOTE_DEPLOY_DIR=/opt/shizuki-site/deploy"

echo [1/3] Checking WSL...
wsl.exe -l -q >nul 2>nul
if errorlevel 1 (
  echo [ERROR] WSL is not available on this machine.
  echo Please install WSL and Ubuntu first.
  pause
  exit /b 1
)

echo [2/3] Uploading local code and rebuilding...
wsl.exe bash -lc "set -e; APP_DIR=\$(wslpath -a \"%~dp0..\"); cd \"\$APP_DIR\"; export REMOTE_HOST='%REMOTE_HOST%'; export REMOTE_USER='%REMOTE_USER%'; export REMOTE_PASS='%REMOTE_PASS%'; export REMOTE_APP_DIR='%REMOTE_APP_DIR%'; export REMOTE_DEPLOY_DIR='%REMOTE_DEPLOY_DIR%'; bash deploy/update-code-and-deploy.sh"
if errorlevel 1 (
  echo [ERROR] Update code + deploy failed.
  pause
  exit /b 1
)

echo [3/3] Update code + deploy finished successfully.
pause
