"""Build a Todo-only overlay from a verified production Spring Boot JAR.

This script does not build, upload, run, or replace Docker images. Run it only
after compiling the candidate's merged DJ gateway classes.
"""

import argparse
import copy
import hashlib
from io import BytesIO
import json
from pathlib import Path
import re
from zipfile import ZipFile, ZipInfo, ZIP_DEFLATED, ZIP_STORED

SITE = "io/github/shizuki/site/"
FILTER = SITE + "monolith/filter/AuthEntryFilter"
BOOT_CLASSES = "BOOT-INF/classes/"
BOOT_LIB = "BOOT-INF/lib/"
MONO_CLASSES = "apps/monolith-app/target/classes"
CONTENT_CLASSES = "modules/content-module/target/classes"
MODEL_CLASSES = "model/target/classes"
MIGRATIONS = (
    "monolith/db/migration-pg/V1106.1__light_app_todo_dev_workflow.sql",
    "monolith/db/migration-pg/V1106.2__mcp_account_token.sql",
)
MODEL_NAMES = tuple(SITE + "content/entity/" + n + ".class" for n in (
    "LightAppTodoDevEntity", "LightAppTodoDevEventEntity",
))
MAPPER_NAMES = tuple(SITE + "content/mapper/" + n + ".class" for n in (
    "LightAppTodoMapper", "LightAppTodoDevMapper", "LightAppTodoDevEventMapper",
))
CONTENT_REQUIRED = tuple(SITE + "content/" + n + ".class" for n in (
    "mcp/AccountMcpTokenController", "mcp/AccountMcpTokenRepository", "mcp/AccountMcpTokenService",
    "tododev/TodoDevContract", "tododev/TodoDevController", "tododev/TodoDevCredential",
    "tododev/TodoDevService",
))
FILTER_CLASS = re.compile(re.escape(FILTER) + r"(?:\$[\w$]+)?\.class")
PG_MIGRATION = re.compile(r"V(\d+(?:[._]\d+)*)__.+\.sql")


def check_rollback_migrations(paths):
    # The old package must see both added versions as "future" after rollback.
    directory, first = MIGRATIONS[0].rsplit("/", 1)
    limit = tuple(map(int, PG_MIGRATION.fullmatch(first)[1].split(".")))
    prefix = BOOT_CLASSES + directory + "/"
    for path in sorted(paths):
        match = PG_MIGRATION.fullmatch(path.rsplit("/", 1)[-1]) if path.startswith(prefix) else None
        if match and tuple(map(int, re.split(r"[._]", match[1]))) >= limit:
            raise ValueError(f"Base migration conflicts with image rollback: {path}")


def sha(data):
    return hashlib.sha256(data).hexdigest()


def file_sha(path):
    with path.open("rb") as file:
        return hashlib.file_digest(file, "sha256").hexdigest()


def names(archive):
    listed = archive.namelist()
    if len(listed) != len(set(listed)):
        raise ValueError("Duplicate ZIP entries")
    return set(listed)


def library(archive, prefix):
    result = [name for name in archive.namelist()
              if name.startswith(BOOT_LIB + prefix) and name.endswith(".jar")]
    if len(result) != 1 or archive.getinfo(result[0]).compress_type != ZIP_STORED:
        raise ValueError(f"Expected one ZIP_STORED library: {prefix}")
    return result[0]


def read_required(root, expected):
    return {name: (root / name).read_bytes() for name in expected}


def class_files(root, names_within):
    result = {}
    for base in names_within:
        for path in (root / base).glob("*.class"):
            result[path.relative_to(root).as_posix()] = path.read_bytes()
    return result


def merge_archive(old, new, changes, expected_replaced):
    seen = names(old)
    if seen & changes.keys() != set(expected_replaced):
        raise ValueError("Existing archive paths differ from the expected narrow overlay")
    new.comment = old.comment
    for entry in old.infolist():
        data = changes[entry.filename] if entry.filename in changes else old.read(entry.filename)
        new.writestr(copy.copy(entry), data)
    for name in sorted(changes.keys() - seen):
        entry = ZipInfo(name)
        entry.compress_type = ZIP_DEFLATED
        new.writestr(entry, changes[name])


def verify_archive(old, new, changes):
    old_names, new_names = names(old), names(new)
    if new_names != old_names | changes.keys():
        raise ValueError("Archive entries have been omitted or unexpectedly added")
    for name in old_names - changes.keys():
        if new.getinfo(name).compress_type != old.getinfo(name).compress_type or new.read(name) != old.read(name):
            raise ValueError(f"Unrelated archive member changed: {name}")
    for name, data in changes.items():
        if new.read(name) != data:
            raise ValueError(f"Overlay member did not verify: {name}")
    return {"added": sorted(changes.keys() - old_names), "replaced": sorted(changes.keys() & old_names),
            "preserved": len(old_names - changes.keys())}


def nested(old_bytes, changes, replaced):
    mem = BytesIO()
    with ZipFile(BytesIO(old_bytes)) as old, ZipFile(mem, "w") as new:
        merge_archive(old, new, changes, replaced)
    payload = mem.getvalue()
    with ZipFile(BytesIO(old_bytes)) as old, ZipFile(BytesIO(payload)) as new:
        return payload, verify_archive(old, new, changes)


def overlay(base, expected_sha, candidate, output, proof):
    baseline_sha = file_sha(base)
    if baseline_sha != expected_sha.lower():
        raise ValueError(f"Production base checksum mismatch: observed {baseline_sha}")
    base, output, proof = map(Path.resolve, (base, output, proof))
    if len({base, output, proof}) != 3 or output.exists() or proof.exists():
        raise ValueError("Output and proof must be two new paths distinct from the base")
    monolith = candidate / MONO_CLASSES
    content_root = candidate / CONTENT_CLASSES
    model = read_required(candidate / MODEL_CLASSES, MODEL_NAMES)
    content = class_files(content_root, (SITE + "content/mcp", SITE + "content/tododev"))
    if not set(CONTENT_REQUIRED) <= content.keys():
        raise ValueError("Incomplete account/Todo compiled classes")
    content.update(read_required(content_root, MAPPER_NAMES))
    filters = {name: (monolith / name).read_bytes() for name in (
        path.relative_to(monolith).as_posix() for path in (monolith / Path(FILTER).parent).glob("AuthEntryFilter*.class")
    ) if FILTER_CLASS.fullmatch(name)}
    if FILTER + ".class" not in filters:
        raise ValueError("Missing compiled DJ+Todo auth filter")
    outer = {BOOT_CLASSES + name: data for name, data in read_required(monolith, MIGRATIONS).items()}
    outer.update({BOOT_CLASSES + name: data for name, data in filters.items()})
    with ZipFile(base) as old:
        base_names = names(old)
        check_rollback_migrations(base_names)
        filter_paths = {BOOT_CLASSES + name for name in filters}
        old_filter_paths = {name for name in base_names if name.startswith(BOOT_CLASSES)
                            and FILTER_CLASS.fullmatch(name.removeprefix(BOOT_CLASSES))}
        if filter_paths != old_filter_paths:
            raise ValueError("Merged filter generated a different class family")
        content_name = library(old, "content-service-")
        model_name = library(old, "site-model-")
        outer[content_name], content_proof = nested(old.read(content_name), content, MAPPER_NAMES[:1])
        outer[model_name], model_proof = nested(old.read(model_name), model, ())
        with output.open("xb") as output_file, ZipFile(output_file, "w") as new:
            merge_archive(old, new, outer, filter_paths | {content_name, model_name})
        with ZipFile(output) as result:
            outer_proof = verify_archive(old, result, outer)
            assert library(result, "content-service-") == content_name
            assert library(result, "site-model-") == model_name
    details = {"base_sha256": baseline_sha, "output_sha256": file_sha(output), "outer": outer_proof,
               "content": content_proof, "model": model_proof,
               "changes_sha256": {name: sha(data) for name, data in sorted(outer.items())}}
    with proof.open("x", encoding="utf-8") as evidence:
        json.dump(details, evidence, indent=2)
        evidence.write("\n")
    return details


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("base_jar", type=Path)
    parser.add_argument("base_sha256")
    parser.add_argument("candidate_source", type=Path)
    parser.add_argument("output_jar", type=Path)
    parser.add_argument("proof", type=Path)
    opts = parser.parse_args()
    details = overlay(opts.base_jar, opts.base_sha256, opts.candidate_source, opts.output_jar, opts.proof)
    print(details["output_sha256"])


if __name__ == "__main__":
    main()
