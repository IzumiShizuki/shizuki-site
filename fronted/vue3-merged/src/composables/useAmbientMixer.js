import { computed, ref } from 'vue';

function clampUnit(value, fallback = 0) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric)) return fallback;
  return Math.max(0, Math.min(1, numeric));
}

function safeDisconnect(node) {
  if (!node || typeof node.disconnect !== 'function') return;
  try {
    node.disconnect();
  } catch {
    // ignore disconnect edge cases
  }
}

function createDefaultAudioContext() {
  if (typeof window === 'undefined') {
    throw new Error('Ambient mixer requires browser window');
  }
  const Ctx = window.AudioContext || window.webkitAudioContext;
  if (!Ctx) {
    throw new Error('Web Audio API unavailable');
  }
  return new Ctx();
}

function createDefaultAudioElement() {
  if (typeof Audio === 'undefined') {
    throw new Error('HTMLAudioElement unavailable');
  }
  const audio = new Audio();
  audio.loop = true;
  audio.preload = 'auto';
  audio.crossOrigin = 'anonymous';
  return audio;
}

function buildNoiseBuffer(audioContext, noiseType) {
  const sampleRate = Number(audioContext.sampleRate || 44100);
  const frameCount = Math.max(sampleRate * 3, 4096);
  const buffer = audioContext.createBuffer(2, frameCount, sampleRate);

  for (let channel = 0; channel < 2; channel += 1) {
    const channelData = buffer.getChannelData(channel);
    let brown = 0;
    let b0 = 0;
    let b1 = 0;
    let b2 = 0;
    let b3 = 0;
    let b4 = 0;
    let b5 = 0;
    let b6 = 0;

    for (let index = 0; index < frameCount; index += 1) {
      const white = Math.random() * 2 - 1;
      if (noiseType === 'pink') {
        b0 = 0.99886 * b0 + white * 0.0555179;
        b1 = 0.99332 * b1 + white * 0.0750759;
        b2 = 0.969 * b2 + white * 0.153852;
        b3 = 0.8665 * b3 + white * 0.3104856;
        b4 = 0.55 * b4 + white * 0.5329522;
        b5 = -0.7616 * b5 - white * 0.016898;
        const sample = (b0 + b1 + b2 + b3 + b4 + b5 + b6 + white * 0.5362) * 0.11;
        b6 = white * 0.115926;
        channelData[index] = sample;
        continue;
      }
      if (noiseType === 'brown') {
        brown = (brown + 0.02 * white) / 1.02;
        channelData[index] = brown * 3.5;
        continue;
      }
      channelData[index] = white * 0.55;
    }
  }
  return buffer;
}

function rampGain(audioContext, gainNode, value, immediate = false) {
  if (!gainNode?.gain) return;
  const target = clampUnit(value, 0);
  if (!audioContext || immediate || typeof gainNode.gain.linearRampToValueAtTime !== 'function') {
    gainNode.gain.value = target;
    return;
  }
  const now = Number(audioContext.currentTime || 0);
  try {
    gainNode.gain.cancelScheduledValues(now);
    gainNode.gain.setValueAtTime(gainNode.gain.value, now);
    gainNode.gain.linearRampToValueAtTime(target, now + 0.18);
  } catch {
    gainNode.gain.value = target;
  }
}

function pauseMediaElement(audio) {
  if (!audio || typeof audio.pause !== 'function') return;
  try {
    audio.pause();
  } catch {
    // ignore pause failure
  }
}

function stopGeneratedSource(source) {
  if (!source || typeof source.stop !== 'function') return;
  try {
    source.stop();
  } catch {
    // ignore stopped source
  }
}

export function createAmbientMixerEngine(options = {}) {
  const createAudioContext = options.createAudioContext || createDefaultAudioContext;
  const createAudioElement = options.createAudioElement || createDefaultAudioElement;
  const createNoiseBuffer = options.createNoiseBuffer || buildNoiseBuffer;

  const ready = ref(false);
  const suspended = ref(false);
  const needsUserGesture = ref(false);
  const lastError = ref('');
  const masterVolume = ref(0.65);
  const activeTrackIds = ref([]);

  let audioContext = null;
  let masterGainNode = null;
  const runtimes = new Map();

  function refreshActiveTrackIds() {
    activeTrackIds.value = Array.from(runtimes.keys());
  }

  function ensureContext() {
    if (audioContext && masterGainNode) return audioContext;
    audioContext = createAudioContext();
    masterGainNode = audioContext.createGain();
    masterGainNode.connect(audioContext.destination);
    rampGain(audioContext, masterGainNode, masterVolume.value, true);
    ready.value = true;
    suspended.value = audioContext.state === 'suspended';
    return audioContext;
  }

  async function playMediaRuntime(runtime) {
    if (!runtime?.audio || typeof runtime.audio.play !== 'function') return;
    try {
      await runtime.audio.play();
      needsUserGesture.value = false;
    } catch {
      needsUserGesture.value = true;
    }
  }

  async function createRuntime(track) {
    const context = ensureContext();
    const gainNode = context.createGain();
    gainNode.connect(masterGainNode);

    if (track.kind === 'noise') {
      const source = context.createBufferSource();
      source.loop = true;
      source.buffer = createNoiseBuffer(context, track.noiseType || 'white');
      source.connect(gainNode);
      source.start(0);
      const runtime = {
        kind: 'noise',
        trackId: track.trackId,
        gainNode,
        source
      };
      rampGain(context, gainNode, track.volume, true);
      return runtime;
    }

    const audio = createAudioElement();
    audio.src = String(track.audioUrl || '').trim();
    audio.loop = true;
    audio.preload = 'auto';
    const mediaSourceNode = context.createMediaElementSource(audio);
    mediaSourceNode.connect(gainNode);
    const runtime = {
      kind: 'media',
      trackId: track.trackId,
      gainNode,
      audio,
      mediaSourceNode,
      audioUrl: audio.src
    };
    rampGain(context, gainNode, track.volume, true);
    await playMediaRuntime(runtime);
    return runtime;
  }

  async function updateRuntime(runtime, track) {
    if (!runtime) return;
    const context = ensureContext();
    rampGain(context, runtime.gainNode, track.volume);

    if (runtime.kind !== 'media') return;
    const nextUrl = String(track.audioUrl || '').trim();
    if (!nextUrl) {
      pauseMediaElement(runtime.audio);
      runtime.audio.src = '';
      runtime.audioUrl = '';
      return;
    }
    if (runtime.audioUrl !== nextUrl) {
      runtime.audioUrl = nextUrl;
      runtime.audio.src = nextUrl;
      if (typeof runtime.audio.load === 'function') {
        runtime.audio.load();
      }
    }
    await playMediaRuntime(runtime);
  }

  function destroyRuntime(runtime) {
    if (!runtime) return;
    rampGain(audioContext, runtime.gainNode, 0, true);
    if (runtime.kind === 'media') {
      pauseMediaElement(runtime.audio);
      safeDisconnect(runtime.mediaSourceNode);
      safeDisconnect(runtime.gainNode);
      return;
    }
    stopGeneratedSource(runtime.source);
    safeDisconnect(runtime.source);
    safeDisconnect(runtime.gainNode);
  }

  async function setTracks(nextTracks) {
    const trackList = Array.isArray(nextTracks) ? nextTracks : [];
    const normalized = Array.from(
      new Map(
        trackList
          .filter((item) => item && String(item.trackId || '').trim())
          .map((item) => [
            String(item.trackId || '').trim(),
            {
              trackId: String(item.trackId || '').trim(),
              kind: item.kind === 'noise' ? 'noise' : 'media',
              noiseType: String(item.noiseType || '').trim().toLowerCase() || 'white',
              audioUrl: String(item.audioUrl || '').trim(),
              volume: clampUnit(item.volume, 0.72)
            }
          ])
      ).values()
    );

    const nextIds = new Set(normalized.map((item) => item.trackId));
    Array.from(runtimes.entries()).forEach(([trackId, runtime]) => {
      if (nextIds.has(trackId)) return;
      destroyRuntime(runtime);
      runtimes.delete(trackId);
    });

    for (const track of normalized) {
      if (track.kind === 'media' && !track.audioUrl) continue;
      if (!runtimes.has(track.trackId)) {
        try {
          const runtime = await createRuntime(track);
          runtimes.set(track.trackId, runtime);
        } catch (error) {
          lastError.value = error?.message || 'Failed to create ambient runtime';
        }
        continue;
      }
      await updateRuntime(runtimes.get(track.trackId), track);
    }

    refreshActiveTrackIds();
  }

  function setMasterVolume(value) {
    masterVolume.value = clampUnit(value, masterVolume.value);
    if (masterGainNode) {
      rampGain(audioContext, masterGainNode, masterVolume.value);
    }
  }

  async function resumeFromGesture() {
    if (!audioContext) return;
    if (typeof audioContext.resume === 'function') {
      await audioContext.resume();
    }
    suspended.value = audioContext.state === 'suspended';
    for (const runtime of runtimes.values()) {
      if (runtime.kind !== 'media') continue;
      await playMediaRuntime(runtime);
    }
  }

  async function suspendMixer() {
    if (!audioContext || typeof audioContext.suspend !== 'function') return;
    await audioContext.suspend();
    suspended.value = true;
  }

  async function destroy() {
    Array.from(runtimes.values()).forEach((runtime) => destroyRuntime(runtime));
    runtimes.clear();
    refreshActiveTrackIds();
    if (audioContext && typeof audioContext.close === 'function') {
      await audioContext.close();
    }
    audioContext = null;
    masterGainNode = null;
    ready.value = false;
    suspended.value = false;
    needsUserGesture.value = false;
    lastError.value = '';
  }

  return {
    ready,
    suspended,
    needsUserGesture,
    lastError,
    masterVolume,
    activeTrackIds: computed(() => activeTrackIds.value.slice()),
    setTracks,
    setMasterVolume,
    resumeFromGesture,
    suspend: suspendMixer,
    destroy
  };
}

let sharedMixer = null;

export function useAmbientMixer(options = {}) {
  if (!sharedMixer) {
    sharedMixer = createAmbientMixerEngine(options);
  }
  return sharedMixer;
}

export async function __resetAmbientMixerForTest() {
  if (sharedMixer) {
    await sharedMixer.destroy();
  }
  sharedMixer = null;
}
