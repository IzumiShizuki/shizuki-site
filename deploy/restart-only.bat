@echo off
setlocal

REM One-click restart existing containers without uploading source code
set "REMOTE_HOST=111.228.35.186"
set "REMOTE_USER=root"
set "REMOTE_PASS=Izumi2486"
set "REMOTE_DEPLOY_DIR=/opt/shizuki-site/deploy"

echo [1/3] Checking WSL...
wsl.exe -l -q >nul 2>nul
if errorlevel 1 (
  echo [ERROR] WSL is not available on this machine.
  echo Please install WSL and Ubuntu first.
  pause
  exit /b 1
)

echo [2/3] Restarting containers on server...
wsl.exe bash -lc "set -e; command -v sshpass >/dev/null 2>&1 || { echo '[ERROR] sshpass not found in WSL. Install with: sudo apt-get update && sudo apt-get install -y sshpass'; exit 1; }; sshpass -p '%REMOTE_PASS%' ssh -o StrictHostKeyChecking=no %REMOTE_USER%@%REMOTE_HOST% 'set -e; cd %REMOTE_DEPLOY_DIR%; docker compose -f docker-compose.server.yml --env-file .env.server up -d --no-build; docker compose -f docker-compose.server.yml --env-file .env.server ps'"
if errorlevel 1 (
  echo [ERROR] Restart-only deploy failed.
  pause
  exit /b 1
)

echo [3/3] Restart-only deploy finished successfully.
pause
