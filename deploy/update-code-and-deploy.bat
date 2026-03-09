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
wsl.exe bash -lc "set -e; APP_DIR=\$(wslpath -a \"%~dp0..\"); command -v sshpass >/dev/null 2>&1 || { echo '[ERROR] sshpass not found in WSL. Install with: sudo apt-get update && sudo apt-get install -y sshpass'; exit 1; }; command -v rsync >/dev/null 2>&1 || { echo '[ERROR] rsync not found in WSL. Install with: sudo apt-get update && sudo apt-get install -y rsync'; exit 1; }; sshpass -p '%REMOTE_PASS%' rsync -az --delete --exclude '.git/' --exclude '.beads/' --exclude '.idea/' --exclude '.vscode/' --exclude '.mvn/repository/' --exclude 'node_modules/' --exclude 'target/' --exclude 'dist-temp/' --exclude '.DS_Store' --exclude 'deploy/.env.server' -e 'ssh -o StrictHostKeyChecking=no' \"\$APP_DIR/\" %REMOTE_USER%@%REMOTE_HOST%:%REMOTE_APP_DIR%/; sshpass -p '%REMOTE_PASS%' ssh -o StrictHostKeyChecking=no %REMOTE_USER%@%REMOTE_HOST% 'set -e; cd %REMOTE_DEPLOY_DIR%; docker compose -f docker-compose.server.yml --env-file .env.server up -d --build; docker compose -f docker-compose.server.yml --env-file .env.server ps'"
if errorlevel 1 (
  echo [ERROR] Update code + deploy failed.
  pause
  exit /b 1
)

echo [3/3] Update code + deploy finished successfully.
pause
