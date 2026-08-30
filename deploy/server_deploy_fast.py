"""Deprecated compatibility entry point for the former archive-based deployer.

The old fast path bypassed the standard restore-point and rollback gate. Keep
the filename so existing local shortcuts fail closed into the audited deploy
entry point instead of silently using weaker deployment semantics.
"""

from __future__ import annotations

import sys
from pathlib import Path

sys.path.insert(0, str(Path(__file__).resolve().parent))
import server_deploy


def main() -> int:
    print(
        "[INFO] server_deploy_fast.py is retired; using the guarded server_deploy.py workflow.",
        flush=True,
    )
    return server_deploy.main()


if __name__ == "__main__":
    raise SystemExit(main())
