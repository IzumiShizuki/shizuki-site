param(
    [string]$EnvFile = "$PSScriptRoot/.env.ai-newapi-cpa",
    [string]$ApiBaseUrl,
    [string]$ApiKey,
    [string]$Model,
    [string]$Message = "Please introduce yourself briefly.",
    [string]$SystemPrompt = "",
    [switch]$RawResponse
)

Set-StrictMode -Version Latest
$ErrorActionPreference = "Stop"

function Read-DotEnv {
    param([string]$Path)

    $values = @{}
    if (-not (Test-Path -LiteralPath $Path)) {
        return $values
    }

    foreach ($line in Get-Content -LiteralPath $Path) {
        if ([string]::IsNullOrWhiteSpace($line)) {
            continue
        }

        $trimmed = $line.Trim()
        if ($trimmed.StartsWith("#")) {
            continue
        }

        $separatorIndex = $trimmed.IndexOf("=")
        if ($separatorIndex -lt 1) {
            continue
        }

        $key = $trimmed.Substring(0, $separatorIndex).Trim()
        $value = $trimmed.Substring($separatorIndex + 1).Trim()
        $values[$key] = $value
    }

    return $values
}

$envValues = Read-DotEnv -Path $EnvFile

if (-not $ApiBaseUrl) {
    $ApiBaseUrl = $envValues["AI_CHAT_BASE_URL"]
}
if (-not $ApiBaseUrl) {
    $ApiBaseUrl = $env:AI_CHAT_BASE_URL
}

if (-not $ApiKey) {
    $ApiKey = $envValues["AI_CHAT_API_KEY"]
}
if (-not $ApiKey) {
    $ApiKey = $env:AI_CHAT_API_KEY
}

if (-not $Model) {
    $Model = $envValues["AI_CHAT_MODEL"]
}
if (-not $Model) {
    $Model = $env:AI_CHAT_MODEL
}
if (-not $Model) {
    $Model = "cpa-gpt-5.4-mini"
}

if (-not $ApiBaseUrl) {
    throw "Missing ApiBaseUrl. Pass -ApiBaseUrl or provide AI_CHAT_BASE_URL in $EnvFile."
}
if (-not $ApiKey) {
    throw "Missing ApiKey. Pass -ApiKey or provide AI_CHAT_API_KEY in $EnvFile."
}

$normalizedBaseUrl = $ApiBaseUrl.TrimEnd("/")
$messages = @()

if ($SystemPrompt) {
    $messages += @{
        role = "system"
        content = $SystemPrompt
    }
}

$messages += @{
    role = "user"
    content = $Message
}

$body = @{
    model = $Model
    stream = $false
    messages = $messages
} | ConvertTo-Json -Depth 10

$response = Invoke-RestMethod `
    -Method Post `
    -Uri "$normalizedBaseUrl/v1/chat/completions" `
    -Headers @{ Authorization = "Bearer $ApiKey" } `
    -ContentType "application/json" `
    -Body $body

if ($RawResponse) {
    $response | ConvertTo-Json -Depth 20
    exit 0
}

$content = $response.choices[0].message.content
if ($content -is [System.Array]) {
    ($content | ForEach-Object {
        if ($_.type -eq "text") { $_.text }
    }) -join [Environment]::NewLine
} else {
    $content
}
