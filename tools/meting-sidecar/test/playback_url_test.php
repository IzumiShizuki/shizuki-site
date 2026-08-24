<?php

declare(strict_types=1);

require_once __DIR__ . '/../lib/playback_url.php';

function assertPlaybackUrl(string $expected, string $input): void
{
    $actual = normalizePlaybackUrl($input);
    if ($actual !== $expected) {
        fwrite(STDERR, sprintf("expected %s, got %s\n", $expected, $actual));
        exit(1);
    }
}

assertPlaybackUrl(
    'https://m801.music.126.net/song.mp3?v=opaque#media',
    'http://m801.music.126.net/song.mp3?v=opaque#media'
);
assertPlaybackUrl(
    'https://m701.music.126.net/song.mp3',
    'https://m701.music.126.net/song.mp3'
);
assertPlaybackUrl(
    'https://isure.stream.qqmusic.qq.com/song.m4a',
    '//isure.stream.qqmusic.qq.com/song.m4a'
);
assertPlaybackUrl('', '   ');

fwrite(STDOUT, "playback URL normalization tests passed\n");
