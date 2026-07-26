// 与 index.html 引导页进度条（window.__shizukiBoot）之间的桥。
// 引导页可能已被移除或不存在（旧缓存页面、测试环境），所以全部静默容错。

export function reportBootStage(stage) {
  try {
    const boot = typeof window !== 'undefined' ? window.__shizukiBoot : null;
    if (boot && typeof boot.report === 'function') {
      boot.report(String(stage || ''));
    }
  } catch {
    // ignore boot progress errors
  }
}

// 应用氛围混音器启动前调用：让加载页正在播放的环境音淡出交棒，避免双重播放
export function handoffBootAmbient() {
  try {
    const boot = typeof window !== 'undefined' ? window.__shizukiBoot : null;
    if (boot && typeof boot.ambientHandoff === 'function') {
      boot.ambientHandoff();
    }
  } catch {
    // ignore boot ambient handoff errors
  }
}
