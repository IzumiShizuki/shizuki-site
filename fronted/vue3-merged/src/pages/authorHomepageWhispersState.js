import { normalizePublicWhisperList } from './adminWhispersState';

export const AUTHOR_HOME_WHISPER_SEEDS = Object.freeze([
  '风会把很轻的话留下来，所以温柔一点也没关系。',
  '今天如果有一点点进步，这一天就没有白过。',
  '先把喜欢的东西做出来，答案会慢慢长出来。',
  '有些页面不需要很吵，它只要一直亮着就够了。',
  '在背景里发光的念头，往往比正中央的宣言更真。',
  '如果你刚好路过这里，希望你也带着一点热爱离开。',
  '写下来的心情不会消失，它会变成下一次前进的路标。',
  '音乐、文字和光影，都是让人慢下来的一种方式。',
  '别着急把每件事都做对，先把真正想做的事留下来。',
  '欢迎来到这里，愿你也能拥有自己的安静角落。'
]);

function normalizeText(value) {
  return String(value || '').trim();
}

function buildSeedWhisper(content, index) {
  return {
    whisperId: -(index + 1),
    status: 'PUBLISHED',
    content,
    nickname: 'Shizuki Site',
    createdAt: ''
  };
}

export function buildAuthorHomepageWhisperPool(payload, limit = 10) {
  const normalizedLimit = Number.isFinite(Number(limit)) ? Math.max(1, Math.min(20, Math.trunc(Number(limit)))) : 10;
  const publicItems = normalizePublicWhisperList(payload);
  const uniqueContent = new Set();
  const items = [];

  for (const item of publicItems) {
    const content = normalizeText(item.content);
    if (!content || uniqueContent.has(content)) continue;
    uniqueContent.add(content);
    items.push({
      whisperId: item.whisperId,
      status: 'PUBLISHED',
      content,
      nickname: normalizeText(item.nickname),
      createdAt: normalizeText(item.createdAt)
    });
    if (items.length >= normalizedLimit) {
      return items;
    }
  }

  for (let index = 0; index < AUTHOR_HOME_WHISPER_SEEDS.length && items.length < normalizedLimit; index += 1) {
    const content = AUTHOR_HOME_WHISPER_SEEDS[index];
    if (uniqueContent.has(content)) continue;
    uniqueContent.add(content);
    items.push(buildSeedWhisper(content, index));
  }

  return items;
}
