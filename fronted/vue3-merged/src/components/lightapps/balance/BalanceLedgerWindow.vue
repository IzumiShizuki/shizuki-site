<template>
  <section class="lightapp-window">
    <div class="top-toolbar">
      <button
        class="icon-btn toolbar-btn ripple-trigger"
        type="button"
        :title="showCreateForm ? '收起添加区' : `添加${activeSectionLabel}`"
        :aria-label="showCreateForm ? '收起添加区' : `添加${activeSectionLabel}`"
        @click="toggleCreateForm"
      >
        <i :class="showCreateForm ? 'fas fa-chevron-up' : 'fas fa-plus'" aria-hidden="true"></i>
      </button>

      <span class="toolbar-hint">基准币</span>
      <select v-model="baseCurrency" class="compact-select">
        <option v-for="item in currencyOptions" :key="`base_currency_${item}`" :value="item">
          {{ item }}
        </option>
      </select>
      <button
        class="icon-btn ripple-trigger"
        type="button"
        title="刷新汇率"
        aria-label="刷新汇率"
        :disabled="refreshingFx"
        @click="refreshFx"
      >
        <i :class="refreshingFx ? 'fas fa-spinner fa-spin' : 'fas fa-rotate-right'" aria-hidden="true"></i>
      </button>
    </div>

    <Transition name="panel-collapse">
      <form v-if="showCreateForm" class="create-form" @submit.prevent="submitBySection">
        <template v-if="section === BALANCE_SECTION_ACCOUNTS">
          <input v-model.trim="accountDraft.channelName" type="text" placeholder="渠道名称，例如：微信" />
          <input v-model.trim="accountDraft.channelCode" type="text" placeholder="渠道编码，例如：wechat" />
          <input v-model.trim="accountDraft.accountName" type="text" placeholder="账户名，例如：微信零钱" />
          <select v-model="accountDraft.currencyCode">
            <option v-for="item in currencyOptions" :key="`account_currency_${item}`" :value="item">{{ item }}</option>
          </select>
          <input v-model.number="accountDraft.balanceAmount" type="number" step="0.01" min="0" placeholder="余额" />
        </template>

        <template v-else-if="section === BALANCE_SECTION_TRANSACTIONS">
          <select v-model="transactionDraft.accountId">
            <option value="">不绑定账户</option>
            <option v-for="item in accounts" :key="`transaction_account_${item.accountId}`" :value="String(item.accountId)">
              {{ item.accountName }} ({{ item.currencyCode }})
            </option>
          </select>
          <select v-model="transactionDraft.direction">
            <option value="EXPENSE">支出</option>
            <option value="INCOME">收入</option>
          </select>
          <input v-model.number="transactionDraft.amount" type="number" step="0.01" min="0.01" placeholder="金额" />
          <select v-model="transactionDraft.currencyCode">
            <option v-for="item in currencyOptions" :key="`transaction_currency_${item}`" :value="item">{{ item }}</option>
          </select>
          <input v-model.trim="transactionDraft.category" type="text" placeholder="分类，例如：餐饮/工资" />
          <input v-model="transactionDraft.occurredAt" type="datetime-local" />
          <input v-model.trim="transactionDraft.note" type="text" placeholder="备注（可选）" class="span-2" />
        </template>

        <template v-else-if="section === BALANCE_SECTION_DEBTS">
          <input v-model.trim="debtDraft.title" type="text" placeholder="负债标题，例如：借款-朋友A" />
          <input v-model.trim="debtDraft.creditor" type="text" placeholder="债权方（可选）" />
          <input v-model.number="debtDraft.amount" type="number" step="0.01" min="0.01" placeholder="金额" />
          <select v-model="debtDraft.currencyCode">
            <option v-for="item in currencyOptions" :key="`debt_currency_${item}`" :value="item">{{ item }}</option>
          </select>
          <input v-model="debtDraft.occurredAt" type="datetime-local" />
          <input v-model="debtDraft.dueAt" type="datetime-local" />
          <select v-model="debtDraft.status">
            <option value="OPEN">未结清</option>
            <option value="CLOSED">已结清</option>
          </select>
          <input v-model.trim="debtDraft.note" type="text" placeholder="备注（可选）" class="span-2" />
        </template>

        <template v-else-if="section === BALANCE_SECTION_RECURRING">
          <input v-model.trim="recurringDraft.title" type="text" placeholder="规则标题，例如：水电煤气费" />
          <select v-model="recurringDraft.accountId">
            <option value="">不绑定账户</option>
            <option v-for="item in accounts" :key="`recurring_account_${item.accountId}`" :value="String(item.accountId)">
              {{ item.accountName }} ({{ item.currencyCode }})
            </option>
          </select>
          <input v-model.number="recurringDraft.amount" type="number" step="0.01" min="0.01" placeholder="每次金额" />
          <select v-model="recurringDraft.currencyCode">
            <option v-for="item in currencyOptions" :key="`recurring_currency_${item}`" :value="item">{{ item }}</option>
          </select>
          <input v-model.trim="recurringDraft.category" type="text" placeholder="分类，例如：固定扣费" />
          <input v-model.trim="recurringDraft.cronExpr" type="text" placeholder="Cron，例如：0 0 9 * * *" />
          <input v-model.trim="recurringDraft.timeZoneId" type="text" placeholder="时区，例如：Asia/Shanghai" />
          <input v-model="recurringDraft.startAt" type="datetime-local" />
          <input v-model="recurringDraft.endAt" type="datetime-local" />
          <label class="switch-line"><input v-model="recurringDraft.enabled" type="checkbox" /> 启用规则</label>
          <input v-model.trim="recurringDraft.note" type="text" placeholder="备注（可选）" class="span-2" />
        </template>

        <template v-else>
          <p class="empty-hint">总览模式下仅展示统计。切到“渠道/收支/负债/定期”后可添加数据。</p>
        </template>

        <div class="form-actions">
          <button
            class="icon-btn ripple-trigger"
            type="submit"
            :title="saving ? '保存中' : editingId ? '更新' : '创建'"
            :aria-label="saving ? '保存中' : editingId ? '更新' : '创建'"
            :disabled="saving || !canSubmitCurrentSection"
          >
            <i :class="saving ? 'fas fa-spinner fa-spin' : 'fas fa-check'" aria-hidden="true"></i>
          </button>
          <button v-if="editingId" class="icon-btn ripple-trigger" type="button" title="取消编辑" aria-label="取消编辑" @click="resetEditing">
            <i class="fas fa-xmark" aria-hidden="true"></i>
          </button>
        </div>
      </form>
    </Transition>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>

    <section v-if="section === BALANCE_SECTION_OVERVIEW" class="overview-stack">
      <div class="metrics-strip">
        <article class="metric-card liquid-material">
          <p>账户总余额</p>
          <strong>{{ formatAmount(overview.totalBalance, overview.baseCurrency) }}</strong>
        </article>
        <article class="metric-card liquid-material">
          <p>总负债</p>
          <strong>{{ formatAmount(overview.totalDebt, overview.baseCurrency) }}</strong>
        </article>
        <article class="metric-card liquid-material">
          <p>净资产</p>
          <strong>{{ formatAmount(overview.netAsset, overview.baseCurrency) }}</strong>
        </article>
      </div>

      <article class="filters-bar liquid-material">
        <div class="filters-presets">
          <button class="filter-chip ripple-trigger" type="button" :class="{ active: filterPreset === '7d' }" @click="applyFilterPreset('7d')">7天</button>
          <button class="filter-chip ripple-trigger" type="button" :class="{ active: filterPreset === '30d' }" @click="applyFilterPreset('30d')">30天</button>
          <button class="filter-chip ripple-trigger" type="button" :class="{ active: filterPreset === 'month' }" @click="applyFilterPreset('month')">本月</button>
          <button class="filter-chip ripple-trigger" type="button" :class="{ active: filterPreset === 'custom' }" @click="applyFilterPreset('custom')">自定义</button>
        </div>
        <div class="filters-inputs">
          <input v-model="filterFromDate" type="date" />
          <span>~</span>
          <input v-model="filterToDate" type="date" />
          <select v-model="filterChannelCode">
            <option value="">全部渠道</option>
            <option value="__unbound__">未绑定</option>
            <option v-for="item in channelOptions" :key="`filter_channel_${item.channelCode}`" :value="item.channelCode">{{ item.channelName }}</option>
          </select>
        </div>
      </article>

      <section class="charts-zone">
        <article class="chart-panel liquid-material">
          <header>
            <h4>最近收支趋势</h4>
            <small>{{ analyticsLoading ? '加载中…' : filteredRangeText }}</small>
          </header>
          <div v-if="trendRows.length" class="trend-chart">
            <div v-for="item in trendRows" :key="`trend_${item.day}`" class="trend-row">
              <span>{{ item.day.slice(5) }}</span>
              <div class="trend-bars">
                <div class="bar is-income" :style="{ width: `${safePercent(item.incomeTotal, trendMaxValue)}%` }"></div>
                <div class="bar is-expense" :style="{ width: `${safePercent(item.expenseTotal, trendMaxValue)}%` }"></div>
              </div>
            </div>
          </div>
          <p v-else class="empty-hint">暂无趋势数据</p>
        </article>

        <article class="chart-panel liquid-material">
          <header>
            <h4>渠道收支占比</h4>
            <small>{{ analyticsLoading ? '加载中…' : `${analytics.summary.txCount} 笔` }}</small>
          </header>
          <div v-if="channelRows.length" class="channel-chart">
            <div v-for="item in channelRows" :key="`channel_${item.channelCode}`" class="channel-row">
              <span>{{ item.channelName || item.channelCode || '未知渠道' }}</span>
              <div class="channel-bars">
                <div class="bar is-income" :style="{ width: `${safePercent(item.incomeTotal, channelMaxValue)}%` }"></div>
                <div class="bar is-expense" :style="{ width: `${safePercent(item.expenseTotal, channelMaxValue)}%` }"></div>
              </div>
            </div>
          </div>
          <p v-else class="empty-hint">暂无渠道数据</p>
        </article>

        <article class="chart-panel liquid-material asset-panel">
          <header>
            <h4>资产构成</h4>
            <small>{{ overview.baseCurrency }}</small>
          </header>
          <div class="asset-donut-wrap">
            <div class="asset-donut" :style="{ background: assetChartGradient }"></div>
            <ul class="asset-legend">
              <li><i class="dot balance"></i>余额 {{ formatAmount(assetChart.totalBalance, overview.baseCurrency) }}</li>
              <li><i class="dot debt"></i>负债 {{ formatAmount(assetChart.totalDebt, overview.baseCurrency) }}</li>
              <li><i class="dot net"></i>净资产 {{ formatAmount(assetChart.netAsset, overview.baseCurrency) }}</li>
            </ul>
          </div>
        </article>
      </section>

      <article class="overview-panel liquid-material">
        <header>
          <h4>最新收支</h4>
          <span>{{ filteredTransactions.length }}</span>
        </header>
        <ul v-if="filteredTransactions.length" class="compact-list">
          <li v-for="item in filteredTransactions.slice(0, 8)" :key="`overview_transaction_${item.transactionId}`">
            <span>{{ formatDateTime(item.occurredAt) }}</span>
            <strong :class="item.direction === 'INCOME' ? 'is-income' : 'is-expense'">
              {{ item.direction === 'INCOME' ? '+' : '-' }}{{ formatAmount(item.amount, item.currencyCode) }}
            </strong>
            <small>{{ item.category || '未分类' }}</small>
          </li>
        </ul>
        <p v-else class="empty-hint">暂无收支记录</p>
      </article>

      <article class="overview-panel liquid-material">
        <header>
          <h4>定期扣费</h4>
          <span>{{ recurringCharges.length }}</span>
        </header>
        <ul v-if="recurringCharges.length" class="compact-list">
          <li v-for="item in recurringCharges.slice(0, 8)" :key="`overview_recurring_${item.recurringChargeId}`">
            <span>{{ item.title }}</span>
            <small>{{ accountName(item.accountId) }} - {{ item.cronExpr }}</small>
            <strong>{{ formatAmount(item.amount, item.currencyCode) }}</strong>
          </li>
        </ul>
        <p v-else class="empty-hint">暂无定期规则</p>
      </article>
    </section>

    <ul v-else-if="section === BALANCE_SECTION_ACCOUNTS" class="list-grid">
      <li v-for="item in accounts" :key="`account_${item.accountId}`" class="list-item liquid-material">
        <div class="list-main">
          <p>{{ item.accountName }}</p>
          <small>{{ item.channelName || item.channelCode || '-' }}</small>
        </div>
        <strong>{{ formatAmount(item.balanceAmount, item.currencyCode) }}</strong>
        <div class="list-actions">
          <button class="icon-btn ripple-trigger" type="button" title="编辑" @click="startEditAccount(item)">
            <i class="fas fa-pen" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" type="button" title="删除" @click="removeAccount(item.accountId)">
            <i class="fas fa-trash" aria-hidden="true"></i>
          </button>
        </div>
      </li>
      <p v-if="!accounts.length" class="empty-hint">暂无账户渠道</p>
    </ul>

    <section v-else-if="section === BALANCE_SECTION_TRANSACTIONS" class="ledger-records">
      <article class="filters-bar liquid-material">
        <div class="filters-presets">
          <button class="filter-chip ripple-trigger" type="button" :class="{ active: filterPreset === '7d' }" @click="applyFilterPreset('7d')">7天</button>
          <button class="filter-chip ripple-trigger" type="button" :class="{ active: filterPreset === '30d' }" @click="applyFilterPreset('30d')">30天</button>
          <button class="filter-chip ripple-trigger" type="button" :class="{ active: filterPreset === 'month' }" @click="applyFilterPreset('month')">本月</button>
          <button class="filter-chip ripple-trigger" type="button" :class="{ active: filterPreset === 'custom' }" @click="applyFilterPreset('custom')">自定义</button>
        </div>
        <div class="filters-inputs">
          <input v-model="filterFromDate" type="date" />
          <span>~</span>
          <input v-model="filterToDate" type="date" />
          <select v-model="filterChannelCode">
            <option value="">全部渠道</option>
            <option value="__unbound__">未绑定</option>
            <option v-for="item in channelOptions" :key="`tx_filter_channel_${item.channelCode}`" :value="item.channelCode">{{ item.channelName }}</option>
          </select>
        </div>
      </article>

      <article class="ledger-summary liquid-material">
        <p>{{ filteredRangeText }}</p>
        <div class="ledger-summary-grid">
          <span>总支出 {{ formatAmount(analytics.summary.expenseTotal, analytics.baseCurrency) }}（{{ analytics.summary.expenseCount }} 笔）</span>
          <span>总收入 {{ formatAmount(analytics.summary.incomeTotal, analytics.baseCurrency) }}（{{ analytics.summary.incomeCount }} 笔）</span>
          <span>净流入 {{ formatAmount(analytics.summary.netFlow, analytics.baseCurrency) }}（共 {{ analytics.summary.txCount }} 笔）</span>
        </div>
      </article>

      <ul class="list-grid">
      <li v-for="item in filteredTransactions" :key="`transaction_${item.transactionId}`" class="list-item liquid-material">
        <div class="list-main">
          <p>{{ item.category || '未分类' }}</p>
          <small>{{ accountName(item.accountId) }} · {{ formatDateTime(item.occurredAt) }}</small>
        </div>
        <strong :class="item.direction === 'INCOME' ? 'is-income' : 'is-expense'">
          {{ item.direction === 'INCOME' ? '+' : '-' }}{{ formatAmount(item.amount, item.currencyCode) }}
        </strong>
        <div class="list-actions">
          <button class="icon-btn ripple-trigger" type="button" title="编辑" @click="startEditTransaction(item)">
            <i class="fas fa-pen" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" type="button" title="删除" @click="removeTransaction(item.transactionId)">
            <i class="fas fa-trash" aria-hidden="true"></i>
          </button>
        </div>
      </li>
      <p v-if="!filteredTransactions.length" class="empty-hint">暂无收支记录</p>
      </ul>
    </section>

    <ul v-else-if="section === BALANCE_SECTION_DEBTS" class="list-grid">
      <li v-for="item in debts" :key="`debt_${item.debtId}`" class="list-item liquid-material">
        <div class="list-main">
          <p>{{ item.title }}</p>
          <small>{{ item.creditor || '未填写债权方' }} · {{ formatDateTime(item.occurredAt) }}</small>
        </div>
        <strong :class="item.status === 'CLOSED' ? 'is-income' : 'is-expense'">
          {{ formatAmount(item.amount, item.currencyCode) }}
        </strong>
        <div class="list-actions">
          <button class="icon-btn ripple-trigger" type="button" title="编辑" @click="startEditDebt(item)">
            <i class="fas fa-pen" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" type="button" title="删除" @click="removeDebt(item.debtId)">
            <i class="fas fa-trash" aria-hidden="true"></i>
          </button>
        </div>
      </li>
      <p v-if="!debts.length" class="empty-hint">暂无负债条目</p>
    </ul>

    <ul v-else-if="section === BALANCE_SECTION_RECURRING" class="list-grid">
      <li v-for="item in recurringCharges" :key="`recurring_${item.recurringChargeId}`" class="list-item liquid-material">
        <div class="list-main">
          <p>{{ item.title }}</p>
          <small>{{ accountName(item.accountId) }} - {{ item.cronExpr }} ({{ item.timeZoneId }})</small>
        </div>
        <strong>{{ formatAmount(item.amount, item.currencyCode) }}</strong>
        <div class="list-actions">
          <button class="icon-btn ripple-trigger" type="button" :title="item.enabled ? '停用规则' : '启用规则'" @click="toggleRecurringEnabled(item)">
            <i :class="item.enabled ? 'fas fa-pause' : 'fas fa-play'" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" type="button" title="编辑" @click="startEditRecurring(item)">
            <i class="fas fa-pen" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" type="button" title="删除" @click="removeRecurring(item.recurringChargeId)">
            <i class="fas fa-trash" aria-hidden="true"></i>
          </button>
        </div>
      </li>
      <p v-if="!recurringCharges.length" class="empty-hint">暂无定期扣费规则</p>
    </ul>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  createLightAppBalanceAccount,
  createLightAppBalanceDebt,
  createLightAppBalanceRecurringCharge,
  createLightAppBalanceTransaction,
  deleteLightAppBalanceAccount,
  deleteLightAppBalanceDebt,
  deleteLightAppBalanceRecurringCharge,
  deleteLightAppBalanceTransaction,
  getLightAppBalanceAnalytics,
  getLightAppBalanceOverview,
  listLightAppBalanceAccounts,
  listLightAppBalanceDebts,
  listLightAppBalanceRecurringCharges,
  listLightAppBalanceTransactions,
  listLightAppFxRates,
  refreshLightAppFxRates,
  updateLightAppBalanceAccount,
  updateLightAppBalanceDebt,
  updateLightAppBalanceRecurringCharge,
  updateLightAppBalanceTransaction
} from '../../../services/lightAppsApi';
import {
  buildLedgerRangeQuery,
  buildLocalBalanceAnalytics,
  normalizeLedgerFilter,
  resolvePresetRange
} from './balanceAnalyticsUtils';
import {
  createLocalEntityId,
  readGuestLightAppData,
  readRemoteLightAppCache,
  updateGuestLightAppData,
  writeRemoteLightAppCache
} from '../../../utils/lightAppsDataStore';
import {
  BALANCE_SECTION_ACCOUNTS,
  BALANCE_SECTION_DEBTS,
  BALANCE_SECTION_ITEMS,
  BALANCE_SECTION_OVERVIEW,
  BALANCE_SECTION_RECURRING,
  BALANCE_SECTION_TRANSACTIONS,
  normalizeBalanceSection,
  registerBalanceSectionChangeHandler,
  resolveBalanceWindowState
} from './balanceWindowState';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const auth = useAuthSession();
const balanceState = resolveBalanceWindowState(props.windowId);

const section = computed({
  get() {
    return normalizeBalanceSection(balanceState.section);
  },
  set(value) {
    balanceState.section = normalizeBalanceSection(value);
  }
});

const accounts = ref([]);
const transactions = ref([]);
const debts = ref([]);
const recurringCharges = ref([]);
const fxRates = ref([]);
const overview = ref({
  baseCurrency: 'CNY',
  totalBalance: 0,
  totalDebt: 0,
  netAsset: 0,
  calculatedAt: ''
});
const analytics = ref({
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
    incomeCount: 0,
    expenseCount: 0,
    txCount: 0
  },
  assetSnapshot: {
    totalBalance: 0,
    totalDebt: 0,
    netAsset: 0
  },
  dailyTrend: [],
  channelBreakdown: []
});

const baseCurrency = ref('CNY');
const showCreateForm = ref(false);
const editingId = ref(0);
const saving = ref(false);
const refreshingFx = ref(false);
const analyticsLoading = ref(false);
const errorText = ref('');

const filterPreset = ref('30d');
const filterFromDate = ref('');
const filterToDate = ref('');
const filterChannelCode = ref('');
const filterAccountId = ref('');
const filterDirection = ref('');

let filterRefreshTimer = 0;

const accountDraft = reactive({
  channelName: '',
  channelCode: '',
  accountName: '',
  currencyCode: 'CNY',
  balanceAmount: ''
});

const transactionDraft = reactive({
  accountId: '',
  direction: 'EXPENSE',
  amount: '',
  currencyCode: 'CNY',
  category: '',
  note: '',
  occurredAt: ''
});

const debtDraft = reactive({
  title: '',
  creditor: '',
  amount: '',
  currencyCode: 'CNY',
  occurredAt: '',
  dueAt: '',
  status: 'OPEN',
  note: ''
});

const recurringDraft = reactive({
  accountId: '',
  title: '',
  amount: '',
  currencyCode: 'CNY',
  category: '',
  note: '',
  cronExpr: '0 0 9 * * *',
  timeZoneId: 'Asia/Shanghai',
  startAt: '',
  endAt: '',
  enabled: true
});

const activeSectionLabel = computed(() => {
  const matched = BALANCE_SECTION_ITEMS.find((item) => item.code === section.value);
  return matched?.label || '项目';
});

const currencyOptions = computed(() => {
  const seed = ['CNY', 'USD', 'EUR', 'JPY', 'HKD', baseCurrency.value || 'CNY'];
  const dynamic = [
    ...accounts.value.map((item) => item.currencyCode),
    ...transactions.value.map((item) => item.currencyCode),
    ...debts.value.map((item) => item.currencyCode),
    ...recurringCharges.value.map((item) => item.currencyCode),
    ...fxRates.value.map((item) => item.quoteCurrency)
  ];
  return Array.from(new Set([...seed, ...dynamic].map((item) => String(item || '').trim().toUpperCase()).filter(Boolean))).sort();
});

const channelOptions = computed(() => {
  const map = new Map();
  accounts.value.forEach((item) => {
    const code = String(item?.channelCode || '').trim().toLowerCase();
    const name = String(item?.channelName || item?.channelCode || '').trim();
    if (!code) return;
    if (!map.has(code)) {
      map.set(code, {
        channelCode: code,
        channelName: name || code
      });
    }
  });
  return Array.from(map.values()).sort((left, right) => left.channelName.localeCompare(right.channelName));
});

const normalizedFilter = computed(() => normalizeLedgerFilter({
  preset: filterPreset.value,
  fromDate: filterFromDate.value,
  toDate: filterToDate.value,
  timeZone: 'Asia/Shanghai',
  channelCode: filterChannelCode.value,
  accountId: filterAccountId.value,
  direction: filterDirection.value
}));

const ledgerRangeQuery = computed(() => buildLedgerRangeQuery(normalizedFilter.value));

const filteredTransactions = computed(() => {
  const range = ledgerRangeQuery.value;
  const startTs = Date.parse(range.fromDatetime || '');
  const endTs = Date.parse(range.toDatetime || '');
  const hasRange = Number.isFinite(startTs) && Number.isFinite(endTs) && endTs >= startTs;
  const filter = normalizedFilter.value;

  return transactions.value.filter((item) => {
    const ts = Date.parse(item?.occurredAt || '');
    if (hasRange && (!Number.isFinite(ts) || ts < startTs || ts > endTs)) {
      return false;
    }
    if (filter.direction && String(item?.direction || '').toUpperCase() !== filter.direction) {
      return false;
    }
    if (filter.accountId && Number(item?.accountId || 0) !== Number(filter.accountId)) {
      return false;
    }
    if (filter.channelCode) {
      if (filter.channelCode === '__unbound__') {
        return !item?.accountId;
      }
      const account = accounts.value.find((entry) => Number(entry.accountId) === Number(item?.accountId || 0));
      const channelCode = String(account?.channelCode || '').trim().toLowerCase();
      if (channelCode !== filter.channelCode) {
        return false;
      }
    }
    return true;
  });
});

const filteredRangeText = computed(() => {
  const filter = normalizedFilter.value;
  const channelText = filter.channelCode
    ? (filter.channelCode === '__unbound__'
      ? '未绑定渠道'
      : (channelOptions.value.find((item) => item.channelCode === filter.channelCode)?.channelName || filter.channelCode))
    : '全部渠道';
  return `${filter.fromDate || '-'} ~ ${filter.toDate || '-'} · ${channelText}`;
});

const trendRows = computed(() => Array.isArray(analytics.value?.dailyTrend) ? analytics.value.dailyTrend : []);
const trendMaxValue = computed(() =>
  Math.max(
    1,
    ...trendRows.value.map((item) => Math.max(Math.abs(Number(item?.incomeTotal || 0)), Math.abs(Number(item?.expenseTotal || 0))))
  )
);

const channelRows = computed(() => Array.isArray(analytics.value?.channelBreakdown) ? analytics.value.channelBreakdown : []);
const channelMaxValue = computed(() =>
  Math.max(1, ...channelRows.value.map((item) => Math.max(Math.abs(Number(item?.incomeTotal || 0)), Math.abs(Number(item?.expenseTotal || 0)))))
);

const assetChart = computed(() => {
  const snapshot = analytics.value?.assetSnapshot || {};
  const totalBalance = Math.max(0, Number(snapshot.totalBalance || 0));
  const totalDebt = Math.max(0, Number(snapshot.totalDebt || 0));
  const netAsset = Math.max(0, Number(snapshot.netAsset || 0));
  const total = Math.max(1, totalBalance + totalDebt + netAsset);
  return {
    totalBalance,
    totalDebt,
    netAsset,
    balanceRate: (totalBalance / total) * 100,
    debtRate: (totalDebt / total) * 100,
    netAssetRate: (netAsset / total) * 100
  };
});

const assetChartGradient = computed(() => {
  const balanceRate = Math.max(0, Number(assetChart.value.balanceRate || 0));
  const debtRate = Math.max(0, Number(assetChart.value.debtRate || 0));
  const firstStop = Math.min(100, balanceRate);
  const secondStop = Math.min(100, firstStop + debtRate);
  return `conic-gradient(
    rgba(98, 163, 255, 0.9) 0% ${firstStop}%,
    rgba(228, 111, 143, 0.9) ${firstStop}% ${secondStop}%,
    rgba(112, 198, 147, 0.9) ${secondStop}% 100%
  )`;
});

const canSubmitCurrentSection = computed(() => {
  if (section.value === BALANCE_SECTION_ACCOUNTS) {
    return !!accountDraft.channelName.trim() && !!accountDraft.channelCode.trim() && !!accountDraft.accountName.trim();
  }
  if (section.value === BALANCE_SECTION_TRANSACTIONS) {
    return Number(transactionDraft.amount) > 0 && !!toIsoString(transactionDraft.occurredAt);
  }
  if (section.value === BALANCE_SECTION_DEBTS) {
    return !!debtDraft.title.trim() && Number(debtDraft.amount) > 0 && !!toIsoString(debtDraft.occurredAt);
  }
  if (section.value === BALANCE_SECTION_RECURRING) {
    return !!recurringDraft.title.trim() && Number(recurringDraft.amount) > 0 && !!recurringDraft.cronExpr.trim();
  }
  return false;
});

function toIsoString(input) {
  const source = String(input || '').trim();
  if (!source) return '';
  const ts = Date.parse(source);
  if (!Number.isFinite(ts)) return '';
  return new Date(ts).toISOString();
}

function toLocalInput(iso) {
  const ts = Date.parse(iso || '');
  if (!Number.isFinite(ts)) return '';
  const date = new Date(ts);
  const pad = (value) => String(value).padStart(2, '0');
  return `${date.getFullYear()}-${pad(date.getMonth() + 1)}-${pad(date.getDate())}T${pad(date.getHours())}:${pad(
    date.getMinutes()
  )}`;
}

function formatDateTime(iso) {
  const ts = Date.parse(iso || '');
  if (!Number.isFinite(ts)) return '-';
  const date = new Date(ts);
  return `${date.getMonth() + 1}/${date.getDate()} ${String(date.getHours()).padStart(2, '0')}:${String(
    date.getMinutes()
  ).padStart(2, '0')}`;
}

function formatAmount(amount, currency) {
  const normalized = Number(amount);
  const safe = Number.isFinite(normalized) ? normalized : 0;
  const code = String(currency || baseCurrency.value || 'CNY').toUpperCase();
  return `${safe.toFixed(2)} ${code}`;
}

function applyFilterPreset(preset) {
  const normalized = String(preset || '30d').trim().toLowerCase() || '30d';
  filterPreset.value = normalized;
  if (normalized === 'custom') return;
  const range = resolvePresetRange(normalized, new Date());
  filterFromDate.value = range.fromDate;
  filterToDate.value = range.toDate;
}

function safePercent(value, max) {
  const numerator = Number(value);
  const denominator = Number(max);
  if (!Number.isFinite(numerator) || !Number.isFinite(denominator) || denominator <= 0) {
    return 0;
  }
  return Math.max(0, Math.min(100, (numerator / denominator) * 100));
}

async function refreshAnalyticsData() {
  analyticsLoading.value = true;
  try {
    await auth.ensureReady();
    const range = ledgerRangeQuery.value;
    const filter = normalizedFilter.value;
    const payload = {
      baseCurrency: baseCurrency.value,
      fromDatetime: range.fromDatetime,
      toDatetime: range.toDatetime,
      timeZone: range.timeZone,
      channelCode: filter.channelCode || '',
      accountId: filter.accountId || null
    };
    if (auth.isAuthenticated.value) {
      analytics.value = await getLightAppBalanceAnalytics(payload, auth.authorizedFetch);
      return;
    }
    analytics.value = buildLocalBalanceAnalytics({
      ...payload,
      direction: filter.direction || '',
      accounts: accounts.value,
      transactions: transactions.value,
      debts: debts.value,
      fxRates: fxRates.value
    });
  } catch (error) {
    analytics.value = buildLocalBalanceAnalytics({
      baseCurrency: baseCurrency.value,
      fromDatetime: ledgerRangeQuery.value.fromDatetime,
      toDatetime: ledgerRangeQuery.value.toDatetime,
      timeZone: ledgerRangeQuery.value.timeZone,
      channelCode: normalizedFilter.value.channelCode || '',
      accountId: normalizedFilter.value.accountId || null,
      direction: normalizedFilter.value.direction || '',
      accounts: accounts.value,
      transactions: transactions.value,
      debts: debts.value,
      fxRates: fxRates.value
    });
    errorText.value = error?.message || '账单统计加载失败';
  } finally {
    analyticsLoading.value = false;
  }
}

function queueAnalyticsRefresh() {
  if (filterRefreshTimer) {
    window.clearTimeout(filterRefreshTimer);
  }
  filterRefreshTimer = window.setTimeout(() => {
    filterRefreshTimer = 0;
    void refreshAnalyticsData();
  }, 220);
}

function sortBySortNumAndId(items, key) {
  return (Array.isArray(items) ? items : []).slice().sort((left, right) => {
    const leftSort = Number(left?.sortNum) || 0;
    const rightSort = Number(right?.sortNum) || 0;
    if (leftSort !== rightSort) return leftSort - rightSort;
    return (Number(left?.[key]) || 0) - (Number(right?.[key]) || 0);
  });
}

function sortTransactions(items) {
  return (Array.isArray(items) ? items : []).slice().sort((left, right) => {
    const leftTime = Date.parse(left?.occurredAt || '') || 0;
    const rightTime = Date.parse(right?.occurredAt || '') || 0;
    if (leftTime !== rightTime) return rightTime - leftTime;
    const leftSort = Number(left?.sortNum) || 0;
    const rightSort = Number(right?.sortNum) || 0;
    if (leftSort !== rightSort) return rightSort - leftSort;
    return (Number(right?.transactionId) || 0) - (Number(left?.transactionId) || 0);
  });
}

function accountName(accountId) {
  const normalized = Number(accountId);
  if (!Number.isInteger(normalized) || normalized <= 0) return '未绑定账户';
  const matched = accounts.value.find((item) => item.accountId === normalized);
  return matched?.accountName || `账户#${normalized}`;
}

function normalizeRateMap(list) {
  const map = new Map();
  (Array.isArray(list) ? list : []).forEach((item) => {
    const quote = String(item?.quoteCurrency || '').toUpperCase();
    const rate = Number(item?.rate);
    if (!quote || !Number.isFinite(rate) || rate <= 0) return;
    map.set(quote, rate);
  });
  return map;
}

function convertAmountByRates(amount, currencyCode, targetBase, rateMap) {
  const rawAmount = Number(amount);
  if (!Number.isFinite(rawAmount)) return 0;
  const sourceCurrency = String(currencyCode || targetBase).toUpperCase();
  if (sourceCurrency === targetBase) return rawAmount;
  const rate = Number(rateMap.get(sourceCurrency));
  if (!Number.isFinite(rate) || rate <= 0) return rawAmount;
  return rawAmount / rate;
}

function rebuildGuestOverview() {
  const targetBase = String(baseCurrency.value || 'CNY').toUpperCase();
  const rateMap = normalizeRateMap(fxRates.value);
  rateMap.set(targetBase, 1);
  const totalBalance = accounts.value.reduce(
    (sum, item) => sum + convertAmountByRates(item.balanceAmount, item.currencyCode, targetBase, rateMap),
    0
  );
  const totalDebt = debts.value
    .filter((item) => String(item.status || 'OPEN').toUpperCase() === 'OPEN')
    .reduce((sum, item) => sum + convertAmountByRates(item.amount, item.currencyCode, targetBase, rateMap), 0);
  overview.value = {
    baseCurrency: targetBase,
    totalBalance: Number(totalBalance.toFixed(4)),
    totalDebt: Number(totalDebt.toFixed(4)),
    netAsset: Number((totalBalance - totalDebt).toFixed(4)),
    calculatedAt: new Date().toISOString()
  };
}

function persistGuest(patch = {}) {
  const nextAccounts = sortBySortNumAndId(patch.balanceAccounts ?? accounts.value, 'accountId');
  const nextTransactions = sortTransactions(patch.balanceTransactions ?? transactions.value);
  const nextDebts = sortBySortNumAndId(patch.balanceDebts ?? debts.value, 'debtId');
  const nextRecurring = sortBySortNumAndId(patch.balanceRecurringCharges ?? recurringCharges.value, 'recurringChargeId');
  const nextFxRates = sortBySortNumAndId(patch.balanceFxRates ?? fxRates.value, 'quoteCurrency');

  accounts.value = nextAccounts;
  transactions.value = nextTransactions;
  debts.value = nextDebts;
  recurringCharges.value = nextRecurring;
  fxRates.value = nextFxRates;
  rebuildGuestOverview();

  updateGuestLightAppData((current) => ({
    ...current,
    balanceAccounts: accounts.value,
    balanceTransactions: transactions.value,
    balanceDebts: debts.value,
    balanceRecurringCharges: recurringCharges.value,
    balanceFxRates: fxRates.value,
    balanceOverview: overview.value
  }));

  void refreshAnalyticsData();
}

async function loadRemoteAll() {
  const currentBase = String(baseCurrency.value || 'CNY').toUpperCase();
  const [accountList, transactionList, debtList, recurringList, overviewData, rates] = await Promise.all([
    listLightAppBalanceAccounts(auth.authorizedFetch),
    listLightAppBalanceTransactions(auth.authorizedFetch),
    listLightAppBalanceDebts(auth.authorizedFetch),
    listLightAppBalanceRecurringCharges(auth.authorizedFetch),
    getLightAppBalanceOverview(currentBase, auth.authorizedFetch),
    listLightAppFxRates(currentBase, auth.authorizedFetch)
  ]);

  accounts.value = sortBySortNumAndId(accountList, 'accountId');
  transactions.value = sortTransactions(transactionList);
  debts.value = sortBySortNumAndId(debtList, 'debtId');
  recurringCharges.value = sortBySortNumAndId(recurringList, 'recurringChargeId');
  overview.value = overviewData || overview.value;
  fxRates.value = sortBySortNumAndId(rates, 'quoteCurrency');
  if (overview.value?.baseCurrency) {
    baseCurrency.value = String(overview.value.baseCurrency).toUpperCase();
  }

  writeRemoteLightAppCache({
    balanceAccounts: accounts.value,
    balanceTransactions: transactions.value,
    balanceDebts: debts.value,
    balanceRecurringCharges: recurringCharges.value,
    balanceOverview: overview.value,
    balanceFxRates: fxRates.value
  });

  await refreshAnalyticsData();
}

async function hydrate() {
  errorText.value = '';
  await auth.ensureReady();

  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    accounts.value = sortBySortNumAndId(guest.balanceAccounts || guest.balance_accounts || [], 'accountId');
    transactions.value = sortTransactions(guest.balanceTransactions || guest.balance_transactions || []);
    debts.value = sortBySortNumAndId(guest.balanceDebts || guest.balance_debts || [], 'debtId');
    recurringCharges.value = sortBySortNumAndId(
      guest.balanceRecurringCharges || guest.balance_recurring_charges || [],
      'recurringChargeId'
    );
    fxRates.value = sortBySortNumAndId(guest.balanceFxRates || guest.balance_fx_rates || [], 'quoteCurrency');
    const cachedOverview = guest.balanceOverview || guest.balance_overview;
    if (cachedOverview && typeof cachedOverview === 'object') {
      overview.value = {
        baseCurrency: String(cachedOverview.baseCurrency || cachedOverview.base_currency || 'CNY').toUpperCase(),
        totalBalance: Number(cachedOverview.totalBalance ?? cachedOverview.total_balance) || 0,
        totalDebt: Number(cachedOverview.totalDebt ?? cachedOverview.total_debt) || 0,
        netAsset: Number(cachedOverview.netAsset ?? cachedOverview.net_asset) || 0,
        calculatedAt: cachedOverview.calculatedAt || cachedOverview.calculated_at || ''
      };
    }
    baseCurrency.value = String(overview.value.baseCurrency || 'CNY').toUpperCase();
    rebuildGuestOverview();
    await refreshAnalyticsData();
    return;
  }

  try {
    await loadRemoteAll();
  } catch (error) {
    const cache = readRemoteLightAppCache();
    accounts.value = sortBySortNumAndId(cache.balanceAccounts || [], 'accountId');
    transactions.value = sortTransactions(cache.balanceTransactions || []);
    debts.value = sortBySortNumAndId(cache.balanceDebts || [], 'debtId');
    recurringCharges.value = sortBySortNumAndId(cache.balanceRecurringCharges || [], 'recurringChargeId');
    fxRates.value = sortBySortNumAndId(cache.balanceFxRates || [], 'quoteCurrency');
    const cacheOverview = cache.balanceOverview || {};
    overview.value = {
      baseCurrency: String(cacheOverview.baseCurrency || 'CNY').toUpperCase(),
      totalBalance: Number(cacheOverview.totalBalance) || 0,
      totalDebt: Number(cacheOverview.totalDebt) || 0,
      netAsset: Number(cacheOverview.netAsset) || 0,
      calculatedAt: cacheOverview.calculatedAt || ''
    };
    baseCurrency.value = overview.value.baseCurrency || 'CNY';
    errorText.value = error?.message || '余额轻应用加载失败，已回退本地缓存。';
    await refreshAnalyticsData();
  }
}

function toggleCreateForm() {
  showCreateForm.value = !showCreateForm.value;
  if (!showCreateForm.value) {
    resetEditing();
  }
}

function resetAccountDraft() {
  accountDraft.channelName = '';
  accountDraft.channelCode = '';
  accountDraft.accountName = '';
  accountDraft.currencyCode = baseCurrency.value || 'CNY';
  accountDraft.balanceAmount = '';
}

function resetTransactionDraft() {
  transactionDraft.accountId = '';
  transactionDraft.direction = 'EXPENSE';
  transactionDraft.amount = '';
  transactionDraft.currencyCode = baseCurrency.value || 'CNY';
  transactionDraft.category = '';
  transactionDraft.note = '';
  transactionDraft.occurredAt = '';
}

function resetDebtDraft() {
  debtDraft.title = '';
  debtDraft.creditor = '';
  debtDraft.amount = '';
  debtDraft.currencyCode = baseCurrency.value || 'CNY';
  debtDraft.occurredAt = '';
  debtDraft.dueAt = '';
  debtDraft.status = 'OPEN';
  debtDraft.note = '';
}

function resetRecurringDraft() {
  recurringDraft.accountId = '';
  recurringDraft.title = '';
  recurringDraft.amount = '';
  recurringDraft.currencyCode = baseCurrency.value || 'CNY';
  recurringDraft.category = '';
  recurringDraft.note = '';
  recurringDraft.cronExpr = '0 0 9 * * *';
  recurringDraft.timeZoneId = 'Asia/Shanghai';
  recurringDraft.startAt = '';
  recurringDraft.endAt = '';
  recurringDraft.enabled = true;
}

function resetEditing() {
  editingId.value = 0;
  if (section.value === BALANCE_SECTION_ACCOUNTS) resetAccountDraft();
  if (section.value === BALANCE_SECTION_TRANSACTIONS) resetTransactionDraft();
  if (section.value === BALANCE_SECTION_DEBTS) resetDebtDraft();
  if (section.value === BALANCE_SECTION_RECURRING) resetRecurringDraft();
}

function nextSort(items) {
  return (Array.isArray(items) ? items : []).reduce((max, item) => Math.max(max, Number(item?.sortNum) || 0), 0) + 10;
}

function buildAccountPayloadFromDraft() {
  return {
    channelCode: String(accountDraft.channelCode || '').trim(),
    channelName: String(accountDraft.channelName || '').trim(),
    accountName: String(accountDraft.accountName || '').trim(),
    currencyCode: String(accountDraft.currencyCode || 'CNY').trim().toUpperCase() || 'CNY',
    balanceAmount: Number(accountDraft.balanceAmount) || 0
  };
}

function buildTransactionPayloadFromDraft() {
  return {
    accountId: transactionDraft.accountId ? Number(transactionDraft.accountId) : null,
    direction: String(transactionDraft.direction || 'EXPENSE').trim().toUpperCase() || 'EXPENSE',
    amount: Number(transactionDraft.amount) || 0,
    currencyCode: String(transactionDraft.currencyCode || 'CNY').trim().toUpperCase() || 'CNY',
    category: String(transactionDraft.category || '').trim() || null,
    note: String(transactionDraft.note || '').trim() || null,
    occurredAt: toIsoString(transactionDraft.occurredAt)
  };
}

function buildDebtPayloadFromDraft() {
  return {
    title: String(debtDraft.title || '').trim(),
    creditor: String(debtDraft.creditor || '').trim() || null,
    amount: Number(debtDraft.amount) || 0,
    currencyCode: String(debtDraft.currencyCode || 'CNY').trim().toUpperCase() || 'CNY',
    occurredAt: toIsoString(debtDraft.occurredAt),
    dueAt: toIsoString(debtDraft.dueAt) || null,
    status: String(debtDraft.status || 'OPEN').trim().toUpperCase() || 'OPEN',
    note: String(debtDraft.note || '').trim() || null
  };
}

function buildRecurringPayloadFromDraft() {
  return {
    accountId: recurringDraft.accountId ? Number(recurringDraft.accountId) : null,
    title: String(recurringDraft.title || '').trim(),
    amount: Number(recurringDraft.amount) || 0,
    currencyCode: String(recurringDraft.currencyCode || 'CNY').trim().toUpperCase() || 'CNY',
    category: String(recurringDraft.category || '').trim() || null,
    note: String(recurringDraft.note || '').trim() || null,
    cronExpr: String(recurringDraft.cronExpr || '').trim(),
    timeZoneId: String(recurringDraft.timeZoneId || 'Asia/Shanghai').trim() || 'Asia/Shanghai',
    startAt: toIsoString(recurringDraft.startAt) || null,
    endAt: toIsoString(recurringDraft.endAt) || null,
    enabled: Boolean(recurringDraft.enabled)
  };
}

function buildAccountPayload(item) {
  return {
    channelCode: item.channelCode,
    channelName: item.channelName,
    accountName: item.accountName,
    currencyCode: item.currencyCode,
    balanceAmount: Number(item.balanceAmount) || 0,
    sortNum: item.sortNum
  };
}

function buildTransactionPayload(item, overrides = {}) {
  return {
    accountId: overrides.accountId ?? item.accountId ?? null,
    direction: overrides.direction ?? item.direction,
    amount: overrides.amount ?? item.amount,
    currencyCode: overrides.currencyCode ?? item.currencyCode,
    category: overrides.category ?? (item.category || null),
    note: overrides.note ?? (item.note || null),
    occurredAt: overrides.occurredAt ?? item.occurredAt,
    sortNum: overrides.sortNum ?? item.sortNum
  };
}

function buildDebtPayload(item) {
  return {
    title: item.title,
    creditor: item.creditor || null,
    amount: item.amount,
    currencyCode: item.currencyCode,
    occurredAt: item.occurredAt,
    dueAt: item.dueAt || null,
    status: item.status,
    note: item.note || null,
    sortNum: item.sortNum
  };
}

function buildRecurringPayload(item, overrides = {}) {
  return {
    accountId: overrides.accountId ?? item.accountId ?? null,
    title: overrides.title ?? item.title,
    amount: overrides.amount ?? item.amount,
    currencyCode: overrides.currencyCode ?? item.currencyCode,
    category: overrides.category ?? (item.category || null),
    note: overrides.note ?? (item.note || null),
    cronExpr: overrides.cronExpr ?? item.cronExpr,
    timeZoneId: overrides.timeZoneId ?? item.timeZoneId,
    startAt: overrides.startAt ?? (item.startAt || null),
    endAt: overrides.endAt ?? (item.endAt || null),
    enabled: overrides.enabled ?? Boolean(item.enabled),
    sortNum: overrides.sortNum ?? item.sortNum
  };
}

async function submitBySection() {
  if (!canSubmitCurrentSection.value) return;
  errorText.value = '';
  saving.value = true;
  try {
    await auth.ensureReady();
    if (section.value === BALANCE_SECTION_ACCOUNTS) {
      const payload = buildAccountPayloadFromDraft();
      if (auth.isAuthenticated.value) {
        if (editingId.value) {
          await updateLightAppBalanceAccount(editingId.value, payload, auth.authorizedFetch);
        } else {
          await createLightAppBalanceAccount(payload, auth.authorizedFetch);
        }
        await loadRemoteAll();
      } else {
        if (editingId.value) {
          persistGuest({
            balanceAccounts: accounts.value.map((item) => (item.accountId === editingId.value ? { ...item, ...payload } : item))
          });
        } else {
          persistGuest({
            balanceAccounts: [
              ...accounts.value,
              {
                accountId: createLocalEntityId(),
                ...payload,
                sortNum: nextSort(accounts.value),
                updatedAt: new Date().toISOString()
              }
            ]
          });
        }
      }
    } else if (section.value === BALANCE_SECTION_TRANSACTIONS) {
      const payload = buildTransactionPayloadFromDraft();
      if (auth.isAuthenticated.value) {
        if (editingId.value) {
          await updateLightAppBalanceTransaction(editingId.value, payload, auth.authorizedFetch);
        } else {
          await createLightAppBalanceTransaction(payload, auth.authorizedFetch);
        }
        await loadRemoteAll();
      } else {
        if (editingId.value) {
          persistGuest({
            balanceTransactions: transactions.value.map((item) =>
              item.transactionId === editingId.value
                ? { ...item, ...payload, updatedAt: new Date().toISOString() }
                : item
            )
          });
        } else {
          persistGuest({
            balanceTransactions: [
              {
                transactionId: createLocalEntityId(),
                ...payload,
                sortNum: nextSort(transactions.value),
                updatedAt: new Date().toISOString()
              },
              ...transactions.value
            ]
          });
        }
      }
    } else if (section.value === BALANCE_SECTION_DEBTS) {
      const payload = buildDebtPayloadFromDraft();
      if (auth.isAuthenticated.value) {
        if (editingId.value) {
          await updateLightAppBalanceDebt(editingId.value, payload, auth.authorizedFetch);
        } else {
          await createLightAppBalanceDebt(payload, auth.authorizedFetch);
        }
        await loadRemoteAll();
      } else {
        if (editingId.value) {
          persistGuest({
            balanceDebts: debts.value.map((item) => (item.debtId === editingId.value ? { ...item, ...payload } : item))
          });
        } else {
          persistGuest({
            balanceDebts: [
              ...debts.value,
              {
                debtId: createLocalEntityId(),
                ...payload,
                sortNum: nextSort(debts.value),
                updatedAt: new Date().toISOString()
              }
            ]
          });
        }
      }
    } else if (section.value === BALANCE_SECTION_RECURRING) {
      const payload = buildRecurringPayloadFromDraft();
      if (auth.isAuthenticated.value) {
        if (editingId.value) {
          await updateLightAppBalanceRecurringCharge(editingId.value, payload, auth.authorizedFetch);
        } else {
          await createLightAppBalanceRecurringCharge(payload, auth.authorizedFetch);
        }
        await loadRemoteAll();
      } else {
        if (editingId.value) {
          persistGuest({
            balanceRecurringCharges: recurringCharges.value.map((item) =>
              item.recurringChargeId === editingId.value ? { ...item, ...payload } : item
            )
          });
        } else {
          persistGuest({
            balanceRecurringCharges: [
              ...recurringCharges.value,
              {
                recurringChargeId: createLocalEntityId(),
                ...payload,
                sortNum: nextSort(recurringCharges.value),
                lastTriggerAt: '',
                updatedAt: new Date().toISOString()
              }
            ]
          });
        }
      }
    }

    showCreateForm.value = false;
    resetEditing();
  } catch (error) {
    errorText.value = error?.message || '保存失败';
  } finally {
    saving.value = false;
  }
}

async function removeAccount(accountId) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await deleteLightAppBalanceAccount(accountId, auth.authorizedFetch);
      await loadRemoteAll();
      return;
    }
    persistGuest({
      balanceAccounts: accounts.value.filter((item) => item.accountId !== accountId),
      balanceTransactions: transactions.value.map((item) => (item.accountId === accountId ? { ...item, accountId: null } : item)),
      balanceRecurringCharges: recurringCharges.value.map((item) =>
        item.accountId === accountId ? { ...item, accountId: null } : item
      )
    });
  } catch (error) {
    errorText.value = error?.message || '删除账户失败';
  }
}

async function removeTransaction(transactionId) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await deleteLightAppBalanceTransaction(transactionId, auth.authorizedFetch);
      await loadRemoteAll();
      return;
    }
    persistGuest({
      balanceTransactions: transactions.value.filter((item) => item.transactionId !== transactionId)
    });
  } catch (error) {
    errorText.value = error?.message || '删除收支失败';
  }
}

async function removeDebt(debtId) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await deleteLightAppBalanceDebt(debtId, auth.authorizedFetch);
      await loadRemoteAll();
      return;
    }
    persistGuest({
      balanceDebts: debts.value.filter((item) => item.debtId !== debtId)
    });
  } catch (error) {
    errorText.value = error?.message || '删除负债失败';
  }
}

async function removeRecurring(recurringChargeId) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await deleteLightAppBalanceRecurringCharge(recurringChargeId, auth.authorizedFetch);
      await loadRemoteAll();
      return;
    }
    persistGuest({
      balanceRecurringCharges: recurringCharges.value.filter((item) => item.recurringChargeId !== recurringChargeId)
    });
  } catch (error) {
    errorText.value = error?.message || '删除定期规则失败';
  }
}

async function toggleRecurringEnabled(item) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    const nextEnabled = !Boolean(item?.enabled);
    if (auth.isAuthenticated.value) {
      await updateLightAppBalanceRecurringCharge(
        item.recurringChargeId,
        buildRecurringPayload(item, { enabled: nextEnabled }),
        auth.authorizedFetch
      );
      await loadRemoteAll();
      return;
    }
    persistGuest({
      balanceRecurringCharges: recurringCharges.value.map((row) =>
        row.recurringChargeId === item.recurringChargeId ? { ...row, enabled: nextEnabled } : row
      )
    });
  } catch (error) {
    errorText.value = error?.message || '规则状态更新失败';
  }
}

function startEditAccount(item) {
  editingId.value = Number(item?.accountId) || 0;
  showCreateForm.value = true;
  accountDraft.channelName = item.channelName || '';
  accountDraft.channelCode = item.channelCode || '';
  accountDraft.accountName = item.accountName || '';
  accountDraft.currencyCode = item.currencyCode || baseCurrency.value || 'CNY';
  accountDraft.balanceAmount = Number(item.balanceAmount) || 0;
}

function startEditTransaction(item) {
  editingId.value = Number(item?.transactionId) || 0;
  showCreateForm.value = true;
  transactionDraft.accountId = item.accountId ? String(item.accountId) : '';
  transactionDraft.direction = item.direction || 'EXPENSE';
  transactionDraft.amount = Number(item.amount) || 0;
  transactionDraft.currencyCode = item.currencyCode || baseCurrency.value || 'CNY';
  transactionDraft.category = item.category || '';
  transactionDraft.note = item.note || '';
  transactionDraft.occurredAt = toLocalInput(item.occurredAt);
}

function startEditDebt(item) {
  editingId.value = Number(item?.debtId) || 0;
  showCreateForm.value = true;
  debtDraft.title = item.title || '';
  debtDraft.creditor = item.creditor || '';
  debtDraft.amount = Number(item.amount) || 0;
  debtDraft.currencyCode = item.currencyCode || baseCurrency.value || 'CNY';
  debtDraft.occurredAt = toLocalInput(item.occurredAt);
  debtDraft.dueAt = toLocalInput(item.dueAt);
  debtDraft.status = item.status || 'OPEN';
  debtDraft.note = item.note || '';
}

function startEditRecurring(item) {
  editingId.value = Number(item?.recurringChargeId) || 0;
  showCreateForm.value = true;
  recurringDraft.accountId = item.accountId ? String(item.accountId) : '';
  recurringDraft.title = item.title || '';
  recurringDraft.amount = Number(item.amount) || 0;
  recurringDraft.currencyCode = item.currencyCode || baseCurrency.value || 'CNY';
  recurringDraft.category = item.category || '';
  recurringDraft.note = item.note || '';
  recurringDraft.cronExpr = item.cronExpr || '';
  recurringDraft.timeZoneId = item.timeZoneId || 'Asia/Shanghai';
  recurringDraft.startAt = toLocalInput(item.startAt);
  recurringDraft.endAt = toLocalInput(item.endAt);
  recurringDraft.enabled = Boolean(item.enabled);
}

async function refreshFx() {
  errorText.value = '';
  refreshingFx.value = true;
  try {
    await auth.ensureReady();
    const targetBase = String(baseCurrency.value || 'CNY').toUpperCase();
    if (auth.isAuthenticated.value) {
      fxRates.value = await refreshLightAppFxRates(targetBase, auth.authorizedFetch);
      overview.value = await getLightAppBalanceOverview(targetBase, auth.authorizedFetch);
      writeRemoteLightAppCache({
        balanceFxRates: fxRates.value,
        balanceOverview: overview.value
      });
      await refreshAnalyticsData();
      return;
    }
    baseCurrency.value = targetBase;
    rebuildGuestOverview();
    await refreshAnalyticsData();
  } catch (error) {
    errorText.value = error?.message || '刷新汇率失败';
  } finally {
    refreshingFx.value = false;
  }
}

watch(
  () => section.value,
  () => {
    showCreateForm.value = false;
    resetEditing();
  }
);

watch(
  () => transactionDraft.accountId,
  (value) => {
    if (!value) return;
    const account = accounts.value.find((item) => item.accountId === Number(value));
    if (!account) return;
    transactionDraft.currencyCode = account.currencyCode || transactionDraft.currencyCode;
  }
);

watch(
  () => recurringDraft.accountId,
  (value) => {
    if (!value) return;
    const account = accounts.value.find((item) => item.accountId === Number(value));
    if (!account) return;
    recurringDraft.currencyCode = account.currencyCode || recurringDraft.currencyCode;
  }
);

watch(
  () => filterPreset.value,
  (preset) => {
    if (String(preset || '').toLowerCase() === 'custom') return;
    applyFilterPreset(preset);
    queueAnalyticsRefresh();
  }
);

watch(
  () => [
    filterFromDate.value,
    filterToDate.value,
    filterChannelCode.value,
    filterAccountId.value,
    filterDirection.value
  ],
  () => {
    queueAnalyticsRefresh();
  }
);

watch(
  () => baseCurrency.value,
  async (current, previous) => {
    const normalized = String(current || 'CNY').toUpperCase();
    if (normalized === String(previous || '').toUpperCase()) return;
    baseCurrency.value = normalized;
    if (auth.isAuthenticated.value) {
      try {
        overview.value = await getLightAppBalanceOverview(normalized, auth.authorizedFetch);
        fxRates.value = await listLightAppFxRates(normalized, auth.authorizedFetch);
        writeRemoteLightAppCache({
          balanceOverview: overview.value,
          balanceFxRates: fxRates.value
        });
        await refreshAnalyticsData();
      } catch (error) {
        errorText.value = error?.message || '切换基准币失败';
      }
      return;
    }
    rebuildGuestOverview();
    await refreshAnalyticsData();
  }
);

onMounted(async () => {
  applyFilterPreset('30d');
  registerBalanceSectionChangeHandler(props.windowId, (nextSection) => {
    section.value = nextSection;
    showCreateForm.value = false;
    resetEditing();
  });
  await hydrate();
});

onBeforeUnmount(() => {
  if (filterRefreshTimer) {
    window.clearTimeout(filterRefreshTimer);
    filterRefreshTimer = 0;
  }
  registerBalanceSectionChangeHandler(props.windowId, null);
});
</script>

<style scoped>
.lightapp-window {
  --la-border: rgba(255, 255, 255, 0.44);
  --la-input-bg: rgba(var(--glass-rgb), 0.32);
  --la-btn-bg: rgba(var(--glass-rgb), 0.3);
  --la-panel-bg: rgba(var(--glass-rgb), 0.26);
  --la-card-bg: rgba(var(--glass-rgb), 0.24);
  --la-text: rgba(35, 42, 58, 0.9);
  --la-muted: rgba(55, 64, 84, 0.74);
  --la-danger: rgba(214, 74, 103, 0.92);
  --la-income: rgba(30, 145, 84, 0.9);
  display: grid;
  gap: 10px;
  min-width: 0;
  color: var(--la-text);
}

.top-toolbar {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.toolbar-hint {
  margin-left: auto;
  color: var(--la-muted);
  font-size: 12px;
}

.compact-select {
  min-width: 86px;
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  border-radius: 10px;
  color: var(--la-text);
  padding: 6px 8px;
}

.icon-btn {
  border: 1px solid var(--la-border);
  background: var(--la-btn-bg);
  color: var(--la-text);
  border-radius: 10px;
  transition:
    transform 140ms ease,
    border-color 140ms ease,
    background-color 140ms ease,
    box-shadow 180ms ease;
}

.icon-btn:hover {
  transform: translateY(-1px);
  border-color: rgba(189, 213, 252, 0.62);
  background: rgba(var(--glass-rgb), 0.4);
  box-shadow: 0 5px 14px rgba(12, 18, 32, 0.14);
}

.create-form {
  display: grid;
  grid-template-columns: repeat(6, minmax(0, 1fr));
  gap: 8px;
}

.create-form input,
.create-form select {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 10px;
  padding: 8px 10px;
  min-width: 0;
}

.span-2 {
  grid-column: span 2;
}

.switch-line {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  font-size: 12px;
  color: var(--la-muted);
}

.form-actions {
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.overview-stack {
  display: grid;
  gap: 10px;
}

.metrics-strip {
  display: flex;
  align-items: stretch;
  gap: 10px;
  overflow-x: auto;
  padding-bottom: 2px;
  scrollbar-width: thin;
  scrollbar-color: rgba(141, 169, 214, 0.6) rgba(255, 255, 255, 0.18);
}

.metrics-strip::-webkit-scrollbar {
  height: 6px;
}

.metrics-strip::-webkit-scrollbar-track {
  background: rgba(255, 255, 255, 0.18);
  border-radius: 999px;
}

.metrics-strip::-webkit-scrollbar-thumb {
  background: rgba(141, 169, 214, 0.66);
  border-radius: 999px;
}

.metric-card {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px 12px;
  display: grid;
  gap: 4px;
  min-width: 180px;
  flex: 1 0 180px;
}

.metric-card p {
  margin: 0;
  font-size: 12px;
  color: var(--la-muted);
}

.metric-card strong {
  font-size: 16px;
  letter-spacing: 0.2px;
}

.filters-bar {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px;
  display: flex;
  align-items: center;
  gap: 10px;
  flex-wrap: wrap;
}

.filters-presets {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  flex-wrap: wrap;
}

.filter-chip {
  border: 1px solid rgba(255, 255, 255, 0.44);
  background: rgba(var(--glass-rgb), 0.28);
  color: var(--la-text);
  border-radius: 999px;
  padding: 5px 10px;
  font-size: 12px;
  line-height: 1;
  transition:
    border-color 160ms ease,
    background-color 180ms ease,
    transform 140ms ease;
}

.filter-chip:hover {
  transform: translateY(-1px);
  border-color: rgba(178, 206, 248, 0.72);
  background: rgba(var(--glass-rgb), 0.4);
}

.filter-chip.active {
  border-color: rgba(118, 176, 250, 0.82);
  background: rgba(120, 178, 248, 0.26);
  color: rgba(33, 62, 112, 0.95);
}

.filters-inputs {
  margin-left: auto;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  flex-wrap: wrap;
}

.filters-inputs span {
  color: var(--la-muted);
  font-size: 12px;
}

.filters-inputs input,
.filters-inputs select {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 9px;
  padding: 6px 9px;
  min-height: 32px;
}

.filters-inputs input:focus,
.filters-inputs select:focus {
  outline: none;
  border-color: rgba(139, 185, 248, 0.82);
  box-shadow: 0 0 0 2px rgba(144, 190, 252, 0.18);
}

.charts-zone {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
}

.chart-panel {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px;
  display: grid;
  gap: 10px;
  min-height: 194px;
}

.chart-panel header {
  display: flex;
  align-items: baseline;
  justify-content: space-between;
  gap: 8px;
}

.chart-panel h4 {
  margin: 0;
  font-size: 13px;
}

.chart-panel small {
  color: var(--la-muted);
  font-size: 11px;
}

.trend-chart,
.channel-chart {
  display: grid;
  gap: 6px;
}

.trend-row,
.channel-row {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  gap: 8px;
  align-items: center;
}

.trend-row span,
.channel-row span {
  color: var(--la-muted);
  font-size: 12px;
  white-space: nowrap;
  max-width: 118px;
  overflow: hidden;
  text-overflow: ellipsis;
}

.trend-bars,
.channel-bars {
  display: grid;
  gap: 4px;
}

.bar {
  height: 7px;
  border-radius: 999px;
  min-width: 0;
}

.bar.is-income {
  background: linear-gradient(90deg, rgba(90, 186, 122, 0.66), rgba(54, 150, 88, 0.94));
}

.bar.is-expense {
  background: linear-gradient(90deg, rgba(238, 125, 153, 0.72), rgba(212, 91, 125, 0.94));
}

.asset-panel {
  grid-template-rows: auto 1fr;
}

.asset-donut-wrap {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  align-items: center;
  gap: 12px;
}

.asset-donut {
  width: 92px;
  height: 92px;
  border-radius: 50%;
  border: 1px solid rgba(255, 255, 255, 0.52);
  box-shadow: inset 0 0 0 11px rgba(255, 255, 255, 0.7);
}

.asset-legend {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 6px;
  color: var(--la-muted);
  font-size: 12px;
}

.asset-legend li {
  display: flex;
  align-items: center;
  gap: 6px;
}

.dot {
  width: 8px;
  height: 8px;
  border-radius: 50%;
  display: inline-block;
}

.dot.balance {
  background: rgba(98, 163, 255, 0.95);
}

.dot.debt {
  background: rgba(228, 111, 143, 0.95);
}

.dot.net {
  background: rgba(112, 198, 147, 0.95);
}

.overview-panel {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px;
  display: grid;
  gap: 8px;
}

.overview-panel header {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.overview-panel h4 {
  margin: 0;
  font-size: 13px;
}

.compact-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 6px;
}

.compact-list li {
  display: grid;
  grid-template-columns: 1fr auto;
  gap: 4px 10px;
  align-items: center;
  border: 1px solid rgba(255, 255, 255, 0.24);
  border-radius: 10px;
  padding: 8px;
  background: rgba(255, 255, 255, 0.14);
}

.compact-list li small {
  grid-column: 1 / -1;
  font-size: 11px;
  color: var(--la-muted);
}

.ledger-records {
  display: grid;
  gap: 10px;
}

.ledger-summary {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px 12px;
  display: grid;
  gap: 7px;
}

.ledger-summary > p {
  margin: 0;
  font-size: 12px;
  color: var(--la-muted);
}

.ledger-summary-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 8px;
}

.ledger-summary-grid span {
  border: 1px solid rgba(255, 255, 255, 0.28);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.14);
  padding: 7px 9px;
  font-size: 12px;
}

.list-grid {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.list-item {
  --liquid-bg: var(--la-card-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto auto;
  gap: 10px;
  align-items: center;
  transition:
    transform 160ms ease,
    border-color 160ms ease,
    background-color 180ms ease;
}

.list-item:hover {
  transform: translateY(-1px);
  --liquid-border: rgba(193, 216, 253, 0.62);
  --liquid-bg: rgba(var(--glass-rgb), 0.34);
}

.list-main p {
  margin: 0;
  font-weight: 600;
}

.list-main small {
  color: var(--la-muted);
  font-size: 12px;
}

.list-actions {
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.is-income {
  color: var(--la-income);
}

.is-expense {
  color: var(--la-danger);
}

.empty-hint {
  margin: 0;
  color: var(--la-muted);
  font-size: 12px;
}

.error-text {
  margin: 0;
  color: var(--la-danger);
}

.panel-collapse-enter-active,
.panel-collapse-leave-active {
  transition:
    opacity 220ms ease,
    transform 240ms cubic-bezier(0.2, 0.88, 0.34, 1),
    max-height 240ms ease;
  transform-origin: top center;
  overflow: hidden;
}

.panel-collapse-enter-from,
.panel-collapse-leave-to {
  opacity: 0;
  transform: translateY(-6px) scaleY(0.94);
  max-height: 0;
}

.panel-collapse-enter-to,
.panel-collapse-leave-from {
  opacity: 1;
  transform: translateY(0) scaleY(1);
  max-height: 540px;
}

@container lightapp-window-body (max-width: 700px) {
  .create-form {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .span-2 {
    grid-column: span 2;
  }

  .charts-zone {
    grid-template-columns: minmax(0, 1fr);
  }

  .filters-inputs {
    margin-left: 0;
  }

  .asset-donut-wrap {
    grid-template-columns: minmax(0, 1fr);
    justify-items: start;
  }

  .ledger-summary-grid {
    grid-template-columns: minmax(0, 1fr);
  }
}

@media (max-width: 760px) {
  .charts-zone {
    grid-template-columns: minmax(0, 1fr);
  }

  .list-item {
    grid-template-columns: minmax(0, 1fr);
  }

  .list-actions {
    justify-content: flex-end;
  }

  .ledger-summary-grid {
    grid-template-columns: minmax(0, 1fr);
  }
}

@media (prefers-reduced-motion: reduce) {
  .icon-btn,
  .list-item,
  .panel-collapse-enter-active,
  .panel-collapse-leave-active {
    transition-duration: 80ms !important;
  }
}
</style>
