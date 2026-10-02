from pathlib import Path
from playwright.sync_api import sync_playwright

output = Path(__file__).resolve().parent / "wallpaper-recovery-before.png"

with sync_playwright() as playwright:
    browser = playwright.chromium.launch(headless=True, channel="msedge")
    page = browser.new_page(viewport={"width": 1440, "height": 900}, device_scale_factor=1)
    page.add_init_script("""
      localStorage.setItem('shizuki.uiPreferences.v1', JSON.stringify({
        themeMode: 'night', accentHex: '#F2B39D', accentMode: 'solid',
        globalBackgroundId: 'wp-4242', routeBackgroundByKey: { home: 'wp-4242' }
      }));
    """)
    requests = []
    def mock_api(route):
        url = route.request.url
        requests.append(url)
        if "/home-wallpapers/public" in url:
            route.fulfill(status=503, content_type="application/json", body='{"code":503,"message":"temporary unavailable","data":null}')
        else:
            route.fulfill(status=200, content_type="application/json", body='{"code":0,"data":[]}')
    page.route("**/api/**", mock_api)
    page.goto("http://127.0.0.1:4179", wait_until="networkidle", timeout=60000)
    page.wait_for_timeout(500)
    stored = page.evaluate("JSON.parse(localStorage.getItem('shizuki.uiPreferences.v1'))")
    image = page.locator('.bg-image').get_attribute('src')
    page.screenshot(path=str(output), full_page=False)
    print({"requestedLibrary": any('/home-wallpapers/public' in url for url in requests),
           "storedGlobalBackgroundId": stored.get('globalBackgroundId'),
           "storedRouteBackgroundByKey": stored.get('routeBackgroundByKey'),
           "renderedBackgroundSrc": image,
           "screenshot": str(output)})
    browser.close()
