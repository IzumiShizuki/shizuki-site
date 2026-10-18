"""Build a source-only AstrBot upload archive, excluding tests, state and secrets."""
from pathlib import Path
from zipfile import ZipFile, ZIP_DEFLATED

root = Path(__file__).resolve().parent
target = root / "dist" / "astrbot_plugin_shizuki_notifications.zip"
target.parent.mkdir(exist_ok=True)
files = ["main.py", "bridge.py", "metadata.yaml", "_conf_schema.json", "requirements.txt", "README.md"]
with ZipFile(target, "w", ZIP_DEFLATED) as archive:
    for name in files:
        archive.write(root / name, name)
with ZipFile(target) as archive:
    assert archive.testzip() is None
    assert sorted(archive.namelist()) == sorted(files)
print(target)
