import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

const source = readFileSync(resolve(process.cwd(), 'src/pages/MusicLibraryPage.vue'), 'utf8');
const bridgeSource = readFileSync(
  resolve(process.cwd(), '../../third_party/folia-major/shizukiExternalBridge.ts'),
  'utf8'
);

function readFunction(name) {
  const start = source.indexOf(`function ${name}`);
  const next = source.indexOf('\nfunction ', start + 1);
  return source.slice(start, next < 0 ? source.length : next);
}

describe('MusicLibraryPage Folia mode handoff', () => {
  it('keeps both mode trees mounted and hides them without display:none', () => {
    expect(source).not.toContain('<div v-if="!foliaMode" class="music-library-module"');
    expect(source).toContain("'music-mode-pane-hidden': foliaMode");

    const hiddenPaneRule = source.match(/\.music-mode-pane-hidden\s*\{([^}]*)\}/)?.[1] || '';
    expect(hiddenPaneRule).toContain('visibility: hidden');
    expect(hiddenPaneRule).not.toContain('display: none');

    const hiddenFoliaRule = source.match(/\.folia-embed-pane\.folia-embed-hidden\s*\{([^}]*)\}/)?.[1] || '';
    expect(hiddenFoliaRule).toContain('visibility: hidden');
    expect(hiddenFoliaRule).not.toContain('display: none');
  });

  it('delivers one complete, versioned playback session to Folia', () => {
    const sessionBuilder = readFunction('buildFoliaPlaybackSession');
    const pendingDelivery = readFunction('deliverPendingFoliaSession');

    expect(sessionBuilder).toContain('version: ++foliaPlaybackSessionVersion');
    expect(sessionBuilder).toContain('queue');
    expect(sessionBuilder).toContain('playlist');
    expect(sessionBuilder).toContain('lyrics: buildFoliaLyricTimeline()');
    expect(sessionBuilder).toContain('lyricIndex');
    expect(sessionBuilder).toContain('durationMs');
    expect(pendingDelivery).toContain("type: 'shizuki:follow-playback'");
    expect(pendingDelivery).not.toContain("type: 'shizuki:play-track'");
    expect(pendingDelivery).toContain('session');
  });

  it('keeps playlist, lattice, and mode-exit paths on the site audio owner', () => {
    const playlistSelect = readFunction('handleFoliaPlaylistSelect');
    const latticeOpen = readFunction('handleOpenFoliaLattice');
    const modeSwitch = readFunction('setFoliaMode');

    expect(playlistSelect).toContain('player.replaceQueueWithTracks');
    expect(playlistSelect).toContain('pushCurrentTrackToFolia');
    expect(playlistSelect).not.toContain("type: 'shizuki:play-tracks'");

    expect(latticeOpen).toContain('player.replaceQueueWithTracks');
    expect(latticeOpen).toContain('pushCurrentTrackToFolia');
    expect(latticeOpen).not.toContain("type: 'shizuki:play-tracks'");

    expect(modeSwitch).toContain("type: 'shizuki:stop-follow-playback'");
    expect(modeSwitch).not.toContain('pullCurrentTrackFromFolia');
  });

  it('projects a smooth Folia clock and relays Folia playback controls', () => {
    expect(bridgeSource).toContain('window.requestAnimationFrame(runFollowClockFrame)');
    expect(bridgeSource).toContain("type: 'shizuki:playback-command'");
    expect(bridgeSource).toContain("type === 'shizuki:stop-follow-playback'");
    expect(source).toContain("data.type === 'shizuki:playback-command'");
    expect(source).toContain('applyFoliaPlaybackCommand');
  });

  it('mirrors Folia-selected tracks back to the site-owned player', () => {
    expect(source).toContain("type: 'shizuki:activate-playback-bridge'");
    expect(bridgeSource).toContain("type === 'shizuki:activate-playback-bridge'");
    expect(bridgeSource).toContain("type: 'shizuki:playback-intent'");
    expect(bridgeSource).toContain('forwardTrackIntent(track, 0, true)');
    expect(source).toContain("data.type === 'shizuki:playback-intent'");
    expect(source).toContain('mirrorFoliaPlaybackIntent');
    expect(source).toContain('player.playExternalTrack');
  });

  it('uses parent lyrics and metadata while preventing any Folia-owned audio output', () => {
    expect(bridgeSource).toContain('buildFollowLyrics(session.lyrics, song, session.durationMs)');
    expect(bridgeSource).toContain('store.setPlayQueue(queue.length ? queue : (song ? [song] : []))');
    expect(bridgeSource).toContain('store.setAudioSrc(null)');
    expect(bridgeSource).toContain('lockEmbeddedAudio()');
    expect(bridgeSource).toContain("document.addEventListener('play'");
    expect(bridgeSource).not.toContain('neteaseApi.getSongUrl');
    expect(bridgeSource).not.toContain('loadLyricsForTrack');
  });

  it('refreshes Folia when any rendered part of the site-owned session changes', () => {
    const foliaWatch = source.slice(source.indexOf('watch(\n  [\n    () => readFoliaTrackId'), source.indexOf('\nwatch(\n  () => auth.isAuthenticated.value'));

    expect(foliaWatch).toContain('player.tracks?.value');
    expect(foliaWatch).toContain('player.playlistProfile?.value');
    expect(foliaWatch).toContain('player.lyricTimeline?.value');
    expect(foliaWatch).toContain('player.currentLyricEntryIndex?.value');
    expect(foliaWatch).toContain('player.lyricRenderMode?.value');
  });

  it('reuses the mounted Folia tree across route changes and warms it during idle time', () => {
    expect(source).toContain("parking.id = 'folia-embed-parking'");
    expect(source).toContain('parking.appendChild(embedRoot)');
    expect(source).toContain('if (embedRoot.parentElement !== host) host.appendChild(embedRoot)');
    expect(source).toContain('window.requestIdleCallback(warmup, { timeout: 2500 })');
    expect(source).toContain('if (foliaMountPromise) return foliaMountPromise');
  });

  it('loads a fresh Folia index after a gateway deployment', () => {
    const preload = readFunction('preloadFoliaScripts');

    expect(preload).toContain('const indexUrl = `${FOLIA_EMBED_URL}?__shizuki_embed=${Date.now()}`');
    expect(preload).toContain("fetch(indexUrl, { cache: 'no-store' })");
  });
});
