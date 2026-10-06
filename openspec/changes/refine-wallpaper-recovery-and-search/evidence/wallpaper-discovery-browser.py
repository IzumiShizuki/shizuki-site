import json
from pathlib import Path
from playwright.sync_api import sync_playwright

ROOT = 'http://127.0.0.1:4179'
BASE = Path(__file__).resolve().parent
items = [
    {'item_id': str(3800000000 + index), 'title': ('碧蓝航线·雨夜港湾与远方灯火的动态壁纸预览' if index == 0 else f'Workshop Wallpaper {index + 1}'),
     'preview_url': f"/images/{['katanegai.jpg', 'original-bg.webp', 'boot-bg-dark.webp', 'boot-bg-light.webp'][index % 4]}?tile={index}",
     'detail_url': f'https://steamcommunity.com/sharedfiles/filedetails/?id={3800000000 + index}',
     'tags': ['Scene', 'Anime'], 'resolution': '1920 x 1080'}
    for index in range(30)
]

with sync_playwright() as playwright:
    browser = playwright.chromium.launch(headless=True, channel='msedge')
    for name, viewport, screenshot_name in [
        ('desktop', {'width': 1980, 'height': 1120}, 'wallpaper-discovery-desktop.png'),
        ('mobile', {'width': 820, 'height': 1180}, 'wallpaper-discovery-mobile.png'),
    ]:
        initial_viewport = viewport if name == 'desktop' else {'width': 1200, 'height': 900}
        page = browser.new_page(viewport=initial_viewport, device_scale_factor=1)
        counts = {'search': 0, 'proxyPreview': 0, 'detail': 0}
        def route_request(route):
            url = route.request.url
            if '/home-wallpapers/public' in url:
                route.fulfill(status=200, content_type='application/json', body=json.dumps({'code': 0, 'data': [
                    {'wallpaperId': 4242, 'title': '验收用背景', 'visualUrl': '/images/katanegai.jpg', 'previewUrl': '/images/katanegai.jpg', 'sceneType': 'STATIC', 'visibility': 'PUBLIC', 'auditStatus': 'APPROVED'}
                ]}))
            elif '/discovery/workshop/search' in url:
                counts['search'] += 1
                route.fulfill(status=200, content_type='application/json', body=json.dumps({'code': 0, 'data': {'items': items, 'page': 1, 'has_more': True}}))
            elif '/discovery/workshop/items/' in url:
                counts['detail'] += 1
                detail = {'code': 0, 'data': {'item_id': '3800000000', 'title': items[0]['title'], 'download_channel': 'STEAMCMD', 'download_available': True, 'channel_message': 'SteamCMD configured; account validation and item access determine download success'}}
                route.fulfill(status=200, content_type='application/json', body=json.dumps(detail))
            elif '/discovery/preview/' in url:
                counts['proxyPreview'] += 1
                route.fulfill(status=200, content_type='image/png', body=b'')
            else:
                route.fulfill(status=200, content_type='application/json', body='{"code":0,"data":[]}')
        page.route('**/api/**', route_request)
        page.goto(ROOT, wait_until='domcontentloaded', timeout=60000)
        page.wait_for_timeout(900)
        page.locator('.menu-item-stack:has(.fa-image)').click(force=True)
        dialog = page.locator('.bg-picker')
        dialog.wait_for(timeout=10000)
        dialog.locator('.workspace-tab').nth(2).click()
        page.wait_for_function("document.querySelectorAll('.discovery-item').length === 30", timeout=15000)
        page.wait_for_timeout(500)
        filter_state = 'always-visible'
        if name == 'desktop':
            item_button = page.locator('.discovery-item').first
            item_button.click()
            page.wait_for_function("Boolean(document.querySelector('.discovery-inspector h2')?.textContent.trim())", timeout=10000)
            page.screenshot(path=str(BASE / screenshot_name), full_page=False)
            page.locator('.workspace-close').click()
            page.locator('.menu-item-stack:has(.fa-image)').click(force=True)
            page.locator('.bg-picker').wait_for(timeout=10000)
            page.locator('.workspace-tab').nth(2).click()
            page.wait_for_function("document.querySelectorAll('.discovery-item').length === 30", timeout=15000)
            assert counts['search'] == 1, counts
        else:
            page.set_viewport_size(viewport)
            page.wait_for_timeout(300)
            toggle = page.locator('.filter-disclosure-toggle')
            assert toggle.get_attribute('aria-expanded') == 'false', toggle.get_attribute('aria-expanded')
            toggle_rect = toggle.bounding_box()
            grid_rect = page.locator('.discovery-grid').bounding_box()
            assert toggle_rect and grid_rect and toggle_rect['y'] + toggle_rect['height'] <= grid_rect['y'], (toggle_rect, grid_rect)
            toggle.click()
            assert toggle.get_attribute('aria-expanded') == 'true'
            first_item = page.locator('.discovery-item').first
            first_item.click()
            page.wait_for_function("document.querySelector('.discovery-inspector h2')?.textContent.includes('碧蓝航线')", timeout=10000)
            grid = page.locator('.discovery-grid')
            grid.evaluate('(element) => { element.scrollTop = 48 }')
            page.wait_for_timeout(250)
            filter_state = toggle.get_attribute('aria-expanded')
        if name != 'desktop': page.screenshot(path=str(BASE / screenshot_name), full_page=False)
        assert counts['proxyPreview'] == 0, counts
        if name == 'desktop': assert counts['detail'] == 1, counts
        if name == 'mobile': assert page.locator('.discovery-inspector h2').count() == 1
        grid = page.locator('.discovery-grid')
        print({'viewport': name, 'counts': counts, 'gridCards': page.locator('.discovery-item').count(),
               'gridColumns': grid.evaluate("e => getComputedStyle(e).gridTemplateColumns") if grid.count() else 'empty/error state',
               'filterDoesNotOverlapGallery': name != 'mobile' or toggle_rect['y'] + toggle_rect['height'] <= grid_rect['y'],
               'selectedInspectorTitle': page.locator('.discovery-inspector h2').inner_text() if page.locator('.discovery-inspector h2').count() else '',
               'visibleError': page.locator('.discovery-state').inner_text() if page.locator('.discovery-state').count() else '',
               'filterExpanded': filter_state,
               'screenshot': str(BASE / screenshot_name)})
        page.close()
    browser.close()
