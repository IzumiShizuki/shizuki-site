FROM m.daocloud.io/mcr.microsoft.com/playwright:v1.58.2-noble

WORKDIR /app

ENV NODE_ENV=production \
    PLAYWRIGHT_SKIP_BROWSER_DOWNLOAD=1 \
    PLAYWRIGHT_BROWSERS_PATH=/ms-playwright \
    PORT=39041 \
    MUSIC_WEB_AUTH_HEADLESS=true

COPY tools/music-web-auth-sidecar/package.json ./package.json
COPY tools/music-web-auth-sidecar/package-lock.json ./package-lock.json
RUN npm ci --omit=dev

COPY tools/music-web-auth-sidecar/src ./src

EXPOSE 39041

CMD ["npm", "run", "start"]
