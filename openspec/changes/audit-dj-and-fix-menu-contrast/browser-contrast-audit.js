// Run in the local Vite page with agent-browser eval -b (UTF-8 base64).
// This changes only this isolated browser's preferences and restores them afterward.
(async () => {
  const { useUiPreferences } = await import('/src/composables/useUiPreferences.js');
  const ui = useUiPreferences();
  const saved = JSON.parse(JSON.stringify(ui.state));
  const instant = document.createElement('style');
  instant.textContent = '.top-menu-root *, .atmo-panel, .atmo-panel * { transition: none !important; animation: none !important; }';
  document.head.append(instant);
  // A task boundary flushes Vue updates; rAF is throttled in background browsers.
  const settle = () => new Promise(resolve => setTimeout(resolve, 0));
  const canvas = document.createElement('canvas');
  canvas.width = canvas.height = 1;
  const context = canvas.getContext('2d', { willReadFrequently: true });
  const colorCache = new Map();
  const rgba = color => {
    if (colorCache.has(color)) return [...colorCache.get(color)];
    context.clearRect(0, 0, 1, 1);
    context.fillStyle = color;
    context.fillRect(0, 0, 1, 1);
    const [r, g, b, a] = context.getImageData(0, 0, 1, 1).data;
    const result = [r, g, b, a / 255];
    colorCache.set(color, result);
    return [...result];
  };
  const over = (foreground, background) => foreground.slice(0, 3)
    .map((channel, i) => channel * foreground[3] + background[i] * (1 - foreground[3]));
  const luminance = color => color.slice(0, 3).map(channel => {
    const n = channel / 255;
    return n <= 0.04045 ? n / 12.92 : ((n + 0.055) / 1.055) ** 2.4;
  }).reduce((sum, n, i) => sum + n * [0.2126, 0.7152, 0.0722][i], 0);
  const contrast = (foreground, background) => {
    const a = luminance(foreground), b = luminance(background);
    return (Math.max(a, b) + 0.05) / (Math.min(a, b) + 0.05);
  };
  const failures = [], unsupported = new Set();
  let checks = 0, cases = 0, minimum = 100;
  let worst = null;
  const scan = label => {
    const styleCache = new WeakMap();
    const readStyle = element => {
      if (!styleCache.has(element)) styleCache.set(element, getComputedStyle(element));
      return styleCache.get(element);
    };
    for (const element of document.querySelectorAll('.top-menu-root *, .atmo-panel *')) {
      const text = [...element.childNodes].filter(node => node.nodeType === Node.TEXT_NODE)
        .map(node => node.textContent.trim()).join(' ').trim();
      const placeholder = element.matches('input[placeholder]') && !element.value;
      const icon = element.matches('i.fas, i.far, i.fab');
      if ((!text && !placeholder && !icon) || element.closest(':disabled,[aria-disabled="true"],.disabled,[inert]')) continue;
      const ancestors = [];
      let opacity = 1, hidden = false;
      for (let current = element; current; current = current.parentElement) {
        const style = readStyle(current);
        if (style.display === 'none' || style.visibility === 'hidden' || current.getAttribute('aria-hidden') === 'true' && !icon) hidden = true;
        opacity *= Number(style.opacity);
        ancestors.push(style);
      }
      if (hidden || opacity < 0.05 || !element.getClientRects().length) continue;
      let backgrounds = [[255, 255, 255]];
      for (const style of ancestors.reverse()) {
        const base = rgba(style.backgroundColor);
        if (base[3]) backgrounds = backgrounds.map(background => over(base, background));
        if (style.backgroundImage !== 'none') {
          const stops = style.backgroundImage.match(/rgba?\([^)]*\)/g);
          if (stops) backgrounds = backgrounds.flatMap(background => stops.map(stop => over(rgba(stop), background))).slice(0, 12);
          else unsupported.add(`${label}: ${element.className}: ${style.backgroundImage}`);
        }
      }
      const style = readStyle(element);
      const ink = rgba(placeholder ? getComputedStyle(element, '::placeholder').color : style.color);
      ink[3] *= opacity;
      const ratio = Math.min(...backgrounds.map(background => contrast(over(ink, background), background)));
      const large = Number.parseFloat(style.fontSize) >= 24 || Number.parseFloat(style.fontSize) >= 18.667 && Number(style.fontWeight) >= 700;
      const required = icon || large ? 3 : 4.5;
      const entry = { label, selector: element.className, text: (text || element.placeholder || 'icon').slice(0, 70), ratio: Number(ratio.toFixed(3)), required, color: style.color };
      checks++;
      if (ratio < minimum) { minimum = ratio; worst = entry; }
      if (ratio < required) failures.push(entry);
    }
  };
  try {
    if (!window.__menuAuditOptions?.appearance && !document.querySelector('.atmo-panel')) {
      document.querySelector('[aria-label="打开氛围面板"]').click();
      // Measure the settled panel rather than a partly transparent entrance frame.
      await new Promise(resolve => setTimeout(resolve, 400));
    }
    const solids = [...ui.ACCENT_PRESETS.map(item => item.hex), '#FFFFFF', '#000000', '#FFFF00', '#0000FF', '#FF0000', '#00FF00', '#777777'];
    const gradients = [...ui.GRADIENT_PRESETS.map(item => [item.startHex, item.endHex]), ['#FFFFFF', '#000000'], ['#000000', '#FFFFFF'], ['#0000FF', '#FFFF00']];
    for (const theme of window.__menuAuditOptions?.theme ? [window.__menuAuditOptions.theme] : ['day', 'night']) {
      for (const { id: personality } of ui.PALETTE_STYLES.filter(style => !window.__menuAuditOptions?.personality || style.id === window.__menuAuditOptions.personality)) {
        ui.setThemeMode(theme);
        ui.setPaletteStyle(personality);
        for (const seed of [...solids, ...gradients]) {
          if (Array.isArray(seed)) { ui.setAccentGradientCustom(...seed); ui.setAccentMode('gradient'); }
          else { ui.setAccentHex(seed); ui.setAccentMode('solid'); }
          await settle();
          cases++;
          scan(`${theme}/${personality}/${seed}`);
        }
      }
      ui.setPaletteStyle('soft');
      ui.setAccentHex('#F2B39D');
      ui.setAccentMode('solid');
      for (const tab of document.querySelectorAll('.atmo-tab')) {
        tab.click();
        await settle();
        cases++;
        scan(`${theme}/tab/${tab.textContent.trim()}`);
      }
    }
    const report = { viewport: [innerWidth, innerHeight], cases, checks, minimum: Number(minimum.toFixed(3)), worst, failures, unsupported: [...unsupported] };
    window.__lastMenuAuditReport = report;
    return report;
  } finally {
    ui.setThemeMode(saved.themeMode);
    ui.setPaletteStyle(saved.paletteStyle);
    ui.setAccentHex(saved.accentHex);
    ui.setAccentGradientCustom(saved.accentGradientStartHex, saved.accentGradientEndHex);
    ui.setAccentMode(saved.accentMode);
    if (saved.accentGradientId !== 'custom') ui.setAccentGradientPreset(saved.accentGradientId);
    instant.remove();
  }
})()
