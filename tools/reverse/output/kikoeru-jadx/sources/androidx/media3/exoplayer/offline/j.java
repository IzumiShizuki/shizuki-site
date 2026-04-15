package androidx.media3.exoplayer.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m4.b1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f920l;

    public j(HandlerThread handlerThread, b bVar, c cVar, Handler handler, boolean z10) {
        super(handlerThread.getLooper());
        this.f909a = handlerThread;
        this.f910b = bVar;
        this.f911c = cVar;
        this.f912d = handler;
        this.f917i = 3;
        this.f918j = 5;
        this.f916h = z10;
        this.f913e = new ArrayList();
        this.f914f = new HashMap();
    }

    public static d a(d dVar, int i10, int i11) {
        return new d(dVar.f892a, i10, dVar.f894c, System.currentTimeMillis(), dVar.f896e, i11, 0, dVar.f899h);
    }

    public final d b(String str, boolean z10) {
        int iC = c(str);
        if (iC != -1) {
            return (d) this.f913e.get(iC);
        }
        if (!z10) {
            return null;
        }
        try {
            return this.f910b.d(str);
        } catch (IOException e10) {
            p4.c.o("DownloadManager", "Failed to load download: " + str, e10);
            return null;
        }
    }

    public final int c(String str) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f913e;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (((d) arrayList.get(i10)).f892a.f945a.equals(str)) {
                return i10;
            }
            i10++;
        }
    }

    public final void d(d dVar) {
        int i10 = dVar.f893b;
        p4.c.i((i10 == 3 || i10 == 4) ? false : true);
        int iC = c(dVar.f892a.f945a);
        ArrayList arrayList = this.f913e;
        if (iC == -1) {
            arrayList.add(dVar);
            Collections.sort(arrayList, new i(0));
        } else {
            boolean z10 = dVar.f894c != ((d) arrayList.get(iC)).f894c;
            arrayList.set(iC, dVar);
            if (z10) {
                Collections.sort(arrayList, new i(0));
            }
        }
        try {
            this.f910b.i(dVar);
        } catch (IOException e10) {
            p4.c.o("DownloadManager", "Failed to update index.", e10);
        }
        this.f912d.obtainMessage(3, new h(dVar, false, new ArrayList(arrayList), null)).sendToTarget();
    }

    public final d e(d dVar, int i10, int i11) {
        p4.c.i((i10 == 3 || i10 == 4) ? false : true);
        d dVarA = a(dVar, i10, i11);
        d(dVarA);
        return dVarA;
    }

    public final void f(d dVar, int i10) {
        if (i10 == 0) {
            if (dVar.f893b == 1) {
                e(dVar, 0, 0);
            }
        } else if (i10 != dVar.f897f) {
            int i11 = dVar.f893b;
            if (i11 == 0 || i11 == 2) {
                i11 = 1;
            }
            d(new d(dVar.f892a, i11, dVar.f894c, System.currentTimeMillis(), dVar.f896e, i10, 0, dVar.f899h));
        }
    }

    public final void g() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f913e;
            if (i10 >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i10);
            o oVar = dVar.f892a;
            String str = oVar.f945a;
            HashMap map = this.f914f;
            l lVar = (l) map.get(str);
            int i12 = dVar.f893b;
            c cVar = this.f911c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        lVar.getClass();
                        p4.c.i(!lVar.f924d);
                        if (this.f916h || this.f915g != 0 || i11 >= this.f917i) {
                            e(dVar, 0, 0);
                            lVar.a(false);
                        }
                    } else {
                        if (i12 != 5 && i12 != 7) {
                            throw new IllegalStateException();
                        }
                        if (lVar != null) {
                            if (!lVar.f924d) {
                                lVar.a(false);
                            }
                        } else if (!this.f920l) {
                            l lVar2 = new l(dVar.f892a, cVar.a(oVar), dVar.f899h, true, this.f918j, this);
                            map.put(oVar.f945a, lVar2);
                            this.f920l = true;
                            lVar2.start();
                        }
                    }
                } else if (lVar != null) {
                    p4.c.i(!lVar.f924d);
                    lVar.a(false);
                }
            } else if (lVar != null) {
                p4.c.i(!lVar.f924d);
                lVar.a(false);
            } else if (this.f916h || this.f915g != 0 || this.f919k >= this.f917i) {
                lVar = null;
            } else {
                d dVarE = e(dVar, 2, 0);
                o oVar2 = dVarE.f892a;
                l lVar3 = new l(dVarE.f892a, cVar.a(oVar2), dVarE.f899h, false, this.f918j, this);
                map.put(oVar2.f945a, lVar3);
                int i13 = this.f919k;
                this.f919k = i13 + 1;
                if (i13 == 0) {
                    sendEmptyMessageDelayed(12, 5000L);
                }
                lVar3.start();
                lVar = lVar3;
            }
            if (lVar != null && !lVar.f924d) {
                i11++;
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        a aVar;
        Cursor cursor;
        ?? arrayList;
        b bVar;
        String str;
        int i10 = 7;
        ?? r72 = 0;
        r72 = 0;
        r72 = 0;
        r72 = 0;
        String str2 = null;
        r72 = 0;
        r72 = 0;
        r72 = 0;
        r72 = 0;
        r72 = 0;
        a aVar2 = null;
        a aVar3 = null;
        i = 0;
        int i11 = 0;
        switch (message.what) {
            case 1:
                int i12 = message.arg1;
                b bVar2 = this.f910b;
                ArrayList arrayList2 = this.f913e;
                this.f915g = i12;
                try {
                    try {
                        bVar2.k();
                        bVar2.b();
                        aVar = new a(bVar2.c(b.g(0, 1, 2, 5, 7), null), 0);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e10) {
                    e = e10;
                }
                while (true) {
                    try {
                        cursor = (Cursor) aVar.f869b;
                    } catch (IOException e11) {
                        e = e11;
                        aVar3 = aVar;
                        p4.c.o("DownloadManager", "Failed to load index.", e);
                        arrayList2.clear();
                        c0.g(aVar3);
                        aVar2 = aVar3;
                    } catch (Throwable th3) {
                        th = th3;
                        r72 = aVar;
                        c0.g(r72);
                        throw th;
                    }
                    if (!cursor.moveToPosition(cursor.getPosition() + 1)) {
                        c0.g(aVar);
                        this.f912d.obtainMessage(1, new ArrayList(arrayList2)).sendToTarget();
                        g();
                        r72 = aVar2;
                        i11 = 1;
                        this.f912d.obtainMessage(2, i11, this.f914f.size()).sendToTarget();
                        return;
                    }
                    arrayList2.add(b.e((Cursor) aVar.f869b));
                    break;
                }
                break;
            case 2:
                this.f916h = message.arg1 != 0;
                g();
                i11 = 1;
                this.f912d.obtainMessage(2, i11, this.f914f.size()).sendToTarget();
                return;
            case 3:
                this.f915g = message.arg1;
                g();
                i11 = 1;
                this.f912d.obtainMessage(2, i11, this.f914f.size()).sendToTarget();
                return;
            case 4:
                String str3 = (String) message.obj;
                int i13 = message.arg1;
                b bVar3 = this.f910b;
                ArrayList arrayList3 = this.f913e;
                if (str3 != null) {
                    d dVarB = b(str3, false);
                    if (dVarB != null) {
                        f(dVarB, i13);
                    } else {
                        try {
                            bVar3.m(i13, str3);
                        } catch (IOException e12) {
                            p4.c.o("DownloadManager", "Failed to set manual stop reason: ".concat(str3), e12);
                        }
                    }
                    break;
                } else {
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        f((d) arrayList3.get(i14), i13);
                    }
                    try {
                        bVar3.b();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i13));
                            bVar3.f876a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, b.f874d, null);
                        } catch (SQLException e13) {
                            throw new e(e13);
                        }
                    } catch (IOException e14) {
                        p4.c.o("DownloadManager", "Failed to set manual stop reason", e14);
                    }
                    break;
                }
                g();
                i11 = 1;
                this.f912d.obtainMessage(2, i11, this.f914f.size()).sendToTarget();
                return;
            case 5:
                this.f917i = message.arg1;
                g();
                i11 = 1;
                this.f912d.obtainMessage(2, i11, this.f914f.size()).sendToTarget();
                return;
            case 6:
                this.f918j = message.arg1;
                i11 = 1;
                this.f912d.obtainMessage(2, i11, this.f914f.size()).sendToTarget();
                return;
            case 7:
                o oVar = (o) message.obj;
                int i15 = message.arg1;
                d dVarB2 = b(oVar.f945a, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (dVarB2 != null) {
                    int i16 = dVarB2.f893b;
                    long j10 = (i16 == 5 || i16 == 3 || i16 == 4) ? jCurrentTimeMillis : dVarB2.f894c;
                    if (i16 != 5 && i16 != 7) {
                        i10 = i15 != 0 ? 1 : 0;
                    }
                    o oVar2 = dVarB2.f892a;
                    String str4 = oVar2.f945a;
                    String str5 = oVar.f945a;
                    List list = oVar.f948d;
                    p4.c.c(str4.equals(str5));
                    List list2 = oVar2.f948d;
                    if (list2.isEmpty() || list.isEmpty()) {
                        arrayList = Collections.EMPTY_LIST;
                    } else {
                        arrayList = new ArrayList(list2);
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            b1 b1Var = (b1) list.get(i17);
                            if (!arrayList.contains(b1Var)) {
                                arrayList.add(b1Var);
                            }
                        }
                    }
                    ?? r29 = arrayList;
                    String str6 = oVar2.f945a;
                    Uri uri = oVar.f946b;
                    String str7 = oVar.f947c;
                    byte[] bArr = oVar.f949e;
                    String str8 = oVar.f950f;
                    d(new d(new o(str6, uri, str7, r29, bArr, str8, oVar.f951g), i10, j10, jCurrentTimeMillis, i15));
                    str2 = str8;
                } else {
                    d(new d(oVar, i15 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, i15));
                }
                g();
                r72 = str2;
                i11 = 1;
                this.f912d.obtainMessage(2, i11, this.f914f.size()).sendToTarget();
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                String str9 = (String) message.obj;
                d dVarB3 = b(str9, true);
                if (dVarB3 == null) {
                    p4.c.n("DownloadManager", "Failed to remove nonexistent download: " + str9);
                } else {
                    e(dVarB3, 5, 0);
                    g();
                }
                i11 = 1;
                this.f912d.obtainMessage(2, i11, this.f914f.size()).sendToTarget();
                return;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                b bVar4 = this.f910b;
                ArrayList arrayList4 = this.f913e;
                ArrayList arrayList5 = new ArrayList();
                try {
                    bVar4.b();
                    Cursor cursorC = bVar4.c(b.g(3, 4), null);
                    while (cursorC.moveToPosition(cursorC.getPosition() + 1)) {
                        try {
                            arrayList5.add(b.e(cursorC));
                        } finally {
                        }
                        break;
                    }
                    cursorC.close();
                } catch (IOException unused) {
                    p4.c.n("DownloadManager", "Failed to load downloads.");
                }
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    arrayList4.set(i18, a((d) arrayList4.get(i18), 5, 0));
                }
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    arrayList4.add(a((d) arrayList5.get(i19), 5, 0));
                }
                Collections.sort(arrayList4, new i(z ? 1 : 0));
                try {
                    bVar4.l();
                    break;
                } catch (IOException e15) {
                    p4.c.o("DownloadManager", "Failed to update index.", e15);
                }
                ArrayList arrayList6 = new ArrayList(arrayList4);
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    this.f912d.obtainMessage(3, new h((d) arrayList4.get(i20), false, arrayList6, null)).sendToTarget();
                }
                g();
                i11 = 1;
                this.f912d.obtainMessage(2, i11, this.f914f.size()).sendToTarget();
                return;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                l lVar = (l) message.obj;
                String str10 = lVar.f921a.f945a;
                this.f914f.remove(str10);
                boolean z10 = lVar.f924d;
                if (z10) {
                    this.f920l = false;
                } else {
                    int i21 = this.f919k - 1;
                    this.f919k = i21;
                    if (i21 == 0) {
                        removeMessages(12);
                    }
                }
                if (lVar.f927g) {
                    g();
                } else {
                    Exception exc = lVar.f928h;
                    if (exc != null) {
                        p4.c.o("DownloadManager", "Task failed: " + lVar.f921a + ", " + z10, exc);
                    }
                    d dVarB4 = b(str10, false);
                    dVarB4.getClass();
                    int i22 = dVarB4.f893b;
                    if (i22 == 2) {
                        p4.c.i(!z10);
                        ArrayList arrayList7 = this.f913e;
                        d dVar = new d(dVarB4.f892a, exc == null ? 3 : 4, dVarB4.f894c, System.currentTimeMillis(), dVarB4.f896e, dVarB4.f897f, exc == null ? 0 : 1, dVarB4.f899h);
                        arrayList7.remove(c(dVar.f892a.f945a));
                        try {
                            this.f910b.i(dVar);
                        } catch (IOException e16) {
                            p4.c.o("DownloadManager", "Failed to update index.", e16);
                        }
                        this.f912d.obtainMessage(3, new h(dVar, false, new ArrayList(arrayList7), exc)).sendToTarget();
                        break;
                    } else {
                        if (i22 != 5 && i22 != 7) {
                            throw new IllegalStateException();
                        }
                        p4.c.i(z10);
                        ArrayList arrayList8 = this.f913e;
                        int i23 = dVarB4.f893b;
                        o oVar3 = dVarB4.f892a;
                        if (i23 == 7) {
                            int i24 = dVarB4.f897f;
                            e(dVarB4, i24 == 0 ? 0 : 1, i24);
                            g();
                        } else {
                            arrayList8.remove(c(oVar3.f945a));
                            try {
                                bVar = this.f910b;
                                str = oVar3.f945a;
                                bVar.b();
                            } catch (IOException unused2) {
                                p4.c.n("DownloadManager", "Failed to remove from database");
                            }
                            try {
                                bVar.f876a.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{str});
                                this.f912d.obtainMessage(3, new h(dVarB4, true, new ArrayList(arrayList8), null)).sendToTarget();
                            } catch (SQLiteException e17) {
                                throw new e(e17);
                            }
                        }
                    }
                    g();
                }
                this.f912d.obtainMessage(2, i11, this.f914f.size()).sendToTarget();
                return;
            case 11:
                l lVar2 = (l) message.obj;
                int i25 = message.arg1;
                int i26 = message.arg2;
                int i27 = c0.f16548a;
                long j11 = ((((long) i25) & 4294967295L) << 32) | (4294967295L & ((long) i26));
                d dVarB5 = b(lVar2.f921a.f945a, false);
                dVarB5.getClass();
                if (j11 == dVarB5.f896e || j11 == -1) {
                    return;
                }
                d(new d(dVarB5.f892a, dVarB5.f893b, dVarB5.f894c, System.currentTimeMillis(), j11, dVarB5.f897f, dVarB5.f898g, dVarB5.f899h));
                return;
            case 12:
                ArrayList arrayList9 = this.f913e;
                for (int i28 = 0; i28 < arrayList9.size(); i28++) {
                    d dVar2 = (d) arrayList9.get(i28);
                    if (dVar2.f893b == 2) {
                        try {
                            this.f910b.i(dVar2);
                        } catch (IOException e18) {
                            p4.c.o("DownloadManager", "Failed to update index.", e18);
                        }
                    }
                }
                sendEmptyMessageDelayed(12, 5000L);
                return;
            case 13:
                Iterator it = this.f914f.values().iterator();
                while (it.hasNext()) {
                    ((l) it.next()).a(true);
                }
                try {
                    this.f910b.k();
                    break;
                } catch (IOException e19) {
                    p4.c.o("DownloadManager", "Failed to update index.", e19);
                }
                this.f913e.clear();
                this.f909a.quit();
                synchronized (this) {
                    notifyAll();
                    break;
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
