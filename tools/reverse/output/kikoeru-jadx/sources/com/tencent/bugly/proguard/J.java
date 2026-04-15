package com.tencent.bugly.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static J f4865a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static K f4866b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f4867c = false;

    private J(Context context, List<com.tencent.bugly.a> list) {
        f4866b = new K(context, list);
    }

    private synchronized boolean d(L l10) {
        SQLiteDatabase writableDatabase;
        if (l10 == null) {
            return false;
        }
        try {
            writableDatabase = f4866b.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    ContentValues contentValuesB = b(l10);
                    if (contentValuesB != null) {
                        long jReplace = writableDatabase.replace("t_pf", "_id", contentValuesB);
                        if (jReplace < 0) {
                            if (f4867c) {
                                writableDatabase.close();
                            }
                            return false;
                        }
                        X.a("[Database] insert %s success.", "t_pf");
                        l10.f4872a = jReplace;
                        if (f4867c) {
                            writableDatabase.close();
                        }
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!X.b(th)) {
                            th.printStackTrace();
                        }
                        if (f4867c && writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return false;
                    } finally {
                        if (f4867c && writableDatabase != null) {
                            writableDatabase.close();
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            writableDatabase = null;
        }
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void b(int i10) {
        String str;
        SQLiteDatabase writableDatabase = f4866b.getWritableDatabase();
        if (writableDatabase != null) {
            if (i10 >= 0) {
                try {
                    str = "_tp = " + i10;
                } catch (Throwable th2) {
                    try {
                        if (!X.b(th2)) {
                            th2.printStackTrace();
                        }
                        if (f4867c) {
                        }
                    } catch (Throwable th3) {
                        if (f4867c) {
                            writableDatabase.close();
                        }
                        throw th3;
                    }
                }
            } else {
                str = null;
            }
            X.a("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", str, null)));
            if (f4867c) {
                writableDatabase.close();
            }
        }
    }

    public synchronized boolean c(L l10) {
        SQLiteDatabase writableDatabase;
        if (l10 == null) {
            return false;
        }
        try {
            writableDatabase = f4866b.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    ContentValues contentValuesA = a(l10);
                    if (contentValuesA != null) {
                        long jReplace = writableDatabase.replace("t_lr", "_id", contentValuesA);
                        if (jReplace < 0) {
                            if (f4867c) {
                                writableDatabase.close();
                            }
                            return false;
                        }
                        X.a("[Database] insert %s success.", "t_lr");
                        l10.f4872a = jReplace;
                        if (f4867c) {
                            writableDatabase.close();
                        }
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!X.b(th)) {
                            th.printStackTrace();
                        }
                        if (f4867c && writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return false;
                    } finally {
                        if (f4867c && writableDatabase != null) {
                            writableDatabase.close();
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            writableDatabase = null;
        }
    }

    public static synchronized J a(Context context, List<com.tencent.bugly.a> list) {
        try {
            if (f4865a == null) {
                f4865a = new J(context, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4865a;
    }

    public static synchronized J a() {
        return f4865a;
    }

    public long a(String str, ContentValues contentValues, I i10, boolean z10) {
        if (!z10) {
            s sVar = new s(this, 1, i10);
            sVar.f5090c = str;
            sVar.f5091d = contentValues;
            W.c().a(sVar);
            return 0L;
        }
        return a(str, contentValues, i10);
    }

    public ContentValues b(L l10) {
        if (l10 != null && !ca.b(l10.f4877f)) {
            try {
                ContentValues contentValues = new ContentValues();
                long j10 = l10.f4872a;
                if (j10 > 0) {
                    contentValues.put("_id", Long.valueOf(j10));
                }
                contentValues.put("_tp", l10.f4877f);
                contentValues.put("_tm", Long.valueOf(l10.f4876e));
                byte[] bArr = l10.f4878g;
                if (bArr != null) {
                    contentValues.put("_dt", bArr);
                }
                return contentValues;
            } catch (Throwable th2) {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, I i10, boolean z10) {
        return a(false, str, strArr, str2, strArr2, (String) null, (String) null, (String) null, (String) null, i10, z10);
    }

    public Cursor a(boolean z10, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, I i10, boolean z11) {
        if (!z11) {
            s sVar = new s(this, 3, i10);
            sVar.f5092e = z10;
            sVar.f5090c = str;
            sVar.f5093f = strArr;
            sVar.f5094g = str2;
            sVar.f5095h = strArr2;
            sVar.f5096i = str3;
            sVar.f5097j = str4;
            sVar.f5098k = str5;
            sVar.f5099l = str6;
            W.c().a(sVar);
            return null;
        }
        return a(z10, str, strArr, str2, strArr2, str3, str4, str5, str6, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5 A[Catch: all -> 0x002b, PHI: r3
      0x00e5: PHI (r3v2 android.database.sqlite.SQLiteDatabase) = (r3v1 android.database.sqlite.SQLiteDatabase), (r3v3 android.database.sqlite.SQLiteDatabase) binds: [B:77:0x00e3, B:63:0x00c6] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x002b, blocks: (B:13:0x0027, B:16:0x002f, B:18:0x0033, B:54:0x00b2, B:56:0x00b9, B:74:0x00dc, B:75:0x00df, B:78:0x00e5, B:82:0x00ec, B:83:0x00ef, B:86:0x00f5, B:87:0x00f8, B:61:0x00c2, B:67:0x00cd, B:69:0x00d3), top: B:96:0x0004, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized java.util.List<com.tencent.bugly.proguard.L> c(int r12) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.J.c(int):java.util.List");
    }

    public L b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            L l10 = new L();
            l10.f4872a = cursor.getLong(cursor.getColumnIndex("_id"));
            l10.f4876e = cursor.getLong(cursor.getColumnIndex("_tm"));
            l10.f4877f = cursor.getString(cursor.getColumnIndex("_tp"));
            l10.f4878g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return l10;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public int a(String str, String str2, String[] strArr, I i10, boolean z10) {
        if (!z10) {
            s sVar = new s(this, 2, i10);
            sVar.f5090c = str;
            sVar.f5100m = str2;
            sVar.f5101n = strArr;
            W.c().a(sVar);
            return 0;
        }
        return a(str, str2, strArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized long a(String str, ContentValues contentValues, I i10) {
        long j10;
        SQLiteDatabase writableDatabase;
        j10 = 0;
        try {
            writableDatabase = f4866b.getWritableDatabase();
            if (writableDatabase != null && contentValues != null) {
                try {
                    long jReplace = writableDatabase.replace(str, "_id", contentValues);
                    if (jReplace >= 0) {
                        X.a("[Database] insert %s success.", str);
                    } else {
                        X.e("[Database] replace %s error.", str);
                    }
                    j10 = jReplace;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (!X.b(th)) {
                            th.printStackTrace();
                        }
                    } finally {
                        if (i10 != null) {
                            i10.a(0L);
                        }
                        if (f4867c && writableDatabase != null) {
                            writableDatabase.close();
                        }
                    }
                }
            }
            if (i10 != null) {
                i10.a(Long.valueOf(j10));
            }
            if (f4867c && writableDatabase != null) {
                writableDatabase.close();
            }
        } catch (Throwable th3) {
            th = th3;
            writableDatabase = null;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Cursor a(boolean z10, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, I i10) {
        Cursor cursorQuery;
        try {
            SQLiteDatabase writableDatabase = f4866b.getWritableDatabase();
            cursorQuery = writableDatabase != null ? writableDatabase.query(z10, str, strArr, str2, strArr2, str3, str4, str5, str6) : null;
            if (i10 != null) {
                i10.a(cursorQuery);
            }
        } catch (Throwable th2) {
            try {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
                if (i10 != null) {
                    i10.a(null);
                }
            } finally {
            }
        }
        return cursorQuery;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int a(String str, String str2, String[] strArr, I i10) {
        int iDelete;
        SQLiteDatabase writableDatabase;
        iDelete = 0;
        try {
            try {
                writableDatabase = f4866b.getWritableDatabase();
                if (writableDatabase != null) {
                    try {
                        iDelete = writableDatabase.delete(str, str2, strArr);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            if (!X.b(th)) {
                                th.printStackTrace();
                            }
                        } finally {
                            if (i10 != null) {
                                i10.a(0);
                            }
                            if (f4867c && writableDatabase != null) {
                                writableDatabase.close();
                            }
                        }
                    }
                }
                if (i10 != null) {
                    i10.a(Integer.valueOf(iDelete));
                }
                if (f4867c && writableDatabase != null) {
                    writableDatabase.close();
                }
            } catch (Throwable th3) {
                th = th3;
                writableDatabase = null;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return iDelete;
    }

    public boolean a(int i10, String str, byte[] bArr, I i11, boolean z10) {
        if (!z10) {
            s sVar = new s(this, 4, i11);
            sVar.f5102o = i10;
            sVar.f5103p = str;
            sVar.f5104q = bArr;
            W.c().a(sVar);
            return true;
        }
        return a(i10, str, bArr, i11);
    }

    public Map<String, byte[]> a(int i10, I i11, boolean z10) {
        if (!z10) {
            s sVar = new s(this, 5, i11);
            sVar.f5102o = i10;
            W.c().a(sVar);
            return null;
        }
        return a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i10, String str, byte[] bArr, I i11) {
        Boolean bool = Boolean.FALSE;
        try {
            L l10 = new L();
            l10.f4872a = i10;
            l10.f4877f = str;
            l10.f4876e = System.currentTimeMillis();
            l10.f4878g = bArr;
            boolean zD = d(l10);
            if (i11 != null) {
                i11.a(Boolean.valueOf(zD));
            }
            return zD;
        } catch (Throwable th2) {
            try {
                if (!X.b(th2)) {
                    th2.printStackTrace();
                }
            } finally {
                if (i11 != null) {
                    i11.a(bool);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, byte[]> a(int i10, I i11) {
        HashMap map = null;
        try {
            List<L> listC = c(i10);
            if (listC != null) {
                HashMap map2 = new HashMap();
                try {
                    for (L l10 : listC) {
                        byte[] bArr = l10.f4878g;
                        if (bArr != null) {
                            map2.put(l10.f4877f, bArr);
                        }
                    }
                    map = map2;
                } catch (Throwable th2) {
                    th = th2;
                    map = map2;
                    try {
                        if (!X.b(th)) {
                            th.printStackTrace();
                        }
                        if (i11 != null) {
                            i11.a(map);
                        }
                        return map;
                    } finally {
                        if (i11 != null) {
                            i11.a(map);
                        }
                    }
                }
            }
            return map;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:60:0x00ba, B:62:0x00c0), top: B:81:0x00ba, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8 A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #1 {all -> 0x0034, blocks: (B:4:0x0003, B:18:0x0030, B:21:0x0038, B:23:0x003c, B:54:0x00ac, B:56:0x00b3, B:67:0x00c8, B:68:0x00cb, B:70:0x00cf, B:72:0x00d5, B:73:0x00d8, B:75:0x00dc, B:76:0x00df, B:60:0x00ba, B:62:0x00c0), top: B:83:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:4:0x0003, B:18:0x0030, B:21:0x0038, B:23:0x003c, B:54:0x00ac, B:56:0x00b3, B:67:0x00c8, B:68:0x00cb, B:70:0x00cf, B:72:0x00d5, B:73:0x00d8, B:75:0x00dc, B:76:0x00df, B:60:0x00ba, B:62:0x00c0), top: B:83:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.tencent.bugly.proguard.L> a(int r11) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.J.a(int):java.util.List");
    }

    /* JADX WARN: Finally extract failed */
    public synchronized void a(List<L> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    SQLiteDatabase writableDatabase = f4866b.getWritableDatabase();
                    if (writableDatabase != null) {
                        StringBuilder sb = new StringBuilder();
                        for (L l10 : list) {
                            sb.append(" or ");
                            sb.append("_id");
                            sb.append(" = ");
                            sb.append(l10.f4872a);
                        }
                        String string = sb.toString();
                        if (string.length() > 0) {
                            string = string.substring(4);
                        }
                        sb.setLength(0);
                        try {
                            X.a("[Database] deleted %s data %d", "t_lr", Integer.valueOf(writableDatabase.delete("t_lr", string, null)));
                        } catch (Throwable th2) {
                            try {
                                if (!X.b(th2)) {
                                    th2.printStackTrace();
                                }
                                if (f4867c) {
                                }
                            } catch (Throwable th3) {
                                if (f4867c) {
                                    writableDatabase.close();
                                }
                                throw th3;
                            }
                        }
                        if (f4867c) {
                            writableDatabase.close();
                        }
                    }
                }
            } finally {
            }
        }
    }

    public ContentValues a(L l10) {
        if (l10 == null) {
            return null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            long j10 = l10.f4872a;
            if (j10 > 0) {
                contentValues.put("_id", Long.valueOf(j10));
            }
            contentValues.put("_tp", Integer.valueOf(l10.f4873b));
            contentValues.put("_pc", l10.f4874c);
            contentValues.put("_th", l10.f4875d);
            contentValues.put("_tm", Long.valueOf(l10.f4876e));
            byte[] bArr = l10.f4878g;
            if (bArr != null) {
                contentValues.put("_dt", bArr);
            }
            return contentValues;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    public L a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        try {
            L l10 = new L();
            l10.f4872a = cursor.getLong(cursor.getColumnIndex("_id"));
            l10.f4873b = cursor.getInt(cursor.getColumnIndex("_tp"));
            l10.f4874c = cursor.getString(cursor.getColumnIndex("_pc"));
            l10.f4875d = cursor.getString(cursor.getColumnIndex("_th"));
            l10.f4876e = cursor.getLong(cursor.getColumnIndex("_tm"));
            l10.f4878g = cursor.getBlob(cursor.getColumnIndex("_dt"));
            return l10;
        } catch (Throwable th2) {
            if (!X.b(th2)) {
                th2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(int i10, String str, I i11) {
        boolean z10;
        SQLiteDatabase writableDatabase;
        String string;
        Boolean bool = Boolean.FALSE;
        SQLiteDatabase sQLiteDatabase = null;
        z10 = false;
        try {
            writableDatabase = f4866b.getWritableDatabase();
            if (writableDatabase != null) {
                try {
                    if (ca.b(str)) {
                        string = "_id = " + i10;
                    } else {
                        StringBuilder sb = new StringBuilder("_id = ");
                        sb.append(i10);
                        sb.append(" and _tp = \"");
                        sb.append(str);
                        sb.append("\"");
                        string = sb.toString();
                    }
                    int iDelete = writableDatabase.delete("t_pf", string, null);
                    X.a("[Database] deleted %s data %d", "t_pf", Integer.valueOf(iDelete));
                    if (iDelete > 0) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                    try {
                        if (!X.b(th)) {
                            th.printStackTrace();
                        }
                        if (i11 != null) {
                            i11.a(bool);
                        }
                        if (f4867c && sQLiteDatabase != null) {
                            writableDatabase = sQLiteDatabase;
                        }
                        return z10;
                    } catch (Throwable th3) {
                        if (i11 != null) {
                            i11.a(bool);
                        }
                        if (f4867c && sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th3;
                    }
                }
            }
            if (i11 != null) {
                i11.a(Boolean.valueOf(z10));
            }
        } catch (Throwable th4) {
            th = th4;
        }
        if (f4867c && writableDatabase != null) {
            writableDatabase.close();
        }
        return z10;
    }
}
