@echo off
setlocal enabledelayedexpansion

REM ============================================================
REM  Shizuki mobile - one-click Android APK builder
REM
REM  Usage:
REM    build_apk.bat                     -> release build, default server
REM    build_apk.bat debug               -> debug build,   default server
REM    build_apk.bat release https://... -> release build, custom server URL
REM    build_apk.bat debug   https://...  -> debug build,   custom server URL
REM
REM  Output APK is copied to:  fronted\vue3-merged\apk-out\
REM ============================================================

set "SCRIPT_DIR=%~dp0"
set "FRONTEND_DIR=%SCRIPT_DIR%vue3-merged"
set "ANDROID_DIR=%FRONTEND_DIR%\android"
set "OUT_DIR=%FRONTEND_DIR%\apk-out"

REM ---- arguments -------------------------------------------------
set "BUILD_TYPE=%~1"
if /I "%BUILD_TYPE%"=="" set "BUILD_TYPE=release"
if /I not "%BUILD_TYPE%"=="release" if /I not "%BUILD_TYPE%"=="debug" (
  echo [ERROR] First argument must be "release" or "debug" (got "%BUILD_TYPE%").
  pause
  exit /b 1
)

set "GATEWAY=%~2"
if "%GATEWAY%"=="" set "GATEWAY=https://site.shizuki.online"

echo ============================================================
echo  Build type : %BUILD_TYPE%
echo  Server URL : %GATEWAY%
echo ============================================================

REM ---- sanity checks --------------------------------------------
if not exist "%FRONTEND_DIR%\package.json" (
  echo [ERROR] Frontend project not found: "%FRONTEND_DIR%"
  pause
  exit /b 1
)

where npm >nul 2>nul
if errorlevel 1 (
  echo [ERROR] npm not found. Please install Node.js first.
  pause
  exit /b 1
)

where java >nul 2>nul
if errorlevel 1 (
  echo [ERROR] java not found. Please install JDK 17+ and set JAVA_HOME.
  pause
  exit /b 1
)

cd /d "%FRONTEND_DIR%"

REM ---- dependencies ---------------------------------------------
if not exist "node_modules" (
  echo [1/6] Installing dependencies...
  call npm install
  if errorlevel 1 (
    echo [ERROR] npm install failed.
    pause
    exit /b 1
  )
) else (
  echo [1/6] Dependencies present, skipping install.
)

if not exist "node_modules\@capacitor\cli" (
  echo [INFO] Capacitor CLI missing, reinstalling dependencies...
  call npm install
  if errorlevel 1 (
    echo [ERROR] npm install failed.
    pause
    exit /b 1
  )
)

REM ---- android platform + sdk path ------------------------------
if not exist "%ANDROID_DIR%" (
  echo [2/6] Android platform missing, generating it...
  call node_modules\.bin\cap.cmd add android
  if errorlevel 1 (
    echo [ERROR] "cap add android" failed.
    pause
    exit /b 1
  )
) else (
  echo [2/6] Android platform present.
)

if not exist "%ANDROID_DIR%\local.properties" (
  set "SDK_DIR="
  if defined ANDROID_HOME set "SDK_DIR=%ANDROID_HOME%"
  if not defined SDK_DIR if defined ANDROID_SDK_ROOT set "SDK_DIR=%ANDROID_SDK_ROOT%"
  if not defined SDK_DIR if exist "%LOCALAPPDATA%\Android\Sdk" set "SDK_DIR=%LOCALAPPDATA%\Android\Sdk"
  if defined SDK_DIR (
    set "SDK_FWD=!SDK_DIR:\=/!"
    echo sdk.dir=!SDK_FWD!> "%ANDROID_DIR%\local.properties"
    echo [INFO] Wrote local.properties -^> !SDK_DIR!
  ) else (
    echo [WARN] Android SDK not found automatically.
    echo [WARN] Set ANDROID_HOME, or create "%ANDROID_DIR%\local.properties"
    echo [WARN] with a line like:  sdk.dir=C:/Users/you/AppData/Local/Android/Sdk
  )
)

REM ---- release keystore check -----------------------------------
if /I "%BUILD_TYPE%"=="release" (
  if not exist "%FRONTEND_DIR%\shizuki-release.keystore" (
    echo [WARN] Release keystore not found: "%FRONTEND_DIR%\shizuki-release.keystore"
    echo [WARN] Signing will fail. Generate one with:
    echo [WARN]   keytool -genkeypair -v -keystore shizuki-release.keystore -alias shizuki -keyalg RSA -keysize 2048 -validity 10000
  )
)

REM ---- 1. front-end build (bake in server URL) ------------------
echo [3/6] Building web assets (VITE_GATEWAY_BASE_URL=%GATEWAY%)...
set "VITE_GATEWAY_BASE_URL=%GATEWAY%"
call node_modules\.bin\vite.cmd build
if errorlevel 1 (
  echo [ERROR] vite build failed.
  pause
  exit /b 1
)

REM ---- 2. sync web assets into android --------------------------
echo [4/6] Copying web assets into Android project...
call node_modules\.bin\cap.cmd copy android
if errorlevel 1 (
  echo [ERROR] "cap copy android" failed.
  pause
  exit /b 1
)

REM ---- 3. gradle assemble ---------------------------------------
echo [5/6] Running Gradle assemble%BUILD_TYPE%...
cd /d "%ANDROID_DIR%"
if /I "%BUILD_TYPE%"=="release" (
  call gradlew.bat :app:assembleRelease
) else (
  call gradlew.bat :app:assembleDebug
)
if errorlevel 1 (
  echo [ERROR] Gradle build failed.
  pause
  exit /b 1
)

REM ---- 4. collect artifact --------------------------------------
echo [6/6] Collecting APK...
set "APK_SRC=%ANDROID_DIR%\app\build\outputs\apk\%BUILD_TYPE%\app-%BUILD_TYPE%.apk"
if not exist "%APK_SRC%" (
  echo [ERROR] Expected APK not found: "%APK_SRC%"
  pause
  exit /b 1
)

if not exist "%OUT_DIR%" mkdir "%OUT_DIR%"

for /f %%i in ('powershell -NoProfile -Command "Get-Date -Format yyyyMMdd-HHmmss"') do set "TS=%%i"
set "APK_OUT=%OUT_DIR%\Shizuki-%BUILD_TYPE%-!TS!.apk"
copy /y "%APK_SRC%" "%APK_OUT%" >nul

echo ============================================================
echo  BUILD SUCCESSFUL
echo  APK: %APK_OUT%
echo ============================================================
start "" "%OUT_DIR%"

endlocal
