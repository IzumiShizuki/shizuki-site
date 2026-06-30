<template>
  <section class="lightapp-window">
    <LightAppTopToolbar :window-id="props.windowId">
        <div class="toolbar-switches with-divider" role="tablist" aria-label="Balance sections">
          <button
            v-for="item in BALANCE_SECTION_ITEMS"
            :key="`balance_section_${item.code}`"
            class="icon-btn toolbar-tab-btn ripple-trigger"
            :class="{ 'is-active': section === item.code }"
            type="button"
            role="tab"
            :aria-selected="section === item.code"
            :title="item.label"
            :aria-label="item.label"
            @click="section = item.code"
          >
            <i :class="item.iconClass" aria-hidden="true"></i>
          </button>
        </div>
        <button
          class="icon-btn toolbar-btn ripple-trigger"
          :class="{ 'is-active': showCreateForm }"
          :disabled="!canToggleCreateForm"
          type="button"
          :title="showCreateForm ? '收起添加区' : `添加${activeSectionLabel}`"
          :aria-label="showCreateForm ? '收起添加区' : `添加${activeSectionLabel}`"
          @click="toggleCreateForm"
        >
          <i class="fas fa-plus" aria-hidden="true"></i>
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
    </LightAppTopToolbar>

    <CollapsiblePanel :visible="showCreateForm" tag="form" class="create-form" @submit.prevent="submitBySection">
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
          <select v-model="transactionCategoryPreset">
            <option v-for="item in transactionPresetCategories" :key="`transaction_category_${transactionDraft.direction}_${item}`" :value="item">
              {{ item }}
            </option>
            <option :value="CUSTOM_CATEGORY_VALUE">自定义分类</option>
          </select>
          <input
            v-if="isTransactionCategoryCustom"
            v-model.trim="transactionDraft.category"
            type="text"
            placeholder="请输入自定义分类"
          />
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
    </CollapsiblePanel>

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

        <article class="chart-panel liquid-material donut-panel">
          <header>
            <h4>各支出占比</h4>
            <small>{{ analytics.summary.expenseCount }} 笔</small>
          </header>
          <div v-if="expenseCategoryRows.length" class="category-donut-wrap">
            <div class="category-donut" :style="{ background: expenseCategoryGradient }"></div>
            <div class="category-legend">
              <div v-for="(item, index) in expenseCategoryRows" :key="`expense_category_${item.categoryName}_${index}`" class="category-legend-item">
                <i class="dot" :style="{ backgroundColor: DONUT_PALETTE_EXPENSE[index % DONUT_PALETTE_EXPENSE.length] }"></i>
                <span class="category-name">{{ item.categoryName }}</span>
                <small>{{ Number(item.ratioPercent || 0).toFixed(1) }}%</small>
              </div>
            </div>
          </div>
          <p v-else class="empty-hint">暂无支出分类数据</p>
        </article>

        <article class="chart-panel liquid-material donut-panel">
          <header>
            <h4>各收入占比</h4>
            <small>{{ analytics.summary.incomeCount }} 笔</small>
          </header>
          <div v-if="incomeCategoryRows.length" class="category-donut-wrap">
            <div class="category-donut" :style="{ background: incomeCategoryGradient }"></div>
            <div class="category-legend">
              <div v-for="(item, index) in incomeCategoryRows" :key="`income_category_${item.categoryName}_${index}`" class="category-legend-item">
                <i class="dot" :style="{ backgroundColor: DONUT_PALETTE_INCOME[index % DONUT_PALETTE_INCOME.length] }"></i>
                <span class="category-name">{{ item.categoryName }}</span>
                <small>{{ Number(item.ratioPercent || 0).toFixed(1) }}%</small>
              </div>
            </div>
          </div>
          <p v-else class="empty-hint">暂无收入分类数据</p>
        </article>

        <article class="chart-panel liquid-material savings-panel">
          <header>
            <h4>储蓄预警图</h4>
            <small>{{ analytics.baseCurrency }}</small>
          </header>
          <div class="savings-visual">
            <div class="savings-bar" :style="savingsAlertBarStyle"></div>
            <p class="savings-text">{{ savingsAlertText }}</p>
            <div class="savings-meta">
              <span>收入 {{ formatAmount(savingsAlert.incomeTotal, analytics.baseCurrency) }}</span>
              <span>支出 {{ formatAmount(savingsAlert.expenseTotal, analytics.baseCurrency) }}</span>
              <span>净流入 {{ formatAmount(savingsAlert.netFlow, analytics.baseCurrency) }}</span>
            </div>
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

    <section v-else-if="section === BALANCE_SECTION_SOURCES" class="source-sync-section">
      <p v-if="!isAuthenticated" class="empty-hint">登录后可绑定支付宝、微信、银行卡，并在服务器上自动抓取或摄取账单。</p>
      <template v-else>
        <article class="source-guide liquid-material">
          <div class="source-guide-header">
            <div>
              <h4>接通自动记账</h4>
              <p>支付宝支持服务器侧二维码绑定；微信和银行卡当前走服务器账单目录导入，不会显示二维码。</p>
            </div>
            <button class="text-btn is-subtle ripple-trigger" type="button" @click="openAccountsWorkspace">管理本地账户</button>
          </div>
          <div class="source-guide-grid">
            <article class="source-guide-step">
              <span class="source-step-badge">1</span>
              <strong>准备本地账户</strong>
              <p>可以手动选择已有账户，也可以直接点下面的绑定按钮，系统会自动补一个默认账户。</p>
            </article>
            <article class="source-guide-step">
              <span class="source-step-badge">2</span>
              <strong>接通来源</strong>
              <p>支付宝会生成二维码；微信和银行卡会直接启用服务器目录导入模式。</p>
            </article>
            <article class="source-guide-step">
              <span class="source-step-badge">3</span>
              <strong>开始入账</strong>
              <p>接通后可以立即同步，也可以打开夜间自动同步，让账单在 0:00 左右自动入账。</p>
            </article>
          </div>
        </article>

        <div class="source-grid">
          <article
            v-for="provider in SOURCE_PROVIDERS"
            :key="`source_${provider}`"
            class="source-card liquid-material"
            :class="`provider-${provider}`"
          >
          <header class="source-card-header">
            <div>
              <h4>{{ resolveSourceStatus(provider).providerLabel || provider }}</h4>
              <p>{{ formatSourceStatus(resolveSourceStatus(provider).status) }}</p>
              <small class="source-provider-hint">{{ sourceProviderHint(provider) }}</small>
              <small class="source-provider-mode">{{ sourceProviderMode(provider) }}</small>
            </div>
            <span
              class="source-status-pill"
              :class="{
                'is-bound': resolveSourceStatus(provider).status === 'BOUND',
                'is-pending': resolveSourceStatus(provider).status === 'PENDING',
                'is-danger': resolveSourceStatus(provider).status === 'REAUTH_REQUIRED'
              }"
            >
              {{ formatSourceStatus(resolveSourceStatus(provider).status) }}
            </span>
          </header>

          <div class="source-config-grid">
            <select v-model="resolveSourceDraft(provider).targetAccountId">
              <option value="">选择本地账户</option>
              <option v-for="item in accounts" :key="`source_account_${provider}_${item.accountId}`" :value="String(item.accountId)">
                {{ item.accountName }} ({{ item.currencyCode }})
              </option>
            </select>
            <label class="switch-line">
              <input v-model="resolveSourceDraft(provider).nightlyEnabled" type="checkbox" />
              夜间自动同步
            </label>
          </div>

          <div class="source-inline-hint-row">
            <small class="source-inline-tip">{{ sourceTargetHint(provider) }}</small>
            <button
              v-if="!resolveSourceDraft(provider).targetAccountId"
              class="text-btn is-subtle ripple-trigger"
              type="button"
              @click="pickOrCreateSourceAccount(provider)"
            >
              {{ sourceAccountShortcutLabel(provider) }}
            </button>
          </div>

          <div class="source-actions">
            <button class="text-btn ripple-trigger" type="button" @click="saveSourceAccount(provider)">保存配置</button>
            <button class="text-btn is-primary ripple-trigger" type="button" @click="beginSourceBind(provider)">
              {{ sourceBindActionLabel(provider) }}
            </button>
            <button
              class="text-btn ripple-trigger"
              type="button"
              :disabled="!resolveSourceStatus(provider).bound"
              @click="triggerSourceSync(provider)"
            >
              立即同步
            </button>
          </div>

          <div v-if="bindSessions[provider]" class="source-session liquid-material">
            <p class="source-session-title">{{ sourceSessionTitle(provider, bindSessions[provider]) }}</p>
            <small class="source-session-hint">{{ sourceSessionHint(provider, bindSessions[provider]) }}</small>
            <img
              v-if="bindSessions[provider].qrCodeImageDataUrl"
              class="source-qr-image"
              :src="bindSessions[provider].qrCodeImageDataUrl"
              :alt="`${provider} bind qr`"
            />
            <code v-else-if="bindSessions[provider].qrCodePayload" class="source-qr-fallback">{{ bindSessions[provider].qrCodePayload }}</code>
            <a
              v-if="bindSessions[provider].loginUrl"
              class="source-session-link"
              :href="bindSessions[provider].loginUrl"
              target="_blank"
              rel="noreferrer"
            >
              打开登录页
            </a>
            <small v-if="bindSessions[provider].failureReason" class="error-text">{{ bindSessions[provider].failureReason }}</small>
          </div>

          <div class="source-meta">
            <p>目标账户：{{ resolveSourceStatus(provider).targetAccountName || '未设置' }}</p>
            <p>最近校验：{{ formatDateTime(resolveSourceStatus(provider).lastVerifiedAt) }}</p>
            <p>最近同步：{{ formatDateTime(resolveSourceStatus(provider).lastSyncedAt) }}</p>
            <p v-if="sourceImportDirectory(provider)" class="source-directory-tip">导入目录：<code>{{ sourceImportDirectory(provider) }}</code></p>
            <p v-if="resolveSourceStatus(provider).lastSyncErrorText" class="error-text">
              {{ resolveSourceStatus(provider).lastSyncErrorText }}
            </p>
          </div>

          <div v-if="importJobs[provider]" class="source-job liquid-material">
            <p>{{ formatImportJobStatus(importJobs[provider].status) }}</p>
            <small>
              导入 {{ importJobs[provider].importedCount }} 笔，去重 {{ importJobs[provider].duplicateCount }} 笔，跳过
              {{ importJobs[provider].skippedCount }} 笔
            </small>
            <small v-if="importJobs[provider].errorText">{{ importJobs[provider].errorText }}</small>
          </div>
          </article>
        </div>
      </template>
    </section>

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

      <p v-if="editingTransactionItem" class="editing-hint liquid-material">
        正在修改：{{ editingTransactionItem.category || '未分类' }} ·
        {{ formatDateTime(editingTransactionItem.occurredAt) }}
      </p>

      <ul class="list-grid">
      <li
        v-for="item in filteredTransactions"
        :key="`transaction_${item.transactionId}`"
        class="list-item liquid-material transaction-item"
        :class="{ 'is-editing': Number(item.transactionId) === Number(editingId) && editingId > 0 }"
        @click="handleTransactionRowClick(item, $event)"
      >
        <div class="list-main">
          <p>{{ item.category || '未分类' }}</p>
          <small>{{ accountName(item.accountId) }} · {{ formatDateTime(item.occurredAt) }}</small>
        </div>
        <strong :class="item.direction === 'INCOME' ? 'is-income' : 'is-expense'">
          {{ item.direction === 'INCOME' ? '+' : '-' }}{{ formatAmount(item.amount, item.currencyCode) }}
        </strong>
        <div class="list-actions" @click.stop>
          <button class="text-btn ripple-trigger" type="button" title="修改" @click.stop="startEditTransaction(item)">
            修改
          </button>
          <button class="icon-btn ripple-trigger" type="button" title="编辑" @click.stop="startEditTransaction(item)">
            <i class="fas fa-pen" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" type="button" title="删除" @click.stop="removeTransaction(item.transactionId)">
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
  createLightAppBalanceBindSession,
  createLightAppBalanceAccount,
  createLightAppBalanceDebt,
  createLightAppBalanceImportJob,
  createLightAppBalanceRecurringCharge,
  createLightAppBalanceTransaction,
  deleteLightAppBalanceAccount,
  deleteLightAppBalanceDebt,
  deleteLightAppBalanceRecurringCharge,
  deleteLightAppBalanceTransaction,
  getLightAppBalanceBindSession,
  getLightAppBalanceAnalytics,
  getLightAppBalanceImportJob,
  getLightAppBalanceOverview,
  listLightAppBalanceAccounts,
  listLightAppBalanceDebts,
  listLightAppBalanceRecurringCharges,
  listLightAppBalanceSourceAccountStatus,
  listLightAppBalanceTransactions,
  listLightAppFxRates,
  refreshLightAppFxRates,
  updateLightAppBalanceSourceAccount,
  updateLightAppBalanceAccount,
  updateLightAppBalanceDebt,
  updateLightAppBalanceRecurringCharge,
  updateLightAppBalanceTransaction
} from '../../../services/lightAppsApi';
import {
  buildCategoryBreakdownRows,
  buildLedgerRangeQuery,
  buildLocalBalanceAnalytics,
  normalizeLedgerFilter,
  resolveSavingsAlert,
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
  BALANCE_SECTION_SOURCES,
  BALANCE_SECTION_TRANSACTIONS,
  normalizeBalanceSection,
  registerBalanceSectionChangeHandler,
  resolveBalanceWindowState
} from './balanceWindowState';
import CollapsiblePanel from '../CollapsiblePanel.vue';
import LightAppTopToolbar from '../LightAppTopToolbar.vue';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const auth = useAuthSession();
const balanceState = resolveBalanceWindowState(props.windowId);
const isAuthenticated = computed(() => Boolean(auth.isAuthenticated.value));

const section = computed({
  get() {
    return normalizeBalanceSection(balanceState.section);
  },
  set(value) {
    balanceState.section = normalizeBalanceSection(value);
  }
});

const CUSTOM_CATEGORY_VALUE = '__custom__';
const DEFAULT_CATEGORY_NAME = '其他';
const EXPENSE_CATEGORY_OPTIONS = ['餐饮', '出行', '娱乐', '购物', '居家', '医疗', '教育', '其他'];
const INCOME_CATEGORY_OPTIONS = ['工资', '红包', '奖金', '理财', '副业', '报销', '退款', '其他'];
const DONUT_PALETTE_EXPENSE = [
  '#f08ca2',
  '#f6a7a0',
  '#f8bc7e',
  '#f4ce64',
  '#f1db8d',
  '#efb0bb',
  '#d897a6',
  '#c67f8f',
  '#bc7186',
  '#9d5e72'
];
const DONUT_PALETTE_INCOME = [
  '#79c493',
  '#61b985',
  '#95cf7e',
  '#84c46e',
  '#7cb7a5',
  '#7eb6c7',
  '#8cb6d9',
  '#6aa6cb',
  '#5f98bc',
  '#5086aa'
];
const SOURCE_PROVIDERS = ['alipay', 'wechat', 'bankcard'];
const SOURCE_PROVIDER_LABELS = {
  alipay: '支付宝',
  wechat: '微信',
  bankcard: '银行卡'
};
const SOURCE_PROVIDER_HINTS = {
  alipay: '扫码绑定后由服务器自动抓取账单。',
  wechat: '将微信导出的账单放入服务器目录后自动导入。',
  bankcard: '将银行卡导出的流水放入服务器目录后自动导入，适合工资卡。'
};
const SOURCE_PROVIDER_MODES = {
  alipay: '二维码绑定',
  wechat: '目录导入',
  bankcard: '工资卡目录导入'
};
const SOURCE_PROVIDER_DEFAULT_ACCOUNTS = {
  alipay: {
    channelCode: 'alipay',
    channelName: '支付宝',
    accountName: '支付宝余额'
  },
  wechat: {
    channelCode: 'wechat',
    channelName: '微信',
    accountName: '微信零钱'
  },
  bankcard: {
    channelCode: 'bankcard',
    channelName: '银行卡',
    accountName: '工资卡'
  }
};
const SOURCE_PROVIDER_IMPORT_DIRECTORIES = {
  wechat: '/opt/shizuki-site/data/bill-sync-agent/wechat-bills',
  bankcard: '/opt/shizuki-site/data/bill-sync-agent/bankcard-bills'
};
const TERMINAL_BIND_STATUSES = new Set(['BOUND', 'FAILED', 'EXPIRED']);
const TERMINAL_IMPORT_JOB_STATUSES = new Set(['SUCCESS', 'FAILED']);

const accounts = ref([]);
const transactions = ref([]);
const debts = ref([]);
const recurringCharges = ref([]);
const fxRates = ref([]);
const sourceAccounts = ref([]);
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
  channelBreakdown: [],
  expenseCategoryBreakdown: [],
  incomeCategoryBreakdown: []
});

const baseCurrency = ref('CNY');
const showCreateForm = ref(false);
const editingId = ref(0);
const saving = ref(false);
const refreshingFx = ref(false);
const analyticsLoading = ref(false);
const errorText = ref('');
const sourceDrafts = reactive({
  alipay: {
    targetAccountId: '',
    nightlyEnabled: true
  },
  wechat: {
    targetAccountId: '',
    nightlyEnabled: true
  },
  bankcard: {
    targetAccountId: '',
    nightlyEnabled: true
  }
});
const bindSessions = reactive({
  alipay: null,
  wechat: null,
  bankcard: null
});
const importJobs = reactive({
  alipay: null,
  wechat: null,
  bankcard: null
});

const filterPreset = ref('30d');
const filterFromDate = ref('');
const filterToDate = ref('');
const filterChannelCode = ref('');
const filterAccountId = ref('');
const filterDirection = ref('');

let filterRefreshTimer = 0;
const bindPollTimers = new Map();
const importJobPollTimers = new Map();

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

const canToggleCreateForm = computed(() =>
  section.value !== BALANCE_SECTION_OVERVIEW && section.value !== BALANCE_SECTION_SOURCES
);

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

const sourceAccountMap = computed(() => {
  const map = new Map();
  sourceAccounts.value.forEach((item) => {
    if (!item?.provider) return;
    map.set(item.provider, item);
  });
  return map;
});

const transactionPresetCategories = computed(() =>
  transactionDraft.direction === 'INCOME' ? INCOME_CATEGORY_OPTIONS : EXPENSE_CATEGORY_OPTIONS
);

const transactionCategoryPreset = computed({
  get() {
    const normalized = normalizeDraftCategory(transactionDraft.category);
    if (!normalized) return DEFAULT_CATEGORY_NAME;
    if (transactionPresetCategories.value.includes(normalized)) {
      return normalized;
    }
    return CUSTOM_CATEGORY_VALUE;
  },
  set(value) {
    const normalized = String(value || '').trim();
    if (!normalized) {
      transactionDraft.category = DEFAULT_CATEGORY_NAME;
      return;
    }
    if (normalized === CUSTOM_CATEGORY_VALUE) {
      const current = normalizeDraftCategory(transactionDraft.category);
      if (!current || transactionPresetCategories.value.includes(current)) {
        transactionDraft.category = '';
      }
      return;
    }
    transactionDraft.category = normalized;
  }
});

const isTransactionCategoryCustom = computed(() => transactionCategoryPreset.value === CUSTOM_CATEGORY_VALUE);

const editingTransactionItem = computed(() => {
  if (section.value !== BALANCE_SECTION_TRANSACTIONS || editingId.value <= 0) return null;
  return transactions.value.find((item) => Number(item.transactionId) === Number(editingId.value)) || null;
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

const expenseCategoryRows = computed(() =>
  buildCategoryBreakdownRows(analytics.value?.expenseCategoryBreakdown || [], 10)
);

const incomeCategoryRows = computed(() =>
  buildCategoryBreakdownRows(analytics.value?.incomeCategoryBreakdown || [], 10)
);

const expenseCategoryGradient = computed(() => buildCategoryDonutGradient(expenseCategoryRows.value, DONUT_PALETTE_EXPENSE));
const incomeCategoryGradient = computed(() => buildCategoryDonutGradient(incomeCategoryRows.value, DONUT_PALETTE_INCOME));

const savingsAlert = computed(() => resolveSavingsAlert(analytics.value?.summary || {}));

const savingsAlertBarStyle = computed(() => {
  if (savingsAlert.value.state === 'over') {
    return {
      background: 'linear-gradient(90deg, rgba(38, 38, 44, 0.95), rgba(24, 24, 28, 0.95))'
    };
  }
  if (savingsAlert.value.state === 'neutral') {
    return {
      background: 'linear-gradient(90deg, rgba(138, 146, 158, 0.6), rgba(168, 176, 188, 0.6))'
    };
  }
  const expensePercent = Math.max(0, Math.min(100, Number(savingsAlert.value.expensePercent || 0)));
  return {
    background: `linear-gradient(90deg,
      rgba(231, 103, 134, 0.92) 0% ${expensePercent}%,
      rgba(86, 182, 118, 0.92) ${expensePercent}% 100%)`
  };
});

const savingsAlertText = computed(() => {
  if (savingsAlert.value.state === 'over') {
    return `支出超额 ${Number(savingsAlert.value.overspendRate || 0).toFixed(2)}%`;
  }
  if (savingsAlert.value.state === 'neutral') {
    return '暂无收支数据';
  }
  return `本期储蓄率 ${Number(savingsAlert.value.savingsRate || 0).toFixed(2)}%`;
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

function normalizeDraftCategory(value) {
  const normalized = String(value || '').trim();
  return normalized || '';
}

function resolvePresetCategoriesByDirection(direction) {
  return String(direction || '').trim().toUpperCase() === 'INCOME'
    ? INCOME_CATEGORY_OPTIONS
    : EXPENSE_CATEGORY_OPTIONS;
}

function normalizeTransactionCategoryForSave() {
  const category = normalizeDraftCategory(transactionDraft.category);
  return category || DEFAULT_CATEGORY_NAME;
}

function buildCategoryDonutGradient(rows, palette) {
  const normalizedRows = Array.isArray(rows) ? rows : [];
  if (!normalizedRows.length) {
    return 'conic-gradient(rgba(159, 169, 184, 0.55) 0 100%)';
  }
  let cursor = 0;
  const segments = normalizedRows.map((item, index) => {
    const color = palette[index % palette.length];
    const rawRatio = Math.max(0, Number(item?.ratioPercent || 0));
    const next = index === normalizedRows.length - 1
      ? 100
      : Math.min(100, cursor + rawRatio);
    const segment = `${color} ${cursor.toFixed(4)}% ${next.toFixed(4)}%`;
    cursor = next;
    return segment;
  });
  if (cursor < 100) {
    segments.push(`rgba(210, 217, 229, 0.72) ${cursor.toFixed(4)}% 100%`);
  }
  return `conic-gradient(${segments.join(',')})`;
}

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

function sortSourceAccounts(items) {
  const orderMap = new Map(SOURCE_PROVIDERS.map((provider, index) => [provider, index]));
  return (Array.isArray(items) ? items : []).slice().sort((left, right) => {
    const leftOrder = orderMap.get(String(left?.provider || '').toLowerCase()) ?? 99;
    const rightOrder = orderMap.get(String(right?.provider || '').toLowerCase()) ?? 99;
    if (leftOrder !== rightOrder) return leftOrder - rightOrder;
    return String(left?.providerLabel || left?.provider || '').localeCompare(String(right?.providerLabel || right?.provider || ''));
  });
}

function sourceProviderLabel(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  return SOURCE_PROVIDER_LABELS[normalized] || normalized || '账单源';
}

function sourceProviderHint(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  return SOURCE_PROVIDER_HINTS[normalized] || '由服务器自动同步账单。';
}

function sourceProviderMode(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  return SOURCE_PROVIDER_MODES[normalized] || '自动同步';
}

function sourceImportDirectory(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  return SOURCE_PROVIDER_IMPORT_DIRECTORIES[normalized] || '';
}

function sourceSupportsQrBind(provider) {
  return String(provider || '').trim().toLowerCase() === 'alipay';
}

function sourceAccountTemplate(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  return SOURCE_PROVIDER_DEFAULT_ACCOUNTS[normalized] || {
    channelCode: normalized || 'manual',
    channelName: sourceProviderLabel(normalized),
    accountName: `${sourceProviderLabel(normalized)}账户`
  };
}

function resolveUniqueSourceAccountName(baseName) {
  const normalizedBase = String(baseName || '').trim() || '默认账户';
  const existing = new Set(accounts.value.map((item) => String(item?.accountName || '').trim()).filter(Boolean));
  if (!existing.has(normalizedBase)) {
    return normalizedBase;
  }
  let cursor = 2;
  while (existing.has(`${normalizedBase} ${cursor}`)) {
    cursor += 1;
  }
  return `${normalizedBase} ${cursor}`;
}

function buildDefaultSourceAccountPayload(provider) {
  const template = sourceAccountTemplate(provider);
  return {
    channelCode: template.channelCode,
    channelName: template.channelName,
    accountName: resolveUniqueSourceAccountName(template.accountName),
    currencyCode: String(baseCurrency.value || 'CNY').trim().toUpperCase() || 'CNY',
    balanceAmount: 0
  };
}

function findRecommendedSourceAccount(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  const byChannel = accounts.value.filter((item) => String(item?.channelCode || '').trim().toLowerCase() === normalized);
  if (byChannel.length === 1) {
    return byChannel[0];
  }
  if (byChannel.length > 1) {
    const template = sourceAccountTemplate(normalized);
    const exactName = byChannel.find((item) => String(item?.accountName || '').trim() === template.accountName);
    if (exactName) {
      return exactName;
    }
  }
  if (accounts.value.length === 1) {
    return accounts.value[0];
  }
  return null;
}

function sourceAccountShortcutLabel(provider) {
  const recommended = findRecommendedSourceAccount(provider);
  if (recommended?.accountName) {
    return `使用 ${recommended.accountName}`;
  }
  return '一键新建默认账户';
}

function sourceBindActionLabel(provider) {
  const bound = Boolean(resolveSourceStatus(provider).bound);
  const normalized = String(provider || '').trim().toLowerCase();
  if (normalized === 'alipay') {
    return bound ? '重新扫码绑定' : '扫码绑定';
  }
  if (normalized === 'wechat') {
    return bound ? '重连目录导入' : '启用目录导入';
  }
  if (normalized === 'bankcard') {
    return bound ? '重连工资卡目录' : '启用工资卡目录';
  }
  return bound ? '重新绑定' : '绑定来源';
}

function sourceTargetHint(provider) {
  const draft = resolveSourceDraft(provider);
  const selectedId = Number(draft.targetAccountId || resolveSourceStatus(provider).targetAccountId);
  if (Number.isInteger(selectedId) && selectedId > 0) {
    const matched = accounts.value.find((item) => item.accountId === selectedId);
    const accountName = matched?.accountName || resolveSourceStatus(provider).targetAccountName || `账户#${selectedId}`;
    return `账单会先记到本地账户「${accountName}」`;
  }
  if (!accounts.value.length) {
    return '还没有本地账户。直接点下面的按钮，系统会自动创建一个默认账户再继续绑定。';
  }
  return sourceSupportsQrBind(provider)
    ? '可以先手动选已有账户，也可以直接扫码绑定，系统会自动补一个默认账户。'
    : '可以先手动选已有账户，也可以直接启用目录导入，系统会自动补一个默认账户。';
}

function sourceSessionTitle(provider, session) {
  const status = String(session?.status || '').trim().toUpperCase();
  if (sourceSupportsQrBind(provider) && status === 'PENDING') {
    return '请用支付宝扫码';
  }
  if (sourceSupportsQrBind(provider) && status === 'BOUND') {
    return '扫码绑定成功';
  }
  if (!sourceSupportsQrBind(provider) && status === 'BOUND') {
    return '目录导入已启用';
  }
  return `绑定会话：${formatSourceStatus(status)}`;
}

function sourceSessionHint(provider, session) {
  const status = String(session?.status || '').trim().toUpperCase();
  if (sourceSupportsQrBind(provider)) {
    if (status === 'PENDING') {
      return '二维码生成后，用支付宝 App 扫码并在手机上确认登录。';
    }
    if (status === 'BOUND') {
      return '扫码完成，后续会复用服务器登录态抓取支付宝账单。';
    }
    if (status === 'FAILED' || status === 'EXPIRED') {
      return '二维码失效后可以再次点击“扫码绑定”。';
    }
    return '系统正在检查当前绑定状态。';
  }
  const directory = sourceImportDirectory(provider);
  if (directory) {
    return `这个来源不走扫码，把导出的账单文件放进 ${directory} 就可以被同步任务读取。`;
  }
  return '这个来源当前不需要二维码，接通后会直接进入服务器侧导入模式。';
}

function resolveSourceDraft(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  return sourceDrafts[normalized] || sourceDrafts[SOURCE_PROVIDERS[0]];
}

function resolveSourceStatus(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  return sourceAccountMap.value.get(normalized) || {
    provider: normalized,
    providerLabel: sourceProviderLabel(normalized),
    bound: false,
    status: 'UNBOUND',
    targetAccountId: null,
    targetAccountName: '',
    targetCurrencyCode: '',
    nightlyEnabled: Boolean(resolveSourceDraft(normalized)?.nightlyEnabled),
    lastVerifiedAt: '',
    lastSyncedAt: '',
    lastSyncStatus: '',
    lastSyncErrorText: '',
    activeBindSessionId: '',
    activeBindSessionStatus: '',
    activeBindSessionExpiresAt: '',
    updatedAt: ''
  };
}

function applySourceDraftsFromStatus() {
  SOURCE_PROVIDERS.forEach((provider) => {
    const item = resolveSourceStatus(provider);
    const draft = resolveSourceDraft(provider);
    draft.targetAccountId = item.targetAccountId ? String(item.targetAccountId) : '';
    draft.nightlyEnabled = Boolean(item.nightlyEnabled);
  });
}

function clearBindPoll(provider) {
  if (!bindPollTimers.has(provider)) return;
  window.clearTimeout(bindPollTimers.get(provider));
  bindPollTimers.delete(provider);
}

function clearImportJobPoll(provider) {
  if (!importJobPollTimers.has(provider)) return;
  window.clearTimeout(importJobPollTimers.get(provider));
  importJobPollTimers.delete(provider);
}

function clearAllSourcePolling() {
  SOURCE_PROVIDERS.forEach((provider) => {
    clearBindPoll(provider);
    clearImportJobPoll(provider);
  });
}

function isTerminalBindSessionStatus(status) {
  return TERMINAL_BIND_STATUSES.has(String(status || '').trim().toUpperCase());
}

function isTerminalImportJobStatus(status) {
  return TERMINAL_IMPORT_JOB_STATUSES.has(String(status || '').trim().toUpperCase());
}

function buildSourcePayload(provider) {
  const draft = resolveSourceDraft(provider);
  return {
    targetAccountId: draft.targetAccountId ? Number(draft.targetAccountId) : null,
    nightlyEnabled: Boolean(draft.nightlyEnabled)
  };
}

function formatSourceStatus(status) {
  switch (String(status || '').trim().toUpperCase()) {
    case 'BOUND':
      return '已绑定';
    case 'PENDING':
      return '等待扫码';
    case 'REAUTH_REQUIRED':
      return '需要重绑';
    default:
      return '未绑定';
  }
}

function formatImportJobStatus(status) {
  switch (String(status || '').trim().toUpperCase()) {
    case 'RUNNING':
      return '同步中';
    case 'SUCCESS':
      return '已完成';
    case 'FAILED':
      return '失败';
    default:
      return '排队中';
  }
}

function syncBindSessionsFromStatus() {
  SOURCE_PROVIDERS.forEach((provider) => {
    const item = resolveSourceStatus(provider);
    if (item.activeBindSessionId && !isTerminalBindSessionStatus(item.activeBindSessionStatus)) {
      bindSessions[provider] = {
        provider,
        sessionId: item.activeBindSessionId,
        status: item.activeBindSessionStatus || 'PENDING',
        loginUrl: bindSessions[provider]?.loginUrl || '',
        qrCodePayload: bindSessions[provider]?.qrCodePayload || '',
        qrCodeImageDataUrl: bindSessions[provider]?.qrCodeImageDataUrl || '',
        expiresAt: item.activeBindSessionExpiresAt || bindSessions[provider]?.expiresAt || '',
        completedAt: bindSessions[provider]?.completedAt || '',
        failureReason: bindSessions[provider]?.failureReason || ''
      };
      scheduleBindSessionPoll(provider, item.activeBindSessionId, 1600);
      return;
    }
    if (isTerminalBindSessionStatus(bindSessions[provider]?.status)) {
      clearBindPoll(provider);
      return;
    }
    if (!item.activeBindSessionId) {
      clearBindPoll(provider);
    }
  });
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

async function loadRemoteSourceSync(prefetchedList = null) {
  const list = Array.isArray(prefetchedList)
    ? prefetchedList
    : await listLightAppBalanceSourceAccountStatus(auth.authorizedFetch);
  sourceAccounts.value = sortSourceAccounts(list);
  applySourceDraftsFromStatus();
  syncBindSessionsFromStatus();
  writeRemoteLightAppCache({
    balanceSourceAccounts: sourceAccounts.value
  });
}

function scheduleBindSessionPoll(provider, sessionId, delayMs = 2400) {
  clearBindPoll(provider);
  bindPollTimers.set(
    provider,
    window.setTimeout(() => {
      void pollBindSession(provider, sessionId);
    }, delayMs)
  );
}

function scheduleImportJobPoll(provider, jobId, delayMs = 2000) {
  clearImportJobPoll(provider);
  importJobPollTimers.set(
    provider,
    window.setTimeout(() => {
      void pollImportJob(provider, jobId);
    }, delayMs)
  );
}

async function pollBindSession(provider, sessionId) {
  clearBindPoll(provider);
  try {
    await auth.ensureReady();
    if (!auth.isAuthenticated.value) return;
    const session = await getLightAppBalanceBindSession(provider, sessionId, auth.authorizedFetch);
    bindSessions[provider] = session;
    if (isTerminalBindSessionStatus(session.status)) {
      await loadRemoteAll();
      return;
    }
    scheduleBindSessionPoll(provider, sessionId);
  } catch (error) {
    errorText.value = error?.message || '数据源绑定状态刷新失败';
  }
}

async function pollImportJob(provider, jobId) {
  clearImportJobPoll(provider);
  try {
    await auth.ensureReady();
    if (!auth.isAuthenticated.value) return;
    const job = await getLightAppBalanceImportJob(jobId, auth.authorizedFetch);
    importJobs[provider] = job;
    if (isTerminalImportJobStatus(job.status)) {
      await loadRemoteAll();
      return;
    }
    scheduleImportJobPoll(provider, jobId);
  } catch (error) {
    errorText.value = error?.message || '账单同步任务刷新失败';
  }
}

function openAccountsWorkspace() {
  section.value = BALANCE_SECTION_ACCOUNTS;
  resetEditing();
  showCreateForm.value = true;
}

async function createDefaultSourceAccount(provider) {
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) {
    throw new Error('登录后才能创建本地账户');
  }
  const created = await createLightAppBalanceAccount(buildDefaultSourceAccountPayload(provider), auth.authorizedFetch);
  accounts.value = sortBySortNumAndId([...accounts.value, created], 'accountId');
  resolveSourceDraft(provider).targetAccountId = String(created.accountId);
  writeRemoteLightAppCache({
    balanceAccounts: accounts.value
  });
  return created;
}

async function pickOrCreateSourceAccount(provider) {
  errorText.value = '';
  try {
    const recommended = findRecommendedSourceAccount(provider);
    if (recommended?.accountId > 0) {
      resolveSourceDraft(provider).targetAccountId = String(recommended.accountId);
      return recommended.accountId;
    }
    const created = await createDefaultSourceAccount(provider);
    return created.accountId;
  } catch (error) {
    errorText.value = error?.message || '默认账户创建失败';
    return 0;
  }
}

async function ensureSourceTargetAccount(provider) {
  const draft = resolveSourceDraft(provider);
  const explicitId = Number(draft.targetAccountId);
  if (Number.isInteger(explicitId) && explicitId > 0) {
    return explicitId;
  }
  const statusId = Number(resolveSourceStatus(provider).targetAccountId);
  if (Number.isInteger(statusId) && statusId > 0) {
    draft.targetAccountId = String(statusId);
    return statusId;
  }
  const recommendedId = await pickOrCreateSourceAccount(provider);
  if (Number.isInteger(recommendedId) && recommendedId > 0) {
    draft.targetAccountId = String(recommendedId);
    return recommendedId;
  }
  throw new Error('请先选择或创建一个本地账户');
}

async function saveSourceAccount(provider) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (!auth.isAuthenticated.value) {
      throw new Error('登录后才能配置自动抓账');
    }
    await updateLightAppBalanceSourceAccount(provider, buildSourcePayload(provider), auth.authorizedFetch);
    await loadRemoteSourceSync();
  } catch (error) {
    errorText.value = error?.message || '数据源配置保存失败';
  }
}

async function beginSourceBind(provider) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (!auth.isAuthenticated.value) {
      throw new Error('登录后才能绑定数据源');
    }
    const payload = buildSourcePayload(provider);
    payload.targetAccountId = await ensureSourceTargetAccount(provider);
    const session = await createLightAppBalanceBindSession(provider, payload, auth.authorizedFetch);
    bindSessions[provider] = session;
    if (isTerminalBindSessionStatus(session.status)) {
      await loadRemoteAll();
      return;
    }
    scheduleBindSessionPoll(provider, session.sessionId, 1200);
    await loadRemoteSourceSync();
  } catch (error) {
    errorText.value = error?.message || '数据源绑定创建失败';
  }
}

async function triggerSourceSync(provider) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (!auth.isAuthenticated.value) {
      throw new Error('登录后才能同步账单');
    }
    const job = await createLightAppBalanceImportJob(provider, auth.authorizedFetch);
    importJobs[provider] = job;
    scheduleImportJobPoll(provider, job.jobId, 1200);
    await loadRemoteSourceSync();
  } catch (error) {
    errorText.value = error?.message || '账单同步任务创建失败';
  }
}

async function loadRemoteAll() {
  const currentBase = String(baseCurrency.value || 'CNY').toUpperCase();
  const [accountList, transactionList, debtList, recurringList, overviewData, rates, sourceStatusList] = await Promise.all([
    listLightAppBalanceAccounts(auth.authorizedFetch),
    listLightAppBalanceTransactions(auth.authorizedFetch),
    listLightAppBalanceDebts(auth.authorizedFetch),
    listLightAppBalanceRecurringCharges(auth.authorizedFetch),
    getLightAppBalanceOverview(currentBase, auth.authorizedFetch),
    listLightAppFxRates(currentBase, auth.authorizedFetch),
    listLightAppBalanceSourceAccountStatus(auth.authorizedFetch)
  ]);

  accounts.value = sortBySortNumAndId(accountList, 'accountId');
  transactions.value = sortTransactions(transactionList);
  debts.value = sortBySortNumAndId(debtList, 'debtId');
  recurringCharges.value = sortBySortNumAndId(recurringList, 'recurringChargeId');
  overview.value = overviewData || overview.value;
  fxRates.value = sortBySortNumAndId(rates, 'quoteCurrency');
  sourceAccounts.value = sortSourceAccounts(sourceStatusList);
  applySourceDraftsFromStatus();
  syncBindSessionsFromStatus();
  if (overview.value?.baseCurrency) {
    baseCurrency.value = String(overview.value.baseCurrency).toUpperCase();
  }

  writeRemoteLightAppCache({
    balanceAccounts: accounts.value,
    balanceTransactions: transactions.value,
    balanceDebts: debts.value,
    balanceRecurringCharges: recurringCharges.value,
    balanceSourceAccounts: sourceAccounts.value,
    balanceOverview: overview.value,
    balanceFxRates: fxRates.value
  });

  await refreshAnalyticsData();
}

async function hydrate() {
  errorText.value = '';
  await auth.ensureReady();

  if (!auth.isAuthenticated.value) {
    clearAllSourcePolling();
    SOURCE_PROVIDERS.forEach((provider) => {
      bindSessions[provider] = null;
      importJobs[provider] = null;
    });
    sourceAccounts.value = [];
    applySourceDraftsFromStatus();
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
    sourceAccounts.value = sortSourceAccounts(cache.balanceSourceAccounts || []);
    applySourceDraftsFromStatus();
    syncBindSessionsFromStatus();
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
  if (!canToggleCreateForm.value) {
    showCreateForm.value = false;
    return;
  }
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
  transactionDraft.category = DEFAULT_CATEGORY_NAME;
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
    category: normalizeTransactionCategoryForSave(),
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
  transactionDraft.category = normalizeDraftCategory(item.category) || DEFAULT_CATEGORY_NAME;
  transactionDraft.note = item.note || '';
  transactionDraft.occurredAt = toLocalInput(item.occurredAt);
}

function handleTransactionRowClick(item, event) {
  if (!item) return;
  const target = event?.target;
  if (target && typeof target.closest === 'function' && target.closest('.list-actions')) {
    return;
  }
  startEditTransaction(item);
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
  () => transactionDraft.direction,
  (next, prev) => {
    const currentCategory = normalizeDraftCategory(transactionDraft.category);
    if (!currentCategory) {
      transactionDraft.category = DEFAULT_CATEGORY_NAME;
      return;
    }
    const previousPreset = resolvePresetCategoriesByDirection(prev);
    const nextPreset = resolvePresetCategoriesByDirection(next);
    if (previousPreset.includes(currentCategory) && !nextPreset.includes(currentCategory)) {
      transactionDraft.category = DEFAULT_CATEGORY_NAME;
    }
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
  clearAllSourcePolling();
  registerBalanceSectionChangeHandler(props.windowId, null);
});
</script>

<style scoped>
.lightapp-window {
  --glass-rgb: 34, 48, 80;
  --glass-bg-alpha: 0.58;
  --glass-border-alpha: 0.22;
  --glass-shadow-alpha: 0.18;
  --la-border: rgba(136, 166, 212, 0.26);
  --la-input-bg: rgba(8, 16, 30, 0.94);
  --la-btn-bg: rgba(18, 31, 56, 0.9);
  --la-panel-bg: rgba(12, 21, 39, 0.9);
  --la-card-bg: rgba(15, 26, 47, 0.92);
  --la-text: rgba(242, 246, 255, 0.96);
  --la-muted: rgba(172, 188, 215, 0.82);
  --la-danger: rgba(255, 136, 159, 0.96);
  --la-income: rgba(114, 217, 158, 0.94);
  --theme-text-primary: var(--la-text);
  --theme-text-secondary: rgba(190, 204, 229, 0.82);
  --theme-icon-primary: rgba(236, 242, 255, 0.94);
  --theme-border: rgba(136, 166, 212, 0.24);
  --theme-border-strong: rgba(168, 190, 226, 0.34);
  --theme-divider-soft: rgba(168, 190, 226, 0.16);
  --theme-surface-soft: rgba(18, 29, 52, 0.9);
  --theme-surface-elevated: rgba(20, 32, 56, 0.92);
  --theme-panel-surface: linear-gradient(180deg, rgba(16, 28, 50, 0.94), rgba(10, 18, 34, 0.92));
  --theme-panel-surface-elevated: linear-gradient(180deg, rgba(20, 33, 58, 0.94), rgba(13, 22, 41, 0.92));
  --theme-floating-surface: rgba(18, 31, 56, 0.82);
  --theme-floating-surface-hover: rgba(28, 46, 80, 0.94);
  --theme-contrast-text-shadow: 0 1px 0 rgba(0, 0, 0, 0.18);
  --theme-contrast-text-shadow-soft: 0 1px 0 rgba(0, 0, 0, 0.12);
  --theme-contrast-icon-shadow: 0 1px 1px rgba(0, 0, 0, 0.24);
  display: grid;
  gap: 10px;
  min-width: 0;
  color: var(--la-text);
  padding: 2px;
  background:
    radial-gradient(circle at top right, rgba(244, 164, 109, 0.18), transparent 34%),
    radial-gradient(circle at top left, rgba(93, 141, 255, 0.16), transparent 28%),
    linear-gradient(180deg, rgba(8, 14, 26, 0.98), rgba(10, 18, 34, 0.96));
  border-radius: 18px;
}

.lightapp-window .liquid-material {
  background: var(--liquid-bg, var(--theme-panel-surface-elevated)) !important;
  border-color: var(--liquid-border, var(--theme-border)) !important;
  box-shadow: var(--liquid-shadow, 0 16px 34px rgba(4, 10, 22, 0.2)) !important;
  backdrop-filter: blur(14px) saturate(114%) !important;
  -webkit-backdrop-filter: blur(14px) saturate(114%) !important;
}

.toolbar-hint {
  margin-left: auto;
  color: var(--la-muted);
  font-size: 12px;
}

.toolbar-tab-btn {
  width: 30px;
  height: 30px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.compact-select {
  min-width: 86px;
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  border-radius: 10px;
  color: var(--la-text);
  padding: 6px 8px;
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.04);
}

.icon-btn {
  border: 1px solid var(--la-border);
  background: linear-gradient(180deg, rgba(22, 38, 67, 0.94), rgba(15, 26, 46, 0.92));
  color: var(--la-text);
  border-radius: 10px;
  box-shadow:
    inset 0 1px 0 rgba(255, 255, 255, 0.08),
    0 10px 20px rgba(3, 8, 18, 0.18);
  transition:
    transform 140ms ease,
    border-color 140ms ease,
    background-color 140ms ease,
    box-shadow 180ms ease;
}

.icon-btn:hover {
  transform: translateY(-1px);
  border-color: rgba(161, 195, 255, 0.48);
  background: linear-gradient(180deg, rgba(27, 49, 86, 0.96), rgba(17, 31, 55, 0.94));
  box-shadow:
    inset 0 1px 0 rgba(255, 255, 255, 0.1),
    0 12px 24px rgba(3, 8, 18, 0.22);
}

.icon-btn.is-active,
.toolbar-tab-btn.is-active {
  border-color: rgba(246, 176, 131, 0.5);
  background: linear-gradient(180deg, rgba(115, 74, 55, 0.92), rgba(86, 51, 36, 0.9));
  color: rgba(255, 241, 230, 0.98);
  box-shadow:
    inset 0 1px 0 rgba(255, 226, 202, 0.24),
    0 14px 28px rgba(48, 21, 7, 0.24);
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
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.04);
}

.create-form input::placeholder {
  color: rgba(148, 170, 205, 0.74);
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

.source-sync-section {
  display: grid;
  gap: 10px;
}

.source-guide {
  --liquid-bg: rgba(11, 21, 39, 0.88);
  --liquid-border: rgba(159, 182, 227, 0.24);
  border-radius: 16px;
  padding: 14px;
  display: grid;
  gap: 12px;
  box-shadow: 0 18px 40px rgba(4, 10, 22, 0.22);
}

.source-guide-header {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  gap: 12px;
}

.source-guide-header h4,
.source-guide-header p {
  margin: 0;
}

.source-guide-header h4 {
  font-size: 16px;
  letter-spacing: 0.2px;
}

.source-guide-header p {
  margin-top: 4px;
  max-width: 78ch;
  color: var(--la-muted);
  font-size: 12px;
  line-height: 1.6;
}

.source-guide-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
}

.source-guide-step {
  border: 1px solid rgba(130, 160, 205, 0.18);
  border-radius: 14px;
  padding: 12px;
  display: grid;
  gap: 8px;
  background: linear-gradient(180deg, rgba(19, 33, 59, 0.72), rgba(12, 20, 37, 0.78));
}

.source-guide-step strong,
.source-guide-step p {
  margin: 0;
}

.source-guide-step strong {
  font-size: 13px;
}

.source-guide-step p {
  color: var(--la-muted);
  font-size: 12px;
  line-height: 1.55;
}

.source-step-badge {
  width: 24px;
  height: 24px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  border-radius: 999px;
  background: rgba(244, 161, 115, 0.16);
  border: 1px solid rgba(248, 182, 141, 0.3);
  color: rgba(255, 224, 201, 0.98);
  font-size: 12px;
  font-weight: 700;
}

.source-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.source-card {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  --source-accent: rgba(134, 175, 244, 0.82);
  position: relative;
  overflow: hidden;
  border-radius: 16px;
  padding: 14px;
  display: grid;
  gap: 10px;
  box-shadow: 0 18px 40px rgba(4, 10, 22, 0.18);
}

.source-card::before {
  content: '';
  position: absolute;
  inset: 0 0 auto 0;
  height: 1px;
  background: linear-gradient(90deg, transparent, var(--source-accent), transparent);
}

.source-card.provider-alipay {
  --source-accent: rgba(107, 171, 255, 0.92);
}

.source-card.provider-wechat {
  --source-accent: rgba(107, 210, 147, 0.9);
}

.source-card.provider-bankcard {
  --source-accent: rgba(247, 186, 125, 0.92);
}

.source-card-header {
  display: flex;
  justify-content: space-between;
  gap: 12px;
  align-items: flex-start;
}

.source-card-header h4,
.source-card-header p,
.source-meta p,
.source-session p,
.source-job p {
  margin: 0;
}

.source-card-header h4 {
  font-size: 15px;
  letter-spacing: 0.2px;
}

.source-card-header p,
.source-meta p,
.source-session small,
.source-job small {
  color: var(--la-muted);
  font-size: 12px;
}

.source-provider-hint {
  display: block;
  margin-top: 4px;
  color: var(--la-muted);
  font-size: 12px;
  line-height: 1.45;
}

.source-provider-mode {
  display: inline-flex;
  align-items: center;
  margin-top: 6px;
  padding: 3px 8px;
  width: fit-content;
  border-radius: 999px;
  background: rgba(103, 139, 198, 0.14);
  border: 1px solid rgba(129, 164, 220, 0.22);
  color: rgba(214, 226, 248, 0.94);
  font-size: 11px;
  letter-spacing: 0.2px;
}

.source-status-pill {
  border-radius: 999px;
  padding: 5px 10px;
  font-size: 11px;
  background: rgba(119, 139, 168, 0.14);
  border: 1px solid rgba(147, 172, 211, 0.2);
  color: rgba(214, 224, 241, 0.84);
  white-space: nowrap;
}

.source-status-pill.is-bound {
  color: rgba(188, 245, 213, 0.96);
  background: rgba(81, 180, 123, 0.16);
  border-color: rgba(99, 196, 139, 0.26);
}

.source-status-pill.is-pending {
  color: rgba(255, 228, 177, 0.96);
  background: rgba(244, 188, 86, 0.16);
  border-color: rgba(249, 201, 114, 0.24);
}

.source-status-pill.is-danger {
  color: rgba(255, 199, 212, 0.96);
  background: rgba(232, 115, 144, 0.16);
  border-color: rgba(244, 136, 167, 0.24);
}

.source-config-grid {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
  align-items: center;
}

.source-config-grid select {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 10px;
  padding: 8px 10px;
  min-width: 0;
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.04);
}

.source-inline-hint-row {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  gap: 10px;
}

.source-inline-tip {
  flex: 1;
  color: var(--la-muted);
  font-size: 12px;
  line-height: 1.5;
}

.source-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.source-session,
.source-job {
  --liquid-bg: rgba(18, 31, 54, 0.74);
  --liquid-border: rgba(136, 164, 209, 0.2);
  border-radius: 12px;
  padding: 10px;
  display: grid;
  gap: 8px;
}

.source-session-title {
  margin: 0;
  font-size: 13px;
  font-weight: 700;
}

.source-session-hint {
  line-height: 1.55;
}

.source-qr-image {
  width: min(100%, 220px);
  aspect-ratio: 1 / 1;
  object-fit: contain;
  border-radius: 12px;
  border: 1px solid rgba(161, 187, 229, 0.24);
  background: rgba(255, 255, 255, 0.96);
  padding: 8px;
}

.source-qr-fallback {
  display: block;
  border-radius: 10px;
  padding: 10px;
  background: rgba(7, 15, 28, 0.76);
  border: 1px dashed rgba(151, 180, 227, 0.28);
  color: var(--la-text);
  white-space: pre-wrap;
  overflow-wrap: anywhere;
}

.source-session-link {
  color: rgba(153, 205, 255, 0.96);
  font-size: 12px;
  text-decoration: none;
}

.source-session-link:hover {
  text-decoration: underline;
}

.source-meta {
  display: grid;
  gap: 4px;
}

.source-directory-tip code {
  padding: 2px 6px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.06);
  color: rgba(220, 232, 248, 0.94);
}

.metrics-strip {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
  align-items: stretch;
  min-width: 0;
}

.metric-card {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  --liquid-shadow:
    0 12px 28px rgba(4, 10, 22, 0.18),
    inset 0 1px 0 rgba(255, 255, 255, 0.04);
  border-radius: 12px;
  padding: clamp(7px, 1.2vw, 10px) clamp(8px, 1.5vw, 12px);
  display: grid;
  gap: 4px;
  min-width: 0;
}

.metric-card p {
  margin: 0;
  font-size: clamp(10px, 1.2vw, 12px);
  color: var(--la-muted);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.metric-card strong {
  font-size: clamp(12px, 1.8vw, 16px);
  letter-spacing: 0.2px;
  line-height: 1.2;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.filters-bar {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  --liquid-shadow:
    0 14px 28px rgba(4, 10, 22, 0.18),
    inset 0 1px 0 rgba(255, 255, 255, 0.03);
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
  border: 1px solid rgba(153, 176, 214, 0.22);
  background: rgba(18, 31, 56, 0.72);
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
  border-color: rgba(171, 201, 246, 0.42);
  background: rgba(24, 41, 73, 0.88);
}

.filter-chip.active {
  border-color: rgba(247, 176, 129, 0.48);
  background: rgba(112, 72, 50, 0.82);
  color: rgba(255, 236, 220, 0.98);
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
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.04);
}

.create-form input:focus,
.create-form select:focus,
.compact-select:focus,
.source-config-grid select:focus,
.filters-inputs input:focus,
.filters-inputs select:focus {
  outline: none;
  border-color: rgba(247, 177, 129, 0.54);
  box-shadow: 0 0 0 2px rgba(244, 168, 117, 0.16);
}

.charts-zone {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.chart-panel {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  --liquid-shadow:
    0 16px 30px rgba(4, 10, 22, 0.18),
    inset 0 1px 0 rgba(255, 255, 255, 0.03);
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
.category-legend,
.savings-meta {
  display: grid;
  gap: 6px;
}

.trend-row {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  gap: 8px;
  align-items: center;
}

.trend-row span {
  color: var(--la-muted);
  font-size: 12px;
  white-space: nowrap;
  max-width: 118px;
  overflow: hidden;
  text-overflow: ellipsis;
}

.trend-bars {
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

.donut-panel {
  min-height: 208px;
}

.category-donut-wrap {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr);
  align-items: center;
  gap: 12px;
  min-height: 0;
}

.category-donut {
  width: 96px;
  height: 96px;
  border-radius: 50%;
  border: 1px solid rgba(255, 255, 255, 0.5);
  box-shadow:
    inset 0 0 0 11px rgba(250, 252, 255, 0.74),
    0 6px 14px rgba(15, 25, 40, 0.12);
}

.category-legend-item {
  display: flex;
  align-items: center;
  gap: 6px;
  font-size: 12px;
  color: var(--la-muted);
}

.category-name {
  flex: 1;
  min-width: 0;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.dot {
  width: 8px;
  height: 8px;
  border-radius: 50%;
  display: inline-block;
}

.savings-panel {
  min-height: 208px;
}

.savings-visual {
  display: grid;
  gap: 10px;
}

.savings-bar {
  height: 16px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.52);
  box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.14);
}

.savings-text {
  margin: 0;
  font-size: 13px;
  font-weight: 600;
}

.savings-meta {
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 8px;
}

.savings-meta span {
  border: 1px solid rgba(143, 168, 211, 0.18);
  border-radius: 9px;
  background: rgba(17, 28, 49, 0.72);
  padding: 6px 8px;
  font-size: 11px;
  color: var(--la-muted);
}

.overview-panel {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  --liquid-shadow:
    0 14px 28px rgba(4, 10, 22, 0.18),
    inset 0 1px 0 rgba(255, 255, 255, 0.03);
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
  border: 1px solid rgba(143, 168, 211, 0.18);
  border-radius: 10px;
  padding: 8px;
  background: rgba(17, 28, 49, 0.72);
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
  --liquid-shadow:
    0 14px 28px rgba(4, 10, 22, 0.18),
    inset 0 1px 0 rgba(255, 255, 255, 0.03);
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
  border: 1px solid rgba(143, 168, 211, 0.18);
  border-radius: 10px;
  background: rgba(17, 28, 49, 0.72);
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
  --liquid-border: rgba(189, 214, 251, 0.32);
  --liquid-bg: rgba(20, 34, 59, 0.92);
}

.transaction-item {
  cursor: pointer;
}

.transaction-item.is-editing {
  --liquid-border: rgba(247, 177, 129, 0.44);
  --liquid-bg: rgba(86, 56, 40, 0.62);
  box-shadow:
    0 0 0 1px rgba(247, 177, 129, 0.24),
    0 10px 20px rgba(47, 23, 10, 0.18);
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

.text-btn {
  border: 1px solid var(--la-border);
  background: linear-gradient(180deg, rgba(23, 39, 68, 0.92), rgba(16, 27, 48, 0.9));
  color: var(--la-text);
  border-radius: 10px;
  min-height: 32px;
  padding: 0 10px;
  font-size: 12px;
  line-height: 1;
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.05);
  transition:
    transform 140ms ease,
    border-color 140ms ease,
    background-color 140ms ease;
}

.text-btn:hover {
  transform: translateY(-1px);
  border-color: rgba(175, 204, 246, 0.38);
  background: linear-gradient(180deg, rgba(28, 48, 83, 0.96), rgba(19, 33, 58, 0.94));
}

.text-btn.is-primary {
  border-color: rgba(248, 182, 138, 0.46);
  background: linear-gradient(180deg, rgba(126, 81, 58, 0.98), rgba(95, 58, 39, 0.96));
  color: rgba(255, 241, 230, 0.98);
  box-shadow:
    inset 0 1px 0 rgba(255, 227, 205, 0.22),
    0 10px 18px rgba(57, 27, 11, 0.18);
}

.text-btn.is-primary:hover {
  background: linear-gradient(180deg, rgba(140, 90, 65, 1), rgba(109, 67, 46, 0.98));
}

.text-btn.is-subtle {
  background: rgba(17, 28, 49, 0.54);
  border-color: rgba(143, 168, 211, 0.16);
}

.text-btn:disabled,
.icon-btn:disabled {
  opacity: 0.46;
  cursor: not-allowed;
  transform: none;
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

.editing-hint {
  --liquid-bg: rgba(84, 56, 40, 0.64);
  --liquid-border: rgba(247, 177, 129, 0.3);
  border-radius: 10px;
  padding: 8px 10px;
  margin: 0;
  font-size: 12px;
  color: rgba(255, 229, 208, 0.96);
}

@container lightapp-window-body (max-width: 700px) {
  .create-form {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .source-guide-grid,
  .source-grid {
    grid-template-columns: minmax(0, 1fr);
  }

  .source-config-grid {
    grid-template-columns: minmax(0, 1fr);
  }

  .source-guide-header,
  .source-inline-hint-row {
    flex-direction: column;
    align-items: stretch;
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

  .category-donut-wrap {
    grid-template-columns: minmax(0, 1fr);
    justify-items: center;
  }

  .savings-meta {
    grid-template-columns: minmax(0, 1fr);
  }

  .ledger-summary-grid {
    grid-template-columns: minmax(0, 1fr);
  }

  .metrics-strip {
    gap: 8px;
  }
}

@media (max-width: 760px) {
  .metrics-strip {
    gap: 7px;
  }

  .metric-card {
    border-radius: 10px;
  }

  .charts-zone {
    grid-template-columns: minmax(0, 1fr);
  }

  .source-guide-header,
  .source-inline-hint-row {
    flex-direction: column;
    align-items: stretch;
  }

  .source-grid {
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
  .list-item {
    transition-duration: 80ms !important;
  }
}
</style>
