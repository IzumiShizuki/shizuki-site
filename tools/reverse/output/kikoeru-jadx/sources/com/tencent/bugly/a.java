package com.tencent.bugly;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.X;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public int f4347id;
    public String moduleName;
    public String version;
    public String versionKey;

    public abstract String[] getTables();

    public abstract void init(Context context, boolean z10, BuglyStrategy buglyStrategy);

    public void onDbDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (getTables() == null) {
                return;
            }
            for (String str : getTables()) {
                StringBuilder sb = new StringBuilder();
                sb.append("DROP TABLE IF EXISTS ");
                sb.append(str);
                sQLiteDatabase.execSQL(sb.toString());
            }
            onDbCreate(sQLiteDatabase);
        } catch (Throwable th2) {
            if (X.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public void onDbUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (getTables() == null) {
                return;
            }
            for (String str : getTables()) {
                StringBuilder sb = new StringBuilder();
                sb.append("DROP TABLE IF EXISTS ");
                sb.append(str);
                sQLiteDatabase.execSQL(sb.toString());
            }
            onDbCreate(sQLiteDatabase);
        } catch (Throwable th2) {
            if (X.a(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public void onDbCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onServerStrategyChanged(StrategyBean strategyBean) {
    }
}
