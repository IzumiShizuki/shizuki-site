from pathlib import Path

from playwright.sync_api import sync_playwright


OUTPUT_PATH = Path(__file__).resolve().parents[1] / "tmp-wallpaper-ui-verification.png"


def fulfill_api(route):
    url = route.request.url
    if "/discovery/wallhaven/search" in url:
        data = {
            "items": [
                {
                    "id": "x8gxgz",
                    "thumb_url": "https://example.test/thumb.jpg",
                    "full_url": "https://example.test/full.jpg",
                    "detail_url": "https://wallhaven.cc/w/x8gxgz",
                    "resolution": "3840x2160",
                    "category": "anime",
                    "purity": "sfw",
                    "views": 42100,
                }
            ],
            "page": 1,
            "last_page": 1,
            "total": 1,
        }
    elif "/home-wallpapers/public" in url or "/home-wallpapers/library" in url:
        data = []
    else:
        data = None
    route.fulfill(status=200, content_type="application/json", json={"code": 0, "data": data})


with sync_playwright() as playwright:
    browser = playwright.chromium.launch(headless=True)
    page = browser.new_page(viewport={"width": 1440, "height": 1000}, device_scale_factor=1)
    page.route("**/api/**", fulfill_api)
    page.goto("http://127.0.0.1:4179", wait_until="networkidle")

    menu = page.locator(".top-bar")
    menu.wait_for(state="visible")
    menu_background = menu.evaluate(
        "element => getComputedStyle(element).getPropertyValue('--menu-glass-bg').trim()"
    )
    assert "linear-gradient" in menu_background and "242" in menu_background, menu_background

    page.locator(".menu-item-stack", has_text="变换图片").click()
    dialog = page.get_by_role("dialog", name="壁纸设置")
    dialog.wait_for(state="visible")
    dialog.get_by_role("button", name="发现", exact=True).click()

    safe = dialog.get_by_label("安全分级")
    sketchy = dialog.get_by_label("轻微敏感分级")
    safe.wait_for(state="visible")
    assert safe.is_checked()
    assert not sketchy.is_checked()
    sketchy.check()

    sorting_option = dialog.locator('[aria-label="Wallhaven 排序"] option').first
    option_colors = sorting_option.evaluate(
        "element => ({ color: getComputedStyle(element).color, background: getComputedStyle(element).backgroundColor })"
    )
    assert option_colors["color"] != option_colors["background"], option_colors
    assert option_colors["background"] not in ("rgba(0, 0, 0, 0)", "transparent"), option_colors

    dialog.screenshot(path=str(OUTPUT_PATH))
    print({"menuBackground": menu_background, "optionColors": option_colors, "screenshot": str(OUTPUT_PATH)})
    browser.close()
