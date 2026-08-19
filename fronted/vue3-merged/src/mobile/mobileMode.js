import { isDesktopAppShell, isNativeAppShell } from '../services/apiBase';

export const MOBILE_SHELL_PREF_KEY = 'shizuki.mobileShell.pref.v1';
export const MOBILE_SHELL_PREFS = Object.freeze(['auto', 'mobile', 'desktop']);
const MOBILE_ROUTE_PREFIX = '/m';

export function readMobileShellPreference() {
  if (typeof window === 'undefined') return 'auto';
  try {
    const value = String(window.localStorage.getItem(MOBILE_SHELL_PREF_KEY) || '').trim();
    return MOBILE_SHELL_PREFS.includes(value) ? value : 'auto';
  } catch {
    return 'auto';
  }
}

export function writeMobileShellPreference(pref) {
  if (typeof window === 'undefined') return;
  const value = MOBILE_SHELL_PREFS.includes(pref) ? pref : 'auto';
  try {
    if (value === 'auto') {
      window.localStorage.removeItem(MOBILE_SHELL_PREF_KEY);
    } else {
      window.localStorage.setItem(MOBILE_SHELL_PREF_KEY, value);
    }
  } catch {
    // ignore storage failures
  }
}

export function isPhoneViewport() {
  if (typeof window === 'undefined') return false;
  if (typeof window.matchMedia !== 'function') return false;
  try {
    // 手机 = 触摸为主 + （竖屏窄边 或 横屏矮边）。平板与桌面窄窗口不强制切换。
    const coarse = window.matchMedia('(pointer: coarse)').matches;
    if (!coarse) return false;
    const narrowPortrait = window.matchMedia('(max-width: 767px)').matches;
    const shortLandscape = window.matchMedia('(orientation: landscape) and (max-height: 500px)').matches;
    return narrowPortrait || shortLandscape;
  } catch {
    return false;
  }
}

export function shouldUseMobileShell() {
  if (isDesktopAppShell()) return false;
  if (isNativeAppShell()) return true;
  const pref = readMobileShellPreference();
  if (pref === 'mobile') return true;
  if (pref === 'desktop') return false;
  return isPhoneViewport();
}

export function isMobileShellPath(path) {
  const normalized = String(path || '');
  return normalized === MOBILE_ROUTE_PREFIX || normalized.startsWith(`${MOBILE_ROUTE_PREFIX}/`);
}

/**
 * 桌面路由 -> 移动路由映射。返回空字符串表示该路由没有移动版（保持桌面页面）。
 */
export function mapDesktopPathToMobile(path) {
  const normalized = String(path || '');
  if (isMobileShellPath(normalized)) return '';
  if (normalized === '/music-library' || normalized === '/music-library/' || normalized === '/music-library/music') {
    return '/m/music';
  }
  const playlistMatch = normalized.match(/^\/music-library\/playlist\/([^/]+)\/?$/);
  if (playlistMatch) {
    return `/m/playlist/${playlistMatch[1]}`;
  }
  if (normalized === '/music-library/player') {
    return '/m/music';
  }
  if (normalized === '/auth') return '/m/auth';
  if (normalized === '/profile') return '/m/profile';
  return '';
}

/**
 * 移动路由 -> 桌面路由映射（桌面浏览器误入 /m 时回跳）。
 */
export function mapMobilePathToDesktop(path) {
  const normalized = String(path || '');
  if (!isMobileShellPath(normalized)) return '';
  if (normalized === '/m' || normalized === '/m/' || normalized === '/m/music') {
    return '/music-library/music';
  }
  const playlistMatch = normalized.match(/^\/m\/playlist\/([^/]+)\/?$/);
  if (playlistMatch) {
    return `/music-library/playlist/${playlistMatch[1]}`;
  }
  if (normalized === '/m/search') return '/music-library/music';
  if (normalized === '/m/auth') return '/auth';
  if (normalized === '/m/profile') return '/profile';
  return '/music-library/music';
}
