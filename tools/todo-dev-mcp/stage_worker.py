"""Terminal-only stage worker, using the installed starter's CLI and account boundary."""
import argparse
import json
from pathlib import Path
import subprocess
import sys
import tempfile

sys.path.insert(0, str(Path.home() / "openai-agents-starter"))
import orchestrate as starter

ROLES = {
    "RESEARCH": "归纳需要核对的事实和待解问题。",
    "DESIGN": "列出方案、约束与可验证的验收标准。",
    "IMPLEMENTATION": "给开发者最小实施建议，指出需要人工执行的修改。",
    "VERIFICATION": "列出验收检查，不要声称已运行测试。",
}
FIXTURE_ROLE = dict(zip(ROLES, ("Planner", "Implementation", "Implementation", "Review")))


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("action", choices=["check", "run", "fixture"])
    parser.add_argument("stage", choices=ROLES)
    args = parser.parse_args()
    if args.action != "fixture" and not starter.account_login_ready():
        sys.exit("Starter CLI requires its dedicated ChatGPT login.")
    if args.action == "check":
        return
    task = json.load(sys.stdin)
    if args.action == "fixture":
        import asyncio
        from agents import Agent, Runner, RunConfig, set_tracing_disabled
        set_tracing_disabled(True)
        role = FIXTURE_ROLE[args.stage]
        agent = Agent(name=role, instructions=ROLES[args.stage],
                      model=starter.TextBridge(role, False, 90), tools=[])
        result = asyncio.run(Runner.run(agent, json.dumps(task, ensure_ascii=False), max_turns=1,
                             run_config=RunConfig(tracing_disabled=True)))
        print("离线模拟 · " + result.final_output)
        return
    env, _ = starter.codex_env()
    command = starter.codex_args(starter.find_codex())
    command[-1:-1] = ["--ignore-user-config", "-m", "gpt-6.2-astra"]
    prompt = starter.GUARD + "\n" + ROLES[args.stage] + "\n" + json.dumps(task, ensure_ascii=False)
    with tempfile.TemporaryDirectory(prefix="todo-stage-") as work:
        result = subprocess.run(command, env=env, cwd=work, input=prompt, capture_output=True,
                                encoding="utf-8", errors="replace", timeout=120, shell=False)
    if result.returncode or not (0 < len(result.stdout.strip()) <= 16000):
        sys.exit("Codex did not return a usable stage result.")
    print(result.stdout.strip())


if __name__ == "__main__":
    main()
