<?php

declare(strict_types=1);

// Keep upstream library deprecations out of HTTP response body to preserve JSON contract.
error_reporting(E_ALL & ~E_DEPRECATED & ~E_USER_DEPRECATED & ~E_WARNING & ~E_NOTICE);
ini_set('display_errors', '0');

require_once '/opt/meting/Meting.php';

use Metowolf\Meting;

const DEFAULT_SUPPORTED_PROVIDERS = ['netease', 'kuwo', 'qq'];

$method = strtoupper((string)($_SERVER['REQUEST_METHOD'] ?? 'GET'));
$uri = parse_url((string)($_SERVER['REQUEST_URI'] ?? '/'), PHP_URL_PATH);
$path = rtrim((string)$uri, '/');
if ($path === '') {
    $path = '/';
}

if ($method !== 'GET') {
    jsonResponse(405, ['code' => 'METHOD_NOT_ALLOWED', 'message' => 'Only GET is supported']);
}

try {
    switch ($path) {
        case '/':
            jsonResponse(200, [
                'service' => 'shizuki-meting-sidecar',
                'version' => '1.0.0',
                'endpoints' => ['/health', '/v1/search', '/v1/playlist', '/v1/track/resolve']
            ]);
            break;
        case '/health':
            jsonResponse(200, [
                'available' => true,
                'providers' => supportedProviders()
            ]);
            break;
        case '/v1/search':
            handleSearch();
            break;
        case '/v1/playlist':
            handlePlaylist();
            break;
        case '/v1/track/resolve':
            handleTrackResolve();
            break;
        default:
            jsonResponse(404, ['code' => 'NOT_FOUND', 'message' => 'Endpoint not found']);
    }
} catch (Throwable $exception) {
    jsonResponse(500, [
        'code' => 'UPSTREAM_ERROR',
        'message' => sanitizeMessage($exception->getMessage())
    ]);
}

function handleSearch(): void
{
    $provider = normalizeProvider((string)($_GET['provider'] ?? ''));
    $query = trim((string)($_GET['q'] ?? ''));
    if ($query === '') {
        jsonResponse(400, ['code' => 'BAD_REQUEST', 'message' => 'q is required']);
    }

    $page = max(1, (int)($_GET['page'] ?? 1));
    $limit = max(1, min(60, (int)($_GET['limit'] ?? 24)));

    $api = createMetingClient($provider);
    $rows = json_decode((string)$api->search($query, ['page' => $page, 'limit' => $limit]), true);
    if (!is_array($rows)) {
        $rows = [];
    }

    $tracks = [];
    foreach ($rows as $row) {
        if (!is_array($row)) {
            continue;
        }
        $trackId = trim((string)($row['id'] ?? ''));
        if ($trackId === '') {
            continue;
        }

        $artist = joinArtists($row['artist'] ?? '');
        $cover = '';
        $picId = trim((string)($row['pic_id'] ?? ''));
        if ($picId !== '') {
            $cover = readUrlField($api->pic($picId, 300));
        }

        $tracks[] = [
            'trackId' => $trackId,
            'provider' => $provider,
            'title' => trim((string)($row['name'] ?? $trackId)),
            'artist' => $artist,
            'album' => trim((string)($row['album'] ?? '')),
            'cover' => $cover,
            'durationSec' => null
        ];
    }

    jsonResponse(200, [
        'provider' => $provider,
        'query' => $query,
        'page' => $page,
        'limit' => $limit,
        'tracks' => $tracks
    ]);
}

function handlePlaylist(): void
{
    $provider = normalizeProvider((string)($_GET['provider'] ?? ''));
    $playlistId = trim((string)($_GET['playlist_id'] ?? ''));
    if ($playlistId === '') {
        jsonResponse(400, ['code' => 'BAD_REQUEST', 'message' => 'playlist_id is required']);
    }

    $api = createMetingClient($provider);
    $rows = json_decode((string)$api->playlist($playlistId), true);
    if (!is_array($rows)) {
        $rows = [];
    }

    $tracks = [];
    $sort = 1;
    foreach ($rows as $row) {
        if (!is_array($row)) {
            continue;
        }
        $trackId = trim((string)($row['id'] ?? ''));
        if ($trackId === '') {
            continue;
        }
        $source = normalizeProvider((string)($row['source'] ?? $provider));
        $artist = joinArtists($row['artist'] ?? '');
        $picId = trim((string)($row['pic_id'] ?? ''));
        $cover = $picId === '' ? '' : readUrlField($api->pic($picId, 300));

        $tracks[] = [
            'trackId' => $trackId,
            'provider' => $source,
            'title' => trim((string)($row['name'] ?? $trackId)),
            'artist' => $artist,
            'album' => trim((string)($row['album'] ?? '')),
            'cover' => $cover,
            'audio' => '',
            'lyricText' => '',
            'sort' => $sort,
            'durationSec' => null
        ];
        $sort += 1;
    }

    jsonResponse(200, [
        'provider' => $provider,
        'playlistId' => $playlistId,
        'name' => 'Meting Playlist ' . $playlistId,
        'description' => 'Meting provider playlist',
        'cover' => count($tracks) > 0 ? (string)$tracks[0]['cover'] : '',
        'trackCount' => count($tracks),
        'tracks' => $tracks
    ]);
}

function handleTrackResolve(): void
{
    $provider = normalizeProvider((string)($_GET['provider'] ?? ''));
    $trackId = trim((string)($_GET['track_id'] ?? ''));
    if ($trackId === '') {
        jsonResponse(400, ['code' => 'BAD_REQUEST', 'message' => 'track_id is required']);
    }

    $bitrate = max(64, min(320, (int)($_GET['bitrate'] ?? 128)));

    $api = createMetingClient($provider);

    $songRows = json_decode((string)$api->song($trackId), true);
    $song = (is_array($songRows) && isset($songRows[0]) && is_array($songRows[0])) ? $songRows[0] : [];

    $title = trim((string)($song['name'] ?? $trackId));
    $artist = joinArtists($song['artist'] ?? '');
    $album = trim((string)($song['album'] ?? ''));
    $picId = trim((string)($song['pic_id'] ?? ''));
    $cover = $picId === '' ? '' : readUrlField($api->pic($picId, 300));
    $audio = readUrlField($api->url($trackId, $bitrate));

    $lyricPayload = json_decode((string)$api->lyric($trackId), true);
    $lyricText = '';
    $translationLyricText = '';
    if (is_array($lyricPayload)) {
        $lyricText = trim((string)($lyricPayload['lyric'] ?? ''));
        $translationLyricText = trim((string)($lyricPayload['tlyric'] ?? ''));
    }

    jsonResponse(200, [
        'provider' => $provider,
        'trackId' => $trackId,
        'title' => $title,
        'artist' => $artist,
        'album' => $album,
        'cover' => $cover,
        'audio' => $audio,
        'lyricText' => $lyricText,
        'translationLyricText' => $translationLyricText,
        'furiganaLyricText' => ''
    ]);
}

function createMetingClient(string $provider): Meting
{
    $server = mapProviderToMetingServer($provider);
    $api = new Meting($server);
    $api->format(true);
    return $api;
}

function normalizeProvider(string $provider): string
{
    $normalized = strtolower(trim($provider));
    if ($normalized === 'tencent') {
        $normalized = 'qq';
    }
    if ($normalized === 'qqmusic') {
        $normalized = 'qq';
    }
    $providers = supportedProviders();
    if (!in_array($normalized, $providers, true)) {
        return $providers[0] ?? 'netease';
    }
    return $normalized;
}

function mapProviderToMetingServer(string $provider): string
{
    $normalized = normalizeProvider($provider);
    if ($normalized === 'qq') {
        return 'tencent';
    }
    return $normalized;
}

function supportedProviders(): array
{
    static $providers = null;
    if (is_array($providers)) {
        return $providers;
    }

    $raw = trim((string)getenv('METING_ALLOWED_PROVIDERS'));
    if ($raw === '') {
        $providers = DEFAULT_SUPPORTED_PROVIDERS;
        return $providers;
    }

    $result = [];
    $tokens = explode(',', $raw);
    foreach ($tokens as $token) {
        $normalized = strtolower(trim($token));
        if ($normalized === 'tencent' || $normalized === 'qqmusic') {
            $normalized = 'qq';
        }
        if (!in_array($normalized, DEFAULT_SUPPORTED_PROVIDERS, true)) {
            continue;
        }
        if (!in_array($normalized, $result, true)) {
            $result[] = $normalized;
        }
    }

    $providers = $result === [] ? DEFAULT_SUPPORTED_PROVIDERS : $result;
    return $providers;
}

function readUrlField(string $raw): string
{
    $decoded = json_decode($raw, true);
    if (!is_array($decoded)) {
        return '';
    }
    return trim((string)($decoded['url'] ?? ''));
}

function joinArtists($rawArtist): string
{
    if (is_array($rawArtist)) {
        $parts = [];
        foreach ($rawArtist as $item) {
            $value = trim((string)$item);
            if ($value !== '') {
                $parts[] = $value;
            }
        }
        return implode(', ', $parts);
    }
    return trim((string)$rawArtist);
}

function sanitizeMessage(string $message): string
{
    $clean = trim(str_replace(["\n", "\r"], ' ', $message));
    if ($clean === '') {
        return 'unknown_error';
    }
    return strlen($clean) > 240 ? substr($clean, 0, 240) . '...' : $clean;
}

function jsonResponse(int $statusCode, array $payload): void
{
    http_response_code($statusCode);
    header('Content-Type: application/json; charset=utf-8');
    echo json_encode($payload, JSON_UNESCAPED_UNICODE);
    exit;
}
