package b8;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import b0.c1;
import b7.m;
import ce.j0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jc.l;
import n7.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2248g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f2250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f2251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c8.a f2253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final c1 c1Var, final m mVar) {
        String string;
        super(context, str, null, mVar.f1958b, new DatabaseErrorHandler() { // from class: b8.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i10 = f.f2248g;
                l.b(sQLiteDatabase);
                b bVarJ = android.support.v4.media.session.b.J(c1Var, sQLiteDatabase);
                mVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVarJ + ".path");
                SQLiteDatabase sQLiteDatabase2 = bVarJ.f2237a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        m.m(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                l.d(obj, "second");
                                m.m((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                m.m(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    bVarJ.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        l.e(mVar, "callback");
        this.f2249a = context;
        this.f2250b = c1Var;
        this.f2251c = mVar;
        if (str == null) {
            string = UUID.randomUUID().toString();
            l.d(string, "toString(...)");
        } else {
            string = str;
        }
        this.f2253e = new c8.a(string, context.getCacheDir(), false);
    }

    public final a8.a b(boolean z10) {
        c8.a aVar = this.f2253e;
        try {
            aVar.a((this.f2254f || getDatabaseName() == null) ? false : true);
            this.f2252d = false;
            SQLiteDatabase sQLiteDatabaseG = g(z10);
            if (!this.f2252d) {
                b bVarJ = android.support.v4.media.session.b.J(this.f2250b, sQLiteDatabaseG);
                aVar.b();
                return bVarJ;
            }
            close();
            a8.a aVarB = b(z10);
            aVar.b();
            return aVarB;
        } catch (Throwable th2) {
            aVar.b();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        c8.a aVar = this.f2253e;
        try {
            aVar.a(aVar.f3762a);
            super.close();
            this.f2250b.f1208b = null;
            this.f2254f = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase g(boolean z10) throws Throwable {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z11 = this.f2254f;
        if (databaseName != null && !z11 && (parentFile = this.f2249a.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                l.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            l.b(readableDatabase2);
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z10) {
                    readableDatabase = getWritableDatabase();
                    l.b(readableDatabase);
                } else {
                    readableDatabase = getReadableDatabase();
                    l.b(readableDatabase);
                }
                return readableDatabase;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof d) {
                    d dVar = (d) th;
                    int iOrdinal = dVar.f2240a.ordinal();
                    th = dVar.f2241b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new j0();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "db");
        boolean z10 = this.f2252d;
        m mVar = this.f2251c;
        if (!z10 && mVar.f1958b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            android.support.v4.media.session.b.J(this.f2250b, sQLiteDatabase);
            mVar.getClass();
        } catch (Throwable th2) {
            throw new d(e.f2242a, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            ((t) this.f2251c.f1959c).d(new q7.a(android.support.v4.media.session.b.J(this.f2250b, sQLiteDatabase)));
        } catch (Throwable th2) {
            throw new d(e.f2243b, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        l.e(sQLiteDatabase, "db");
        this.f2252d = true;
        try {
            this.f2251c.p(android.support.v4.media.session.b.J(this.f2250b, sQLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new d(e.f2245d, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        l.e(sQLiteDatabase, "db");
        if (!this.f2252d) {
            try {
                m mVar = this.f2251c;
                b bVarJ = android.support.v4.media.session.b.J(this.f2250b, sQLiteDatabase);
                t tVar = (t) mVar.f1959c;
                tVar.f(new q7.a(bVarJ));
                tVar.f15571g = bVarJ;
            } catch (Throwable th2) {
                throw new d(e.f2246e, th2);
            }
        }
        this.f2254f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        l.e(sQLiteDatabase, "sqLiteDatabase");
        this.f2252d = true;
        try {
            this.f2251c.p(android.support.v4.media.session.b.J(this.f2250b, sQLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new d(e.f2244c, th2);
        }
    }
}
