import assert from 'node:assert/strict';
import { test } from 'node:test';
import { stageAction } from '../src/stage-runner.mjs';

function setup() {
  const state = { todo_id:'31', title:'private task title', repository:'owner/repo', stage:'DESIGN', status:'READY', version:2 };
  const writes = [];
  function write(body, status) {
    assert.equal(body.expected_version, state.version);
    writes.push(body);
    state.version++;
    state.status = status;
    return {...state};
  }
  const api = { context:async () => ({...state}), progress:async (_,b) => write(b,b.status),
    submit:async (_,b) => write(b,'AWAITING_APPROVAL') };
  const run = (action, overrides={}) => stageAction({api,action,id:'31',stage:'DESIGN',
    perform:() => 'private local output',...overrides});
  return {run,state,writes};
}

test('login preflight precedes the first write; execution errors are safe to report and retry', async () => {
  const {run,state,writes} = setup();
  await assert.rejects(run('run',{ perform:()=>{throw Error('no login');} }));
  assert.equal(writes.length,0);
  await assert.rejects(run('run',{ perform:a=>{if(a==='run')throw Error('private provider error');} }));
  assert.equal(state.status,'BLOCKED');
  assert.match(writes.at(-1).summary,/^\[RUN_FAILED\] /);
  assert.equal(await run('run'),'private local output');
  assert.equal(state.status,'IN_PROGRESS');
  assert.doesNotMatch(JSON.stringify(writes),/private/);
});

test('re-read state after lost acknowledgements; do not duplicate starts or submissions', async () => {
  const {run,state,writes} = setup();
  await run('run');
  await assert.rejects(run('run'));
  await run('resume');
  assert.equal(writes.length,1);
  await assert.rejects(run('submit',{artifact:'https://github.com/other/repo/pull/2'}));
  await assert.rejects(run('submit',{artifact:'https://github.com/owner/repo/pull/2?private=1'}));
  await run('submit',{artifact:'https://github.com/owner/repo/pull/2'});
  assert.equal(state.status,'AWAITING_APPROVAL');
  await assert.rejects(run('submit',{artifact:'https://github.com/owner/repo/pull/2'}));
  assert.equal(writes.length,2);
});

test('hands off earlier public repository references and keeps free text and private URLs out', async () => {
  const {run,state} = setup();
  state.events = [{event_type:'SUBMIT',stage:'RESEARCH',summary:'raw report',artifacts:[
    {url:'https://github.com/owner/repo/issues/12'}, {url:'https://example.org/doc?private=1'}]}];
  let materials;
  await run('run',{perform:(action,stage,input)=>{if(action==='run') materials=input;}});
  assert.deepEqual(materials,{title:state.title,handoff:[{stage:'RESEARCH',url:'https://github.com/owner/repo/issues/12'}]});
});
