import asyncio, functools, http.server, io, json, sys, threading, wave
from pathlib import Path
from urllib.parse import urlsplit
from playwright.async_api import async_playwright

root = Path(sys.argv[1])
keep_playing = "--keep-playing" in sys.argv[2:]
class Server(http.server.SimpleHTTPRequestHandler):
    def log_message(self, *args): pass
server = http.server.ThreadingHTTPServer(("127.0.0.1", 0), functools.partial(Server, directory=str(root)))
threading.Thread(target=server.serve_forever, daemon=True).start()
origin = f"http://127.0.0.1:{server.server_port}"
wave_file = io.BytesIO()
with wave.open(wave_file, "wb") as output:
    output.setparams((1, 2, 8000, 0, 'NONE', ''))
    output.writeframes(bytes(180 * 16000))
bridge_hook = Path(__file__).with_name("player-browser-smoke.py").read_text().split('hook="""')[1].split('"""')[0]

async def smoke():
    async with async_playwright() as playwright:
        edge = await playwright.chromium.launch(channel="msedge", args=["--disable-background-networking", "--mute-audio"])
        for mobile in (False, True):
            ctx = await edge.new_context(**(playwright.devices["iPhone 13"] if mobile else {"viewport": {"width": 1440, "height": 900}}))
            counts = {}
            media = []
            errors = []
            tracks = [{"id": str(i), "trackId": str(i), "title": f"Fixture {i}",
                       "provider": "local" if i == 1 else "netease", "artist": "QA", "durationSec": 180,
                       "lyricText": f"[00:00.00]Synthetic {i}", **({"audio": f"{origin}/sample-1.wav"} if i == 1 else {})}
                      for i in range(1, 9)]
            async def route(r):
                path=urlsplit(r.request.url).path
                h={"Access-Control-Allow-Origin":origin}
                if path.startswith("/api/v1/music/playlists/") and path.endswith("/bundle"):
                    return await r.fulfill(headers=h, json={"data":{"profile":{"playlistCode":"perf-fixture","name":"Perf fixture"},"tracks":tracks}})
                if path.endswith("/resolve-playback"):
                    if r.request.method == "OPTIONS":
                        return await r.fulfill(headers={**h,"Access-Control-Allow-Headers":"*","Access-Control-Allow-Methods":"POST"}, status=204)
                    payload = r.request.post_data_json
                    i = str(payload.get("trackId") or payload.get("track_id"))
                    if i == "None":
                        raise AssertionError(payload)
                    counts[i] = counts.get(i, 0) + 1
                    await asyncio.sleep(.85 if i == "3" else .45)
                    return await r.fulfill(headers=h, json={"data":{"audio":f"{origin}/sample-{i}.wav"}})
                if not r.request.url.startswith(origin+"/"): return await r.abort()
                if path.endswith(".wav"):
                    media.append(path)
                    await asyncio.sleep(.25)
                    return await r.fulfill(content_type="audio/wav", body=wave_file.getvalue())
                if path.startswith("/api/"): return await r.fulfill(status=404, json={})
                await r.continue_()
            await ctx.route("**/*",route)
            await ctx.add_init_script("""window.__plays=[];window.__pauses=[];window.__shift=0;const ctor=Audio;window.Audio=new Proxy(ctor,{construct(target,args){const a=Reflect.construct(target,args);a.addEventListener('playing',()=>window.__plays.push([a.currentSrc,performance.now()]));const pause=a.pause.bind(a);a.pause=()=>{if(!a.paused)window.__pauses.push(performance.now());return pause()};return a}});const now=Date.now.bind(Date);Date.now=()=>now()+window.__shift;localStorage.setItem('shizuki.musicPlayer.v2',JSON.stringify({isPlayerExpanded:true,isPinned:true}));""")
            page=await ctx.new_page()
            page.on("pageerror", lambda e: errors.append(str(e)))
            await page.goto(origin+"/#/"+("m/music" if mobile else "blog"))
            await page.wait_for_timeout(750)
            await page.evaluate(bridge_hook,"perf-fixture")
            play=page.locator(".m-mini .mini-btn" if mobile else ".music-player-shell .pause-btn").first
            next_button=page.locator(".m-mini .mini-btn" if mobile else ".music-player-shell .edge-btn").last
            await play.click()
            await page.wait_for_function("__plays.some(([u])=>u.includes('sample-1'))")
            await page.wait_for_timeout(700)
            async def next_to(i):
                await next_button.evaluate("(b)=>{window.__click=performance.now();window.__titleMs=null; window.__obs?.disconnect();const i="+str(i)+";window.__obs=new MutationObserver(()=>{if(document.body.innerText.includes('Fixture '+i)){window.__titleMs=performance.now()-window.__click;window.__obs.disconnect()}});window.__obs.observe(document.body,{childList:true,characterData:true,subtree:true});b.click()}")
                await page.wait_for_function(f"__plays.some(([u])=>u.includes('sample-{i}'))")
                return await page.evaluate(f"""() => {{
                  const elapsed = t => Math.round(t-__click);
                  const played = __plays.find(([u])=>u.includes('sample-{i}'))[1];
                  const paused = __pauses.find(t => t >= __click);
                  const stages = Object.fromEntries(performance.getEntriesByType('mark')
                    .filter(m => m.name.startsWith('music-next:')).map(m => [m.name.split(':')[1], elapsed(m.startTime)]));
                  return {{title:Math.round(__titleMs), playing:elapsed(played),
                    pause:paused == null ? null : elapsed(paused),
                    inactive:paused == null ? null : Math.round(played-paused), stages}};
                }}""")
            warm=await next_to(2)
            await page.wait_for_timeout(1000)
            await page.evaluate("window.__shift=31_000") # expire prepared result without a 31s wait
            cold=await next_to(3)
            prior = len(media)
            await next_button.evaluate("(b)=>{b.click();b.click()}")
            await page.wait_for_function("__plays.some(([u])=>u.includes('sample-5'))")
            await page.wait_for_timeout(700)
            rapid=media[prior:]
            queue_bench = await page.evaluate(bridge_hook.replace(
                "return bridge.loadPlaylistByCode(name);",
                '''return (async () => {
                  const sizes = [500, 1500, 3000];
                  const report = [];
                  for (const size of sizes) {
                    await bridge.replaceQueueWithTracks(Array.from({length:size}, (_, i) => ({
                      provider:'local', trackId:'test-'+i, title:'Test '+i, audio:'https://fixture.invalid/'+i
                    })),0,false);
                    bridge.playMode.value = 'random';
                    const start = performance.now();
                    const result = bridge.queueDisplayTracks.value;
                    report.push([size, Math.round(performance.now()-start), result.length]);
                    bridge.playMode.value = 'sequential';
                  }
                  return report;
                })();'''
            ))
            assert all(size == actual for size, _, actual in queue_bench), queue_bench
            print(json.dumps({"mobile":mobile,"warm_title_play_ms":warm,"expired_title_play_ms":cold,
                              "rapid_next_media":rapid,"shuffle_compute_ms":queue_bench,"requests":counts,"errors":errors}),flush=True)
            assert cold["playing"] >= warm["playing"] + 600
            if keep_playing:
                assert cold["pause"] >= 650 and cold["inactive"] < 650, cold
                assert {"click", "resolved", "loadstart", "playing"} <= cold["stages"].keys(), cold
            else:
                assert warm["title"] < 100 and cold["title"] < 100
                assert cold["pause"] < 100 and cold["inactive"] >= 650, cold
            assert not any("sample-4" in path for path in rapid) and any("sample-5" in path for path in rapid)
            assert not errors
            await ctx.close()
        await edge.close()
try:
    asyncio.run(smoke())
finally:
    server.shutdown()
