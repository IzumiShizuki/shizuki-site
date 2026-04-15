package t4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f20445c = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f20447b;

    public i() {
        this.f20446a = new HashMap();
        this.f20447b = new ArrayList();
    }

    public void a(Object obj, String str) {
        HashMap map = (HashMap) this.f20446a;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.f20447b).remove(str);
    }

    public HashMap b() throws androidx.media3.exoplayer.offline.e {
        try {
            ((String) this.f20447b).getClass();
            Cursor cursorQuery = ((r4.a) this.f20446a).getReadableDatabase().query((String) this.f20447b, f20445c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new h(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (SQLException e10) {
            throw new androidx.media3.exoplayer.offline.e(e10);
        }
    }

    public void c(long j10) throws androidx.media3.exoplayer.offline.e {
        r4.a aVar = (r4.a) this.f20446a;
        try {
            String hexString = Long.toHexString(j10);
            this.f20447b = "ExoPlayerCacheFileMetadata" + hexString;
            if (r4.c.a(aVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    r4.c.b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.f20447b));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.f20447b) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new androidx.media3.exoplayer.offline.e(e10);
        }
    }

    public void d(Set set) throws androidx.media3.exoplayer.offline.e {
        ((String) this.f20447b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((r4.a) this.f20446a).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.f20447b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        } catch (SQLException e10) {
            throw new androidx.media3.exoplayer.offline.e(e10);
        }
    }

    public void e(long j10, long j11, String str) throws androidx.media3.exoplayer.offline.e {
        ((String) this.f20447b).getClass();
        try {
            SQLiteDatabase writableDatabase = ((r4.a) this.f20446a).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow((String) this.f20447b, null, contentValues);
        } catch (SQLException e10) {
            throw new androidx.media3.exoplayer.offline.e(e10);
        }
    }

    public i(r4.a aVar) {
        this.f20446a = aVar;
    }
}
