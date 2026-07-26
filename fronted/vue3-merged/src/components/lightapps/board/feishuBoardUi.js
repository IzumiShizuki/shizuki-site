/**
 * feishuBoardUi.js
 * 飞书风格白板 DOM UI：左侧工具坞、弹层、上下文工具栏、缩放条、
 * 文本编辑覆盖层、快速连线图形选择弹窗。纯 DOM 实现（无框架依赖）。
 */

import {
  FILL_CHOICES,
  FONT_SIZE_CHOICES,
  NOTE_PALETTE,
  STROKE_CHOICES,
  STROKE_WIDTH_CHOICES,
  TEXT_COLOR_CHOICES,
  clamp,
  getConnectorGeometry,
  getShapeBounds,
  toFiniteNumber
} from './feishuBoardCore';
import { iconHtml } from './feishuBoardIcons';

const GEO_CHOICES = [
  { kind: 'rect', icon: 'geoRect', label: '矩形' },
  { kind: 'round', icon: 'geoRound', label: '圆角矩形' },
  { kind: 'ellipse', icon: 'geoEllipse', label: '圆形' },
  { kind: 'diamond', icon: 'geoDiamond', label: '菱形' },
  { kind: 'triangle', icon: 'geoTriangle', label: '三角形' },
  { kind: 'parallelogram', icon: 'geoParallelogram', label: '平行四边形' },
  { kind: 'hexagon', icon: 'geoHexagon', label: '六边形' },
  { kind: 'star', icon: 'geoStar', label: '五角星' },
  { kind: 'cylinder', icon: 'geoCylinder', label: '圆柱' },
  { kind: 'bubble', icon: 'geoBubble', label: '气泡' }
];

const CHOICE_TOOLS = [
  { id: 'rect', icon: 'geoRect', label: '矩形' },
  { id: 'round', icon: 'geoRound', label: '圆角矩形' },
  { id: 'ellipse', icon: 'geoEllipse', label: '圆形' },
  { id: 'diamond', icon: 'geoDiamond', label: '菱形' },
  { id: 'triangle', icon: 'geoTriangle', label: '三角形' },
  { id: 'note', icon: 'note', label: '便签' },
  { id: 'text', icon: 'text', label: '文本' }
];

const RESIZE_CURSORS = {
  nw: 'nwse-resize',
  se: 'nwse-resize',
  ne: 'nesw-resize',
  sw: 'nesw-resize',
  n: 'ns-resize',
  s: 'ns-resize',
  e: 'ew-resize',
  w: 'ew-resize',
  rotate: 'grab'
};

function el(tag, className, html) {
  const node = document.createElement(tag);
  if (className) node.className = className;
  if (html !== undefined) node.innerHTML = html;
  return node;
}

export function createFeishuBoardUi(target, engine, renderer) {
  const root = el('div', 'fsb-root');
  root.tabIndex = 0;
  root.dataset.tool = 'select';
  const canvas = el('canvas', 'fsb-canvas');
  root.appendChild(canvas);
  target.appendChild(root);

  const disposers = [];
  const listen = (node, event, handler, options) => {
    node.addEventListener(event, handler, options);
    disposers.push(() => node.removeEventListener(event, handler, options));
  };

  /* ---------------- 提示 ---------------- */
  const tip = el('div', 'fsb-tip');
  root.appendChild(tip);
  let tipTimer = 0;

  function attachTip(node, label, shortcut, placement = 'right') {
    listen(node, 'mouseenter', () => {
      window.clearTimeout(tipTimer);
      tipTimer = window.setTimeout(() => {
        tip.innerHTML = `${label}${shortcut ? `<span class="fsb-tip__key">${shortcut}</span>` : ''}`;
        tip.classList.add('is-visible');
        const rootRect = root.getBoundingClientRect();
        const rect = node.getBoundingClientRect();
        const tipRect = tip.getBoundingClientRect();
        let left;
        let top;
        if (placement === 'right') {
          left = rect.right - rootRect.left + 10;
          top = rect.top - rootRect.top + rect.height / 2 - tipRect.height / 2;
        } else {
          left = rect.left - rootRect.left + rect.width / 2 - tipRect.width / 2;
          top = rect.top - rootRect.top - tipRect.height - 8;
        }
        tip.style.left = `${clamp(left, 4, rootRect.width - tipRect.width - 4)}px`;
        tip.style.top = `${clamp(top, 4, rootRect.height - tipRect.height - 4)}px`;
      }, 350);
    });
    ['mouseleave', 'pointerdown'].forEach((eventName) => {
      listen(node, eventName, () => {
        window.clearTimeout(tipTimer);
        tip.classList.remove('is-visible');
      });
    });
  }

  /* ---------------- 弹层管理 ---------------- */
  let openFlyout = null;

  function closeFlyout() {
    if (openFlyout) {
      openFlyout.node.remove();
      openFlyout = null;
    }
  }

  function showFlyout(key, anchorNode, build) {
    if (openFlyout?.key === key) {
      closeFlyout();
      return;
    }
    closeFlyout();
    const node = el('div', 'fsb-panel fsb-flyout');
    build(node);
    root.appendChild(node);
    const rootRect = root.getBoundingClientRect();
    const anchorRect = anchorNode.getBoundingClientRect();
    const nodeRect = node.getBoundingClientRect();
    const left = anchorRect.right - rootRect.left + 10;
    const top = clamp(anchorRect.top - rootRect.top - 4, 8, rootRect.height - nodeRect.height - 8);
    node.style.left = `${left}px`;
    node.style.top = `${top}px`;
    openFlyout = { key, node, anchor: anchorNode };
  }

  listen(
    root,
    'pointerdown',
    (event) => {
      if (openFlyout && !openFlyout.node.contains(event.target) && !openFlyout.anchor.contains(event.target)) {
        closeFlyout();
      }
      if (contextPopover && !contextBar.contains(event.target)) {
        closeContextPopover();
      }
      if (zoomMenu && !zoomMenu.contains(event.target) && !zoomValueBtn.contains(event.target)) {
        closeZoomMenu();
      }
    },
    true
  );

  /* ---------------- 工具坞 ---------------- */
  const dock = el('div', 'fsb-panel fsb-dock');
  root.appendChild(dock);
  const dockButtons = new Map();

  function dockButton(id, icon, label, shortcut, hasFlyout, onClick) {
    const button = el('button', 'fsb-btn', iconHtml(icon) + (hasFlyout ? '<span class="fsb-caret"></span>' : ''));
    button.type = 'button';
    listen(button, 'click', onClick);
    attachTip(button, label, shortcut, 'right');
    dock.appendChild(button);
    dockButtons.set(id, button);
    return button;
  }

  const penFamily = ['pen', 'highlighter', 'eraser'];
  let penWidths = { pen: 3, highlighter: 12 };

  dockButton('select', 'select', '选择', 'V', false, () => engine.setTool('select'));
  dockButton('hand', 'hand', '抓手', 'H', false, () => engine.setTool('hand'));
  dock.appendChild(el('div', 'fsb-dock__divider'));

  const noteBtn = dockButton('note', 'note', '便签', 'N', true, () => {
    engine.setTool('note');
    showFlyout('note', noteBtn, (node) => {
      node.appendChild(el('div', 'fsb-flyout__title', '便签颜色'));
      const grid = el('div', 'fsb-swatch-grid');
      NOTE_PALETTE.forEach((color) => {
        const swatch = el('button', `fsb-swatch${engine.lastStyles.noteColor === color ? ' is-active' : ''}`);
        swatch.type = 'button';
        swatch.style.background = color;
        listen(swatch, 'click', () => {
          engine.lastStyles.noteColor = color;
          engine.setTool('note');
          closeFlyout();
        });
        grid.appendChild(swatch);
      });
      node.appendChild(grid);
    });
  });

  const shapeBtn = dockButton('geo', 'shapes', '形状', 'R', true, () => {
    const currentKind = engine.tool.id === 'geo' ? engine.tool.geo : 'rect';
    engine.setTool('geo', { geo: currentKind || 'rect' });
    showFlyout('geo', shapeBtn, (node) => {
      node.appendChild(el('div', 'fsb-flyout__title', '形状'));
      const grid = el('div', 'fsb-flyout__grid');
      GEO_CHOICES.forEach((choice) => {
        const button = el('button', `fsb-btn${engine.tool.geo === choice.kind ? ' is-active' : ''}`, iconHtml(choice.icon));
        button.type = 'button';
        attachTip(button, choice.label, '', 'top');
        listen(button, 'click', () => {
          engine.setTool('geo', { geo: choice.kind });
          closeFlyout();
        });
        grid.appendChild(button);
      });
      node.appendChild(grid);
    });
  });

  const connectorBtn = dockButton('connector', 'connector', '连线', 'C', true, () => {
    engine.setTool('connector', { router: engine.lastStyles.connector.router || 'elbow' });
    showFlyout('connector', connectorBtn, (node) => {
      node.appendChild(el('div', 'fsb-flyout__title', '连线样式'));
      const row = el('div', 'fsb-flyout__row');
      [
        { router: 'straight', icon: 'lineStraight', label: '直线' },
        { router: 'elbow', icon: 'lineElbow', label: '折线' },
        { router: 'curve', icon: 'lineCurve', label: '曲线' }
      ].forEach((choice) => {
        const button = el(
          'button',
          `fsb-btn${(engine.lastStyles.connector.router || 'elbow') === choice.router ? ' is-active' : ''}`,
          iconHtml(choice.icon)
        );
        button.type = 'button';
        attachTip(button, choice.label, '', 'top');
        listen(button, 'click', () => {
          engine.lastStyles.connector.router = choice.router;
          engine.setTool('connector', { router: choice.router });
          closeFlyout();
        });
        row.appendChild(button);
      });
      node.appendChild(row);
      const hint = el('div', 'fsb-flyout__title', '悬停图形边缘，拖动蓝点即可快速连线');
      hint.style.margin = '8px 2px 0';
      node.appendChild(hint);
    });
  });

  const penBtn = dockButton('pen', 'pen', '画笔', 'P', true, () => {
    if (!penFamily.includes(engine.tool.id)) engine.setTool('pen');
    showFlyout('pen', penBtn, buildPenFlyout);
  });

  function buildPenFlyout(node) {
    const modeRow = el('div', 'fsb-flyout__row');
    [
      { id: 'pen', icon: 'pen', label: '画笔' },
      { id: 'highlighter', icon: 'highlighter', label: '荧光笔' },
      { id: 'eraser', icon: 'eraser', label: '橡皮擦' }
    ].forEach((mode) => {
      const button = el('button', `fsb-btn${engine.tool.id === mode.id ? ' is-active' : ''}`, iconHtml(mode.icon));
      button.type = 'button';
      attachTip(button, mode.label, '', 'top');
      listen(button, 'click', () => {
        engine.setTool(mode.id);
        closeFlyout();
        showFlyout('pen', penBtn, buildPenFlyout);
      });
      modeRow.appendChild(button);
    });
    node.appendChild(modeRow);

    const activePen = engine.tool.id === 'highlighter' ? 'highlighter' : 'pen';
    if (engine.tool.id !== 'eraser') {
      const widthRow = el('div', 'fsb-flyout__row');
      widthRow.appendChild(el('span', 'fsb-flyout__label', '粗细'));
      const widths = activePen === 'highlighter' ? [8, 12, 18] : [2, 3, 5];
      widths.forEach((width, index) => {
        const dot = el(
          'button',
          `fsb-dot-btn${toFiniteNumber(engine.lastStyles[activePen].strokeWidth) === width ? ' is-active' : ''}`,
          `<i style="width:${5 + index * 3}px;height:${5 + index * 3}px"></i>`
        );
        dot.type = 'button';
        listen(dot, 'click', () => {
          engine.lastStyles[activePen].strokeWidth = width;
          penWidths[activePen] = width;
          closeFlyout();
          showFlyout('pen', penBtn, buildPenFlyout);
        });
        widthRow.appendChild(dot);
      });
      node.appendChild(widthRow);

      const colorGrid = el('div', 'fsb-swatch-grid');
      STROKE_CHOICES.slice(0, 9).forEach((color) => {
        const swatch = el(
          'button',
          `fsb-swatch${engine.lastStyles[activePen].stroke === color ? ' is-active' : ''}`
        );
        swatch.type = 'button';
        swatch.style.background = color;
        listen(swatch, 'click', () => {
          engine.lastStyles[activePen].stroke = color;
          closeFlyout();
          showFlyout('pen', penBtn, buildPenFlyout);
        });
        colorGrid.appendChild(swatch);
      });
      const wrap = el('div', 'fsb-flyout__row');
      wrap.appendChild(colorGrid);
      node.appendChild(wrap);
    }
  }

  dockButton('text', 'text', '文本', 'T', false, () => engine.setTool('text'));

  const fileInput = el('input', 'fsb-hidden-input');
  fileInput.type = 'file';
  fileInput.accept = 'image/*';
  root.appendChild(fileInput);
  dockButton('image', 'image', '图片', '', false, () => fileInput.click());

  listen(fileInput, 'change', () => {
    const file = fileInput.files && fileInput.files[0];
    fileInput.value = '';
    if (file) insertImageFile(file);
  });

  function insertImageFile(file) {
    const reader = new FileReader();
    reader.onload = () => {
      const src = String(reader.result || '');
      if (!src) return;
      const image = new Image();
      image.onload = () => engine.insertImage(src, image.naturalWidth, image.naturalHeight);
      image.onerror = () => engine.insertImage(src, 320, 240);
      image.src = src;
    };
    reader.readAsDataURL(file);
  }

  /* ---------------- 撤销 / 缩放 ---------------- */
  const undoBar = el('div', 'fsb-panel fsb-undobar');
  const undoBtn = el('button', 'fsb-btn', iconHtml('undo'));
  const redoBtn = el('button', 'fsb-btn', iconHtml('redo'));
  undoBtn.type = 'button';
  redoBtn.type = 'button';
  attachTip(undoBtn, '撤销', 'Ctrl+Z', 'top');
  attachTip(redoBtn, '重做', 'Ctrl+Shift+Z', 'top');
  listen(undoBtn, 'click', () => engine.undo());
  listen(redoBtn, 'click', () => engine.redo());
  undoBar.appendChild(undoBtn);
  undoBar.appendChild(redoBtn);
  root.appendChild(undoBar);

  const zoomBar = el('div', 'fsb-panel fsb-zoombar');
  const fitBtn = el('button', 'fsb-btn', iconHtml('fit'));
  fitBtn.type = 'button';
  attachTip(fitBtn, '适应画布', '', 'top');
  listen(fitBtn, 'click', () => engine.zoomToFit());
  const zoomOutBtn = el('button', 'fsb-btn', iconHtml('minus'));
  zoomOutBtn.type = 'button';
  attachTip(zoomOutBtn, '缩小', 'Ctrl+-', 'top');
  listen(zoomOutBtn, 'click', () => engine.zoomOut());
  const zoomValueBtn = el('button', 'fsb-zoombar__value', '100%');
  zoomValueBtn.type = 'button';
  const zoomInBtn = el('button', 'fsb-btn', iconHtml('plus'));
  zoomInBtn.type = 'button';
  attachTip(zoomInBtn, '放大', 'Ctrl+=', 'top');
  listen(zoomInBtn, 'click', () => engine.zoomIn());
  zoomBar.appendChild(fitBtn);
  zoomBar.appendChild(zoomOutBtn);
  zoomBar.appendChild(zoomValueBtn);
  zoomBar.appendChild(zoomInBtn);
  root.appendChild(zoomBar);

  let zoomMenu = null;

  function closeZoomMenu() {
    if (zoomMenu) {
      zoomMenu.remove();
      zoomMenu = null;
    }
  }

  listen(zoomValueBtn, 'click', () => {
    if (zoomMenu) {
      closeZoomMenu();
      return;
    }
    zoomMenu = el('div', 'fsb-panel fsb-zoom-menu');
    [
      { label: '放大', action: () => engine.zoomIn(), shortcut: 'Ctrl +' },
      { label: '缩小', action: () => engine.zoomOut(), shortcut: 'Ctrl -' },
      { label: '缩放至 50%', action: () => engine.setZoom(0.5) },
      { label: '缩放至 100%', action: () => engine.resetZoom(), shortcut: 'Ctrl 0' },
      { label: '缩放至 200%', action: () => engine.setZoom(2) },
      { label: '适应画布', action: () => engine.zoomToFit() }
    ].forEach((item) => {
      const menuItem = el(
        'button',
        'fsb-menu-item',
        `<span>${item.label}</span>${item.shortcut ? `<span class="fsb-menu-shortcut">${item.shortcut}</span>` : ''}`
      );
      menuItem.type = 'button';
      listen(menuItem, 'click', () => {
        item.action();
        closeZoomMenu();
      });
      zoomMenu.appendChild(menuItem);
    });
    root.appendChild(zoomMenu);
  });

  /* ---------------- 上下文工具栏 ---------------- */
  const contextBar = el('div', 'fsb-panel fsb-context');
  contextBar.style.display = 'none';
  root.appendChild(contextBar);
  let contextKey = '';
  let contextPopover = null;

  function closeContextPopover() {
    if (contextPopover) {
      contextPopover.node.remove();
      contextPopover = null;
    }
  }

  function toggleContextPopover(key, anchor, build) {
    if (contextPopover?.key === key) {
      closeContextPopover();
      return;
    }
    closeContextPopover();
    const node = el('div', 'fsb-panel fsb-popover');
    build(node);
    contextBar.appendChild(node);
    const barRect = contextBar.getBoundingClientRect();
    const anchorRect = anchor.getBoundingClientRect();
    node.style.left = `${clamp(anchorRect.left - barRect.left - 4, 0, Math.max(0, barRect.width - node.getBoundingClientRect().width))}px`;
    contextPopover = { key, node };
  }

  function contextButton(icon, label, onClick, options = {}) {
    const button = el('button', `fsb-btn${options.active ? ' is-active' : ''}`, iconHtml(icon));
    button.type = 'button';
    if (options.disabled) button.disabled = true;
    attachTip(button, label, options.shortcut || '', 'top');
    listen(button, 'click', onClick);
    contextBar.appendChild(button);
    return button;
  }

  function swatchGrid(colors, current, onPick, options = {}) {
    const grid = el('div', 'fsb-swatch-grid');
    colors.forEach((color) => {
      const isNone = color === 'none';
      const swatch = el(
        'button',
        `fsb-swatch${isNone ? ' is-none' : ''}${String(current).toLowerCase() === String(color).toLowerCase() ? ' is-active' : ''}`
      );
      swatch.type = 'button';
      if (!isNone) swatch.style.background = color;
      listen(swatch, 'click', () => onPick(color));
      grid.appendChild(swatch);
    });
    return grid;
  }

  function rebuildContextBar(state) {
    closeContextPopover();
    contextBar.innerHTML = '';
    const summary = state.selectionSummary;
    if (!summary || state.editingId || state.pendingChoice || engine.tool.id !== 'select') {
      contextBar.style.display = 'none';
      return;
    }
    contextBar.style.display = 'flex';
    const types = summary.types;
    const only = (type) => types.length === 1 && types[0] === type;
    const has = (type) => types.includes(type);

    // 填充色（形状）
    if (has('geo')) {
      const fillBtn = el(
        'button',
        'fsb-context__swatch',
        `<i style="background:${summary.fill === 'none' ? '#fff' : summary.fill || '#fff'}"></i>`
      );
      fillBtn.type = 'button';
      attachTip(fillBtn, '填充颜色', '', 'top');
      listen(fillBtn, 'click', () => {
        toggleContextPopover('fill', fillBtn, (node) => {
          node.appendChild(
            swatchGrid(FILL_CHOICES, summary.fill, (color) => {
              engine.setSelectionStyle({ fill: color });
            })
          );
        });
      });
      contextBar.appendChild(fillBtn);
    }

    // 便签颜色
    if (only('note')) {
      const noteColorBtn = el('button', 'fsb-context__swatch', `<i style="background:${summary.noteColor || NOTE_PALETTE[0]}"></i>`);
      noteColorBtn.type = 'button';
      attachTip(noteColorBtn, '便签颜色', '', 'top');
      listen(noteColorBtn, 'click', () => {
        toggleContextPopover('note-color', noteColorBtn, (node) => {
          node.appendChild(
            swatchGrid(NOTE_PALETTE, summary.noteColor, (color) => {
              engine.setSelectionStyle({ noteColor: color });
            })
          );
        });
      });
      contextBar.appendChild(noteColorBtn);
    }

    // 边框（形状/连线/画笔）
    if (has('geo') || has('connector') || has('draw')) {
      const strokeBtn = el(
        'button',
        'fsb-context__swatch',
        `<i class="is-stroke" style="border-color:${summary.stroke === 'none' ? '#DEE0E3' : summary.stroke || '#646A73'}"></i>`
      );
      strokeBtn.type = 'button';
      attachTip(strokeBtn, has('geo') ? '边框' : '线条样式', '', 'top');
      listen(strokeBtn, 'click', () => {
        toggleContextPopover('stroke', strokeBtn, (node) => {
          node.appendChild(
            swatchGrid(has('geo') ? [...STROKE_CHOICES, 'none'] : STROKE_CHOICES, summary.stroke, (color) => {
              engine.setSelectionStyle({ stroke: color });
            })
          );
          const widthRow = el('div', 'fsb-flyout__row');
          widthRow.appendChild(el('span', 'fsb-flyout__label', '粗细'));
          STROKE_WIDTH_CHOICES.forEach((width, index) => {
            const dot = el(
              'button',
              `fsb-dot-btn${toFiniteNumber(summary.strokeWidth) === width ? ' is-active' : ''}`,
              `<i style="width:${4 + index * 3}px;height:${4 + index * 3}px"></i>`
            );
            dot.type = 'button';
            listen(dot, 'click', () => engine.setSelectionStyle({ strokeWidth: width }));
            widthRow.appendChild(dot);
          });
          node.appendChild(widthRow);
          const dashRow = el('div', 'fsb-flyout__row');
          dashRow.appendChild(el('span', 'fsb-flyout__label', '样式'));
          [
            { dash: 'solid', icon: 'dashSolid', label: '实线' },
            { dash: 'dashed', icon: 'dashDashed', label: '虚线' },
            { dash: 'dotted', icon: 'dashDotted', label: '点线' }
          ].forEach((choice) => {
            const button = el('button', `fsb-btn${summary.dash === choice.dash ? ' is-active' : ''}`, iconHtml(choice.icon));
            button.type = 'button';
            button.style.width = '28px';
            button.style.height = '28px';
            listen(button, 'click', () => engine.setSelectionStyle({ dash: choice.dash }));
            dashRow.appendChild(button);
          });
          node.appendChild(dashRow);
        });
      });
      contextBar.appendChild(strokeBtn);
    }

    // 连线路由与箭头
    if (only('connector')) {
      [
        { router: 'straight', icon: 'lineStraight', label: '直线' },
        { router: 'elbow', icon: 'lineElbow', label: '折线' },
        { router: 'curve', icon: 'lineCurve', label: '曲线' }
      ].forEach((choice) => {
        contextButton(choice.icon, choice.label, () => engine.setSelectionStyle({ router: choice.router }), {
          active: summary.router === choice.router
        });
      });
      contextBar.appendChild(el('div', 'fsb-context__divider'));
      const arrowState = `${summary.arrowStart === 'arrow' ? 1 : 0}${summary.arrowEnd === 'arrow' ? 1 : 0}`;
      const arrowIcon = arrowState === '11' ? 'arrowBoth' : arrowState === '00' ? 'arrowNone' : 'arrowEnd';
      const arrowBtn = contextButton(arrowIcon, '箭头', () => {
        toggleContextPopover('arrow', arrowBtn, (node) => {
          node.classList.add('fsb-popover--menu');
          [
            { label: '无箭头', start: 'none', end: 'none' },
            { label: '终点箭头', start: 'none', end: 'arrow' },
            { label: '双向箭头', start: 'arrow', end: 'arrow' }
          ].forEach((item) => {
            const menuItem = el('button', 'fsb-menu-item', `<span>${item.label}</span>`);
            menuItem.type = 'button';
            listen(menuItem, 'click', () => {
              engine.setSelectionStyle({ arrowStart: item.start, arrowEnd: item.end });
              closeContextPopover();
            });
            node.appendChild(menuItem);
          });
        });
      });
    }

    // 文本颜色 + 字号
    if (has('geo') || has('note') || has('text') || has('connector')) {
      const textColor = summary.textColor || '#1F2329';
      const textColorBtn = el(
        'button',
        'fsb-context__swatch',
        `<i style="background:${textColor};border-radius:4px"></i>`
      );
      if (has('text') || only('note') || has('geo')) {
        textColorBtn.type = 'button';
        attachTip(textColorBtn, '文字颜色', '', 'top');
        listen(textColorBtn, 'click', () => {
          toggleContextPopover('text-color', textColorBtn, (node) => {
            node.appendChild(
              swatchGrid(TEXT_COLOR_CHOICES, textColor, (color) => {
                engine.setSelectionStyle({ textColor: color });
              })
            );
          });
        });
        contextBar.appendChild(textColorBtn);
      }

      const fontSizeBtn = el('button', 'fsb-context__fontsize', `${toFiniteNumber(summary.fontSize, 14)}`);
      fontSizeBtn.type = 'button';
      attachTip(fontSizeBtn, '字号', '', 'top');
      listen(fontSizeBtn, 'click', () => {
        toggleContextPopover('font-size', fontSizeBtn, (node) => {
          node.classList.add('fsb-popover--menu');
          FONT_SIZE_CHOICES.forEach((size) => {
            const menuItem = el(
              'button',
              'fsb-menu-item',
              `<span>${size}px</span>${toFiniteNumber(summary.fontSize) === size ? iconHtml('check') : ''}`
            );
            menuItem.type = 'button';
            listen(menuItem, 'click', () => {
              engine.setSelectionStyle({ fontSize: size });
              closeContextPopover();
            });
            node.appendChild(menuItem);
          });
        });
      });
      contextBar.appendChild(fontSizeBtn);
    }

    // 多选对齐
    if (state.selectionCount > 1) {
      contextBar.appendChild(el('div', 'fsb-context__divider'));
      const alignBtn = contextButton('alignLeft', '对齐', () => {
        toggleContextPopover('align', alignBtn, (node) => {
          const row1 = el('div', 'fsb-flyout__row');
          const row2 = el('div', 'fsb-flyout__row');
          [
            { mode: 'left', icon: 'alignLeft', label: '左对齐', row: row1 },
            { mode: 'hcenter', icon: 'alignHCenter', label: '水平居中', row: row1 },
            { mode: 'right', icon: 'alignRight', label: '右对齐', row: row1 },
            { mode: 'hdistribute', icon: 'distributeH', label: '水平等距', row: row1 },
            { mode: 'top', icon: 'alignTop', label: '顶对齐', row: row2 },
            { mode: 'vcenter', icon: 'alignVCenter', label: '垂直居中', row: row2 },
            { mode: 'bottom', icon: 'alignBottom', label: '底对齐', row: row2 },
            { mode: 'vdistribute', icon: 'distributeV', label: '垂直等距', row: row2 }
          ].forEach((item) => {
            const button = el('button', 'fsb-btn', iconHtml(item.icon));
            button.type = 'button';
            button.style.width = '28px';
            button.style.height = '28px';
            attachTip(button, item.label, '', 'top');
            listen(button, 'click', () => engine.alignSelection(item.mode));
            item.row.appendChild(button);
          });
          node.appendChild(row1);
          node.appendChild(row2);
        });
      });
    }

    // 层级 / 复制 / 删除
    contextBar.appendChild(el('div', 'fsb-context__divider'));
    contextButton('front', '置于顶层', () => engine.reorderSelection('front'));
    contextButton('back', '置于底层', () => engine.reorderSelection('back'));
    contextButton('duplicate', '创建副本', () => engine.duplicateSelection(), { shortcut: 'Ctrl+D' });
    contextButton('trash', '删除', () => engine.deleteSelection(), { shortcut: 'Del' });
  }

  function positionContextBar(state) {
    if (contextBar.style.display === 'none') return;
    const bounds = state.selectionBounds;
    if (!bounds) {
      contextBar.style.display = 'none';
      return;
    }
    const topLeft = engine.worldToScreen({ x: bounds.x, y: bounds.y });
    const bottomRight = engine.worldToScreen({ x: bounds.x + bounds.w, y: bounds.y + bounds.h });
    const barRect = contextBar.getBoundingClientRect();
    const centerX = (topLeft.x + bottomRight.x) / 2;
    let top = topLeft.y - barRect.height - 14;
    if (top < 8) top = bottomRight.y + 14;
    top = clamp(top, 8, engine.viewport.height - barRect.height - 8);
    const left = clamp(centerX - barRect.width / 2, 8, Math.max(8, engine.viewport.width - barRect.width - 8));
    contextBar.style.left = `${left}px`;
    contextBar.style.top = `${top}px`;
  }

  /* ---------------- 快速连线图形选择 ---------------- */
  let choiceNode = null;

  function syncChoice(state) {
    const pending = state.pendingChoice;
    if (!pending) {
      if (choiceNode) {
        choiceNode.remove();
        choiceNode = null;
      }
      return;
    }
    if (!choiceNode) {
      choiceNode = el('div', 'fsb-panel fsb-choice');
      const head = el('div', 'fsb-choice__head');
      head.appendChild(el('span', 'fsb-choice__title', '选择图形'));
      const closeBtn = el('button', 'fsb-choice__close', iconHtml('close'));
      closeBtn.type = 'button';
      listen(closeBtn, 'click', () => engine.closePendingChoice());
      head.appendChild(closeBtn);
      choiceNode.appendChild(head);
      const grid = el('div', 'fsb-choice__grid');
      CHOICE_TOOLS.forEach((toolDef) => {
        const button = el('button', 'fsb-btn', iconHtml(toolDef.icon));
        button.type = 'button';
        attachTip(button, toolDef.label, '', 'top');
        listen(button, 'click', () => engine.applyPendingChoice(toolDef.id));
        grid.appendChild(button);
      });
      choiceNode.appendChild(grid);
      root.appendChild(choiceNode);
    }
    const rect = choiceNode.getBoundingClientRect();
    const left = clamp(pending.screenPoint.x + 18, 8, Math.max(8, engine.viewport.width - rect.width - 8));
    const top = clamp(pending.screenPoint.y - rect.height / 2, 8, Math.max(8, engine.viewport.height - rect.height - 8));
    choiceNode.style.left = `${left}px`;
    choiceNode.style.top = `${top}px`;
  }

  /* ---------------- 文本编辑覆盖层 ---------------- */
  const editorHost = el('div', 'fsb-editor-host');
  editorHost.style.display = 'none';
  const editorNode = el('div', 'fsb-editor');
  editorNode.contentEditable = 'true';
  editorNode.spellcheck = false;
  editorHost.appendChild(editorNode);
  root.appendChild(editorHost);
  let editorActiveId = '';
  let editorCommitQueued = false;

  function syncEditor(state) {
    const editingId = state.editingId;
    if (!editingId) {
      if (editorActiveId) {
        editorActiveId = '';
        editorHost.style.display = 'none';
        editorNode.blur();
      }
      return;
    }
    const shape = engine.getShapeById(editingId);
    if (!shape) return;
    const isNew = editorActiveId !== editingId;
    editorActiveId = editingId;
    editorHost.style.display = 'flex';
    positionEditor(shape);
    if (isNew) {
      editorNode.textContent = String(shape.props.text || '');
      editorNode.focus();
      const range = document.createRange();
      range.selectNodeContents(editorNode);
      range.collapse(false);
      const sel = window.getSelection();
      sel.removeAllRanges();
      sel.addRange(range);
    }
  }

  function positionEditor(shape) {
    const zoom = engine.camera.zoom;
    editorHost.classList.remove('is-center', 'is-label');
    editorHost.style.transform = '';
    editorHost.style.transformOrigin = 'top left';

    if (shape.type === 'connector') {
      const geometry = getConnectorGeometry(shape, (id) => engine.getShapeById(id));
      const screen = engine.worldToScreen(geometry.labelPoint);
      editorHost.classList.add('is-label');
      editorHost.style.left = `${screen.x - 60 * zoom}px`;
      editorHost.style.top = `${screen.y - 14 * zoom}px`;
      editorHost.style.width = '120px';
      editorHost.style.height = 'auto';
      editorHost.style.transform = `scale(${zoom})`;
      editorNode.style.fontSize = `${toFiniteNumber(shape.props.fontSize, 13)}px`;
      editorNode.style.color = '#41464E';
      editorNode.style.textAlign = 'center';
      return;
    }

    const bounds = getShapeBounds(shape);
    const screen = engine.worldToScreen({ x: bounds.x, y: bounds.y });
    const padding = shape.type === 'note' ? 16 : shape.type === 'text' ? 2 : 12;
    editorHost.style.left = `${screen.x}px`;
    editorHost.style.top = `${screen.y}px`;
    editorHost.style.width = `${bounds.w}px`;
    editorHost.style.height = `${bounds.h}px`;
    editorHost.style.padding = `${padding}px`;
    editorHost.style.boxSizing = 'border-box';
    editorHost.style.transform = `scale(${zoom})`;
    const rotation = toFiniteNumber(shape.rotation);
    if (rotation) {
      // 旋转形状：以形状中心为变换原点
      const center = engine.worldToScreen({ x: bounds.x + bounds.w / 2, y: bounds.y + bounds.h / 2 });
      editorHost.style.left = `${center.x - bounds.w / 2}px`;
      editorHost.style.top = `${center.y - bounds.h / 2}px`;
      editorHost.style.transformOrigin = `${bounds.w / 2}px ${bounds.h / 2}px`;
      editorHost.style.transform = `scale(${zoom}) rotate(${rotation}rad)`;
    }

    const props = shape.props || {};
    if (shape.type === 'geo') {
      editorHost.classList.add('is-center');
      editorNode.style.textAlign = props.align || 'center';
      editorNode.style.color = props.textColor || '#1F2329';
      editorNode.style.fontSize = `${toFiniteNumber(props.fontSize, 14)}px`;
    } else if (shape.type === 'note') {
      editorNode.style.textAlign = 'left';
      editorNode.style.color = props.textColor || '#1F2329';
      editorNode.style.fontSize = `${toFiniteNumber(props.fontSize, 14)}px`;
    } else {
      editorNode.style.textAlign = props.align || 'left';
      editorNode.style.color = props.color || '#1F2329';
      editorNode.style.fontSize = `${toFiniteNumber(props.fontSize, 16)}px`;
    }
  }

  listen(editorNode, 'input', () => {
    if (!editorActiveId) return;
    engine.updateEditingText(editorNode.innerText.replace(/\n$/, ''));
    const shape = engine.getShapeById(editorActiveId);
    if (shape) positionEditor(shape);
  });

  listen(editorNode, 'keydown', (event) => {
    event.stopPropagation();
    if (event.key === 'Escape') {
      event.preventDefault();
      engine.commitEdit();
      root.focus({ preventScroll: true });
    }
  });

  listen(editorNode, 'blur', () => {
    if (editorActiveId && !editorCommitQueued) {
      editorCommitQueued = true;
      window.setTimeout(() => {
        editorCommitQueued = false;
        // 焦点若已回到编辑器（例如短暂被抢占后恢复），不提交
        if (document.activeElement === editorNode) return;
        if (engine.editingId === editorActiveId) engine.commitEdit();
      }, 0);
    }
  });

  listen(editorNode, 'paste', (event) => {
    event.preventDefault();
    const text = event.clipboardData?.getData('text/plain') || '';
    document.execCommand('insertText', false, text);
  });

  /* ---------------- 画布指针 / 滚轮 / 键盘 ---------------- */

  function pointerPosition(event) {
    const rect = canvas.getBoundingClientRect();
    return { x: event.clientX - rect.left, y: event.clientY - rect.top };
  }

  function pointerInfo(event) {
    return {
      button: event.button,
      shiftKey: event.shiftKey,
      altKey: event.altKey,
      ctrlKey: event.ctrlKey || event.metaKey
    };
  }

  // 阻止 mousedown 默认焦点转移：保证画布点击后自动进入文本编辑时焦点不被抢走
  listen(canvas, 'mousedown', (event) => event.preventDefault());

  listen(canvas, 'pointerdown', (event) => {
    if (!engine.editingId) {
      root.focus({ preventScroll: true });
    }
    if (engine.editingId) {
      engine.commitEdit();
      root.focus({ preventScroll: true });
    }
    canvas.setPointerCapture(event.pointerId);
    engine.handlePointerDown(pointerPosition(event), pointerInfo(event));
    if (engine.interaction?.type === 'pan') root.classList.add('is-panning');
    syncCursor();
  });

  listen(canvas, 'pointermove', (event) => {
    engine.handlePointerMove(pointerPosition(event), pointerInfo(event));
    if (!engine.interaction) syncCursor();
  });

  listen(canvas, 'pointerup', (event) => {
    try {
      canvas.releasePointerCapture(event.pointerId);
    } catch {
      /* ignore */
    }
    engine.handlePointerUp(pointerPosition(event), pointerInfo(event));
    root.classList.remove('is-panning');
    syncCursor();
  });

  listen(canvas, 'pointercancel', () => {
    root.classList.remove('is-panning');
    engine.interaction = null;
    engine.marquee = null;
    engine.penStroke = null;
    engine.requestRender();
  });

  listen(canvas, 'dblclick', (event) => {
    engine.handleDoubleClick(pointerPosition(event));
  });

  listen(
    canvas,
    'wheel',
    (event) => {
      event.preventDefault();
      engine.handleWheel(pointerPosition(event), event.deltaX, event.deltaY, event.ctrlKey || event.metaKey, event.shiftKey);
    },
    { passive: false }
  );

  listen(canvas, 'contextmenu', (event) => event.preventDefault());

  listen(root, 'keydown', (event) => {
    if (event.target === editorNode || event.target.isContentEditable) return;
    if (event.key === 'Escape' && (openFlyout || contextPopover || zoomMenu)) {
      closeFlyout();
      closeContextPopover();
      closeZoomMenu();
      event.preventDefault();
      return;
    }
    const handled = engine.handleKeyDown(event);
    if (handled) event.preventDefault();
  });

  listen(root, 'keyup', (event) => {
    if (event.target === editorNode) return;
    engine.handleKeyUp(event);
  });

  listen(root, 'paste', (event) => {
    if (event.target === editorNode || engine.editingId) return;
    const items = event.clipboardData?.items || [];
    for (const item of items) {
      if (item.kind === 'file' && item.type.startsWith('image/')) {
        const file = item.getAsFile();
        if (file) {
          insertImageFile(file);
          event.preventDefault();
          return;
        }
      }
    }
    const text = event.clipboardData?.getData('text/plain');
    if (text && text.trim()) {
      const created = engine.createStencilShapeAtViewportCenter('text');
      const target = engine.getShapeById(created.shapeId);
      if (target) {
        engine.updateEditingText(text.trim());
        engine.commitEdit();
      }
      event.preventDefault();
    }
  });

  function syncCursor() {
    const hover = engine.hover;
    if (engine.tool.id === 'select') {
      if (hover.handleId && RESIZE_CURSORS[hover.handleId]) {
        canvas.style.cursor = RESIZE_CURSORS[hover.handleId];
        return;
      }
      if (hover.anchorId) {
        canvas.style.cursor = 'crosshair';
        return;
      }
      if (hover.shapeId) {
        canvas.style.cursor = 'move';
        return;
      }
    }
    canvas.style.cursor = '';
  }

  /* ---------------- 状态同步 ---------------- */

  function syncDock(state) {
    const toolId = state.tool.id;
    root.dataset.tool = toolId;
    root.classList.toggle('is-space-panning', state.spacePanning);
    dockButtons.forEach((button, id) => {
      let active = false;
      if (id === 'pen') active = penFamily.includes(toolId);
      else active = toolId === id;
      button.classList.toggle('is-active', active);
    });
    undoBtn.disabled = !state.canUndo;
    redoBtn.disabled = !state.canRedo;
    zoomValueBtn.textContent = `${Math.round(state.zoom * 100)}%`;
  }

  const offState = engine.on('state', (state) => {
    syncDock(state);
    const nextKey = JSON.stringify([
      state.selectionIds,
      state.selectionSummary,
      state.editingId,
      state.tool.id,
      Boolean(state.pendingChoice)
    ]);
    if (nextKey !== contextKey) {
      contextKey = nextKey;
      rebuildContextBar(state);
    }
    positionContextBar(state);
    syncChoice(state);
    syncEditor(state);
    syncCursor();
  });
  disposers.push(offState);

  const offEdit = engine.on('edit-start', () => {
    syncEditor(engine.getUiState());
  });
  disposers.push(offEdit);

  /* ---------------- 尺寸 ---------------- */

  let resizeObserver = null;
  if (typeof ResizeObserver === 'function') {
    resizeObserver = new ResizeObserver(() => {
      const rect = root.getBoundingClientRect();
      engine.setViewportSize(rect.width, rect.height);
    });
    resizeObserver.observe(root);
  }
  const initialRect = root.getBoundingClientRect();
  if (initialRect.width > 4 && initialRect.height > 4) {
    engine.setViewportSize(initialRect.width, initialRect.height);
  }

  return {
    root,
    canvas,
    destroy() {
      if (resizeObserver) resizeObserver.disconnect();
      window.clearTimeout(tipTimer);
      disposers.forEach((dispose) => {
        try {
          dispose();
        } catch {
          /* ignore */
        }
      });
      closeFlyout();
      closeContextPopover();
      closeZoomMenu();
      root.remove();
    }
  };
}
