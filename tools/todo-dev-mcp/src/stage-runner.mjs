import { spawnSync } from 'node:child_process';
import { randomUUID } from 'node:crypto';
import { homedir } from 'node:os';
import { join } from 'node:path';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { makeTodoApi } from './api.mjs';

const stages = ['RESEARCH', 'DESIGN', 'IMPLEMENTATION', 'VERIFICATION'];
const actions = ['run', 'resume', 'submit'];
const workerPath = fileURLToPath(new URL('../stage_worker.py', import.meta.url));

function runPython(action, stage, materials = {}) {
  const python = join(homedir(), 'openai-agents-starter', '.venv', 'Scripts', 'python.exe');
  const childEnv = { ...process.env };
  for (const key of Object.keys(childEnv)) {
    if (/TOKEN|API_KEY|SECRET|PASSWORD/i.test(key)) delete childEnv[key];
  }
  const p = spawnSync(python, ['-B', '-X', 'utf8', workerPath, action, stage], {
    input: JSON.stringify(materials), encoding: 'utf8', env: childEnv, timeout: 150000, windowsHide: true
  });
  if (p.status !== 0) throw new Error(action === 'check' ? '请先检查 starter 专用 CLI 登录。' : '本机阶段执行失败。');
  return p.stdout.trim();
}

function publishedArtifact(repository, raw) {
  if (!raw || !/^[\w.-]+\/[\w.-]+$/.test(repository)) throw new Error('需提供当前仓库的成果链接。');
  const url = new URL(raw);
  const segments = url.pathname.split('/');
  const [, owner, repo, type, id] = segments;
  if (url.origin !== 'https://github.com' || url.username || url.password || url.search || url.hash ||
      segments.length !== 5 || (owner + '/' + repo).toLowerCase() !== repository.toLowerCase() ||
      !(type === 'commit' && /^[a-f0-9]{7,64}$/i.test(id) || ['issues', 'pull'].includes(type) && /^[1-9]\d*$/.test(id))) {
    throw new Error('产物须为任务仓库中的 GitHub commit、issue 或 PR 永久链接。');
  }
  return url.href;
}

function stageMaterials(context, stage) {
  const handoff = [];
  for (const event of context.events || []) {
    if (event.event_type !== 'SUBMIT' || event.stage === stage) continue;
    for (const artifact of event.artifacts || []) {
      try {
        handoff.push({ stage: event.stage, url: publishedArtifact(context.repository, artifact.url) });
      } catch {
        // Older human submissions may have private URLs with query parameters.
      }
    }
  }
  return { title: context.title, handoff };
}

export async function stageAction({ api, action, id, stage, artifact, fixture = false, perform = runPython }) {
  if (!actions.includes(action) || !/^[1-9]\d{0,18}$/.test(id) || !stages.includes(stage)) {
    throw new Error('用法: run|resume|submit <Todo ID> RESEARCH|DESIGN|IMPLEMENTATION|VERIFICATION [成果链接]');
  }
  const context = await api.context(id);
  if (context.todo_id !== id || context.stage !== stage || ['AWAITING_APPROVAL','COMPLETE'].includes(context.status)) {
    throw new Error('阶段已变更、等待人工审批或已完成。请刷新任务。');
  }
  const body = (version, summary) => ({ expected_version: version, request_id: randomUUID(), summary });
  const prefix = fixture ? '离线模拟 · ' : '本机运行 · ';
  if (action === 'submit') {
    if (context.status !== 'IN_PROGRESS') throw new Error('请先运行并核对本阶段产物。');
    const url = publishedArtifact(context.repository, artifact);
    await api.submit(id, { ...body(context.version, prefix + '操作者已核对阶段产物'),
      artifacts: [{ kind: stage.toLowerCase(), url }] });
    return '已提交，请刷新看板。';
  }
  if (action === 'resume' ? context.status !== 'IN_PROGRESS' : !['READY','FAILED','BLOCKED'].includes(context.status)) {
    throw new Error('状态不允许此次操作。已开始的阶段请确认后使用 resume。');
  }
  if (!fixture) perform('check', stage);
  let version = context.version;
  if (action === 'run') {
    const running = await api.progress(id, { ...body(version, prefix + '阶段已开始'), status:'IN_PROGRESS' });
    version = running.version;
  }
  try {
    return perform(fixture ? 'fixture' : 'run', stage, stageMaterials(context, stage));
  } catch (error) {
    await api.progress(id, { ...body(version, prefix + '执行失败，请检查本机输出'), status:'FAILED' });
    throw error;
  }
}

async function main() {
  const args = process.argv.slice(2);
  const fixture = args[0] === '--fixture';
  if (fixture) args.shift();
  const [action, id, stage, artifact] = args;
  if (args.length !== (action === 'submit' ? 4 : 3)) throw new Error('参数数量不符。详见 RUNBOARD.md。');
  const origin = process.env.SHIZUKI_TODO_ORIGIN;
  if (fixture && !['localhost','127.0.0.1','[::1]'].includes(new URL(origin).hostname)) {
    throw new Error('模拟运行仅支持本机回环服务。');
  }
  const api = makeTodoApi({ origin, accountToken:process.env.SHIZUKI_MCP_TOKEN });
  console.log(await stageAction({ api, action, id, stage, artifact, fixture }));
}

if (process.argv[1] && import.meta.url === pathToFileURL(process.argv[1]).href) {
  main().catch(error => {
    console.error(error instanceof Error ? error.message : '阶段操作失败');
    process.exitCode = 1;
  });
}
