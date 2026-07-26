const DEFAULT_MIN_FREQ = 35;
const DEFAULT_MAX_FREQ = 16000;

function clamp01(value) {
  if (!Number.isFinite(value)) return 0;
  if (value < 0) return 0;
  if (value > 1) return 1;
  return value;
}

function toPositiveInt(value, fallback) {
  const parsed = Math.floor(Number(value));
  return Number.isFinite(parsed) && parsed > 0 ? parsed : fallback;
}

/**
 * 构建对数分频映射:把 FFT 线性 bin 映射为听感均匀的对数频带。
 * 返回每个频带 { startBin, endBin(不含), centerFreq, position(0..1) }。
 * 保证:跳过直流 bin、频带单调、每带至少 1 个 bin、整体覆盖 [minFreq, maxFreq]。
 */
export function buildLogBandMap(options = {}) {
  const bandCount = toPositiveInt(options.bandCount, 56);
  const fftSize = toPositiveInt(options.fftSize, 2048);
  const sampleRate = Number.isFinite(Number(options.sampleRate)) && Number(options.sampleRate) > 0
    ? Number(options.sampleRate)
    : 48000;
  const binCount = Math.floor(fftSize / 2);
  const binWidth = sampleRate / fftSize;
  const nyquist = sampleRate / 2;

  const minFreq = Math.max(binWidth, Number(options.minFreq) > 0 ? Number(options.minFreq) : DEFAULT_MIN_FREQ);
  const maxFreq = Math.min(nyquist, Number(options.maxFreq) > minFreq ? Number(options.maxFreq) : DEFAULT_MAX_FREQ);

  const logMin = Math.log(minFreq);
  const logMax = Math.log(Math.max(maxFreq, minFreq * 2));
  const bands = [];
  let previousEnd = Math.max(1, Math.floor(minFreq / binWidth));

  for (let index = 0; index < bandCount; index += 1) {
    const t0 = index / bandCount;
    const t1 = (index + 1) / bandCount;
    const freqStart = Math.exp(logMin + (logMax - logMin) * t0);
    const freqEnd = Math.exp(logMin + (logMax - logMin) * t1);

    let startBin = Math.max(previousEnd, Math.floor(freqStart / binWidth));
    let endBin = Math.max(startBin + 1, Math.ceil(freqEnd / binWidth));

    startBin = Math.min(startBin, binCount - 1);
    endBin = Math.min(Math.max(endBin, startBin + 1), binCount);

    bands.push({
      startBin,
      endBin,
      centerFreq: Math.sqrt(freqStart * freqEnd),
      position: bandCount > 1 ? index / (bandCount - 1) : 0
    });
    previousEnd = endBin;
    if (previousEnd >= binCount) {
      // 剩余频带压在最后一个可用 bin 上,保持数组长度稳定。
      for (let rest = index + 1; rest < bandCount; rest += 1) {
        bands.push({
          startBin: binCount - 1,
          endBin: binCount,
          centerFreq: nyquist,
          position: bandCount > 1 ? rest / (bandCount - 1) : 0
        });
      }
      break;
    }
  }

  return bands;
}

/**
 * 频谱处理器:字节频谱 -> 可直接驱动动画的频带电平。
 * - 对数分频 + 高频倾斜补偿(音乐能量随频率衰减,不补偿则高频永远趴着)
 * - 噪声门 + gamma 曲线
 * - 帧率无关的快攻慢放平滑
 * - 峰值帽(保持后加速下落)
 * - bass/mid/treble/overall 能量 + 低音节拍检测
 * - 静音检测(跨域媒体被 CORS 污染时 analyser 全 0,交由调用方回退)
 */
export function createSpectrumProcessor(options = {}) {
  const bandCount = toPositiveInt(options.bandCount, 56);
  const fftSize = toPositiveInt(options.fftSize, 2048);
  const sampleRate = Number(options.sampleRate) > 0 ? Number(options.sampleRate) : 48000;
  const tiltStrength = Number.isFinite(Number(options.tiltStrength)) ? Number(options.tiltStrength) : 0.85;
  const noiseGate = Number.isFinite(Number(options.noiseGate)) ? clamp01(Number(options.noiseGate)) : 0.05;
  const gamma = Number(options.gamma) > 0 ? Number(options.gamma) : 1.18;
  const attackMs = Number(options.attackMs) > 0 ? Number(options.attackMs) : 50;
  const releaseMs = Number(options.releaseMs) > 0 ? Number(options.releaseMs) : 300;
  const peakHoldMs = Number(options.peakHoldMs) > 0 ? Number(options.peakHoldMs) : 420;
  const peakGravity = Number(options.peakGravity) > 0 ? Number(options.peakGravity) : 3.2;

  const bands = buildLogBandMap({
    bandCount,
    fftSize,
    sampleRate,
    minFreq: options.minFreq,
    maxFreq: options.maxFreq
  });

  const levels = new Float32Array(bandCount);
  const peaks = new Float32Array(bandCount);
  const peakVelocity = new Float32Array(bandCount);
  const peakHoldLeft = new Float32Array(bandCount);
  const raw = new Float32Array(bandCount);

  const bassEnd = bands.findIndex((band) => band.centerFreq > 170);
  const midEnd = bands.findIndex((band) => band.centerFreq > 2100);
  const bassRange = [0, bassEnd > 0 ? bassEnd : Math.max(1, Math.floor(bandCount * 0.16))];
  const midRange = [bassRange[1], midEnd > bassRange[1] ? midEnd : Math.max(bassRange[1] + 1, Math.floor(bandCount * 0.62))];

  let beatAverage = 0;
  let beatCooldownLeft = 0;
  let silentMs = 0;

  const frame = {
    levels,
    peaks,
    bandCount,
    energy: { bass: 0, mid: 0, treble: 0, overall: 0 },
    beat: { hit: false, strength: 0 },
    silent: true,
    silentMs: 0
  };

  function update(freqBytes, dtMs) {
    const elapsed = Number.isFinite(dtMs) && dtMs > 0 ? Math.min(dtMs, 2000) : 16.7;
    const dt = Math.min(elapsed, 200);
    const dtSec = dt / 1000;
    const attackK = 1 - Math.exp(-dt / attackMs);
    const releaseK = 1 - Math.exp(-dt / releaseMs);

    let rawMax = 0;
    const data = freqBytes || [];

    for (let index = 0; index < bandCount; index += 1) {
      const band = bands[index];
      let sum = 0;
      let count = 0;
      for (let bin = band.startBin; bin < band.endBin; bin += 1) {
        const byte = data[bin] || 0;
        sum += byte;
        count += 1;
        if (byte > rawMax) rawMax = byte;
      }
      let value = count > 0 ? sum / (count * 255) : 0;

      // 倾斜补偿:随频带位置抬升响应,让中高频获得可见的动态。
      value *= 1 + tiltStrength * Math.pow(band.position, 0.75);
      // 噪声门 + gamma。
      value = value <= noiseGate ? 0 : (value - noiseGate) / (1 - noiseGate);
      value = Math.pow(clamp01(value), gamma);
      raw[index] = value;

      const previous = levels[index];
      const k = value > previous ? attackK : releaseK;
      levels[index] = previous + (value - previous) * k;

      // 峰值帽。
      if (levels[index] >= peaks[index]) {
        peaks[index] = levels[index];
        peakVelocity[index] = 0;
        peakHoldLeft[index] = peakHoldMs;
      } else if (peakHoldLeft[index] > 0) {
        peakHoldLeft[index] -= dt;
      } else {
        peakVelocity[index] += peakGravity * dtSec;
        peaks[index] = Math.max(levels[index], peaks[index] - peakVelocity[index] * dtSec);
      }
    }

    let bass = 0;
    for (let index = bassRange[0]; index < bassRange[1]; index += 1) bass += levels[index];
    bass /= Math.max(1, bassRange[1] - bassRange[0]);

    let mid = 0;
    for (let index = midRange[0]; index < midRange[1]; index += 1) mid += levels[index];
    mid /= Math.max(1, midRange[1] - midRange[0]);

    let treble = 0;
    for (let index = midRange[1]; index < bandCount; index += 1) treble += levels[index];
    treble /= Math.max(1, bandCount - midRange[1]);

    frame.energy.bass = clamp01(bass);
    frame.energy.mid = clamp01(mid);
    frame.energy.treble = clamp01(treble);
    frame.energy.overall = clamp01(bass * 0.5 + mid * 0.35 + treble * 0.15);

    // 低音节拍:瞬时低音明显高于滑动均值时判定为一次节拍。
    beatCooldownLeft = Math.max(0, beatCooldownLeft - dt);
    const beatK = 1 - Math.exp(-dt / 900);
    frame.beat.hit = false;
    frame.beat.strength = 0;
    if (bass > beatAverage * 1.32 + 0.02 && bass > 0.16 && beatCooldownLeft <= 0) {
      frame.beat.hit = true;
      frame.beat.strength = clamp01((bass - beatAverage) * 2.2);
      beatCooldownLeft = 190;
    }
    beatAverage += (bass - beatAverage) * beatK;

    // 静音检测(累计真实经过的时间,而非平滑用的截断值)。
    if (rawMax < 4) {
      silentMs += elapsed;
    } else {
      silentMs = 0;
    }
    frame.silent = silentMs > 0;
    frame.silentMs = silentMs;

    return frame;
  }

  function reset() {
    levels.fill(0);
    peaks.fill(0);
    peakVelocity.fill(0);
    peakHoldLeft.fill(0);
    beatAverage = 0;
    beatCooldownLeft = 0;
    silentMs = 0;
    frame.silent = true;
    frame.silentMs = 0;
    frame.beat.hit = false;
    frame.beat.strength = 0;
    frame.energy.bass = 0;
    frame.energy.mid = 0;
    frame.energy.treble = 0;
    frame.energy.overall = 0;
  }

  /** 衰减一帧(无输入数据时让画面自然落下),返回是否仍有可见电平。 */
  function decay(dtMs) {
    const dt = Number.isFinite(dtMs) && dtMs > 0 ? Math.min(dtMs, 200) : 16.7;
    const releaseK = 1 - Math.exp(-dt / (releaseMs * 0.72));
    let visible = false;
    for (let index = 0; index < bandCount; index += 1) {
      levels[index] += (0 - levels[index]) * releaseK;
      peaks[index] = Math.max(levels[index], peaks[index] - (peakGravity * 0.8 * dt) / 1000);
      if (levels[index] > 0.004 || peaks[index] > 0.004) visible = true;
      if (!visible && levels[index] < 0.004) levels[index] = 0;
    }
    frame.energy.bass *= 0.92;
    frame.energy.mid *= 0.92;
    frame.energy.treble *= 0.92;
    frame.energy.overall *= 0.92;
    frame.beat.hit = false;
    return visible;
  }

  return { update, decay, reset, frame, bands, bandCount };
}

/**
 * 待机脉冲:播放中却拿不到频谱(如跨域音频被 CORS 污染)时,
 * 用缓慢游走的合成波驱动画面,避免"看起来坏了"。
 */
export function createIdlePulse(bandCount, options = {}) {
  const count = toPositiveInt(bandCount, 56);
  const amplitude = clamp01(Number(options.amplitude) > 0 ? Number(options.amplitude) : 0.22);
  const speed = Number(options.speed) > 0 ? Number(options.speed) : 1;

  function sample(target, timeMs) {
    const t = (Number(timeMs) || 0) / 1000;
    for (let index = 0; index < count; index += 1) {
      const phase = index / count;
      const travelling = Math.sin(phase * Math.PI * 3 - t * 1.6 * speed);
      const shimmer = Math.sin(phase * Math.PI * 9 + t * 2.3 * speed) * 0.35;
      const envelope = 0.55 + 0.45 * Math.sin(t * 0.8 * speed + phase * Math.PI);
      const value = (0.5 + 0.5 * (travelling + shimmer) / 1.35) * envelope * amplitude;
      target[index] = clamp01(value);
    }
    return target;
  }

  return { sample };
}

/**
 * 把时域字节波形下采样为 [-1, 1] 的折线点,供波形环使用。
 */
export function downsampleWaveform(timeBytes, pointCount, target) {
  const points = toPositiveInt(pointCount, 160);
  const output = target && target.length === points ? target : new Float32Array(points);
  const length = timeBytes ? timeBytes.length : 0;
  if (!length) {
    output.fill(0);
    return output;
  }
  const step = length / points;
  for (let index = 0; index < points; index += 1) {
    const start = Math.floor(index * step);
    const end = Math.min(length, Math.max(start + 1, Math.floor((index + 1) * step)));
    let sum = 0;
    for (let cursor = start; cursor < end; cursor += 1) {
      sum += (timeBytes[cursor] - 128) / 128;
    }
    output[index] = sum / (end - start);
  }
  return output;
}
