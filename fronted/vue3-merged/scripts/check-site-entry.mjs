// Run against a live Nginx-served preview/production URL, not the Vite dev server.
const origin = process.argv[2] || 'https://site.shizuki.online';
const response = await fetch(new URL('/', origin), { headers: { 'Cache-Control': 'no-cache' } });
if (!response.ok) throw new Error(`HTML HTTP ${response.status}`);
if (!/no-cache/.test(response.headers.get('cache-control') || '')) throw new Error('HTML_REVALIDATION_MISSING');
const directIndex = await fetch(new URL('/index.html', origin));
if (!directIndex.ok || !/no-cache/.test(directIndex.headers.get('cache-control') || '')) throw new Error('INDEX_REVALIDATION_MISSING');
const html = await response.text();
const entry = html.match(/<script[^>]+src="([^"]*\/assets\/index-[^"]+\.js)"/)?.[1];
if (!entry) throw new Error('CURRENT_ENTRY_MISSING');
const asset = await fetch(new URL(entry, origin));
if (!asset.ok || !/immutable/.test(asset.headers.get('cache-control') || '')) throw new Error('ASSET_CACHE_POLICY_MISSING');
const health = await fetch(new URL('/actuator/health', origin));
if (!health.ok || /immutable/.test(health.headers.get('cache-control') || '')) throw new Error('API_CACHE_POLICY_REGRESSION');
console.log(JSON.stringify({ html: response.headers.get('cache-control'), asset: asset.headers.get('cache-control'), entry }));
