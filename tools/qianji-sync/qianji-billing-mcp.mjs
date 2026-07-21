#!/usr/bin/env node
/**
 * Local stdio MCP for read-only Shizuki balance data.
 *
 * It deliberately reuses the sync companion's authenticated client but never
 * exposes credentials. Start it only on the local machine; it does not open a
 * network listener and it rejects unbounded transaction queries.
 */
import fs from 'node:fs/promises';
import path from 'node:path';
import readline from 'node:readline';
import { fileURLToPath } from 'node:url';
import { createSiteApiClient, normalizeSyncConfig, parseJsonc } from './qianji-local-sync-lib.mjs';

const scriptDir = path.dirname(fileURLToPath(import.meta.url));
const MAX_TRANSACTIONS = 100;

const tools = [
  {
    name: 'shizuki_billing_analytics',
    description: 'Read aggregate balance analytics for a required time range. Read-only; no credentials are returned.',
    inputSchema: {
      type: 'object', additionalProperties: false,
      required: ['from_datetime', 'to_datetime'],
      properties: {
        from_datetime: { type: 'string', description: 'ISO-8601 date or datetime, inclusive.' },
        to_datetime: { type: 'string', description: 'ISO-8601 date or datetime, inclusive.' },
        time_zone: { type: 'string', default: 'Asia/Shanghai' },
        base_currency: { type: 'string', default: 'CNY' },
        channel_code: { type: 'string' },
        account_id: { type: 'integer', minimum: 1 }
      }
    }
  },
  {
    name: 'shizuki_billing_transactions',
    description: 'Read a bounded, filtered transaction list. Requires a time range; defaults to a privacy-minimized field set.',
    inputSchema: {
      type: 'object', additionalProperties: false,
      required: ['from_datetime', 'to_datetime'],
      properties: {
        from_datetime: { type: 'string', description: 'ISO-8601 date or datetime, inclusive.' },
        to_datetime: { type: 'string', description: 'ISO-8601 date or datetime, inclusive.' },
        time_zone: { type: 'string', default: 'Asia/Shanghai' },
        direction: { type: 'string', enum: ['income', 'expense', 'all'], default: 'all' },
        channel_code: { type: 'string' },
        account_id: { type: 'integer', minimum: 1 },
        limit: { type: 'integer', minimum: 1, maximum: 100, default: 50 },
        include_note: { type: 'boolean', default: false },
        include_raw_payload: { type: 'boolean', default: false, description: 'Only use when necessary; raw external payload may include personal data.' }
      }
    }
  }
];

function error(message, code = -32602) {
  const item = new Error(message);
  item.code = code;
  return item;
}

function requiredRange(args) {
  const fromDatetime = String(args?.from_datetime || '').trim();
  const toDatetime = String(args?.to_datetime || '').trim();
  if (!fromDatetime || !toDatetime) throw error('from_datetime and to_datetime are required');
  const from = Date.parse(fromDatetime);
  const to = Date.parse(toDatetime);
  if (Number.isNaN(from) || Number.isNaN(to) || from > to) throw error('time range must be valid ISO-8601 and ordered');
  if (to - from > 32 * 24 * 60 * 60 * 1000) throw error('time range must not exceed 32 days per request');
  return { fromDatetime, toDatetime };
}

function numberOrZero(value) {
  const numeric = Number(value);
  return Number.isFinite(numeric) ? numeric : 0;
}

export function sanitizeTransaction(transaction, options = {}) {
  const result = {
    transaction_id: transaction?.transactionId ?? transaction?.transaction_id ?? null,
    occurred_at: transaction?.occurredAt ?? transaction?.occurred_at ?? null,
    direction: transaction?.direction ?? null,
    amount: numberOrZero(transaction?.amount),
    currency_code: transaction?.currencyCode ?? transaction?.currency_code ?? 'CNY',
    category: transaction?.categoryName ?? transaction?.category_name ?? transaction?.categoryHint ?? transaction?.category_hint ?? null,
    counterparty: transaction?.counterparty ?? null,
    channel_code: transaction?.channelCode ?? transaction?.channel_code ?? null,
    account_id: transaction?.accountId ?? transaction?.account_id ?? null
  };
  if (options.includeNote) result.note = transaction?.note ?? null;
  if (options.includeRawPayload) result.raw_payload = transaction?.rawPayload ?? transaction?.raw_payload ?? null;
  return result;
}

export function createToolHandler(client) {
  return async (name, args = {}) => {
    const range = requiredRange(args);
    const common = {
      ...range,
      timeZone: String(args.time_zone || 'Asia/Shanghai'),
      channelCode: String(args.channel_code || ''),
      accountId: Number(args.account_id) || 0
    };
    if (name === 'shizuki_billing_analytics') {
      const analytics = await client.getBalanceAnalytics({ ...common, baseCurrency: String(args.base_currency || 'CNY') });
      return { time_range: { from_datetime: range.fromDatetime, to_datetime: range.toDatetime }, analytics };
    }
    if (name === 'shizuki_billing_transactions') {
      const direction = String(args.direction || 'all').toLowerCase();
      if (!['income', 'expense', 'all'].includes(direction)) throw error('direction must be income, expense, or all');
      const limit = Math.min(MAX_TRANSACTIONS, Math.max(1, Number(args.limit) || 50));
      const rows = await client.listBalanceTransactions({ ...common, direction: direction === 'all' ? '' : direction.toUpperCase() });
      return {
        time_range: { from_datetime: range.fromDatetime, to_datetime: range.toDatetime },
        direction, returned_count: Math.min(rows.length, limit), truncated: rows.length > limit,
        transactions: rows.slice(0, limit).map((row) => sanitizeTransaction(row, {
          includeNote: args.include_note === true, includeRawPayload: args.include_raw_payload === true
        }))
      };
    }
    throw error(`unknown tool: ${name}`, -32601);
  };
}

async function loadConfig(configPath) {
  const resolved = path.resolve(configPath || path.join(scriptDir, 'qianji-local-sync.config.jsonc'));
  const raw = await fs.readFile(resolved, 'utf8');
  return normalizeSyncConfig(parseJsonc(raw), { baseDir: path.dirname(resolved) });
}

function parseArgs(argv) {
  const index = argv.indexOf('--config');
  return { configPath: index >= 0 ? argv[index + 1] : '' };
}

function response(id, result) { return { jsonrpc: '2.0', id, result }; }
function failure(id, cause) { return { jsonrpc: '2.0', id, error: { code: cause?.code || -32603, message: cause?.message || 'internal error' } }; }

async function main() {
  const config = await loadConfig(parseArgs(process.argv.slice(2)).configPath);
  const handleTool = createToolHandler(createSiteApiClient(config));
  const input = readline.createInterface({ input: process.stdin, crlfDelay: Infinity });
  for await (const line of input) {
    if (!line.trim()) continue;
    let request;
    try { request = JSON.parse(line); } catch { process.stdout.write(`${JSON.stringify(failure(null, error('invalid JSON', -32700)))}\n`); continue; }
    if (!Object.hasOwn(request, 'id')) continue;
    try {
      if (request.method === 'initialize') {
        process.stdout.write(`${JSON.stringify(response(request.id, {
          protocolVersion: request.params?.protocolVersion || '2025-03-26',
          capabilities: { tools: {} }, serverInfo: { name: 'shizuki-billing', version: '1.0.0' }
        }))}\n`);
      } else if (request.method === 'tools/list') {
        process.stdout.write(`${JSON.stringify(response(request.id, { tools }))}\n`);
      } else if (request.method === 'tools/call') {
        const result = await handleTool(request.params?.name, request.params?.arguments || {});
        process.stdout.write(`${JSON.stringify(response(request.id, { content: [{ type: 'text', text: JSON.stringify(result, null, 2) }], structuredContent: result }))}\n`);
      } else {
        process.stdout.write(`${JSON.stringify(failure(request.id, error(`method not found: ${request.method}`, -32601)))}\n`);
      }
    } catch (cause) {
      process.stdout.write(`${JSON.stringify(failure(request.id, cause))}\n`);
    }
  }
}

if (process.argv[1] && path.resolve(process.argv[1]) === fileURLToPath(import.meta.url)) {
  main().catch((cause) => { process.stderr.write(`${cause?.message || cause}\n`); process.exit(1); });
}
