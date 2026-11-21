"""Exercise the installed SDK's default trace pipeline with its exporter intercepted."""
import contextlib
import io
import json
from pathlib import Path
import sys
from unittest.mock import patch

sys.path.insert(0, str(Path(__file__).resolve().parents[1]))
import stage_worker
from agents import custom_span, set_tracing_disabled, trace
from agents.tracing.processors import BackendSpanExporter, default_processor


def main():
    counts = []

    def record_export(_self, items):
        counts.append(len(items))

    with patch.object(BackendSpanExporter, "export", record_export):
        set_tracing_disabled(False)
        with trace("synthetic control"), custom_span("control span"):
            pass
        default_processor().force_flush()
        if sum(counts) < 2:
            raise AssertionError("Trace exporter positive control did not observe the trace and span")
        control_items = sum(counts)
        counts.clear()
        for stage in stage_worker.ROLES:
            # Start each test with tracing enabled, as in a fresh worker process.
            set_tracing_disabled(False)
            args = ["stage_worker.py", "fixture", stage]
            task = json.dumps({"title": "synthetic task", "handoff": []})
            with patch.object(sys, "argv", args), patch.object(sys, "stdin", io.StringIO(task)):
                with contextlib.redirect_stdout(io.StringIO()) as output:
                    stage_worker.main()
            assert output.getvalue().startswith("离线模拟")
            default_processor().force_flush()
            assert not counts, f"Trace exporter invoked for {stage}"
        print(json.dumps({"stages": list(stage_worker.ROLES), "control_items": control_items,
                          "fixture_export_calls": len(counts), "fixture_export_items": sum(counts)}))


if __name__ == "__main__":
    main()
