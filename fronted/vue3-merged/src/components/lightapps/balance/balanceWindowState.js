import { reactive } from 'vue';

export const BALANCE_SECTION_OVERVIEW = 'overview';
export const BALANCE_SECTION_ACCOUNTS = 'accounts';
export const BALANCE_SECTION_TRANSACTIONS = 'transactions';
export const BALANCE_SECTION_DEBTS = 'debts';
export const BALANCE_SECTION_RECURRING = 'recurring';

export const BALANCE_SECTION_ITEMS = Object.freeze([
  { code: BALANCE_SECTION_OVERVIEW, label: '总览', iconClass: 'fas fa-chart-pie' },
  { code: BALANCE_SECTION_ACCOUNTS, label: '渠道', iconClass: 'fas fa-wallet' },
  { code: BALANCE_SECTION_TRANSACTIONS, label: '收支', iconClass: 'fas fa-receipt' },
  { code: BALANCE_SECTION_DEBTS, label: '负债', iconClass: 'fas fa-hand-holding-dollar' },
  { code: BALANCE_SECTION_RECURRING, label: '定期', iconClass: 'fas fa-clock-rotate-left' }
]);

const SECTION_SET = new Set(BALANCE_SECTION_ITEMS.map((item) => item.code));
const windowStateMap = new Map();

function normalizeWindowId(windowId) {
  const normalized = Number(windowId);
  if (!Number.isInteger(normalized) || normalized <= 0) {
    return 0;
  }
  return normalized;
}

export function normalizeBalanceSection(code) {
  const normalized = String(code || '').trim().toLowerCase();
  return SECTION_SET.has(normalized) ? normalized : BALANCE_SECTION_OVERVIEW;
}

function createBalanceWindowState() {
  return reactive({
    section: BALANCE_SECTION_OVERVIEW,
    requestSectionChange: null
  });
}

export function resolveBalanceWindowState(windowId) {
  const key = normalizeWindowId(windowId);
  if (!windowStateMap.has(key)) {
    windowStateMap.set(key, createBalanceWindowState());
  }
  return windowStateMap.get(key);
}

export function releaseBalanceWindowState(windowId) {
  const key = normalizeWindowId(windowId);
  windowStateMap.delete(key);
}

export function registerBalanceSectionChangeHandler(windowId, handler) {
  const state = resolveBalanceWindowState(windowId);
  state.requestSectionChange = typeof handler === 'function' ? handler : null;
  return state;
}

export function setBalanceWindowSection(windowId, section) {
  const state = resolveBalanceWindowState(windowId);
  const normalized = normalizeBalanceSection(section);
  if (typeof state.requestSectionChange === 'function') {
    state.requestSectionChange(normalized);
    return state;
  }
  state.section = normalized;
  return state;
}
