# 开发、启动与调试

## 1. 本机环境

项目约定使用现有工具链，不要重新安装或替换 `D:\environment` 下的运行时：

| 工具 | 约定位置/版本 | 用途 |
| --- | --- | --- |
| Java | `D:\environment\jdk\temurin-17\jdk-17.0.19+10` | Maven/Spring Boot，项目 `java.version=17` |
| Maven | `D:\environment\maven\runtime\apache-maven-3.9.16` | 后端构建与测试 |
| Node.js | `D:\environment\nodejs\runtime\node-v24.17.0-win-x64` | 前端工具链 |
| pnpm | `D:\environment\pnpm` | 前端依赖与脚本 |
| Python | `D:\environment\anaconda3\envs\py314\python.exe` | 部署辅助脚本和部分工具 |

优先调用 `D:\environment\activate-shizuki-site.cmd`；它为 shizuki-site 选择 Java 17。若当前 shell 不支持直接继承 `.cmd` 环境，使用项目提供的启动脚本或对应 PowerShell 激活脚本，不要手工改写全局 `JAVA_HOME`。

## 2. 安装前端依赖

```powershell
Set-Location fronted/vue3-merged
pnpm install
```

`start-local.bat` 会检查 `fronted/vue3-merged/node_modules`；缺少依赖时先执行上面的安装。不要把 `node_modules`、构建产物或本机缓存提交到仓库。

## 3. 本地启动

### 推荐：一键启动前后端

```powershell
.\start-local.bat
```

脚本会在两个终端启动：

- 后端：`http://localhost:8080`
- 前端：`http://localhost:5173`
- 中间件：继续使用配置的远端主机 `111.228.35.186`

这条路径不会自动切换到本地 Docker 中间件。除非用户明确要求，不要为了绕过连接问题擅自改成 Docker 方案。

### 手动启动

后端：

```powershell
mvn clean install
mvn -pl apps/monolith-app spring-boot:run
```

前端：

```powershell
Set-Location fronted/vue3-merged
pnpm dev
```

如果只修改了某个后端模块，可用 `mvn -pl <module> -am test` 做聚合构建；涉及应用运行时或跨模块行为时仍应在根工程验证。

## 4. 常用开发命令

| 目标 | 命令 |
| --- | --- |
| 后端全量构建 | `mvn clean install` |
| 启动单体后端 | `mvn -pl apps/monolith-app spring-boot:run` |
| 前端单元测试 | `pnpm --dir fronted/vue3-merged test:unit` |
| 前端生产构建 | `pnpm --dir fronted/vue3-merged build` |
| 指定 Vitest 文件 | `pnpm --dir fronted/vue3-merged exec vitest run src/path/to/file.spec.js` |
| 查看当前改动 | `git status --short`、`git diff -- <path>` |
| 搜索实现 | `rg -n "关键词" apps modules libs model fronted/vue3-merged` |

前端脚本和依赖以 [fronted/vue3-merged/package.json](../fronted/vue3-merged/package.json) 为准；后端 Java 版本和模块列表以 [pom.xml](../pom.xml) 为准。

## 5. 调试顺序

1. 先确认当前 profile、端口和外部配置来源，不要直接猜测连接错误原因。
2. 后端先看启动日志中的配置校验、数据库迁移和外部客户端初始化；再定位具体 controller/service。
3. 前端先看浏览器控制台、Network 请求、`apiBase` 计算出的地址和认证状态，再进入页面组件。
4. 涉及 SSE、文件下载或媒体播放时，优先复用现有 `httpClient`、授权 fetch 和解析工具，检查超时/重连/取消语义。
5. 修复后补最小回归测试；不要只通过手工点击判断完成。

## 6. 不要做的事

- 不要在未确认配置来源前修改 `resouces/yaml/common-config.yaml` 或部署环境变量。
- 不要把远端数据库/Redis/Kafka 切换为本地 Docker 作为默认修复。
- 不要为一次调试把 Token、密码或完整启动日志贴进仓库或聊天。
- 不要直接运行发布脚本来验证普通代码改动；发布脚本会拉取、推送并部署，见 [05-testing-and-delivery.md](05-testing-and-delivery.md)。
