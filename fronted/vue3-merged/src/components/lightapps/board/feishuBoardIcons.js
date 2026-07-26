/**
 * feishuBoardIcons.js
 * 白板 UI 内联 SVG 图标（飞书风格线性图标，currentColor 着色）。
 */

function svg(content, viewBox = '0 0 24 24') {
  return `<svg viewBox="${viewBox}" fill="none" stroke="currentColor" stroke-width="1.7" stroke-linecap="round" stroke-linejoin="round" aria-hidden="true">${content}</svg>`;
}

export const BOARD_ICONS = Object.freeze({
  select: svg('<path d="M5.5 3.8 19.2 11.2c.5.3.4 1-.1 1.2l-5.6 1.7-3 5.2c-.3.5-1 .4-1.2-.1L4.6 4.9c-.2-.6.4-1.3.9-1.1Z" fill="currentColor" stroke="none"/>'),
  hand: svg('<path d="M8.6 11.6V5.9a1.4 1.4 0 0 1 2.8 0v4.9V4.6a1.4 1.4 0 0 1 2.8 0v6.2-4.9a1.4 1.4 0 0 1 2.8 0v6.5-2.9a1.35 1.35 0 0 1 2.7 0v5.6c0 3.8-2.6 6.3-6.4 6.3-2.8 0-4.4-1.1-5.9-3.4l-2.5-3.9a1.5 1.5 0 0 1 2.4-1.7l1.3 1.6Z"/>'),
  note: svg('<path d="M4.5 6.2c0-1 .8-1.7 1.7-1.7h11.6c1 0 1.7.8 1.7 1.7v7.2L14 19.5H6.2c-1 0-1.7-.8-1.7-1.7V6.2Z"/><path d="M19.5 13.4H14v6.1" />'),
  shapes: svg('<rect x="3.6" y="3.6" width="10.2" height="10.2" rx="1.4"/><circle cx="15.4" cy="15.4" r="4.9" fill="#fff"/>'),
  connector: svg('<circle cx="5" cy="6" r="2.1"/><path d="M7.2 6h5.6c1 0 1.8.8 1.8 1.8v8.4c0 1 .8 1.8 1.8 1.8h1.4"/><path d="m15.6 15.2 3 2.8-3 2.8"/>'),
  pen: svg('<path d="m4 20 .9-3.8L15.6 5.5a1.9 1.9 0 0 1 2.7 0l.3.3a1.9 1.9 0 0 1 0 2.7L7.8 19.1 4 20Z"/><path d="m13.9 7.2 2.9 2.9"/>'),
  highlighter: svg('<path d="m5 15.5 8.6-8.6a1.8 1.8 0 0 1 2.6 0l.9.9a1.8 1.8 0 0 1 0 2.6L8.5 19H5v-3.5Z"/><path d="M4 21h16"/>'),
  eraser: svg('<path d="m5 14.2 7.7-7.7a1.8 1.8 0 0 1 2.6 0l2.9 2.9a1.8 1.8 0 0 1 0 2.6l-6.6 6.6H8.4L5 15.4a1.6 1.6 0 0 1 0-1.2Z"/><path d="m10.2 9 5.5 5.5"/><path d="M12.6 18.6H20"/>'),
  text: svg('<path d="M5 6.5V4.8h14v1.7"/><path d="M12 4.8v14.4"/><path d="M9.2 19.2h5.6"/>'),
  image: svg('<rect x="3.8" y="4.8" width="16.4" height="14.4" rx="1.6"/><circle cx="9" cy="10" r="1.6"/><path d="m6.2 18.4 4.9-4.9a1.4 1.4 0 0 1 2 0l4.7 4.7"/><path d="m15.2 15.9 1.5-1.5a1.4 1.4 0 0 1 2 0l1.5 1.5"/>'),
  undo: svg('<path d="M8.2 5.5 4.6 9l3.6 3.5"/><path d="M4.9 9h9.3a5 5 0 0 1 0 10H9.5"/>'),
  redo: svg('<path d="m15.8 5.5 3.6 3.5-3.6 3.5"/><path d="M19.1 9H9.8a5 5 0 0 0 0 10h4.7"/>'),
  plus: svg('<path d="M12 5v14M5 12h14"/>'),
  minus: svg('<path d="M5 12h14"/>'),
  fit: svg('<path d="M9 4.5H6.2A1.7 1.7 0 0 0 4.5 6.2V9M15 4.5h2.8a1.7 1.7 0 0 1 1.7 1.7V9M9 19.5H6.2a1.7 1.7 0 0 1-1.7-1.7V15M15 19.5h2.8a1.7 1.7 0 0 0 1.7-1.7V15"/>'),
  close: svg('<path d="m6 6 12 12M18 6 6 18"/>'),
  trash: svg('<path d="M4.5 6.5h15"/><path d="M9.5 4h5"/><path d="M6.5 6.5 7.3 19a1.7 1.7 0 0 0 1.7 1.5h6a1.7 1.7 0 0 0 1.7-1.5l.8-12.5"/><path d="M10 10.5v6M14 10.5v6"/>'),
  duplicate: svg('<rect x="8.5" y="8.5" width="11" height="11" rx="1.6"/><path d="M5.5 15.5h-.9A1.6 1.6 0 0 1 3 13.9V5.1c0-.9.7-1.6 1.6-1.6h8.8c.9 0 1.6.7 1.6 1.6V6"/>'),
  front: svg('<rect x="9" y="9" width="11" height="11" rx="1.4" fill="currentColor" stroke="none" opacity="0.9"/><rect x="4" y="4" width="9" height="9" rx="1.2"/>'),
  back: svg('<rect x="9" y="9" width="11" height="11" rx="1.4"/><rect x="4" y="4" width="9" height="9" rx="1.2" fill="currentColor" stroke="none" opacity="0.9"/>'),
  more: svg('<circle cx="5.5" cy="12" r="1.4" fill="currentColor" stroke="none"/><circle cx="12" cy="12" r="1.4" fill="currentColor" stroke="none"/><circle cx="18.5" cy="12" r="1.4" fill="currentColor" stroke="none"/>'),
  check: svg('<path d="m5 12.5 4.5 4.5L19 7.5"/>'),
  lineStraight: svg('<path d="M5 19 19 5"/><circle cx="5" cy="19" r="1.7" fill="currentColor" stroke="none"/><circle cx="19" cy="5" r="1.7" fill="currentColor" stroke="none"/>'),
  lineElbow: svg('<path d="M5 17.5h6.4c.9 0 1.6-.7 1.6-1.6V8.1c0-.9.7-1.6 1.6-1.6H19"/><path d="m16.2 3.8 2.8 2.7-2.8 2.7"/>'),
  lineCurve: svg('<path d="M4.5 18.5c7.5 0 7.5-13 15-13"/><path d="m16.7 3 2.8 2.5-2.8 2.5"/>'),
  arrowBoth: svg('<path d="M7 12h10"/><path d="m9.8 8.8L6.4 12l3.4 3.2M14.2 8.8 17.6 12l-3.4 3.2"/>'),
  arrowEnd: svg('<path d="M5 12h12"/><path d="m13.6 8.8 3.4 3.2-3.4 3.2"/>'),
  arrowNone: svg('<path d="M5.5 12h13"/>'),
  alignLeft: svg('<path d="M5 4v16"/><rect x="8" y="6.5" width="11" height="3.6" rx="1"/><rect x="8" y="13.9" width="6.5" height="3.6" rx="1"/>'),
  alignHCenter: svg('<path d="M12 4v16"/><rect x="5.5" y="6.5" width="13" height="3.6" rx="1"/><rect x="8.5" y="13.9" width="7" height="3.6" rx="1"/>'),
  alignRight: svg('<path d="M19 4v16"/><rect x="5" y="6.5" width="11" height="3.6" rx="1"/><rect x="9.5" y="13.9" width="6.5" height="3.6" rx="1"/>'),
  alignTop: svg('<path d="M4 5h16"/><rect x="6.5" y="8" width="3.6" height="11" rx="1"/><rect x="13.9" y="8" width="3.6" height="6.5" rx="1"/>'),
  alignVCenter: svg('<path d="M4 12h16"/><rect x="6.5" y="5.5" width="3.6" height="13" rx="1"/><rect x="13.9" y="8.5" width="3.6" height="7" rx="1"/>'),
  alignBottom: svg('<path d="M4 19h16"/><rect x="6.5" y="5" width="3.6" height="11" rx="1"/><rect x="13.9" y="9.5" width="3.6" height="6.5" rx="1"/>'),
  distributeH: svg('<path d="M4 5v14M20 5v14"/><rect x="8" y="7.5" width="3.4" height="9" rx="1"/><rect x="12.9" y="7.5" width="3.4" height="9" rx="1"/>'),
  distributeV: svg('<path d="M4 4h16M4 20h16"/><rect x="7.5" y="8" width="9" height="3.4" rx="1"/><rect x="7.5" y="12.9" width="9" height="3.4" rx="1"/>'),
  fontSize: svg('<path d="M4 18 9 6l5 12"/><path d="M5.6 14.2h6.8"/><path d="M14.5 18l3-7 3 7"/><path d="M15.6 15.8h3.8"/>'),
  geoRect: svg('<rect x="4" y="6" width="16" height="12" rx="1.2"/>'),
  geoRound: svg('<rect x="4" y="6" width="16" height="12" rx="4.5"/>'),
  geoEllipse: svg('<ellipse cx="12" cy="12" rx="8.2" ry="6.4"/>'),
  geoDiamond: svg('<path d="M12 4.5 20 12l-8 7.5L4 12Z"/>'),
  geoTriangle: svg('<path d="M12 5.5 20 18.5H4Z"/>'),
  geoParallelogram: svg('<path d="M8.2 6.5H20l-4.2 11H4Z"/>'),
  geoHexagon: svg('<path d="M8.1 5.5h7.8L20 12l-4.1 6.5H8.1L4 12Z"/>'),
  geoStar: svg('<path d="m12 4.5 2.1 4.6 5 .5-3.8 3.3 1.1 4.9L12 15.3l-4.4 2.5 1.1-4.9L4.9 9.6l5-.5Z"/>'),
  geoCylinder: svg('<path d="M4.8 7.6c0-1.5 3.2-2.6 7.2-2.6s7.2 1.1 7.2 2.6v8.8c0 1.5-3.2 2.6-7.2 2.6s-7.2-1.1-7.2-2.6Z"/><path d="M4.8 7.6c0 1.5 3.2 2.6 7.2 2.6s7.2-1.1 7.2-2.6"/>'),
  geoBubble: svg('<path d="M5.6 5.5h12.8c.9 0 1.6.7 1.6 1.6v7c0 .9-.7 1.6-1.6 1.6h-7.9l-3.4 3.2v-3.2H5.6c-.9 0-1.6-.7-1.6-1.6v-7c0-.9.7-1.6 1.6-1.6Z"/>'),
  dashSolid: svg('<path d="M4 12h16"/>'),
  dashDashed: svg('<path d="M4 12h4M10 12h4M16 12h4"/>'),
  dashDotted: svg('<path stroke-width="2.6" stroke-linecap="round" d="M5 12h.01M9.7 12h.01M14.4 12h.01M19 12h.01"/>')
});

export function iconHtml(name) {
  return BOARD_ICONS[name] || '';
}
