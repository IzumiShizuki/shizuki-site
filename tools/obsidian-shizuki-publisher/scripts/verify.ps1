[CmdletBinding()]
param(
    [string]$VaultPath = 'C:\Users\IzumiShizuki\Documents\Obsidian Vault',
    [string]$ObsidianCli = 'D:\Program Files\Obsidian\Obsidian.com',
    [string]$VaultName = 'Obsidian Vault',
    [switch]$SkipRuntime
)

$ErrorActionPreference = 'Stop'
$resolvedVault = (Resolve-Path -LiteralPath $VaultPath).Path
$obsidianDir = Join-Path $resolvedVault '.obsidian'
$pluginDir = Join-Path $obsidianDir 'plugins\shizuki-site-publisher'
$failures = [System.Collections.Generic.List[string]]::new()

function Assert-Condition([bool]$Condition, [string]$Message) {
    if ($Condition) { Write-Host "PASS: $Message" }
    else { $failures.Add($Message); Write-Host "FAIL: $Message" }
}

foreach ($name in @('manifest.json', 'main.js', 'core.js', 'styles.css', 'data.json')) {
    Assert-Condition (Test-Path -LiteralPath (Join-Path $pluginDir $name) -PathType Leaf) "plugin file exists: $name"
}

if (-not $failures.Count) {
    $manifest = Get-Content -LiteralPath (Join-Path $pluginDir 'manifest.json') -Raw | ConvertFrom-Json
    Assert-Condition ($manifest.id -eq 'shizuki-site-publisher') 'manifest id is shizuki-site-publisher'
    $pluginDataRaw = Get-Content -LiteralPath (Join-Path $pluginDir 'data.json') -Raw
    Assert-Condition ($pluginDataRaw -notmatch '(?i)accessToken|refreshToken|password') 'plugin data contains no credential fields'
}

$enabled = @((Get-Content -LiteralPath (Join-Path $obsidianDir 'community-plugins.json') -Raw | ConvertFrom-Json))
Assert-Condition ($enabled -contains 'shizuki-site-publisher') 'publisher plugin is enabled'
Assert-Condition ($enabled -notcontains 'dynamic-theme-background') 'conflicting automatic background plugin is disabled'

$appearance = Get-Content -LiteralPath (Join-Path $obsidianDir 'appearance.json') -Raw | ConvertFrom-Json
Assert-Condition ($appearance.theme -eq 'obsidian') 'Obsidian base appearance is dark'
Assert-Condition ($appearance.accentColor -eq '#8577e8') 'accent color is neutral lavender, not green'
Assert-Condition (Test-Path -LiteralPath (Join-Path $resolvedVault '90-Assets\images\Backgrounds') -PathType Container) 'background selection folder exists'

$drawioMain = Get-Content -LiteralPath (Join-Path $obsidianDir 'plugins\drawio\main.js') -Raw
$drawioData = Get-Content -LiteralPath (Join-Path $obsidianDir 'plugins\drawio\data.json') -Raw | ConvertFrom-Json
Assert-Condition ($drawioMain.Contains('SHIZUKI_SHARED_DRAWIO_URL')) 'draw.io runtime uses configurable shared editor URL'
Assert-Condition ($drawioMain.Contains('SHIZUKI_REMOTE_DRAWIO_NO_LOCAL_SERVER')) 'draw.io skips the missing localhost webapp for remote editor mode'
Assert-Condition ($drawioData.editorUrl -eq 'https://embed.diagrams.net/') 'draw.io data points to the website shared editor origin'
Assert-Condition ($drawioData.EditorTheme -eq 'dark') 'draw.io requests dark editor UI'

$hearthPath = Join-Path $obsidianDir 'plugins\hearth\data.json'
if (Test-Path -LiteralPath $hearthPath) {
    $hearth = Get-Content -LiteralPath $hearthPath -Raw | ConvertFrom-Json
    Assert-Condition ($hearth.backgroundKind -eq 'color' -and $hearth.backgroundValue -eq '#101218') 'Hearth green wallpaper is replaced by neutral dark color'
}

if (-not $SkipRuntime) {
    if (-not (Test-Path -LiteralPath $ObsidianCli -PathType Leaf)) {
        $failures.Add("Obsidian CLI not found: $ObsidianCli")
    } else {
        & $ObsidianCli "vault=$VaultName" reload | Out-Null
        Start-Sleep -Milliseconds 1200
        & $ObsidianCli "vault=$VaultName" plugin:enable id=shizuki-site-publisher | Out-Null
        & $ObsidianCli "vault=$VaultName" plugin:reload id=drawio | Out-Null
        & $ObsidianCli "vault=$VaultName" plugin:reload id=shizuki-site-publisher | Out-Null
        $runtime = & $ObsidianCli "vault=$VaultName" eval 'code=JSON.stringify((()=>{const p=app.plugins.getPlugin("shizuki-site-publisher"); const d=app.plugins.getPlugin("drawio"); return {publisherLoaded:Boolean(p),backgroundClass:document.body.classList.contains("shizuki-dark-vault"),uploadCommand:Boolean(app.commands.findCommand("shizuki-site-publisher:upload-active-note")),publishCommand:Boolean(app.commands.findCommand("shizuki-site-publisher:publish-active-note")),drawioUrl:d?.settings?.editorUrl,drawioTheme:d?.settings?.EditorTheme};})())'
        Assert-Condition ($runtime -match '"publisherLoaded":true') 'publisher runtime loads in Obsidian'
        Assert-Condition ($runtime -match '"backgroundClass":true') 'dark background runtime class is active'
        Assert-Condition ($runtime -match '"uploadCommand":true' -and $runtime -match '"publishCommand":true') 'upload and publish commands are registered'
        Assert-Condition ($runtime -match '"drawioUrl":"https://embed.diagrams.net/"') 'draw.io runtime resolves the shared editor setting'

        try {
            $remoteProbe = Invoke-WebRequest -Uri 'https://embed.diagrams.net/?embed=1&proto=json&libraries=1&spin=1&ui=dark' -UseBasicParsing -TimeoutSec 15
            $remoteMarker = $remoteProbe.Content -match '(?i)draw\.io|diagrams\.net|mxGraph'
            Assert-Condition ($remoteProbe.StatusCode -eq 200 -and $remoteMarker) 'shared diagrams.net editor returns HTTP 200 with a draw.io marker'
        } catch {
            Assert-Condition $false "shared diagrams.net editor is reachable: $($_.Exception.Message)"
        }
    }
}

if ($failures.Count) {
    throw "Verification failed: $($failures -join '; ')"
}
Write-Host 'All Shizuki Obsidian bridge checks passed.'
