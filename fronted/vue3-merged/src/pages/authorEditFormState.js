const EMPTY_JOURNEY_ROW = Object.freeze({
  year: '',
  title: '',
  description: '',
  stack: []
});

const EMPTY_LINK_ROW = Object.freeze({
  label: '',
  url: ''
});

export function createEmptyJourneyRow() {
  return {
    year: EMPTY_JOURNEY_ROW.year,
    title: EMPTY_JOURNEY_ROW.title,
    description: EMPTY_JOURNEY_ROW.description,
    stack: []
  };
}

export function createEmptyLinkRow() {
  return {
    label: EMPTY_LINK_ROW.label,
    url: EMPTY_LINK_ROW.url
  };
}

export function createDefaultAuthorEditForm() {
  return {
    enabled: true,
    hero: {
      greeting: '',
      name: '',
      quote: '',
      avatarUrl: ''
    },
    identity: {
      birthYear: '',
      school: '',
      major: '',
      role: '',
      labels: []
    },
    skills: [],
    journey: [createEmptyJourneyRow()],
    about: {
      introText: '',
      mission: '',
      focus: [],
      music: [],
      links: [createEmptyLinkRow()]
    }
  };
}

export function buildEditFormFromProfile(profilePayload) {
  const defaultForm = createDefaultAuthorEditForm();
  const source = toObject(profilePayload);
  const profileJson = toObject(source.profileJson ?? source.profile_json);

  const hero = toObject(profileJson.hero);
  const identity = toObject(profileJson.identity);
  const about = toObject(profileJson.about);

  const journey = normalizeJourneyRows(profileJson.journey);
  const links = normalizeLinks(about.links);

  return {
    enabled: source.enabled !== false,
    hero: {
      greeting: normalizeString(hero.greeting),
      name: normalizeString(hero.name),
      quote: normalizeString(hero.quote),
      avatarUrl: normalizeString(hero.avatarUrl ?? hero.avatar_url)
    },
    identity: {
      birthYear: normalizeString(identity.birthYear ?? identity.birth_year),
      school: normalizeString(identity.school),
      major: normalizeString(identity.major),
      role: normalizeString(identity.role),
      labels: normalizeStringList(identity.labels)
    },
    skills: normalizeStringList(profileJson.skills),
    journey: journey.length ? journey : defaultForm.journey,
    about: {
      introText: normalizeStringList(about.intro).join('\n'),
      mission: normalizeString(about.mission),
      focus: normalizeStringList(about.focus),
      music: normalizeStringList(about.music),
      links: links.length ? links : defaultForm.about.links
    }
  };
}

export function buildProfileJsonFromEditForm(formInput) {
  const form = toObject(formInput);
  const hero = toObject(form.hero);
  const identity = toObject(form.identity);
  const about = toObject(form.about);

  return {
    hero: {
      greeting: normalizeString(hero.greeting),
      name: normalizeString(hero.name),
      quote: normalizeString(hero.quote),
      avatar_url: normalizeString(hero.avatarUrl ?? hero.avatar_url)
    },
    identity: {
      birth_year: normalizeString(identity.birthYear ?? identity.birth_year),
      school: normalizeString(identity.school),
      major: normalizeString(identity.major),
      role: normalizeString(identity.role),
      labels: normalizeStringList(identity.labels)
    },
    skills: normalizeStringList(form.skills),
    journey: normalizeJourneyRows(form.journey),
    about: {
      intro: splitMultilineText(about.introText),
      mission: normalizeString(about.mission),
      focus: normalizeStringList(about.focus),
      music: normalizeStringList(about.music),
      links: normalizeLinks(about.links)
    }
  };
}

export function extractTagTokens(rawInput) {
  const source = normalizeString(rawInput);
  if (!source) return [];
  return source
    .split(/[\n,，;；]+/g)
    .map((item) => normalizeString(item))
    .filter(Boolean);
}

export function appendUniqueTags(currentList, rawInput) {
  const existing = normalizeStringList(currentList);
  const additions = extractTagTokens(rawInput);
  if (!additions.length) return existing;
  const result = [...existing];
  for (const token of additions) {
    if (!result.includes(token)) {
      result.push(token);
    }
  }
  return result;
}

function splitMultilineText(raw) {
  const normalized = normalizeString(raw);
  if (!normalized) return [];
  return normalized
    .split(/\r?\n/g)
    .map((line) => normalizeString(line))
    .filter(Boolean);
}

function normalizeJourneyRows(raw) {
  if (!Array.isArray(raw)) return [];
  return raw
    .map((item) => {
      const row = toObject(item);
      const year = normalizeString(row.year);
      const title = normalizeString(row.title);
      const description = normalizeString(row.description);
      const stack = normalizeStringList(row.stack);
      if (!year && !title && !description && !stack.length) return null;
      return { year, title, description, stack };
    })
    .filter(Boolean);
}

function normalizeLinks(raw) {
  if (!Array.isArray(raw)) return [];
  return raw
    .map((item) => {
      const row = toObject(item);
      const label = normalizeString(row.label);
      const url = normalizeString(row.url);
      if (!label && !url) return null;
      return { label, url };
    })
    .filter(Boolean);
}

function normalizeStringList(raw) {
  if (!Array.isArray(raw) || !raw.length) return [];
  return raw
    .map((item) => normalizeString(item))
    .filter(Boolean)
    .filter((value, index, array) => array.indexOf(value) === index);
}

function normalizeString(value) {
  if (value == null) return '';
  return String(value).trim();
}

function toObject(value) {
  return Object.prototype.toString.call(value) === '[object Object]' ? value : {};
}
