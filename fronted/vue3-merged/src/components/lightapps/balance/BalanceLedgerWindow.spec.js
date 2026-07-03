import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import BalanceLedgerWindow from './BalanceLedgerWindow.vue';
import { BALANCE_SECTION_SOURCES, releaseBalanceWindowState, setBalanceWindowSection } from './balanceWindowState';

const mocked = vi.hoisted(() => ({
  auth: null,
  parseQianjiImportFile: vi.fn(),
  createLightAppBalanceAccount: vi.fn(),
  createLightAppBalanceBindSession: vi.fn(),
  createLightAppBalanceLocalSyncImportJob: vi.fn(),
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
  getLocalBalanceCompanionHealth: vi.fn(),
  getLocalBalanceCompanionStatus: vi.fn(),
  scanLocalBalanceCompanion: vi.fn(),
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
  createLightAppBalanceLocalSyncImportJob: (...args) => mocked.createLightAppBalanceLocalSyncImportJob(...args),
  createLightAppBalanceDebt: (...args) => mocked.createLightAppBalanceDebt(...args),
  createLightAppBalanceImportJob: (...args) => mocked.createLightAppBalanceImportJob(...args),
  createLightAppBalanceRecurringCharge: (...args) => mocked.createLightAppBalanceRecurringCharge(...args),
  createLightAppBalanceTransaction: (...args) => mocked.createLightAppBalanceTransaction(...args),
  deleteLightAppBalanceAccount: (...args) => mocked.deleteLightAppBalanceAccount(...args),
  deleteLightAppBalanceDebt: (...args) => mocked.deleteLightAppBalanceDebt(...args),
  deleteLightAppBalanceRecurringCharge: (...args) => mocked.deleteLightAppBalanceRecurringCharge(...args),
  deleteLightAppBalanceTransaction: (...args) => mocked.deleteLightAppBalanceTransaction(...args),
  getLightAppBalanceBindSession: (...args) => mocked.getLightAppBalanceBindSession(...args),
  getLightAppBalanceAnalytics: (...args) => mocked.getLightAppBalanceAnalytics(...args),
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

vi.mock('../../../services/localBalanceCompanionApi', () => ({
  getLocalBalanceCompanionHealth: (...args) => mocked.getLocalBalanceCompanionHealth(...args),
  getLocalBalanceCompanionStatus: (...args) => mocked.getLocalBalanceCompanionStatus(...args),
  scanLocalBalanceCompanion: (...args) => mocked.scanLocalBalanceCompanion(...args)
}));

vi.mock('../../../utils/lightAppsDataStore', () => ({
  createLocalEntityId: (...args) => mocked.createLocalEntityId(...args),
  readGuestLightAppData: (...args) => mocked.readGuestLightAppData(...args),
  readRemoteLightAppCache: (...args) => mocked.readRemoteLightAppCache(...args),
  updateGuestLightAppData: (...args) => mocked.updateGuestLightAppData(...args),
  writeRemoteLightAppCache: (...args) => mocked.writeRemoteLightAppCache(...args)
}));

vi.mock('./qianjiImport', () => ({
  parseQianjiImportFile: (...args) => mocked.parseQianjiImportFile(...args)
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

function createSourceStatus(overrides = {}) {
  return {
    provider: 'qianji',
    providerLabel: '钱迹',
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

async function mountWindow(windowId = 7301) {
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

describe('BalanceLedgerWindow qianji local import', () => {
  beforeEach(() => {
    mocked.auth = createAuth();
    for (const value of Object.values(mocked)) {
      if (typeof value?.mockReset === 'function') {
        value.mockReset();
      }
    }

    mocked.auth = createAuth();
    mocked.readGuestLightAppData.mockReturnValue({});
    mocked.readRemoteLightAppCache.mockReturnValue({});
    mocked.updateGuestLightAppData.mockImplementation((updater) => (typeof updater === 'function' ? updater({}) : updater));
    mocked.writeRemoteLightAppCache.mockImplementation(() => {});
    mocked.listLightAppBalanceAccounts.mockResolvedValue([]);
    mocked.listLightAppBalanceTransactions.mockResolvedValue([]);
    mocked.listLightAppBalanceDebts.mockResolvedValue([]);
    mocked.listLightAppBalanceRecurringCharges.mockResolvedValue([]);
    mocked.listLightAppBalanceSourceAccountStatus.mockResolvedValue([createSourceStatus()]);
    mocked.getLightAppBalanceOverview.mockResolvedValue({
      baseCurrency: 'CNY',
      totalBalance: 0,
      totalDebt: 0,
      netAsset: 0,
      calculatedAt: '2026-07-03T00:00:00+08:00'
    });
    mocked.getLightAppBalanceAnalytics.mockResolvedValue(createAnalytics());
    mocked.listLightAppFxRates.mockResolvedValue([]);
    mocked.createLightAppBalanceAccount.mockResolvedValue({
      accountId: 88,
      channelCode: 'qianji',
      channelName: '钱迹',
      accountName: '钱迹导入账户',
      currencyCode: 'CNY',
      balanceAmount: 0,
      sortNum: 10
    });
    mocked.updateLightAppBalanceSourceAccount.mockResolvedValue(
      createSourceStatus({
        status: 'BOUND',
        bound: true,
        targetAccountId: 88,
        targetAccountName: '钱迹导入账户'
      })
    );
    mocked.createLightAppBalanceLocalSyncImportJob.mockResolvedValue({
      provider: 'qianji',
      jobId: 'job-qianji-001',
      status: 'SUCCESS',
      importedCount: 1,
      duplicateCount: 0,
      skippedCount: 0,
      errorText: ''
    });
    mocked.parseQianjiImportFile.mockResolvedValue({
      sourceLabel: 'qianji-local-import',
      fileName: 'qianji.csv',
      requestFromAt: '2026-07-01T08:00:00',
      requestToAt: '2026-07-02T09:00:00',
      importedCount: 1,
      skippedCount: 0,
      warnings: [],
      transactions: [
        {
          externalId: 'qj-001',
          occurredAt: '2026-07-02T09:00:00',
          direction: 'EXPENSE',
          amount: '25.50',
          currencyCode: 'CNY',
          counterparty: '便利店',
          categoryHint: '餐饮',
          note: '早餐',
          rawPayload: '{"demo":true}',
          digest: 'digest-001'
        }
      ]
    });
  });

  it('renders the qianji-only local import workflow', async () => {
    const wrapper = await mountWindow();

    expect(wrapper.text()).toContain('本地导入');
    expect(wrapper.text()).toContain('选择钱迹导出文件');
    expect(wrapper.text()).toContain('导入钱迹文件');
    expect(wrapper.text()).not.toContain('扫码绑定');
    expect(wrapper.text()).not.toContain('扫码登录');
  });

  it('creates a default local account and uploads parsed qianji transactions', async () => {
    const wrapper = await mountWindow(7302);
    const input = wrapper.find('input[type="file"]');
    const file = new File(['date,amount\n2026-07-02,25.5'], 'qianji.csv', { type: 'text/csv' });

    Object.defineProperty(input.element, 'files', {
      configurable: true,
      value: [file]
    });

    await input.trigger('change');
    await flushPromises();

    expect(mocked.parseQianjiImportFile).toHaveBeenCalledWith(file);

    const importButton = findButtonByText(wrapper, '导入钱迹文件');
    expect(importButton).toBeTruthy();

    await importButton.trigger('click');
    await flushPromises();

    expect(mocked.createLightAppBalanceAccount).toHaveBeenCalledTimes(1);
    expect(mocked.updateLightAppBalanceSourceAccount).toHaveBeenCalledWith(
      'qianji',
      expect.objectContaining({
        targetAccountId: 88,
        nightlyEnabled: false
      }),
      mocked.auth.authorizedFetch
    );
    expect(mocked.createLightAppBalanceLocalSyncImportJob).toHaveBeenCalledWith(
      'qianji',
      expect.objectContaining({
        sourceLabel: 'qianji-local-import',
        rawFileName: 'qianji.csv',
        transactions: [
          expect.objectContaining({
            externalId: 'qj-001',
            direction: 'EXPENSE',
            amount: 25.5
          })
        ]
      }),
      mocked.auth.authorizedFetch
    );
    expect(mocked.createLightAppBalanceBindSession).not.toHaveBeenCalled();
  });
});
