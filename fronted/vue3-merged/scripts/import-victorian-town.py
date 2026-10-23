"""Convert bluecarrot16's complete Tiled town, without generating a new layout.

Requires Pillow from the existing Python environment. See the output README for
the original archive and license. Run with --source <extracted pack directory>.
"""
import argparse
import base64
import hashlib
import json
import math
import shutil
import struct
import xml.etree.ElementTree as ET
import zlib
from collections import Counter, deque
from pathlib import Path

from PIL import Image, ImageChops

PAGE = "https://opengameart.org/content/lpc-victorian-town-decorations"
ARCHIVE = "https://opengameart.org/sites/default/files/lpc-victorian-preview-see-readme.zip"
SIZE, COLUMNS = 32, 32


def convert(source, output, data_output, archive=None):
    source = source.resolve()
    output.mkdir(parents=True, exist_ok=True)
    data_output.mkdir(parents=True, exist_ok=True)

    def local(name):
        path = (source / name).resolve()
        if not path.is_relative_to(source):
            raise ValueError("Source references a file outside the downloaded pack")
        return path

    tree = ET.parse(local("victorian-preview.tmx")).getroot()
    width, height = int(tree.get("width")), int(tree.get("height"))
    assert (width, height, tree.get("tilewidth"), tree.get("tileheight")) == (128, 128, "32", "32")
    tilesets = []
    for element in tree.findall("tileset"):
        definition = ET.parse(local(element.get("source"))).getroot() if element.get("source") else element
        image_info = definition.find("image")
        image = Image.open(local(image_info.get("source"))).convert("RGBA")
        if image_info.get("trans"):
            key = tuple(bytes.fromhex(image_info.get("trans")))
            difference = ImageChops.difference(image.convert("RGB"), Image.new("RGB", image.size, key))
            r, g, b = difference.split()
            mask = ImageChops.lighter(ImageChops.lighter(r, g), b).point(lambda n: 255 if n else 0)
            image.putalpha(ImageChops.multiply(image.getchannel("A"), mask))
        tilesets.append({"first": int(element.get("firstgid")), "columns": int(definition.get("columns")), "name": definition.get("name"), "image": image})

    layers = []
    for element in tree.findall("layer"):
        data = element.find("data")
        assert data.get("encoding") == "base64" and data.get("compression") == "zlib"
        decoder = zlib.decompressobj()
        decoded = decoder.decompress(base64.b64decode(data.text), width * height * 4 + 1)
        assert len(decoded) == width * height * 4 and decoder.eof
        layers.append((element.get("name"), struct.unpack(f"<{width * height}I", decoded)))
    assert [name for name, _ in layers] == ["Trn_1", "Trn_2", "Trn_3", "Bldg_1", "Bldg_2", "Bldg_3", "Bldg_4"]
    tile_cache = {}

    def tile(gid):
        if gid not in tile_cache:
            clean = gid & 0x1FFFFFFF
            ts = next(ts for ts in reversed(tilesets) if ts["first"] <= clean)
            index = clean - ts["first"]
            x, y = index % ts["columns"] * SIZE, index // ts["columns"] * SIZE
            cell = ts["image"].crop((x, y, x + SIZE, y + SIZE))
            if gid & 0x20000000:
                cell = cell.transpose(Image.Transpose.TRANSPOSE)
            if gid & 0x80000000:
                cell = cell.transpose(Image.Transpose.FLIP_LEFT_RIGHT)
            if gid & 0x40000000:
                cell = cell.transpose(Image.Transpose.FLIP_TOP_BOTTOM)
            solid = sum(count for alpha, count in enumerate(cell.getchannel("A").histogram()) if alpha >= 180) > 24
            tile_cache[gid] = (cell, ts["name"], solid)
        return tile_cache[gid]

    cells, blocked, ground, objects = [], [], [], []
    counts = Counter()
    for group, target in [(layers[:3], ground), (layers[3:], objects)]:
        seen = {}
        for i in range(width * height):
            cell = Image.new("RGBA", (SIZE, SIZE))
            solid, present = False, False
            for layer_name, data in group:
                gid = data[i]
                if not gid:
                    continue
                fragment, category, fragment_solid = tile(gid)
                cell.alpha_composite(fragment)
                present = present or bool(fragment.getbbox())
                # Terrain overlays contain trees, hedges and building foundations;
                # brick and street transition tiles remain walkable ground.
                candidate = layer_name.startswith("Bldg") or (layer_name != "Trn_1" and category not in ["bricks", "vstreets"])
                solid = solid or (candidate and fragment_solid)
            if target is objects and not present:
                target.append(-1)
                continue
            solid = solid or (target is ground and not present)
            key = (cell.tobytes(), solid)
            if key not in seen:
                seen[key] = len(cells)
                if solid:
                    blocked.append(len(cells))
                cells.append(cell)
            target.append(seen[key])
            counts[target[-1]] += 1
        if target is ground:
            ground_count = len(cells)

    atlas = Image.new("RGBA", (COLUMNS * SIZE, math.ceil(len(cells) / COLUMNS) * SIZE))
    for index, cell in enumerate(cells):
        atlas.paste(cell, (index % COLUMNS * SIZE, index // COLUMNS * SIZE))
    atlas.save(output / "atlas.png", optimize=True)
    blocked_set = set(blocked)

    def walkable(index):
        return ground[index] not in blocked_set and objects[index] not in blocked_set

    def neighbors(index):
        x, y = index % width, index // width
        for dx, dy in [(0, 1), (1, 0), (0, -1), (-1, 0)]:
            nx, ny = x + dx, y + dy
            if 0 <= nx < width and 0 <= ny < height:
                yield ny * width + nx

    remaining = {i for i in range(width * height) if walkable(i)}
    largest = set()
    while remaining:
        start = min(remaining)
        component, queue = {start}, deque([start])
        remaining.remove(start)
        while queue:
            for index in neighbors(queue.popleft()):
                if index in remaining:
                    remaining.remove(index)
                    component.add(index)
                    queue.append(index)
        if len(component) > len(largest):
            largest = component
    assert len(largest) > 4000, "Town streets must have a substantial connected walkable region"
    reserved = set()

    def approach(x, y):
        index = min(largest - reserved, key=lambda n: (abs(n % width - x) + abs(n // width - y), n))
        assert abs(index % width - x) + abs(index // width - y) <= 8, (x, y, index)
        reserved.add(index)
        return {"x": index % width, "y": index // width}

    spawn = approach(55, 51)
    events = []

    def event(id, x, y, kind, title, text, destination="", color="blue", quest=False):
        events.append({"id": id, **approach(x, y), "kind": kind, "title": title, "text": text, "destination": destination, "color": color, "quest": quest})

    event("clock", 55, 52, "sign", "钟楼广场导览", "欢迎来到钟楼广场！往北可以拜访图书馆和旧礼拜堂，往南有热闹的集市，东边则是喷泉公园。\n点击下方散步清单，可以沿街自动走到想去的地方。")
    event("chapel", 6, 10, "door", "旧礼拜堂", "离开热闹的广场，沿着北边小路来到钟楼下。镇民把这里作为安静的礼拜堂：长椅、晨钟与庭院，为一天留出一点平静。", color="gold", quest=True)
    event("library", 56, 17, "door", "市立图书馆", "红砖大楼前，馆长 Haru 刚把今天归还的书排好。这里可以连接 AIHub 原有的图书馆场景，特殊 AI NPC 仍沿用管理员权限。", "library", quest=True)
    event("market", 65, 103, "sign", "街角集市", "玻璃棚下摆着水果、面包和鲜花，居民们正在挑选晚餐食材。这是原始示例里完整布置的市场街区。你在这里逛了一圈，记住了回广场的路。", color="gold", quest=True)
    event("park", 106, 88, "sign", "喷泉公园", "喷泉旁的小路通向树荫和长椅。这里适合散步、看书，也适合什么都不做地坐一会儿。你已经把街区的四个地方走遍了。", color="green", quest=True)
    event("finance", 61, 108, "door", "集市账房", "摊主把收据整理进账本。你也可以在这里打开自己的账房库，查看已有的账户和收支。", "finance_vault", "gold")
    event("home", 102, 59, "door", "蓝屋住宅", "门廊边的花盆迎着午后阳光。把这幢房子当作你在街区的落脚处吧。", "home_gate", "rose")
    event("neighbor", 51, 48, "npc", "街区向导", "欢迎来到这张由原作者完整绘制的街区。地图比之前大了许多：用鼠标点击道路寻路，或开全景看看方向。编辑器里的吸管可以取用现有瓦片。", color="rose")
    event("teacher", 62, 52, "npc", "老师 · Sora", "街区里的每扇窗后，都可能有一段日常。如果想继续学习，我可以带你打开教室场景。", "classroom")
    result = {"version": 1, "tileset": "lpc-victorian", "name": "维多利亚生活街区", "width": width, "height": height, "ground": ground, "objects": objects, "collision": [-1] * (width * height), "spawn": spawn, "events": events}
    manifest = {"id": "lpc-victorian", "sourceSize": SIZE, "columns": COLUMNS, "tileCount": len(cells), "groundCount": ground_count, "blocked": blocked, "groundPalette": [i for i, _ in counts.most_common() if i < ground_count and i not in blocked_set][:12], "objectPalette": sorted({i for i in objects if i >= 0}), "sourceMapSha256": hashlib.sha256(local("victorian-preview.tmx").read_bytes()).hexdigest(), "sourceArchiveSha256": hashlib.sha256(archive.read_bytes()).hexdigest() if archive else None, "sourcePage": PAGE, "sourceDownload": ARCHIVE, "originalLayers": [name for name, _ in layers], "connectedWalkableCells": len(largest)}
    (data_output / "victorian-map.json").write_text(json.dumps(result, ensure_ascii=False, separators=(",", ":")) + "\n", encoding="utf-8")
    (data_output / "victorian-tileset.json").write_text(json.dumps(manifest, ensure_ascii=False, separators=(",", ":")) + "\n", encoding="utf-8")
    (output / "map.json").write_text(json.dumps(result, ensure_ascii=False, separators=(",", ":")) + "\n", encoding="utf-8")
    source_output = output / "source"
    source_output.mkdir(exist_ok=True)
    credit_sections = []
    for path in sorted(source.glob("CREDITS-*.txt")):
        shutil.copyfile(path, source_output / path.name)
        credit_sections.append(f"\n\n{'=' * 72}\n{path.name}\n{'=' * 72}\n\n{path.read_text(encoding='utf-8')}")
    for pattern in ["*.tmx", "*.tsx", "README.txt"]:
        for path in sorted(source.glob(pattern)):
            shutil.copyfile(path, source_output / path.name)
    (output / "CREDITS.txt").write_text("LPC Victorian Town Preview\nSource: " + PAGE + "\nOriginal download: " + ARCHIVE + "\n\nOriginal artwork: CC BY-SA 4.0. Original Tiled XML data: CC0.\nConversion: source terrain/building layers are composited into two cell layers, with no layout changes. Collision, spawn, dialogue, resident figures and building roles are application additions, not claims about the original artwork. Adapted artwork remains CC BY-SA 4.0.\n\nComplete original credits follow, unabridged:\n" + "".join(credit_sections), encoding="utf-8")
    print(json.dumps({"size": [width, height], "tiles": len(cells), "groundTiles": ground_count, "atlasBytes": (output / 'atlas.png').stat().st_size, "connectedWalkableCells": len(largest), "spawn": spawn, "events": [{"id": e['id'], "x": e['x'], "y": e['y']} for e in events]}, ensure_ascii=False))


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--source", type=Path, required=True)
    parser.add_argument("--archive", type=Path)
    parser.add_argument("--output", type=Path, default=Path(__file__).resolve().parents[1] / "public/town/victorian")
    parser.add_argument("--data-output", type=Path, default=Path(__file__).resolve().parents[1] / "src/components/town/data")
    args = parser.parse_args()
    convert(args.source, args.output, args.data_output, args.archive)
