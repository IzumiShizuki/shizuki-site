const RAW_METING_CONSOLE_URL = String(import.meta?.env?.VITE_METING_CONSOLE_URL || '').trim();

function normalizeMetingConsoleUrl(raw) {
  const value = String(raw || '').trim();
  if (!value) return '';

  if (/^https?:\/\//i.test(value)) {
    return value;
  }

  if (value.startsWith('//')) {
    if (typeof window === 'undefined') return '';
    return `${window.location.protocol}${value}`;
  }

  if (value.startsWith('/')) {
    if (typeof window === 'undefined') return '';
    return `${window.location.origin}${value}`;
  }

  return '';
}

export function getMetingConsoleUrl() {
  return normalizeMetingConsoleUrl(RAW_METING_CONSOLE_URL);
}

export function openMetingConsoleWindow() {
  if (typeof window === 'undefined') return false;
  const url = getMetingConsoleUrl();
  if (!url) return false;

  try {
    window.open(url, '_blank', 'noopener,noreferrer');
    return true;
  } catch {
    return false;
  }
}
