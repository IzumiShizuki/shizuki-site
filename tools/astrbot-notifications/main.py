import asyncio
import contextlib
from pathlib import Path

import aiohttp
from astrbot.api import AstrBotConfig, logger
from astrbot.api.event import AstrMessageEvent, MessageChain, filter
from astrbot.api.star import Context, Star, StarTools, register

from .bridge import BridgeError, DeliveryLedger, DeliveryWorker, HttpBridge, private_sender, validate_config

COMMANDS = {"/shizuki_bind", "/shizuki_pause", "/shizuki_resume", "/shizuki_unbind"}


@register("astrbot_plugin_shizuki_notifications", "Izumi", "网站同组成员更新提醒", "1.0.0")
class ShizukiNotifications(Star):
    def __init__(self, context: Context, config: AstrBotConfig):
        super().__init__(context)
        self.config = config
        self.session = self.task = self.ledger = self.bridge = None
        self.platforms = []

    async def initialize(self):
        if not self.config.get("enabled", False):
            return
        try:
            self.platforms = [str(p).strip() for p in self.config.get("platform_ids", [])]
            self.poll_interval = max(5, int(self.config.get("poll_seconds", 10)))
            secret = str(self.config.get("bridge_secret", ""))
            url = validate_config(str(self.config.get("site_url", "")), secret, self.platforms)
            data_dir = Path(StarTools.get_data_dir("astrbot_plugin_shizuki_notifications"))
            self.ledger = DeliveryLedger(data_dir / "delivered.sqlite3")
            self.session = aiohttp.ClientSession(timeout=aiohttp.ClientTimeout(total=15))
            self.bridge = HttpBridge(self.session, url, secret)
            worker = DeliveryWorker(self.bridge, self.ledger, self.platforms, self.send_reminder)
            self.task = asyncio.create_task(self.poll(worker))
        except Exception:
            await self.terminate()
            logger.error("Shizuki 微信提醒未启动，请检查插件配置")

    async def send_reminder(self, origin, text):
        return await self.context.send_message(origin, MessageChain().message(text))

    async def poll(self, worker):
        interval = self.poll_interval
        while True:
            try:
                await worker.once()
            except asyncio.CancelledError:
                raise
            except Exception:
                # Never include exception repr: HTTP libraries can include credentials or message origins.
                logger.warning("Shizuki 微信提醒轮询失败，将在下个周期重试")
            await asyncio.sleep(interval)

    @filter.event_message_type(filter.EventMessageType.ALL, priority=100)
    async def command(self, event: AstrMessageEvent):
        parts = event.get_message_str().strip().split()
        if not parts or parts[0] not in COMMANDS:
            return
        # Stop before ANY await, including errors/group-chat attempts: binding codes must not reach an LLM.
        event.stop_event()
        if self.bridge is None:
            yield event.plain_result("网站消息绑定与提醒尚未启用，请联系站长完成接入。")
            return
        try:
            sender = private_sender(str(event.get_platform_id()), str(event.get_sender_id()),
                                    str(event.unified_msg_origin), self.platforms)
            if parts[0] == "/shizuki_bind":
                if len(parts) == 3 and parts[1] in {"QQ", "WECHAT"} and len(parts[2]) <= 64:
                    await self.bridge.post("/contact-bindings/confirm", {
                        "code": parts[2], "platform": parts[1], "sender": sender})
                    message = f"{'QQ' if parts[1] == 'QQ' else '微信'}账号绑定成功，可回网站设置 Todo 操作与提醒权限。"
                elif len(parts) == 2 and len(parts[1]) <= 64:
                    await self.bridge.post("/bindings/confirm", {"code": parts[1], "sender": sender})
                    message = "微信绑定成功。请回网站选择分组及文章、动态订阅；默认不推送。"
                else:
                    raise ValueError("请在网站个人中心生成绑定码，复制完整绑定指令后私聊发送。")
            else:
                if len(parts) != 1:
                    raise ValueError("请只发送指令本身。")
                action = {"/shizuki_pause": "PAUSE", "/shizuki_resume": "RESUME", "/shizuki_unbind": "UNBIND"}[parts[0]]
                await self.bridge.post("/controls", {"action": action, "sender": sender})
                message = {"PAUSE": "已暂停网站提醒。", "RESUME": "已恢复网站提醒。", "UNBIND": "已解绑并清空订阅。"}[action]
            yield event.plain_result(message)
        except (ValueError, BridgeError) as exc:
            yield event.plain_result(str(exc))
        except Exception:
            yield event.plain_result("操作未完成，请稍后重试；也可回网站检查绑定状态。")

    async def terminate(self):
        if self.task is not None:
            self.task.cancel()
            with contextlib.suppress(asyncio.CancelledError):
                await self.task
            self.task = None
        if self.session is not None:
            await self.session.close()
            self.session = None
        if self.ledger is not None:
            self.ledger.close()
            self.ledger = None
        self.bridge = None
