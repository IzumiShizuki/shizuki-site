# 智能体协作协议 (Agent Instructions)

本项目使用 **OpenSpec** 记录重要变更，并使用 Git 管理实现与交付。开始材料性改动前，先确认对应 change 的 proposal、design、spec 与 tasks 已就绪。

## 0. 服务器归属边界 (Server Ownership Boundary)

- `111.228.35.186` 是个人网站服务器。
- `111.228.35.186` 仅用于 `shizuki-site`、个人域名、个人中间件、个人运维面板与相关个人服务。
- `111.228.52.91` 是卓望系统服务器，不属于本项目默认运维范围。
- 除非用户在当前对话中明确要求，否则不要把 `shizuki-site`、`1Panel`、个人站点解析或个人运维组件部署到 `111.228.52.91`。

## 1. 快捷指令 (Quick Reference)

```bash
openspec list
openspec status --change <change-name>
openspec instructions apply --change <change-name> --json
openspec validate <change-name> --type change --strict --no-interactive
```

## 2. 任务提交流程 (Session Completion)

**在每次会话结束前**，请执行以下操作以确保本地代码基线稳固：

1.  **遗留事项检查**：在对应 OpenSpec `tasks.md` 或项目 Issue 中记录未完成事项。
2.  **质量控制**：运行测试、Linter 与构建命令，修正代码缺陷。
3.  **状态更新**：及时勾选已完成的 OpenSpec 任务，更新进行中的任务说明。
4.  **一致性检查**：
    ```bash
    openspec validate <change-name> --type change --strict --no-interactive
    git status
    ```
5.  **环境清理**：清空临时文件，修剪冗余分支。
6.  **本地提交**：确认所有变更均已在本地 Commit。
7.  **上下文移交**：为下一次开发留下清晰的任务进度说明。

## 3. 核心准则 (CRITICAL RULES)

- **本地优先**：完成适用质量检查、OpenSpec 状态更新及本地 Commit 即代表任务阶段性达成。
- **权限限制**：除非得到明确授权，否则严禁执行 `git push` 操作。
- **推送到远端**（仅在获得授权后执行）：
    - `git fetch --prune`
    - 将已验证变更合并或 rebase 到目标分支
    - 再次运行适用测试与 OpenSpec 严格校验
    - `git push`
    - 通过 `git status` 确认与远端仓库完全同步。

## 4. Commit 规范

- **作者标识**：
    - `user.name = Izumi`
    - `user.email = 29301481@qq.com`
- **信息格式**：
    - `type: description` (例如 `fix: resolve auth timeout issue`)

---

## 5. 配置信息 (Configuration)

- **浏览器**: Microsoft Edge (`C:\Program Files (x86)\Microsoft\Edge\Application\msedge.exe`)
- **权限协议**: 全局授权 (Full Consent)
- **设置文件**: [.antigravity/settings.json](file:///d:/xuexi/10.program/shizuki-site/shizuki-site/.antigravity/settings.json)
