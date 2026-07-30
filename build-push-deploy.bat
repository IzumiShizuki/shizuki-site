@echo off
setlocal EnableExtensions
chcp 65001 >nul

set "PROJECT_ROOT=%~dp0"
set "FRONTEND_DIR=%PROJECT_ROOT%fronted\vue3-merged"
set "ACTIVATE_SCRIPT=D:\environment\activate-shizuki-site.cmd"
set "PYTHON_EXE=D:\environment\anaconda3\envs\py314\python.exe"
set "DEPLOY_SCRIPT=%PROJECT_ROOT%deploy\server_deploy_fast.py"

if /I "%~1"=="--help" goto :usage

cd /d "%PROJECT_ROOT%"

where git >nul 2>nul
if errorlevel 1 (
  echo [ERROR] Git is not available in PATH.
  goto :failure
)

if not exist "%ACTIVATE_SCRIPT%" (
  echo [ERROR] Environment activation script not found: %ACTIVATE_SCRIPT%
  goto :failure
)

if not exist "%PYTHON_EXE%" (
  echo [ERROR] Python runtime not found: %PYTHON_EXE%
  goto :failure
)

if not exist "%DEPLOY_SCRIPT%" (
  echo [ERROR] Deploy helper not found: %DEPLOY_SCRIPT%
  goto :failure
)

set "BRANCH="
for /f "delims=" %%B in ('git rev-parse --abbrev-ref HEAD') do set "BRANCH=%%B"
if not defined BRANCH (
  echo [ERROR] Unable to determine the current Git branch.
  goto :failure
)

if /I "%BRANCH%"=="HEAD" (
  echo [ERROR] Detached HEAD is not supported. Switch to a branch first.
  goto :failure
)

set "WORKTREE_DIRTY="
for /f "delims=" %%L in ('git status --porcelain=v1') do set "WORKTREE_DIRTY=1"
if defined WORKTREE_DIRTY (
  echo [ERROR] The worktree has uncommitted changes.
  echo Commit or stash the intended changes before publishing. This script never stages files automatically.
  goto :failure
)

echo [1/6] Updating %BRANCH% from origin...
git fetch origin "%BRANCH%"
if errorlevel 1 goto :failure
git pull --rebase origin "%BRANCH%"
if errorlevel 1 goto :failure

echo [2/6] Activating the shizuki-site environment...
call "%ACTIVATE_SCRIPT%"
if errorlevel 1 goto :failure

if not exist "%FRONTEND_DIR%\package.json" (
  echo [ERROR] Frontend project not found: %FRONTEND_DIR%
  goto :failure
)

echo [3/6] Running frontend unit tests...
pushd "%FRONTEND_DIR%"
call pnpm test:unit
if errorlevel 1 (
  popd
  goto :failure
)

echo [4/6] Building the production frontend...
call pnpm build
if errorlevel 1 (
  popd
  goto :failure
)
popd

choice /M "Push %BRANCH% and deploy it to 111.228.35.186"
if errorlevel 2 (
  echo [INFO] Publish cancelled before Git push.
  exit /b 0
)
if not errorlevel 1 goto :failure

where bd >nul 2>nul
if errorlevel 1 (
  echo [WARN] bd is unavailable, skipping bd sync.
) else (
  echo [5/6] Syncing task state...
  bd sync
  if errorlevel 1 goto :failure
)

echo [5/6] Pushing %BRANCH% to origin...
git push origin "%BRANCH%"
if errorlevel 1 goto :failure

echo [6/6] Uploading and rebuilding the production server...
"%PYTHON_EXE%" "%DEPLOY_SCRIPT%" update
if errorlevel 1 goto :failure

echo.
echo [OK] Build, push, and deployment completed successfully.
pause
exit /b 0

:usage
echo Usage: double-click this file after committing the intended changes.
echo The script updates the current branch, tests, builds, asks for confirmation,
echo pushes to origin, then deploys to 111.228.35.186.
exit /b 0

:failure
echo.
echo [ERROR] Publish aborted. Review the output above; nothing further was started after the failing step.
pause
exit /b 1
