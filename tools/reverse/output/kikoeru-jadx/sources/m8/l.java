package m8;

import android.webkit.MimeTypeMap;
import b7.b1;
import ef.n;
import ef.u;
import java.io.IOException;
import java.util.Map;
import lh.b0;
import lh.y;
import ub.p;
import ug.r;
import ug.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ug.g f14965f = new ug.g(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ug.g f14966g = new ug.g(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s8.m f14968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f14969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f14970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14971e;

    public l(String str, s8.m mVar, p pVar, p pVar2, boolean z10) {
        this.f14967a = str;
        this.f14968b = mVar;
        this.f14969c = pVar;
        this.f14970d = pVar2;
        this.f14971e = z10;
    }

    public static String d(String str, v vVar) {
        String strB;
        String str2 = vVar != null ? vVar.f21879a : null;
        if ((str2 == null || u.k0(str2, "text/plain", false)) && (strB = x8.d.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return n.S0(';', str2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0200 A[Catch: Exception -> 0x01fd, TryCatch #1 {Exception -> 0x01fd, blocks: (B:93:0x01d1, B:95:0x01d7, B:99:0x01f9, B:103:0x0200, B:104:0x0205), top: B:118:0x01d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094 A[Catch: Exception -> 0x00cc, TRY_ENTER, TryCatch #2 {Exception -> 0x00cc, blocks: (B:36:0x0094, B:38:0x00a0, B:47:0x00d0, B:49:0x00d4, B:52:0x00ed, B:62:0x0135, B:54:0x0103, B:56:0x010f, B:57:0x0118, B:41:0x00b4, B:43:0x00be, B:59:0x0120, B:60:0x0127, B:61:0x0128), top: B:119:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128 A[Catch: Exception -> 0x00cc, TryCatch #2 {Exception -> 0x00cc, blocks: (B:36:0x0094, B:38:0x00a0, B:47:0x00d0, B:49:0x00d4, B:52:0x00ed, B:62:0x0135, B:54:0x0103, B:56:0x010f, B:57:0x0118, B:41:0x00b4, B:43:0x00be, B:59:0x0120, B:60:0x0127, B:61:0x0128), top: B:119:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d7 A[Catch: Exception -> 0x01fd, TryCatch #1 {Exception -> 0x01fd, blocks: (B:93:0x01d1, B:95:0x01d7, B:99:0x01f9, B:103:0x0200, B:104:0x0205), top: B:118:0x01d1 }] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ub.h] */
    @Override // m8.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(yb.c r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.l.a(yb.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(b7.b1 r5, ac.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m8.j
            if (r0 == 0) goto L13
            r0 = r6
            m8.j r0 = (m8.j) r0
            int r1 = r0.f14958f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14958f = r1
            goto L18
        L13:
            m8.j r0 = new m8.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f14956d
            int r1 = r0.f14958f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r6)
            goto L91
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            ub.a.f(r6)
            android.graphics.Bitmap$Config[] r6 = x8.d.f24838a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r6 = jc.l.a(r6, r1)
            ub.p r1 = r4.f14969c
            if (r6 == 0) goto L61
            s8.m r6 = r4.f14968b
            s8.b r6 = r6.f19655o
            boolean r6 = r6.f19565a
            if (r6 != 0) goto L5b
            java.lang.Object r6 = r1.getValue()
            ug.h r6 = (ug.h) r6
            ug.x r6 = (ug.x) r6
            zg.n r5 = r6.a(r5)
            ug.d0 r5 = r5.f()
            goto L94
        L5b:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L61:
            java.lang.Object r6 = r1.getValue()
            ug.h r6 = (ug.h) r6
            ug.x r6 = (ug.x) r6
            zg.n r5 = r6.a(r5)
            r0.f14958f = r2
            hf.k r6 = new hf.k
            yb.c r0 = ud.s.p(r0)
            r6.<init>(r2, r0)
            r6.r()
            ee.j r0 = new ee.j
            r1 = 9
            r0.<init>(r1, r5, r6)
            r5.e(r0)
            r6.w(r0)
            java.lang.Object r6 = r6.q()
            zb.a r5 = zb.a.f26667a
            if (r6 != r5) goto L91
            return r5
        L91:
            r5 = r6
            ug.d0 r5 = (ug.d0) r5
        L94:
            boolean r6 = r5.f21772q
            int r0 = r5.f21759d
            if (r6 != 0) goto Lbc
            r6 = 304(0x130, float:4.26E-43)
            if (r0 == r6) goto Lbc
            ug.f0 r6 = r5.f21762g
            if (r6 == 0) goto La5
            x8.d.a(r6)
        La5:
            ce.j0 r6 = new ce.j0
            java.lang.String r1 = "HTTP "
            java.lang.String r2 = ": "
            java.lang.StringBuilder r0 = j2.h0.o(r0, r1, r2)
            java.lang.String r5 = r5.f21758c
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.l.b(b7.b1, ac.c):java.lang.Object");
    }

    public final lh.l c() {
        Object value = this.f14970d.getValue();
        jc.l.b(value);
        return ((k8.f) value).f11223a;
    }

    public final b1 e() {
        ch.l lVar = new ch.l(10);
        lVar.B(this.f14967a);
        s8.m mVar = this.f14968b;
        r rVar = mVar.f19650j;
        jc.l.e(rVar, "headers");
        lVar.f4202c = rVar.j();
        for (Map.Entry entry : mVar.f19651k.f19666a.entrySet()) {
            Object key = entry.getKey();
            jc.l.c(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            Object value = entry.getValue();
            lVar.f4205f = ((ud.n) lVar.f4205f).y(g8.a.H((Class) key), value);
        }
        s8.b bVar = mVar.f19654n;
        boolean z10 = bVar.f19565a;
        boolean z11 = mVar.f19655o.f19565a;
        if (!z11 && z10) {
            lVar.p(ug.g.f21780o);
        } else if (!z11 || z10) {
            if (!z11 && !z10) {
                lVar.p(f14966g);
            }
        } else if (bVar.f19566b) {
            lVar.p(ug.g.f21779n);
        } else {
            lVar.p(f14965f);
        }
        return new b1(lVar);
    }

    public final r8.b f(androidx.media3.exoplayer.offline.a aVar) throws Throwable {
        Throwable th2;
        r8.b bVar;
        try {
            lh.l lVarC = c();
            k8.b bVar2 = (k8.b) aVar.f869b;
            if (bVar2.f11201b) {
                throw new IllegalStateException("snapshot is closed");
            }
            b0 b0VarL = g8.a.l(lVarC.L((y) bVar2.f11200a.f11193c.get(0)));
            try {
                bVar = new r8.b(b0VarL);
                try {
                    b0VarL.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    b0VarL.close();
                } catch (Throwable th5) {
                    ub.a.a(th4, th5);
                }
                th2 = th4;
                bVar = null;
            }
            if (th2 == null) {
                return bVar;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    public final j8.m g(androidx.media3.exoplayer.offline.a aVar) {
        k8.b bVar = (k8.b) aVar.f869b;
        if (bVar.f11201b) {
            throw new IllegalStateException("snapshot is closed");
        }
        y yVar = (y) bVar.f11200a.f11193c.get(1);
        lh.l lVarC = c();
        String str = this.f14968b.f19649i;
        if (str == null) {
            str = this.f14967a;
        }
        return new j8.m(yVar, lVarC, str, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.exoplayer.offline.a h(androidx.media3.exoplayer.offline.a r4, b7.b1 r5, ug.d0 r6, r8.b r7) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.l.h(androidx.media3.exoplayer.offline.a, b7.b1, ug.d0, r8.b):androidx.media3.exoplayer.offline.a");
    }
}
