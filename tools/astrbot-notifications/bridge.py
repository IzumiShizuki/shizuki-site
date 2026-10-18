"""HTTP bridge and durable delivery worker; independent of AstrBot for local tests."""
from __future__ import annotations

import asyncio
import sqlite3
import time
from pathlib import Path
from urllib.parse import urlsplit


class BridgeError(Exception):
    """Intentionally contains no URL, credentials, sender or message body."""


def validate_config(url: str, secret: str, platforms: list[str]) -> str:
    parsed = urlsplit(url)
    loopback = parsed.hostname in {"127.0.0.1", "localhost", "::1"}
    if (parsed.scheme != "https" and not (parsed.scheme == "http" and loopback)
            or not parsed.hostname or parsed.username or parsed.password
            or parsed.query or parsed.fragment or parsed.path not in {"", "/"}
            or len(secret) < 32 or not platforms
            or any(not p or ":" in p for p in platforms)):
        raise ValueError("请配置 HTTPS 网站、至少 32 字符的密钥和微信平台实例 ID")
    return url.rstrip("/")


def private_sender(platform: str, sender: str, origin: str, allowed: list[str]) -> dict:
    if platform not in allowed or not sender or origin != f"{platform}:FriendMessage:{sender}":
        raise ValueError("请在已配置的微信机器人私聊中操作")
    return {"platform_id": platform, "sender_id": sender, "origin": origin}


class HttpBridge:
    def __init__(self, session, url: str, secret: str):
        self.session, self.url, self.secret = session, url, secret

    async def post(self, route: str, payload: dict):
        try:
            async with self.session.post(
                self.url + "/api/v1/integrations/astrbot" + route,
                headers={"Authorization": "Bearer " + self.secret},
                json=payload, allow_redirects=False,
            ) as response:
                if response.status != 200:
                    raise BridgeError(f"网站拒绝请求（HTTP {response.status}），请检查绑定码、配置或稍后重试")
                data = await response.json()
                if not isinstance(data, dict) or "data" not in data:
                    raise BridgeError("网站返回格式异常")
                return data["data"]
        except (BridgeError, asyncio.CancelledError):
            raise
        except Exception:
            raise BridgeError("网站暂时不可达，请稍后重试") from None


class DeliveryLedger:
    def __init__(self, path: Path):
        path.parent.mkdir(parents=True, exist_ok=True)
        self.db = sqlite3.connect(path)
        self.db.execute("CREATE TABLE IF NOT EXISTS delivered (id TEXT PRIMARY KEY, sent_at REAL NOT NULL)")
        self.db.commit()

    def contains(self, delivery_id: str) -> bool:
        return self.db.execute("SELECT 1 FROM delivered WHERE id=?", (delivery_id,)).fetchone() is not None

    def record(self, delivery_id: str):
        self.db.execute("INSERT OR IGNORE INTO delivered VALUES (?,?)", (delivery_id, time.time()))
        self.db.commit()

    def cleanup(self):
        # Server leases expire after two minutes; 35 days exceeds the website history window.
        self.db.execute("DELETE FROM delivered WHERE sent_at < ?", (time.time() - 35 * 86400,))
        self.db.commit()

    def close(self):
        self.db.close()


class DeliveryWorker:
    def __init__(self, bridge, ledger: DeliveryLedger, platforms: list[str], send):
        self.bridge, self.ledger, self.platforms, self.send = bridge, ledger, platforms, send

    async def once(self):
        self.ledger.cleanup()
        leases = await self.bridge.post("/deliveries/lease", {"platform_ids": self.platforms})
        for item in leases:
            delivery_id, token = item["id"], item["token"]
            route = "/deliveries/" + delivery_id
            if self.ledger.contains(delivery_id):
                await self.bridge.post(route + "/ack", {"token": token, "success": True})
                continue
            payload = await self.bridge.post(route + "/authorize", {"token": token})
            if not payload.get("send"):
                continue
            origin, text = payload.get("origin", ""), payload.get("text", "")
            parts = origin.split(":", 2)
            if len(parts) != 3 or parts[0] not in self.platforms or parts[1] != "FriendMessage" or not parts[2] or not text:
                raise BridgeError("网站返回了无效的私聊目标")
            try:
                delivered = await self.send(origin, text)
                if delivered is not True:
                    raise BridgeError("微信平台未接受发送")
            except asyncio.CancelledError:
                raise
            except Exception:
                await self.bridge.post(route + "/ack", {"token": token, "success": False})
                continue
            # Keep provider send and durable receipt adjacent. Ack failure never causes a new send.
            self.ledger.record(delivery_id)
            await self.bridge.post(route + "/ack", {"token": token, "success": True})
