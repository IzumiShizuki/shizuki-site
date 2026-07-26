/**
 * 音乐可视化 Canvas 画笔集合。
 * 每种风格导出统一接口:createVisualizerPainter(styleKey) -> { paint(ctx, frame, env), reset() }。
 *
 * frame: createSpectrumProcessor 输出(levels/peaks/energy/beat)。
 * env: {
 *   width, height   — CSS 像素(ctx 已按 dpr 缩放)
 *   timeMs, dtMs    — 动画时钟
 *   colors          — { accent, accentSoft, accentStrong } 均为 [r, g, b]
 *   wave            — Float32Array 时域波形(-1..1),可为 null
 *   reducedMotion   — 是否偏好减少动态
 *   quiet           — 当前处于静音回退动画
 *   innerRatio      — vinyl 变体:内圈(唱片)半径 / 画布短边半径
 * }
 */

const TAU = Math.PI * 2;

function rgba(color, alpha) {
  const [r, g, b] = color || [255, 255, 255];
  return `rgba(${r}, ${g}, ${b}, ${alpha})`;
}

function mixColor(a, b, t) {
  return [
    Math.round(a[0] + (b[0] - a[0]) * t),
    Math.round(a[1] + (b[1] - a[1]) * t),
    Math.round(a[2] + (b[2] - a[2]) * t)
  ];
}

function colorHue(color) {
  const [r, g, b] = color.map((v) => v / 255);
  const max = Math.max(r, g, b);
  const min = Math.min(r, g, b);
  if (max === min) return 220;
  const d = max - min;
  let h;
  if (max === r) h = ((g - b) / d + (g < b ? 6 : 0)) * 60;
  else if (max === g) h = ((b - r) / d + 2) * 60;
  else h = ((r - g) / d + 4) * 60;
  return h;
}

/** 把频带电平重采样为 outCount 段;mirror=true 时左右对称(经典对称频谱观感)。 */
export function resampleLevels(levels, outCount, mirror = false, target = null) {
  const output = target && target.length === outCount ? target : new Float32Array(outCount);
  const sourceCount = levels.length;
  if (!sourceCount) {
    output.fill(0);
    return output;
  }
  const effective = mirror ? Math.ceil(outCount / 2) : outCount;
  for (let index = 0; index < effective; index += 1) {
    const pos = (index / Math.max(1, effective - 1)) * (sourceCount - 1);
    const low = Math.floor(pos);
    const high = Math.min(sourceCount - 1, low + 1);
    const t = pos - low;
    const value = levels[low] * (1 - t) + levels[high] * t;
    output[index] = value;
    if (mirror) output[outCount - 1 - index] = value;
  }
  return output;
}

function traceBarsPath(path, levelsArr, layout, heightScale, minHeight) {
  const { slot, barWidth, baseline, left, radius } = layout;
  for (let index = 0; index < levelsArr.length; index += 1) {
    const level = levelsArr[index];
    const barHeight = Math.max(minHeight, level * heightScale);
    const x = left + index * slot;
    const y = baseline - barHeight;
    const r = Math.min(radius, barWidth / 2, barHeight / 2);
    path.moveTo(x, baseline);
    path.lineTo(x, y + r);
    path.arcTo(x, y, x + r, y, r);
    path.lineTo(x + barWidth - r, y);
    path.arcTo(x + barWidth, y, x + barWidth, y + r, r);
    path.lineTo(x + barWidth, baseline);
    path.closePath();
  }
}

function computeBarsLayout(width, height, count, gapRatio = 0.36) {
  const sidePad = Math.max(10, width * 0.015);
  const usable = width - sidePad * 2;
  const slot = usable / count;
  const barWidth = Math.max(2, slot * (1 - gapRatio));
  return {
    slot,
    barWidth,
    left: sidePad + (slot - barWidth) / 2,
    baseline: height * 0.8,
    topPad: height * 0.04,
    radius: Math.min(4, barWidth / 2)
  };
}

function paintBassUnderGlow(ctx, env, baseline, intensity, color) {
  if (intensity <= 0.02) return;
  const cx = env.width / 2;
  const radiusX = env.width * (0.28 + intensity * 0.3);
  const radiusY = Math.max(14, env.height * 0.22 * (0.6 + intensity));
  const gradient = ctx.createRadialGradient(cx, baseline, 0, cx, baseline, radiusX);
  gradient.addColorStop(0, rgba(color, 0.16 + intensity * 0.2));
  gradient.addColorStop(1, rgba(color, 0));
  ctx.save();
  ctx.translate(cx, baseline);
  ctx.scale(1, radiusY / radiusX);
  ctx.translate(-cx, -baseline);
  ctx.fillStyle = gradient;
  ctx.fillRect(cx - radiusX, baseline - radiusX, radiusX * 2, radiusX * 2);
  ctx.restore();
}

/* ------------------------------------------------------------------ */
/* bars-neon 霓虹脉冲:主体渐变条 + 辉光 + 镜面反射 + 白色峰值帽          */
/* ------------------------------------------------------------------ */
function createBarsNeonPainter() {
  let display = null;
  let peakDisplay = null;

  return {
    paint(ctx, frame, env) {
      const count = 56;
      display = resampleLevels(frame.levels, count, false, display);
      peakDisplay = resampleLevels(frame.peaks, count, false, peakDisplay);
      const layout = computeBarsLayout(env.width, env.height, count);
      const heightScale = layout.baseline - layout.topPad;
      const { accent, accentSoft, accentStrong } = env.colors;

      paintBassUnderGlow(ctx, env, layout.baseline + 2, frame.energy.bass, accent);

      const bodyPath = new Path2D();
      traceBarsPath(bodyPath, display, layout, heightScale, 2.5);

      const gradient = ctx.createLinearGradient(0, layout.topPad, 0, layout.baseline);
      gradient.addColorStop(0, rgba(mixColor(accentSoft, [255, 255, 255], 0.35), 0.98));
      gradient.addColorStop(0.45, rgba(accentSoft, 0.95));
      gradient.addColorStop(1, rgba(accentStrong, 0.88));

      // 辉光层(单次 shadow 应用整条路径,开销可控)。
      ctx.save();
      ctx.shadowColor = rgba(accent, 0.72);
      ctx.shadowBlur = 22;
      ctx.fillStyle = gradient;
      ctx.fill(bodyPath);
      ctx.restore();

      // 高光描边让条形边缘更清晰。
      ctx.strokeStyle = rgba(mixColor(accentSoft, [255, 255, 255], 0.5), 0.28);
      ctx.lineWidth = 1;
      ctx.stroke(bodyPath);

      // 峰值帽。
      ctx.fillStyle = 'rgba(255, 255, 255, 0.95)';
      for (let index = 0; index < count; index += 1) {
        const peak = peakDisplay[index];
        const capY = layout.baseline - Math.max(3, peak * heightScale) - 5;
        if (capY < layout.baseline - 6) {
          ctx.fillRect(layout.left + index * layout.slot, capY, layout.barWidth, 3);
        }
      }

      // 镜面反射。
      ctx.save();
      ctx.translate(0, layout.baseline * 2);
      ctx.scale(1, -1);
      const reflectPath = new Path2D();
      traceBarsPath(reflectPath, display, layout, heightScale * 0.34, 1.5);
      const reflectGradient = ctx.createLinearGradient(0, layout.baseline, 0, layout.baseline - heightScale * 0.34);
      reflectGradient.addColorStop(0, rgba(accent, 0.30));
      reflectGradient.addColorStop(1, rgba(accent, 0));
      ctx.fillStyle = reflectGradient;
      ctx.fill(reflectPath);
      ctx.restore();

      // 基线光带。
      const lineGradient = ctx.createLinearGradient(0, 0, env.width, 0);
      lineGradient.addColorStop(0, rgba(accent, 0));
      lineGradient.addColorStop(0.5, rgba(accentSoft, 0.62 + frame.energy.overall * 0.34));
      lineGradient.addColorStop(1, rgba(accent, 0));
      ctx.fillStyle = lineGradient;
      ctx.fillRect(layout.left, layout.baseline, env.width - layout.left * 2, 2);
    },
    reset() {
      display = null;
      peakDisplay = null;
    }
  };
}

/* ------------------------------------------------------------------ */
/* bars-crystal 晶体频谱:细晶柱 + 宽晕 + 冰白渐变 + 星芒闪烁            */
/* ------------------------------------------------------------------ */
function createBarsCrystalPainter() {
  let display = null;
  let peakDisplay = null;

  function drawSparkle(ctx, x, y, size, alpha) {
    ctx.save();
    ctx.translate(x, y);
    ctx.strokeStyle = `rgba(255, 255, 255, ${alpha})`;
    ctx.lineWidth = 1.1;
    ctx.beginPath();
    ctx.moveTo(-size, 0);
    ctx.lineTo(size, 0);
    ctx.moveTo(0, -size);
    ctx.lineTo(0, size);
    ctx.stroke();
    ctx.restore();
  }

  return {
    paint(ctx, frame, env) {
      const count = 64;
      display = resampleLevels(frame.levels, count, false, display);
      peakDisplay = resampleLevels(frame.peaks, count, false, peakDisplay);
      const layout = computeBarsLayout(env.width, env.height, count, 0.5);
      const heightScale = layout.baseline - layout.topPad;
      const { accent, accentSoft } = env.colors;
      const ice = mixColor(accentSoft, [255, 255, 255], 0.6);

      paintBassUnderGlow(ctx, env, layout.baseline + 2, frame.energy.bass * 0.7, accentSoft);

      // 宽晕层:更宽、半透明的柱体垫底。
      const haloLayout = { ...layout, barWidth: Math.min(layout.slot * 0.92, layout.barWidth * 2.4), radius: 3 };
      haloLayout.left = layout.left - (haloLayout.barWidth - layout.barWidth) / 2;
      const haloPath = new Path2D();
      traceBarsPath(haloPath, display, haloLayout, heightScale, 2);
      ctx.fillStyle = rgba(accentSoft, 0.16);
      ctx.fill(haloPath);

      // 晶体核心。
      const corePath = new Path2D();
      traceBarsPath(corePath, display, layout, heightScale, 2.5);
      const gradient = ctx.createLinearGradient(0, layout.topPad, 0, layout.baseline);
      gradient.addColorStop(0, 'rgba(255, 255, 255, 0.99)');
      gradient.addColorStop(0.35, rgba(ice, 0.95));
      gradient.addColorStop(1, rgba(accentSoft, 0.8));
      ctx.save();
      ctx.shadowColor = rgba(ice, 0.5);
      ctx.shadowBlur = 10;
      ctx.fillStyle = gradient;
      ctx.fill(corePath);
      ctx.restore();

      // 白色峰值细线。
      ctx.fillStyle = 'rgba(255, 255, 255, 0.95)';
      for (let index = 0; index < count; index += 1) {
        const peak = peakDisplay[index];
        const capY = layout.baseline - Math.max(3, peak * heightScale) - 4;
        if (capY < layout.baseline - 5) {
          ctx.fillRect(layout.left + index * layout.slot - 0.5, capY, layout.barWidth + 1, 1.6);
        }
      }

      // 高电平频带顶端的星芒。
      if (!env.reducedMotion) {
        for (let index = 0; index < count; index += 2) {
          const level = display[index];
          if (level > 0.68) {
            const twinkle = 0.5 + 0.5 * Math.sin(env.timeMs / 130 + index * 1.7);
            const x = layout.left + index * layout.slot + layout.barWidth / 2;
            const y = layout.baseline - level * heightScale - 6;
            drawSparkle(ctx, x, y, 2.5 + level * 3 * twinkle, 0.3 + 0.55 * twinkle);
          }
        }
      }

      // 基线。
      ctx.fillStyle = rgba(ice, 0.4);
      ctx.fillRect(layout.left, layout.baseline, env.width - layout.left * 2, 1);
    },
    reset() {
      display = null;
      peakDisplay = null;
    }
  };
}

/* ------------------------------------------------------------------ */
/* bars-firefly 萤火流光:圆头光柱 + 色相流动 + 上升萤火粒子             */
/* ------------------------------------------------------------------ */
function createBarsFireflyPainter() {
  let display = null;
  let particles = [];
  let spawnAccumulator = 0;

  return {
    paint(ctx, frame, env) {
      const count = 48;
      display = resampleLevels(frame.levels, count, false, display);
      const layout = computeBarsLayout(env.width, env.height, count, 0.42);
      const heightScale = layout.baseline - layout.topPad;
      const baseHue = colorHue(env.colors.accent);
      const dtSec = Math.min(env.dtMs, 100) / 1000;

      paintBassUnderGlow(ctx, env, layout.baseline + 2, frame.energy.bass * 0.8, env.colors.accent);

      // 圆头光柱。色相锚定站点主题色,只在附近流动,避免脱离整体配色。
      const hueDrift = Math.sin(env.timeMs / 1500) * 16;
      ctx.lineCap = 'round';
      ctx.lineWidth = layout.barWidth;
      for (let index = 0; index < count; index += 1) {
        const level = display[index];
        const hue = (baseHue + 360 - 26 + (index / count) * 52 + hueDrift + Math.sin(env.timeMs / 700 + index * 0.4) * 6) % 360;
        const x = layout.left + index * layout.slot + layout.barWidth / 2;
        const topY = layout.baseline - Math.max(3, level * heightScale);
        const gradient = ctx.createLinearGradient(0, topY, 0, layout.baseline);
        gradient.addColorStop(0, `hsla(${hue}, 95%, 78%, 0.95)`);
        gradient.addColorStop(1, `hsla(${hue}, 88%, 58%, 0.55)`);
        ctx.strokeStyle = gradient;
        ctx.beginPath();
        ctx.moveTo(x, layout.baseline);
        ctx.lineTo(x, topY);
        ctx.stroke();

        // 顶端光点。
        if (level > 0.08) {
          ctx.fillStyle = `hsla(${hue}, 100%, 88%, ${0.35 + level * 0.6})`;
          ctx.beginPath();
          ctx.arc(x, topY, layout.barWidth * 0.42, 0, TAU);
          ctx.fill();
        }
      }

      // 萤火粒子。
      if (!env.reducedMotion) {
        spawnAccumulator += dtSec * (6 + frame.energy.overall * 46);
        while (spawnAccumulator >= 1 && particles.length < 90) {
          spawnAccumulator -= 1;
          let strongest = 0;
          let strongestLevel = 0;
          for (let probe = 0; probe < 5; probe += 1) {
            const candidate = Math.floor(Math.random() * count);
            if (display[candidate] > strongestLevel) {
              strongestLevel = display[candidate];
              strongest = candidate;
            }
          }
          if (strongestLevel < 0.3) continue;
          particles.push({
            x: layout.left + strongest * layout.slot + layout.barWidth / 2,
            y: layout.baseline - strongestLevel * heightScale,
            vx: (Math.random() - 0.5) * 14,
            vy: -26 - Math.random() * 34 - strongestLevel * 30,
            life: 0,
            maxLife: 1.4 + Math.random() * 1.3,
            hue: (baseHue + 360 - 26 + (strongest / count) * 52 + hueDrift) % 360,
            size: 1.2 + Math.random() * 2.1
          });
        }

        particles = particles.filter((particle) => {
          particle.life += dtSec;
          if (particle.life >= particle.maxLife) return false;
          particle.x += (particle.vx + Math.sin(particle.life * 5 + particle.y * 0.02) * 10) * dtSec;
          particle.y += particle.vy * dtSec;
          particle.vy *= 1 - 0.4 * dtSec;
          const fade = 1 - particle.life / particle.maxLife;
          const flicker = 0.7 + 0.3 * Math.sin(particle.life * 11);
          ctx.fillStyle = `hsla(${particle.hue}, 96%, 80%, ${0.75 * fade * flicker})`;
          ctx.beginPath();
          ctx.arc(particle.x, particle.y, particle.size * (0.6 + fade * 0.6), 0, TAU);
          ctx.fill();
          return particle.y > -20;
        });
      }
    },
    reset() {
      display = null;
      particles = [];
      spawnAccumulator = 0;
    }
  };
}

/* ------------------------------------------------------------------ */
/* ring 公共工具                                                        */
/* ------------------------------------------------------------------ */
function drawWaveRing(ctx, env, cx, cy, radius, amplitude, alpha) {
  const wave = env.wave;
  if (!wave || !wave.length) return;
  ctx.beginPath();
  for (let index = 0; index <= wave.length; index += 1) {
    const wrapped = index % wave.length;
    const angle = (index / wave.length) * TAU - Math.PI / 2;
    const r = radius + wave[wrapped] * amplitude;
    const x = cx + Math.cos(angle) * r;
    const y = cy + Math.sin(angle) * r;
    if (index === 0) ctx.moveTo(x, y);
    else ctx.lineTo(x, y);
  }
  ctx.closePath();
  ctx.strokeStyle = `rgba(255, 255, 255, ${alpha})`;
  ctx.lineWidth = 1.4;
  ctx.stroke();
}

function drawBassCore(ctx, cx, cy, radius, bass, color, colorSoft) {
  const coreRadius = radius * (0.86 + bass * 0.2);
  const gradient = ctx.createRadialGradient(cx, cy, 0, cx, cy, coreRadius);
  gradient.addColorStop(0, rgba(colorSoft, 0.10 + bass * 0.22));
  gradient.addColorStop(0.72, rgba(color, 0.05 + bass * 0.12));
  gradient.addColorStop(1, rgba(color, 0));
  ctx.fillStyle = gradient;
  ctx.beginPath();
  ctx.arc(cx, cy, coreRadius, 0, TAU);
  ctx.fill();
}

/* ------------------------------------------------------------------ */
/* ring-halo 光环矩阵:对称径向频谱 + 内圈波形 + 低音光核                */
/* ------------------------------------------------------------------ */
function createRingHaloPainter() {
  let display = null;
  let rotation = 0;

  return {
    paint(ctx, frame, env) {
      const segments = 96;
      display = resampleLevels(frame.levels, segments, true, display);
      const cx = env.width / 2;
      const cy = env.height / 2;
      const R = Math.min(env.width, env.height) * 0.27;
      const { accent, accentSoft, accentStrong } = env.colors;

      rotation += (env.reducedMotion ? 0.02 : 0.05 + frame.energy.overall * 0.22) * (Math.min(env.dtMs, 100) / 1000);

      drawBassCore(ctx, cx, cy, R, frame.energy.bass, accent, accentSoft);
      drawWaveRing(ctx, env, cx, cy, R * 0.8, R * 0.12, 0.34 + frame.energy.mid * 0.3);

      // 内圈基准环。
      ctx.beginPath();
      ctx.arc(cx, cy, R, 0, TAU);
      ctx.strokeStyle = rgba(accentSoft, 0.3);
      ctx.lineWidth = 1.2;
      ctx.stroke();

      ctx.save();
      ctx.translate(cx, cy);
      ctx.rotate(rotation);
      ctx.lineCap = 'round';

      // 外放射频谱(双向:外长内短),高电平段加辉光垫底。
      for (let index = 0; index < segments; index += 1) {
        const level = display[index];
        const angle = (index / segments) * TAU - Math.PI / 2;
        const cos = Math.cos(angle);
        const sin = Math.sin(angle);
        const outerLen = 3.5 + level * R * 0.62;
        const innerLen = level * R * 0.14;
        const tint = mixColor(accentSoft, accentStrong, index % 2 === 0 ? level : level * 0.6);

        if (level > 0.3) {
          ctx.strokeStyle = rgba(accent, 0.14 + level * 0.2);
          ctx.lineWidth = 10;
          ctx.beginPath();
          ctx.moveTo(cos * (R + 2), sin * (R + 2));
          ctx.lineTo(cos * (R + 2 + outerLen), sin * (R + 2 + outerLen));
          ctx.stroke();
        }

        ctx.strokeStyle = rgba(tint, 0.46 + level * 0.54);
        ctx.lineWidth = 4.6;
        ctx.beginPath();
        ctx.moveTo(cos * (R + 2), sin * (R + 2));
        ctx.lineTo(cos * (R + 2 + outerLen), sin * (R + 2 + outerLen));
        ctx.stroke();

        if (innerLen > 1.5) {
          ctx.strokeStyle = rgba(tint, 0.16 + level * 0.24);
          ctx.lineWidth = 2.2;
          ctx.beginPath();
          ctx.moveTo(cos * (R - 4), sin * (R - 4));
          ctx.lineTo(cos * (R - 4 - innerLen), sin * (R - 4 - innerLen));
          ctx.stroke();
        }
      }

      // 峰值光点。
      ctx.fillStyle = 'rgba(255, 255, 255, 0.9)';
      const peakDisplay = resampleLevels(frame.peaks, segments, true);
      for (let index = 0; index < segments; index += 2) {
        const peak = peakDisplay[index];
        if (peak < 0.12) continue;
        const angle = (index / segments) * TAU - Math.PI / 2;
        const r = R + 4 + peak * R * 0.62;
        ctx.beginPath();
        ctx.arc(Math.cos(angle) * r, Math.sin(angle) * r, 1.5, 0, TAU);
        ctx.fill();
      }
      ctx.restore();
    },
    reset() {
      display = null;
      rotation = 0;
    }
  };
}

/* ------------------------------------------------------------------ */
/* ring-orbit 轨道星环:三条反向旋转的星点轨道 + 律动核心                */
/* ------------------------------------------------------------------ */
function createRingOrbitPainter() {
  const lanes = [
    { ratio: 0.74, dots: 22, speed: 0.34, dir: 1, colorKey: 'accentSoft' },
    { ratio: 0.95, dots: 30, speed: 0.22, dir: -1, colorKey: 'white' },
    { ratio: 1.16, dots: 38, speed: 0.15, dir: 1, colorKey: 'accentStrong' }
  ];
  let display = null;
  let angles = lanes.map(() => 0);
  let corePulse = 0;

  return {
    paint(ctx, frame, env) {
      const cx = env.width / 2;
      const cy = env.height / 2;
      const R = Math.min(env.width, env.height) * 0.24;
      const dtSec = Math.min(env.dtMs, 100) / 1000;
      const { accent, accentSoft, accentStrong } = env.colors;
      const speedScale = env.reducedMotion ? 0.25 : 0.55 + frame.energy.overall * 1.3;

      display = resampleLevels(frame.levels, 64, false, display);

      drawBassCore(ctx, cx, cy, R * 0.9, frame.energy.bass, accent, accentSoft);

      if (frame.beat.hit) corePulse = Math.min(1, corePulse + 0.5 + frame.beat.strength * 0.5);
      corePulse = Math.max(0, corePulse - dtSec * 2.4);

      // 中心核:小而亮,随节拍轻微爆发。
      const coreR = R * 0.11 * (1 + frame.energy.bass * 0.45 + corePulse * 0.4);
      const coreGradient = ctx.createRadialGradient(cx, cy, 0, cx, cy, coreR * 2);
      coreGradient.addColorStop(0, rgba(mixColor(accentSoft, [255, 255, 255], 0.6), 0.85));
      coreGradient.addColorStop(0.45, rgba(accentSoft, 0.3));
      coreGradient.addColorStop(1, rgba(accent, 0));
      ctx.fillStyle = coreGradient;
      ctx.beginPath();
      ctx.arc(cx, cy, coreR * 2, 0, TAU);
      ctx.fill();

      lanes.forEach((lane, laneIndex) => {
        angles[laneIndex] += lane.speed * lane.dir * speedScale * dtSec;
        const laneRadius = R * lane.ratio;
        const laneColor = lane.colorKey === 'white'
          ? mixColor(accentSoft, [255, 255, 255], 0.75)
          : env.colors[lane.colorKey] || accentSoft;

        // 轨道基线。
        ctx.beginPath();
        ctx.arc(cx, cy, laneRadius, 0, TAU);
        ctx.strokeStyle = rgba(laneColor, 0.12);
        ctx.lineWidth = 1;
        ctx.stroke();

        for (let dot = 0; dot < lane.dots; dot += 1) {
          const bandIndex = Math.floor(((dot * 7 + laneIndex * 11) % lane.dots) / lane.dots * display.length);
          const level = display[bandIndex];
          const angle = angles[laneIndex] + (dot / lane.dots) * TAU;
          const wobble = level * R * 0.1 * Math.sin(env.timeMs / 300 + dot);
          const r = laneRadius + wobble;
          const x = cx + Math.cos(angle) * r;
          const y = cy + Math.sin(angle) * r;
          const size = 1.3 + level * 4.6;

          // 拖尾。
          if (!env.reducedMotion && level > 0.2) {
            const trail = 0.12 + level * 0.3;
            ctx.beginPath();
            ctx.arc(cx, cy, r, angle - trail * lane.dir, angle, lane.dir < 0);
            ctx.strokeStyle = rgba(laneColor, 0.16 + level * 0.2);
            ctx.lineWidth = size * 0.8;
            ctx.lineCap = 'round';
            ctx.stroke();
          }

          ctx.beginPath();
          ctx.arc(x, y, size, 0, TAU);
          ctx.fillStyle = rgba(laneColor, 0.4 + level * 0.6);
          ctx.fill();

          if (level > 0.55) {
            ctx.beginPath();
            ctx.arc(x, y, size * 2.1, 0, TAU);
            ctx.fillStyle = rgba(laneColor, 0.12 + level * 0.12);
            ctx.fill();
          }
        }
      });
    },
    reset() {
      display = null;
      angles = lanes.map(() => 0);
      corePulse = 0;
    }
  };
}

/* ------------------------------------------------------------------ */
/* ring-pulse 脉冲漩涡:漩涡状粗段 + 节拍扩散环 + 呼吸核心               */
/* ------------------------------------------------------------------ */
function createRingPulsePainter() {
  let display = null;
  let rotation = 0;
  let ripples = [];

  return {
    paint(ctx, frame, env) {
      const segments = 64;
      display = resampleLevels(frame.levels, segments, true, display);
      const cx = env.width / 2;
      const cy = env.height / 2;
      const R = Math.min(env.width, env.height) * 0.25;
      const dtSec = Math.min(env.dtMs, 100) / 1000;
      const { accent, accentSoft, accentStrong } = env.colors;

      rotation += (env.reducedMotion ? 0.03 : 0.12 + frame.energy.overall * 0.55) * dtSec;

      drawBassCore(ctx, cx, cy, R * 1.1, frame.energy.bass, accent, accentSoft);
      drawWaveRing(ctx, env, cx, cy, R * 0.68, R * 0.09, 0.28 + frame.energy.mid * 0.26);

      // 节拍扩散环。
      if (frame.beat.hit && !env.reducedMotion) {
        ripples.push({ r: R * 0.72, alpha: 0.34 + frame.beat.strength * 0.36, width: 2.6 + frame.beat.strength * 2.4 });
        if (ripples.length > 6) ripples.shift();
      }
      ripples = ripples.filter((ripple) => {
        ripple.r += R * 1.35 * dtSec;
        ripple.alpha -= dtSec * 0.5;
        if (ripple.alpha <= 0.01) return false;
        ctx.beginPath();
        ctx.arc(cx, cy, ripple.r, 0, TAU);
        ctx.strokeStyle = rgba(accentSoft, ripple.alpha);
        ctx.lineWidth = ripple.width;
        ctx.stroke();
        return true;
      });

      ctx.save();
      ctx.translate(cx, cy);
      ctx.rotate(rotation);
      ctx.lineCap = 'round';

      // 漩涡粗段:根部均匀分布,梢部随电平切向偏转,形成风车式漩涡。
      for (let index = 0; index < segments; index += 1) {
        const level = display[index];
        const angle = (index / segments) * TAU - Math.PI / 2;
        const tipAngle = angle + 0.1 + level * 0.34;
        const length = 5 + level * R * 0.66;
        const inner = R * (0.86 - level * 0.08);
        const outer = inner + length;
        const tint = mixColor(accentStrong, accentSoft, level);

        if (level > 0.32) {
          ctx.strokeStyle = rgba(accent, 0.09 + level * 0.13);
          ctx.lineWidth = 8.5;
          ctx.beginPath();
          ctx.moveTo(Math.cos(angle) * inner, Math.sin(angle) * inner);
          ctx.lineTo(Math.cos(tipAngle) * outer, Math.sin(tipAngle) * outer);
          ctx.stroke();
        }

        ctx.strokeStyle = rgba(tint, 0.3 + level * 0.65);
        ctx.lineWidth = 4.4;
        ctx.beginPath();
        ctx.moveTo(Math.cos(angle) * inner, Math.sin(angle) * inner);
        ctx.lineTo(Math.cos(tipAngle) * outer, Math.sin(tipAngle) * outer);
        ctx.stroke();
      }
      ctx.restore();

      // 核心呼吸圈。
      ctx.beginPath();
      ctx.arc(cx, cy, R * 0.6 * (0.94 + frame.energy.bass * 0.14), 0, TAU);
      ctx.strokeStyle = rgba(accentSoft, 0.34 + frame.energy.bass * 0.4);
      ctx.lineWidth = 1.8 + frame.energy.bass * 2.4;
      ctx.stroke();
    },
    reset() {
      display = null;
      rotation = 0;
      ripples = [];
    }
  };
}

/* ------------------------------------------------------------------ */
/* vinyl 唱片光环(播放详情页):贴着唱片边缘的径向频谱 + 低音呼吸圈       */
/* ------------------------------------------------------------------ */
function createVinylAuraPainter() {
  let display = null;
  let rotation = 0;

  return {
    paint(ctx, frame, env) {
      const segments = 88;
      display = resampleLevels(frame.levels, segments, true, display);
      const cx = env.width / 2;
      const cy = env.height / 2;
      const shortRadius = Math.min(env.width, env.height) / 2;
      const innerR = shortRadius * (env.innerRatio || 0.625) * 1.015;
      const maxLen = shortRadius - innerR - 4;
      const { accent, accentSoft, accentStrong } = env.colors;

      rotation -= (env.reducedMotion ? 0 : 0.055 + frame.energy.overall * 0.12) * (Math.min(env.dtMs, 100) / 1000);

      // 低音呼吸圈:紧贴唱片边缘。
      ctx.beginPath();
      ctx.arc(cx, cy, innerR * (1 + frame.energy.bass * 0.012), 0, TAU);
      ctx.strokeStyle = rgba(accentSoft, 0.2 + frame.energy.bass * 0.5);
      ctx.lineWidth = 1.6 + frame.energy.bass * 3;
      ctx.stroke();

      if (env.reducedMotion) {
        // 减少动态:只保留静态柔光环。
        ctx.beginPath();
        ctx.arc(cx, cy, innerR * 1.05, 0, TAU);
        ctx.strokeStyle = rgba(accentSoft, 0.22);
        ctx.lineWidth = 6;
        ctx.stroke();
        return;
      }

      ctx.save();
      ctx.translate(cx, cy);
      ctx.rotate(rotation);
      ctx.lineCap = 'round';

      for (let index = 0; index < segments; index += 1) {
        const level = display[index];
        const angle = (index / segments) * TAU - Math.PI / 2;
        const cos = Math.cos(angle);
        const sin = Math.sin(angle);
        const length = 2 + level * maxLen * 0.92;
        const tint = mixColor(accentSoft, accentStrong, 0.25 + level * 0.6);

        ctx.strokeStyle = rgba(tint, 0.34 + level * 0.58);
        ctx.lineWidth = 3.4;
        ctx.beginPath();
        ctx.moveTo(cos * (innerR + 2), sin * (innerR + 2));
        ctx.lineTo(cos * (innerR + 2 + length), sin * (innerR + 2 + length));
        ctx.stroke();
      }

      // 峰值光点。
      ctx.fillStyle = 'rgba(255, 255, 255, 0.82)';
      const peakDisplay = resampleLevels(frame.peaks, segments, true);
      for (let index = 0; index < segments; index += 3) {
        const peak = peakDisplay[index];
        if (peak < 0.14) continue;
        const angle = (index / segments) * TAU - Math.PI / 2;
        const r = innerR + 3 + peak * maxLen * 0.92;
        ctx.beginPath();
        ctx.arc(Math.cos(angle) * r, Math.sin(angle) * r, 0.9, 0, TAU);
        ctx.fill();
      }
      ctx.restore();
    },
    reset() {
      display = null;
      rotation = 0;
    }
  };
}

/* ------------------------------------------------------------------ */
/* bars-aurora 极光光柱:高可见度默认样式。                              */
/* 粗光柱 + 暗色衬底 + 白热顶端 + 节拍闪光,任何壁纸上都清晰可读。       */
/* ------------------------------------------------------------------ */
function createBarsAuroraPainter() {
  let display = null;
  let peakDisplay = null;
  let flash = 0;

  return {
    paint(ctx, frame, env) {
      const count = 40;
      display = resampleLevels(frame.levels, count, false, display);
      peakDisplay = resampleLevels(frame.peaks, count, false, peakDisplay);
      const layout = computeBarsLayout(env.width, env.height, count, 0.24);
      const heightScale = layout.baseline - layout.topPad;
      const { accent, accentSoft, accentStrong } = env.colors;
      const dtSec = Math.min(env.dtMs, 100) / 1000;

      // 节拍闪光包络。
      if (frame.beat?.hit) flash = Math.min(1, flash + 0.5 + (frame.beat.strength || 0) * 0.5);
      flash = Math.max(0, flash - dtSec * 2.6);

      // 暗色衬底:让光柱在亮壁纸上也保持对比度。
      const padTop = layout.topPad * 0.5;
      const backdrop = ctx.createLinearGradient(0, padTop, 0, env.height);
      backdrop.addColorStop(0, 'rgba(10, 8, 16, 0)');
      backdrop.addColorStop(0.55, `rgba(10, 8, 16, ${0.22 + frame.energy.overall * 0.16})`);
      backdrop.addColorStop(1, `rgba(10, 8, 16, ${0.38 + frame.energy.overall * 0.16})`);
      ctx.fillStyle = backdrop;
      ctx.fillRect(0, padTop, env.width, env.height - padTop);

      paintBassUnderGlow(ctx, env, layout.baseline + 2, Math.min(1, frame.energy.bass * 1.25), accent);

      // 主体光柱:感知增强曲线(低电平也可见)。
      const bodyPath = new Path2D();
      const boosted = display.map((level) => Math.min(1, Math.pow(level, 0.78) * 1.06));
      traceBarsPath(bodyPath, boosted, layout, heightScale, 3);

      const gradient = ctx.createLinearGradient(0, layout.topPad, 0, layout.baseline);
      gradient.addColorStop(0, 'rgba(255, 255, 255, 0.99)');
      gradient.addColorStop(0.28, rgba(mixColor(accentSoft, [255, 255, 255], 0.5), 0.98));
      gradient.addColorStop(0.62, rgba(accent, 0.96));
      gradient.addColorStop(1, rgba(accentStrong, 0.92));

      ctx.save();
      ctx.shadowColor = rgba(accent, 0.8 + flash * 0.2);
      ctx.shadowBlur = 26 + flash * 14;
      ctx.fillStyle = gradient;
      ctx.fill(bodyPath);
      ctx.restore();

      // 边缘描白,强化轮廓。
      ctx.strokeStyle = `rgba(255, 255, 255, ${0.34 + flash * 0.2})`;
      ctx.lineWidth = 1.2;
      ctx.stroke(bodyPath);

      // 粗峰值帽 + 顶端光球。
      for (let index = 0; index < count; index += 1) {
        const peak = peakDisplay[index];
        const level = boosted[index];
        const capY = layout.baseline - Math.max(4, peak * heightScale) - 6;
        if (capY < layout.baseline - 8) {
          ctx.fillStyle = 'rgba(255, 255, 255, 0.96)';
          ctx.fillRect(layout.left + index * layout.slot, capY, layout.barWidth, 3.4);
        }
        if (level > 0.5 && !env.reducedMotion) {
          const x = layout.left + index * layout.slot + layout.barWidth / 2;
          const y = layout.baseline - level * heightScale;
          ctx.fillStyle = rgba(mixColor(accentSoft, [255, 255, 255], 0.7), 0.25 + level * 0.45);
          ctx.beginPath();
          ctx.arc(x, y, layout.barWidth * 0.34, 0, TAU);
          ctx.fill();
        }
      }

      // 明亮基线光带。
      const lineGradient = ctx.createLinearGradient(0, 0, env.width, 0);
      lineGradient.addColorStop(0, rgba(accent, 0));
      lineGradient.addColorStop(0.5, rgba(mixColor(accentSoft, [255, 255, 255], 0.4), 0.78 + frame.energy.overall * 0.2));
      lineGradient.addColorStop(1, rgba(accent, 0));
      ctx.fillStyle = lineGradient;
      ctx.fillRect(layout.left, layout.baseline, env.width - layout.left * 2, 2.6);
    },
    reset() {
      display = null;
      peakDisplay = null;
      flash = 0;
    }
  };
}

const PAINTER_FACTORIES = {
  'bars-aurora': createBarsAuroraPainter,
  'bars-neon': createBarsNeonPainter,
  'bars-crystal': createBarsCrystalPainter,
  'bars-firefly': createBarsFireflyPainter,
  'ring-halo': createRingHaloPainter,
  'ring-orbit': createRingOrbitPainter,
  'ring-pulse': createRingPulsePainter,
  vinyl: createVinylAuraPainter
};

export const VISUALIZER_PAINTER_KEYS = Object.keys(PAINTER_FACTORIES);

export function createVisualizerPainter(styleKey) {
  const factory = PAINTER_FACTORIES[styleKey] || PAINTER_FACTORIES['bars-neon'];
  return factory();
}
