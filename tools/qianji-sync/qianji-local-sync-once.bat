@echo off
setlocal

set "SCRIPT_DIR=%~dp0"
set "PROJECT_DIR=%SCRIPT_DIR%.."
set "CONFIG_FILE=%SCRIPT_DIR%qianji-local-sync.config.jsonc"
set "SECRET_FILE=%SCRIPT_DIR%qianji-local-sync.secret.bat"
set "NODE_EXE=D:\environment\nodejs\runtime\node-v24.17.0-win-x64\node.exe"

if defined QIANJI_SYNC_CONFIG set "CONFIG_FILE=%QIANJI_SYNC_CONFIG%"
if defined QIANJI_SYNC_NODE_EXE set "NODE_EXE=%QIANJI_SYNC_NODE_EXE%"

if exist "%SECRET_FILE%" call "%SECRET_FILE%"

if not exist "%CONFIG_FILE%" (
  echo [qianji-sync] Missing config: "%CONFIG_FILE%"
  echo [qianji-sync] Please copy "qianji-local-sync.config.example.jsonc" to "qianji-local-sync.config.jsonc" first.
  exit /b 1
)

if not exist "%NODE_EXE%" (
  set "NODE_EXE=node"
)

cd /d "%PROJECT_DIR%"
"%NODE_EXE%" "%SCRIPT_DIR%qianji-local-sync.mjs" --config "%CONFIG_FILE%" --once %*
set "EXIT_CODE=%ERRORLEVEL%"
exit /b %EXIT_CODE%
