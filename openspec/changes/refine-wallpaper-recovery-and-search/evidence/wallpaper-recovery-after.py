import json
from pathlib import Path
from playwright.sync_api import sync_playwright

ROOT = 'http://127.0.0.1:4179'
PROFILE = {
    'wallpaperId': 4242,
    'title': 'UI Applied Recovery Check',
    'visualUrl': '/images/katanegai.jpg?cache-e2e=1',
    'previewUrl': '/images/katanegai.jpg?cache-e2e=1',
    'sceneType': 'STATIC',
    'visibility': 'PUBLIC',
    'auditStatus': 'APPROVED',
    'importSource': 'PACKAGE',
}
GLOBAL_PROFILE = {
    **PROFILE,
    'wallpaperId': 9999,
    'title': 'Independent Global Wallpaper',
    'visualUrl': '/images/original-bg.webp?cache-e2e=global',
    'previewUrl': '/images/original-bg.webp?cache-e2e=global',
}

with sync_playwright() as playwright:
    browser = playwright.chromium.launch(headless=True, channel='msedge')
    page = browser.new_page(viewport={'width': 1440, 'height': 900}, device_scale_factor=1)
    page.add_init_script("localStorage.setItem('shizuki.uiPreferences.v1', JSON.stringify({themeMode:'night',accentHex:'#F2B39D',accentMode:'solid',globalBackgroundId:'wp-9999',routeBackgroundByKey:{}}))")
    public_calls = [0]

    def mock_api(route):
        if '/home-wallpapers/public' in route.request.url:
            public_calls[0] += 1
            if public_calls[0] > 1:
                route.fulfill(status=503, content_type='application/json', body='{"code":503,"message":"temporary unavailable","data":null}')
            else:
                route.fulfill(status=200, content_type='application/json', body=json.dumps({'code': 0, 'data': [PROFILE, GLOBAL_PROFILE]}))
        else:
            route.fulfill(status=200, content_type='application/json', body='{"code":0,"data":[]}')

    page.route('**/api/**', mock_api)
    page.goto(ROOT, wait_until='domcontentloaded', timeout=60000)
    page.wait_for_timeout(1600)
    page.locator('.menu-item-stack').filter(has_text='变换图片').click(force=True)
    page.get_by_role('dialog', name='壁纸设置').wait_for(timeout=10000)
    page.get_by_role('button', name=PROFILE['title']).click()

    page.wait_for_function(
        "JSON.parse(localStorage.getItem('shizuki.wallpaperBoot.cache.v1') || 'null')?.wallpaperId === 4242",
        timeout=10000,
    )
    applied = page.evaluate("({prefs:JSON.parse(localStorage.getItem('shizuki.uiPreferences.v1')),snapshot:JSON.parse(localStorage.getItem('shizuki.wallpaperBoot.cache.v1'))})")
    page.wait_for_function(
        "async () => { const c=await caches.open('shizuki-wallpaper-images-v1'); return !!await c.match(new URL('/images/katanegai.jpg',location.href).href) }",
        timeout=10000,
    )

    page.route('**/images/katanegai.jpg*', lambda route: route.abort())
    page.reload(wait_until='domcontentloaded', timeout=60000)
    page.wait_for_function("document.querySelector('.bg-image')?.src.startsWith('blob:')", timeout=15000)
    restored = page.evaluate("({prefs:JSON.parse(localStorage.getItem('shizuki.uiPreferences.v1')),src:document.querySelector('.bg-image')?.src,complete:document.querySelector('.bg-image')?.complete,naturalWidth:document.querySelector('.bg-image')?.naturalWidth})")

    output = Path(__file__).resolve().parent / 'wallpaper-recovery-after.png'
    page.screenshot(path=str(output), full_page=False)
    assert applied['snapshot']['wallpaperId'] == 4242, applied
    assert applied['prefs']['routeBackgroundByKey'].get('home') == 'wp-4242', applied
    assert applied['prefs']['globalBackgroundId'] == 'wp-9999', applied
    assert restored['prefs']['routeBackgroundByKey'].get('home') == 'wp-4242', restored
    assert restored['prefs']['globalBackgroundId'] == 'wp-9999', restored
    assert restored['src'].startswith('blob:') and restored['complete'] and restored['naturalWidth'] > 0, restored
    page.locator('.menu-item-stack:has(.fa-image)').click(force=True)
    page.locator('.bg-picker').wait_for(timeout=10000)
    page.locator('.danger-link').click()
    page.wait_for_function("!JSON.parse(localStorage.getItem('shizuki.uiPreferences.v1')).routeBackgroundByKey?.home", timeout=10000)
    page.wait_for_timeout(350)
    after_clear = page.evaluate("({prefs:JSON.parse(localStorage.getItem('shizuki.uiPreferences.v1')),snapshot:localStorage.getItem('shizuki.wallpaperBoot.cache.v1')})")
    assert not after_clear['prefs'].get('routeBackgroundByKey', {}).get('home'), after_clear
    assert after_clear['snapshot'] is None, after_clear
    print({'appliedPreference': applied['prefs']['routeBackgroundByKey'],
           'generatedSnapshotProfile': applied['snapshot']['profile'],
           'afterNetworkBlockedReload': restored,
           'afterClearingRouteOverride': after_clear,
           'screenshot': str(output)})
    browser.close()
