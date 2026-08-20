import { mkdir, readFile, rename, rm, writeFile } from 'node:fs/promises';
import path from 'node:path';

const writeQueues = new Map();

function invalidPathFor(filePath, now = Date.now()) {
  const parsed = path.parse(filePath);
  return path.join(parsed.dir, `${parsed.name}.invalid-${now}${parsed.ext || '.json'}`);
}

function backupPathFor(filePath) {
  return `${filePath}.bak`;
}

async function writeAtomicJsonNow(filePath, value) {
  await mkdir(path.dirname(filePath), { recursive: true });
  const tempPath = `${filePath}.${process.pid}.${Date.now()}.tmp`;
  const backupPath = backupPathFor(filePath);
  await writeFile(tempPath, `${JSON.stringify(value, null, 2)}\n`, { encoding: 'utf8', mode: 0o600 });
  try {
    try {
      await rename(tempPath, filePath);
      await rm(backupPath, { force: true });
      return;
    } catch (error) {
      if (!['EEXIST', 'EPERM'].includes(error?.code)) throw error;
    }

    await rm(backupPath, { force: true });
    try {
      await rename(filePath, backupPath);
    } catch (error) {
      if (error?.code !== 'ENOENT') throw error;
    }
    try {
      await rename(tempPath, filePath);
    } catch (error) {
      try {
        await rename(backupPath, filePath);
      } catch {
        // Preserve the original write failure; the backup remains recoverable when restoration is unavailable.
      }
      throw error;
    }
    await rm(backupPath, { force: true });
  } finally {
    await rm(tempPath, { force: true });
  }
}

export async function writeAtomicJson(filePath, value) {
  if (!filePath) throw new TypeError('filePath is required.');
  const previous = writeQueues.get(filePath) || Promise.resolve();
  const pending = previous.catch(() => {}).then(() => writeAtomicJsonNow(filePath, value));
  writeQueues.set(filePath, pending);
  try {
    await pending;
  } finally {
    if (writeQueues.get(filePath) === pending) writeQueues.delete(filePath);
  }
}

async function readValidated(filePath, schemaVersion, validate) {
  const value = JSON.parse(await readFile(filePath, 'utf8'));
  if (!value || typeof value !== 'object' || Array.isArray(value)) throw new Error('State must be an object.');
  if (value.schemaVersion !== schemaVersion) throw new Error('Unsupported state schema version.');
  if (!validate(value)) throw new Error('State validation failed.');
  return value;
}

export async function readVersionedJson(filePath, {
  schemaVersion,
  defaults,
  validate = () => true,
  now = Date.now
} = {}) {
  if (!Number.isInteger(schemaVersion) || schemaVersion < 1) {
    throw new TypeError('schemaVersion must be a positive integer.');
  }
  const fallback = structuredClone(typeof defaults === 'function' ? defaults() : defaults);
  try {
    const value = await readValidated(filePath, schemaVersion, validate);
    return { value, recoveredFromInvalid: false, quarantinePath: '' };
  } catch (error) {
    if (error?.code === 'ENOENT') {
      const backupPath = backupPathFor(filePath);
      try {
        const value = await readValidated(backupPath, schemaVersion, validate);
        await rename(backupPath, filePath).catch(() => {});
        return { value, recoveredFromInvalid: false, quarantinePath: '', recoveredFromBackup: true };
      } catch (backupError) {
        if (backupError?.code === 'ENOENT') {
          return { value: fallback, recoveredFromInvalid: false, quarantinePath: '' };
        }
        const quarantinePath = invalidPathFor(backupPath, now());
        await rename(backupPath, quarantinePath).catch(() => {});
        return { value: fallback, recoveredFromInvalid: true, quarantinePath, error: backupError };
      }
    }
    const quarantinePath = invalidPathFor(filePath, now());
    try {
      await rename(filePath, quarantinePath);
    } catch (renameError) {
      if (renameError?.code !== 'ENOENT') throw renameError;
    }
    const backupPath = backupPathFor(filePath);
    try {
      const value = await readValidated(backupPath, schemaVersion, validate);
      await rename(backupPath, filePath).catch(() => {});
      return { value, recoveredFromInvalid: true, quarantinePath, error, recoveredFromBackup: true };
    } catch {
      return { value: fallback, recoveredFromInvalid: true, quarantinePath, error };
    }
  }
}

export const atomicJsonInternals = Object.freeze({ backupPathFor, invalidPathFor });
