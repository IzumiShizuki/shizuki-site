@echo off
setlocal

set "SCRIPT_DIR=%~dp0"
set "PROJECT_DIR=%SCRIPT_DIR%.."
set "CONFIG_FILE=%SCRIPT_DIR%qianji-local-sync.config.jsonc"
set "SECRET_FILE=%SCRIPT_DIR%qianji-local-sync.secret.bat"
set "NODE_EXE=D:\environment\nodejs\runtime\node-v24.17.0-win-x64\node.exe"

if exist "%SECRET_FILE%" call "%SECRET_FILE%"
if not exist "%NODE_EXE%" set "NODE_EXE=node"

if "%~1"=="" (
  set /p QIANJI_SYNC_FROM=Enter start date (YYYY-MM-DD): 
) else (
  set "QIANJI_SYNC_FROM=%~1"
)

if "%~2"=="" (
  set /p QIANJI_SYNC_TO=Enter end date (YYYY-MM-DD): 
) else (
  set "QIANJI_SYNC_TO=%~2"
)

if "%QIANJI_SYNC_FROM%"=="" (
  echo [qianji-sync] Missing start date.
  pause
  exit /b 1
)

if "%QIANJI_SYNC_TO%"=="" (
  echo [qianji-sync] Missing end date.
  pause
  exit /b 1
)

cd /d "%PROJECT_DIR%"
"%NODE_EXE%" "%SCRIPT_DIR%qianji-local-sync-range.mjs" --config "%CONFIG_FILE%" --from "%QIANJI_SYNC_FROM%" --to "%QIANJI_SYNC_TO%"
set "EXIT_CODE=%ERRORLEVEL%"

if not "%EXIT_CODE%"=="0" (
  echo.
  echo [qianji-sync] Range backfill exited with code %EXIT_CODE%.
  pause
)

exit /b %EXIT_CODE%
