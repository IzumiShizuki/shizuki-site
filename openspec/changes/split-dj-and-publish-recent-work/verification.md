# 项目拆分与近期修改交付验证

2026-10-28（Asia/Shanghai），使用 openspec-verify-change 按完整性、正确性、一致性核对。

## 主站

- 账号注销、默认 SVG 头像和令牌签发并发保护已本地提交 bdb08457。
- 已 fetch 并无冲突合入 origin/master 的 3 个新提交，保留本地近期 32 个提交及全部历史。合并提交 c15c2eee。
- 合并后相关前端 5 文件、69 项测试通过，含账号/头像及歌单集成路径；生产构建成功。
- 合并后账号后端相关 16 项测试通过；音乐相关 controller/library/service 测试通过，完整 Maven 依赖构建和 Spring Boot 打包成功。
- 账号注销的独立真实浏览器流程未在本次重跑，已在原 change 的 tasks 中保留，不把单元渲染测试当作生产注销验收。
- 严格校验 add-account-deletion-and-svg-avatar 与 split-dj-and-publish-recent-work 通过。

## DJ

- 新根目录 D:/program/dj；独立 GitHub 私有仓库 IzumiShizuki/dj，初始来源 dbd3baa1，独立 main 历史。
- 保留所需公共和账户源码；移除主站前端、音乐/AI 模块、无关工具与部署资料。web/native 构建默认均指向 DJ 入口，独立后端编译打包成功。
- 0.2.0 的通知、组员邮箱状态、绿框与组长拍一拍已实现；247 项前端、40 项回滚式真实 PostgreSQL、Android 9 项测试与 lint/签名打包通过。详见 DJ 仓库的 fix-dj-notifications-and-group-home/verification.md。
- 新版本需要更新 App，组员动态还需匹配后端/V1028；本次 GitHub 交付没有部署服务器、迁移生产数据库或发送真实组员消息。

## 一致性

两个仓库保留各自规范和任务，主站 docs/projects.md 给出边界。签名密钥、私有 YAML、node_modules、target 和构建输出不提交；原来主站未跟踪的插件 zip 留在本机，插件源码已在 DJ 项目保存。

本文件的源码验证已完成；远端同步以最终 git status/upstream 核对为准。没有归档历史变更。
