@echo off
setlocal EnableExtensions
chcp 65001 >nul

set "PROJECT_ROOT=%~dp0"
set "FRONTEND_DIR=%PROJECT_ROOT%fronted\vue3-merged"
set "ACTIVATE_SCRIPT=D:\environment\activate-shizuki-site.cmd"
set "PYTHON_EXE=D:\environment\anaconda3\envs\py314\python.exe"
set "DEPLOY_SCRIPT=%PROJECT_ROOT%deploy\server_deploy.py"

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

if /I not "%BRANCH%"=="master" (
  echo [ERROR] Publishing is limited to the clean master branch.
  goto :failure
)

set "WORKTREE_DIRTY="
for /f "delims=" %%L in ('git status --porcelain=v1') do set "WORKTREE_DIRTY=1"
if defined WORKTREE_DIRTY (
  echo [ERROR] The worktree has uncommitted changes.
  echo Commit or stash the intended changes before publishing. This script never stages files automatically.
  goto :failure
)

echo [1/7] Fetching and fast-forwarding master from origin...
git fetch --prune origin master
if errorlevel 1 goto :failure
git pull --ff-only origin master
if errorlevel 1 goto :failure

echo [2/7] Activating the shizuki-site environment...
call "%ACTIVATE_SCRIPT%"
if errorlevel 1 goto :failure

if not exist "%FRONTEND_DIR%\package.json" (
  echo [ERROR] Frontend project not found: %FRONTEND_DIR%
  goto :failure
)

echo [3/7] Running frontend unit tests...
pushd "%FRONTEND_DIR%"
call pnpm test:unit
if errorlevel 1 (
  popd
  goto :failure
)

echo [4/7] Building the production frontend...
call pnpm build
if errorlevel 1 (
  popd
  goto :failure
)
popd

choice /M "Push clean master and deploy it to 111.228.35.186"
if errorlevel 2 (
  echo [INFO] Publish cancelled before Git push.
  exit /b 0
)
if not errorlevel 1 goto :failure

echo [5/7] Validating the private SSH source and known-hosts file...
if not defined REMOTE_USER (
  echo [ERROR] Set REMOTE_USER in a private shell or secret source.
  goto :failure
)
if not defined REMOTE_KNOWN_HOSTS (
  echo [ERROR] Set REMOTE_KNOWN_HOSTS to an existing known_hosts file.
  goto :failure
)
if not exist "%REMOTE_KNOWN_HOSTS%" (
  echo [ERROR] REMOTE_KNOWN_HOSTS does not point to an existing file.
  goto :failure
)
if defined REMOTE_SSH_KEY_PATH (
  if defined REMOTE_PASS (
    echo [ERROR] Provide exactly one private SSH source: REMOTE_SSH_KEY_PATH or REMOTE_PASS.
    goto :failure
  )
  if not exist "%REMOTE_SSH_KEY_PATH%" (
    echo [ERROR] REMOTE_SSH_KEY_PATH does not point to an existing private key file.
    goto :failure
  )
) else (
  if not defined REMOTE_PASS (
    echo [ERROR] Set REMOTE_SSH_KEY_PATH ^(recommended^) or REMOTE_PASS in a private secret source.
    goto :failure
  )
)
if not defined DEPLOY_DATABASE_BACKUP_COMMAND (
  echo [ERROR] Set DEPLOY_DATABASE_BACKUP_COMMAND in the private secret source.
  echo It must write a non-empty backup to the server-assigned snapshot path.
  goto :failure
)
if not defined DEPLOY_DATABASE_RESTORE_COMMAND (
  echo [ERROR] Set DEPLOY_DATABASE_RESTORE_COMMAND in the private secret source.
  echo It must restore from the server-assigned snapshot path.
  goto :failure
)

echo [6/7] Pushing master to origin...
git push origin master
if errorlevel 1 goto :failure

git fetch origin master
if errorlevel 1 goto :failure
git diff --quiet HEAD origin/master
if errorlevel 1 (
  echo [ERROR] Local master no longer exactly matches origin/master. Deployment is blocked.
  goto :failure
)

echo [7/7] Creating a restore point, uploading the approved payload, rebuilding,
echo       checking the API and site entry, and automatically rolling back on failure...
"%PYTHON_EXE%" "%DEPLOY_SCRIPT%" update
if errorlevel 1 goto :failure

echo.
echo [OK] Build, push, and deployment completed successfully.
pause
exit /b 0

:usage
echo Usage: double-click this file after committing the intended changes.
echo The script requires clean master, fast-forwards from origin, tests and builds,
echo asks for confirmation, pushes master, then deploys to 111.228.35.186.
echo Set REMOTE_USER, REMOTE_KNOWN_HOSTS and exactly one of REMOTE_SSH_KEY_PATH or REMOTE_PASS
echo plus DEPLOY_DATABASE_BACKUP_COMMAND and DEPLOY_DATABASE_RESTORE_COMMAND in a private
echo shell or secret source before running it. Both commands receive DEPLOY_DATABASE_BACKUP_PATH.
exit /b 0

:failure
echo.
echo [ERROR] Publish aborted. Review the output above; nothing further was started after the failing step.
pause
exit /b 1
