# Shizuki Music Source Helper

用于网易云、QQ 音乐、酷狗的一键绑定助手。职责仅限于读取白名单 Cookie 并回填到站内绑定会话，不保存本地副本。

## 安装

1. 打开 `chrome://extensions`
2. 开启右上角“开发者模式”
3. 点击“加载已解压的扩展程序”
4. 选择本目录：`tools/music-source-helper`

## 支持站点

- `music.163.com`
- `y.qq.com`
- `www.kugou.com`

默认只允许下列站点与助手通信：

- `http://localhost`
- `http://127.0.0.1`
- `http://localhost:5173`
- `http://127.0.0.1:5173`
- `https://shizuki.site`
- `https://*.shizuki.site`

如果你的前端域名不同，请修改 `manifest.json` 里的 `content_scripts.matches` 后重新加载扩展。

## 使用方式

1. 进入站内音乐页或个人页
2. 在账号卡点击“检测助手”
3. 点击“一键绑定”
4. 新窗口打开目标音乐站点，完成登录
5. 返回站内，系统会自动轮询并完成绑定

## 安全约束

- 不打印明文 Cookie
- 不将 Cookie 保存到扩展存储
- 仅支持网易云 / QQ 音乐 / 酷狗
