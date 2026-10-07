"""Browser regression check against a running Vite server.

Run with the existing Python/Playwright environment:
  python scripts/check-home-music.py --url http://127.0.0.1:5173
All API calls are fulfilled locally; no account or remote music is required.
"""
import argparse
from array import array
from io import BytesIO
import math
from pathlib import Path
import wave

from playwright.sync_api import sync_playwright


def audio_fixture():
    rate = 24000
    samples = array('h')
    for i in range(rate * 30):
        t = i / rate
        amplitude = 0.18 if t % 2 < 1.3 else 0.01
        value = sum(math.sin(2 * math.pi * hz * t) for hz in [110, 440, 880, 1760]) / 4
        samples.append(int(value * amplitude * 32767))
    output = BytesIO()
    with wave.open(output, 'wb') as audio:
        audio.setnchannels(1)
        audio.setsampwidth(2)
        audio.setframerate(rate)
        audio.writeframes(samples.tobytes())
    return output.getvalue()


def assert_position(actual, expected, label):
    for coordinate in ('x', 'y', 'width', 'height'):
        assert abs(actual[coordinate] - expected[coordinate]) < 1, (label, actual, expected)


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--url', default='http://127.0.0.1:5173')
    parser.add_argument('--browser', default=r'C:\Program Files (x86)\Microsoft\Edge\Application\msedge.exe')
    parser.add_argument('--screenshots', type=Path, help='Optional screenshot output directory')
    args = parser.parse_args()
    base = args.url.rstrip('/')
    audio = audio_fixture()
    track = {'id': 'spectrum-check', 'title': 'Spectrum check', 'artist': 'Local fixture',
             'provider': 'local', 'audio': base + '/spectrum-check.wav', 'durationSec': 30}
    bundle = {'profile': {'playlistCode': 'default_public', 'name': 'Local check'}, 'tracks': [track]}

    def api(route):
        url = route.request.url
        if '/bundle' in url:
            data = bundle
        elif '/tracks?' in url or url.endswith('/tracks'):
            data = {'items': [track], 'tracks': [track], 'total': 1, 'hasMore': False}
        elif '/providers' in url:
            data = []
        else:
            data = {}
        route.fulfill(json={'data': data})

    with sync_playwright() as p:
        browser = p.chromium.launch(headless=True, executable_path=args.browser)
        try:
            for width, height in [(1440, 900), (1000, 800), (900, 800), (760, 1000)]:
                context = browser.new_context(viewport={'width': width, 'height': height})
                context.route('**/api/**', api)
                context.route('**/spectrum-check.wav', lambda route: route.fulfill(content_type='audio/wav', body=audio))
                page = context.new_page()
                errors = []
                page.on('pageerror', lambda error: errors.append(str(error)))
                page.goto(base + '/#/')
                page.wait_for_load_state('networkidle')
                lyric = page.locator('.global-lyric-bar')
                expected = lyric.bounding_box()

                def navigate(path, selector):
                    page.evaluate('(path) => { location.hash = path; }', '#' + path)
                    page.wait_for_selector(selector)
                    page.wait_for_load_state('networkidle')

                for route, selector in [('/apps', '.apps-layout'), ('/blog', '.blog-list-page'), ('/', '.home-time-stage')]:
                    navigate(route, selector)
                    assert_position(lyric.bounding_box(), expected, route)

                x, y = expected['x'] + expected['width'] / 2, expected['y'] + expected['height'] / 2
                page.mouse.move(x, y)
                page.mouse.down()
                page.mouse.move(x + 70, y - 45, steps=5)
                page.mouse.up()
                dragged = lyric.bounding_box()
                assert abs(dragged['x'] - expected['x'] - 70) < 1
                assert abs(dragged['y'] - expected['y'] + 45) < 1
                navigate('/apps', '.apps-layout')
                assert_position(lyric.bounding_box(), dragged, 'dragged applications')
                navigate('/music-library/music', '.music-library-page')
                page.wait_for_selector('.global-lyric-bar', state='hidden')
                navigate('/', '.home-time-stage')
                assert_position(lyric.bounding_box(), dragged, 'returned from music')
                page.reload()
                page.wait_for_load_state('networkidle')
                assert_position(lyric.bounding_box(), dragged, 'reload')
                assert not errors, errors
                print(f'PASS subtitles {width}x{height}: routes, drag, hide/return, reload', flush=True)

                if width == 1440:
                    page.evaluate("localStorage.setItem('shizuki.musicPlayer.v2', JSON.stringify({...JSON.parse(localStorage.getItem('shizuki.musicPlayer.v2')), visualizerMode: 'bars', visualizerStyle: 'bars-aurora', isPlayerExpanded: true, isPinned: true}))")
                    page.reload()
                    page.wait_for_load_state('networkidle')
                    navigate('/music-library/playlist/default_public', '.music-playlist-view')
                    page.locator('.search-track-row').first.click()
                    navigate('/', '.home-time-stage')
                    page.wait_for_selector('.music-player-shell button[title="暂停"]')
                    canvas = page.locator('.global-bars canvas')
                    stage = canvas.bounding_box()
                    assert stage['height'] >= 130
                    assert abs(stage['x'] + stage['width'] / 2 - width / 2) < 1
                    page.wait_for_function("Array.from(document.querySelector('.global-bars canvas').getContext('2d').getImageData(0, 0, 500, 100).data).some((v, i) => i % 4 === 3 && v > 0)")
                    if args.screenshots:
                        args.screenshots.mkdir(parents=True, exist_ok=True)
                        page.screenshot(path=str(args.screenshots / 'home-spectrum-desktop.png'))
                    page.locator('.music-player-shell button[title="展开播放器"]').click()
                    page.wait_for_selector('.music-player-shell .player-card.active')
                    page.locator('.music-player-shell button[title="可视化"]').click()
                    page.get_by_role('button', name='晶体频谱', exact=True).click()
                    assert page.locator('.global-bars.bars-crystal canvas').count() == 1
                    page.get_by_role('button', name='圆形', exact=True).click()
                    page.get_by_role('button', name='轨道星环', exact=True).click()
                    assert page.locator('.global-ring.ring-orbit canvas').count() == 1
                    assert page.locator('.global-bars').count() == 0
                    page.get_by_role('button', name='线型', exact=True).click()
                    page.get_by_role('button', name='极光光柱', exact=True).click()
                    page.locator('.music-player-shell button[title="可视化"]').click()
                    page.set_viewport_size({'width': 900, 'height': 800})
                    page.wait_for_function("(() => { const c = document.querySelector('.global-bars canvas'); return Array.from(c.getContext('2d').getImageData(0, 0, c.width, Math.floor(c.height * 0.7)).data).some((v, i) => i % 4 === 3 && v > 0); })()")
                    if args.screenshots:
                        page.screenshot(path=str(args.screenshots / 'home-spectrum-narrow.png'))
                    page.locator('.music-player-shell button[title="暂停"]').click()
                    page.wait_for_function("Array.from(document.querySelector('.global-bars canvas').getContext('2d').getImageData(0, 0, 500, 100).data).every((v, i) => i % 4 !== 3 || v === 0)")
                    navigate('/blog', '.blog-list-page')
                    assert page.locator('.global-bars, .global-ring').count() == 0
                    page.goto(base + '/?guard_no_visualizer=1#/')
                    page.wait_for_load_state('networkidle')
                    assert page.locator('.global-bars, .global-ring').count() == 0
                    assert not errors, errors
                    print('PASS live Home spectrum: Canvas pixels, centered stage, styles/ring, pause decay, route cleanup, runtime guard', flush=True)
                context.close()
        finally:
            browser.close()


if __name__ == '__main__':
    main()
