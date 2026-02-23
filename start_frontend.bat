@echo off
setlocal

set "SCRIPT_DIR=%~dp0"
set "FRONTEND_DIR=%SCRIPT_DIR%fronted\vue3-merged"
set "VITE_CMD=node_modules\.bin\vite.cmd"
set "ROLLUP_NATIVE_DIR=node_modules\@rollup\rollup-win32-x64-msvc"

if not exist "%FRONTEND_DIR%\package.json" (
  echo [ERROR] Frontend project not found: "%FRONTEND_DIR%"
  echo Please confirm folder "fronted\vue3-merged" exists.
  pause
  exit /b 1
)

where npm >nul 2>nul
if errorlevel 1 (
  echo [ERROR] npm not found. Please install Node.js first.
  pause
  exit /b 1
)

cd /d "%FRONTEND_DIR%"

if not exist "node_modules" (
  echo [INFO] Installing dependencies...
  call npm install
  if errorlevel 1 (
    echo [ERROR] npm install failed.
    pause
    exit /b 1
  )
)

if not exist "%VITE_CMD%" (
  echo [WARN] Windows launcher not found: "%VITE_CMD%"
  echo [INFO] Rebuilding dependencies for current environment...
  call npm install
  if errorlevel 1 (
    echo [ERROR] npm install failed.
    pause
    exit /b 1
  )
)

if not exist "%VITE_CMD%" (
  echo [WARN] vite.cmd still missing, running clean reinstall...
  if exist "node_modules" rmdir /s /q "node_modules"
  call npm install
  if errorlevel 1 (
    echo [ERROR] npm install failed after clean reinstall.
    pause
    exit /b 1
  )
)

if not exist "%VITE_CMD%" (
  echo [ERROR] vite.cmd is still missing. Please check Node.js/npm installation.
  pause
  exit /b 1
)

if not exist "%ROLLUP_NATIVE_DIR%\package.json" (
  echo [WARN] Missing optional dependency "@rollup/rollup-win32-x64-msvc".
  echo [INFO] Installing Rollup native package for Windows...
  call npm install --no-save @rollup/rollup-win32-x64-msvc
  if errorlevel 1 (
    echo [WARN] Optional package install failed. Running clean reinstall...
    if exist "node_modules" rmdir /s /q "node_modules"
    call npm install
    if errorlevel 1 (
      echo [ERROR] npm install failed after clean reinstall.
      pause
      exit /b 1
    )
  )
)

if not exist "%ROLLUP_NATIVE_DIR%\package.json" (
  echo [ERROR] Rollup Windows native package is still missing.
  echo [ERROR] Please run: npm install --no-save @rollup/rollup-win32-x64-msvc
  pause
  exit /b 1
)

echo [INFO] Starting frontend dev server...
call npm run dev

if errorlevel 1 (
  echo [ERROR] Frontend failed to start.
  pause
  exit /b 1
)

endlocal
