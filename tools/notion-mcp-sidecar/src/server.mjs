import { createServer } from "node:http";
import { readFile } from "node:fs/promises";
import process from "node:process";
import YAML from "yaml";
import { z } from "zod";
import { McpServer } from "@modelcontextprotocol/sdk/server/mcp.js";
import { StreamableHTTPServerTransport } from "@modelcontextprotocol/sdk/server/streamableHttp.js";

const PORT = parseInteger(process.env.PORT, 39051);
const ENDPOINT_PATH = normalizePath(process.env.NOTION_MCP_ENDPOINT_PATH || "/mcp/notion");
const HEALTH_PATH = normalizePath(process.env.NOTION_MCP_HEALTH_PATH || "/healthz");
const CONFIG_FILE = (process.env.NOTION_MCP_CONFIG_FILE || "/app/resouces/yaml/common-config.yaml").trim();
const SERVER_TOKEN = (process.env.NOTION_MCP_SERVER_TOKEN || "").trim();
const PREFERRED_SOURCE = normalizeSource(process.env.NOTION_MCP_PREFERRED_SOURCE || "blog");

function createMcpServer(runtimeConfig, notionClient) {
  const server = new McpServer({
    name: "shizuki-notion",
    version: "0.2.0",
  });

  server.tool(
    "notion_workspace_info",
    "Return the current Notion workspace identity and the configured shizuki-site Notion sources.",
    {},
    async () => {
      const me = await notionClient.fetchMe();
      return formatToolResult({
        workspace: me.workspace_name || null,
        workspace_id: me.workspace_id || null,
        workspace_icon: me.workspace_icon || null,
        user_id: me.id || null,
        user_name: me.name || null,
        user_type: me.type || null,
        configured_sources: runtimeConfig.meta.configuredSources,
        selected_token_source: runtimeConfig.meta.selectedTokenSource,
        endpoint_path: ENDPOINT_PATH,
      });
    }
  );

  server.tool(
    "notion_search_pages",
    "Search Notion pages by title or body keywords across the workspace that this server-side token can access.",
    {
      query: z.string().min(1).max(200),
      page_size: z.number().int().min(1).max(20).optional(),
      include_archived: z.boolean().optional(),
    },
    async ({ query, page_size, include_archived }) => {
      const pages = await notionClient.searchPages(query, page_size || 10, Boolean(include_archived));
      return formatToolResult({
        query,
        count: pages.length,
        pages,
      });
    }
  );

  server.tool(
    "notion_get_page",
    "Fetch a Notion page by page id or Notion URL and optionally include recursive block content.",
    {
      page_id_or_url: z.string().min(1),
      include_blocks: z.boolean().optional(),
      recursive: z.boolean().optional(),
      include_child_pages: z.boolean().optional(),
    },
    async ({ page_id_or_url, include_blocks, recursive, include_child_pages }) => {
      const pageId = normalizeNotionId(page_id_or_url);
      const page = await notionClient.getPage(pageId);
      const childPages = include_child_pages === false ? [] : await notionClient.listChildPages(pageId);
      const blocks = include_blocks === false ? [] : await notionClient.listBlockChildren(pageId, recursive !== false);
      return formatToolResult({
        page: summarizePage(page),
        simplified_properties: simplifyProperties(page.properties),
        child_pages: childPages,
        markdown: blocksToMarkdown(blocks),
        plain_text: blocksToPlainText(blocks),
        blocks,
      });
    }
  );

  server.tool(
    "notion_list_child_pages",
    "List the direct child pages under a given Notion page.",
    {
      page_id_or_url: z.string().min(1),
      include_archived: z.boolean().optional(),
    },
    async ({ page_id_or_url, include_archived }) => {
      const pageId = normalizeNotionId(page_id_or_url);
      const children = await notionClient.listChildPages(pageId);
      const visibleChildren = Boolean(include_archived)
        ? children
        : children.filter((item) => !item.in_trash);
      return formatToolResult({
        parent_page_id: pageId,
        count: visibleChildren.length,
        pages: visibleChildren,
      });
    }
  );

  server.tool(
    "notion_list_workspace_pages",
    "List top-level Notion pages whose parent is the workspace. This is useful for PAT-backed personal libraries that should resemble the Notion sidebar root.",
    {
      page_size: z.number().int().min(1).max(100).optional(),
      include_archived: z.boolean().optional(),
      title_contains: z.string().max(200).optional(),
    },
    async ({ page_size, include_archived, title_contains }) => {
      const pages = await notionClient.listWorkspacePages(
        page_size || 50,
        Boolean(include_archived),
        title_contains
      );
      return formatToolResult({
        count: pages.length,
        pages,
      });
    }
  );

  server.tool(
    "notion_query_configured_database",
    "Query a configured shizuki-site Notion data source. Use scope=blog for the blog data source or scope=task for the light-app task data source.",
    {
      scope: z.enum(["blog", "task"]),
      page_size: z.number().int().min(1).max(50).optional(),
      include_archived: z.boolean().optional(),
      title_contains: z.string().max(200).optional(),
    },
    async ({ scope, page_size, include_archived, title_contains }) => {
      const pages = await notionClient.queryConfiguredDataSource(
        scope,
        page_size || 20,
        Boolean(include_archived)
      );
      const filtered = title_contains
        ? pages.filter((page) => resolvePageTitle(page.properties).toLowerCase().includes(title_contains.toLowerCase()))
        : pages;
      return formatToolResult({
        scope,
        configured_data_source_id: runtimeConfig.sources[scope]?.dataSourceId || null,
        count: filtered.length,
        pages: filtered.map((page) => ({
          ...summarizePage(page),
          simplified_properties: simplifyProperties(page.properties),
        })),
      });
    }
  );

  server.tool(
    "notion_create_page",
    "Create a new Notion page under a parent page. If parent_page_id_or_url is omitted, the configured root page for the selected scope is used.",
    {
      title: z.string().min(1).max(200),
      parent_page_id_or_url: z.string().min(1).optional(),
      scope: z.enum(["blog", "task"]).optional(),
      markdown: z.string().max(50000).optional(),
    },
    async ({ title, parent_page_id_or_url, scope, markdown }) => {
      const selectedScope = resolveWriteScope(runtimeConfig, scope);
      const parentPageId = parent_page_id_or_url
        ? normalizeNotionId(parent_page_id_or_url)
        : resolveDefaultParentPageId(runtimeConfig, selectedScope);
      const blocks = markdownToNotionBlocks(markdown || "");
      const page = await notionClient.createPageUnderPage(parentPageId, title, blocks);
      return formatToolResult({
        scope: selectedScope,
        parent_page_id: parentPageId,
        appended_block_count: blocks.length,
        page: summarizePage(page),
      });
    }
  );

  server.tool(
    "notion_append_page_markdown",
    "Append Markdown content to an existing Notion page.",
    {
      page_id_or_url: z.string().min(1),
      markdown: z.string().min(1).max(50000),
    },
    async ({ page_id_or_url, markdown }) => {
      const pageId = normalizeNotionId(page_id_or_url);
      const blocks = markdownToNotionBlocks(markdown);
      if (blocks.length === 0) {
        throw new Error("No writable Markdown content was produced");
      }
      const appendedBlocks = await notionClient.appendBlockChildren(pageId, blocks);
      return formatToolResult({
        page_id: pageId,
        appended_block_count: appendedBlocks.length,
        blocks: appendedBlocks.map(summarizeWrittenBlock),
      });
    }
  );

  server.tool(
    "notion_replace_page_markdown",
    "Replace an existing Notion page body with new Markdown content.",
    {
      page_id_or_url: z.string().min(1),
      markdown: z.string().max(50000),
    },
    async ({ page_id_or_url, markdown }) => {
      const pageId = normalizeNotionId(page_id_or_url);
      const blocks = markdownToNotionBlocks(markdown || "");
      const page = await notionClient.replacePageContent(pageId, blocks);
      return formatToolResult({
        page: summarizePage(page),
        appended_block_count: blocks.length,
      });
    }
  );

  server.tool(
    "notion_update_page",
    "Update a Notion page title or page flags such as lock, trash, or erase_content.",
    {
      page_id_or_url: z.string().min(1),
      title: z.string().min(1).max(200).optional(),
      is_locked: z.boolean().optional(),
      in_trash: z.boolean().optional(),
      erase_content: z.boolean().optional(),
    },
    async ({ page_id_or_url, title, is_locked, in_trash, erase_content }) => {
      if (
        title == null &&
        typeof is_locked !== "boolean" &&
        typeof in_trash !== "boolean" &&
        typeof erase_content !== "boolean"
      ) {
        throw new Error("At least one page field must be provided");
      }

      const pageId = normalizeNotionId(page_id_or_url);
      const currentPage = title ? await notionClient.getPage(pageId) : null;
      const properties = title ? buildTitlePropertyUpdate(currentPage, title) : undefined;
      const updatedPage = await notionClient.updatePage(pageId, {
        properties,
        is_locked,
        in_trash,
        erase_content,
      });

      return formatToolResult({
        page: summarizePage(updatedPage),
        simplified_properties: simplifyProperties(updatedPage.properties),
      });
    }
  );

  return server;
}

async function loadRuntimeConfig() {
  if (!SERVER_TOKEN) {
    throw new Error("NOTION_MCP_SERVER_TOKEN is required");
  }

  const configDocument = await loadYamlDocument(CONFIG_FILE);
  const blogConfig = readNested(configDocument, ["shizuki", "blog", "notion"]);
  const taskConfig = readNested(configDocument, ["shizuki", "light-app", "task", "notion"]);

  const blogSource = normalizeSourceConfig("blog", blogConfig);
  const taskSource = normalizeSourceConfig("task", taskConfig);
  const preferredSource = PREFERRED_SOURCE === "task" ? taskSource : blogSource;
  const fallbackSource = PREFERRED_SOURCE === "task" ? blogSource : taskSource;
  const selectedSource = preferredSource.token ? preferredSource : fallbackSource;

  if (!selectedSource.token) {
    throw new Error("No usable Notion token was found in common-config.yaml");
  }

  return {
    notion: {
      token: selectedSource.token,
      apiBaseUrl: selectedSource.apiBaseUrl || "https://api.notion.com/v1",
      version: selectedSource.version || "2026-03-11",
      rateLimitPerSecond: selectedSource.rateLimitPerSecond || 2,
      blogDataSourceId: blogSource.dataSourceId || "",
      blogRootPageId: blogSource.rootPageId || "",
      taskDataSourceId: taskSource.dataSourceId || "",
    },
    sources: {
      blog: blogSource,
      task: taskSource,
    },
    meta: {
      preferredSource: PREFERRED_SOURCE,
      selectedTokenSource: selectedSource.name,
      configuredSources: {
        blog: {
          enabled: blogSource.enabled,
          has_token: Boolean(blogSource.token),
          data_source_id: blogSource.dataSourceId || null,
          root_page_id: blogSource.rootPageId || null,
          mode: blogSource.mode || null,
        },
        task: {
          enabled: taskSource.enabled,
          has_token: Boolean(taskSource.token),
          data_source_id: taskSource.dataSourceId || null,
          root_page_id: taskSource.rootPageId || null,
          mode: taskSource.mode || null,
        },
      },
    },
  };
}

async function loadYamlDocument(filePath) {
  const raw = await readFile(filePath, "utf8");
  return YAML.parse(raw) || {};
}

function normalizeSourceConfig(name, rawConfig) {
  const config = rawConfig && typeof rawConfig === "object" ? rawConfig : {};
  const envPrefix = name === "task" ? "NOTION_MCP_TASK_" : "NOTION_MCP_BLOG_";
  return {
    name,
    enabled: readBooleanOverride(`${envPrefix}ENABLED`, Boolean(config.enabled)),
    token: cleanConfigValue(process.env[`${envPrefix}TOKEN`] || process.env.NOTION_MCP_NOTION_TOKEN || config.token),
    mode: cleanConfigValue(process.env[`${envPrefix}MODE`] || config.mode),
    dataSourceId: cleanConfigValue(
      process.env[`${envPrefix}DATA_SOURCE_ID`] || config["data-source-id"] || config.dataSourceId
    ),
    rootPageId: cleanConfigValue(
      process.env[`${envPrefix}ROOT_PAGE_ID`] || config["root-page-id"] || config.rootPageId
    ),
    version: cleanConfigValue(process.env[`${envPrefix}VERSION`] || process.env.NOTION_MCP_NOTION_VERSION || config.version),
    apiBaseUrl: cleanConfigValue(
      process.env[`${envPrefix}API_BASE_URL`] || process.env.NOTION_MCP_API_BASE_URL || config["api-base-url"] || config.apiBaseUrl
    ),
    rateLimitPerSecond: parseInteger(
      process.env[`${envPrefix}RATE_LIMIT_PER_SECOND`] || process.env.NOTION_MCP_RATE_LIMIT_PER_SECOND || config["rate-limit-per-second"] || config.rateLimitPerSecond,
      2
    ),
  };
}

class NotionApiClient {
  constructor(config) {
    this.config = config;
    this.lastRequestAt = 0;
  }

  async fetchMe() {
    return this.request("GET", "/users/me");
  }

  async searchPages(query, pageSize, includeArchived) {
    const results = [];
    let nextCursor = null;
    do {
      const body = {
        page_size: pageSize,
        sort: {
          timestamp: "last_edited_time",
          direction: "descending",
        },
        filter: {
          property: "object",
          value: "page",
        },
      };
      if (typeof query === "string" && query.trim() !== "") {
        body.query = query;
      }
      if (nextCursor) {
        body.start_cursor = nextCursor;
      }
      const payload = await this.request("POST", "/search", body);
      const items = Array.isArray(payload.results) ? payload.results : [];
      for (const item of items) {
        if (!includeArchived && item.in_trash) {
          continue;
        }
        results.push(summarizePage(item));
      }
      nextCursor = payload.next_cursor || null;
      if (results.length >= pageSize) {
        break;
      }
    } while (nextCursor);
    return results.slice(0, pageSize);
  }

  async listWorkspacePages(pageSize, includeArchived, titleContains) {
    const results = [];
    let nextCursor = null;
    const normalizedTitleFilter = String(titleContains || "").trim().toLowerCase();
    do {
      const body = {
        page_size: Math.min(pageSize, 100),
        sort: {
          timestamp: "last_edited_time",
          direction: "descending",
        },
        filter: {
          property: "object",
          value: "page",
        },
      };
      if (nextCursor) {
        body.start_cursor = nextCursor;
      }
      const payload = await this.request("POST", "/search", body);
      const items = Array.isArray(payload.results) ? payload.results : [];
      for (const item of items) {
        if (!isWorkspaceTopLevelPage(item)) {
          continue;
        }
        if (!includeArchived && item.in_trash) {
          continue;
        }
        if (
          normalizedTitleFilter &&
          !resolvePageTitle(item.properties).toLowerCase().includes(normalizedTitleFilter)
        ) {
          continue;
        }
        results.push(summarizePage(item));
        if (results.length >= pageSize) {
          break;
        }
      }
      nextCursor = payload.next_cursor || null;
    } while (nextCursor && results.length < pageSize);
    return results.slice(0, pageSize);
  }

  async getPage(pageId) {
    return this.request("GET", `/pages/${pageId}`);
  }

  async listChildPages(pageId) {
    const blocks = await this.listBlockChildren(pageId, false);
    const pages = [];
    for (const block of blocks) {
      if (block.type !== "child_page") {
        continue;
      }
      pages.push({
        page_id: block.id,
        title: block.child_page?.title || "",
        in_trash: Boolean(block.in_trash),
        last_edited_time: block.last_edited_time || null,
        url: block.url || null,
      });
    }
    return pages;
  }

  async listBlockChildren(blockId, recursive) {
    const items = [];
    let nextCursor = null;
    do {
      const query = new URLSearchParams({ page_size: "100" });
      if (nextCursor) {
        query.set("start_cursor", nextCursor);
      }
      const payload = await this.request("GET", `/blocks/${blockId}/children?${query.toString()}`);
      const results = Array.isArray(payload.results) ? payload.results : [];
      for (const block of results) {
        const mutableBlock = { ...block };
        if (recursive && block.has_children && isSupportedNestedBlock(block.type)) {
          const typedBlock = block[block.type] && typeof block[block.type] === "object" ? { ...block[block.type] } : {};
          typedBlock.children = await this.listBlockChildren(block.id, true);
          mutableBlock[block.type] = typedBlock;
        }
        items.push(mutableBlock);
      }
      nextCursor = payload.next_cursor || null;
    } while (nextCursor);
    return items;
  }

  async queryConfiguredDataSource(scope, pageSize, includeArchived) {
    const dataSourceId = scope === "task" ? this.config.taskDataSourceId : this.config.blogDataSourceId;
    if (!dataSourceId) {
      throw new Error(`Configured ${scope} Notion data source is unavailable`);
    }
    const pages = [];
    let nextCursor = null;
    do {
      const body = {
        page_size: pageSize,
        result_type: "page",
      };
      if (includeArchived) {
        body.in_trash = true;
      }
      if (nextCursor) {
        body.start_cursor = nextCursor;
      }
      const payload = await this.request("POST", `/data_sources/${dataSourceId}/query`, body);
      const items = Array.isArray(payload.results) ? payload.results : [];
      for (const item of items) {
        if (!includeArchived && item.in_trash) {
          continue;
        }
        pages.push(item);
      }
      nextCursor = payload.next_cursor || null;
      if (pages.length >= pageSize) {
        break;
      }
    } while (nextCursor);
    return pages.slice(0, pageSize);
  }

  async createPageUnderPage(parentPageId, title, children) {
    const body = {
      parent: {
        page_id: parentPageId,
      },
      properties: {
        title: {
          title: buildRichText(title),
        },
      },
    };
    if (children.length > 0) {
      body.children = children.slice(0, MAX_BLOCKS_PER_WRITE_REQUEST);
    }
    const page = await this.request("POST", "/pages", body);
    if (children.length > MAX_BLOCKS_PER_WRITE_REQUEST) {
      await this.appendBlockChildren(page.id, children.slice(MAX_BLOCKS_PER_WRITE_REQUEST));
    }
    return page;
  }

  async appendBlockChildren(blockId, children) {
    const appended = [];
    for (const chunk of chunkArray(children, MAX_BLOCKS_PER_WRITE_REQUEST)) {
      const payload = await this.request("PATCH", `/blocks/${blockId}/children`, {
        children: chunk,
      });
      if (Array.isArray(payload.results)) {
        appended.push(...payload.results);
      }
    }
    return appended;
  }

  async updatePage(pageId, updates) {
    const body = {};
    if (updates.properties && Object.keys(updates.properties).length > 0) {
      body.properties = updates.properties;
    }
    if (typeof updates.is_locked === "boolean") {
      body.is_locked = updates.is_locked;
    }
    if (typeof updates.in_trash === "boolean") {
      body.in_trash = updates.in_trash;
    }
    if (typeof updates.erase_content === "boolean") {
      body.erase_content = updates.erase_content;
    }
    return this.request("PATCH", `/pages/${pageId}`, body);
  }

  async replacePageContent(pageId, children) {
    const page = await this.updatePage(pageId, {
      erase_content: true,
    });
    if (children.length === 0) {
      return page;
    }
    await this.appendBlockChildren(pageId, children);
    return this.getPage(pageId);
  }

  async request(method, requestPath, body) {
    await this.throttle();
    const baseUrl = this.config.apiBaseUrl.endsWith("/") ? this.config.apiBaseUrl : `${this.config.apiBaseUrl}/`;
    const relativePath = requestPath.startsWith("/") ? requestPath.slice(1) : requestPath;
    const url = new URL(relativePath, baseUrl);
    const headers = {
      Authorization: `Bearer ${this.config.token}`,
      "Notion-Version": this.config.version,
      Accept: "application/json",
    };
    const options = {
      method,
      headers,
    };
    if (body !== undefined && body !== null) {
      headers["Content-Type"] = "application/json";
      options.body = JSON.stringify(body);
    }
    const response = await fetch(url, options);
    const text = await response.text();
    if (!response.ok) {
      throw new Error(`Notion request failed (${response.status}): ${truncate(text, 240)}`);
    }
    return text ? JSON.parse(text) : {};
  }

  async throttle() {
    const rateLimit = Math.max(1, this.config.rateLimitPerSecond || 2);
    const interval = Math.max(1, Math.floor(1000 / rateLimit));
    const now = Date.now();
    const delta = now - this.lastRequestAt;
    if (delta < interval) {
      await sleep(interval - delta);
    }
    this.lastRequestAt = Date.now();
  }
}

function formatToolResult(payload) {
  return {
    content: [
      {
        type: "text",
        text: JSON.stringify(payload, null, 2),
      },
    ],
    structuredContent: payload,
  };
}

const MAX_BLOCKS_PER_WRITE_REQUEST = 100;
const RICH_TEXT_SEGMENT_LIMIT = 1900;
const DEFAULT_CODE_LANGUAGE = "plain text";
const SUPPORTED_CODE_LANGUAGES = new Set([
  "abap",
  "agda",
  "arduino",
  "ascii art",
  "assembly",
  "bash",
  "basic",
  "c",
  "clojure",
  "coffeescript",
  "c++",
  "c#",
  "css",
  "dart",
  "diff",
  "docker",
  "elixir",
  "elm",
  "erlang",
  "flow",
  "fortran",
  "f#",
  "gherkin",
  "glsl",
  "go",
  "graphql",
  "groovy",
  "haskell",
  "html",
  "java",
  "javascript",
  "json",
  "julia",
  "kotlin",
  "latex",
  "less",
  "lisp",
  "livescript",
  "lua",
  "makefile",
  "markdown",
  "markup",
  "matlab",
  "mermaid",
  "nix",
  "notion formula",
  "objective-c",
  "ocaml",
  "pascal",
  "perl",
  "php",
  "plain text",
  "powershell",
  "prolog",
  "protobuf",
  "python",
  "r",
  "reason",
  "ruby",
  "rust",
  "sass",
  "scala",
  "scheme",
  "scss",
  "shell",
  "sql",
  "swift",
  "toml",
  "typescript",
  "vb.net",
  "verilog",
  "vhdl",
  "visual basic",
  "webassembly",
  "xml",
  "yaml",
  "java/c/c++/c#",
]);

function summarizePage(page) {
  return {
    page_id: page.id || page.page_id || null,
    title: resolvePageTitle(page.properties || {}),
    url: page.url || null,
    last_edited_time: page.last_edited_time || null,
    in_trash: Boolean(page.in_trash),
    parent: page.parent || null,
  };
}

function summarizeWrittenBlock(block) {
  return {
    block_id: block.id || null,
    type: block.type || null,
    text: extractBlockText(block),
    has_children: Boolean(block.has_children),
  };
}

function isWorkspaceTopLevelPage(page) {
  return page?.parent?.type === "workspace";
}

function simplifyProperties(properties) {
  const result = {};
  for (const [name, property] of Object.entries(properties || {})) {
    if (!property || typeof property !== "object") {
      continue;
    }
    result[name] = simplifyPropertyValue(property);
  }
  return result;
}

function simplifyPropertyValue(property) {
  switch (property.type) {
    case "title":
      return richTextToPlainText(property.title);
    case "rich_text":
      return richTextToPlainText(property.rich_text);
    case "number":
      return property.number ?? null;
    case "url":
      return property.url ?? null;
    case "status":
      return property.status?.name ?? null;
    case "select":
      return property.select?.name ?? null;
    case "multi_select":
      return Array.isArray(property.multi_select) ? property.multi_select.map((item) => item.name) : [];
    case "checkbox":
      return Boolean(property.checkbox);
    case "date":
      return property.date || null;
    case "relation":
      return Array.isArray(property.relation) ? property.relation.map((item) => item.id) : [];
    case "people":
      return Array.isArray(property.people) ? property.people.map((item) => item.name || item.id) : [];
    case "files":
      return Array.isArray(property.files) ? property.files.map((item) => item.name || item.type || "file") : [];
    case "email":
      return property.email ?? null;
    case "phone_number":
      return property.phone_number ?? null;
    case "formula":
      return property.formula ?? null;
    case "created_time":
      return property.created_time ?? null;
    case "last_edited_time":
      return property.last_edited_time ?? null;
    case "created_by":
      return property.created_by?.name ?? property.created_by?.id ?? null;
    case "last_edited_by":
      return property.last_edited_by?.name ?? property.last_edited_by?.id ?? null;
    default:
      return property[property.type] ?? null;
  }
}

function resolvePageTitle(properties) {
  for (const property of Object.values(properties || {})) {
    if (property && property.type === "title") {
      return richTextToPlainText(property.title);
    }
  }
  return "";
}

function blocksToMarkdown(blocks, depth = 0) {
  const lines = [];
  for (const block of blocks || []) {
    lines.push(...blockToMarkdownLines(block, depth));
  }
  return lines.join("\n").trim();
}

function blocksToPlainText(blocks) {
  return blocksToMarkdown(blocks)
    .replace(/^#+\s+/gm, "")
    .replace(/^-\s+\[[ x]\]\s+/gm, "")
    .replace(/^[-*]\s+/gm, "")
    .replace(/^>\s?/gm, "")
    .replace(/^\d+\.\s+/gm, "")
    .trim();
}

function blockToMarkdownLines(block, depth) {
  const indent = "  ".repeat(depth);
  const typedBlock = block && block.type && typeof block[block.type] === "object" ? block[block.type] : {};
  const text = extractBlockText(block);
  const childLines = Array.isArray(typedBlock.children)
    ? typedBlock.children.flatMap((child) => blockToMarkdownLines(child, depth + 1))
    : [];

  switch (block.type) {
    case "heading_1":
      return [`# ${text}`];
    case "heading_2":
      return [`## ${text}`];
    case "heading_3":
      return [`### ${text}`];
    case "paragraph":
      return text ? [text, ...childLines] : childLines;
    case "bulleted_list_item":
      return [`${indent}- ${text}`.trimEnd(), ...childLines];
    case "numbered_list_item":
      return [`${indent}1. ${text}`.trimEnd(), ...childLines];
    case "to_do":
      return [`${indent}- [${typedBlock.checked ? "x" : " "}] ${text}`.trimEnd(), ...childLines];
    case "quote":
      return [`${indent}> ${text}`.trimEnd(), ...childLines];
    case "callout":
      return [`${indent}> ${text}`.trimEnd(), ...childLines];
    case "toggle":
      return [`${indent}- ${text}`.trimEnd(), ...childLines];
    case "code":
      return ["```", text, "```"];
    case "divider":
      return ["---"];
    case "child_page":
      return [`${indent}[[Child Page]] ${typedBlock.title || text}`.trimEnd()];
    default:
      return text ? [`${indent}${text}`.trimEnd(), ...childLines] : childLines;
  }
}

function extractBlockText(block) {
  if (!block || !block.type) {
    return "";
  }
  const typedBlock = block[block.type];
  if (!typedBlock || typeof typedBlock !== "object") {
    return "";
  }
  if (Array.isArray(typedBlock.rich_text)) {
    return richTextToPlainText(typedBlock.rich_text);
  }
  if (Array.isArray(typedBlock.caption)) {
    return richTextToPlainText(typedBlock.caption);
  }
  if (typeof typedBlock.title === "string") {
    return typedBlock.title;
  }
  return "";
}

function resolveWriteScope(runtimeConfig, requestedScope) {
  return requestedScope || runtimeConfig.meta.selectedTokenSource || "blog";
}

function resolveDefaultParentPageId(runtimeConfig, scope) {
  const rootPageId = runtimeConfig.sources?.[scope]?.rootPageId || "";
  if (!rootPageId) {
    throw new Error(`Configured ${scope} root page is unavailable`);
  }
  return rootPageId;
}

function buildTitlePropertyUpdate(page, title) {
  const titlePropertyName = findTitlePropertyName(page);
  return {
    [titlePropertyName]: {
      title: buildRichText(title),
    },
  };
}

function findTitlePropertyName(page) {
  for (const [name, property] of Object.entries(page?.properties || {})) {
    if (property && property.type === "title") {
      return name;
    }
  }
  return "title";
}

function buildRichText(text) {
  const content = String(text || "");
  if (!content) {
    return [];
  }
  return splitTextSegments(content, RICH_TEXT_SEGMENT_LIMIT).map((segment) => ({
    type: "text",
    text: {
      content: segment,
    },
  }));
}

function splitTextSegments(text, maxLength) {
  const segments = [];
  let remaining = String(text || "");
  while (remaining.length > maxLength) {
    segments.push(remaining.slice(0, maxLength));
    remaining = remaining.slice(maxLength);
  }
  if (remaining.length > 0) {
    segments.push(remaining);
  }
  return segments;
}

function markdownToNotionBlocks(markdown) {
  const normalized = String(markdown || "").replace(/\r\n?/g, "\n").trim();
  if (!normalized) {
    return [];
  }

  const blocks = [];
  const paragraphLines = [];
  let codeState = null;
  const lines = normalized.split("\n");

  const flushParagraph = () => {
    if (paragraphLines.length === 0) {
      return;
    }
    const text = paragraphLines.join("\n").trim();
    paragraphLines.length = 0;
    if (!text) {
      return;
    }
    blocks.push({
      object: "block",
      type: "paragraph",
      paragraph: {
        rich_text: buildRichText(text),
      },
    });
  };

  const flushCodeBlock = () => {
    if (!codeState) {
      return;
    }
    blocks.push({
      object: "block",
      type: "code",
      code: {
        rich_text: buildRichText(codeState.lines.join("\n")),
        language: normalizeCodeLanguage(codeState.language),
      },
    });
    codeState = null;
  };

  for (const line of lines) {
    const trimmed = line.trim();

    if (codeState) {
      if (trimmed.startsWith("```")) {
        flushCodeBlock();
      } else {
        codeState.lines.push(line);
      }
      continue;
    }

    if (trimmed.startsWith("```")) {
      flushParagraph();
      codeState = {
        language: trimmed.slice(3).trim(),
        lines: [],
      };
      continue;
    }

    if (!trimmed) {
      flushParagraph();
      continue;
    }

    if (/^-{3,}$/.test(trimmed)) {
      flushParagraph();
      blocks.push({
        object: "block",
        type: "divider",
        divider: {},
      });
      continue;
    }

    const headingMatch = trimmed.match(/^(#{1,3})\s+(.+)$/);
    if (headingMatch) {
      flushParagraph();
      const level = headingMatch[1].length;
      const text = headingMatch[2].trim();
      blocks.push({
        object: "block",
        type: `heading_${level}`,
        [`heading_${level}`]: {
          rich_text: buildRichText(text),
        },
      });
      continue;
    }

    const todoMatch = trimmed.match(/^-\s+\[([ xX])\]\s+(.+)$/);
    if (todoMatch) {
      flushParagraph();
      blocks.push({
        object: "block",
        type: "to_do",
        to_do: {
          rich_text: buildRichText(todoMatch[2].trim()),
          checked: todoMatch[1].toLowerCase() === "x",
        },
      });
      continue;
    }

    const bulletMatch = trimmed.match(/^[-*]\s+(.+)$/);
    if (bulletMatch) {
      flushParagraph();
      blocks.push({
        object: "block",
        type: "bulleted_list_item",
        bulleted_list_item: {
          rich_text: buildRichText(bulletMatch[1].trim()),
        },
      });
      continue;
    }

    const numberedMatch = trimmed.match(/^\d+\.\s+(.+)$/);
    if (numberedMatch) {
      flushParagraph();
      blocks.push({
        object: "block",
        type: "numbered_list_item",
        numbered_list_item: {
          rich_text: buildRichText(numberedMatch[1].trim()),
        },
      });
      continue;
    }

    const quoteMatch = trimmed.match(/^>\s?(.*)$/);
    if (quoteMatch) {
      flushParagraph();
      blocks.push({
        object: "block",
        type: "quote",
        quote: {
          rich_text: buildRichText(quoteMatch[1].trim()),
        },
      });
      continue;
    }

    paragraphLines.push(line);
  }

  flushParagraph();
  flushCodeBlock();
  return blocks;
}

function normalizeCodeLanguage(raw) {
  const value = String(raw || "").trim().toLowerCase();
  const aliases = {
    js: "javascript",
    jsx: "javascript",
    ts: "typescript",
    tsx: "typescript",
    sh: "shell",
    shellscript: "shell",
    ps1: "powershell",
    yml: "yaml",
    md: "markdown",
    text: "plain text",
    plaintext: "plain text",
  };
  const normalized = aliases[value] || value || DEFAULT_CODE_LANGUAGE;
  return SUPPORTED_CODE_LANGUAGES.has(normalized) ? normalized : DEFAULT_CODE_LANGUAGE;
}

function chunkArray(items, size) {
  const chunks = [];
  for (let index = 0; index < items.length; index += size) {
    chunks.push(items.slice(index, index + size));
  }
  return chunks;
}

function richTextToPlainText(items) {
  if (!Array.isArray(items)) {
    return "";
  }
  return items.map((item) => item?.plain_text || item?.text?.content || "").join("").trim();
}

function readNested(value, pathParts) {
  let current = value;
  for (const part of pathParts) {
    if (!current || typeof current !== "object" || !(part in current)) {
      return {};
    }
    current = current[part];
  }
  return current;
}

function cleanConfigValue(value) {
  if (typeof value !== "string") {
    return "";
  }
  const trimmed = value.trim();
  if (!trimmed) {
    return "";
  }
  if ((trimmed.startsWith("<") && trimmed.endsWith(">")) || trimmed.includes("${")) {
    return "";
  }
  return trimmed;
}

function normalizeNotionId(raw) {
  const value = String(raw || "").trim();
  const matches = value.match(/[0-9a-fA-F]{32}|[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}/g);
  if (!matches || matches.length === 0) {
    throw new Error("A valid Notion page id or URL is required");
  }
  const compact = matches[matches.length - 1].replaceAll("-", "").toLowerCase();
  return `${compact.slice(0, 8)}-${compact.slice(8, 12)}-${compact.slice(12, 16)}-${compact.slice(16, 20)}-${compact.slice(20)}`;
}

function isSupportedNestedBlock(type) {
  return [
    "bulleted_list_item",
    "numbered_list_item",
    "to_do",
    "toggle",
    "quote",
    "callout",
  ].includes(type);
}

function isAuthorized(request) {
  const header = String(request.headers.authorization || "").trim();
  return header === `Bearer ${SERVER_TOKEN}`;
}

function normalizeRequestPath(urlValue) {
  try {
    const url = new URL(urlValue, "http://127.0.0.1");
    return normalizePath(url.pathname);
  } catch {
    return normalizePath(urlValue || "/");
  }
}

function normalizePath(rawPath) {
  const trimmed = String(rawPath || "/").trim();
  if (!trimmed.startsWith("/")) {
    return `/${trimmed}`;
  }
  return trimmed;
}

function normalizeSource(raw) {
  return String(raw || "blog").trim().toLowerCase() === "task" ? "task" : "blog";
}

function parseInteger(raw, fallback) {
  const value = Number.parseInt(String(raw ?? fallback), 10);
  return Number.isFinite(value) ? value : fallback;
}

function readBooleanOverride(envName, fallback) {
  const raw = process.env[envName];
  if (raw == null || raw.trim() === "") {
    return fallback;
  }
  const normalized = raw.trim().toLowerCase();
  return normalized === "1" || normalized === "true" || normalized === "yes" || normalized === "on";
}

function truncate(value, maxLength) {
  const normalized = String(value || "");
  if (normalized.length <= maxLength) {
    return normalized;
  }
  return `${normalized.slice(0, maxLength)}...`;
}

function sleep(milliseconds) {
  return new Promise((resolve) => setTimeout(resolve, milliseconds));
}

function readJsonBody(request) {
  return new Promise((resolve, reject) => {
    const chunks = [];
    request.on("data", (chunk) => chunks.push(chunk));
    request.on("end", () => {
      const raw = Buffer.concat(chunks).toString("utf8").trim();
      if (!raw) {
        resolve(undefined);
        return;
      }
      try {
        resolve(JSON.parse(raw));
      } catch (error) {
        reject(new Error("Invalid JSON request body"));
      }
    });
    request.on("error", reject);
  });
}

function writeJson(response, statusCode, payload) {
  response.writeHead(statusCode, {
    "Content-Type": "application/json; charset=utf-8",
  });
  response.end(JSON.stringify(payload));
}

async function main() {
  const runtimeConfig = await loadRuntimeConfig();
  const notionClient = new NotionApiClient(runtimeConfig.notion);

  const httpServer = createServer(async (request, response) => {
    try {
      const requestPath = normalizeRequestPath(request.url || "/");
      if (requestPath === HEALTH_PATH) {
        writeJson(response, 200, {
          ok: true,
          service: "shizuki-notion-mcp",
          endpoint: ENDPOINT_PATH,
          preferred_source: runtimeConfig.meta.preferredSource,
          configured_sources: runtimeConfig.meta.configuredSources,
        });
        return;
      }

      if (requestPath !== ENDPOINT_PATH) {
        writeJson(response, 404, { error: "Not Found" });
        return;
      }

      if (!isAuthorized(request)) {
        response.writeHead(401, {
          "Content-Type": "application/json; charset=utf-8",
          "WWW-Authenticate": "Bearer realm=\"shizuki-notion-mcp\"",
        });
        response.end(JSON.stringify({ error: "Unauthorized" }));
        return;
      }

      if (request.method !== "POST") {
        writeJson(response, 405, { error: "Method Not Allowed" });
        return;
      }

      const body = await readJsonBody(request);
      const server = createMcpServer(runtimeConfig, notionClient);
      const transport = new StreamableHTTPServerTransport({
        sessionIdGenerator: undefined,
      });
      response.on("close", () => {
        transport.close().catch(() => undefined);
        const closeServer = typeof server.close === "function" ? server.close.bind(server) : null;
        if (closeServer) {
          Promise.resolve(closeServer()).catch(() => undefined);
        }
      });
      await server.connect(transport);
      await transport.handleRequest(request, response, body);
    } catch (error) {
      const message = error instanceof Error ? error.message : String(error);
      console.error("[notion-mcp] request failed", message);
      if (!response.headersSent) {
        writeJson(response, 500, { error: message });
      } else {
        response.end();
      }
    }
  });

  httpServer.listen(PORT, "0.0.0.0", () => {
    console.log(
      `[notion-mcp] listening on 0.0.0.0:${PORT}${ENDPOINT_PATH} using ${runtimeConfig.meta.selectedTokenSource} token`
    );
  });
}

await main();
