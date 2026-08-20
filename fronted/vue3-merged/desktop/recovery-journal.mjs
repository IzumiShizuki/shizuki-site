import { randomUUID } from 'node:crypto';
import { readVersionedJson, writeAtomicJson } from './atomic-json-store.mjs';

const JOURNAL_SCHEMA_VERSION = 1;

export function emptyRecoveryJournal() {
  return {
    schemaVersion: JOURNAL_SCHEMA_VERSION,
    sessionId: '',
    cleanShutdown: true,
    safeMode: false,
    startedAt: null,
    completedAt: null,
    mutations: [],
    recoveryErrors: []
  };
}

function validMutation(value) {
  return value && typeof value.id === 'string' && typeof value.type === 'string'
    && ['pending', 'applied', 'restored'].includes(value.status);
}

function validJournal(value) {
  return value?.schemaVersion === JOURNAL_SCHEMA_VERSION
    && typeof value.cleanShutdown === 'boolean'
    && typeof value.safeMode === 'boolean'
    && Array.isArray(value.mutations)
    && value.mutations.every(validMutation)
    && Array.isArray(value.recoveryErrors);
}

export class RecoveryJournal {
  constructor(filePath) {
    if (!filePath) throw new TypeError('filePath is required.');
    this.filePath = filePath;
    this.state = emptyRecoveryJournal();
  }

  async load() {
    const result = await readVersionedJson(this.filePath, {
      schemaVersion: JOURNAL_SCHEMA_VERSION,
      defaults: emptyRecoveryJournal,
      validate: validJournal
    });
    this.state = result.value;
    return result;
  }

  snapshot() {
    return structuredClone(this.state);
  }

  async persist() {
    await writeAtomicJson(this.filePath, this.state);
    return this.snapshot();
  }

  async beginSession({ safeMode = false, recoveryErrors = [] } = {}) {
    this.state = {
      ...emptyRecoveryJournal(),
      sessionId: randomUUID(),
      cleanShutdown: false,
      safeMode: Boolean(safeMode),
      recoveryErrors: structuredClone(recoveryErrors),
      startedAt: new Date().toISOString()
    };
    return this.persist();
  }

  async recordIntent(type, originalValue, desiredValue) {
    if (this.state.safeMode) throw Object.assign(new Error('Native mutations are disabled in safe mode.'), { code: 'SAFE_MODE' });
    const mutation = {
      id: randomUUID(),
      type: String(type || ''),
      originalValue: structuredClone(originalValue),
      desiredValue: structuredClone(desiredValue),
      status: 'pending',
      recordedAt: new Date().toISOString(),
      appliedAt: null,
      restoredAt: null
    };
    this.state.cleanShutdown = false;
    this.state.mutations.push(mutation);
    await this.persist();
    return structuredClone(mutation);
  }

  async markApplied(id) {
    const mutation = this.state.mutations.find(item => item.id === id);
    if (!mutation) throw new Error(`Unknown recovery mutation: ${id}`);
    mutation.status = 'applied';
    mutation.appliedAt = new Date().toISOString();
    await this.persist();
  }

  async restoreOutstanding(restoreMutation) {
    if (typeof restoreMutation !== 'function') throw new TypeError('restoreMutation is required.');
    const errors = [];
    for (const mutation of [...this.state.mutations].reverse()) {
      if (mutation.status === 'restored') continue;
      try {
        await restoreMutation(structuredClone(mutation));
        mutation.status = 'restored';
        mutation.restoredAt = new Date().toISOString();
      } catch (error) {
        errors.push({
          mutationId: mutation.id,
          type: mutation.type,
          message: String(error?.message || error),
          at: new Date().toISOString()
        });
      }
    }
    this.state.recoveryErrors = errors;
    this.state.safeMode = errors.length > 0;
    this.state.cleanShutdown = errors.length === 0;
    if (this.state.cleanShutdown) this.state.completedAt = new Date().toISOString();
    await this.persist();
    return { restored: errors.length === 0, safeMode: this.state.safeMode, errors };
  }

  async markClean() {
    this.state.cleanShutdown = true;
    this.state.completedAt = new Date().toISOString();
    await this.persist();
  }
}
