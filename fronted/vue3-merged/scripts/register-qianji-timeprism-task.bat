@echo off
setlocal

set "SCRIPT_DIR=%~dp0"
set "PROJECT_DIR=%SCRIPT_DIR%.."
set "CONFIG_FILE=%SCRIPT_DIR%qianji-local-sync.config.jsonc"
set "NODE_EXE=D:\environment\nodejs\runtime\node-v24.17.0-win-x64\node.exe"

if defined QIANJI_SYNC_CONFIG set "CONFIG_FILE=%QIANJI_SYNC_CONFIG%"
if defined QIANJI_SYNC_NODE_EXE set "NODE_EXE=%QIANJI_SYNC_NODE_EXE%"

if not exist "%CONFIG_FILE%" (
  echo [qianji-sync] Missing config: "%CONFIG_FILE%"
  echo [qianji-sync] Please copy "qianji-local-sync.config.example.jsonc" to "qianji-local-sync.config.jsonc" first.
  pause
  exit /b 1
)

if not exist "%NODE_EXE%" (
  set "NODE_EXE=node"
)

cd /d "%PROJECT_DIR%"
"%NODE_EXE%" "%SCRIPT_DIR%qianji-timeprism-task.mjs" --config "%CONFIG_FILE%" %*
set "EXIT_CODE=%ERRORLEVEL%"

if not "%EXIT_CODE%"=="0" (
  echo.
  echo [qianji-sync] TimePrism task registration exited with code %EXIT_CODE%.
  pause
)

exit /b %EXIT_CODE%
