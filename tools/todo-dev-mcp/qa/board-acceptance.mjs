import assert from 'node:assert/strict';
import { randomUUID } from 'node:crypto';
import { mkdir, writeFile, unlink } from 'node:fs/promises';
import { resolve } from 'node:path';
import { createRequire } from 'node:module';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { makeTodoApi } from '../src/api.mjs';
import { stageAction } from '../src/stage-runner.mjs';
const root = fileURLToPath(new URL('../../../fronted/vue3-merged', import.meta.url));
const require = createRequire(pathToFileURL(root+'/package.json'));
const {createServer} = await import(pathToFileURL(root+'/node_modules/vite/dist/node/index.js').href);
const vue = require('@vitejs/plugin-vue');
const {chromium} = require(process.env.QA_PLAYWRIGHT);
if (!process.env.QA_EVIDENCE) throw new Error('Set QA_EVIDENCE to a local test evidence directory.');
const out = resolve(process.env.QA_EVIDENCE);
await mkdir(out,{recursive:true});
const people = [7,8].map((id,i)=>({id,refresh:randomUUID(),access:randomUUID(),mcp:randomUUID(),
  task:String(31+i),title:i?'整理测试清单':'整理中文笔记与交付清单'}));
const actors = new Map();
const writes = [];
const stages = ['RESEARCH','DESIGN','IMPLEMENTATION','VERIFICATION'];
let disconnected = false;
const base = '/api/v1/light-apps/todos/dev';
function event(c,type,source,status,summary,artifacts=[]) {
  const stamp = new Date().toISOString().replace('Z','');
  c.events.unshift({event_type:type,source,stage:c.stage,status,summary,artifacts,created_at:stamp});
  let clock = c.stage_clocks.find(row=>row.stage===c.stage);
  if(!clock){clock={stage:c.stage}; c.stage_clocks.push(clock);}
  if(status==='IN_PROGRESS' && !clock.started_at) clock.started_at=stamp;
  clock.last_event_at=stamp; c.version++; c.status=status;
}
function advance(c) {
  if(c.stage==='VERIFICATION') c.status='COMPLETE';
  else {c.stage=stages[stages.indexOf(c.stage)+1];c.status='READY';}
  c.required_artifact=c.stage.toLowerCase();
}
async function api(req,res,next) {
  const path=new URL(req.url,'http://localhost').pathname;
  if(!path.startsWith('/api/')) return next();
  if(process.env.QA_DEBUG) console.log(req.method, path);
  const send=(data,status=200)=>{res.writeHead(status,{'content-type':'application/json'});res.end(JSON.stringify({code:status===200?'OK':'ERROR',data}));};
  const body=[]; for await(const buf of req) body.push(buf);
  const data=body.length?JSON.parse(Buffer.concat(body).toString()):{};
  if(path==='/api/v1/auth/tokens') {
    const p=people.find(p=>p.refresh===data.refresh_token);
    return p?send({result_type:'TOKEN_ISSUED',user_id:p.id,access_token:p.access,refresh_token:p.refresh}):send(null,401);
  }
  const web=people.find(p=>req.headers.authorization==='Bearer '+p.access);
  const mcp=people.find(p=>req.headers['x-mcp-token']===p.mcp);
  const p=web||mcp;
  if(!p) return send(null,401);
  if(path==='/api/v1/me') return send({user_id:p.id,nickname:'本机测试 '+p.id});
  if(disconnected && path.startsWith('/api/v1/light-apps')) return send(null,503);
  if(path==='/api/v1/light-apps/todos') return send([{todo_id:Number(p.task),project_id:90,title:p.title}]);
  if(path==='/api/v1/light-apps/projects') return send([{project_id:90,name:'本机验收'}]);
  if(path==='/api/v1/light-apps/todo-recurring-rules') return send([]);
  let c=actors.get(p.task);
  if(path===base+'/overview') return web?send(c?[c]:[]):send(null,403);
  const [,id,op] = path.slice(base.length).split('/');
  if(id!==p.task) return send(null,404);
  if(op==='enable' && web && !c) {
    c={todo_id:id,project_id:'90',title:p.title,repository:data.repository,stage:data.skip_research?'DESIGN':'RESEARCH',
      version:0,status:'READY',events:[],stage_clocks:[]};
    event(c,'ENABLE','WEB','READY','已启用'); actors.set(id,c); return send(c);
  }
  if(!c) return send(null,404);
  if(!op) return send(c);
  if(data.expected_version!==c.version) return send(null,409);
  if(op==='approve' && web && c.status==='AWAITING_APPROVAL') {
    event(c,'APPROVE','WEB',c.stage==='VERIFICATION'?'COMPLETE':'READY','已确认');advance(c);return send(c);
  }
  if(!mcp || !['progress','submit'].includes(op)) return send(null,403);
  writes.push(data);
  if(op==='progress') event(c,'PROGRESS','MCP',data.status,data.summary);
  else {
    const hold=['DESIGN','VERIFICATION'].includes(c.stage);
    event(c,'SUBMIT','MCP',hold?'AWAITING_APPROVAL':'READY',data.summary,data.artifacts);
    if(!hold) advance(c);
  }
  send(c);
}
const fixtureCode = [
"import { createApp,h } from 'vue';", "import { RouterView } from 'vue-router';",
"import router from '/src/router/index.js';", "import TodoWindow from '/src/components/lightapps/timeprism/TodoWindow.vue';",
"router.addRoute({path:'/qa-inbox',component:TodoWindow,meta:{requiresAuth:true}});",
"createApp({render:()=>h(RouterView)}).use(router).mount('#app');"
].join('\n');
const entry = resolve(root,'src/runboard-fixture-entry.js');
await writeFile(entry,fixtureCode,{flag:'wx'});
const server=await createServer({root,configFile:false,envDir:false,logLevel:'error',
  define:{'import.meta.env.VITE_GATEWAY_BASE_URL':JSON.stringify('/')},
  plugins:[vue(),{name:'local-acceptance',
  configureServer(s){ s.middlewares.use(api); s.middlewares.use((req,res,next)=>{
    if(req.url!=='/qa.html')return next();
    res.setHeader('content-type','text/html;charset=utf-8');res.end('<!doctype html><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1"><style>body{margin:0;background:#edf1f7;color:#23344a;font:16px "Microsoft YaHei UI",sans-serif;--la-border:#cdd7e2;--la-btn-bg:#f7f9fc;--la-muted:#506078;--la-text:#1f3149}#app{max-width:1000px;margin:auto;padding:22px}.todo-run-page{box-sizing:border-box;box-shadow:0 8px 35px #1232}.todo-run-page a{color:#305c94}</style><div id="app"></div><script type="module" src="/src/runboard-fixture-entry.js"></script>');
  });}}],server:{host:'127.0.0.1',port:0}});
let browser;
try {
 await server.listen(); const origin='http://127.0.0.1:'+server.httpServer.address().port;
 browser=await chromium.launch({executablePath:process.env.QA_BROWSER,headless:true});
 const ctx=await browser.newContext({viewport:{width:1120,height:880},permissions:['clipboard-read','clipboard-write']});
 await ctx.route('**/*',r=>new URL(r.request().url()).origin===origin?r.continue():r.abort());
 const page=await ctx.newPage();
 page.on('pageerror',e=>console.error(e.message));
 page.on('console',m=>{if(process.env.QA_DEBUG && ['error','warning'].includes(m.type())) console.log(m.type(),m.text().slice(0,240));});
 page.on('requestfailed',r=>{if(process.env.QA_DEBUG)console.log('failed',new URL(r.url()).pathname,r.failure()?.errorText);});
 page.setDefaultTimeout(18000);
 const inbox=origin+'/qa.html#/qa-inbox';
 async function login(p) {
    await ctx.addInitScript(([id,refresh])=>{
      if (sessionStorage.getItem('qa-next')===String(id)) {
        localStorage.setItem('shizuki.auth.v1',JSON.stringify({refreshToken:refresh}));
        localStorage.removeItem('shizuki.user.v1');
      }
    },[p.id,p.refresh]);
    if (!page.url().startsWith(origin)) await page.goto(origin+'/qa.html#/qa-inbox');
    await page.evaluate(id=>sessionStorage.setItem('qa-next',String(id)),p.id);
    await page.goto(inbox);await page.reload();
 }
 const [a,b]=people;await login(a);
 await page.getByText(a.title,{exact:true}).waitFor().catch(async e=>{console.log('view',page.url(),(await page.locator('body').innerText()).slice(0,300));throw e;});
 await page.getByRole('button',{name:'设置研发模式'}).click();
 await page.getByPlaceholder('owner/repository').fill('example/notes');
 await page.getByRole('button',{name:'启用研发模式'}).click();
 await page.getByText('阶段看板',{exact:true}).waitFor();
 await page.getByRole('button',{name:'关联笔记',exact:true}).click();
 await page.getByPlaceholder('obsidian://open',{exact:false}).fill('obsidian://open?vault=验收资料&file=中文/第二%20层/交付%20%231.md');
 await page.locator('.local-note form button').first().click();
 assert.equal(new URL(await page.getByText('打开本机笔记').getAttribute('href')).searchParams.get('file'),'中文/第二 层/交付 #1.md');
 await page.getByRole('button',{name:/复制返回 Todo/}).click();
 const md = await page.evaluate(()=>navigator.clipboard.readText());
 assert.ok(md.startsWith('['+a.title+']'));const back=md.match(/<(.+)>/)[1];
 await page.goto(back);await page.getByRole('heading',{name:a.title}).waitFor();
 const client=makeTodoApi({origin,accountToken:a.mcp});
 const worker=(action,stage,more={})=>stageAction({api:client,action,id:a.task,stage,fixture:true,...more});
 for(const stage of stages) {
   if(stage==='IMPLEMENTATION') {
     await assert.rejects(worker('run',stage,{perform:()=>{throw new Error('fixture failure');}}));
     assert.equal((await client.context(a.task)).status,'BLOCKED'); await page.getByRole('button',{name:'刷新研发进度'}).click(); await page.locator('.run-board [data-status=FAILED]').waitFor();
   }
   const result=await worker('run',stage);assert.ok(result.includes('离线模拟'));
   await page.getByRole('button',{name:'刷新研发进度'}).click();
   await page.locator('[aria-current="step"][data-status="IN_PROGRESS"]').waitFor();
   if(stage==='IMPLEMENTATION') {
     await page.locator('.todo-run-page').screenshot({path:out+'/board-running.png'});
     disconnected=true;await page.getByRole('button',{name:'刷新研发进度'}).click();
     await page.getByRole('alert').waitFor();disconnected=false;
   }
   await worker('submit',stage,{artifact:'https://github.com/example/notes/issues/'+(stages.indexOf(stage)+1)});
   await page.evaluate(()=>window.dispatchEvent(new Event('online')));
   if(['DESIGN','VERIFICATION'].includes(stage)) {
     await page.locator('.todo-dev-review button').click();
     await page.locator('.todo-dev-review').waitFor({state:'hidden'});
   }
 }
 assert.equal((await client.context(a.task)).status,'COMPLETE');
 assert.equal(await page.locator('.run-board [data-status="COMPLETE"]').count(),4);
 for (const body of writes) {
   const extra = body.artifacts ? 'artifacts' : 'status';
   assert.deepEqual(Object.keys(body).sort(), ['expected_version','request_id','summary',extra].sort());
   if (body.artifacts) {
     assert.equal(body.artifacts.length,1);
     assert.deepEqual(Object.keys(body.artifacts[0]).sort(),['kind','url']);
     assert.match(body.artifacts[0].url,/^https:\/\/github\.com\/example\/notes\/issues\/[1-4]$/);
   }
   for (const person of people) {
     for (const secret of [person.refresh,person.access,person.mcp,person.title]) {
       assert.ok(!JSON.stringify(body).includes(secret));
     }
   }
 }
 assert.ok(writes.every(w=>!JSON.stringify(w).includes(a.title) && !JSON.stringify(w).match(/obsidian:|[A-Za-z]:\\\\/)));
 await login(b); await page.getByText(b.title,{exact:true}).waitFor();assert.equal(await page.getByText(a.title).count(),0);
 disconnected=true;await page.reload();await page.getByText(b.title,{exact:true}).waitFor();assert.equal(await page.getByText(a.title).count(),0);
 disconnected=false;await page.evaluate(()=>window.dispatchEvent(new Event('online')));
 await page.getByRole('button',{name:'设置研发模式'}).click();
 await page.getByPlaceholder('owner/repository').fill('example/notes');
 await page.getByText('跳过调研，从方案设计开始').click();
 await page.getByRole('button',{name:'启用研发模式'}).click();
 await page.locator('.run-board [data-status="SKIPPED"]').waitFor();
 await page.getByText(/这台设备还没有关联笔记/).waitFor();
 await page.getByRole('button',{name:/复制返回 Todo/}).click();
 const bLink=(await page.evaluate(()=>navigator.clipboard.readText())).match(/<(.+)>/)[1];
 await page.goto(bLink);await page.getByRole('heading',{name:b.title}).waitFor();
 await page.locator('.todo-run-page').screenshot({path:out+'/board-skipped.png'});
 await page.goto(back);await page.getByText(/当前账号没有查看权限/).waitFor();
 assert.equal(await page.locator('.local-note').count(),0);
 await assert.rejects(makeTodoApi({origin,accountToken:b.mcp}).context(a.task));
 const foreignWrite = await fetch(origin+base+'/'+a.task+'/progress',{method:'POST',
   headers:{'X-MCP-Token':b.mcp,'Content-Type':'application/json'},
   body:JSON.stringify({expected_version:0,status:'IN_PROGRESS',summary:'synthetic',request_id:randomUUID()})});
 assert.equal(foreignWrite.status,404);
 assert.equal((await client.context(a.task)).status,'COMPLETE');
 const anon=await fetch(origin+base+'/'+a.task);assert.equal(anon.status,401);
 const phone=await browser.newContext({viewport:{width:390,height:844},isMobile:true,hasTouch:true});
 await phone.route('**/*',r=>new URL(r.request().url()).origin===origin?r.continue():r.abort());
 await phone.addInitScript(refresh=>localStorage.setItem('shizuki.auth.v1',JSON.stringify({refreshToken:refresh})),a.refresh);
 const mobilePage=await phone.newPage();await mobilePage.goto(back);
 await mobilePage.getByRole('heading',{name:a.title}).waitFor();
 await mobilePage.getByText(/这台设备还没有关联笔记/).waitFor();
 assert.equal(await mobilePage.locator('.run-board li').count(),4);
 assert.ok(await mobilePage.evaluate(()=>document.documentElement.scrollWidth<=window.innerWidth));
 await phone.close();
 console.log('PASS: two browser accounts; full SDK fixture -> MCP HTTP -> Vue -> web approvals; FAILED retry; skipped; Chinese return route; offline and reconnect; foreign/anonymous access; two screenshots. Model execution simulated.');
} finally {await browser?.close();await server.close();await unlink(entry);}
