const DISABLED_PROBLEM_CODES = new Set([
  'FEATURE_DISABLED'
]);

export function readProblemCode(error) {
  if (!error || typeof error !== 'object') return '';
  return String(
    error.problemCode
      || error.code
      || error.body?.code
      || error.body?.problemCode
      || ''
  ).trim().toUpperCase();
}

export function isFeatureDisabledProblem(error) {
  return DISABLED_PROBLEM_CODES.has(readProblemCode(error));
}

export function resolveOptionalCapabilityFailure(error) {
  if (!error) return Object.freeze({ kind: 'none', retryable: false });
  if (isFeatureDisabledProblem(error)) {
    return Object.freeze({ kind: 'disabled', retryable: false });
  }
  return Object.freeze({ kind: 'transient', retryable: true });
}
