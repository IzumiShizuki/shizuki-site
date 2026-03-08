@echo off
setlocal

REM One-click remote redeploy for shizuki-site
set "REMOTE_HOST=111.228.35.186"
set "REMOTE_USER=root"
set "REMOTE_PASS=Izumi2486"
set "REMOTE_DIR=/opt/shizuki-site/deploy"

echo [1/3] Checking WSL...
wsl.exe -l -q >nul 2>nul
if errorlevel 1 (
  echo [ERROR] WSL is not available on this machine.
  echo Please install WSL and Ubuntu first.
  pause
  exit /b 1
)

echo [2/3] Running remote redeploy...
wsl.exe bash -lc "command -v sshpass >/dev/null 2>&1 || { echo '[ERROR] sshpass not found in WSL. Install with: sudo apt-get update && sudo apt-get install -y sshpass'; exit 1; }; sshpass -p '%REMOTE_PASS%' ssh -o StrictHostKeyChecking=no %REMOTE_USER%@%REMOTE_HOST% 'set -e; cd %REMOTE_DIR%; docker compose -f docker-compose.server.yml --env-file .env.server up -d --build; docker compose -f docker-compose.server.yml --env-file .env.server ps'"
if errorlevel 1 (
  echo [ERROR] Redeploy failed.
  pause
  exit /b 1
)

echo [3/3] Redeploy finished successfully.
pause

