import asyncio
import tempfile
import unittest
from pathlib import Path
from unittest.mock import AsyncMock

from bridge import BridgeError, DeliveryLedger, DeliveryWorker, HttpBridge, private_sender, validate_config


class BridgeTests(unittest.IsolatedAsyncioTestCase):
    def setUp(self):
        self.directory = tempfile.TemporaryDirectory()
        self.path = Path(self.directory.name) / "sent.db"
        self.ledger = DeliveryLedger(self.path)
        self.bridge = AsyncMock()
        self.send = AsyncMock(return_value=True)
        self.lease = {"id": "delivery-1", "token": "secret-lease"}
        self.payload = {"send": True, "origin": "wechat:FriendMessage:reader", "text": "文章更新"}
        self.worker = DeliveryWorker(self.bridge, self.ledger, ["wechat"], self.send)

    def tearDown(self):
        self.ledger.close()
        self.directory.cleanup()

    async def test_success_records_before_ack(self):
        async def post(route, payload):
            if route.endswith("/lease"):
                self.assertEqual(payload, {"platform_ids": ["wechat"]})
                return [self.lease]
            if route.endswith("/authorize"):
                return self.payload
            self.assertTrue(self.ledger.contains("delivery-1"))
            self.assertTrue(payload["success"])
        self.bridge.post.side_effect = post
        await self.worker.once()
        self.send.assert_awaited_once_with("wechat:FriendMessage:reader", "文章更新")

    async def test_restart_after_lost_ack_does_not_resend(self):
        self.bridge.post.side_effect = [[self.lease], self.payload, BridgeError("ack unavailable")]
        with self.assertRaises(BridgeError):
            await self.worker.once()
        self.ledger.close()
        self.ledger = DeliveryLedger(self.path)
        self.worker = DeliveryWorker(self.bridge, self.ledger, ["wechat"], self.send)
        self.bridge.post.reset_mock()
        self.bridge.post.side_effect = [[self.lease], True]
        await self.worker.once()
        self.assertEqual(self.send.await_count, 1)
        self.assertNotIn("/authorize", self.bridge.post.await_args_list[-1].args[0])

    async def test_false_provider_result_is_failed_delivery(self):
        self.send.return_value = False
        self.bridge.post.side_effect = [[self.lease], self.payload, True]
        await self.worker.once()
        self.assertFalse(self.ledger.contains("delivery-1"))
        self.assertEqual(self.bridge.post.await_args.args[1]["success"], False)

    async def test_provider_exception_is_retryable_and_not_recorded(self):
        self.send.side_effect = RuntimeError("provider contains private data")
        self.bridge.post.side_effect = [[self.lease], self.payload, True]
        await self.worker.once()
        self.assertFalse(self.ledger.contains("delivery-1"))
        self.assertFalse(self.bridge.post.await_args.args[1]["success"])

    async def test_withdrawn_content_is_never_sent(self):
        self.bridge.post.side_effect = [[self.lease], {"send": False}]
        await self.worker.once()
        self.send.assert_not_awaited()

    async def test_group_destination_is_rejected(self):
        self.payload["origin"] = "wechat:GroupMessage:room"
        self.bridge.post.side_effect = [[self.lease], self.payload]
        with self.assertRaises(BridgeError):
            await self.worker.once()
        self.send.assert_not_awaited()

    async def test_cancellation_does_not_ack_failure(self):
        self.send.side_effect = asyncio.CancelledError()
        self.bridge.post.side_effect = [[self.lease], self.payload]
        with self.assertRaises(asyncio.CancelledError):
            await self.worker.once()
        self.assertEqual(self.bridge.post.await_count, 2)

    def test_private_event_identity_and_configuration(self):
        self.assertEqual(private_sender("wechat", "reader", "wechat:FriendMessage:reader", ["wechat"]),
                         {"platform_id": "wechat", "sender_id": "reader", "origin": "wechat:FriendMessage:reader"})
        for origin in ["wechat:GroupMessage:room", "other:FriendMessage:reader", "wechat:FriendMessage:someone_else"]:
            with self.assertRaises(ValueError):
                private_sender("wechat", "reader", origin, ["wechat"])
        for url in ["http://example.com", "https://user:pass@example.com", "https://example.com/?token=x"]:
            with self.assertRaises(ValueError):
                validate_config(url, "s" * 32, ["wechat"])
        with self.assertRaises(ValueError):
            validate_config("https://example.com", "s" * 32, [])
        self.assertEqual(validate_config("http://127.0.0.1:9999", "s" * 32, ["wechat"]), "http://127.0.0.1:9999")

    async def test_transport_sends_bearer_in_header_and_does_not_follow_redirects(self):
        class Response:
            status = 200
            async def __aenter__(self): return self
            async def __aexit__(self, *args): pass
            async def json(self): return {"data": True}
        class Session:
            def post(inner, url, **options):
                self.assertEqual(url, "https://site.example/api/v1/integrations/astrbot/bindings/confirm")
                self.assertEqual(options["headers"], {"Authorization": "Bearer " + "s" * 32})
                self.assertFalse(options["allow_redirects"])
                self.assertNotIn("s" * 32, url)
                return Response()
        self.assertTrue(await HttpBridge(Session(), "https://site.example", "s" * 32).post("/bindings/confirm", {}))


if __name__ == "__main__":
    unittest.main()
