import argparse
import json
import shutil
import sqlite3
import subprocess
from datetime import datetime, timedelta, timezone
from pathlib import Path

from dissect.extfs import ExtFS


DEFAULT_VHD_PATH = Path(r"D:\Program Files\Tencent\Androws\Image\data.vhd")
DEFAULT_VBOX_IMG_PATH = Path(r"D:\Program Files\Tencent\Androws\Application\5.10.6500.6116\AndrowsBox\vbox-img.exe")
DEFAULT_WORK_DIR = Path(r"D:\program\shizuki-site\data\qianji-sync\android-work")
DEFAULT_OUTPUT_PATH = Path(r"D:\program\shizuki-site\data\qianji-sync\android-app-dump\normalized-transactions.json")
DEFAULT_DB_PATH = "/data/com.mutangtech.qianji/databases/qianjiapp"
TZ_SHANGHAI = timezone(timedelta(hours=8))


def parse_args():
    parser = argparse.ArgumentParser(description="Export Qianji Android database into normalized sync transactions.")
    parser.add_argument("--vhd", default=str(DEFAULT_VHD_PATH))
    parser.add_argument("--vbox-img", dest="vbox_img", default=str(DEFAULT_VBOX_IMG_PATH))
    parser.add_argument("--work-dir", default=str(DEFAULT_WORK_DIR))
    parser.add_argument("--output", default=str(DEFAULT_OUTPUT_PATH))
    parser.add_argument("--db-path", default=DEFAULT_DB_PATH)
    return parser.parse_args()


def copy_vhd(source: Path, target: Path):
    target.parent.mkdir(parents=True, exist_ok=True)
    with source.open("rb") as src, target.open("wb") as dst:
        shutil.copyfileobj(src, dst, length=1024 * 1024)


def convert_vhd_to_raw(vbox_img_path: Path, source_vhd: Path, target_raw: Path):
    if target_raw.exists():
        target_raw.unlink()
    subprocess.run(
        [
            str(vbox_img_path),
            "convert",
            "--srcfilename",
            str(source_vhd),
            "--dstfilename",
            str(target_raw),
            "--srcformat",
            "VHD",
            "--dstformat",
            "RAW",
        ],
        check=True,
    )


def extract_file_from_ext(raw_path: Path, ext_path: str, target_path: Path):
    target_path.parent.mkdir(parents=True, exist_ok=True)
    with raw_path.open("rb") as fh:
        fs = ExtFS(fh)
        node = fs.get(ext_path)
        with node.open() as src, target_path.open("wb") as dst:
            dst.write(src.read())


def load_lookup_map(cursor, query, key_field, value_field):
    return {
        row[key_field]: row[value_field]
        for row in cursor.execute(query).fetchall()
    }


def normalize_direction(row):
    target_account = row["TARGETACT"] or ""
    target_id = row["TARGETID"]
    if target_account or (target_id not in (-1, None, 0)):
        return ""
    return "INCOME" if int(row["TYPE"] or 0) == 1 else "EXPENSE"


def build_transactions(db_path: Path):
    conn = sqlite3.connect(str(db_path))
    conn.row_factory = sqlite3.Row
    cur = conn.cursor()

    books = load_lookup_map(cur, "select BOOK_ID, NAME from user_book", "BOOK_ID", "NAME")
    assets = load_lookup_map(cur, "select _ID, NAME from user_asset", "_ID", "NAME")
    categories = load_lookup_map(cur, "select _id, NAME from category", "_id", "NAME")
    bills = cur.execute("select * from user_bill order by TIME asc, _id asc").fetchall()

    transactions = []
    for row in bills:
        direction = normalize_direction(row)
        if not direction:
            continue

        amount = float(row["MONEY"] or 0)
        if amount <= 0:
            continue

        source_account_name = row["FROMACT"] or row["DESCINFO"] or assets.get(row["ASSETID"]) or "钱迹导入"
        source_book_name = books.get(row["bookid"]) or row["BOOK_NAME"] or "日常账本"
        category_name = categories.get(row["CATEGORY_ID"]) or "钱迹导入"
        occurred_at = datetime.fromtimestamp(int(row["TIME"]), TZ_SHANGHAI).strftime("%Y-%m-%dT%H:%M:%S")
        merchant = row["REMARK"] or ""
        raw_payload = {
            "交易ID": str(row["billid"]),
            "账户": source_account_name,
            "账本": source_book_name,
            "分类": category_name,
            "商家": merchant,
        }

        transactions.append(
            {
                "externalId": str(row["billid"]),
                "occurredAt": occurred_at,
                "direction": direction,
                "amount": f"{amount:.2f}",
                "currencyCode": "CNY",
                "counterparty": merchant,
                "categoryHint": category_name,
                "note": f"账户:{source_account_name} | 账本:{source_book_name}" + (f" | 备注:{merchant}" if merchant else ""),
                "rawPayload": json.dumps(raw_payload, ensure_ascii=False),
                "sourceAccountName": source_account_name,
                "sourceBookName": source_book_name,
            }
        )

    conn.close()
    return transactions


def build_assets(db_path: Path):
    conn = sqlite3.connect(str(db_path))
    conn.row_factory = sqlite3.Row
    cur = conn.cursor()

    assets = []
    for row in cur.execute("select NAME, MONEY, CURRENCY, EXTRA from user_asset where STATUS = 0 order by _ID asc").fetchall():
        extra = {}
        try:
            extra = json.loads(row["EXTRA"] or "{}")
        except json.JSONDecodeError:
            extra = {}

        current_balance = float(row["MONEY"] or 0)
        initial_balance = extra.get("initmoney")
        if initial_balance is None:
            initial_balance = current_balance

        assets.append(
            {
                "accountName": row["NAME"] or "",
                "currencyCode": row["CURRENCY"] or "CNY",
                "currentBalance": f"{current_balance:.2f}",
                "initialBalance": f"{float(initial_balance):.2f}",
            }
        )

    conn.close()
    return assets


def main():
    args = parse_args()
    vhd_path = Path(args.vhd)
    vbox_img_path = Path(args.vbox_img)
    work_dir = Path(args.work_dir)
    output_path = Path(args.output)

    if not vhd_path.exists():
        raise FileNotFoundError(f"Missing VHD: {vhd_path}")
    if not vbox_img_path.exists():
        raise FileNotFoundError(f"Missing vbox-img.exe: {vbox_img_path}")

    copied_vhd_path = work_dir / "androws-data-copy.vhd"
    raw_path = work_dir / "androws-data-copy.raw"
    db_dump_path = work_dir / "qianjiapp.sqlite"

    copy_vhd(vhd_path, copied_vhd_path)
    convert_vhd_to_raw(vbox_img_path, copied_vhd_path, raw_path)
    extract_file_from_ext(raw_path, args.db_path, db_dump_path)

    transactions = build_transactions(db_dump_path)
    assets = build_assets(db_dump_path)
    output_path.parent.mkdir(parents=True, exist_ok=True)
    output_path.write_text(
        json.dumps({"transactions": transactions, "assets": assets}, ensure_ascii=False, indent=2),
        encoding="utf-8"
    )

    print(f"qianji-android-db-export count={len(transactions)} assets={len(assets)} db={db_dump_path} output={output_path}")


if __name__ == "__main__":
    main()
