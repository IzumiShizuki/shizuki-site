import { describe, expect, it } from 'vitest';
import { HttpError } from '../services/httpClient';
import {
  isFeatureDisabledProblem,
  readProblemCode,
  resolveOptionalCapabilityFailure
} from './optionalCapabilityState';

describe('optional capability state', () => {
  it('recognizes stable feature-disabled problem codes', () => {
    const error = new HttpError('disabled', {
      status: 404,
      problemCode: 'FEATURE_DISABLED',
      body: { code: 'FEATURE_DISABLED' }
    });

    expect(readProblemCode(error)).toBe('FEATURE_DISABLED');
    expect(isFeatureDisabledProblem(error)).toBe(true);
    expect(resolveOptionalCapabilityFailure(error)).toEqual({
      kind: 'disabled',
      retryable: false
    });
  });

  it('keeps unknown and network failures retryable', () => {
    expect(resolveOptionalCapabilityFailure(new HttpError('offline', {
      problemCode: 'NETWORK_ERROR'
    }))).toEqual({
      kind: 'transient',
      retryable: true
    });
    expect(resolveOptionalCapabilityFailure(null)).toEqual({
      kind: 'none',
      retryable: false
    });
  });
});
