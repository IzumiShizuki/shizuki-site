"use strict";
var __getOwnPropNames = Object.getOwnPropertyNames;
var __commonJS = (cb, mod) => function __require() {
  return mod || (0, cb[__getOwnPropNames(cb)[0]])((mod = { exports: {} }).exports, mod), mod.exports;
};

// core.js
var require_core = __commonJS({
  "core.js"(exports2, module2) {
    "use strict";
    var SUPPORTED_IMAGE_EXTENSIONS = /* @__PURE__ */ new Set(["png", "jpg", "jpeg", "webp", "gif"]);
    function stripYamlFrontmatter(markdown) {
      const source = String(markdown || "");
      return source.replace(/^\uFEFF?---[ \t]*\r?\n[\s\S]*?\r?\n---[ \t]*\r?\n?/, "");
    }
    function normalizeString(value) {
      return value == null ? "" : String(value).trim();
    }
    function normalizeStringArray(value) {
      const values = Array.isArray(value) ? value : typeof value === "string" ? value.split(",") : value == null ? [] : [value];
      return [...new Set(values.map(normalizeString).filter(Boolean))];
    }
    function firstNonEmpty(...values) {
      for (const value of values) {
        const normalized = normalizeString(value);
        if (normalized) return normalized;
      }
      return "";
    }
    function normalizeVisibility(value, fallback = "PUBLIC") {
      const normalized = firstNonEmpty(value, fallback).toUpperCase();
      return ["PUBLIC", "PRIVATE", "UNLISTED"].includes(normalized) ? normalized : String(fallback).toUpperCase();
    }
    function buildPostPayload({ fileBasename, frontmatter = {}, markdown, defaults = {} }) {
      const title = firstNonEmpty(frontmatter.title, fileBasename, "Untitled");
      const categoryCode = firstNonEmpty(
        frontmatter.shizuki_category,
        frontmatter.categoryCode,
        frontmatter.category,
        defaults.categoryCode,
        "life"
      );
      const slugCode = firstNonEmpty(frontmatter.shizuki_slug, frontmatter.slugCode, frontmatter.slug);
      const coverImageUrl = firstNonEmpty(
        frontmatter.shizuki_cover,
        frontmatter.coverImageUrl,
        frontmatter.cover
      );
      const postId = Number(frontmatter.shizuki_post_id ?? frontmatter.shizukiPostId);
      return {
        postId: Number.isInteger(postId) && postId > 0 ? postId : null,
        payload: {
          title,
          summary: firstNonEmpty(frontmatter.summary, frontmatter.description),
          categoryCode,
          slugCode: slugCode || void 0,
          coverImageUrl: coverImageUrl || void 0,
          visibility: normalizeVisibility(frontmatter.visibility, defaults.visibility || "PUBLIC"),
          allowedGroupCodes: normalizeStringArray(
            frontmatter.allowedGroupCodes ?? frontmatter.allowed_groups ?? frontmatter.groups
          ),
          tags: normalizeStringArray(frontmatter.tags),
          markdown: stripYamlFrontmatter(markdown)
        }
      };
    }
    function choosePublisherLeafStrategy(existingLeafCount) {
      return Number(existingLeafCount) > 0 ? "reuse" : "create";
    }
    function buildPublisherSidebarState({
      file = null,
      frontmatter = {},
      mapped = null,
      visualCount = 0,
      session = {},
      busy = false,
      error = ""
    } = {}) {
      const path = normalizeString(file?.path);
      const isMarkdown = Boolean(file) && normalizeString(file?.extension).toLowerCase() === "md";
      const isProtected = path.replace(/\\/g, "/").toLowerCase().startsWith("00_notion_raw/");
      const eligible = isMarkdown && !isProtected;
      const hasSession = Boolean(session.account || session.hasAccessToken || session.hasRefreshToken);
      const account = session.account && typeof session.account === "object" ? session.account : null;
      const accountLabel = account ? firstNonEmpty(account.nickname, account.email, account.userId, "\u5DF2\u8FDE\u63A5") : hasSession ? "\u5DF2\u6709\u5B89\u5168\u4F1A\u8BDD" : "\u5C1A\u672A\u767B\u5F55";
      const syncStatus = firstNonEmpty(frontmatter.shizuki_sync_status).toUpperCase();
      const postId = Number(mapped?.postId ?? frontmatter.shizuki_post_id);
      let stage = "local";
      let statusLabel = "\u4EC5\u5728\u672C\u5730";
      if (normalizeString(error)) {
        stage = "error";
        statusLabel = "\u9700\u8981\u5904\u7406";
      } else if (syncStatus === "PUBLISHED") {
        stage = "published";
        statusLabel = "\u5DF2\u53D1\u5E03";
      } else if (syncStatus || Number.isInteger(postId) && postId > 0) {
        stage = "draft";
        statusLabel = syncStatus === "DRAFT" ? "\u8349\u7A3F\u5DF2\u540C\u6B65" : syncStatus || "\u5DF2\u540C\u6B65";
      }
      let unavailableReason = "";
      if (!file) unavailableReason = "\u6253\u5F00\u4E00\u7BC7 Markdown \u7B14\u8BB0\u540E\u5373\u53EF\u53D1\u5E03\u3002";
      else if (!isMarkdown) unavailableReason = "\u5F53\u524D\u6587\u4EF6\u4E0D\u662F Markdown \u7B14\u8BB0\u3002";
      else if (isProtected) unavailableReason = "00_Notion_Raw \u662F\u53EA\u8BFB\u8FC1\u79FB\u6E90\uFF0C\u8BF7\u5148\u628A\u7B14\u8BB0\u6574\u7406\u5230\u5176\u4ED6\u76EE\u5F55\u3002";
      return {
        eligible,
        unavailableReason,
        title: firstNonEmpty(mapped?.payload?.title, file?.basename, "\u672A\u9009\u62E9\u7B14\u8BB0"),
        path,
        categoryCode: firstNonEmpty(mapped?.payload?.categoryCode, "\u2014"),
        visibility: firstNonEmpty(mapped?.payload?.visibility, "\u2014").toUpperCase(),
        visualCount: Math.max(0, Number(visualCount) || 0),
        postId: Number.isInteger(postId) && postId > 0 ? postId : null,
        syncStatus,
        syncedAt: firstNonEmpty(frontmatter.shizuki_synced_at),
        stage,
        statusLabel,
        hasSession,
        accountLabel,
        busy: Boolean(busy),
        error: normalizeString(error),
        canPreview: eligible && !busy,
        canPublish: eligible && hasSession && !busy
      };
    }
    function stripTargetDecorations(target) {
      const normalized = normalizeString(target).replace(/^<|>$/g, "");
      return normalized.split("#")[0].split("?")[0];
    }
    function extensionForTarget(target) {
      const cleaned = stripTargetDecorations(target).toLowerCase();
      if (cleaned.endsWith(".drawio.svg")) return "drawio.svg";
      const match = cleaned.match(/\.([a-z0-9]+)$/i);
      return match ? match[1].toLowerCase() : "";
    }
    function isRemoteTarget(target) {
      return /^(?:[a-z][a-z0-9+.-]*:|\/\/)/i.test(normalizeString(target));
    }
    function isSupportedVisualTarget(target) {
      if (!target || isRemoteTarget(target)) return false;
      const extension = extensionForTarget(target);
      return extension === "drawio.svg" || SUPPORTED_IMAGE_EXTENSIONS.has(extension);
    }
    function discoverVisualEmbeds(markdown) {
      const source = String(markdown || "");
      const embeds = [];
      const wikiPattern = /!\[\[([^\]|]+?)(?:\|([^\]]*))?\]\]/g;
      const markdownPattern = /!\[([^\]]*)\]\((<[^>]+>|[^\s)]+)(?:\s+(?:"[^"]*"|'[^']*'|\([^)]*\)))?\)/g;
      for (const match of source.matchAll(wikiPattern)) {
        const target = normalizeString(match[1]);
        if (!isSupportedVisualTarget(target)) continue;
        embeds.push({
          syntax: "wiki",
          raw: match[0],
          target,
          alt: normalizeString(match[2]) || target.split(/[\\/]/).pop() || "image",
          start: match.index,
          end: match.index + match[0].length
        });
      }
      for (const match of source.matchAll(markdownPattern)) {
        const target = normalizeString(match[2]).replace(/^<|>$/g, "");
        if (!isSupportedVisualTarget(target)) continue;
        embeds.push({
          syntax: "markdown",
          raw: match[0],
          target,
          alt: normalizeString(match[1]) || target.split(/[\\/]/).pop() || "image",
          start: match.index,
          end: match.index + match[0].length
        });
      }
      return embeds.sort((left, right) => left.start - right.start);
    }
    function escapeMarkdownAlt(value) {
      return normalizeString(value).replace(/([\[\]\\])/g, "\\$1");
    }
    function applyEmbedReplacements(markdown, replacements) {
      let result = String(markdown || "");
      const sorted = [...replacements].sort((left, right) => right.start - left.start);
      for (const replacement of sorted) {
        if (!Number.isInteger(replacement.start) || !Number.isInteger(replacement.end)) {
          throw new TypeError("Embed replacement requires integer start and end offsets.");
        }
        const rendered = `![${escapeMarkdownAlt(replacement.alt)}](${normalizeString(replacement.url)})`;
        result = result.slice(0, replacement.start) + rendered + result.slice(replacement.end);
      }
      return result;
    }
    async function rewriteVisualEmbeds(markdown, resolvePublicUrl, onProgress) {
      if (typeof resolvePublicUrl !== "function") {
        throw new TypeError("resolvePublicUrl must be a function.");
      }
      const embeds = discoverVisualEmbeds(markdown);
      const replacements = [];
      for (let index = 0; index < embeds.length; index += 1) {
        const embed = embeds[index];
        const url = await resolvePublicUrl(embed, index);
        if (!normalizeString(url)) throw new Error(`No public URL returned for ${embed.target}`);
        replacements.push({ ...embed, url });
        onProgress?.(index + 1, embeds.length);
      }
      return applyEmbedReplacements(markdown, replacements);
    }
    function normalizeApiData(payload) {
      if (payload == null) return payload;
      if (typeof payload !== "object") return payload;
      if (Object.prototype.hasOwnProperty.call(payload, "data") && (Object.prototype.hasOwnProperty.call(payload, "code") || Object.prototype.hasOwnProperty.call(payload, "success") || Object.prototype.hasOwnProperty.call(payload, "message"))) {
        return payload.data;
      }
      return payload;
    }
    function normalizeTokenPayload(payload) {
      const value = normalizeApiData(payload) || {};
      return {
        resultType: firstNonEmpty(value.resultType, value.result_type),
        accessToken: firstNonEmpty(value.accessToken, value.access_token),
        refreshToken: firstNonEmpty(value.refreshToken, value.refresh_token),
        userId: Number(value.userId ?? value.user_id) || 0,
        expiresIn: Number(value.expiresIn ?? value.expires_in) || 0
      };
    }
    function normalizeEditorOrigin(editorUrl) {
      const raw = firstNonEmpty(editorUrl, "https://embed.diagrams.net/");
      return raw.replace(/\/+$/, "");
    }
    function buildDrawioEditorUrl(editorUrl, theme = "dark") {
      const baseUrl = normalizeEditorOrigin(editorUrl);
      const params = new URLSearchParams({ embed: "1", proto: "json", libraries: "1", spin: "1" });
      if (theme === "dark") params.set("ui", "dark");
      if (theme === "light") params.set("ui", "white");
      return `${baseUrl}/?${params.toString()}`;
    }
    function patchDrawioBundle(source) {
      let result = String(source || "");
      let changes = 0;
      if (!result.includes('editorUrl: "https://embed.diagrams.net/"')) {
        const next = result.replace(
          '  port: "4444",\n',
          '  port: "4444",\n  editorUrl: "https://embed.diagrams.net/",\n'
        );
        if (next !== result) {
          result = next;
          changes += 1;
        }
      }
      if (!result.includes("SHIZUKI_SHARED_DRAWIO_URL")) {
        const next = result.replace(
          "    const baseUrl = `http://localhost:${this.plugin.settings.port}`;",
          '    const configuredEditorUrl = String(this.plugin.settings.editorUrl || "").trim();\n    const baseUrl = (configuredEditorUrl || `http://localhost:${this.plugin.settings.port}`).replace(/\\/+$/, ""); // SHIZUKI_SHARED_DRAWIO_URL'
        );
        if (next !== result) {
          result = next;
          changes += 1;
        }
      }
      if (!result.includes("SHIZUKI_REMOTE_DRAWIO_NO_LOCAL_SERVER")) {
        const next = result.replace(
          "  startServer() {\n    if (this.plugin.server) return;",
          '  startServer() {\n    const configuredEditorUrl = String(this.plugin.settings.editorUrl || "").trim();\n    if (configuredEditorUrl && !/^http:\\/\\/localhost(?::|\\/|$)/i.test(configuredEditorUrl)) return; // SHIZUKI_REMOTE_DRAWIO_NO_LOCAL_SERVER\n    if (this.plugin.server) return;'
        );
        if (next !== result) {
          result = next;
          changes += 1;
        }
      }
      const patched = result.includes("SHIZUKI_SHARED_DRAWIO_URL") && result.includes("SHIZUKI_REMOTE_DRAWIO_NO_LOCAL_SERVER") && result.includes('editorUrl: "https://embed.diagrams.net/"');
      if (!patched) {
        throw new Error("Draw.io bundle did not match the expected 3.1.x patch seams.");
      }
      return { source: result, changes };
    }
    module2.exports = {
      SUPPORTED_IMAGE_EXTENSIONS,
      stripYamlFrontmatter,
      normalizeStringArray,
      buildPostPayload,
      choosePublisherLeafStrategy,
      buildPublisherSidebarState,
      extensionForTarget,
      isSupportedVisualTarget,
      discoverVisualEmbeds,
      applyEmbedReplacements,
      rewriteVisualEmbeds,
      normalizeApiData,
      normalizeTokenPayload,
      normalizeEditorOrigin,
      buildDrawioEditorUrl,
      patchDrawioBundle
    };
  }
});

// main.js
var {
  Plugin,
  Modal,
  Setting,
  Notice,
  PluginSettingTab,
  FuzzySuggestModal,
  ItemView,
  TFile,
  requestUrl,
  normalizePath
} = require("obsidian");
var core = require_core();
var REFRESH_TOKEN_SECRET_ID = "shizuki-site-publisher-refresh-token";
var BACKGROUND_FOLDER = "90-Assets/images/Backgrounds";
var MAX_IMAGE_BYTES = 8 * 1024 * 1024;
var PUBLISHER_VIEW_TYPE = "shizuki-publisher-sidebar";
var DEFAULT_SETTINGS = {
  siteUrl: "https://shizuki.site",
  editorUrl: "https://embed.diagrams.net/",
  defaultCategoryCode: "life",
  defaultVisibility: "PUBLIC",
  backgroundPath: ""
};
var ApiError = class extends Error {
  constructor(message, status, payload) {
    super(message);
    this.name = "ApiError";
    this.status = Number(status) || 0;
    this.payload = payload;
  }
};
function normalizeSiteUrl(value) {
  const normalized = String(value || DEFAULT_SETTINGS.siteUrl).trim().replace(/\/+$/, "");
  if (!/^https?:\/\//i.test(normalized)) {
    throw new Error("\u7F51\u7AD9\u5730\u5740\u5FC5\u987B\u4EE5 http:// \u6216 https:// \u5F00\u5934");
  }
  return normalized;
}
function responsePayload(response) {
  try {
    return response.json;
  } catch {
    return response.text || null;
  }
}
function problemMessage(payload, fallback) {
  if (payload && typeof payload === "object") {
    return String(payload.message || payload.detail || payload.error || fallback);
  }
  return String(payload || fallback);
}
function toArrayBuffer(value) {
  if (value instanceof ArrayBuffer) return value;
  if (ArrayBuffer.isView(value)) {
    return value.buffer.slice(value.byteOffset, value.byteOffset + value.byteLength);
  }
  throw new TypeError("Expected binary ArrayBuffer data.");
}
function concatBytes(parts) {
  const arrays = parts.map((part) => part instanceof Uint8Array ? part : new Uint8Array(part));
  const length = arrays.reduce((total, part) => total + part.byteLength, 0);
  const output = new Uint8Array(length);
  let offset = 0;
  for (const part of arrays) {
    output.set(part, offset);
    offset += part.byteLength;
  }
  return output;
}
function buildMultipartBody(fields, file) {
  const boundary = `----shizuki-obsidian-${Date.now()}-${Math.random().toString(16).slice(2)}`;
  const encoder = new TextEncoder();
  const parts = [];
  for (const [name, value] of Object.entries(fields)) {
    parts.push(encoder.encode(
      `--${boundary}\r
Content-Disposition: form-data; name="${name}"\r
\r
${String(value)}\r
`
    ));
  }
  const safeName = String(file.fileName || "blog-inline.png").replace(/["\r\n]/g, "-");
  parts.push(encoder.encode(
    `--${boundary}\r
Content-Disposition: form-data; name="file"; filename="${safeName}"\r
Content-Type: ${file.contentType}\r
\r
`
  ));
  parts.push(new Uint8Array(toArrayBuffer(file.bytes)));
  parts.push(encoder.encode(`\r
--${boundary}--\r
`));
  return {
    contentType: `multipart/form-data; boundary=${boundary}`,
    body: toArrayBuffer(concatBytes(parts))
  };
}
var ShizukiApiClient = class {
  constructor(plugin) {
    this.plugin = plugin;
    this.accessToken = "";
    this.refreshToken = "";
    this.account = null;
    this.refreshPromise = null;
  }
  loadStoredRefreshToken() {
    const storage = this.plugin.app.secretStorage;
    if (!storage) return;
    try {
      this.refreshToken = String(storage.getSecret(REFRESH_TOKEN_SECRET_ID) || "");
    } catch {
      this.refreshToken = "";
    }
  }
  isSecureStorageAvailable() {
    const storage = this.plugin.app.secretStorage;
    if (!storage) return false;
    try {
      return Boolean(storage.isEncryptionAvailable());
    } catch {
      return false;
    }
  }
  storeRefreshToken(refreshToken) {
    this.refreshToken = String(refreshToken || "");
    if (!this.refreshToken || !this.isSecureStorageAvailable()) return false;
    this.plugin.app.secretStorage.setSecret(REFRESH_TOKEN_SECRET_ID, this.refreshToken);
    return true;
  }
  clearSession() {
    this.accessToken = "";
    this.refreshToken = "";
    this.account = null;
    const storage = this.plugin.app.secretStorage;
    if (storage) {
      try {
        storage.deleteSecret(REFRESH_TOKEN_SECRET_ID);
      } catch {
      }
    }
  }
  async rawRequest(path, options = {}) {
    const url = /^https?:\/\//i.test(path) ? path : `${normalizeSiteUrl(this.plugin.settings.siteUrl)}${path.startsWith("/") ? path : `/${path}`}`;
    const headers = { ...options.headers || {} };
    let body = options.body;
    if (options.auth) {
      const token = await this.requireAccessToken();
      headers.Authorization = `Bearer ${token}`;
    }
    if (body != null && !(body instanceof ArrayBuffer) && !ArrayBuffer.isView(body) && typeof body !== "string") {
      body = JSON.stringify(body);
      headers["Content-Type"] = headers["Content-Type"] || "application/json";
    }
    const response = await requestUrl({
      url,
      method: options.method || "GET",
      headers,
      body: body == null ? void 0 : toArrayBufferIfNeeded(body),
      throw: false
    });
    const payload = responsePayload(response);
    if (response.status === 401 && options.auth && options.retry !== false && this.refreshToken) {
      await this.refreshAccessToken();
      return this.rawRequest(path, { ...options, retry: false });
    }
    if (response.status < 200 || response.status >= 300) {
      throw new ApiError(problemMessage(payload, `\u8BF7\u6C42\u5931\u8D25\uFF08HTTP ${response.status}\uFF09`), response.status, payload);
    }
    return core.normalizeApiData(payload);
  }
  async requireAccessToken() {
    if (this.accessToken) return this.accessToken;
    if (!this.refreshToken) throw new Error("\u8BF7\u5148\u767B\u5F55 shizuki.site");
    await this.refreshAccessToken();
    return this.accessToken;
  }
  async applyTokenResponse(payload, { persistRefresh = true } = {}) {
    const token = core.normalizeTokenPayload(payload);
    if (token.resultType !== "TOKEN_ISSUED" || !token.accessToken) {
      throw new Error("\u7F51\u7AD9\u6CA1\u6709\u8FD4\u56DE\u6709\u6548\u767B\u5F55\u4F1A\u8BDD");
    }
    this.accessToken = token.accessToken;
    if (token.refreshToken) {
      if (persistRefresh) this.storeRefreshToken(token.refreshToken);
      else this.refreshToken = token.refreshToken;
    }
    return token;
  }
  async signIn(email, password) {
    const payload = await this.rawRequest("/api/v1/auth/tokens", {
      method: "POST",
      body: {
        grantType: "EMAIL_PASSWORD",
        email: String(email || "").trim(),
        password: String(password || "")
      }
    });
    await this.applyTokenResponse(payload);
    try {
      this.account = await this.rawRequest("/api/v1/me", { auth: true });
      return this.account;
    } catch (error) {
      this.clearSession();
      throw error;
    }
  }
  async refreshAccessToken() {
    if (!this.refreshToken) throw new Error("\u767B\u5F55\u4F1A\u8BDD\u5DF2\u5931\u6548\uFF0C\u8BF7\u91CD\u65B0\u767B\u5F55");
    if (this.refreshPromise) return this.refreshPromise;
    this.refreshPromise = (async () => {
      const payload = await this.rawRequest("/api/v1/auth/tokens", {
        method: "POST",
        body: { grantType: "REFRESH_TOKEN", refreshToken: this.refreshToken }
      });
      await this.applyTokenResponse(payload);
      return this.accessToken;
    })();
    try {
      return await this.refreshPromise;
    } finally {
      this.refreshPromise = null;
    }
  }
  async getCurrentAccount() {
    this.account = await this.rawRequest("/api/v1/me", { auth: true });
    return this.account;
  }
  async signOut() {
    const refreshToken = this.refreshToken;
    if (this.accessToken && refreshToken) {
      try {
        await this.rawRequest("/api/v1/auth/logout", {
          method: "POST",
          auth: true,
          retry: false,
          body: { refreshToken }
        });
      } catch {
      }
    }
    this.clearSession();
  }
};
function toArrayBufferIfNeeded(body) {
  if (body instanceof ArrayBuffer || ArrayBuffer.isView(body)) return toArrayBuffer(body);
  return body;
}
var SignInModal = class extends Modal {
  constructor(app, plugin) {
    super(app);
    this.plugin = plugin;
    this.email = "";
    this.password = "";
    this.busy = false;
  }
  onOpen() {
    this.setTitle("\u767B\u5F55 shizuki.site");
    this.contentEl.createEl("p", { text: "\u5BC6\u7801\u4EC5\u7528\u4E8E\u672C\u6B21\u767B\u5F55\u8BF7\u6C42\uFF0C\u4E0D\u4F1A\u5199\u5165 Vault \u6216\u63D2\u4EF6\u8BBE\u7F6E\u3002" });
    new Setting(this.contentEl).setName("\u90AE\u7BB1").addText((text) => text.setPlaceholder("you@example.com").onChange((value) => {
      this.email = value;
    }));
    new Setting(this.contentEl).setName("\u5BC6\u7801").addText((text) => {
      text.inputEl.type = "password";
      text.setPlaceholder("\u7F51\u7AD9\u767B\u5F55\u5BC6\u7801").onChange((value) => {
        this.password = value;
      });
    });
    const actions = new Setting(this.contentEl);
    actions.addButton((button) => button.setButtonText("\u767B\u5F55").setCta().onClick(async () => {
      if (this.busy) return;
      if (!this.email.trim() || !this.password) {
        new Notice("\u8BF7\u8F93\u5165\u90AE\u7BB1\u548C\u5BC6\u7801");
        return;
      }
      this.busy = true;
      button.setDisabled(true).setButtonText("\u767B\u5F55\u4E2D\u2026");
      try {
        const account = await this.plugin.api.signIn(this.email, this.password);
        this.password = "";
        const name = account?.nickname || account?.email || account?.userId || "\u5F53\u524D\u8D26\u6237";
        new Notice(`\u5DF2\u767B\u5F55\uFF1A${name}`);
        if (!this.plugin.api.isSecureStorageAvailable()) {
          new Notice("SecretStorage \u52A0\u5BC6\u4E0D\u53EF\u7528\uFF1A\u672C\u6B21\u767B\u5F55\u4EC5\u5728\u5F53\u524D Obsidian \u4F1A\u8BDD\u4E2D\u6709\u6548", 8e3);
        }
        this.close();
        this.plugin.settingTab?.display();
        this.plugin.lastPublisherError = "";
        this.plugin.refreshPublisherViews();
      } catch (error) {
        this.password = "";
        new Notice(`\u767B\u5F55\u5931\u8D25\uFF1A${error.message}`, 8e3);
        this.plugin.lastPublisherError = error.message;
        this.plugin.refreshPublisherViews();
      } finally {
        this.busy = false;
        button.setDisabled(false).setButtonText("\u767B\u5F55");
      }
    }));
  }
  onClose() {
    this.email = "";
    this.password = "";
    this.contentEl.empty();
  }
};
var ConfirmPublishModal = class extends Modal {
  constructor(app, title) {
    super(app);
    this.noteTitle = title;
    this.resolve = null;
    this.settled = false;
  }
  wait() {
    return new Promise((resolve) => {
      this.resolve = resolve;
      this.open();
    });
  }
  finish(value) {
    if (this.settled) return;
    this.settled = true;
    this.resolve?.(value);
    this.close();
  }
  onOpen() {
    this.setTitle("\u786E\u8BA4\u516C\u5F00\u53D1\u5E03");
    this.contentEl.createEl("p", {
      text: `\u201C${this.noteTitle}\u201D\u5C06\u5148\u4E0A\u4F20\u6700\u65B0\u5185\u5BB9\uFF0C\u518D\u516C\u5F00\u53D1\u5E03\u5230 shizuki.site\u3002`
    });
    const actions = new Setting(this.contentEl);
    actions.addButton((button) => button.setButtonText("\u53D6\u6D88").onClick(() => this.finish(false)));
    actions.addButton((button) => button.setButtonText("\u4E0A\u4F20\u5E76\u53D1\u5E03").setCta().onClick(() => this.finish(true)));
  }
  onClose() {
    if (!this.settled) {
      this.settled = true;
      this.resolve?.(false);
    }
    this.contentEl.empty();
  }
};
var PayloadPreviewModal = class extends Modal {
  constructor(app, preview) {
    super(app);
    this.preview = preview;
  }
  onOpen() {
    this.setTitle("Shizuki \u53D1\u5E03\u8F7D\u8377\u9884\u89C8");
    this.contentEl.createEl("p", {
      text: `\u672C\u5730\u56FE\u7247 ${this.preview.embedCount} \u4E2A\uFF1B\u6B64\u9884\u89C8\u4E0D\u4F1A\u767B\u5F55\u3001\u4E0A\u4F20\u6216\u53D1\u5E03\u3002`
    });
    this.contentEl.createEl("pre", {
      cls: "shizuki-publisher-preview",
      text: JSON.stringify(this.preview.payload, null, 2).slice(0, 12e3)
    });
  }
  onClose() {
    this.contentEl.empty();
  }
};
var BackgroundChooserModal = class extends FuzzySuggestModal {
  constructor(app, plugin) {
    super(app);
    this.plugin = plugin;
    this.setPlaceholder(`\u9009\u62E9 ${BACKGROUND_FOLDER} \u4E2D\u7684\u80CC\u666F\u56FE\u7247`);
  }
  getItems() {
    return this.app.vault.getFiles().filter((file) => {
      const path = file.path.replace(/\\/g, "/");
      return path.startsWith(`${BACKGROUND_FOLDER}/`) && core.SUPPORTED_IMAGE_EXTENSIONS.has(file.extension.toLowerCase());
    });
  }
  getItemText(file) {
    return file.path.slice(BACKGROUND_FOLDER.length + 1);
  }
  async onChooseItem(file) {
    this.plugin.settings.backgroundPath = file.path;
    await this.plugin.saveSettings();
    this.plugin.applyBackground();
    new Notice(`\u80CC\u666F\u5DF2\u5207\u6362\uFF1A${file.name}`);
  }
};
function sidebarVisibilityLabel(visibility) {
  return {
    PUBLIC: "\u516C\u5F00",
    PRIVATE: "\u79C1\u5BC6",
    UNLISTED: "\u4E0D\u5217\u51FA"
  }[visibility] || visibility || "\u2014";
}
function sidebarTimeLabel(value) {
  if (!value) return "\u5C1A\u672A\u540C\u6B65";
  const date = new Date(value);
  if (Number.isNaN(date.getTime())) return String(value);
  return new Intl.DateTimeFormat("zh-CN", {
    month: "2-digit",
    day: "2-digit",
    hour: "2-digit",
    minute: "2-digit"
  }).format(date);
}
var ShizukiPublisherView = class extends ItemView {
  constructor(leaf, plugin) {
    super(leaf);
    this.plugin = plugin;
    this.renderVersion = 0;
    this.localBusy = false;
    this.localError = "";
  }
  getViewType() {
    return PUBLISHER_VIEW_TYPE;
  }
  getDisplayText() {
    return "Shizuki \u53D1\u5E03";
  }
  getIcon() {
    return "send";
  }
  async onOpen() {
    this.contentEl.addClass("shizuki-publisher-sidebar");
    await this.refresh();
  }
  async onClose() {
    this.renderVersion += 1;
    this.contentEl.empty();
  }
  async refresh() {
    const version = ++this.renderVersion;
    try {
      const state = await this.plugin.getPublisherSidebarState({
        busy: this.localBusy || this.plugin.publisherBusy,
        error: this.localError || this.plugin.lastPublisherError
      });
      if (version === this.renderVersion) this.render(state);
    } catch (error) {
      if (version !== this.renderVersion) return;
      this.render(core.buildPublisherSidebarState({
        session: this.plugin.getPublisherSessionState(),
        busy: this.localBusy,
        error: error.message
      }));
    }
  }
  createAction(container, { text, className = "", disabled = false, title = text, onClick }) {
    const button = container.createEl("button", {
      cls: `shizuki-publisher-action ${className}`.trim(),
      text
    });
    button.disabled = Boolean(disabled);
    button.setAttr("aria-label", title);
    button.setAttr("title", title);
    button.addEventListener("click", onClick);
    return button;
  }
  async runAction(action) {
    if (this.localBusy || this.plugin.publisherBusy) return;
    this.localBusy = true;
    this.localError = "";
    await this.refresh();
    try {
      await action();
    } catch (error) {
      this.localError = error.message;
    } finally {
      this.localBusy = false;
      await this.refresh();
    }
  }
  addMetadataRow(container, label, value, title = value) {
    const row = container.createDiv({ cls: "shizuki-publisher-meta-row" });
    row.createSpan({ cls: "shizuki-publisher-meta-label", text: label });
    const valueEl = row.createSpan({ cls: "shizuki-publisher-meta-value", text: String(value) });
    valueEl.setAttr("title", String(title));
  }
  render(state) {
    const root = this.contentEl;
    root.empty();
    root.setAttr("data-stage", state.stage);
    const header = root.createDiv({ cls: "shizuki-publisher-header" });
    header.createDiv({ cls: "shizuki-publisher-eyebrow", text: "SHIZUKI.SITE" });
    header.createEl("h2", { text: "\u53D1\u5E03\u53F0" });
    header.createEl("p", { text: "\u8BA9\u7B14\u8BB0\u4ECE\u8FD9\u91CC\u62B5\u8FBE\u4F60\u7684\u535A\u5BA2\u3002" });
    const session = root.createDiv({ cls: "shizuki-publisher-session" });
    const sessionCopy = session.createDiv({ cls: "shizuki-publisher-session-copy" });
    const sessionState = sessionCopy.createDiv({ cls: "shizuki-publisher-session-state" });
    sessionState.createSpan({ cls: `shizuki-publisher-session-dot${state.hasSession ? " is-connected" : ""}` });
    sessionState.createSpan({ text: state.hasSession ? "\u7F51\u7AD9\u5DF2\u8FDE\u63A5" : "\u7F51\u7AD9\u672A\u8FDE\u63A5" });
    sessionCopy.createDiv({ cls: "shizuki-publisher-session-account", text: state.accountLabel });
    if (state.hasSession) {
      this.createAction(session, {
        text: "\u9000\u51FA",
        className: "is-quiet",
        title: "\u9000\u51FA shizuki.site",
        disabled: state.busy,
        onClick: () => this.runAction(async () => {
          await this.plugin.api.signOut();
          this.plugin.lastPublisherError = "";
          new Notice("\u5DF2\u9000\u51FA shizuki.site");
          this.plugin.settingTab?.display();
          this.plugin.refreshPublisherViews();
        })
      });
    } else {
      this.createAction(session, {
        text: "\u767B\u5F55",
        className: "is-quiet",
        title: "\u767B\u5F55 shizuki.site",
        disabled: state.busy,
        onClick: () => new SignInModal(this.app, this.plugin).open()
      });
    }
    if (!state.eligible) {
      const empty = root.createDiv({ cls: "shizuki-publisher-empty" });
      empty.createDiv({ cls: "shizuki-publisher-empty-mark", text: "\uFF0B" });
      empty.createEl("h3", { text: "\u7B49\u5F85\u4E00\u7BC7\u7B14\u8BB0" });
      empty.createEl("p", { text: state.unavailableReason });
    } else {
      const card = root.createDiv({ cls: `shizuki-publisher-note-card is-${state.stage}` });
      card.createDiv({ cls: "shizuki-publisher-sync-rail", attr: { "aria-hidden": "true" } });
      const cardBody = card.createDiv({ cls: "shizuki-publisher-note-body" });
      const status = cardBody.createDiv({ cls: "shizuki-publisher-note-status" });
      status.setAttr("aria-live", "polite");
      status.createSpan({ cls: "shizuki-publisher-status-dot" });
      status.createSpan({ text: state.busy ? "\u6B63\u5728\u5904\u7406\u2026" : state.statusLabel });
      cardBody.createEl("h3", { text: state.title, attr: { title: state.title } });
      cardBody.createDiv({ cls: "shizuki-publisher-note-path", text: state.path, attr: { title: state.path } });
      const metadata = cardBody.createDiv({ cls: "shizuki-publisher-metadata" });
      this.addMetadataRow(metadata, "\u5206\u7C7B", state.categoryCode);
      this.addMetadataRow(metadata, "\u53EF\u89C1\u6027", sidebarVisibilityLabel(state.visibility), state.visibility);
      this.addMetadataRow(metadata, "\u672C\u5730\u56FE\u7247", `${state.visualCount} \u4E2A`);
      this.addMetadataRow(metadata, "\u8FDC\u7AEF\u6587\u7AE0", state.postId ? `#${state.postId}` : "\u5C1A\u672A\u521B\u5EFA");
      this.addMetadataRow(metadata, "\u6700\u8FD1\u540C\u6B65", sidebarTimeLabel(state.syncedAt), state.syncedAt || "\u5C1A\u672A\u540C\u6B65");
    }
    if (state.error) {
      const error = root.createDiv({ cls: "shizuki-publisher-error", text: state.error });
      error.setAttr("role", "alert");
    } else if (state.eligible && !state.hasSession) {
      root.createDiv({ cls: "shizuki-publisher-hint", text: "\u5148\u767B\u5F55\u7F51\u7AD9\uFF0C\u5373\u53EF\u4E0A\u4F20\u8349\u7A3F\u6216\u6B63\u5F0F\u53D1\u5E03\u3002" });
    }
    const actions = root.createDiv({ cls: "shizuki-publisher-actions" });
    this.createAction(actions, {
      text: "\u9884\u89C8\u53D1\u5E03\u5185\u5BB9",
      className: "is-secondary",
      disabled: !state.canPreview,
      title: "\u9884\u89C8\u5F53\u524D\u7B14\u8BB0\u7684\u53D1\u5E03\u8F7D\u8377",
      onClick: () => this.runAction(() => this.plugin.previewActivePayload())
    });
    this.createAction(actions, {
      text: state.busy ? "\u6B63\u5728\u5904\u7406\u2026" : "\u4E0A\u4F20\u4E3A\u8349\u7A3F",
      className: "is-primary",
      disabled: !state.canPublish,
      title: state.hasSession ? "\u4E0A\u4F20\u5F53\u524D\u7B14\u8BB0\u4E3A\u7F51\u7AD9\u8349\u7A3F" : "\u8BF7\u5148\u767B\u5F55\u7F51\u7AD9",
      onClick: () => this.runAction(() => this.plugin.uploadActiveNote(false))
    });
    this.createAction(actions, {
      text: "\u786E\u8BA4\u5E76\u6B63\u5F0F\u53D1\u5E03",
      className: "is-publish",
      disabled: !state.canPublish,
      title: state.hasSession ? "\u786E\u8BA4\u540E\u6B63\u5F0F\u53D1\u5E03\u5F53\u524D\u7B14\u8BB0" : "\u8BF7\u5148\u767B\u5F55\u7F51\u7AD9",
      onClick: () => this.runAction(() => this.plugin.publishActiveNote())
    });
  }
};
var ShizukiPublisherSettingTab = class extends PluginSettingTab {
  constructor(app, plugin) {
    super(app, plugin);
    this.plugin = plugin;
  }
  display() {
    const { containerEl } = this;
    containerEl.empty();
    containerEl.createEl("h2", { text: "Shizuki Site Publisher" });
    new Setting(containerEl).setName("\u7F51\u7AD9\u5730\u5740").setDesc("\u53D1\u5E03 API \u6240\u5728\u7684\u7F51\u7AD9\u6839\u5730\u5740").addText((text) => text.setValue(this.plugin.settings.siteUrl).onChange(async (value) => {
      this.plugin.settings.siteUrl = value.trim();
      await this.plugin.saveSettings();
    }));
    new Setting(containerEl).setName("\u9ED8\u8BA4\u5206\u7C7B").setDesc("\u7B14\u8BB0\u6CA1\u6709 category frontmatter \u65F6\u4F7F\u7528").addText((text) => text.setValue(this.plugin.settings.defaultCategoryCode).onChange(async (value) => {
      this.plugin.settings.defaultCategoryCode = value.trim() || "life";
      await this.plugin.saveSettings();
    }));
    new Setting(containerEl).setName("\u9ED8\u8BA4\u53EF\u89C1\u6027").addDropdown((dropdown) => dropdown.addOption("PUBLIC", "\u516C\u5F00").addOption("UNLISTED", "\u4E0D\u5217\u51FA").addOption("PRIVATE", "\u79C1\u5BC6").setValue(this.plugin.settings.defaultVisibility).onChange(async (value) => {
      this.plugin.settings.defaultVisibility = value;
      await this.plugin.saveSettings();
    }));
    const accountLabel = this.plugin.api.account ? String(this.plugin.api.account.nickname || this.plugin.api.account.email || this.plugin.api.account.userId || "\u5DF2\u767B\u5F55") : this.plugin.api.refreshToken ? "\u5DF2\u6709\u5B89\u5168\u4F1A\u8BDD\uFF08\u4E0B\u6B21\u8BF7\u6C42\u81EA\u52A8\u5237\u65B0\uFF09" : "\u672A\u767B\u5F55";
    new Setting(containerEl).setName("\u7F51\u7AD9\u8D26\u6237").setDesc(accountLabel).addButton((button) => button.setButtonText("\u767B\u5F55").onClick(() => new SignInModal(this.app, this.plugin).open())).addButton((button) => button.setButtonText("\u9000\u51FA").setWarning().onClick(async () => {
      await this.plugin.api.signOut();
      this.plugin.lastPublisherError = "";
      new Notice("\u5DF2\u9000\u51FA shizuki.site");
      this.plugin.refreshPublisherViews();
      this.display();
    }));
    new Setting(containerEl).setName("Draw.io \u7F16\u8F91\u5668").setDesc("\u4E0E shizuki.site \u767D\u677F\u5171\u7528\u7684 diagrams.net \u5730\u5740").addText((text) => text.setValue(this.plugin.settings.editorUrl).onChange(async (value) => {
      this.plugin.settings.editorUrl = value.trim() || DEFAULT_SETTINGS.editorUrl;
      await this.plugin.saveSettings();
    })).addButton((button) => button.setButtonText("\u68C0\u67E5\u8FDE\u63A5").onClick(() => this.plugin.checkDrawioConnection()));
    new Setting(containerEl).setName("Vault \u80CC\u666F").setDesc(this.plugin.settings.backgroundPath || "\u5F53\u524D\u4F7F\u7528\u4E2D\u6027\u6697\u8272\u6E10\u53D8").addButton((button) => button.setButtonText("\u9009\u62E9\u56FE\u7247").onClick(() => this.plugin.openBackgroundChooser())).addButton((button) => button.setButtonText("\u6E05\u9664").onClick(() => this.plugin.clearBackground()));
    containerEl.createEl("p", {
      cls: "setting-item-description",
      text: `\u652F\u6301 ${BACKGROUND_FOLDER} \u4E0B\u7684 PNG\u3001JPEG\u3001WebP\u3001GIF\u3002\u767B\u5F55\u4EE4\u724C\u4E0D\u4F1A\u5199\u5165\u6B64\u8BBE\u7F6E\u9875\u5BF9\u5E94\u7684 data.json\u3002`
    });
  }
};
var ShizukiSitePublisherPlugin = class extends Plugin {
  async onload() {
    await this.loadSettings();
    this.publisherBusy = false;
    this.lastPublisherError = "";
    this.publisherRefreshTimer = null;
    this.api = new ShizukiApiClient(this);
    this.api.loadStoredRefreshToken();
    this.settingTab = new ShizukiPublisherSettingTab(this.app, this);
    this.addSettingTab(this.settingTab);
    this.registerView(PUBLISHER_VIEW_TYPE, (leaf) => new ShizukiPublisherView(leaf, this));
    this.registerCommands();
    this.addRibbonIcon("send", "\u6253\u5F00 Shizuki \u53D1\u5E03\u4FA7\u680F", () => this.activatePublisherView());
    this.addRibbonIcon("upload", "\u4E0A\u4F20\u5F53\u524D\u7B14\u8BB0\u5230 shizuki.site", () => this.uploadActiveNote(false));
    this.registerEvent(this.app.workspace.on("active-leaf-change", () => this.schedulePublisherRefresh()));
    this.registerEvent(this.app.workspace.on("layout-change", () => this.schedulePublisherRefresh()));
    this.registerEvent(this.app.metadataCache.on("changed", (file) => {
      if (file === this.app.workspace.getActiveFile()) this.schedulePublisherRefresh();
    }));
    this.register(() => {
      if (this.publisherRefreshTimer != null) window.clearTimeout(this.publisherRefreshTimer);
    });
    this.applyBackground();
  }
  onunload() {
    document.body.classList.remove("shizuki-dark-vault", "shizuki-background-enabled");
    document.body.style.removeProperty("--shizuki-background-image");
    this.app.workspace.detachLeavesOfType(PUBLISHER_VIEW_TYPE);
    if (this.api) {
      this.api.accessToken = "";
      this.api.refreshToken = "";
      this.api.account = null;
    }
  }
  async loadSettings() {
    this.settings = Object.assign({}, DEFAULT_SETTINGS, await this.loadData());
  }
  async saveSettings() {
    const safeSettings = {
      siteUrl: this.settings.siteUrl,
      editorUrl: this.settings.editorUrl,
      defaultCategoryCode: this.settings.defaultCategoryCode,
      defaultVisibility: this.settings.defaultVisibility,
      backgroundPath: this.settings.backgroundPath
    };
    await this.saveData(safeSettings);
    this.refreshPublisherViews();
  }
  registerCommands() {
    this.addCommand({
      id: "open-publisher-sidebar",
      name: "\u6253\u5F00\u53D1\u5E03\u4FA7\u680F",
      callback: () => this.activatePublisherView()
    });
    this.addCommand({
      id: "sign-in",
      name: "\u767B\u5F55\u7F51\u7AD9",
      callback: () => new SignInModal(this.app, this).open()
    });
    this.addCommand({
      id: "upload-active-note",
      name: "\u4E0A\u4F20\u5F53\u524D\u7B14\u8BB0\u4E3A\u8349\u7A3F",
      checkCallback: (checking) => this.activeNoteCommand(checking, () => this.uploadActiveNote(false))
    });
    this.addCommand({
      id: "publish-active-note",
      name: "\u53D1\u5E03\u5F53\u524D\u7B14\u8BB0",
      checkCallback: (checking) => this.activeNoteCommand(checking, () => this.publishActiveNote())
    });
    this.addCommand({
      id: "preview-payload",
      name: "\u9884\u89C8\u53D1\u5E03\u8F7D\u8377",
      checkCallback: (checking) => this.activeNoteCommand(checking, () => this.previewActivePayload())
    });
    this.addCommand({
      id: "choose-background",
      name: "\u9009\u62E9\u80CC\u666F\u56FE\u7247",
      callback: () => this.openBackgroundChooser()
    });
    this.addCommand({
      id: "clear-background",
      name: "\u6E05\u9664\u80CC\u666F\u56FE\u7247",
      callback: () => this.clearBackground()
    });
    this.addCommand({
      id: "check-drawio",
      name: "\u68C0\u67E5 Draw.io \u8FDE\u63A5",
      callback: () => this.checkDrawioConnection()
    });
    this.addCommand({
      id: "sign-out",
      name: "\u9000\u51FA\u767B\u5F55",
      callback: async () => {
        await this.api.signOut();
        this.lastPublisherError = "";
        new Notice("\u5DF2\u9000\u51FA shizuki.site");
        this.settingTab?.display();
        this.refreshPublisherViews();
      }
    });
  }
  async activatePublisherView() {
    const leaves = this.app.workspace.getLeavesOfType(PUBLISHER_VIEW_TYPE);
    let leaf = leaves[0] || null;
    if (core.choosePublisherLeafStrategy(leaves.length) === "create") {
      leaf = this.app.workspace.getLeftLeaf(false);
      if (!leaf) throw new Error("\u65E0\u6CD5\u521B\u5EFA Shizuki \u53D1\u5E03\u4FA7\u680F");
      await leaf.setViewState({ type: PUBLISHER_VIEW_TYPE, active: true });
    }
    await this.app.workspace.revealLeaf(leaf);
    leaf.view?.refresh?.();
  }
  schedulePublisherRefresh() {
    if (this.publisherRefreshTimer != null) window.clearTimeout(this.publisherRefreshTimer);
    this.publisherRefreshTimer = window.setTimeout(() => {
      this.publisherRefreshTimer = null;
      this.refreshPublisherViews();
    }, 80);
  }
  refreshPublisherViews() {
    for (const leaf of this.app.workspace.getLeavesOfType(PUBLISHER_VIEW_TYPE)) {
      leaf.view?.refresh?.();
    }
  }
  getPublisherSessionState() {
    return {
      account: this.api?.account || null,
      hasAccessToken: Boolean(this.api?.accessToken),
      hasRefreshToken: Boolean(this.api?.refreshToken)
    };
  }
  async getPublisherSidebarState({ busy = false, error = "" } = {}) {
    const file = this.app.workspace.getActiveFile();
    let frontmatter = {};
    let mapped = null;
    let visualCount = 0;
    if (file instanceof TFile && file.extension === "md") {
      const markdown = await this.app.vault.read(file);
      frontmatter = this.app.metadataCache.getFileCache(file)?.frontmatter || {};
      mapped = core.buildPostPayload({
        fileBasename: file.basename,
        frontmatter,
        markdown,
        defaults: {
          categoryCode: this.settings.defaultCategoryCode,
          visibility: this.settings.defaultVisibility
        }
      });
      visualCount = core.discoverVisualEmbeds(mapped.payload.markdown).length;
    }
    return core.buildPublisherSidebarState({
      file,
      frontmatter,
      mapped,
      visualCount,
      session: this.getPublisherSessionState(),
      busy,
      error
    });
  }
  activeNoteCommand(checking, callback) {
    const file = this.app.workspace.getActiveFile();
    const available = file instanceof TFile && file.extension === "md" && !this.isProtectedSource(file);
    if (!checking && available) callback();
    return available;
  }
  isProtectedSource(file) {
    return file.path.replace(/\\/g, "/").toLowerCase().startsWith("00_notion_raw/");
  }
  getActiveMarkdownFile() {
    const file = this.app.workspace.getActiveFile();
    if (!(file instanceof TFile) || file.extension !== "md") {
      throw new Error("\u8BF7\u5148\u6253\u5F00\u4E00\u4E2A Markdown \u7B14\u8BB0");
    }
    if (this.isProtectedSource(file)) {
      throw new Error("00_Notion_Raw \u662F\u53EA\u8BFB\u8FC1\u79FB\u6E90\uFF0C\u4E0D\u80FD\u76F4\u63A5\u53D1\u5E03");
    }
    return file;
  }
  async buildActiveContext() {
    const file = this.getActiveMarkdownFile();
    const markdown = await this.app.vault.read(file);
    const frontmatter = this.app.metadataCache.getFileCache(file)?.frontmatter || {};
    const mapped = core.buildPostPayload({
      fileBasename: file.basename,
      frontmatter,
      markdown,
      defaults: {
        categoryCode: this.settings.defaultCategoryCode,
        visibility: this.settings.defaultVisibility
      }
    });
    return { file, frontmatter, ...mapped };
  }
  async previewActivePayload() {
    try {
      this.lastPublisherError = "";
      const context = await this.buildActiveContext();
      const embeds = core.discoverVisualEmbeds(context.payload.markdown);
      new PayloadPreviewModal(this.app, {
        payload: { postId: context.postId, ...context.payload },
        embedCount: embeds.length
      }).open();
      this.refreshPublisherViews();
    } catch (error) {
      this.lastPublisherError = error.message;
      this.refreshPublisherViews();
      new Notice(error.message, 7e3);
    }
  }
  async uploadActiveNote(publishAfterUpload) {
    if (this.publisherBusy) {
      new Notice("\u5DF2\u6709 Shizuki \u53D1\u5E03\u4EFB\u52A1\u6B63\u5728\u8FDB\u884C\u4E2D");
      return null;
    }
    this.publisherBusy = true;
    this.lastPublisherError = "";
    this.refreshPublisherViews();
    const progress = new Notice("Shizuki\uFF1A\u51C6\u5907\u53D1\u5E03\u8F7D\u8377\u2026", 0);
    try {
      const context = await this.buildActiveContext();
      await this.api.requireAccessToken();
      progress.setMessage("Shizuki\uFF1A\u5904\u7406\u672C\u5730\u56FE\u7247\u4E0E Draw.io\u2026");
      const markdown = await this.prepareVisualAssets(context.file, context.payload.markdown, (current, total) => {
        progress.setMessage(`Shizuki\uFF1A\u4E0A\u4F20\u56FE\u7247 ${current}/${total}\u2026`);
      });
      const payload = { ...context.payload, markdown };
      progress.setMessage(context.postId ? "Shizuki\uFF1A\u66F4\u65B0\u8FDC\u7AEF\u8349\u7A3F\u2026" : "Shizuki\uFF1A\u521B\u5EFA\u8FDC\u7AEF\u8349\u7A3F\u2026");
      const post = context.postId ? await this.api.rawRequest(`/api/v1/me/posts/${context.postId}`, { method: "PUT", auth: true, body: payload }) : await this.api.rawRequest("/api/v1/me/posts", { method: "POST", auth: true, body: payload });
      const postId = Number(post?.postId ?? post?.post_id ?? context.postId);
      if (!Number.isInteger(postId) || postId <= 0) throw new Error("\u7F51\u7AD9\u6CA1\u6709\u8FD4\u56DE\u6709\u6548 postId");
      await this.updateSyncFrontmatter(context.file, {
        postId,
        status: String(post?.statusCode || post?.status_code || "DRAFT"),
        published: false
      });
      if (publishAfterUpload) {
        progress.setMessage("Shizuki\uFF1A\u516C\u5F00\u53D1\u5E03\u6587\u7AE0\u2026");
        const published = await this.api.rawRequest(`/api/v1/me/posts/${postId}/publish`, {
          method: "POST",
          auth: true
        });
        await this.updateSyncFrontmatter(context.file, {
          postId,
          status: String(published?.statusCode || published?.status_code || "PUBLISHED"),
          published: true
        });
      }
      progress.hide();
      new Notice(publishAfterUpload ? "\u5DF2\u53D1\u5E03\u5230 shizuki.site" : "\u8349\u7A3F\u5DF2\u4E0A\u4F20\u5230 shizuki.site", 6e3);
      return postId;
    } catch (error) {
      progress.hide();
      this.lastPublisherError = error.message;
      new Notice(`Shizuki \u53D1\u5E03\u5931\u8D25\uFF1A${error.message}`, 1e4);
      throw error;
    } finally {
      this.publisherBusy = false;
      this.refreshPublisherViews();
    }
  }
  async publishActiveNote() {
    try {
      const context = await this.buildActiveContext();
      const confirmed = await new ConfirmPublishModal(this.app, context.payload.title).wait();
      if (!confirmed) return;
      await this.uploadActiveNote(true);
    } catch (error) {
      this.lastPublisherError = error.message;
      this.refreshPublisherViews();
      if (!(error instanceof ApiError)) new Notice(error.message, 7e3);
    }
  }
  async updateSyncFrontmatter(file, { postId, status, published }) {
    const timestamp = (/* @__PURE__ */ new Date()).toISOString();
    await this.app.fileManager.processFrontMatter(file, (frontmatter) => {
      frontmatter.shizuki_post_id = postId;
      frontmatter.shizuki_sync_status = status;
      frontmatter.shizuki_synced_at = timestamp;
      if (published) frontmatter.shizuki_published_at = timestamp;
    });
  }
  resolveEmbedFile(target, sourcePath) {
    let linkPath = String(target || "").split("#")[0].split("?")[0].replace(/^<|>$/g, "");
    try {
      linkPath = decodeURIComponent(linkPath);
    } catch {
    }
    linkPath = normalizePath(linkPath.replace(/^\.\//, ""));
    const resolved = this.app.metadataCache.getFirstLinkpathDest(linkPath, sourcePath);
    if (resolved instanceof TFile) return resolved;
    const direct = this.app.vault.getAbstractFileByPath(linkPath);
    return direct instanceof TFile ? direct : null;
  }
  async prepareVisualAssets(sourceFile, markdown, onProgress) {
    const uploadedByPath = /* @__PURE__ */ new Map();
    return core.rewriteVisualEmbeds(markdown, async (embed) => {
      const file = this.resolveEmbedFile(embed.target, sourceFile.path);
      if (!file) throw new Error(`\u627E\u4E0D\u5230\u672C\u5730\u56FE\u7247\uFF1A${embed.target}`);
      let publicUrl = uploadedByPath.get(file.path);
      if (!publicUrl) {
        const visual = file.name.toLowerCase().endsWith(".drawio.svg") ? await this.rasterizeDrawio(file) : await this.readImageAsset(file);
        publicUrl = await this.uploadVisualAsset(visual);
        uploadedByPath.set(file.path, publicUrl);
      }
      return publicUrl;
    }, onProgress);
  }
  async readImageAsset(file) {
    const extension = file.extension.toLowerCase();
    const contentTypes = {
      png: "image/png",
      jpg: "image/jpeg",
      jpeg: "image/jpeg",
      webp: "image/webp",
      gif: "image/gif"
    };
    const contentType = contentTypes[extension];
    if (!contentType) throw new Error(`\u4E0D\u652F\u6301\u7684\u56FE\u7247\u7C7B\u578B\uFF1A${file.name}`);
    const bytes = await this.app.vault.readBinary(file);
    if (bytes.byteLength > MAX_IMAGE_BYTES) throw new Error(`\u56FE\u7247\u8D85\u8FC7 8MB\uFF1A${file.name}`);
    return { bytes, contentType, fileName: safeUploadName(file.basename, extension) };
  }
  async rasterizeDrawio(file) {
    const source = await this.app.vault.readBinary(file);
    const blob = new Blob([source], { type: "image/svg+xml" });
    const objectUrl = URL.createObjectURL(blob);
    try {
      const image = await loadImage(objectUrl);
      const sourceWidth = Math.max(1, image.naturalWidth || image.width || 1600);
      const sourceHeight = Math.max(1, image.naturalHeight || image.height || 900);
      const scale = Math.min(1, 2400 / Math.max(sourceWidth, sourceHeight));
      const canvas = document.createElement("canvas");
      canvas.width = Math.max(1, Math.round(sourceWidth * scale));
      canvas.height = Math.max(1, Math.round(sourceHeight * scale));
      const context = canvas.getContext("2d");
      if (!context) throw new Error("Canvas \u4E0D\u53EF\u7528");
      context.fillStyle = "#111318";
      context.fillRect(0, 0, canvas.width, canvas.height);
      context.drawImage(image, 0, 0, canvas.width, canvas.height);
      const pngBlob = await canvasToBlob(canvas, "image/png");
      const bytes = await pngBlob.arrayBuffer();
      if (bytes.byteLength > MAX_IMAGE_BYTES) throw new Error(`Draw.io PNG \u8D85\u8FC7 8MB\uFF1A${file.name}`);
      return {
        bytes,
        contentType: "image/png",
        fileName: safeUploadName(file.basename.replace(/\.drawio$/i, ""), "png")
      };
    } catch (error) {
      throw new Error(`\u65E0\u6CD5\u8F6C\u6362 Draw.io \u56FE\u8868 ${file.name}\uFF1A${error.message}`);
    } finally {
      URL.revokeObjectURL(objectUrl);
    }
  }
  async uploadVisualAsset(file) {
    const policy = await this.api.rawRequest("/api/v1/assets/upload-policies", {
      method: "POST",
      auth: true,
      body: {
        fileName: file.fileName,
        contentType: file.contentType,
        assetKind: "STATIC_IMAGE",
        visibility: "PUBLIC"
      }
    });
    let bucket = String(policy?.bucket || "");
    let key = String(policy?.key || "");
    const uploadUrl = String(policy?.uploadUrl || policy?.upload_url || "");
    let uploadContentType = file.contentType;
    if (!bucket || !key || !uploadUrl) throw new Error("\u7F51\u7AD9\u8FD4\u56DE\u7684\u4E0A\u4F20\u7B56\u7565\u65E0\u6548");
    let directUploaded = false;
    try {
      const response = await requestUrl({
        url: uploadUrl,
        method: "PUT",
        headers: { "Content-Type": file.contentType },
        body: toArrayBuffer(file.bytes),
        throw: false
      });
      directUploaded = response.status >= 200 && response.status < 300;
    } catch {
      directUploaded = false;
    }
    if (!directUploaded) {
      const multipart = buildMultipartBody({ asset_kind: "STATIC_IMAGE", visibility: "PUBLIC" }, file);
      const relay = await this.api.rawRequest("/api/v1/assets/upload-relay", {
        method: "POST",
        auth: true,
        headers: { "Content-Type": multipart.contentType },
        body: multipart.body
      });
      bucket = String(relay?.bucket || "");
      key = String(relay?.key || "");
      uploadContentType = String(relay?.contentType || relay?.content_type || file.contentType);
      if (!bucket || !key) throw new Error(`\u56FE\u7247\u4E0A\u4F20\u5931\u8D25\uFF1A${file.fileName}`);
    }
    const created = await this.api.rawRequest("/api/v1/assets", {
      method: "POST",
      auth: true,
      body: {
        bucket,
        key,
        assetType: "image",
        assetKind: "STATIC_IMAGE",
        contentType: uploadContentType,
        visibility: "PUBLIC",
        metadata: { usage: "blog_post_inline", source: "obsidian" }
      }
    });
    const assetId = Number(created?.assetId ?? created?.asset_id);
    if (!Number.isInteger(assetId) || assetId <= 0) throw new Error("\u521B\u5EFA\u56FE\u7247\u8D44\u4EA7\u5931\u8D25");
    const download = await this.api.rawRequest(`/api/v1/assets/${assetId}/download-url`, { auth: true });
    const publicUrl = String(
      download?.publicUrl || download?.public_url || download?.downloadUrl || download?.download_url || ""
    ).trim();
    if (!publicUrl) throw new Error("\u7F51\u7AD9\u6CA1\u6709\u8FD4\u56DE\u56FE\u7247\u516C\u5F00\u5730\u5740");
    return publicUrl;
  }
  openBackgroundChooser() {
    const items = this.app.vault.getFiles().filter((file) => file.path.startsWith(`${BACKGROUND_FOLDER}/`) && core.SUPPORTED_IMAGE_EXTENSIONS.has(file.extension.toLowerCase()));
    if (!items.length) {
      new Notice(`\u8BF7\u5148\u628A\u80CC\u666F\u56FE\u7247\u653E\u5165 ${BACKGROUND_FOLDER}`, 7e3);
      return;
    }
    new BackgroundChooserModal(this.app, this).open();
  }
  async clearBackground() {
    this.settings.backgroundPath = "";
    await this.saveSettings();
    this.applyBackground();
    new Notice("\u5DF2\u6062\u590D\u4E2D\u6027\u6697\u8272\u80CC\u666F");
  }
  applyBackground() {
    document.body.classList.add("shizuki-dark-vault");
    const selected = this.settings.backgroundPath ? this.app.vault.getAbstractFileByPath(normalizePath(this.settings.backgroundPath)) : null;
    if (selected instanceof TFile && core.SUPPORTED_IMAGE_EXTENSIONS.has(selected.extension.toLowerCase())) {
      const resourceUrl = this.app.vault.getResourcePath(selected).replace(/"/g, "%22");
      document.body.style.setProperty("--shizuki-background-image", `url("${resourceUrl}")`);
      document.body.classList.add("shizuki-background-enabled");
    } else {
      document.body.style.removeProperty("--shizuki-background-image");
      document.body.classList.remove("shizuki-background-enabled");
    }
  }
  async checkDrawioConnection() {
    const url = core.buildDrawioEditorUrl(this.settings.editorUrl, "dark");
    try {
      const response = await requestUrl({ url, method: "GET", throw: false });
      if (response.status < 200 || response.status >= 400) {
        throw new Error(`HTTP ${response.status}`);
      }
      new Notice("Draw.io \u5DF2\u8FDE\u63A5\u5230 shizuki.site \u5171\u7528\u7684 diagrams.net \u7F16\u8F91\u5668");
      return true;
    } catch (error) {
      new Notice(`Draw.io \u7F16\u8F91\u5668\u4E0D\u53EF\u7528\uFF1A${error.message}`, 1e4);
      return false;
    }
  }
};
function safeUploadName(baseName, extension) {
  const base = String(baseName || "blog-inline").normalize("NFKD").replace(/[^a-zA-Z0-9_-]+/g, "-").replace(/^-+|-+$/g, "").toLowerCase() || "blog-inline";
  return `${base.slice(0, 80)}.${String(extension).replace(/^\./, "").toLowerCase()}`;
}
function loadImage(url) {
  return new Promise((resolve, reject) => {
    const image = new Image();
    image.onload = () => resolve(image);
    image.onerror = () => reject(new Error("SVG \u56FE\u50CF\u65E0\u6CD5\u8F7D\u5165"));
    image.src = url;
  });
}
function canvasToBlob(canvas, type) {
  return new Promise((resolve, reject) => {
    canvas.toBlob((blob) => blob ? resolve(blob) : reject(new Error("PNG \u7F16\u7801\u5931\u8D25")), type);
  });
}
module.exports = ShizukiSitePublisherPlugin;
module.exports._test = {
  ApiError,
  ShizukiApiClient,
  ShizukiPublisherView,
  PUBLISHER_VIEW_TYPE,
  buildMultipartBody,
  concatBytes,
  safeUploadName
};
