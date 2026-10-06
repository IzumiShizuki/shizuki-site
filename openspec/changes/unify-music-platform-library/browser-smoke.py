"""Run against the local Vite app with deterministic API fixtures; no real account writes."""
import json
import sys
from pathlib import Path
from urllib.parse import urlparse
from playwright.sync_api import sync_playwright, expect

base = sys.argv[1] if len(sys.argv) > 1 else 'http://127.0.0.1:5187'
output = Path(sys.argv[2]) if len(sys.argv) > 2 else Path(__file__).parent / 'browser-artifacts'
output.mkdir(parents=True, exist_ok=True)
liked_ids = ['42']
writes = []
cloud = {'playlist_code': 'account_netease_10', 'name': '网易云喜欢的音乐', 'track_count': 1, 'source_provider': 'netease', 'playlist_type': 'LIKED'}
track = {'track_id': '42', 'provider': 'netease', 'title': '云端测试歌曲', 'artist': '测试歌手', 'metadata': {'durationSec': 180}}
podcast = {'playlist_code': 'podcast_netease_90', 'name': '网易云真实声音', 'description': '可播放的声音节目', 'track_count': 2, 'source_provider': 'netease'}
library = {'liked_playlist': cloud, 'created_playlists': [{'playlist_code': 'account_netease_20', 'name': '云端歌单', 'source_provider': 'netease'}], 'collected_playlists': [], 'default_playlist': None}

def api_route(route):
    path = urlparse(route.request.url).path
    data = {}
    if path == '/api/v1/auth/tokens':
        data = {'result_type': 'TOKEN_ISSUED', 'access_token': 'fixture-access', 'refresh_token': 'fixture-refresh', 'user_id': 7, 'groups': ['USER']}
    elif path == '/api/v1/me':
        data = {'user_id': 7, 'nickname': '音乐测试', 'groups': ['USER']}
    elif path == '/api/v1/me/preferences':
        data = {'music': {'sourceMode': 'account_first'}}
    elif path.endswith('/library/sidebar') or path.endswith('/source-accounts/netease/library'):
        data = library
    elif path.endswith('/source-accounts/netease/likes'):
        data = liked_ids
    elif '/source-accounts/netease/likes/' in path and route.request.method == 'PUT':
        body = route.request.post_data_json
        writes.append(body)
        liked_ids[:] = ['42'] if body['liked'] else []
        data = {'provider': 'netease', 'track_id': '42', 'liked': body['liked']}
    elif path.endswith('/music/source-accounts/status'):
        data = [{'provider': 'netease', 'bound': True, 'status': 'BOUND'}]
    elif path.endswith('/music/providers'):
        data = [{'provider': 'netease', 'enabled': True, 'visible': True}]
    elif path.endswith('/music/library/home'):
        data = {'featured_playlists': [], 'featured_tracks': [track]}
    elif path.endswith('/music/discovery/podcasts'):
        data = [podcast]
    elif path.endswith('/music/discovery/personal-fm'):
        data = [track]
    elif path.endswith('/music/meting/status'):
        data = {'available': True, 'providers': ['netease', 'qq', 'kuwo']}
    elif path.endswith('/bundle') and 'podcast_netease_90' in path:
        data = {'profile': podcast, 'tracks': [{**track, 'track_id': '52', 'title': '声音节目一'}, {**track, 'track_id': '53', 'title': '声音节目二'}]}
    elif path.endswith('/bundle'):
        data = {'profile': cloud, 'tracks': [track]}
    route.fulfill(status=200, content_type='application/json', body=json.dumps({'code': 'OK', 'data': data}, ensure_ascii=False))

with sync_playwright() as p:
    browser = p.chromium.launch(channel='msedge', headless=True)
    page = browser.new_page(viewport={'width': 1440, 'height': 960})
    failures = []
    page.on('pageerror', lambda error: failures.append(str(error)))
    page.route('**/api/**', api_route)
    page.add_init_script("""
      localStorage.setItem('shizuki.auth.v1', JSON.stringify({refreshToken:'fixture-refresh'}));
      localStorage.setItem('shizuki.user.v1', JSON.stringify({userId:7,nickname:'音乐测试',groups:['USER']}));
      localStorage.setItem('shizuki.music.foliaMode','0');
    """)
    page.goto(base + '/#/music-library/music')
    page.wait_for_load_state('networkidle')
    expect(page.locator('.music-left-sidebar')).not_to_contain_text('默认歌单')
    page.locator('.music-left-sidebar .nav-item').filter(has_text='声音 / 电台').click()
    expect(page.get_by_role('heading', name='网易云声音', exact=True)).to_be_visible()
    expect(page.locator('.podcast-card').filter(has_text='网易云真实声音')).to_be_visible()
    page.screenshot(path=str(output / 'radio-desktop.png'), full_page=True)
    page.get_by_role('button', name='听私人 FM', exact=True).click()
    expect(page.locator('.fm-track')).to_contain_text('云端测试歌曲')
    page.locator('.fm-track').get_by_role('button', name='取消喜欢', exact=True).click()
    expect(page.locator('.fm-track').get_by_role('button', name='喜欢这首歌', exact=True)).to_have_attribute('aria-pressed', 'false')
    assert writes == [{'liked': False}], writes
    page.locator('.podcast-card').click()
    expect(page.get_by_role('heading', name='网易云真实声音', exact=True)).to_be_visible()
    expect(page.locator('.music-playlist-view')).to_contain_text('声音节目一')
    page.screenshot(path=str(output / 'podcast-programs.png'), full_page=True)
    assert not failures, failures
    browser.close()
print('PASS: real sound cards, program navigation, cloud library and one acknowledged unlike in browser fixtures')
