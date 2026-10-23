// Run inside the page with agent-browser eval. Ignores disabled controls.
// Uses computed colors and alpha-composites ancestor backgrounds.
(() => {
  const rgb = value => {
    const values = value.match(/[\d.]+/g)?.map(Number) || [];
    return [values[0] || 0, values[1] || 0, values[2] || 0, values[3] ?? 1];
  };
  const blend = (fg, bg) => fg.slice(0, 3).map((v, i) => v * fg[3] + bg[i] * (1 - fg[3]));
  function background(element) {
    const layers = [];
    let gradient = false;
    for (let e = element; e; e = e.parentElement) {
      const style = getComputedStyle(e);
      gradient ||= style.backgroundImage !== 'none';
      const color = rgb(style.backgroundColor);
      layers.push(color);
      if (color[3] === 1) break;
    }
    return { color: layers.reverse().reduce((bg, fg) => blend(fg, bg), [255, 255, 255]), gradient };
  }
  const luminance = c => c.map(v => v / 255).map(v => v <= .04045 ? v / 12.92 : ((v + .055) / 1.055) ** 2.4).reduce((sum, v, i) => sum + v * [.2126, .7152, .0722][i], 0);
  const walker = document.createTreeWalker(document.body, NodeFilter.SHOW_TEXT);
  const rows = [];
  let node;
  while ((node = walker.nextNode())) {
    const text = node.textContent.trim();
    const e = node.parentElement;
    if (!text || !e || e.closest('script,style,option,[disabled],[aria-disabled="true"]')) continue;
    const range = document.createRange(); range.selectNodeContents(node);
    const rect = range.getBoundingClientRect();
    const s = getComputedStyle(e);
    if (!rect.width || !rect.height || s.visibility !== 'visible' || s.opacity === '0') continue;
    const bg = background(e);
    const ink = blend(rgb(s.color), bg.color);
    const ls = [luminance(ink), luminance(bg.color)].sort((a, b) => b - a);
    const ratio = (ls[0] + .05) / (ls[1] + .05);
    const size = parseFloat(s.fontSize);
    const large = size >= 24 || (size >= 18.66 && parseInt(s.fontWeight, 10) >= 700);
    rows.push({ text: text.slice(0, 70), ratio: +ratio.toFixed(3), required: large ? 3 : 4.5,
      ink: s.color, background: bg.color.map(Math.round), gradient: bg.gradient,
      navigation: !!e.closest('nav'), tag: e.tagName });
  }
  const certain = rows.filter(r => !r.gradient);
  return { url: location.href, viewport: [innerWidth, innerHeight],
    overflow: document.documentElement.scrollWidth > innerWidth,
    samples: rows.length, minRatio: Math.min(...certain.map(r => r.ratio)),
    navigation: rows.filter(r => r.navigation),
    failures: certain.filter(r => r.ratio < r.required),
    manual: rows.filter(r => r.gradient) };
})()
