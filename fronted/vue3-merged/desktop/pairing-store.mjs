import { randomBytes, randomUUID, scrypt as scryptCallback, timingSafeEqual } from 'node:crypto';
import { promisify } from 'node:util';
import { readVersionedJson, writeAtomicJson } from './atomic-json-store.mjs';

const scrypt = promisify(scryptCallback);
const PAIRING_SCHEMA_VERSION = 1;
const REQUEST_TTL_MS = 10 * 60 * 1000;
const CREDENTIAL_DELIVERY_TTL_MS = 2 * 60 * 1000;
const AUDIT_LIMIT = 200;

export const CLIENT_CAPABILITIES = Object.freeze([
  'app.navigation',
  'window.control',
  'music.control',
  'desktop.read',
  'desktop.layout',
  'desktop.appearance'
]);

function nowIso(now) {
  return new Date(now()).toISOString();
}

function defaultPairingState() {
  return {
    schemaVersion: PAIRING_SCHEMA_VERSION,
    clients: [],
    pending: [],
    audit: []
  };
}

function validPairingState(value) {
  return value?.schemaVersion === PAIRING_SCHEMA_VERSION
    && Array.isArray(value.clients)
    && Array.isArray(value.pending)
    && Array.isArray(value.audit);
}

function safeClientName(value) {
  const name = String(value || '').trim();
  if (!name || name.length > 80) throw Object.assign(new Error('Client name must contain 1-80 characters.'), { code: 'INVALID_CLIENT_NAME' });
  return name;
}

function safeInstanceId(value) {
  const id = String(value || '').trim();
  if (!/^[A-Za-z0-9][A-Za-z0-9._:-]{0,127}$/.test(id)) {
    throw Object.assign(new Error('Client instance id is invalid.'), { code: 'INVALID_INSTANCE_ID' });
  }
  return id;
}

export function normalizeClientCapabilities(input) {
  const values = Array.isArray(input) ? input : [];
  const normalized = [...new Set(values.map(value => String(value || '').trim()).filter(Boolean))];
  const invalid = normalized.filter(value => !CLIENT_CAPABILITIES.includes(value));
  if (invalid.length) {
    throw Object.assign(new Error(`Unsupported client capabilities: ${invalid.join(', ')}`), {
      code: 'INVALID_CAPABILITIES',
      details: { allowed: CLIENT_CAPABILITIES, invalid }
    });
  }
  if (!normalized.length) throw Object.assign(new Error('At least one capability is required.'), { code: 'INVALID_CAPABILITIES' });
  return normalized;
}

function publicRequest(request) {
  return {
    requestId: request.requestId,
    clientName: request.clientName,
    instanceId: request.instanceId,
    requestedCapabilities: [...request.requestedCapabilities],
    status: request.status,
    createdAt: request.createdAt,
    expiresAt: request.expiresAt,
    decidedAt: request.decidedAt || null
  };
}

function publicClient(client) {
  return {
    clientId: client.clientId,
    clientName: client.clientName,
    instanceId: client.instanceId,
    capabilities: [...client.capabilities],
    createdAt: client.createdAt,
    lastAuthenticatedAt: client.lastAuthenticatedAt || null,
    revokedAt: client.revokedAt || null
  };
}

export class PairedClientStore {
  constructor(filePath, { now = Date.now, auditLimit = AUDIT_LIMIT } = {}) {
    if (!filePath) throw new TypeError('filePath is required.');
    this.filePath = filePath;
    this.now = now;
    this.auditLimit = Math.max(20, Number(auditLimit) || AUDIT_LIMIT);
    this.state = defaultPairingState();
    this.deliveries = new Map();
  }

  async load() {
    const result = await readVersionedJson(this.filePath, {
      schemaVersion: PAIRING_SCHEMA_VERSION,
      defaults: defaultPairingState,
      validate: validPairingState
    });
    this.state = result.value;
    await this.expireRequests();
    return result;
  }

  async persist() {
    await writeAtomicJson(this.filePath, this.state);
  }

  audit(type, metadata = {}) {
    this.state.audit.unshift({
      id: randomUUID(),
      type,
      at: nowIso(this.now),
      ...structuredClone(metadata)
    });
    this.state.audit = this.state.audit.slice(0, this.auditLimit);
  }

  async expireRequests() {
    const current = this.now();
    let changed = false;
    for (const request of this.state.pending) {
      if (request.status === 'pending' && Date.parse(request.expiresAt) <= current) {
        request.status = 'expired';
        request.decidedAt = nowIso(this.now);
        this.audit('pairing.expired', { requestId: request.requestId, clientName: request.clientName });
        changed = true;
      }
    }
    for (const [requestId, delivery] of this.deliveries) {
      if (delivery.expiresAt <= current) this.deliveries.delete(requestId);
    }
    if (changed) await this.persist();
  }

  async createRequest(input) {
    await this.expireRequests();
    const clientName = safeClientName(input?.clientName);
    const instanceId = safeInstanceId(input?.instanceId);
    const requestedCapabilities = normalizeClientCapabilities(input?.requestedCapabilities);
    const duplicate = this.state.pending.find(request => request.instanceId === instanceId && request.status === 'pending');
    if (duplicate) return publicRequest(duplicate);
    const createdAt = nowIso(this.now);
    const request = {
      requestId: randomUUID(),
      clientName,
      instanceId,
      requestedCapabilities,
      status: 'pending',
      createdAt,
      expiresAt: new Date(this.now() + REQUEST_TTL_MS).toISOString(),
      decidedAt: null
    };
    this.state.pending.push(request);
    this.audit('pairing.requested', { requestId: request.requestId, clientName, instanceId, requestedCapabilities });
    await this.persist();
    return publicRequest(request);
  }

  listPending() {
    return this.state.pending.filter(request => request.status === 'pending').map(publicRequest);
  }

  listClients() {
    return this.state.clients.map(publicClient);
  }

  listAudit() {
    return structuredClone(this.state.audit);
  }

  async approve(requestId, capabilities) {
    await this.expireRequests();
    const request = this.state.pending.find(item => item.requestId === requestId && item.status === 'pending');
    if (!request) throw Object.assign(new Error('Pending pairing request was not found.'), { code: 'PAIRING_REQUEST_NOT_FOUND' });
    const approved = normalizeClientCapabilities(capabilities);
    if (approved.some(capability => !request.requestedCapabilities.includes(capability))) {
      throw Object.assign(new Error('Approved capabilities must be a subset of the requested capabilities.'), { code: 'INVALID_CAPABILITIES' });
    }
    const clientId = randomUUID();
    const secret = randomBytes(32).toString('base64url');
    const salt = randomBytes(16);
    const verifier = await scrypt(secret, salt, 32);
    const client = {
      clientId,
      clientName: request.clientName,
      instanceId: request.instanceId,
      capabilities: approved,
      credential: {
        algorithm: 'scrypt-v1',
        salt: salt.toString('base64url'),
        verifier: Buffer.from(verifier).toString('base64url')
      },
      createdAt: nowIso(this.now),
      lastAuthenticatedAt: null,
      revokedAt: null
    };
    this.state.clients.push(client);
    request.status = 'approved';
    request.decidedAt = nowIso(this.now);
    this.deliveries.set(request.requestId, {
      clientId,
      secret,
      expiresAt: this.now() + CREDENTIAL_DELIVERY_TTL_MS
    });
    this.audit('pairing.approved', { requestId, clientId, clientName: client.clientName, capabilities: approved });
    await this.persist();
    return publicClient(client);
  }

  async reject(requestId) {
    await this.expireRequests();
    const request = this.state.pending.find(item => item.requestId === requestId && item.status === 'pending');
    if (!request) throw Object.assign(new Error('Pending pairing request was not found.'), { code: 'PAIRING_REQUEST_NOT_FOUND' });
    request.status = 'rejected';
    request.decidedAt = nowIso(this.now);
    this.audit('pairing.rejected', { requestId, clientName: request.clientName, instanceId: request.instanceId });
    await this.persist();
    return publicRequest(request);
  }

  async consumeCredential(requestId) {
    await this.expireRequests();
    const request = this.state.pending.find(item => item.requestId === requestId);
    if (!request) return { status: 'not_found' };
    const delivery = this.deliveries.get(requestId);
    if (request.status === 'approved' && delivery) {
      this.deliveries.delete(requestId);
      return {
        status: 'approved',
        credential: {
          clientId: delivery.clientId,
          secret: delivery.secret,
          authorization: `ShizukiClient ${delivery.clientId}:${delivery.secret}`
        }
      };
    }
    return { status: request.status, request: publicRequest(request) };
  }

  async verify(clientId, secret) {
    const client = this.state.clients.find(item => item.clientId === clientId && !item.revokedAt);
    if (!client || !secret || client.credential?.algorithm !== 'scrypt-v1') return null;
    const actual = Buffer.from(await scrypt(secret, Buffer.from(client.credential.salt, 'base64url'), 32));
    const expected = Buffer.from(client.credential.verifier, 'base64url');
    if (actual.length !== expected.length || !timingSafeEqual(actual, expected)) return null;
    client.lastAuthenticatedAt = nowIso(this.now);
    await this.persist();
    return publicClient(client);
  }

  async recordDeniedCapability(clientId, capability) {
    const client = this.state.clients.find(item => item.clientId === clientId);
    this.audit('capability.denied', {
      clientId,
      clientName: client?.clientName || '',
      capability: String(capability || '')
    });
    await this.persist();
  }

  async revoke(clientId) {
    const client = this.state.clients.find(item => item.clientId === clientId && !item.revokedAt);
    if (!client) throw Object.assign(new Error('Paired client was not found.'), { code: 'PAIRED_CLIENT_NOT_FOUND' });
    client.revokedAt = nowIso(this.now);
    this.audit('pairing.revoked', { clientId, clientName: client.clientName });
    await this.persist();
    return publicClient(client);
  }
}

export const pairingStoreInternals = Object.freeze({
  AUDIT_LIMIT,
  CREDENTIAL_DELIVERY_TTL_MS,
  PAIRING_SCHEMA_VERSION,
  REQUEST_TTL_MS,
  defaultPairingState,
  publicClient,
  publicRequest
});
