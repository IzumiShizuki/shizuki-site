# 钱迹本地同步说明

钱迹本地同步 companion 已迁到：

- [tools/qianji-sync](/D:/program/shizuki-site/tools/qianji-sync)
- 主文档: [README.md](/D:/program/shizuki-site/tools/qianji-sync/README.md)

现在 `fronted/vue3-merged/scripts` 下保留的同名 `qianji` 脚本主要是兼容入口，避免你已经安装的开机自启、Startup 启动器和旧命令路径失效。

前端侧真正保留的内容只有两类：

- 网站内“手动导入钱迹文件”的 UI
- 前端与本地 companion 共用的解析模块

如果你要继续配置本地自动同步，请直接从 [tools/qianji-sync](/D:/program/shizuki-site/tools/qianji-sync) 下面的脚本和配置开始。
