const TERMINAL_EVENT_TYPES = new Set(['turn.completed', 'turn.cancelled', 'turn.failed']);
const EXPRESSION_EVENT_TYPES = new Set(['semantic.completed', 'expression.cue', 'sprite.resolved']);

export function isTerminalMeguriEventType(type) {
  return TERMINAL_EVENT_TYPES.has(String(type || '').trim());
}

export function isExpressionMeguriEventType(type) {
  return EXPRESSION_EVENT_TYPES.has(String(type || '').trim());
}

function toSafeSequence(value) {
  const parsed = Number(value);
  if (!Number.isSafeInteger(parsed) || parsed < 0) return 0;
  return parsed;
}

export function normalizeMeguriEnvelope(raw = {}) {
  if (!raw || typeof raw !== 'object' || Array.isArray(raw)) return null;
  const type = String(raw.type || '').trim();
  const turnId = String(raw.turn_id || raw.turnId || '').trim();
  const sessionId = String(raw.session_id || raw.sessionId || '').trim();
  const sequence = toSafeSequence(raw.sequence);
  if (!type || !sessionId || sequence < 1) return null;
  const data = raw.data && typeof raw.data === 'object' && !Array.isArray(raw.data) ? raw.data : {};
  return { type, turnId, sessionId, sequence, data };
}

export function createMeguriSseParser() {
  let buffer = '';

  function parseBlock(block) {
    if (!block || block.startsWith(':')) return null;
    let eventName = '';
    const dataLines = [];
    for (const line of block.split('\n')) {
      if (line.startsWith('event:')) {
        eventName = line.slice(6).trim();
      } else if (line.startsWith('data:')) {
        dataLines.push(line.slice(5).replace(/^\s/, ''));
      }
    }
    if (!dataLines.length) return null;
    let payload;
    try {
      payload = JSON.parse(dataLines.join('\n'));
    } catch {
      return null;
    }
    const envelope = normalizeMeguriEnvelope(payload);
    if (!envelope) return null;
    if (eventName && eventName !== envelope.type) {
      envelope.type = eventName;
    }
    return envelope;
  }

  return {
    push(chunk) {
      buffer += String(chunk || '');
      buffer = buffer.replaceAll('\r\n', '\n');
      const events = [];
      let boundary = buffer.indexOf('\n\n');
      while (boundary >= 0) {
        const block = buffer.slice(0, boundary);
        buffer = buffer.slice(boundary + 2);
        const parsed = parseBlock(block);
        if (parsed) events.push(parsed);
        boundary = buffer.indexOf('\n\n');
      }
      return events;
    },
    flush() {
      const rest = buffer;
      buffer = '';
      const parsed = parseBlock(rest.replaceAll('\r\n', '\n'));
      return parsed ? [parsed] : [];
    }
  };
}

export function createMeguriTurnTracker(turnId) {
  const state = {
    turnId: String(turnId || '').trim(),
    text: '',
    status: 'running',
    expression: null,
    toolHint: '',
    error: ''
  };

  function applyExpression(data = {}) {
    state.expression = {
      expressionTag: String(data.expression_tag || data.expressionTag || 'neutral').trim() || 'neutral',
      expressionIntensity: String(data.expression_intensity || data.expressionIntensity || 'low').trim() || 'low',
      outfitCode: String(data.outfit_code || data.outfitCode || '').trim(),
      spriteFile: String(data.sprite_file || data.spriteFile || '').trim(),
      motionTag: String(data.motion_tag || data.motionTag || '').trim()
    };
  }

  return {
    state,
    apply(envelope) {
      if (!envelope || (state.turnId && envelope.turnId && envelope.turnId !== state.turnId)) {
        return false;
      }
      const { type, data } = envelope;
      if (type === 'turn.started') {
        state.status = 'running';
      } else if (type === 'text.delta') {
        state.text += typeof data.delta === 'string' ? data.delta : '';
      } else if (type === 'text.completed') {
        if (typeof data.text === 'string' && data.text) {
          state.text = data.text;
        }
      } else if (isExpressionMeguriEventType(type)) {
        applyExpression(data);
      } else if (type === 'tool.started') {
        state.toolHint = data.tool_name === 'web_search' ? '正在联网搜索...' : '正在调用工具...';
      } else if (type === 'tool.completed') {
        state.toolHint = '';
      } else if (type === 'turn.completed') {
        state.status = 'completed';
        state.toolHint = '';
      } else if (type === 'turn.cancelled') {
        state.status = 'cancelled';
        state.toolHint = '';
      } else if (type === 'turn.failed') {
        state.status = 'failed';
        state.toolHint = '';
        state.error = typeof data.error === 'string' && data.error ? data.error : '回复失败';
      }
      return true;
    },
    isTerminal() {
      return state.status === 'completed' || state.status === 'cancelled' || state.status === 'failed';
    }
  };
}

/**
 * Follow one Meguri session event stream until the target turn reaches a
 * terminal event. `rawFetch(path, options)` must return a fetch Response with
 * a readable body (see useAuthSession().authorizedRawFetch).
 */
export async function followMeguriTurn({
  rawFetch,
  sessionId,
  turnId,
  afterSequence = 0,
  maxReconnects = 3,
  onEvent,
  signal
} = {}) {
  if (typeof rawFetch !== 'function') {
    throw new Error('rawFetch is required to follow a Meguri turn');
  }
  const normalizedSession = String(sessionId || '').trim();
  const normalizedTurn = String(turnId || '').trim();
  if (!normalizedSession || !normalizedTurn) {
    throw new Error('sessionId and turnId are required');
  }

  const tracker = createMeguriTurnTracker(normalizedTurn);
  let lastSequence = toSafeSequence(afterSequence);
  let reconnects = 0;

  async function readOnce() {
    const parser = createMeguriSseParser();
    const response = await rawFetch(
      `/api/v1/meguri/sessions/${encodeURIComponent(normalizedSession)}/events?after_sequence=${lastSequence}`,
      {
        headers: { Accept: 'text/event-stream' },
        signal
      }
    );
    if (!response || !response.ok) {
      const status = response ? response.status : 0;
      const error = new Error(`事件流连接失败（HTTP ${status || '网络错误'}）`);
      error.status = status;
      throw error;
    }
    if (!response.body || typeof response.body.getReader !== 'function') {
      throw new Error('当前浏览器不支持流式读取');
    }

    const reader = response.body.getReader();
    const decoder = new TextDecoder();
    try {
      for (;;) {
        const { value, done } = await reader.read();
        const chunkText = decoder.decode(value || new Uint8Array(), { stream: !done });
        const events = parser.push(chunkText);
        if (done) events.push(...parser.flush());
        for (const envelope of events) {
          if (envelope.sequence <= lastSequence) continue;
          lastSequence = envelope.sequence;
          const applied = tracker.apply(envelope);
          if (applied && typeof onEvent === 'function') {
            await onEvent(envelope, tracker.state);
          }
          if (envelope.turnId === normalizedTurn && isTerminalMeguriEventType(envelope.type)) {
            return true;
          }
        }
        if (done) return tracker.isTerminal();
      }
    } finally {
      try {
        await reader.cancel();
      } catch {
        // reader may already be closed
      }
    }
  }

  for (;;) {
    if (signal?.aborted) {
      const abortError = new Error('已停止接收回复');
      abortError.name = 'AbortError';
      throw abortError;
    }
    try {
      const terminal = await readOnce();
      if (terminal) return tracker.state;
      throw new Error('事件流在回复完成前中断');
    } catch (error) {
      if (signal?.aborted || error?.name === 'AbortError') {
        throw error;
      }
      if (reconnects >= maxReconnects) {
        throw error;
      }
      reconnects += 1;
    }
  }
}
