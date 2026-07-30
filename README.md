# Shizuki Site

个人站点项目，当前以单体后端 + Vue 前端为主，部署目标默认是 `111.228.35.186`。

## 保留的主要入口

- 前端目录：`fronted/vue3-merged`
- 本地启动：`start-local.bat`
- 构建、推送并部署：`build-push-deploy.bat`

## 项目结构

- `apps/monolith-app`
  - 单体后端启动入口
- `modules`
  - 业务模块
- `fronted/vue3-merged`
  - 前端工程
- `deploy`
  - 服务器 Compose 配置和发布运行时
- `docker`
  - Dockerfile 集中目录

## 本地开发

```bash
mvn clean install
mvn -pl apps/monolith-app spring-boot:run
```

前端在 `fronted/vue3-merged` 下单独运行。

## 说明

这份 README 只保留最常用的信息，历史规格、一次性迁移脚本和辅助文档已做清理。
