"""Paired Edge fixture. No external requests, credentials, or downloaded audio."""
import functools
import http.server
import io
import json
import re
import sys
import threading
import time
import wave
from pathlib import Path
from urllib.parse import urlsplit

from playwright.sync_api import sync_playwright

root = Path(sys.argv[1]).resolve()
folia = Path(sys.argv[2]).resolve() if len(sys.argv) > 2 else None
prefix = "/api/v1/music/tracks/stream/"
hook = Path(__file__).with_name("player-browser-smoke.py").read_text().split('hook="""')[1].split('"""')[0]
counts = {}
media = []
ignore_range = False
scenario_id = 0
sample = io.BytesIO()
with wave.open(sample, "wb") as wav:
    wav.setparams((2, 2, 44_100, 0, "NONE", ""))
    wav.writeframes(b"\x11\x02\x11\x02" * (180 * 44_100))
audio_bytes = sample.getvalue()


class Server(http.server.SimpleHTTPRequestHandler):
    def log_message(self, *_):
        pass

    def translate_path(self, path):
        path = urlsplit(path).path
        if folia and path.startswith("/music/"):
            candidate = (folia / path.removeprefix("/music/")).resolve()
            if candidate.is_relative_to(folia):
                return str(candidate)
        return super().translate_path(path)

    def send_audio(self, path):
        size = len(audio_bytes)
        header = self.headers.get("Range", "")
        match = re.match(r"bytes=(\d+)-(\d*)$", header)
        if ignore_range:
            match = None
        start = int(match[1]) if match else 0
        end = min(int(match[2]), size-1) if match and match[2] else size-1
        time.sleep(.32)
        self.send_response(206 if match else 200)
        self.send_header("Content-Type", "audio/wav")
        self.send_header("Cache-Control", "private, no-store, max-age=0")
        self.send_header("Content-Length", str(end-start+1))
        if not ignore_range:
            self.send_header("Accept-Ranges", "bytes")
        if match:
            self.send_header("Content-Range", f"bytes {start}-{end}/{size}")
        self.end_headers()
        entry = {"path": path, "range": header, "bytes":0}
        media.append(entry)
        try:
            for offset in range(start, end+1, 16384):
                chunk = audio_bytes[offset:min(end+1, offset+16384)]
                self.wfile.write(chunk)
                self.wfile.flush()
                entry["bytes"] += len(chunk)
                time.sleep(.02)
        except (ConnectionError, OSError):
            pass

    def do_GET(self):
        path = urlsplit(self.path).path
        if path.startswith(prefix) or path == "/old.wav":
            return self.send_audio(path)
        if path.startswith("/api/"):
            self.send_error(404)
            return
        return super().do_GET()


server = http.server.ThreadingHTTPServer(("127.0.0.1", 0), functools.partial(Server, directory=str(root)))
threading.Thread(target=server.serve_forever, daemon=True).start()
origin = f"http://127.0.0.1:{server.server_port}"


def scenario(edge, mode, save_data, shift_ms=0, range_ignored=False):
    global ignore_range, scenario_id
    scenario_id += 1
    token_prefix = prefix+f"qa-{scenario_id}-track-"
    ignore_range = range_ignored
    media.clear()
    counts.clear()
    mobile = mode == "mobile"
    context = edge.new_context(service_workers="block", **(
        automation.devices["iPhone 13"] if mobile else {"viewport":{"width":1440,"height":900}}))
    tracks = [
        {"id":"1","trackId":"1","title":"Fixture 1","provider":"local","audio":origin+"/old.wav",
         "artist":"Sync QA","durationSec":180,"lyricText":"[00:00.00]Old"},
        {"id":"2","trackId":"2","title":"Fixture 2","provider":"netease","artist":"Sync QA",
         "durationSec":180,"lyricText":"[00:00.00]Next"}
    ]

    def route(r):
        url = r.request.url
        path = urlsplit(url).path
        cors = {"Access-Control-Allow-Origin":origin}
        if path.startswith("/api/v1/music/playlists/") and path.endswith("/bundle"):
            return r.fulfill(headers=cors,json={"data":{"profile":{"playlistCode":"qa","name":"QA"},"tracks":tracks}})
        if path.endswith("/resolve-playback"):
            if r.request.method == "OPTIONS":
                return r.fulfill(status=204,headers={**cors,"Access-Control-Allow-Headers":"*","Access-Control-Allow-Methods":"POST"})
            i = str(r.request.post_data_json.get("trackId") or r.request.post_data_json.get("track_id"))
            counts[i] = counts.get(i, 0) + 1
            time.sleep(.42)
            return r.fulfill(headers=cors,json={"data":{"audio":token_prefix+i+"-"+str(counts[i])}})
        return r.continue_() if url.startswith(origin+"/") else r.abort()

    context.route("**/*", route)
    context.add_init_script("""window.audios=[];window.plays=[];window.commands=[];window.shift=0;
        const AudioCtor=Audio; window.Audio=new Proxy(AudioCtor,{construct(target,args){
          const audio=Reflect.construct(target,args);const slot=window.audios.push(audio)-1;
          audio.addEventListener('playing',()=>window.plays.push([slot,audio.currentSrc,performance.now()]));
          return audio;
        }});
        const clock=Date.now.bind(Date); Date.now=()=>clock()+window.shift;
        window.addEventListener('message',e=>{
          if(e.source===window && e.data?.type==='shizuki:playback-command') commands.push(e.data.action);
        });
        // Installed-user playback fixture, not a test of onboarding.
        localStorage.setItem('folia_last_seen_guide_version','0.7.11');
        localStorage.setItem('folia_last_seen_ponder_onboarding_version','0.7.11');
        localStorage.setItem('playback_entry_view_chosen','true');
        localStorage.setItem('shizuki.musicPlayer.v2',JSON.stringify({isPlayerExpanded:true,isPinned:true}));
    """+f"Object.defineProperty(navigator,'connection',{{value:{{saveData:{str(save_data).lower()},type:'wifi',effectiveType:'4g'}}}});")
    page=context.new_page()
    errors=[]
    page.on("pageerror",lambda error:errors.append(str(error)))
    try:
        path="m/music" if mobile else ("music-library/music" if mode == "folia" else "blog")
        page.goto(origin+"/#/"+("blog" if mode=="folia" else path), wait_until="domcontentloaded")
        page.wait_for_timeout(900)
        page.evaluate(hook,"qa")
        play=page.locator(".m-mini .mini-btn" if mobile else ".music-player-shell .pause-btn").first
        next_button=page.locator(".m-mini .mini-btn" if mobile else ".music-player-shell .edge-btn").last
        play.click(timeout=8000)
        page.wait_for_function("plays.some(([,u])=>u.endsWith('/old.wav'))")
        if mode=="folia":
            page.evaluate("location.hash='/music-library/music'")
            page.locator(".music-library-page").wait_for()
            if not page.locator(".folia-mode-active").count():
                page.evaluate("window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'))")
            root=page.locator(".folia-mode-active #folia-embed-root")
            root.locator("button").first.wait_for(timeout=12000)
            release = page.get_by_test_id("release-notes-dialog")
            if release.is_visible():
                close = release.locator('button[aria-label],button[title]').filter(visible=True).first
                if close.count():
                    close.click()
                else:
                    release.get_by_role("button").last.click()
                release.wait_for(state="hidden")
            next_button=root.locator(
                'button[aria-label*="next" i], button[title*="next" i], button[aria-label*="下一"], '
                'button[title*="下一"], button[data-tooltip-content*="下一"], button[data-action*="next" i], button:has(svg.lucide-skip-forward), button:has(svg[data-lucide="skip-forward"])'
            ).filter(visible=True).first
            bar = root.locator('[data-ponder="player-bar"]').filter(visible=True).first
            bar.wait_for(timeout=8000)
            if not next_button.count():
                bar.hover()
                page.wait_for_timeout(450)
            if not next_button.count():
                bar.click()
                page.wait_for_timeout(450)
            if not next_button.count():
                summary = root.locator("button").evaluate_all(
                    "(bs)=>bs.slice(0,30).map(b=>[b.getAttribute('aria-label'),b.getAttribute('title'),b.textContent,b.querySelector('svg')?.getAttribute('class')])")
                print(json.dumps(summary),flush=True)
        if shift_ms:
            page.evaluate(f"window.shift={shift_ms}")
        page.wait_for_timeout(1200)
        ready=page.evaluate("audios.map(a=>({source:a.getAttribute('src'),ready:a.readyState,network:a.networkState,buffered:Array.from({length:a.buffered.length},(_,i)=>[a.buffered.start(i),a.buffered.end(i)]),current:a.currentTime}))")
        start_resolves = dict(counts)
        before = sum(m["bytes"] for m in media if m["path"].startswith(token_prefix))
        requests_before = sum(1 for m in media if m["path"].startswith(token_prefix))
        page.evaluate("""window.addEventListener('click',()=>window.mark=performance.now(),
                           {capture:true,once:true})""")
        next_button.click(timeout=6000)
        page.wait_for_function(r"plays.some(([,u])=>/\/stream\/qa-\d+-track-2-/.test(u))",timeout=12000)
        result=page.evaluate(r"""()=>{
          const [slot,,timestamp]=plays.find(([,u])=>/\/stream\/qa-\d+-track-2-/.test(u));
          return {slot,ms:Math.round(timestamp-window.mark),
            hit:performance.getEntriesByName('music-next:buffer-hit').length===1, marks:performance.getEntriesByType('mark').map(m=>m.name).filter(n=>n.startsWith('music-next:')),
            command:commands.includes('next'), onlyActive:audios.filter(a=>!a.paused).length===1};
        }""")
        result.update(mode=mode,save_data=save_data,shift_ms=shift_ms,range_ignored=range_ignored,
                      before_bytes=before,requests_before=requests_before,requests_after=sum(1 for m in media if m["path"].startswith(token_prefix)),
                      resolves=counts.get("2"),start_resolves=start_resolves,errors=errors,ready=ready,
                      stream_ranges=[m["range"] for m in media if m["path"].startswith(token_prefix)])
        print(json.dumps(result),flush=True)
        assert result["onlyActive"] and not errors
        if mode=="folia":
            assert result["command"]
        if result["hit"]:
            assert result["slot"]!=0, result
            assert sum(r in ("", "bytes=0-") for r in result["stream_ranges"]) <= 1, result
        if save_data:
            assert before==0 and not result["hit"], result
        return result
    finally:
        context.close()


try:
    print("Loopback fixture ready", flush=True)
    with sync_playwright() as automation:
        print("Playwright ready", flush=True)
        edge=automation.chromium.launch(channel="msedge",args=["--disable-background-networking","--mute-audio"])
        print("Edge ready", flush=True)
        for mode in (sys.argv[3:4] or (("standard","mobile","folia") if folia else ("standard","mobile"))):
            control=scenario(edge,mode,True)
            candidate=scenario(edge,mode,False)
            assert candidate["hit"] and candidate["ms"] < control["ms"], (control,candidate)
        if len(sys.argv) < 4:
            scenario(edge,"standard",False,shift_ms=47_000)
            scenario(edge,"standard",False,range_ignored=True)
        edge.close()
finally:
    server.shutdown()
