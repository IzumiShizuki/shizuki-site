"""Exercise private-command handling with SDK-shaped stubs, without a live bot/account."""
import importlib.util
import sys
import types
import unittest
from pathlib import Path
from unittest.mock import AsyncMock, Mock, patch


def load_plugin():
    api = types.ModuleType("astrbot.api")
    api.AstrBotConfig, api.logger = dict, Mock()
    event = types.ModuleType("astrbot.api.event")
    event.AstrMessageEvent, event.MessageChain = object, object
    event.filter = types.SimpleNamespace(
        EventMessageType=types.SimpleNamespace(ALL="ALL"),
        event_message_type=lambda *args, **kwargs: lambda handler: handler)
    star = types.ModuleType("astrbot.api.star")
    class Star:
        def __init__(self, context): self.context = context
    star.Context, star.Star, star.StarTools = object, Star, object
    star.register = lambda *args: lambda cls: cls
    package = types.ModuleType("notification_plugin_under_test")
    package.__path__ = [str(Path(__file__).resolve().parents[1])]
    modules = {"astrbot": types.ModuleType("astrbot"), "astrbot.api": api,
               "astrbot.api.event": event, "astrbot.api.star": star,
               "notification_plugin_under_test": package, "aiohttp": types.ModuleType("aiohttp")}
    with patch.dict(sys.modules, modules):
        spec = importlib.util.spec_from_file_location("notification_plugin_under_test.main",
            Path(__file__).resolve().parents[1] / "main.py")
        module = importlib.util.module_from_spec(spec)
        spec.loader.exec_module(module)
        return module.ShizukiNotifications


Plugin = load_plugin()


class Event:
    def __init__(self, text, origin="wechat:FriendMessage:reader"):
        self.text, self.unified_msg_origin, self.stopped = text, origin, False
    def get_message_str(self): return self.text
    def get_platform_id(self): return "wechat"
    def get_sender_id(self): return "reader"
    def stop_event(self): self.stopped = True
    def plain_result(self, text): return text


class CommandTests(unittest.IsolatedAsyncioTestCase):
    def setUp(self):
        self.plugin = Plugin(Mock(), {})
        self.plugin.platforms = ["wechat"]
        self.plugin.bridge = types.SimpleNamespace(post=AsyncMock(return_value=True))

    async def test_bind_stops_llm_before_network_and_uses_event_identity(self):
        event = Event("/shizuki_bind WECHAT single-use")
        async def post(route, payload):
            self.assertTrue(event.stopped)
            self.assertEqual(route, "/contact-bindings/confirm")
            self.assertEqual(payload["platform"], "WECHAT")
            self.assertEqual(payload["sender"], {"platform_id": "wechat", "sender_id": "reader",
                                                "origin": "wechat:FriendMessage:reader"})
            return True
        self.plugin.bridge.post.side_effect = post
        result = [r async for r in self.plugin.command(event)]
        self.assertIn("绑定成功", result[0])

    async def test_legacy_binding_command_keeps_working(self):
        event = Event("/shizuki_bind old-code")
        result = [r async for r in self.plugin.command(event)]
        self.assertIn("微信绑定成功", result[0])
        self.plugin.bridge.post.assert_awaited_once_with("/bindings/confirm", {
            "code": "old-code",
            "sender": {"platform_id": "wechat", "sender_id": "reader",
                       "origin": "wechat:FriendMessage:reader"}
        })

    async def test_group_code_never_reaches_network_or_result(self):
        event = Event("/shizuki_bind private-secret", "wechat:GroupMessage:room")
        result = [r async for r in self.plugin.command(event)]
        self.assertTrue(event.stopped)
        self.assertNotIn("private-secret", result[0])
        self.plugin.bridge.post.assert_not_awaited()

    async def test_controls_use_actual_private_origin(self):
        for command, action in [("pause", "PAUSE"), ("resume", "RESUME"), ("unbind", "UNBIND")]:
            event = Event("/shizuki_" + command)
            result = [r async for r in self.plugin.command(event)]
            self.assertTrue(event.stopped)
            self.assertTrue(result)
            self.assertEqual(self.plugin.bridge.post.await_args.args[1]["action"], action)

    async def test_unrelated_messages_continue_normally(self):
        event = Event("普通聊天")
        self.assertEqual([r async for r in self.plugin.command(event)], [])
        self.assertFalse(event.stopped)

    async def test_disabled_plugin_explains_unavailable_without_network(self):
        self.plugin.bridge = None
        event = Event("/shizuki_bind secret")
        result = [r async for r in self.plugin.command(event)]
        self.assertTrue(event.stopped)
        self.assertIn("尚未启用", result[0])
