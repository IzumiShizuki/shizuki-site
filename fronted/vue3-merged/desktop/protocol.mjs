export const CONTROL_PROTOCOL_VERSION = '1.0';

export const ROUTE_DESTINATIONS = Object.freeze({
  home: '/',
  blog: '/blog',
  music: '/music-library/music',
  apps: '/apps',
  aiHub: '/ai-hub',
  profile: '/profile',
  admin: '/admin',
  author: '/author'
});

const COMMAND_DEFINITIONS = [
  {
    name: 'app.navigate',
    target: 'renderer',
    payload: {
      type: 'object',
      required: ['destination'],
      properties: {
        destination: { type: 'string', enum: Object.keys(ROUTE_DESTINATIONS) }
      },
      additionalProperties: false
    }
  },
  ...['show', 'hide', 'focus', 'minimize', 'toggleVisibility'].map(action => ({
    name: `window.${action}`,
    target: 'native',
    payload: { type: 'object', additionalProperties: false }
  })),
  ...['play', 'pause', 'toggle', 'next', 'previous'].map(action => ({
    name: `music.${action}`,
    target: 'renderer',
    payload: { type: 'object', additionalProperties: false }
  }))
];

export const CONTROL_CAPABILITIES = Object.freeze(
  COMMAND_DEFINITIONS.map(definition => Object.freeze({
    name: definition.name,
    target: definition.target,
    payload: definition.payload
  }))
);

const COMMANDS_BY_NAME = new Map(COMMAND_DEFINITIONS.map(definition => [definition.name, definition]));

export function controlError(code, message, details) {
  const error = { code, message };
  if (details !== undefined) error.details = details;
  return error;
}

function hasOnlyKeys(value, allowedKeys) {
  return Object.keys(value).every(key => allowedKeys.includes(key));
}

function validIdentifier(value) {
  return typeof value === 'string' && /^[A-Za-z0-9][A-Za-z0-9._:-]{0,127}$/.test(value);
}

export function validateControlCommand(input) {
  if (!input || typeof input !== 'object' || Array.isArray(input)) {
    return { ok: false, error: controlError('INVALID_COMMAND', 'Command body must be a JSON object.') };
  }
  if (!hasOnlyKeys(input, ['id', 'command', 'payload'])) {
    return { ok: false, error: controlError('INVALID_COMMAND', 'Command body contains unsupported fields.') };
  }
  if (!validIdentifier(input.id)) {
    return { ok: false, error: controlError('INVALID_COMMAND_ID', 'Command id must be a safe 1-128 character identifier.') };
  }

  const definition = COMMANDS_BY_NAME.get(input.command);
  if (!definition) {
    return {
      ok: false,
      error: controlError('UNSUPPORTED_COMMAND', `Unsupported command: ${String(input.command || '')}`)
    };
  }

  const payload = input.payload === undefined ? {} : input.payload;
  if (!payload || typeof payload !== 'object' || Array.isArray(payload)) {
    return { ok: false, error: controlError('INVALID_PAYLOAD', 'Command payload must be a JSON object.') };
  }
  if (definition.name === 'app.navigate') {
    if (!hasOnlyKeys(payload, ['destination']) || !Object.hasOwn(ROUTE_DESTINATIONS, payload.destination)) {
      return {
        ok: false,
        error: controlError('INVALID_DESTINATION', 'Navigation destination is not allowlisted.', {
          allowed: Object.keys(ROUTE_DESTINATIONS)
        })
      };
    }
  } else if (Object.keys(payload).length > 0) {
    return { ok: false, error: controlError('INVALID_PAYLOAD', 'This command does not accept payload fields.') };
  }

  return {
    ok: true,
    value: Object.freeze({ id: input.id, command: definition.name, payload: { ...payload }, target: definition.target })
  };
}

export function capabilitiesDocument() {
  return {
    protocolVersion: CONTROL_PROTOCOL_VERSION,
    commands: CONTROL_CAPABILITIES,
    transports: {
      commands: 'POST /v1/commands',
      events: 'GET /v1/events'
    }
  };
}
