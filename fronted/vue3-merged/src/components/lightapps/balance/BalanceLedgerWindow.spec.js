import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import BalanceLedgerWindow from './BalanceLedgerWindow.vue';
import { BALANCE_SECTION_SOURCES, releaseBalanceWindowState, setBalanceWindowSection } from './balanceWindowState';

const mocked = vi.hoisted(() => ({
  auth: null,
  createLightAppBalanceAccount: vi.fn(),
  createLightAppBalanceBindSession: vi.fn(),
  createLightAppBalanceDebt: vi.fn(),
  createLightAppBalanceImportJob: vi.fn(),
  createLightAppBalanceRecurringCharge: vi.fn(),
  createLightAppBalanceTransaction: vi.fn(),
  deleteLightAppBalanceAccount: vi.fn(),
  deleteLightAppBalanceDebt: vi.fn(),
  deleteLightAppBalanceRecurringCharge: vi.fn(),
  deleteLightAppBalanceTransaction: vi.fn(),
  getLightAppBalanceAnalytics: vi.fn(),
  getLightAppBalanceBindSession: vi.fn(),
  getLightAppBalanceImportJob: vi.fn(),
  getLightAppBalanceOverview: vi.fn(),
  listLightAppBalanceAccounts: vi.fn(),
  listLightAppBalanceDebts: vi.fn(),
  listLightAppBalanceRecurringCharges: vi.fn(),
  listLightAppBalanceSourceAccountStatus: vi.fn(),
  listLightAppBalanceTransactions: vi.fn(),
  listLightAppFxRates: vi.fn(),
  refreshLightAppFxRates: vi.fn(),
  updateLightAppBalanceAccount: vi.fn(),
  updateLightAppBalanceDebt: vi.fn(),
  updateLightAppBalanceRecurringCharge: vi.fn(),
  updateLightAppBalanceSourceAccount: vi.fn(),
  updateLightAppBalanceTransaction: vi.fn(),
  createLocalEntityId: vi.fn(),
  readGuestLightAppData: vi.fn(),
  readRemoteLightAppCache: vi.fn(),
  updateGuestLightAppData: vi.fn(),
  writeRemoteLightAppCache: vi.fn()
}));

vi.mock('../../../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../../../services/lightAppsApi', () => ({
  createLightAppBalanceAccount: (...args) => mocked.createLightAppBalanceAccount(...args),
  createLightAppBalanceBindSession: (...args) => mocked.createLightAppBalanceBindSession(...args),
  createLightAppBalanceDebt: (...args) => mocked.createLightAppBalanceDebt(...args),
  createLightAppBalanceImportJob: (...args) => mocked.createLightAppBalanceImportJob(...args),
  createLightAppBalanceRecurringCharge: (...args) => mocked.createLightAppBalanceRecurringCharge(...args),
  createLightAppBalanceTransaction: (...args) => mocked.createLightAppBalanceTransaction(...args),
  deleteLightAppBalanceAccount: (...args) => mocked.deleteLightAppBalanceAccount(...args),
  deleteLightAppBalanceDebt: (...args) => mocked.deleteLightAppBalanceDebt(...args),
  deleteLightAppBalanceRecurringCharge: (...args) => mocked.deleteLightAppBalanceRecurringCharge(...args),
  deleteLightAppBalanceTransaction: (...args) => mocked.deleteLightAppBalanceTransaction(...args),
  getLightAppBalanceAnalytics: (...args) => mocked.getLightAppBalanceAnalytics(...args),
  getLightAppBalanceBindSession: (...args) => mocked.getLightAppBalanceBindSession(...args),
  getLightAppBalanceImportJob: (...args) => mocked.getLightAppBalanceImportJob(...args),
  getLightAppBalanceOverview: (...args) => mocked.getLightAppBalanceOverview(...args),
  listLightAppBalanceAccounts: (...args) => mocked.listLightAppBalanceAccounts(...args),
  listLightAppBalanceDebts: (...args) => mocked.listLightAppBalanceDebts(...args),
  listLightAppBalanceRecurringCharges: (...args) => mocked.listLightAppBalanceRecurringCharges(...args),
  listLightAppBalanceSourceAccountStatus: (...args) => mocked.listLightAppBalanceSourceAccountStatus(...args),
  listLightAppBalanceTransactions: (...args) => mocked.listLightAppBalanceTransactions(...args),
  listLightAppFxRates: (...args) => mocked.listLightAppFxRates(...args),
  refreshLightAppFxRates: (...args) => mocked.refreshLightAppFxRates(...args),
  updateLightAppBalanceAccount: (...args) => mocked.updateLightAppBalanceAccount(...args),
  updateLightAppBalanceDebt: (...args) => mocked.updateLightAppBalanceDebt(...args),
  updateLightAppBalanceRecurringCharge: (...args) => mocked.updateLightAppBalanceRecurringCharge(...args),
  updateLightAppBalanceSourceAccount: (...args) => mocked.updateLightAppBalanceSourceAccount(...args),
  updateLightAppBalanceTransaction: (...args) => mocked.updateLightAppBalanceTransaction(...args)
}));

vi.mock('../../../utils/lightAppsDataStore', () => ({
  createLocalEntityId: (...args) => mocked.createLocalEntityId(...args),
  readGuestLightAppData: (...args) => mocked.readGuestLightAppData(...args),
  readRemoteLightAppCache: (...args) => mocked.readRemoteLightAppCache(...args),
  updateGuestLightAppData: (...args) => mocked.updateGuestLightAppData(...args),
  writeRemoteLightAppCache: (...args) => mocked.writeRemoteLightAppCache(...args)
}));

const LightAppTopToolbarStub = {
  name: 'LightAppTopToolbarStub',
  props: ['windowId'],
  template: '<div class="toolbar-stub"><slot /></div>'
};

const CollapsiblePanelStub = {
  name: 'CollapsiblePanelStub',
  props: ['visible', 'tag'],
  template: '<div v-if="visible" class="collapsible-panel-stub"><slot /></div>'
};

function createAuth() {
  return {
    isAuthenticated: ref(true),
    user: ref({ userId: 12 }),
    authorizedFetch: vi.fn(),
    ensureReady: vi.fn().mockResolvedValue(),
    redirectToAuth: vi.fn()
  };
}

function createSourceStatus(provider, overrides = {}) {
  const providerLabelMap = {
    alipay: '支付宝',
    wechat: '微信',
    bankcard: '银行卡'
  };
  return {
    provider,
    providerLabel: providerLabelMap[provider],
    bound: false,
    status: 'UNBOUND',
    targetAccountId: null,
    targetAccountName: '',
    targetCurrencyCode: 'CNY',
    nightlyEnabled: false,
    lastVerifiedAt: '',
    lastSyncedAt: '',
    lastSyncStatus: '',
    lastSyncErrorText: '',
    activeBindSessionId: '',
    activeBindSessionStatus: '',
    activeBindSessionExpiresAt: '',
    updatedAt: '',
    ...overrides
  };
}

function createAnalytics() {
  return {
    baseCurrency: 'CNY',
    range: {
      fromDatetime: '',
      toDatetime: '',
      timeZone: 'Asia/Shanghai'
    },
    summary: {
      incomeTotal: 0,
      expenseTotal: 0,
      netFlow: 0,
      txCount: 0,
      incomeCount: 0,
      expenseCount: 0
    },
    incomeByDay: [],
    expenseByDay: [],
    incomeByCategory: [],
    expenseByCategory: []
  };
}

async function mountWindow(windowId = 7101) {
  releaseBalanceWindowState(windowId);
  setBalanceWindowSection(windowId, BALANCE_SECTION_SOURCES);
  const wrapper = mount(BalanceLedgerWindow, {
    props: { windowId },
    global: {
      stubs: {
        LightAppTopToolbar: LightAppTopToolbarStub,
        CollapsiblePanel: CollapsiblePanelStub
      }
    }
  });
  await flushPromises();
  return wrapper;
}

function findButtonByText(wrapper, text) {
  return wrapper.findAll('button').find((node) => node.text().includes(text));
}

describe('BalanceLedgerWindow source sync UX', () => {
  beforeEach(() => {
    mocked.auth = createAuth();
    for (const value of Object.values(mocked)) {
      if (typeof value?.mockReset === 'function') {
        value.mockReset();
      }
    }
    mocked.auth = createAuth();
    mocked.createLocalEntityId.mockReturnValue(9001);
    mocked.readGuestLightAppData.mockReturnValue({});
    mocked.readRemoteLightAppCache.mockReturnValue({});
    mocked.updateGuestLightAppData.mockImplementation((updater) => (typeof updater === 'function' ? updater({}) : updater));
    mocked.writeRemoteLightAppCache.mockImplementation(() => {});
    mocked.listLightAppBalanceAccounts.mockResolvedValue([]);
    mocked.listLightAppBalanceTransactions.mockResolvedValue([]);
    mocked.listLightAppBalanceDebts.mockResolvedValue([]);
    mocked.listLightAppBalanceRecurringCharges.mockResolvedValue([]);
    mocked.getLightAppBalanceOverview.mockResolvedValue({
      baseCurrency: 'CNY',
      totalBalance: 0,
      totalDebt: 0,
      netAsset: 0,
      calculatedAt: '2026-06-30T00:00:00+08:00'
    });
    mocked.getLightAppBalanceAnalytics.mockResolvedValue(createAnalytics());
    mocked.listLightAppFxRates.mockResolvedValue([]);
    mocked.listLightAppBalanceSourceAccountStatus.mockResolvedValue([
      createSourceStatus('alipay'),
      createSourceStatus('wechat'),
      createSourceStatus('bankcard')
    ]);
    mocked.createLightAppBalanceAccount.mockResolvedValue({
      accountId: 88,
      channelCode: 'alipay',
      channelName: '支付宝',
      accountName: '支付宝余额',
      currencyCode: 'CNY',
      balanceAmount: 0,
      sortNum: 10
    });
    mocked.createLightAppBalanceBindSession.mockResolvedValue({
      provider: 'alipay',
      sessionId: 'bind-001',
      status: 'BOUND',
      qrCodeImageDataUrl: '',
      qrCodePayload: '',
      loginUrl: '',
      failureReason: '',
      expiresAt: ''
    });
    mocked.getLightAppBalanceBindSession.mockResolvedValue({
      provider: 'alipay',
      sessionId: 'bind-001',
      status: 'BOUND'
    });
    mocked.createLightAppBalanceImportJob.mockResolvedValue({
      provider: 'alipay',
      jobId: 'job-001',
      status: 'SUCCESS',
      importedCount: 0,
      duplicateCount: 0,
      skippedCount: 0,
      errorText: ''
    });
  });

  it('renders clearer bind actions for each provider', async () => {
    const wrapper = await mountWindow(7101);

    expect(wrapper.text()).toContain('接通自动记账');
    expect(wrapper.text()).toContain('扫码绑定');
    expect(wrapper.text()).toContain('启用目录导入');
    expect(wrapper.text()).toContain('启用工资卡目录');
  });

  it('auto-creates a local account before starting alipay bind', async () => {
    const wrapper = await mountWindow(7102);

    const bindButton = findButtonByText(wrapper, '扫码绑定');
    expect(bindButton).toBeTruthy();

    await bindButton.trigger('click');
    await flushPromises();

    expect(mocked.createLightAppBalanceAccount).toHaveBeenCalledTimes(1);
    expect(mocked.createLightAppBalanceBindSession).toHaveBeenCalledTimes(1);
    expect(mocked.createLightAppBalanceBindSession).toHaveBeenCalledWith(
      'alipay',
      expect.objectContaining({
        targetAccountId: 88
      }),
      mocked.auth.authorizedFetch
    );
  });
});
