@echo off
setlocal

set "SCRIPT_DIR=%~dp0"
set "CONFIG_FILE=%SCRIPT_DIR%qianji-local-sync.config.jsonc"
set "SECRET_FILE=%SCRIPT_DIR%qianji-local-sync.secret.bat"
set "WATCH_DIR=D:\program\shizuki-site\data\qianji-sync\incoming"
set "ARCHIVE_DIR=D:\program\shizuki-site\data\qianji-sync\archive"

if not exist "%WATCH_DIR%" mkdir "%WATCH_DIR%"
if not exist "%ARCHIVE_DIR%" mkdir "%ARCHIVE_DIR%"

if exist "%SECRET_FILE%" (
  call "%SECRET_FILE%"
)

if not exist "%CONFIG_FILE%" (
  echo [qianji-sync] Missing config: "%CONFIG_FILE%"
  pause
  exit /b 1
)

call "%SCRIPT_DIR%install-qianji-local-sync-2am-task.bat"
if errorlevel 1 exit /b 1

call "%SCRIPT_DIR%install-qianji-local-sync-startup-task.bat"
if errorlevel 1 exit /b 1

call "%SCRIPT_DIR%install-qianji-app-startup.bat"
if errorlevel 1 exit /b 1

if defined QIANJI_SYNC_PASSWORD (
  if /I not "%QIANJI_SYNC_PASSWORD%"=="CHANGE_ME" (
    call "%SCRIPT_DIR%register-qianji-timeprism-task.bat"
  ) else (
    echo [qianji-sync] TimePrism task skipped: please update qianji-local-sync.secret.bat first.
  )
) else (
  echo [qianji-sync] TimePrism task skipped: missing password in qianji-local-sync.secret.bat.
)

echo [qianji-sync] Ready.
echo [qianji-sync] Incoming folder: %WATCH_DIR%
echo [qianji-sync] Archive folder : %ARCHIVE_DIR%
pause
