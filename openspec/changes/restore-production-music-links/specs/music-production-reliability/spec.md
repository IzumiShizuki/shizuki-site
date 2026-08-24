## Purpose

为生产音乐模块定义从页面入口到真实音频资源的端到端可用性契约，并为 Agent 提供可重复、脱敏、可回滚的诊断和修复边界。

## ADDED Requirements

### Requirement: Production music checks SHALL verify playable links

生产音乐检查 SHALL 验证站点入口、后端健康、音乐聚合服务、歌单数据和至少一首代表性曲目的播放解析；仅返回 HTTP 2xx 或曲目元数据不得被判定为音乐可用。

#### Scenario: Metadata is available but playback is empty

- **WHEN** 默认歌单或搜索接口返回曲目，但代表性曲目的播放解析没有返回非空音频地址
- **THEN** 检查 SHALL 以非零状态失败，并指出失败发生在播放解析阶段

#### Scenario: Representative track resolves successfully

- **WHEN** 入口、依赖健康检查及代表性曲目解析均成功，且音频资源能够响应媒体请求
- **THEN** 检查 SHALL 成功，并只输出状态、来源和脱敏后的资源信息

### Requirement: Operations guidance SHALL support deterministic diagnosis

仓库 SHALL 保存一份音乐生产运维手册，描述组件拓扑、故障分层、检查命令、常见症状与原因映射、最小修复方式、回滚步骤和验收清单，使后续 Agent 无需猜测服务归属或敏感配置位置。

#### Scenario: Agent receives a music outage report

- **WHEN** Agent 收到播放失败、链接为空、歌词缺失、登录源失效或歌单为空的报告
- **THEN** 手册 SHALL 提供从外部请求到服务器内部依赖的有序诊断步骤，并明确每一步的通过和失败判据

#### Scenario: Credentials are needed for diagnosis

- **WHEN** 诊断需要读取服务器环境变量、Cookie、Token 或数据库配置
- **THEN** 手册 SHALL 要求只验证存在性或脱敏摘要，不得把秘密、完整临时播放 URL 或用户 Cookie 写入日志、文档和提交

### Requirement: Production repair SHALL remain bounded and reversible

音乐生产修复 MUST 只作用于个人站服务器 `111.228.35.186` 的相关服务，优先采用最小运行时修复，并在变更前保存可恢复信息、在变更后执行同一冒烟检查。

#### Scenario: Runtime configuration is the root cause

- **WHEN** 单变量验证确认某个运行时配置或容器状态导致播放链接失效
- **THEN** 修复 SHALL 只修改该配置或相关服务，记录脱敏差异，并保留明确的回滚命令

#### Scenario: Upstream provider blocks playback

- **WHEN** 站内链路健康但音乐提供方明确返回版权、地区、登录或会员限制
- **THEN** 系统 SHALL 将其区分为上游限制，不得通过泄露凭据、绕过授权或修改无关服务来伪装成功

