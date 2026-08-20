import { watch } from 'vue';
import { ROUTE_DESTINATIONS } from '../../desktop/protocol.mjs';

function valueOf(source) {
  return source && typeof source === 'object' && 'value' in source ? source.value : source;
}

function normalizedTrack(track) {
  if (!track || typeof track !== 'object') return null;
  return {
    id: String(track.id || track.trackId || ''),
    title: String(track.title || ''),
    artist: String(track.artist || '')
  };
}

export function createDesktopRendererState({ router, player }) {
  const route = router?.currentRoute?.value || {};
  return {
    ready: true,
    route: {
      name: String(route.name || ''),
      path: String(route.path || ''),
      fullPath: String(route.fullPath || route.path || '')
    },
    player: {
      isPlaying: valueOf(player?.isPlaying) === true,
      currentTime: Number(valueOf(player?.currentTime)) || 0,
      duration: Number(valueOf(player?.duration)) || 0,
      currentTrack: normalizedTrack(valueOf(player?.currentTrack))
    }
  };
}

export function createDesktopCommandHandler({ router, player }) {
  return async function handleDesktopCommand(input) {
    const command = String(input?.command || '');
    if (command === 'app.navigate') {
      const destination = String(input?.payload?.destination || '');
      const target = ROUTE_DESTINATIONS[destination];
      if (!target) throw new Error(`Unsupported navigation destination: ${destination}`);
      await router.push(target);
    } else if (command === 'music.play') {
      if (valueOf(player.isPlaying) !== true) await player.togglePlay();
    } else if (command === 'music.pause') {
      if (valueOf(player.isPlaying) === true) await player.togglePlay();
    } else if (command === 'music.toggle') {
      await player.togglePlay();
    } else if (command === 'music.next') {
      await player.playNext();
    } else if (command === 'music.previous') {
      await player.playPrev();
    } else {
      throw new Error(`Unsupported renderer command: ${command}`);
    }
    return createDesktopRendererState({ router, player });
  };
}

export function installDesktopControlBridge({ router, player, desktopApi } = {}) {
  const api = desktopApi || (typeof window !== 'undefined' ? window.shizukiDesktop : null);
  if (!api?.isDesktop || typeof api.onCommand !== 'function') return () => {};

  const handleCommand = createDesktopCommandHandler({ router, player });
  const reportState = () => api.reportState(createDesktopRendererState({ router, player }));
  const unsubscribe = api.onCommand(async command => {
    try {
      const result = await handleCommand(command);
      api.respondToCommand({ id: command?.id, ok: true, result });
      reportState();
    } catch (error) {
      api.respondToCommand({
        id: command?.id,
        ok: false,
        error: {
          code: 'COMMAND_FAILED',
          message: String(error?.message || 'Renderer command failed.')
        }
      });
    }
  });
  const unsubscribeRoute = api.onRouteRequested?.(async request => {
    const route = String(request?.route || '');
    if (route.startsWith('/')) {
      await router.push(route);
      reportState();
    }
  }) || (() => {});

  const stopWatch = watch(
    [
      () => router.currentRoute.value.fullPath,
      () => valueOf(player.isPlaying),
      () => valueOf(player.currentTrack)?.id,
      () => valueOf(player.currentTime),
      () => valueOf(player.duration)
    ],
    reportState,
    { immediate: true }
  );

  return () => {
    stopWatch();
    unsubscribe?.();
    unsubscribeRoute();
    api.reportState({ ready: false });
  };
}
