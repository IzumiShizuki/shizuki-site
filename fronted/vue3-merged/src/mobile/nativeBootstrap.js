import { isNativeAppShell } from '../services/apiBase';

/**
 * 原生 App 专属初始化：状态栏样式、安卓返回键行为。
 * 在网页端为纯 no-op，动态 import 避免把 Capacitor 插件打进网页包。
 */
export async function initNativeShell(router) {
  if (!isNativeAppShell()) return;

  try {
    const { StatusBar, Style } = await import('@capacitor/status-bar');
    await StatusBar.setOverlaysWebView({ overlay: true });
    await StatusBar.setStyle({ style: Style.Dark }).catch(() => {});
  } catch {
    // 状态栏插件不可用时静默跳过
  }

  try {
    const { App } = await import('@capacitor/app');
    App.addListener('backButton', ({ canGoBack }) => {
      const path = router.currentRoute.value.path;
      const atMobileRoot = path === '/m/music' || path === '/m';
      if (atMobileRoot || !canGoBack) {
        App.exitApp();
      } else {
        router.back();
      }
    });
  } catch {
    // App 插件不可用时静默跳过
  }
}
