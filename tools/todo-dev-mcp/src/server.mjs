import { McpServer } from '@modelcontextprotocol/sdk/server/mcp.js';
import { StdioServerTransport } from '@modelcontextprotocol/sdk/server/stdio.js';
import { z } from 'zod';
import { makeTodoApi, TodoApiError } from './api.mjs';

const id = z.string().regex(/^[1-9][0-9]{0,18}$/).refine((value) => BigInt(value) <= 9223372036854775807n)
  .describe('Decimal identifier from the Todo service. Keep quoted; do not convert to a JS number.');
const artifact = z.object({
  kind: z.enum(['research', 'design', 'implementation', 'verification']),
  url: z.string().max(2048).refine((value) => {
    try {
      const url = new URL(value);
      return ['http:', 'https:'].includes(url.protocol) && !url.username && !url.password;
    } catch {
      return false;
    }
  }).describe('Artifact URL without embedded credentials. Links are recorded, not opened.'),
}).strict();
const update = {
  todo_id: id,
  expected_version: z.number().int().nonnegative().max(2147483647)
    .describe('Version returned by the latest todo_get_context or successful update.'),
  request_id: z.uuid().describe('Fresh UUID per logical operation. Retry the same ID only with identical input.'),
  summary: z.string().trim().min(1).max(1000),
  next_step: z.string().trim().min(1).max(500).optional(),
  artifacts: z.array(artifact).max(8).optional(),
};
const readOnlyAnnotations = { readOnlyHint: true, openWorldHint: true };
const writeAnnotations = {
  readOnlyHint: false,
  destructiveHint: false,
  idempotentHint: true,
  openWorldHint: true,
};

async function run(api, action) {
  try {
    const data = await action();
    return { content: [{ type: 'text', text: api.toClientText(data) }] };
  } catch (err) {
    return {
      content: [{ type: 'text', text: err instanceof TodoApiError ? err.message : 'Todo MCP could not complete the request.' }],
      isError: true,
    };
  }
}

function createServer(api) {
  const server = new McpServer({ name: 'shizuki-todo-dev', version: '0.1.0' });
  server.registerTool('todo_search', {
    description: 'Search opt-in development Todos within the credential’s project. Match the requested task and repository; do not guess if ambiguous.',
    inputSchema: z.object({
      q: z.string().trim().min(1).max(120).optional(),
      project_id: id.optional(),
    }).strict(),
    annotations: readOnlyAnnotations,
  }, (input) => run(api, () => api.search(input)));

  server.registerTool('todo_get_context', {
    description: 'Read the linked repository, current stage, status, version, local Skill hints and progress of an opted-in Todo.',
    inputSchema: z.object({ todo_id: id }).strict(),
    annotations: readOnlyAnnotations,
  }, ({ todo_id }) => run(api, () => api.context(todo_id)));

  server.registerTool('todo_report_progress', {
    description: 'Append a progress or blocker update to the current stage; does not advance it.',
    inputSchema: z.object({
      ...update,
      status: z.enum(['IN_PROGRESS', 'BLOCKED']).optional(),
    }).strict(),
    annotations: writeAnnotations,
  }, ({ todo_id, ...body }) => run(api, () => api.progress(todo_id, body)));

  server.registerTool('todo_submit_stage', {
    description: 'Submit evidence for the current stage. The server decides whether to advance or await owner approval; cannot approve.',
    inputSchema: z.object({
      ...update,
      artifacts: z.array(artifact).min(1).max(8),
    }).strict(),
    annotations: writeAnnotations,
  }, ({ todo_id, ...body }) => run(api, () => api.submit(todo_id, body)));

  return server;
}

try {
  const api = makeTodoApi({ origin: process.env.SHIZUKI_TODO_ORIGIN, token: process.env.SHIZUKI_TODO_TOKEN });
  await createServer(api).connect(new StdioServerTransport());
} catch (err) {
  // Stdout is reserved for JSON-RPC; never forward runtime errors with request metadata.
  console.error(err instanceof TodoApiError ? err.message : 'Todo MCP startup failed.');
  process.exitCode = 1;
}
