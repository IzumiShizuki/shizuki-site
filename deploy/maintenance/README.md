# 个人服务器磁盘维护

仅用于 `111.228.35.186`。需要服务器已有的 Docker buildx、systemd、Python 3、gzip 和 flock，无需安装新依赖。

## 保留规则

- 每天北京时间 04:30–04:45 执行，flock 防止维护任务重叠。
- 回收超过 7 天的悬空镜像；保留带标签镜像、所有容器和数据卷。
- 回收至少 24 小时未使用的构建缓存，保留 2 GB，目标缓存用量 3 GB。年龄限制及共享层可能使实际占用高于目标。
- 系统日志最多保留 14 天，持久日志预算 512 MiB，运行时日志预算 128 MiB，并预留 2 GiB 磁盘空间。活动日志与文件粒度可能使瞬时用量略高。
- 快照删除默认关闭。启用后，仅清理 `/opt/shizuki-site-backups` 下格式为 `snapshot-YYYYMMDD-HHMMSS-<12位提交号>` 的完整快照：保留最近 14 天全部快照，且至少保留最新 3 份。自定义备份和不完整快照保留。
- 每次删除前验证最新 3 份完整快照中的 gzip 归档和 PostgreSQL dump 目录；失败则不删除。审计 JSON 记录保留 90 天。

## 安装与检查

先将本目录上传到个人服务器，例如 `/opt/shizuki-site-maintenance`，随后在服务器执行：

```bash
cd /opt/shizuki-site-maintenance
python3 -m unittest -v test_retain_snapshots.py
bash -n install.sh shizuki-disk-maintenance.sh
python3 retain_snapshots.py
bash install.sh
```

用户于 2026-10-15 明确同意清理预览中的 22 份旧快照，并采用上述保留规则。首次启用或更改保留范围前仍应核对预览，删除历史恢复点不可撤销：

```bash
printf 'PRUNE_SNAPSHOTS=1\n' > /etc/default/shizuki-disk-maintenance
systemctl start shizuki-disk-maintenance.service
systemctl status shizuki-disk-maintenance.timer --no-pager
journalctl -u shizuki-disk-maintenance.service -n 100 --no-pager
df -hT /
```

安装器保留已有的 `/etc/default/shizuki-disk-maintenance` 设置；首次安装默认为关闭快照删除。安装时只重启 journald 以应用其配置，应用容器不重启。每日任务的归档验证可能需要数分钟。

快照以 `READY` 完成时间判断保留期。与部署并发造成清单变化时会停止删除，下一次维护重试。部署备份频繁时，14 天内的备份仍可能占较大空间；该规则不构成磁盘容量硬配额。

## 停用与回滚

```bash
systemctl disable --now shizuki-disk-maintenance.timer
printf 'PRUNE_SNAPSHOTS=0\n' > /etc/default/shizuki-disk-maintenance
rm /etc/systemd/journald.conf.d/90-shizuki-disk-limits.conf
systemctl restart systemd-journald.service
```

停用定时器不会中断已经开始的维护任务。缓存可重新构建，已删除的旧日志和旧快照不能回滚。数据库、上传文件、数据卷和已有容器不在清理范围内。
