'use strict';

const {
  Plugin,
  Modal,
  Setting,
  Notice,
  PluginSettingTab,
  FuzzySuggestModal,
  TFile,
  requestUrl,
  normalizePath
} = require('obsidian');
const core = require('./core');

const PLUGIN_ID = 'shizuki-site-publisher';
const REFRESH_TOKEN_SECRET_ID = 'shizuki-site-publisher-refresh-token';
const BACKGROUND_FOLDER = '90-Assets/images/Backgrounds';
const MAX_IMAGE_BYTES = 8 * 1024 * 1024;

const DEFAULT_SETTINGS = {
  siteUrl: 'https://shizuki.site',
  editorUrl: 'https://embed.diagrams.net/',
  defaultCategoryCode: 'life',
  defaultVisibility: 'PUBLIC',
  backgroundPath: ''
};

class ApiError extends Error {
  constructor(message, status, payload) {
    super(message);
    this.name = 'ApiError';
    this.status = Number(status) || 0;
    this.payload = payload;
  }
}

function normalizeSiteUrl(value) {
  const normalized = String(value || DEFAULT_SETTINGS.siteUrl).trim().replace(/\/+$/, '');
  if (!/^https?:\/\//i.test(normalized)) {
    throw new Error('网站地址必须以 http:// 或 https:// 开头');
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
  if (payload && typeof payload === 'object') {
    return String(payload.message || payload.detail || payload.error || fallback);
  }
  return String(payload || fallback);
}

function toArrayBuffer(value) {
  if (value instanceof ArrayBuffer) return value;
  if (ArrayBuffer.isView(value)) {
    return value.buffer.slice(value.byteOffset, value.byteOffset + value.byteLength);
  }
  throw new TypeError('Expected binary ArrayBuffer data.');
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
      `--${boundary}\r\nContent-Disposition: form-data; name="${name}"\r\n\r\n${String(value)}\r\n`
    ));
  }
  const safeName = String(file.fileName || 'blog-inline.png').replace(/["\r\n]/g, '-');
  parts.push(encoder.encode(
    `--${boundary}\r\nContent-Disposition: form-data; name="file"; filename="${safeName}"\r\nContent-Type: ${file.contentType}\r\n\r\n`
  ));
  parts.push(new Uint8Array(toArrayBuffer(file.bytes)));
  parts.push(encoder.encode(`\r\n--${boundary}--\r\n`));
  return {
    contentType: `multipart/form-data; boundary=${boundary}`,
    body: toArrayBuffer(concatBytes(parts))
  };
}

class ShizukiApiClient {
  constructor(plugin) {
    this.plugin = plugin;
    this.accessToken = '';
    this.refreshToken = '';
    this.account = null;
    this.refreshPromise = null;
  }

  loadStoredRefreshToken() {
    const storage = this.plugin.app.secretStorage;
    if (!storage) return;
    try {
      this.refreshToken = String(storage.getSecret(REFRESH_TOKEN_SECRET_ID) || '');
    } catch {
      this.refreshToken = '';
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
    this.refreshToken = String(refreshToken || '');
    if (!this.refreshToken || !this.isSecureStorageAvailable()) return false;
    this.plugin.app.secretStorage.setSecret(REFRESH_TOKEN_SECRET_ID, this.refreshToken);
    return true;
  }

  clearSession() {
    this.accessToken = '';
    this.refreshToken = '';
    this.account = null;
    const storage = this.plugin.app.secretStorage;
    if (storage) {
      try {
        storage.deleteSecret(REFRESH_TOKEN_SECRET_ID);
      } catch {
        // Session is still cleared from memory if secure storage is unavailable.
      }
    }
  }

  async rawRequest(path, options = {}) {
    const url = /^https?:\/\//i.test(path)
      ? path
      : `${normalizeSiteUrl(this.plugin.settings.siteUrl)}${path.startsWith('/') ? path : `/${path}`}`;
    const headers = { ...(options.headers || {}) };
    let body = options.body;
    if (options.auth) {
      const token = await this.requireAccessToken();
      headers.Authorization = `Bearer ${token}`;
    }
    if (body != null && !(body instanceof ArrayBuffer) && !ArrayBuffer.isView(body) && typeof body !== 'string') {
      body = JSON.stringify(body);
      headers['Content-Type'] = headers['Content-Type'] || 'application/json';
    }
    const response = await requestUrl({
      url,
      method: options.method || 'GET',
      headers,
      body: body == null ? undefined : toArrayBufferIfNeeded(body),
      throw: false
    });
    const payload = responsePayload(response);
    if (response.status === 401 && options.auth && options.retry !== false && this.refreshToken) {
      await this.refreshAccessToken();
      return this.rawRequest(path, { ...options, retry: false });
    }
    if (response.status < 200 || response.status >= 300) {
      throw new ApiError(problemMessage(payload, `请求失败（HTTP ${response.status}）`), response.status, payload);
    }
    return core.normalizeApiData(payload);
  }

  async requireAccessToken() {
    if (this.accessToken) return this.accessToken;
    if (!this.refreshToken) throw new Error('请先登录 shizuki.site');
    await this.refreshAccessToken();
    return this.accessToken;
  }

  async applyTokenResponse(payload, { persistRefresh = true } = {}) {
    const token = core.normalizeTokenPayload(payload);
    if (token.resultType !== 'TOKEN_ISSUED' || !token.accessToken) {
      throw new Error('网站没有返回有效登录会话');
    }
    this.accessToken = token.accessToken;
    if (token.refreshToken) {
      if (persistRefresh) this.storeRefreshToken(token.refreshToken);
      else this.refreshToken = token.refreshToken;
    }
    return token;
  }

  async signIn(email, password) {
    const payload = await this.rawRequest('/api/v1/auth/tokens', {
      method: 'POST',
      body: {
        grantType: 'EMAIL_PASSWORD',
        email: String(email || '').trim(),
        password: String(password || '')
      }
    });
    await this.applyTokenResponse(payload);
    try {
      this.account = await this.rawRequest('/api/v1/me', { auth: true });
      return this.account;
    } catch (error) {
      this.clearSession();
      throw error;
    }
  }

  async refreshAccessToken() {
    if (!this.refreshToken) throw new Error('登录会话已失效，请重新登录');
    if (this.refreshPromise) return this.refreshPromise;
    this.refreshPromise = (async () => {
      const payload = await this.rawRequest('/api/v1/auth/tokens', {
        method: 'POST',
        body: { grantType: 'REFRESH_TOKEN', refreshToken: this.refreshToken }
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
    this.account = await this.rawRequest('/api/v1/me', { auth: true });
    return this.account;
  }

  async signOut() {
    const refreshToken = this.refreshToken;
    if (this.accessToken && refreshToken) {
      try {
        await this.rawRequest('/api/v1/auth/logout', {
          method: 'POST',
          auth: true,
          retry: false,
          body: { refreshToken }
        });
      } catch {
        // Local sign-out must still remove the stored credential.
      }
    }
    this.clearSession();
  }
}

function toArrayBufferIfNeeded(body) {
  if (body instanceof ArrayBuffer || ArrayBuffer.isView(body)) return toArrayBuffer(body);
  return body;
}

class SignInModal extends Modal {
  constructor(app, plugin) {
    super(app);
    this.plugin = plugin;
    this.email = '';
    this.password = '';
    this.busy = false;
  }

  onOpen() {
    this.setTitle('登录 shizuki.site');
    this.contentEl.createEl('p', { text: '密码仅用于本次登录请求，不会写入 Vault 或插件设置。' });
    new Setting(this.contentEl)
      .setName('邮箱')
      .addText((text) => text
        .setPlaceholder('you@example.com')
        .onChange((value) => { this.email = value; }));
    new Setting(this.contentEl)
      .setName('密码')
      .addText((text) => {
        text.inputEl.type = 'password';
        text.setPlaceholder('网站登录密码').onChange((value) => { this.password = value; });
      });
    const actions = new Setting(this.contentEl);
    actions.addButton((button) => button.setButtonText('登录').setCta().onClick(async () => {
      if (this.busy) return;
      if (!this.email.trim() || !this.password) {
        new Notice('请输入邮箱和密码');
        return;
      }
      this.busy = true;
      button.setDisabled(true).setButtonText('登录中…');
      try {
        const account = await this.plugin.api.signIn(this.email, this.password);
        this.password = '';
        const name = account?.nickname || account?.email || account?.userId || '当前账户';
        new Notice(`已登录：${name}`);
        if (!this.plugin.api.isSecureStorageAvailable()) {
          new Notice('SecretStorage 加密不可用：本次登录仅在当前 Obsidian 会话中有效', 8000);
        }
        this.close();
        this.plugin.settingTab?.display();
      } catch (error) {
        this.password = '';
        new Notice(`登录失败：${error.message}`, 8000);
      } finally {
        this.busy = false;
        button.setDisabled(false).setButtonText('登录');
      }
    }));
  }

  onClose() {
    this.email = '';
    this.password = '';
    this.contentEl.empty();
  }
}

class ConfirmPublishModal extends Modal {
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
    this.setTitle('确认公开发布');
    this.contentEl.createEl('p', {
      text: `“${this.noteTitle}”将先上传最新内容，再公开发布到 shizuki.site。`
    });
    const actions = new Setting(this.contentEl);
    actions.addButton((button) => button.setButtonText('取消').onClick(() => this.finish(false)));
    actions.addButton((button) => button.setButtonText('上传并发布').setCta().onClick(() => this.finish(true)));
  }

  onClose() {
    if (!this.settled) {
      this.settled = true;
      this.resolve?.(false);
    }
    this.contentEl.empty();
  }
}

class PayloadPreviewModal extends Modal {
  constructor(app, preview) {
    super(app);
    this.preview = preview;
  }

  onOpen() {
    this.setTitle('Shizuki 发布载荷预览');
    this.contentEl.createEl('p', {
      text: `本地图片 ${this.preview.embedCount} 个；此预览不会登录、上传或发布。`
    });
    this.contentEl.createEl('pre', {
      cls: 'shizuki-publisher-preview',
      text: JSON.stringify(this.preview.payload, null, 2).slice(0, 12000)
    });
  }

  onClose() {
    this.contentEl.empty();
  }
}

class BackgroundChooserModal extends FuzzySuggestModal {
  constructor(app, plugin) {
    super(app);
    this.plugin = plugin;
    this.setPlaceholder(`选择 ${BACKGROUND_FOLDER} 中的背景图片`);
  }

  getItems() {
    return this.app.vault.getFiles().filter((file) => {
      const path = file.path.replace(/\\/g, '/');
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
    new Notice(`背景已切换：${file.name}`);
  }
}

class ShizukiPublisherSettingTab extends PluginSettingTab {
  constructor(app, plugin) {
    super(app, plugin);
    this.plugin = plugin;
  }

  display() {
    const { containerEl } = this;
    containerEl.empty();
    containerEl.createEl('h2', { text: 'Shizuki Site Publisher' });

    new Setting(containerEl)
      .setName('网站地址')
      .setDesc('发布 API 所在的网站根地址')
      .addText((text) => text.setValue(this.plugin.settings.siteUrl).onChange(async (value) => {
        this.plugin.settings.siteUrl = value.trim();
        await this.plugin.saveSettings();
      }));

    new Setting(containerEl)
      .setName('默认分类')
      .setDesc('笔记没有 category frontmatter 时使用')
      .addText((text) => text.setValue(this.plugin.settings.defaultCategoryCode).onChange(async (value) => {
        this.plugin.settings.defaultCategoryCode = value.trim() || 'life';
        await this.plugin.saveSettings();
      }));

    new Setting(containerEl)
      .setName('默认可见性')
      .addDropdown((dropdown) => dropdown
        .addOption('PUBLIC', '公开')
        .addOption('UNLISTED', '不列出')
        .addOption('PRIVATE', '私密')
        .setValue(this.plugin.settings.defaultVisibility)
        .onChange(async (value) => {
          this.plugin.settings.defaultVisibility = value;
          await this.plugin.saveSettings();
        }));

    const accountLabel = this.plugin.api.account
      ? String(this.plugin.api.account.nickname || this.plugin.api.account.email || this.plugin.api.account.userId || '已登录')
      : this.plugin.api.refreshToken
        ? '已有安全会话（下次请求自动刷新）'
        : '未登录';
    new Setting(containerEl)
      .setName('网站账户')
      .setDesc(accountLabel)
      .addButton((button) => button.setButtonText('登录').onClick(() => new SignInModal(this.app, this.plugin).open()))
      .addButton((button) => button.setButtonText('退出').setWarning().onClick(async () => {
        await this.plugin.api.signOut();
        new Notice('已退出 shizuki.site');
        this.display();
      }));

    new Setting(containerEl)
      .setName('Draw.io 编辑器')
      .setDesc('与 shizuki.site 白板共用的 diagrams.net 地址')
      .addText((text) => text.setValue(this.plugin.settings.editorUrl).onChange(async (value) => {
        this.plugin.settings.editorUrl = value.trim() || DEFAULT_SETTINGS.editorUrl;
        await this.plugin.saveSettings();
      }))
      .addButton((button) => button.setButtonText('检查连接').onClick(() => this.plugin.checkDrawioConnection()));

    new Setting(containerEl)
      .setName('Vault 背景')
      .setDesc(this.plugin.settings.backgroundPath || '当前使用中性暗色渐变')
      .addButton((button) => button.setButtonText('选择图片').onClick(() => this.plugin.openBackgroundChooser()))
      .addButton((button) => button.setButtonText('清除').onClick(() => this.plugin.clearBackground()));

    containerEl.createEl('p', {
      cls: 'setting-item-description',
      text: `支持 ${BACKGROUND_FOLDER} 下的 PNG、JPEG、WebP、GIF。登录令牌不会写入此设置页对应的 data.json。`
    });
  }
}

class ShizukiSitePublisherPlugin extends Plugin {
  async onload() {
    await this.loadSettings();
    this.api = new ShizukiApiClient(this);
    this.api.loadStoredRefreshToken();
    this.settingTab = new ShizukiPublisherSettingTab(this.app, this);
    this.addSettingTab(this.settingTab);
    this.registerCommands();
    this.addRibbonIcon('upload', '上传当前笔记到 shizuki.site', () => this.uploadActiveNote(false));
    this.applyBackground();
  }

  onunload() {
    document.body.classList.remove('shizuki-dark-vault', 'shizuki-background-enabled');
    document.body.style.removeProperty('--shizuki-background-image');
    if (this.api) {
      this.api.accessToken = '';
      this.api.refreshToken = '';
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
  }

  registerCommands() {
    this.addCommand({
      id: 'sign-in',
      name: '登录网站',
      callback: () => new SignInModal(this.app, this).open()
    });
    this.addCommand({
      id: 'upload-active-note',
      name: '上传当前笔记为草稿',
      checkCallback: (checking) => this.activeNoteCommand(checking, () => this.uploadActiveNote(false))
    });
    this.addCommand({
      id: 'publish-active-note',
      name: '发布当前笔记',
      checkCallback: (checking) => this.activeNoteCommand(checking, () => this.publishActiveNote())
    });
    this.addCommand({
      id: 'preview-payload',
      name: '预览发布载荷',
      checkCallback: (checking) => this.activeNoteCommand(checking, () => this.previewActivePayload())
    });
    this.addCommand({
      id: 'choose-background',
      name: '选择背景图片',
      callback: () => this.openBackgroundChooser()
    });
    this.addCommand({
      id: 'clear-background',
      name: '清除背景图片',
      callback: () => this.clearBackground()
    });
    this.addCommand({
      id: 'check-drawio',
      name: '检查 Draw.io 连接',
      callback: () => this.checkDrawioConnection()
    });
    this.addCommand({
      id: 'sign-out',
      name: '退出登录',
      callback: async () => {
        await this.api.signOut();
        new Notice('已退出 shizuki.site');
      }
    });
  }

  activeNoteCommand(checking, callback) {
    const file = this.app.workspace.getActiveFile();
    const available = file instanceof TFile && file.extension === 'md' && !this.isProtectedSource(file);
    if (!checking && available) callback();
    return available;
  }

  isProtectedSource(file) {
    return file.path.replace(/\\/g, '/').toLowerCase().startsWith('00_notion_raw/');
  }

  getActiveMarkdownFile() {
    const file = this.app.workspace.getActiveFile();
    if (!(file instanceof TFile) || file.extension !== 'md') {
      throw new Error('请先打开一个 Markdown 笔记');
    }
    if (this.isProtectedSource(file)) {
      throw new Error('00_Notion_Raw 是只读迁移源，不能直接发布');
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
      const context = await this.buildActiveContext();
      const embeds = core.discoverVisualEmbeds(context.payload.markdown);
      new PayloadPreviewModal(this.app, {
        payload: { postId: context.postId, ...context.payload },
        embedCount: embeds.length
      }).open();
    } catch (error) {
      new Notice(error.message, 7000);
    }
  }

  async uploadActiveNote(publishAfterUpload) {
    const progress = new Notice('Shizuki：准备发布载荷…', 0);
    try {
      const context = await this.buildActiveContext();
      await this.api.requireAccessToken();
      progress.setMessage('Shizuki：处理本地图片与 Draw.io…');
      const markdown = await this.prepareVisualAssets(context.file, context.payload.markdown, (current, total) => {
        progress.setMessage(`Shizuki：上传图片 ${current}/${total}…`);
      });
      const payload = { ...context.payload, markdown };
      progress.setMessage(context.postId ? 'Shizuki：更新远端草稿…' : 'Shizuki：创建远端草稿…');
      const post = context.postId
        ? await this.api.rawRequest(`/api/v1/me/posts/${context.postId}`, { method: 'PUT', auth: true, body: payload })
        : await this.api.rawRequest('/api/v1/me/posts', { method: 'POST', auth: true, body: payload });
      const postId = Number(post?.postId ?? post?.post_id ?? context.postId);
      if (!Number.isInteger(postId) || postId <= 0) throw new Error('网站没有返回有效 postId');
      await this.updateSyncFrontmatter(context.file, {
        postId,
        status: String(post?.statusCode || post?.status_code || 'DRAFT'),
        published: false
      });
      if (publishAfterUpload) {
        progress.setMessage('Shizuki：公开发布文章…');
        const published = await this.api.rawRequest(`/api/v1/me/posts/${postId}/publish`, {
          method: 'POST',
          auth: true
        });
        await this.updateSyncFrontmatter(context.file, {
          postId,
          status: String(published?.statusCode || published?.status_code || 'PUBLISHED'),
          published: true
        });
      }
      progress.hide();
      new Notice(publishAfterUpload ? '已发布到 shizuki.site' : '草稿已上传到 shizuki.site', 6000);
      return postId;
    } catch (error) {
      progress.hide();
      new Notice(`Shizuki 发布失败：${error.message}`, 10000);
      throw error;
    }
  }

  async publishActiveNote() {
    try {
      const context = await this.buildActiveContext();
      const confirmed = await new ConfirmPublishModal(this.app, context.payload.title).wait();
      if (!confirmed) return;
      await this.uploadActiveNote(true);
    } catch (error) {
      if (!(error instanceof ApiError)) new Notice(error.message, 7000);
    }
  }

  async updateSyncFrontmatter(file, { postId, status, published }) {
    const timestamp = new Date().toISOString();
    await this.app.fileManager.processFrontMatter(file, (frontmatter) => {
      frontmatter.shizuki_post_id = postId;
      frontmatter.shizuki_sync_status = status;
      frontmatter.shizuki_synced_at = timestamp;
      if (published) frontmatter.shizuki_published_at = timestamp;
    });
  }

  resolveEmbedFile(target, sourcePath) {
    let linkPath = String(target || '').split('#')[0].split('?')[0].replace(/^<|>$/g, '');
    try {
      linkPath = decodeURIComponent(linkPath);
    } catch {
      // Keep the original path when it is not valid percent encoding.
    }
    linkPath = normalizePath(linkPath.replace(/^\.\//, ''));
    const resolved = this.app.metadataCache.getFirstLinkpathDest(linkPath, sourcePath);
    if (resolved instanceof TFile) return resolved;
    const direct = this.app.vault.getAbstractFileByPath(linkPath);
    return direct instanceof TFile ? direct : null;
  }

  async prepareVisualAssets(sourceFile, markdown, onProgress) {
    const uploadedByPath = new Map();
    return core.rewriteVisualEmbeds(markdown, async (embed) => {
      const file = this.resolveEmbedFile(embed.target, sourceFile.path);
      if (!file) throw new Error(`找不到本地图片：${embed.target}`);
      let publicUrl = uploadedByPath.get(file.path);
      if (!publicUrl) {
        const visual = file.name.toLowerCase().endsWith('.drawio.svg')
          ? await this.rasterizeDrawio(file)
          : await this.readImageAsset(file);
        publicUrl = await this.uploadVisualAsset(visual);
        uploadedByPath.set(file.path, publicUrl);
      }
      return publicUrl;
    }, onProgress);
  }

  async readImageAsset(file) {
    const extension = file.extension.toLowerCase();
    const contentTypes = {
      png: 'image/png',
      jpg: 'image/jpeg',
      jpeg: 'image/jpeg',
      webp: 'image/webp',
      gif: 'image/gif'
    };
    const contentType = contentTypes[extension];
    if (!contentType) throw new Error(`不支持的图片类型：${file.name}`);
    const bytes = await this.app.vault.readBinary(file);
    if (bytes.byteLength > MAX_IMAGE_BYTES) throw new Error(`图片超过 8MB：${file.name}`);
    return { bytes, contentType, fileName: safeUploadName(file.basename, extension) };
  }

  async rasterizeDrawio(file) {
    const source = await this.app.vault.readBinary(file);
    const blob = new Blob([source], { type: 'image/svg+xml' });
    const objectUrl = URL.createObjectURL(blob);
    try {
      const image = await loadImage(objectUrl);
      const sourceWidth = Math.max(1, image.naturalWidth || image.width || 1600);
      const sourceHeight = Math.max(1, image.naturalHeight || image.height || 900);
      const scale = Math.min(1, 2400 / Math.max(sourceWidth, sourceHeight));
      const canvas = document.createElement('canvas');
      canvas.width = Math.max(1, Math.round(sourceWidth * scale));
      canvas.height = Math.max(1, Math.round(sourceHeight * scale));
      const context = canvas.getContext('2d');
      if (!context) throw new Error('Canvas 不可用');
      context.fillStyle = '#111318';
      context.fillRect(0, 0, canvas.width, canvas.height);
      context.drawImage(image, 0, 0, canvas.width, canvas.height);
      const pngBlob = await canvasToBlob(canvas, 'image/png');
      const bytes = await pngBlob.arrayBuffer();
      if (bytes.byteLength > MAX_IMAGE_BYTES) throw new Error(`Draw.io PNG 超过 8MB：${file.name}`);
      return {
        bytes,
        contentType: 'image/png',
        fileName: safeUploadName(file.basename.replace(/\.drawio$/i, ''), 'png')
      };
    } catch (error) {
      throw new Error(`无法转换 Draw.io 图表 ${file.name}：${error.message}`);
    } finally {
      URL.revokeObjectURL(objectUrl);
    }
  }

  async uploadVisualAsset(file) {
    const policy = await this.api.rawRequest('/api/v1/assets/upload-policies', {
      method: 'POST',
      auth: true,
      body: {
        fileName: file.fileName,
        contentType: file.contentType,
        assetKind: 'STATIC_IMAGE',
        visibility: 'PUBLIC'
      }
    });
    let bucket = String(policy?.bucket || '');
    let key = String(policy?.key || '');
    const uploadUrl = String(policy?.uploadUrl || policy?.upload_url || '');
    let uploadContentType = file.contentType;
    if (!bucket || !key || !uploadUrl) throw new Error('网站返回的上传策略无效');

    let directUploaded = false;
    try {
      const response = await requestUrl({
        url: uploadUrl,
        method: 'PUT',
        headers: { 'Content-Type': file.contentType },
        body: toArrayBuffer(file.bytes),
        throw: false
      });
      directUploaded = response.status >= 200 && response.status < 300;
    } catch {
      directUploaded = false;
    }

    if (!directUploaded) {
      const multipart = buildMultipartBody({ asset_kind: 'STATIC_IMAGE', visibility: 'PUBLIC' }, file);
      const relay = await this.api.rawRequest('/api/v1/assets/upload-relay', {
        method: 'POST',
        auth: true,
        headers: { 'Content-Type': multipart.contentType },
        body: multipart.body
      });
      bucket = String(relay?.bucket || '');
      key = String(relay?.key || '');
      uploadContentType = String(relay?.contentType || relay?.content_type || file.contentType);
      if (!bucket || !key) throw new Error(`图片上传失败：${file.fileName}`);
    }

    const created = await this.api.rawRequest('/api/v1/assets', {
      method: 'POST',
      auth: true,
      body: {
        bucket,
        key,
        assetType: 'image',
        assetKind: 'STATIC_IMAGE',
        contentType: uploadContentType,
        visibility: 'PUBLIC',
        metadata: { usage: 'blog_post_inline', source: 'obsidian' }
      }
    });
    const assetId = Number(created?.assetId ?? created?.asset_id);
    if (!Number.isInteger(assetId) || assetId <= 0) throw new Error('创建图片资产失败');
    const download = await this.api.rawRequest(`/api/v1/assets/${assetId}/download-url`, { auth: true });
    const publicUrl = String(
      download?.publicUrl || download?.public_url || download?.downloadUrl || download?.download_url || ''
    ).trim();
    if (!publicUrl) throw new Error('网站没有返回图片公开地址');
    return publicUrl;
  }

  openBackgroundChooser() {
    const items = this.app.vault.getFiles().filter((file) => (
      file.path.startsWith(`${BACKGROUND_FOLDER}/`)
      && core.SUPPORTED_IMAGE_EXTENSIONS.has(file.extension.toLowerCase())
    ));
    if (!items.length) {
      new Notice(`请先把背景图片放入 ${BACKGROUND_FOLDER}`, 7000);
      return;
    }
    new BackgroundChooserModal(this.app, this).open();
  }

  async clearBackground() {
    this.settings.backgroundPath = '';
    await this.saveSettings();
    this.applyBackground();
    new Notice('已恢复中性暗色背景');
  }

  applyBackground() {
    document.body.classList.add('shizuki-dark-vault');
    const selected = this.settings.backgroundPath
      ? this.app.vault.getAbstractFileByPath(normalizePath(this.settings.backgroundPath))
      : null;
    if (selected instanceof TFile && core.SUPPORTED_IMAGE_EXTENSIONS.has(selected.extension.toLowerCase())) {
      const resourceUrl = this.app.vault.getResourcePath(selected).replace(/"/g, '%22');
      document.body.style.setProperty('--shizuki-background-image', `url("${resourceUrl}")`);
      document.body.classList.add('shizuki-background-enabled');
    } else {
      document.body.style.removeProperty('--shizuki-background-image');
      document.body.classList.remove('shizuki-background-enabled');
    }
  }

  async checkDrawioConnection() {
    const url = core.buildDrawioEditorUrl(this.settings.editorUrl, 'dark');
    try {
      const response = await requestUrl({ url, method: 'GET', throw: false });
      if (response.status < 200 || response.status >= 400) {
        throw new Error(`HTTP ${response.status}`);
      }
      new Notice('Draw.io 已连接到 shizuki.site 共用的 diagrams.net 编辑器');
      return true;
    } catch (error) {
      new Notice(`Draw.io 编辑器不可用：${error.message}`, 10000);
      return false;
    }
  }
}

function safeUploadName(baseName, extension) {
  const base = String(baseName || 'blog-inline')
    .normalize('NFKD')
    .replace(/[^a-zA-Z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '')
    .toLowerCase() || 'blog-inline';
  return `${base.slice(0, 80)}.${String(extension).replace(/^\./, '').toLowerCase()}`;
}

function loadImage(url) {
  return new Promise((resolve, reject) => {
    const image = new Image();
    image.onload = () => resolve(image);
    image.onerror = () => reject(new Error('SVG 图像无法载入'));
    image.src = url;
  });
}

function canvasToBlob(canvas, type) {
  return new Promise((resolve, reject) => {
    canvas.toBlob((blob) => blob ? resolve(blob) : reject(new Error('PNG 编码失败')), type);
  });
}

module.exports = ShizukiSitePublisherPlugin;
module.exports._test = {
  ApiError,
  ShizukiApiClient,
  buildMultipartBody,
  concatBytes,
  safeUploadName
};
