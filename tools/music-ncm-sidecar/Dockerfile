FROM node:20-alpine

WORKDIR /app

RUN npm init -y \
    && npm install --omit=dev @neteasecloudmusicapienhanced/api@4.32.0

ENV NODE_ENV=production \
    PORT=3000

EXPOSE 3000

CMD ["node", "node_modules/@neteasecloudmusicapienhanced/api/app.js"]
