FROM m.daocloud.io/docker.io/library/node:24-bookworm-slim

WORKDIR /app

ENV NODE_ENV=production \
    PORT=39051 \
    NOTION_MCP_ENDPOINT_PATH=/mcp/notion \
    NOTION_MCP_HEALTH_PATH=/healthz \
    NOTION_MCP_CONFIG_FILE=/app/resouces/yaml/common-config.yaml \
    NOTION_MCP_PREFERRED_SOURCE=blog

COPY tools/notion-mcp-sidecar/package.json ./package.json
COPY tools/notion-mcp-sidecar/package-lock.json ./package-lock.json
RUN npm ci --omit=dev

COPY tools/notion-mcp-sidecar/src ./src

EXPOSE 39051

CMD ["npm", "run", "start"]
