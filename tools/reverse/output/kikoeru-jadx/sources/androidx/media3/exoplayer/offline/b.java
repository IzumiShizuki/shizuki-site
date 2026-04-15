package androidx.media3.exoplayer.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m4.b1;
import m4.o0;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f874d = g(3, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f875e = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r4.a f876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f877b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f878c;

    public b(r4.a aVar) {
        this.f876a = aVar;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i10 = c0.f16548a;
            for (String str2 : str.split(",", -1)) {
                String[] strArrSplit = str2.split("\\.", -1);
                p4.c.i(strArrSplit.length == 3);
                arrayList.add(new b1(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
            }
        }
        return arrayList;
    }

    public static d e(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String strP = o0.p(cursor.getString(1));
        ArrayList arrayListA = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        o oVar = new o(string, uri, strP, arrayListA, blob, cursor.getString(4), cursor.getBlob(5));
        n nVar = new n();
        nVar.f943a = cursor.getLong(13);
        nVar.f944b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new d(oVar, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, nVar);
    }

    public static d f(Cursor cursor) {
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri uri = Uri.parse(string2);
        String string3 = cursor.getString(1);
        o oVar = new o(string, uri, o0.p("dash".equals(string3) ? "application/dash+xml" : "hls".equals(string3) ? "application/x-mpegURL" : "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown"), a(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        n nVar = new n();
        nVar.f943a = cursor.getLong(13);
        nVar.f944b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new d(oVar, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, nVar);
    }

    public static String g(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 > 0) {
                sb.append(',');
            }
            sb.append(iArr[i10]);
        }
        sb.append(')');
        return sb.toString();
    }

    public static ArrayList h(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!c0.a0(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(f(cursorQuery));
            } finally {
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void b() {
        synchronized (this.f877b) {
            if (this.f878c) {
                return;
            }
            try {
                int iA = r4.c.a(this.f876a.getReadableDatabase(), 0, "");
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.f876a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        r4.c.b(writableDatabase, 0, "", 3);
                        ArrayList arrayListH = iA == 2 ? h(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayListH.iterator();
                        while (it.hasNext()) {
                            j((d) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                this.f878c = true;
            } catch (SQLException e10) {
                throw new e(e10);
            }
        }
    }

    public final Cursor c(String str, String[] strArr) {
        try {
            return this.f876a.getReadableDatabase().query("ExoPlayerDownloads", f875e, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e10) {
            throw new e(e10);
        }
    }

    public final d d(String str) throws e {
        b();
        try {
            Cursor cursorC = c("id = ?", new String[]{str});
            try {
                if (cursorC.getCount() == 0) {
                    cursorC.close();
                    return null;
                }
                cursorC.moveToNext();
                d dVarE = e(cursorC);
                cursorC.close();
                return dVarE;
            } finally {
            }
        } catch (SQLiteException e10) {
            throw new e(e10);
        }
        throw new e(e10);
    }

    public final void i(d dVar) {
        b();
        try {
            j(dVar, this.f876a.getWritableDatabase());
        } catch (SQLiteException e10) {
            throw new e(e10);
        }
    }

    public final void j(d dVar, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = dVar.f892a.f949e;
        if (bArr == null) {
            bArr = c0.f16553f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", dVar.f892a.f945a);
        contentValues.put("mime_type", dVar.f892a.f947c);
        contentValues.put("uri", dVar.f892a.f946b.toString());
        List list = dVar.f892a.f948d;
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b1 b1Var = (b1) list.get(i10);
            sb.append(b1Var.f14140a);
            sb.append('.');
            sb.append(b1Var.f14141b);
            sb.append('.');
            sb.append(b1Var.f14142c);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", dVar.f892a.f950f);
        contentValues.put("data", dVar.f892a.f951g);
        contentValues.put("state", Integer.valueOf(dVar.f893b));
        contentValues.put("start_time_ms", Long.valueOf(dVar.f894c));
        contentValues.put("update_time_ms", Long.valueOf(dVar.f895d));
        contentValues.put("content_length", Long.valueOf(dVar.f896e));
        contentValues.put("stop_reason", Integer.valueOf(dVar.f897f));
        contentValues.put("failure_reason", Integer.valueOf(dVar.f898g));
        contentValues.put("percent_downloaded", Float.valueOf(dVar.f899h.f944b));
        contentValues.put("bytes_downloaded", Long.valueOf(dVar.f899h.f943a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", null, contentValues);
    }

    public final void k() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f876a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e10) {
            throw new e(e10);
        }
    }

    public final void l() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f876a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e10) {
            throw new e(e10);
        }
    }

    public final void m(int i10, String str) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f876a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, f874d + " AND id = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new e(e10);
        }
    }
}
