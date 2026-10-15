# 个人服务器磁盘维护

仅用于 `111.228.35.186`。需要服务器已有的 Docker buildx、systemd、Python 3、gzip 和 flock，无需安装新依赖。

## 保留规则

- 每天北京时间 04:30–04:45 执行，flock 防止维护任务重叠。
- 回收超过 7 天的悬空镜像；保留所有容器和数据卷。
- 镜像清理默认关闭。启用后，仅清理超过 7 天且未被任何容器使用的 `shizuki-site/backend`、`shizuki-site/site` 镜像。每个仓库保留最新 3 个版本，保留备份 JSON 记录引用的全部镜像，以及带其他仓库别名的镜像；移除前重新检查引用并记录清单，不使用强制删除。
- 回收至少 6 小时未使用的构建缓存，保留 1 GB，目标缓存用量 2 GB。年龄限制及共享层可能使实际占用高于目标。
- 系统日志最多保留 14 天，持久日志预算 512 MiB，运行时日志预算 128 MiB，并预留 2 GiB 磁盘空间。活动日志与文件粒度可能使瞬时用量略高。
- 快照删除默认关闭。启用后，仅清理 `/opt/shizuki-site-backups` 下格式为 `snapshot-YYYYMMDD-HHMMSS-<12位提交号>` 的完整快照：保留最近 7 天全部快照，且至少保留最新 3 份。自定义备份和不完整快照保留。
- 每次删除前验证最新 3 份完整快照中的 gzip 归档和 PostgreSQL dump 目录；失败则不删除。审计 JSON 记录保留 90 天。

## 安装与检查

先将本目录上传到个人服务器，例如 `/opt/shizuki-site-maintenance`，随后在服务器执行：

```bash
cd /opt/shizuki-site-maintenance
python3 -B -m unittest discover -s . -p 'test_*.py' -v
bash -n install.sh shizuki-disk-maintenance.sh
python3 retain_snapshots.py
python3 retain_images.py
bash install.sh
```

用户最初明确同意清理预览中的 22 份旧快照，并保留最近 14 天全部备份；追加清理时，用户要求降低保留天数，现采用 7 天并至少保留最新 3 份完整快照。首次启用或更改保留范围前仍应核对预览，删除历史恢复点不可撤销：

```bash
printf 'PRUNE_SNAPSHOTS=1\nPRUNE_IMAGES=1\n' > /etc/default/shizuki-disk-maintenance
systemctl start shizuki-disk-maintenance.service
systemctl status shizuki-disk-maintenance.timer --no-pager
journalctl -u shizuki-disk-maintenance.service -n 100 --no-pager
df -hT /
```

安装器保留已有的 `/etc/default/shizuki-disk-maintenance` 设置；首次安装默认关闭快照和带标签镜像删除。本次用户追加要求继续清理后，已启用上述受保护的镜像保留策略。安装时只重启 journald 以应用其配置，应用容器不重启。每日任务的归档验证可能需要数分钟。

快照以 `READY` 完成时间判断保留期。与部署并发造成清单变化时会停止删除，下一次维护重试。部署备份频繁时，7 天内的备份仍可能占较大空间；该规则不构成磁盘容量硬配额。

这些是部署前恢复备份：包含整份程序和配置、PostgreSQL dump，以及部署声明的数据卷。代表性快照约含 541 MB 程序归档、717 MB Steam Workshop 数据卷和 1.2 MB 数据库 dump。连续部署会重复保存相同内容，不能将整个目录大小理解成数据库大小。进一步优化可考虑分离程序、数据库及大文件备份频率，但需要同步修改恢复流程。

## 停用与回滚

```bash
systemctl disable --now shizuki-disk-maintenance.timer
printf 'PRUNE_SNAPSHOTS=0\nPRUNE_IMAGES=0\n' > /etc/default/shizuki-disk-maintenance
rm /etc/systemd/journald.conf.d/90-shizuki-disk-limits.conf
systemctl restart systemd-journald.service
```

停用定时器不会中断已经开始的维护任务。缓存可重新构建，已删除的旧日志和旧快照不能回滚。数据库、上传文件、数据卷和已有容器不在清理范围内。
