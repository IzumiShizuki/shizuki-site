package e9;

import b5.d0;
import c4.g;
import com.cnl.kikoeru.data.db.AppDatabase_Impl;
import ef.u;
import h1.z;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import jc.l;
import n7.k;
import n7.m0;
import ud.n;
import v7.f;
import v7.h;
import v7.i;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f6423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AppDatabase_Impl appDatabase_Impl) {
        super(12, "132ea31b9f1d16457dedf1e76258a869", "689dde1d6e9eb0e3305833eb05d432eb");
        this.f6423d = appDatabase_Impl;
    }

    @Override // c4.g
    public final void a(z7.a aVar) {
        l.e(aVar, "connection");
        n.g(aVar, "CREATE TABLE IF NOT EXISTS `HistoryBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `rj` INTEGER NOT NULL, `sourceId` TEXT NOT NULL DEFAULT '', `releaseTime` TEXT NOT NULL, `tags` TEXT NOT NULL, `vas` TEXT NOT NULL, `circle` TEXT NOT NULL, `nsfw` INTEGER NOT NULL DEFAULT 1, `has_subtitle` INTEGER NOT NULL DEFAULT 0, `icon` TEXT NOT NULL, `name` TEXT NOT NULL, `workJson` TEXT NOT NULL DEFAULT '')");
        n.g(aVar, "CREATE TABLE IF NOT EXISTS `DownloadBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `rj` INTEGER NOT NULL, `sourceId` TEXT NOT NULL DEFAULT '', `releaseTime` TEXT NOT NULL, `tags` TEXT NOT NULL, `vas` TEXT NOT NULL, `circle` TEXT NOT NULL, `nsfw` INTEGER NOT NULL DEFAULT 1, `has_subtitle` INTEGER NOT NULL DEFAULT 0, `icon` TEXT NOT NULL, `name` TEXT NOT NULL, `workJson` TEXT NOT NULL DEFAULT '')");
        n.g(aVar, "CREATE TABLE IF NOT EXISTS `SearchHistoryBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `content` TEXT NOT NULL)");
        n.g(aVar, "CREATE TABLE IF NOT EXISTS `BlacklistBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `value` TEXT NOT NULL)");
        n.g(aVar, "CREATE TABLE IF NOT EXISTS `ManualLRCBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `rj` INTEGER NOT NULL, `sourceId` TEXT NOT NULL DEFAULT '', `name` TEXT NOT NULL, `docName` TEXT NOT NULL, `documentUri` TEXT NOT NULL, `zipInnerPath` TEXT NOT NULL DEFAULT '')");
        n.g(aVar, "CREATE TABLE IF NOT EXISTS `AccountBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server` TEXT NOT NULL, `username` TEXT NOT NULL, `password` TEXT NOT NULL, `token` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
        n.g(aVar, "CREATE TABLE IF NOT EXISTS `LyricBean` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `rj` INTEGER NOT NULL, `sourceId` TEXT NOT NULL DEFAULT '', `nameBin` BLOB NOT NULL, `nameEnc` TEXT, `lyricBin` BLOB NOT NULL, `lyricEnc` TEXT, `duration` INTEGER NOT NULL, `documentUri` TEXT NOT NULL, `zipInnerPath` TEXT NOT NULL DEFAULT '')");
        n.g(aVar, "CREATE INDEX IF NOT EXISTS `index_LyricBean_rj` ON `LyricBean` (`rj`)");
        n.g(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        n.g(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '132ea31b9f1d16457dedf1e76258a869')");
    }

    @Override // c4.g
    public final void b(z7.a aVar) {
        l.e(aVar, "connection");
        n.g(aVar, "DROP TABLE IF EXISTS `HistoryBean`");
        n.g(aVar, "DROP TABLE IF EXISTS `DownloadBean`");
        n.g(aVar, "DROP TABLE IF EXISTS `SearchHistoryBean`");
        n.g(aVar, "DROP TABLE IF EXISTS `BlacklistBean`");
        n.g(aVar, "DROP TABLE IF EXISTS `ManualLRCBean`");
        n.g(aVar, "DROP TABLE IF EXISTS `AccountBean`");
        n.g(aVar, "DROP TABLE IF EXISTS `LyricBean`");
    }

    @Override // c4.g
    public final void c(z7.a aVar) {
        l.e(aVar, "connection");
    }

    @Override // c4.g
    public final void d(z7.a aVar) {
        l.e(aVar, "connection");
        k kVarF = this.f6423d.f();
        m0 m0Var = kVarF.f15519b;
        m0Var.getClass();
        z7.c cVarD0 = aVar.d0("PRAGMA query_only");
        try {
            cVarD0.Z();
            boolean z10 = cVarD0.z();
            gh.g.m(cVarD0, null);
            if (!z10) {
                n.g(aVar, "PRAGMA temp_store = MEMORY");
                n.g(aVar, "PRAGMA recursive_triggers = 1");
                n.g(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (m0Var.f15545d) {
                    n.g(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    n.g(aVar, u.h0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false));
                }
                d0 d0Var = m0Var.f15549h;
                ReentrantLock reentrantLock = (ReentrantLock) d0Var.f1521b;
                reentrantLock.lock();
                try {
                    d0Var.f1520a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (kVarF.f15524g) {
            }
        } finally {
        }
    }

    @Override // c4.g
    public final void e(z7.a aVar) {
        l.e(aVar, "connection");
    }

    @Override // c4.g
    public final void f(z7.a aVar) {
        l.e(aVar, "connection");
        wb.b bVarL = ud.b.l();
        z7.c cVarD0 = aVar.d0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarD0.Z()) {
            try {
                bVarL.add(cVarD0.M(0));
            } finally {
            }
        }
        gh.g.m(cVarD0, null);
        ListIterator listIterator = ud.b.g(bVarL).listIterator(0);
        while (true) {
            z zVar = (z) listIterator;
            if (!zVar.hasNext()) {
                return;
            }
            String str = (String) zVar.next();
            if (u.k0(str, "room_fts_content_sync_", false)) {
                n.g(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // c4.g
    public final k5.d g(z7.a aVar) {
        l.e(aVar, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new f(1, 1, "id", "INTEGER", null, true));
        linkedHashMap.put("timestamp", new f(0, 1, "timestamp", "INTEGER", null, true));
        linkedHashMap.put("rj", new f(0, 1, "rj", "INTEGER", null, true));
        linkedHashMap.put("sourceId", new f(0, 1, "sourceId", "TEXT", "''", true));
        linkedHashMap.put("releaseTime", new f(0, 1, "releaseTime", "TEXT", null, true));
        linkedHashMap.put("tags", new f(0, 1, "tags", "TEXT", null, true));
        linkedHashMap.put("vas", new f(0, 1, "vas", "TEXT", null, true));
        linkedHashMap.put("circle", new f(0, 1, "circle", "TEXT", null, true));
        linkedHashMap.put("nsfw", new f(0, 1, "nsfw", "INTEGER", "1", true));
        linkedHashMap.put("has_subtitle", new f(0, 1, "has_subtitle", "INTEGER", "0", true));
        linkedHashMap.put("icon", new f(0, 1, "icon", "TEXT", null, true));
        linkedHashMap.put("name", new f(0, 1, "name", "TEXT", null, true));
        linkedHashMap.put("workJson", new f(0, 1, "workJson", "TEXT", "''", true));
        i iVar = new i("HistoryBean", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        i iVarZ = n.z(aVar, "HistoryBean");
        if (!iVar.equals(iVarZ)) {
            return new k5.d("HistoryBean(com.cnl.kikoeru.data.bean.HistoryBean).\n Expected:\n" + iVar + "\n Found:\n" + iVarZ, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new f(1, 1, "id", "INTEGER", null, true));
        linkedHashMap2.put("timestamp", new f(0, 1, "timestamp", "INTEGER", null, true));
        linkedHashMap2.put("rj", new f(0, 1, "rj", "INTEGER", null, true));
        linkedHashMap2.put("sourceId", new f(0, 1, "sourceId", "TEXT", "''", true));
        linkedHashMap2.put("releaseTime", new f(0, 1, "releaseTime", "TEXT", null, true));
        linkedHashMap2.put("tags", new f(0, 1, "tags", "TEXT", null, true));
        linkedHashMap2.put("vas", new f(0, 1, "vas", "TEXT", null, true));
        linkedHashMap2.put("circle", new f(0, 1, "circle", "TEXT", null, true));
        linkedHashMap2.put("nsfw", new f(0, 1, "nsfw", "INTEGER", "1", true));
        linkedHashMap2.put("has_subtitle", new f(0, 1, "has_subtitle", "INTEGER", "0", true));
        linkedHashMap2.put("icon", new f(0, 1, "icon", "TEXT", null, true));
        linkedHashMap2.put("name", new f(0, 1, "name", "TEXT", null, true));
        linkedHashMap2.put("workJson", new f(0, 1, "workJson", "TEXT", "''", true));
        i iVar2 = new i("DownloadBean", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        i iVarZ2 = n.z(aVar, "DownloadBean");
        if (!iVar2.equals(iVarZ2)) {
            return new k5.d("DownloadBean(com.cnl.kikoeru.data.bean.DownloadBean).\n Expected:\n" + iVar2 + "\n Found:\n" + iVarZ2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new f(1, 1, "id", "INTEGER", null, true));
        linkedHashMap3.put("timestamp", new f(0, 1, "timestamp", "INTEGER", null, true));
        linkedHashMap3.put("content", new f(0, 1, "content", "TEXT", null, true));
        i iVar3 = new i("SearchHistoryBean", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        i iVarZ3 = n.z(aVar, "SearchHistoryBean");
        if (!iVar3.equals(iVarZ3)) {
            return new k5.d("SearchHistoryBean(com.cnl.kikoeru.data.bean.SearchHistoryBean).\n Expected:\n" + iVar3 + "\n Found:\n" + iVarZ3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new f(1, 1, "id", "INTEGER", null, true));
        linkedHashMap4.put("type", new f(0, 1, "type", "TEXT", null, true));
        linkedHashMap4.put("value", new f(0, 1, "value", "TEXT", null, true));
        i iVar4 = new i("BlacklistBean", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
        i iVarZ4 = n.z(aVar, "BlacklistBean");
        if (!iVar4.equals(iVarZ4)) {
            return new k5.d("BlacklistBean(com.cnl.kikoeru.data.bean.BlacklistBean).\n Expected:\n" + iVar4 + "\n Found:\n" + iVarZ4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("id", new f(1, 1, "id", "INTEGER", null, true));
        linkedHashMap5.put("rj", new f(0, 1, "rj", "INTEGER", null, true));
        linkedHashMap5.put("sourceId", new f(0, 1, "sourceId", "TEXT", "''", true));
        linkedHashMap5.put("name", new f(0, 1, "name", "TEXT", null, true));
        linkedHashMap5.put("docName", new f(0, 1, "docName", "TEXT", null, true));
        linkedHashMap5.put("documentUri", new f(0, 1, "documentUri", "TEXT", null, true));
        linkedHashMap5.put("zipInnerPath", new f(0, 1, "zipInnerPath", "TEXT", "''", true));
        i iVar5 = new i("ManualLRCBean", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
        i iVarZ5 = n.z(aVar, "ManualLRCBean");
        if (!iVar5.equals(iVarZ5)) {
            return new k5.d("ManualLRCBean(com.cnl.kikoeru.data.bean.ManualLRCBean).\n Expected:\n" + iVar5 + "\n Found:\n" + iVarZ5, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new f(1, 1, "id", "INTEGER", null, true));
        linkedHashMap6.put("server", new f(0, 1, "server", "TEXT", null, true));
        linkedHashMap6.put("username", new f(0, 1, "username", "TEXT", null, true));
        linkedHashMap6.put("password", new f(0, 1, "password", "TEXT", null, true));
        linkedHashMap6.put("token", new f(0, 1, "token", "TEXT", null, true));
        linkedHashMap6.put("timestamp", new f(0, 1, "timestamp", "INTEGER", null, true));
        i iVar6 = new i("AccountBean", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
        i iVarZ6 = n.z(aVar, "AccountBean");
        if (!iVar6.equals(iVarZ6)) {
            return new k5.d("AccountBean(com.cnl.kikoeru.data.bean.AccountBean).\n Expected:\n" + iVar6 + "\n Found:\n" + iVarZ6, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new f(1, 1, "id", "INTEGER", null, true));
        linkedHashMap7.put("rj", new f(0, 1, "rj", "INTEGER", null, true));
        linkedHashMap7.put("sourceId", new f(0, 1, "sourceId", "TEXT", "''", true));
        linkedHashMap7.put("nameBin", new f(0, 1, "nameBin", "BLOB", null, true));
        linkedHashMap7.put("nameEnc", new f(0, 1, "nameEnc", "TEXT", null, false));
        linkedHashMap7.put("lyricBin", new f(0, 1, "lyricBin", "BLOB", null, true));
        linkedHashMap7.put("lyricEnc", new f(0, 1, "lyricEnc", "TEXT", null, false));
        linkedHashMap7.put("duration", new f(0, 1, "duration", "INTEGER", null, true));
        linkedHashMap7.put("documentUri", new f(0, 1, "documentUri", "TEXT", null, true));
        linkedHashMap7.put("zipInnerPath", new f(0, 1, "zipInnerPath", "TEXT", "''", true));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new h("index_LyricBean_rj", false, ud.b.w("rj"), ud.b.w("ASC")));
        i iVar7 = new i("LyricBean", linkedHashMap7, linkedHashSet, linkedHashSet2);
        i iVarZ7 = n.z(aVar, "LyricBean");
        if (iVar7.equals(iVarZ7)) {
            return new k5.d(null, true);
        }
        return new k5.d("LyricBean(com.cnl.kikoeru.data.bean.LyricBean).\n Expected:\n" + iVar7 + "\n Found:\n" + iVarZ7, false);
    }
}
