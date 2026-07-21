@echo off
setlocal

set "SCRIPT_DIR=%~dp0"
set "PROJECT_DIR=%SCRIPT_DIR%.."
set "CONFIG_FILE=%SCRIPT_DIR%qianji-local-sync.config.jsonc"
set "SECRET_FILE=%SCRIPT_DIR%qianji-local-sync.secret.bat"
set "NODE_EXE=D:\environment\nodejs\runtime\node-v24.17.0-win-x64\node.exe"
set "PYTHON_EXE=D:\environment\anaconda3\envs\py314\python.exe"
set "MEGURI_PROJECT_DIR=D:\program\meguri-pet"
set "DAILY_DIGEST_FILE=D:\program\shizuki-site\data\qianji-sync\daily-billing-digest.json"

if defined QIANJI_SYNC_CONFIG set "CONFIG_FILE=%QIANJI_SYNC_CONFIG%"
if defined QIANJI_SYNC_NODE_EXE set "NODE_EXE=%QIANJI_SYNC_NODE_EXE%"
if defined QIANJI_REPORT_PYTHON_EXE set "PYTHON_EXE=%QIANJI_REPORT_PYTHON_EXE%"
if defined QIANJI_REPORT_PROJECT_DIR set "MEGURI_PROJECT_DIR=%QIANJI_REPORT_PROJECT_DIR%"
if defined QIANJI_DAILY_DIGEST_FILE set "DAILY_DIGEST_FILE=%QIANJI_DAILY_DIGEST_FILE%"

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
call "%SCRIPT_DIR%qianji-android-db-sync.bat"
if errorlevel 1 (
  echo [qianji-sync] Android DB sync skipped with code %ERRORLEVEL%.
)
"%NODE_EXE%" "%SCRIPT_DIR%qianji-local-sync.mjs" --config "%CONFIG_FILE%" --once %*
set "EXIT_CODE=%ERRORLEVEL%"
if not "%EXIT_CODE%"=="0" exit /b %EXIT_CODE%

if not exist "%PYTHON_EXE%" (
  echo [qianji-sync] Missing report Python: "%PYTHON_EXE%"
  exit /b 1
)
if not exist "%MEGURI_PROJECT_DIR%\tools\generate_daily_billing_report.py" (
  echo [qianji-sync] Missing Meguri billing report generator.
  exit /b 1
)
"%PYTHON_EXE%" "%MEGURI_PROJECT_DIR%\tools\generate_daily_billing_report.py" --input "%DAILY_DIGEST_FILE%" --project-root "%MEGURI_PROJECT_DIR%"
set "EXIT_CODE=%ERRORLEVEL%"
exit /b %EXIT_CODE%
