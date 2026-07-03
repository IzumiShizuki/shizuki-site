import fs from 'node:fs/promises';
import { chromium } from 'playwright-core';

const DEFAULT_TIMEOUT_MS = Number(process.env.MUSIC_WEB_AUTH_TIMEOUT_MS || 45000) || 45000;
const DEFAULT_NAV_TIMEOUT_MS = Number(process.env.MUSIC_WEB_AUTH_NAV_TIMEOUT_MS || 60000) || 60000;
const DEFAULT_TIMEZONE = String(process.env.MUSIC_WEB_AUTH_TIMEZONE || 'Asia/Shanghai').trim() || 'Asia/Shanghai';
const DEFAULT_HEADLESS = !['0', 'false', 'no'].includes(
  String(process.env.MUSIC_WEB_AUTH_HEADLESS || 'true').trim().toLowerCase()
);

let browserPromise = null;

function fileExists(targetPath) {
  return fs.access(targetPath).then(() => true).catch(() => false);
}

async function resolveExecutablePath() {
  const explicit = String(
    process.env.MUSIC_WEB_AUTH_BROWSER_PATH
      || process.env.PLAYWRIGHT_EXECUTABLE_PATH
      || process.env.CHROMIUM_EXECUTABLE_PATH
      || ''
  ).trim();
  if (explicit) {
    return explicit;
  }

  const candidates = process.platform === 'win32'
    ? [
        'C:/Program Files (x86)/Microsoft/Edge/Application/msedge.exe',
        'C:/Program Files/Microsoft/Edge/Application/msedge.exe',
        'C:/Program Files/Google/Chrome/Application/chrome.exe',
        'C:/Program Files (x86)/Google/Chrome/Application/chrome.exe'
      ]
    : [
        '/usr/bin/google-chrome',
        '/usr/bin/google-chrome-stable',
        '/usr/bin/chromium',
        '/usr/bin/chromium-browser',
        '/snap/bin/chromium'
      ];

  for (const candidate of candidates) {
    if (await fileExists(candidate)) {
      return candidate;
    }
  }
  return '';
}

async function launchBrowser() {
  const executablePath = await resolveExecutablePath();
  const launchOptions = {
    headless: DEFAULT_HEADLESS,
    args: [
      '--disable-blink-features=AutomationControlled',
      '--no-default-browser-check',
      '--disable-dev-shm-usage'
    ]
  };
  if (executablePath) {
    launchOptions.executablePath = executablePath;
  }
  return chromium.launch(launchOptions);
}

export async function getBrowser() {
  if (!browserPromise) {
    browserPromise = launchBrowser().catch((error) => {
      browserPromise = null;
      throw error;
    });
  }
  return browserPromise;
}

export async function createContext(options = {}) {
  const browser = await getBrowser();
  const context = await browser.newContext({
    ignoreHTTPSErrors: false,
    locale: 'zh-CN',
    timezoneId: options.timezone || DEFAULT_TIMEZONE,
    viewport: { width: 1440, height: 1100 },
    userAgent: options.userAgent || 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36'
  });
  context.setDefaultTimeout(options.timeoutMs ?? DEFAULT_TIMEOUT_MS);
  context.setDefaultNavigationTimeout(options.navigationTimeoutMs ?? DEFAULT_NAV_TIMEOUT_MS);
  return context;
}

export async function createPage(options = {}) {
  const context = await createContext(options);
  const page = await context.newPage();
  page.setDefaultTimeout(options.timeoutMs ?? DEFAULT_TIMEOUT_MS);
  page.setDefaultNavigationTimeout(options.navigationTimeoutMs ?? DEFAULT_NAV_TIMEOUT_MS);
  return { context, page };
}

export async function safeClose(resource) {
  if (!resource || typeof resource.close !== 'function') {
    return;
  }
  await resource.close().catch(() => {});
}

export function normalizeErrorMessage(error, fallback = 'Unexpected music auth error') {
  const message = String(error?.message || error || '').trim();
  return message || fallback;
}
