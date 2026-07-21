import fs from 'node:fs/promises';
import path from 'node:path';

function numberValue(value) {
  const numeric = Number(value);
  return Number.isFinite(numeric) ? numeric : 0;
}

function dateParts(timeZone, now) {
  const parts = new Intl.DateTimeFormat('en-CA', {
    timeZone,
    year: 'numeric',
    month: '2-digit',
    day: '2-digit'
  }).formatToParts(now);
  return Object.fromEntries(parts.filter((part) => part.type !== 'literal').map((part) => [part.type, part.value]));
}

export function previousLocalDate(timeZone = 'Asia/Shanghai', now = new Date()) {
  const parts = dateParts(timeZone, now);
  const previous = new Date(Date.UTC(Number(parts.year), Number(parts.month) - 1, Number(parts.day) - 1));
  return previous.toISOString().slice(0, 10);
}

function topCategories(analytics, limit = 3) {
  const rows = Array.isArray(analytics?.expense_category_breakdown) ? analytics.expense_category_breakdown : [];
  return rows.slice(0, limit).map((row) => ({
    category: String(row.category_name || row.categoryName || row.category_code || '未分类'),
    amount: numberValue(row.amount_total ?? row.amountTotal)
  }));
}

export function buildDailyBillingDigest({ analytics, syncSummary, targetDate, timeZone, generatedAt = new Date() }) {
  const summary = analytics?.summary || {};
  const assetSnapshot = analytics?.asset_snapshot || analytics?.assetSnapshot || {};
  return {
    schema_version: 1,
    status: 'success',
    generated_at: generatedAt.toISOString(),
    target_date: targetDate,
    time_zone: timeZone,
    sync: {
      processed_files: numberValue(syncSummary?.processedFiles),
      skipped_files: numberValue(syncSummary?.skippedFiles),
      groups: numberValue(syncSummary?.groups),
      imported_count: numberValue(syncSummary?.importedCount),
      duplicate_count: numberValue(syncSummary?.duplicateCount),
      skipped_count: numberValue(syncSummary?.skippedCount)
    },
    analytics: {
      base_currency: String(analytics?.base_currency || analytics?.baseCurrency || 'CNY'),
      income_total: numberValue(summary.income_total ?? summary.incomeTotal),
      expense_total: numberValue(summary.expense_total ?? summary.expenseTotal),
      net_flow: numberValue(summary.net_flow ?? summary.netFlow),
      tx_count: numberValue(summary.tx_count ?? summary.txCount),
      net_asset: numberValue(assetSnapshot.net_asset ?? assetSnapshot.netAsset),
      top_expense_categories: topCategories(analytics)
    }
  };
}

export async function writeDailyBillingDigest(config, client, syncSummary, options = {}) {
  const timeZone = String(options.timeZone || config.dailyDigestTimeZone || 'Asia/Shanghai');
  const targetDate = options.targetDate || previousLocalDate(timeZone, options.now || new Date());
  const analytics = await client.getBalanceAnalytics({
    baseCurrency: 'CNY',
    fromDatetime: `${targetDate}T00:00:00`,
    toDatetime: `${targetDate}T23:59:59`,
    timeZone
  });
  const digest = buildDailyBillingDigest({ analytics, syncSummary, targetDate, timeZone, generatedAt: options.now || new Date() });
  const target = path.resolve(config.dailyDigestFile);
  await fs.mkdir(path.dirname(target), { recursive: true });
  const temporary = `${target}.tmp`;
  await fs.writeFile(temporary, `${JSON.stringify(digest, null, 2)}\n`, 'utf8');
  await fs.rename(temporary, target);
  return digest;
}
