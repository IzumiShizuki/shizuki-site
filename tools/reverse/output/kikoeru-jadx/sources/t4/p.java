package t4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import b7.b1;
import j2.h0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p implements q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f20472e = {"id", "key", "metadata"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r4.a f20473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f20474b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20476d;

    public p(r4.a aVar) {
        this.f20473a = aVar;
    }

    @Override // t4.q
    public final void a(o oVar, boolean z10) {
        int i10 = oVar.f20467a;
        SparseArray sparseArray = this.f20474b;
        if (z10) {
            sparseArray.delete(i10);
        } else {
            sparseArray.put(i10, null);
        }
    }

    public final void b(SQLiteDatabase sQLiteDatabase, o oVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        b1.b(oVar.f20471e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(oVar.f20467a));
        contentValues.put("key", oVar.f20468b);
        contentValues.put("metadata", byteArray);
        String str = this.f20476d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    @Override // t4.q
    public final void c(HashMap map) throws androidx.media3.exoplayer.offline.e {
        try {
            SQLiteDatabase writableDatabase = this.f20473a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                j(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    b(writableDatabase, (o) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f20474b.clear();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e10) {
            throw new androidx.media3.exoplayer.offline.e(e10);
        }
    }

    @Override // t4.q
    public final boolean d() throws androidx.media3.exoplayer.offline.e {
        try {
            SQLiteDatabase readableDatabase = this.f20473a.getReadableDatabase();
            String str = this.f20475c;
            str.getClass();
            return r4.c.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e10) {
            throw new androidx.media3.exoplayer.offline.e(e10);
        }
    }

    @Override // t4.q
    public final void e(HashMap map) throws androidx.media3.exoplayer.offline.e {
        SparseArray sparseArray = this.f20474b;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f20473a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                try {
                    o oVar = (o) sparseArray.valueAt(i10);
                    if (oVar == null) {
                        int iKeyAt = sparseArray.keyAt(i10);
                        String str = this.f20476d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        b(writableDatabase, oVar);
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new androidx.media3.exoplayer.offline.e(e10);
        }
    }

    @Override // t4.q
    public final void f(long j10) {
        String hexString = Long.toHexString(j10);
        this.f20475c = hexString;
        this.f20476d = h0.x("ExoPlayerCacheIndex", hexString);
    }

    @Override // t4.q
    public final void g(o oVar) {
        this.f20474b.put(oVar.f20467a, oVar);
    }

    @Override // t4.q
    public final void h(HashMap map, SparseArray sparseArray) throws androidx.media3.exoplayer.offline.e {
        r4.a aVar = this.f20473a;
        p4.c.i(this.f20474b.size() == 0);
        try {
            SQLiteDatabase readableDatabase = aVar.getReadableDatabase();
            String str = this.f20475c;
            str.getClass();
            if (r4.c.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    j(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            SQLiteDatabase readableDatabase2 = aVar.getReadableDatabase();
            String str2 = this.f20476d;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f20472e, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i10 = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new o(i10, string, b1.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i10, string);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e10) {
            map.clear();
            sparseArray.clear();
            throw new androidx.media3.exoplayer.offline.e(e10);
        }
    }

    @Override // t4.q
    public final void i() throws androidx.media3.exoplayer.offline.e {
        r4.a aVar = this.f20473a;
        String str = this.f20475c;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i10 = r4.c.f18746a;
                try {
                    if (c0.a0(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e10) {
                    throw new androidx.media3.exoplayer.offline.e(e10);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e11) {
            throw new androidx.media3.exoplayer.offline.e(e11);
        }
    }

    public final void j(SQLiteDatabase sQLiteDatabase) throws androidx.media3.exoplayer.offline.e {
        String str = this.f20475c;
        str.getClass();
        r4.c.b(sQLiteDatabase, 1, str, 1);
        String str2 = this.f20476d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f20476d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }
}
