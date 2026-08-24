[CmdletBinding()]
param(
    [string]$BaseUrl = 'https://site.shizuki.online',
    [string]$Provider = '',
    [string]$TrackId = '',
    [int]$TimeoutSeconds = 20,
    [switch]$SkipMediaProbe
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

function Get-SafeMessage {
    param([System.Management.Automation.ErrorRecord]$Record)

    $message = ''
    if ($null -ne $Record.ErrorDetails) {
        $message = [string]$Record.ErrorDetails.Message
    }
    if ([string]::IsNullOrWhiteSpace($message)) {
        $message = [string]$Record.Exception.Message
    }
    $message = $message -replace 'https?://[^\s"''<>]+', '<redacted-url>'
    $message = $message -replace '(?i)(cookie|token|secret|password|authorization)\s*[:=]\s*[^\s,;]+', '$1=<redacted>'
    return ($message -replace '[\r\n]+', ' ').Trim()
}

function Stop-Check {
    param(
        [string]$Stage,
        [int]$ExitCode,
        [string]$Reason
    )

    Write-Output ("[FAIL] stage={0} reason={1}" -f $Stage, $Reason)
    exit $ExitCode
}

function Join-ServiceUrl {
    param([string]$Path)
    return ([Uri]::new([Uri]$script:NormalizedBaseUrl, $Path)).AbsoluteUri
}

function Invoke-JsonGet {
    param(
        [string]$Stage,
        [string]$Path,
        [int]$ExitCode
    )

    try {
        return Invoke-RestMethod -Method Get -Uri (Join-ServiceUrl $Path) -TimeoutSec $TimeoutSeconds
    } catch {
        Stop-Check -Stage $Stage -ExitCode $ExitCode -Reason (Get-SafeMessage $_)
    }
}

function Invoke-MediaRangeProbe {
    param([Uri]$MediaUri)

    $handler = [System.Net.Http.HttpClientHandler]::new()
    $handler.AllowAutoRedirect = $true
    $client = [System.Net.Http.HttpClient]::new($handler)
    $client.Timeout = [TimeSpan]::FromSeconds($TimeoutSeconds)
    $request = [System.Net.Http.HttpRequestMessage]::new([System.Net.Http.HttpMethod]::Get, $MediaUri)
    $request.Headers.Range = [System.Net.Http.Headers.RangeHeaderValue]::new(0, 1023)
    $request.Headers.Referrer = [Uri](Join-ServiceUrl '/')
    $request.Headers.UserAgent.ParseAdd('shizuki-music-smoke/1.0')

    try {
        $response = $client.SendAsync(
            $request,
            [System.Net.Http.HttpCompletionOption]::ResponseHeadersRead
        ).GetAwaiter().GetResult()
        $statusCode = [int]$response.StatusCode
        if ($statusCode -ne 200 -and $statusCode -ne 206) {
            throw "media returned HTTP $statusCode"
        }

        $stream = $response.Content.ReadAsStreamAsync().GetAwaiter().GetResult()
        try {
            $buffer = [byte[]]::new(1024)
            $bytesRead = $stream.Read($buffer, 0, $buffer.Length)
        } finally {
            $stream.Dispose()
        }
        if ($bytesRead -le 0) {
            throw 'media response contained no bytes'
        }

        $contentType = [string]$response.Content.Headers.ContentType.MediaType
        return [pscustomobject]@{
            StatusCode = $statusCode
            BytesRead = $bytesRead
            ContentType = $contentType
            FinalHost = $response.RequestMessage.RequestUri.Host
            FinalScheme = $response.RequestMessage.RequestUri.Scheme
        }
    } finally {
        $request.Dispose()
        $client.Dispose()
        $handler.Dispose()
    }
}

try {
    $baseUri = [Uri]$BaseUrl
    if (-not $baseUri.IsAbsoluteUri -or $baseUri.Scheme -notin @('http', 'https')) {
        throw 'BaseUrl must be an absolute HTTP(S) URL'
    }
    $script:NormalizedBaseUrl = $baseUri.AbsoluteUri.TrimEnd('/') + '/'
} catch {
    Stop-Check -Stage 'arguments' -ExitCode 2 -Reason (Get-SafeMessage $_)
}

try {
    $entry = Invoke-WebRequest -Method Get -Uri (Join-ServiceUrl '/') -TimeoutSec $TimeoutSeconds
    if ([int]$entry.StatusCode -ne 200) {
        throw "site entry returned HTTP $([int]$entry.StatusCode)"
    }
    Write-Output '[PASS] stage=site-entry status=200'
} catch {
    Stop-Check -Stage 'site-entry' -ExitCode 10 -Reason (Get-SafeMessage $_)
}

$health = Invoke-JsonGet -Stage 'backend-health' -Path '/actuator/health' -ExitCode 20
if ([string]$health.status -ne 'UP') {
    Stop-Check -Stage 'backend-health' -ExitCode 20 -Reason 'backend status is not UP'
}
Write-Output '[PASS] stage=backend-health status=UP'

$meting = Invoke-JsonGet -Stage 'meting-status' -Path '/api/v1/music/meting/status' -ExitCode 30
$metingData = $meting.data
if ($null -eq $metingData -or $metingData.available -ne $true) {
    Stop-Check -Stage 'meting-status' -ExitCode 30 -Reason 'Meting is not available'
}
$providers = @($metingData.providers | ForEach-Object { [string]$_ } | Where-Object { $_ })
Write-Output ("[PASS] stage=meting-status providers={0}" -f ($providers -join ','))

$bundle = Invoke-JsonGet -Stage 'default-bundle' -Path '/api/v1/music/playlist/default/bundle' -ExitCode 40
$tracks = @($bundle.data.tracks)
if ($tracks.Count -eq 0) {
    Stop-Check -Stage 'default-bundle' -ExitCode 40 -Reason 'default playlist contains no tracks'
}
Write-Output ("[PASS] stage=default-bundle tracks={0}" -f $tracks.Count)

$selectedTrack = $tracks | Select-Object -First 1
$selectedProvider = if ([string]::IsNullOrWhiteSpace($Provider)) {
    [string]$selectedTrack.provider
} else {
    $Provider.Trim().ToLowerInvariant()
}
$selectedTrackId = if ([string]::IsNullOrWhiteSpace($TrackId)) {
    [string]$selectedTrack.track_id
} else {
    $TrackId.Trim()
}
if ([string]::IsNullOrWhiteSpace($selectedProvider) -or [string]::IsNullOrWhiteSpace($selectedTrackId)) {
    Stop-Check -Stage 'track-selection' -ExitCode 41 -Reason 'provider or track_id is empty'
}

$resolveBody = @{
    provider = $selectedProvider
    track_id = $selectedTrackId
    title = [string]$selectedTrack.title
    artist = [string]$selectedTrack.artist
    cover = [string]$selectedTrack.cover
    playlist_code = [string]$bundle.data.profile.playlist_code
    resolve_lyric = $true
    force_refresh = $true
} | ConvertTo-Json -Compress

try {
    $resolved = Invoke-RestMethod `
        -Method Post `
        -Uri (Join-ServiceUrl '/api/v1/music/tracks/resolve-playback') `
        -ContentType 'application/json' `
        -Body $resolveBody `
        -TimeoutSec $TimeoutSeconds
} catch {
    Stop-Check -Stage 'resolve-playback' -ExitCode 50 -Reason (Get-SafeMessage $_)
}

$audio = [string]$resolved.data.audio
if ([string]::IsNullOrWhiteSpace($audio)) {
    Stop-Check -Stage 'resolve-playback' -ExitCode 51 -Reason 'resolved audio URL is empty'
}

try {
    $audioUri = if ([Uri]::IsWellFormedUriString($audio, [UriKind]::Absolute)) {
        [Uri]$audio
    } else {
        [Uri]::new([Uri]$script:NormalizedBaseUrl, $audio)
    }
    if ($baseUri.Scheme -eq 'https' -and $audioUri.Scheme -ne 'https') {
        throw 'resolved media is HTTP and would be blocked as mixed content'
    }
    Write-Output ("[PASS] stage=resolve-playback provider={0} track_id={1} media_host={2}" -f `
        $selectedProvider, $selectedTrackId, $audioUri.Host)
} catch {
    Stop-Check -Stage 'resolve-playback' -ExitCode 52 -Reason (Get-SafeMessage $_)
}

if (-not $SkipMediaProbe) {
    try {
        $media = Invoke-MediaRangeProbe -MediaUri $audioUri
        if ($baseUri.Scheme -eq 'https' -and $media.FinalScheme -ne 'https') {
            throw 'media redirect downgraded to HTTP'
        }
        Write-Output ("[PASS] stage=media-range status={0} bytes={1} content_type={2} final_host={3}" -f `
            $media.StatusCode, $media.BytesRead, $media.ContentType, $media.FinalHost)
    } catch {
        Stop-Check -Stage 'media-range' -ExitCode 60 -Reason (Get-SafeMessage $_)
    }
}

Write-Output '[PASS] result=music-playable'
exit 0
