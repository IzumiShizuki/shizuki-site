package com.tencent.bugly.proguard;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class K extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f4868a = "bugly_db";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f4869b = 15;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f4870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<com.tencent.bugly.a> f4871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Context context, List<com.tencent.bugly.a> list) {
        super(context, f4868a + "_", (SQLiteDatabase.CursorFactory) null, f4869b);
        com.tencent.bugly.crashreport.common.info.a.a(context).getClass();
        this.f4870c = context;
        this.f4871d = list;
    }

    public synchronized boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            String[] strArr = {"t_lr", "t_ui", "t_pf"};
            for (int i10 = 0; i10 < 3; i10++) {
                String str = strArr[i10];
                StringBuilder sb = new StringBuilder();
                sb.append("DROP TABLE IF EXISTS ");
                sb.append(str);
                sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            }
        } catch (Throwable th2) {
            if (!X.a(th2)) {
                th2.printStackTrace();
            }
            return false;
        }
        return true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase readableDatabase;
        readableDatabase = null;
        int i10 = 0;
        while (readableDatabase == null && i10 < 5) {
            i10++;
            try {
                readableDatabase = super.getReadableDatabase();
            } catch (Throwable unused) {
                X.e("[Database] Try to get db(count: %d).", Integer.valueOf(i10));
                if (i10 == 5) {
                    X.b("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        writableDatabase = null;
        int i10 = 0;
        while (writableDatabase == null && i10 < 5) {
            i10++;
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (Throwable unused) {
                X.e("[Database] Try to get db(count: %d).", Integer.valueOf(i10));
                if (i10 == 5) {
                    X.b("[Database] Failed to get db.", new Object[0]);
                }
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
            }
        }
        if (writableDatabase == null) {
            X.e("[Database] db error delay error record 1min.", new Object[0]);
        }
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("t_ui");
            sb.append(" ( ");
            sb.append("_id");
            sb.append(" ");
            sb.append("INTEGER PRIMARY KEY");
            sb.append(" , ");
            sb.append("_tm");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_ut");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_tp");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_dt");
            sb.append(" ");
            sb.append("blob");
            sb.append(" , ");
            sb.append("_pc");
            sb.append(" ");
            sb.append("text");
            sb.append(" ) ");
            X.a(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("t_lr");
            sb.append(" ( ");
            sb.append("_id");
            sb.append(" ");
            sb.append("INTEGER PRIMARY KEY");
            sb.append(" , ");
            sb.append("_tp");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_tm");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_pc");
            sb.append(" ");
            sb.append("text");
            sb.append(" , ");
            sb.append("_th");
            sb.append(" ");
            sb.append("text");
            sb.append(" , ");
            sb.append("_dt");
            sb.append(" ");
            sb.append("blob");
            sb.append(" ) ");
            X.a(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("t_pf");
            sb.append(" ( ");
            sb.append("_id");
            sb.append(" ");
            sb.append("integer");
            sb.append(" , ");
            sb.append("_tp");
            sb.append(" ");
            sb.append("text");
            sb.append(" , ");
            sb.append("_tm");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_dt");
            sb.append(" ");
            sb.append("blob");
            sb.append(",primary key(");
            sb.append("_id");
            sb.append(",");
            sb.append("_tp");
            sb.append(" )) ");
            X.a(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("t_cr");
            sb.append(" ( ");
            sb.append("_id");
            sb.append(" ");
            sb.append("INTEGER PRIMARY KEY");
            sb.append(" , ");
            sb.append("_tm");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_s1");
            sb.append(" ");
            sb.append("text");
            sb.append(" , ");
            sb.append("_up");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_me");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_uc");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_dt");
            sb.append(" ");
            sb.append("blob");
            sb.append(" ) ");
            X.a(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("dl_1002");
            sb.append(" (");
            sb.append("_id");
            sb.append(" integer primary key autoincrement, ");
            sb.append("_dUrl");
            sb.append(" varchar(100), ");
            sb.append("_sFile");
            sb.append(" varchar(100), ");
            sb.append("_sLen");
            sb.append(" INTEGER, ");
            sb.append("_tLen");
            sb.append(" INTEGER, ");
            sb.append("_MD5");
            sb.append(" varchar(100), ");
            sb.append("_DLTIME");
            sb.append(" INTEGER)");
            X.a(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append("CREATE TABLE IF NOT EXISTS ");
            sb.append("ge_1002");
            sb.append(" (");
            sb.append("_id");
            sb.append(" integer primary key autoincrement, ");
            sb.append("_time");
            sb.append(" INTEGER, ");
            sb.append("_datas");
            sb.append(" blob)");
            X.a(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
            sb.setLength(0);
            sb.append(" CREATE TABLE IF NOT EXISTS ");
            sb.append("st_1002");
            sb.append(" ( ");
            sb.append("_id");
            sb.append(" ");
            sb.append("integer");
            sb.append(" , ");
            sb.append("_tp");
            sb.append(" ");
            sb.append("text");
            sb.append(" , ");
            sb.append("_tm");
            sb.append(" ");
            sb.append("int");
            sb.append(" , ");
            sb.append("_dt");
            sb.append(" ");
            sb.append("blob");
            sb.append(",primary key(");
            sb.append("_id");
            sb.append(",");
            sb.append("_tp");
            sb.append(" )) ");
            X.a(sb.toString(), new Object[0]);
            sQLiteDatabase.execSQL(sb.toString(), new String[0]);
        } catch (Throwable th2) {
            if (!X.a(th2)) {
                th2.printStackTrace();
            }
        }
        List<com.tencent.bugly.a> list = this.f4871d;
        if (list == null) {
            return;
        }
        Iterator<com.tencent.bugly.a> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().onDbCreate(sQLiteDatabase);
            } catch (Throwable th3) {
                if (!X.a(th3)) {
                    th3.printStackTrace();
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (com.tencent.bugly.crashreport.common.info.b.c() >= 11) {
                X.e("[Database] Downgrade %d to %d drop tables.", Integer.valueOf(i10), Integer.valueOf(i11));
                List<com.tencent.bugly.a> list = this.f4871d;
                if (list != null) {
                    Iterator<com.tencent.bugly.a> it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().onDbDowngrade(sQLiteDatabase, i10, i11);
                        } catch (Throwable th2) {
                            if (!X.a(th2)) {
                                th2.printStackTrace();
                            }
                        }
                    }
                }
                if (a(sQLiteDatabase)) {
                    onCreate(sQLiteDatabase);
                } else {
                    X.e("[Database] Failed to drop, delete db.", new Object[0]);
                    File databasePath = this.f4870c.getDatabasePath(f4868a);
                    if (databasePath != null && databasePath.canWrite()) {
                        databasePath.delete();
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            X.e("[Database] Upgrade %d to %d , drop tables!", Integer.valueOf(i10), Integer.valueOf(i11));
            List<com.tencent.bugly.a> list = this.f4871d;
            if (list != null) {
                Iterator<com.tencent.bugly.a> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().onDbUpgrade(sQLiteDatabase, i10, i11);
                    } catch (Throwable th2) {
                        if (!X.a(th2)) {
                            th2.printStackTrace();
                        }
                    }
                }
            }
            if (a(sQLiteDatabase)) {
                onCreate(sQLiteDatabase);
            } else {
                X.e("[Database] Failed to drop, delete db.", new Object[0]);
                File databasePath = this.f4870c.getDatabasePath(f4868a);
                if (databasePath != null && databasePath.canWrite()) {
                    databasePath.delete();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
