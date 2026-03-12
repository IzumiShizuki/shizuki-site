export function formatMediaTime(seconds, options = {}) {
  const { fallback = '00:00' } = options;
  const safe = Number(seconds);
  if (!Number.isFinite(safe) || safe < 0) return fallback;
  const total = Math.floor(safe);
  const minute = Math.floor(total / 60);
  const second = total % 60;
  return `${String(minute).padStart(2, '0')}:${String(second).padStart(2, '0')}`;
}
