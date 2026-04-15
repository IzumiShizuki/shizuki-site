package b7;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.graphics.drawable.IconCompat;
import com.cnl.kikoeru.MainService;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements g5.v, q8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1959c;

    public /* synthetic */ m(int i10, char c3) {
        this.f1957a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(b7.m r10, ub.b r11, ac.a r12) {
        /*
            java.lang.Object r0 = r10.f1959c
            h7.k r0 = (h7.k) r0
            boolean r1 = r12 instanceof yf.r
            if (r1 == 0) goto L17
            r1 = r12
            yf.r r1 = (yf.r) r1
            int r2 = r1.f26314k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f26314k = r2
            goto L1c
        L17:
            yf.r r1 = new yf.r
            r1.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r1.f26312i
            int r2 = r1.f26314k
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5e
            if (r2 != r8) goto L56
            int r10 = r1.f26311h
            java.lang.String r11 = r1.f26310g
            java.util.LinkedHashMap r0 = r1.f26309f
            b7.m r2 = r1.f26308e
            ub.b r9 = r1.f26307d
            ub.a.f(r12)
            xf.m r12 = (xf.m) r12
            r0.put(r11, r12)
            java.lang.Object r11 = r2.f1959c
            h7.k r11 = (h7.k) r11
            byte r11 = r11.i()
            if (r11 == r7) goto L53
            if (r11 != r6) goto L49
            goto L99
        L49:
            java.lang.Object r10 = r2.f1959c
            h7.k r10 = (h7.k) r10
            java.lang.String r11 = "Expected end of the object or comma"
            h7.k.q(r10, r11, r5, r3, r4)
            throw r3
        L53:
            r5 = r10
            r10 = r2
            goto L72
        L56:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L5e:
            ub.a.f(r12)
            byte r12 = r0.j(r4)
            byte r2 = r0.x()
            if (r2 == r7) goto Lb1
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9 = r11
            r11 = r12
        L72:
            java.lang.Object r12 = r10.f1959c
            h7.k r12 = (h7.k) r12
            boolean r2 = r12.f()
            if (r2 == 0) goto L98
            java.lang.String r11 = r12.m()
            r2 = 5
            r12.j(r2)
            r1.f26307d = r9
            r1.f26308e = r10
            r1.f26309f = r0
            r1.f26310g = r11
            r1.f26311h = r5
            r1.f26314k = r8
            r9.getClass()
            r9.f21528b = r1
            zb.a r10 = zb.a.f26667a
            return r10
        L98:
            r2 = r10
        L99:
            java.lang.Object r10 = r2.f1959c
            h7.k r10 = (h7.k) r10
            if (r11 != r4) goto La3
            r10.j(r6)
            goto La5
        La3:
            if (r11 == r7) goto Lab
        La5:
            xf.y r10 = new xf.y
            r10.<init>(r0)
            return r10
        Lab:
            java.lang.String r11 = "object"
            yf.k.l(r10, r11)
            throw r3
        Lb1:
            java.lang.String r10 = "Unexpected leading comma"
            h7.k.q(r0, r10, r5, r3, r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.m.e(b7.m, ub.b, ac.a):java.lang.Object");
    }

    public static void m(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = jc.l.g(str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        if (str.subSequence(i10, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e10) {
            Log.w("SupportSQLite", "delete failed: ", e10);
        }
    }

    @Override // q8.i
    public synchronized q8.c a(q8.b bVar) {
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.f1959c).get(bVar);
            q8.c cVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                q8.g gVar = (q8.g) arrayList.get(i10);
                Bitmap bitmap = (Bitmap) gVar.f17925b.get();
                q8.c cVar2 = bitmap != null ? new q8.c(bitmap, gVar.f17926c) : null;
                if (cVar2 != null) {
                    cVar = cVar2;
                    break;
                }
                i10++;
            }
            int i11 = this.f1958b;
            this.f1958b = i11 + 1;
            if (i11 >= 10) {
                f();
            }
            return cVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // q8.i
    public synchronized void b(int i10) {
        if (i10 >= 10 && i10 != 20) {
            f();
        }
    }

    @Override // q8.i
    public synchronized void c(q8.b bVar, Bitmap bitmap, Map map, int i10) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1959c;
            Object arrayList = linkedHashMap.get(bVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(bVar, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            q8.g gVar = new q8.g(iIdentityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(gVar);
                    break;
                }
                q8.g gVar2 = (q8.g) arrayList2.get(i11);
                if (i10 < gVar2.f17927d) {
                    i11++;
                } else if (gVar2.f17924a == iIdentityHashCode && gVar2.f17925b.get() == bitmap) {
                    arrayList2.set(i11, gVar);
                } else {
                    arrayList2.add(i11, gVar);
                }
            }
            int i12 = this.f1958b;
            this.f1958b = i12 + 1;
            if (i12 >= 10) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // g5.v
    public MediaCodecInfo d(int i10) {
        if (((MediaCodecInfo[]) this.f1959c) == null) {
            this.f1959c = new MediaCodecList(this.f1958b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f1959c)[i10];
    }

    public void f() {
        WeakReference weakReference;
        this.f1958b = 0;
        Iterator it = ((LinkedHashMap) this.f1959c).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                q8.g gVar = (q8.g) vb.m.a0(arrayList);
                if (((gVar == null || (weakReference = gVar.f17925b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((q8.g) arrayList.get(i12)).f17925b.get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // g5.v
    public boolean g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public m3.b h(v1 v1Var, b bVar) {
        MainService mainService = (MainService) this.f1959c;
        e4 e4Var = bVar.f1640a;
        p4.c.c(e4Var != null && e4Var.f1761a == 0);
        e4Var.getClass();
        IconCompat iconCompatB = IconCompat.b(mainService, bVar.f1643d);
        CharSequence charSequence = bVar.f1645f;
        String str = e4Var.f1762b;
        Bundle bundle = e4Var.f1763c;
        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
        intent.setData(v1Var.f2118a.f1675b);
        intent.setComponent(new ComponentName(mainService, mainService.getClass()));
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", str);
        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", bundle);
        int i10 = this.f1958b + 1;
        this.f1958b = i10;
        return new m3.b(iconCompatB, charSequence, PendingIntent.getService(mainService, i10, intent, 134217728 | (p4.c0.f16548a >= 23 ? 67108864 : 0)));
    }

    @Override // g5.v
    public boolean i(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // g5.v
    public int j() {
        if (((MediaCodecInfo[]) this.f1959c) == null) {
            this.f1959c = new MediaCodecList(this.f1958b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f1959c).length;
    }

    public PendingIntent k(v1 v1Var, long j10) {
        MainService mainService = (MainService) this.f1959c;
        int i10 = (j10 == 8 || j10 == 9) ? 87 : (j10 == 6 || j10 == 7) ? 88 : j10 == 3 ? 86 : j10 == 12 ? 90 : j10 == 11 ? 89 : j10 == 1 ? 85 : 0;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(v1Var.f2118a.f1675b);
        intent.setComponent(new ComponentName(mainService, mainService.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i10));
        int i11 = p4.c0.f16548a;
        if (i11 < 26 || j10 != 1 || ((v4.v) v1Var.a()).r()) {
            return PendingIntent.getService(mainService, i10, intent, i11 >= 23 ? 67108864 : 0);
        }
        return PendingIntent.getForegroundService(mainService, i10, intent, 67108864);
    }

    @Override // g5.v
    public boolean l() {
        return true;
    }

    public void n(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = (char[]) this.f1959c;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i12);
            jc.l.d(cArrCopyOf, "copyOf(...)");
            this.f1959c = cArrCopyOf;
        }
    }

    public void o(int i10, lh.c cVar) {
        while (true) {
            int i11 = i10 >> 1;
            if (i11 == 0) {
                break;
            }
            lh.c cVar2 = ((lh.c[]) this.f1959c)[i11];
            jc.l.b(cVar2);
            if (jc.l.h(0L, cVar.f12582c - cVar2.f12582c) <= 0) {
                break;
            }
            cVar2.f12554f = i10;
            ((lh.c[]) this.f1959c)[i10] = cVar2;
            i10 = i11;
        }
        ((lh.c[]) this.f1959c)[i10] = cVar;
        cVar.f12554f = i10;
    }

    public void p(b8.b bVar, int i10, int i11) {
        ((n7.t) this.f1959c).e(new q7.a(bVar), i10, i11);
    }

    public xf.m q() {
        xf.m yVar;
        Object obj;
        h7.k kVar = (h7.k) this.f1959c;
        byte bX = kVar.x();
        if (bX == 1) {
            return t(true);
        }
        if (bX == 0) {
            return t(false);
        }
        if (bX != 6) {
            if (bX == 8) {
                return r();
            }
            h7.k.q(kVar, "Cannot read Json element because of unexpected ".concat(yf.k.r(bX)), 0, null, 6);
            throw null;
        }
        int i10 = this.f1958b + 1;
        this.f1958b = i10;
        if (i10 == 200) {
            yf.q qVar = new yf.q(this, null);
            ub.b bVar = new ub.b();
            bVar.f21527a = qVar;
            bVar.f21528b = bVar;
            zb.a aVar = ub.a.f21525a;
            bVar.f21529c = aVar;
            while (true) {
                obj = bVar.f21529c;
                yb.c cVar = bVar.f21528b;
                if (cVar == null) {
                    break;
                }
                if (jc.l.a(aVar, obj)) {
                    try {
                        yf.q qVar2 = bVar.f21527a;
                        jc.c0.c(3, qVar2);
                        yf.q qVar3 = new yf.q(qVar2.f26306e, cVar);
                        qVar3.f26305d = bVar;
                        Object objU = qVar3.u(ub.a0.f21526a);
                        if (objU != zb.a.f26667a) {
                            cVar.h(objU);
                        }
                    } catch (Throwable th2) {
                        cVar.h(ub.a.b(th2));
                    }
                } else {
                    bVar.f21529c = aVar;
                    cVar.h(obj);
                }
            }
            ub.a.f(obj);
            yVar = (xf.m) obj;
        } else {
            byte bJ = kVar.j((byte) 6);
            if (kVar.x() == 4) {
                h7.k.q(kVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!kVar.f()) {
                    break;
                }
                String strM = kVar.m();
                kVar.j((byte) 5);
                linkedHashMap.put(strM, q());
                bJ = kVar.i();
                if (bJ != 4) {
                    if (bJ != 7) {
                        h7.k.q(kVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bJ == 6) {
                kVar.j((byte) 7);
            } else if (bJ == 4) {
                yf.k.l(kVar, "object");
                throw null;
            }
            yVar = new xf.y(linkedHashMap);
        }
        this.f1958b--;
        return yVar;
    }

    public xf.e r() {
        h7.k kVar = (h7.k) this.f1959c;
        byte bI = kVar.i();
        if (kVar.x() == 4) {
            h7.k.q(kVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (kVar.f()) {
            arrayList.add(q());
            bI = kVar.i();
            if (bI != 4) {
                boolean z10 = bI == 9;
                int i10 = kVar.f8197b;
                if (!z10) {
                    h7.k.q(kVar, "Expected end of the array or comma", i10, null, 4);
                    throw null;
                }
            }
        }
        if (bI == 8) {
            kVar.j((byte) 9);
        } else if (bI == 4) {
            yf.k.l(kVar, "array");
            throw null;
        }
        return new xf.e(arrayList);
    }

    public long s(r5.k kVar) {
        p4.s sVar = (p4.s) this.f1959c;
        int i10 = 0;
        kVar.i(sVar.f16611a, 0, 1, false);
        int i11 = sVar.f16611a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        kVar.i(sVar.f16611a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (sVar.f16611a[i10] & 255) + (i14 << 8);
        }
        this.f1958b = i13 + 1 + this.f1958b;
        return i14;
    }

    public xf.c0 t(boolean z10) {
        h7.k kVar = (h7.k) this.f1959c;
        String strN = !z10 ? kVar.n() : kVar.m();
        return (z10 || !jc.l.a(strN, "null")) ? new xf.s(strN, z10) : xf.v.INSTANCE;
    }

    public String toString() {
        switch (this.f1957a) {
            case 11:
                return new String((char[]) this.f1959c, 0, this.f1958b);
            default:
                return super.toString();
        }
    }

    public void u() {
        yf.c cVar = yf.c.f26281c;
        char[] cArr = (char[]) this.f1959c;
        cVar.getClass();
        jc.l.e(cArr, "array");
        synchronized (cVar) {
            int i10 = cVar.f21335a;
            if (cArr.length + i10 < yf.b.f26280a) {
                cVar.f21335a = i10 + cArr.length;
                ((vb.j) cVar.f21336b).addLast(cArr);
            }
        }
    }

    public void v(lh.c cVar) {
        lh.c cVar2;
        int i10 = cVar.f12554f;
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = this.f1958b;
        lh.c cVar3 = ((lh.c[]) this.f1959c)[i11];
        jc.l.b(cVar3);
        cVar.f12554f = -1;
        ((lh.c[]) this.f1959c)[i11] = null;
        this.f1958b = i11 - 1;
        if (cVar == cVar3) {
            return;
        }
        int iH = jc.l.h(0L, cVar3.f12582c - cVar.f12582c);
        if (iH == 0) {
            ((lh.c[]) this.f1959c)[i10] = cVar3;
            cVar3.f12554f = i10;
            return;
        }
        if (iH >= 0) {
            o(i10, cVar3);
            return;
        }
        while (true) {
            int i12 = i10 << 1;
            int i13 = i12 + 1;
            int i14 = this.f1958b;
            if (i13 > i14) {
                if (i12 > i14) {
                    break;
                }
                cVar2 = ((lh.c[]) this.f1959c)[i12];
                jc.l.b(cVar2);
            } else {
                cVar2 = ((lh.c[]) this.f1959c)[i12];
                jc.l.b(cVar2);
                lh.c cVar4 = ((lh.c[]) this.f1959c)[i13];
                jc.l.b(cVar4);
                if (jc.l.h(0L, cVar4.f12582c - cVar2.f12582c) >= 0) {
                    cVar2 = cVar4;
                }
            }
            if (jc.l.h(0L, cVar2.f12582c - cVar3.f12582c) <= 0) {
                break;
            }
            int i15 = cVar2.f12554f;
            cVar2.f12554f = i10;
            ((lh.c[]) this.f1959c)[i10] = cVar2;
            i10 = i15;
        }
        ((lh.c[]) this.f1959c)[i10] = cVar3;
        cVar3.f12554f = i10;
    }

    public void w(String str) {
        jc.l.e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        n(this.f1958b, length);
        str.getChars(0, str.length(), (char[]) this.f1959c, this.f1958b);
        this.f1958b += length;
    }

    public /* synthetic */ m(int i10, int i11, Object obj) {
        this.f1957a = i11;
        this.f1959c = obj;
        this.f1958b = i10;
    }

    public m(xf.j jVar, h7.k kVar) {
        this.f1957a = 12;
        this.f1959c = kVar;
    }

    public m(byte b10, int i10) {
        this.f1957a = i10;
        switch (i10) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                this.f1959c = new LinkedHashMap();
                break;
            default:
                this.f1959c = new p4.s(8);
                break;
        }
    }

    public m(MainService mainService) {
        this.f1957a = 0;
        this.f1958b = 0;
        this.f1959c = mainService;
    }

    public m(int i10, int i11) {
        this.f1957a = i11;
        switch (i11) {
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                if (i10 > 0) {
                    this.f1959c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            default:
                this.f1958b = i10;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(n7.t tVar, int i10) {
        this(i10, 7);
        this.f1957a = 7;
        this.f1959c = tVar;
    }

    public m(int i10, Notification notification) {
        this.f1957a = 1;
        this.f1958b = i10;
        notification.getClass();
        this.f1959c = notification;
    }

    public m(ArrayList arrayList) {
        this.f1957a = 13;
        this.f1959c = arrayList;
    }

    public m(boolean z10, boolean z11) {
        this.f1957a = 3;
        this.f1958b = (z10 || z11) ? 1 : 0;
    }
}
