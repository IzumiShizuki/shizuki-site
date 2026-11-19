from pathlib import Path
import sys, io,wave,json,threading,http.server,functools
from urllib.parse import urlsplit
from playwright.sync_api import sync_playwright
root=Path(sys.argv[1])
class H(http.server.SimpleHTTPRequestHandler):
 def log_message(self,*a): pass
s=http.server.ThreadingHTTPServer(('127.0.0.1',0),functools.partial(H,directory=str(root)))
threading.Thread(target=s.serve_forever,daemon=True).start()
o=f'http://127.0.0.1:{s.server_port}'
f=io.BytesIO()
with wave.open(f,'wb') as w:
 w.setparams((1,2,8000,0,'NONE',''));w.writeframes(bytes(20*16000))
tracks=[dict(id=str(i),title=f'Fixture {i}',provider='local',artist='QA',audio=f'{o}/sample-{i}.wav',lyricText=f'[00:00.00]Synthetic {i}', **({'durationSec':20} if i==3 else {})) for i in range(1,26)]
hook="""(name) => {const app=document.querySelector('#app').__vue_app__;const v=app._instance || app._container._vnode.component;const seen=new Set();function walk(n){if(!n||seen.has(n))return null;seen.add(n);if(n.component){const p=n.component.provides;for(const k of Reflect.ownKeys(p)){if(p[k]?.loadPlaylistByCode&&p[k]?.replaceQueueWithTracks)return p[k]} const h=walk(n.component.subTree);if(h)return h}const branch=walk(n.suspense?.activeBranch)||walk(n.ssContent);if(branch)return branch;if(Array.isArray(n.children)){for(const x of n.children){const h=walk(x);if(h)return h}}}const bridge=walk(v.vnode)||walk(v.subTree);if(!bridge)throw Error('Missing playback bridge');return bridge.loadPlaylistByCode(name);}"""
with sync_playwright() as p:
 e=p.chromium.launch(channel='msedge',args=['--disable-background-networking','--mute-audio'])
 for mobile in (False,True):
  c=e.new_context(**(p.devices['iPhone 13'] if mobile else {'viewport':{'width':1440,'height':900}}))
  req=[]; bundles=[]; errors=[]
  def intercept(r):
   u=r.request.url
   path=urlsplit(u).path
   if path.startswith('/api/v1/music/playlists/') and path.endswith('/bundle'):
    bundles.append(u)
    return r.fulfill(headers={'Access-Control-Allow-Origin':o},json={'data':{'profile':{'name':'Perf fixture'},'tracks':tracks}})
   if not u.startswith(o+'/'):return r.abort()
   if '.wav' in u:
    req.append(u.rsplit('/',1)[-1]);return r.fulfill(content_type='audio/wav',body=f.getvalue())
   if '/api/' in u:return r.fulfill(status=404,json={})
   return r.continue_()
  c.route('**/*',intercept);c.add_init_script("""window.__audioCreated=0; const audio=window.Audio; window.Audio=new Proxy(audio,{construct(target,args){window.__audioCreated++;return Reflect.construct(target,args)}});localStorage.setItem('shizuki.musicPlayer.v2',JSON.stringify({isPlayerExpanded:true,isPinned:true}));""")
  q=c.new_page();q.on('pageerror',lambda error:errors.append(str(error)));q.goto(o+'/#/'+('m/music' if mobile else 'blog'));q.wait_for_function('window.__audioCreated >= 1');q.wait_for_timeout(600)
  q.evaluate(hook,'perf-fixture');q.wait_for_timeout(1000)
  assert len(bundles)==1, ('expected one fixture bundle',bundles)
  report=dict(mobile=mobile,initial_media=len(req),initial_tracks=len(set(req)),audio_nodes=q.evaluate('window.__audioCreated'),bundles=len(bundles),idle_lyric_bar=q.locator('.global-lyric-bar').count())
  b=q.locator('.m-mini .mini-btn' if mobile else '.music-player-shell .pause-btn').first
  if b.is_visible():
   if mobile:b.focus();b.press('Enter',timeout=3000)
   else:b.click(timeout=3000)
   q.wait_for_timeout(650);full=q.locator('.m-player');report.update(play_media=len(req),playing_lyrics=q.locator('.global-lyric-bar').all_text_contents(),expanded_after_play=full.count() if mobile else None)
   if mobile and full.count():
    full.locator('.head-btn').first.click(timeout=3000);full.wait_for(state='hidden',timeout=4000)
   n=q.locator('.m-mini .mini-btn' if mobile else '.music-player-shell .edge-btn').last;n.click(timeout=3000);q.wait_for_timeout(350);report.update(next_track=q.get_by_text('Fixture 2',exact=True).count())
   if not mobile:q.evaluate("location.hash='/blog/qa'");q.wait_for_timeout(400);report.update(cross_route_lyrics=q.locator('.global-lyric-bar').all_text_contents())
   b.click(timeout=3000);q.wait_for_timeout(300);report.update(pause_lyric_bar=q.locator('.global-lyric-bar').count())
  report.update(errors=errors)
  print(json.dumps(report,ensure_ascii=False),flush=True)
  if 'after' in root.name:
   assert report['initial_media']==0 and report['audio_nodes']==1 and report['idle_lyric_bar']==0
   assert report['play_media']>0 and report['next_track']>0 and report['pause_lyric_bar']==0
   assert not report['errors']
   if mobile:assert report['expanded_after_play']==0
  c.close()
 e.close()
s.shutdown()
