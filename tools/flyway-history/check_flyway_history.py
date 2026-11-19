"""Check a candidate against an explicitly selected Flyway release tree."""
import argparse
import re
import subprocess
from pathlib import PurePosixPath

root = "apps/monolith-app/src/main/resources/monolith/db"
locations = {root + "/migration", root + "/migration-pg", "modules/content-module/src/main/resources/db/migration"}
pattern = re.compile(r"V(\d+(?:[._]\d+)*)__.+\.sql")

def migrations(ref):
    out = subprocess.check_output(["git", "ls-tree", "-r", "-z", ref, "--", *sorted(locations)])
    entries = {}
    for item in out.decode("utf-8").split("\0"):
        if not item:
            continue
        meta, name = item.split("\t", 1)
        p = PurePosixPath(name)
        if str(p.parent) not in locations or p.suffix != ".sql" or not p.name.startswith("V"):
            continue
        m = pattern.fullmatch(p.name)
        if not m:
            raise ValueError(f"Invalid versioned migration name: {name}")
        version = tuple(map(int, re.split(r"[._]", m[1])))
        while len(version) > 1 and version[-1] == 0:
            version = version[:-1]
        entries[name] = (str(p.parent), version, meta.split()[2])
    return entries

def validate(candidate, base):
    issues, seen, maxima = [], {}, {}
    for path, (location, version, _) in base.items():
        maxima[location] = max(version, maxima.get(location, ()))
        if path not in candidate or candidate[path] != base[path]:
            issues.append(f"Release migration changed or missing: {path}")
    if set(maxima) != locations:
        issues.append("The reference release must contain all managed migration locations.")
    for path, (location, version, _) in candidate.items():
        if (location, version) in seen:
            issues.append(f"Duplicate Flyway version: {seen[location, version]} and {path}")
        seen[location, version] = path
        if path not in base and version <= maxima.get(location, ()):
            issues.append(f"New migration does not follow release tip for its dialect: {path}")
    return issues

def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--against", required=True, help="Verified release Git revision")
    parser.add_argument("--candidate", default="HEAD", help="Candidate Git revision")
    args = parser.parse_args()
    try:
        current, previous = migrations(args.candidate), migrations(args.against)
        issues = validate(current, previous)
    except (subprocess.CalledProcessError, ValueError) as exc:
        parser.exit(2, f"{exc}\n")
    if issues:
        parser.exit(1, "\n".join(issues) + "\n")
    print(f"Flyway history check passed: {len(previous)} unchanged; {len(current)-len(previous)} added.")

if __name__ == "__main__":
    main()
