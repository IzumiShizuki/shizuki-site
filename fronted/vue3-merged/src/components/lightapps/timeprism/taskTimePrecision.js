const DAY_PRECISION = 'DAY';
const DEFAULT_PRECISION = 'MINUTE';

const DATE_ONLY_RE = /^(\d{4})-(\d{2})-(\d{2})$/;
const LOCAL_DATETIME_RE = /^(\d{4})-(\d{2})-(\d{2})T(\d{2}):(\d{2})$/;

function pad(value) {
  return String(value).padStart(2, '0');
}

function normalizePrecision(value) {
  return String(value || DEFAULT_PRECISION).trim().toUpperCase() || DEFAULT_PRECISION;
}

function parseLocalDateString(value, boundary = 'start') {
  const matched = DATE_ONLY_RE.exec(String(value || '').trim());
  if (!matched) return null;
  const [, year, month, day] = matched;
  if (boundary === 'end') {
    return new Date(Number(year), Number(month) - 1, Number(day), 23, 59, 59, 999);
  }
  return new Date(Number(year), Number(month) - 1, Number(day), 0, 0, 0, 0);
}

function parseLocalDateTimeString(value) {
  const matched = LOCAL_DATETIME_RE.exec(String(value || '').trim());
  if (!matched) return null;
  const [, year, month, day, hour, minute] = matched;
  return new Date(Number(year), Number(month) - 1, Number(day), Number(hour), Number(minute), 0, 0);
}

function parseTemporalValue(value, boundary = 'start') {
  const source = String(value || '').trim();
  if (!source) return null;

  const localDate = parseLocalDateString(source, boundary);
  if (localDate) return localDate;

  const localDateTime = parseLocalDateTimeString(source);
  if (localDateTime) return localDateTime;

  const timestamp = Date.parse(source);
  if (!Number.isFinite(timestamp)) return null;
  return new Date(timestamp);
}

function formatDateInputValue(date) {
  return `${date.getFullYear()}-${pad(date.getMonth() + 1)}-${pad(date.getDate())}`;
}

function formatDateTimeInputValue(date) {
  return `${formatDateInputValue(date)}T${pad(date.getHours())}:${pad(date.getMinutes())}`;
}

export function isDayPrecision(value) {
  return normalizePrecision(value) === DAY_PRECISION;
}

export function resolveTaskTimeInputType(value) {
  return isDayPrecision(value) ? 'date' : 'datetime-local';
}

export function toTaskInputValue(value, timePrecision) {
  const date = parseTemporalValue(value);
  if (!date) return '';
  return isDayPrecision(timePrecision) ? formatDateInputValue(date) : formatDateTimeInputValue(date);
}

export function convertTaskInputValue(value, fromPrecision, toPrecision, options = {}) {
  const date = parseTemporalValue(value, options.boundary || 'start');
  if (!date) return '';
  return toTaskInputValue(date.toISOString(), toPrecision || fromPrecision);
}

export function parseTaskInputToIso(value, timePrecision, options = {}) {
  const date = parseTemporalValue(value, isDayPrecision(timePrecision) ? options.boundary || 'start' : 'start');
  if (!date) return '';
  return date.toISOString();
}

export function formatTaskDateLabel(value, timePrecision) {
  const date = parseTemporalValue(value);
  if (!date) return '';
  const dayLabel = `${date.getMonth() + 1}/${date.getDate()}`;
  if (isDayPrecision(timePrecision)) return dayLabel;
  return `${dayLabel} ${pad(date.getHours())}:${pad(date.getMinutes())}`;
}
