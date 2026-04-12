# 智能体协作协议 (Agent Instructions)

本项目采用 **bd** (beads) 引擎驱动任务流。启动前请运行 `bd onboard` 唤醒系统。

## 1. 快捷指令 (Quick Reference)

```bash
bd ready              # 查看可用任务
bd show <id>          # 查看任务详情
bd update <id> --status in_progress  # 认领并锁定任务
bd close <id>         # 完成任务
bd sync               # 同步任务状态
```

## 2. 任务提交流程 (Session Completion)

**在每次会话结束前**，请执行以下操作以确保本地代码基线稳固：

1.  **遗留事项检查**：为所有未完成的事项创建 Issue 标记。
2.  **质量控制**：运行测试、Linter 与构建命令，修正代码缺陷。
3.  **状态更新**：关闭已完成任务，更新进行中的任务状态。
4.  **全量同步**：
    ```bash
    bd sync
    git status  # 确认工作树状态
    ```
5.  **环境清理**：清空临时文件，修剪冗余分支。
6.  **本地提交**：确认所有变更均已在本地 Commit。
7.  **上下文移交**：为下一次开发留下清晰的任务进度说明。

## 3. 核心准则 (CRITICAL RULES)

- **本地优先**：完成本地 Commit、质量检查及 `bd sync` 即代表任务阶段性达成。
- **权限限制**：除非得到明确授权，否则严禁执行 `git push` 操作。
- **推送到远端**（仅在获得授权后执行）：
    - `git pull --rebase`
    - `bd sync`
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

