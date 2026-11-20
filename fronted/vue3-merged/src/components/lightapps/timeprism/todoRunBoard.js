const stages = [
  ['RESEARCH', '调研', '调研员'],
  ['DESIGN', '方案', '方案设计'],
  ['IMPLEMENTATION', '开发', '开发者'],
  ['VERIFICATION', '验收', '验收员']
];
const labels = { READY: '未开始', IN_PROGRESS: '运行中', BLOCKED: '阻塞', FAILED: '失败',
  AWAITING_APPROVAL: '待确认', COMPLETE: '完成', SKIPPED: '跳过' };

function utc(value) {
  if (!value) return NaN;
  return Date.parse(/Z$|[+-]\d\d:\d\d$/.test(value) ? value : value + 'Z');
}

export function boardRows(context, now) {
  const events = context.events || [];
  const current = stages.findIndex(([key]) => key === context.stage);
  const clocks = context.stage_clocks;
  return stages.map(([key, title, role], index) => {
    const history = events.filter(e => e.stage === key);
    const clock = clocks?.find(e => e.stage === key);
    const skipped = key === 'RESEARCH' && current > 0 && (clocks
      ? !clock : events.some(e => e.event_type === 'ENABLE' && e.stage === 'DESIGN'));
    const status = skipped ? 'SKIPPED' : index < current ? 'COMPLETE' : index > current ? 'READY' : context.status;
    const start = utc(clock?.started_at || history.findLast(e => e.status === 'IN_PROGRESS')?.created_at);
    const end = status === 'IN_PROGRESS' ? now : utc(clock?.last_event_at || history[0]?.created_at);
    const seconds = Number.isFinite(end - start) ? Math.max(0, Math.floor((end - start) / 1000)) : null;
    const elapsed = seconds === null ? '—' : seconds < 60 ? seconds + ' 秒' : Math.floor(seconds / 60) + ' 分 ' + seconds % 60 + ' 秒';
    const assets = history.flatMap(e => e.artifacts || []).filter(a => {
      try { const u = new URL(a.url); return /^https?:$/.test(u.protocol) && !u.username && !u.password; }
      catch { return false; }
    });
    return { key, title, role, status, label: labels[status], elapsed, assets, current: index === current };
  });
}

export function noteUrl(raw) {
  if (typeof raw !== 'string' || raw.length > 2048 || !/^obsidian:\/\/open\?/i.test(raw)
      || /[\x00-\x1f\x7f#\\]/.test(raw) || /%(?![0-9a-f]{2})/i.test(raw)) return '';
  try {
    const url = new URL(raw);
    const params = url.searchParams;
    if ([...params].length !== 2 || !params.has('vault') || !params.has('file')) return '';
    const vault = params.get('vault');
    const file = params.get('file');
    const validPart = part => part.trim().length > 0 && !/^\.+$/.test(part.trim())
      && !/[\\/:*?"<>|\x00-\x1f\x7f\ufffd]/.test(part) && !/%[0-9a-f]{2}/i.test(part);
    if (!validPart(vault) || !file.split('/').every(validPart) || /^[~]/.test(file)) return '';
    return 'obsidian://open?vault=' + encodeURIComponent(vault) + '&file=' + encodeURIComponent(file);
  } catch { return ''; }
}

export function returnMarkdown(title, id, location) {
  if (!/^[1-9]\d{0,18}$/.test(id) || !/^https?:\/\//.test(location.origin)) return '';
  const label = String(title || 'Todo').replace(/[\r\n]+/g, ' ').replace(/[\\[\]]/g, '\\$&');
  return '[' + label + '](<' + location.origin + location.pathname + '#/todo/run/' + id + '>)';
}
