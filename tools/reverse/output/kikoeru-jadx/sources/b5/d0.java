package b5;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.text.TextUtils;
import android.util.SparseArray;
import ba.q0;
import i7.p2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import r5.h0;
import ya.f1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements r5.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1523d;

    public d0(int i10, boolean z10) {
        switch (i10) {
            case 7:
                this.f1521b = new Object();
                this.f1522c = new ArrayList();
                this.f1523d = new ArrayList();
                this.f1520a = true;
                break;
            default:
                this.f1521b = new float[16];
                this.f1522c = new float[16];
                this.f1523d = new ce.g((byte) 0, 2);
                break;
        }
    }

    public static IOException c(d0 d0Var, boolean z10, IOException iOException, int i10) {
        boolean z11 = (i10 & 4) == 0;
        boolean z12 = (i10 & 8) == 0;
        if (iOException != null) {
            d0Var.s(iOException);
        }
        return ((zg.n) d0Var.f1521b).i(d0Var, z12 && !z10, z11 && !z10, z11 && z10, z12 && z10, iOException);
    }

    public static void g(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float f12 = fArr2[10] / fSqrt;
        fArr[0] = f12;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12;
    }

    @Override // r5.q
    public void a(r5.b0 b0Var) {
        ((r5.q) this.f1521b).a(b0Var);
    }

    public void b() {
        xg.g gVar = (xg.g) this.f1523d;
        synchronized (gVar) {
            try {
                if (this.f1520a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jc.l.a(((xg.c) this.f1521b).f25039g, this)) {
                    gVar.g(this, false);
                }
                this.f1520a = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d(m4.d dVar, m4.q qVar) {
        String str = qVar.f14544n;
        int i10 = qVar.D;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i10 == 16) {
                i10 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i10 == -1) {
                i10 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i10 == 18 || i10 == 21)) {
            i10 = 24;
        }
        int iS = p4.c0.s(i10);
        if (iS == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iS);
        int i11 = qVar.E;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return ((Spatializer) this.f1521b).canBeSpatialized((AudioAttributes) dVar.b().f14586a, channelMask.build());
    }

    public void e() {
        xg.g gVar = (xg.g) this.f1523d;
        synchronized (gVar) {
            try {
                if (this.f1520a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (jc.l.a(((xg.c) this.f1521b).f25039g, this)) {
                    gVar.g(this, true);
                }
                this.f1520a = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(boolean z10) {
        k8.d dVar = (k8.d) this.f1523d;
        synchronized (dVar) {
            try {
                if (this.f1520a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (jc.l.a(((k8.a) this.f1521b).f11197g, this)) {
                    k8.d.b(dVar, this, z10);
                }
                this.f1520a = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h() {
        xg.c cVar = (xg.c) this.f1521b;
        if (jc.l.a(cVar.f25039g, this)) {
            xg.g gVar = (xg.g) this.f1523d;
            if (gVar.f25065l) {
                gVar.g(this, false);
            } else {
                cVar.f25038f = true;
            }
        }
    }

    public byte[] i(UUID uuid, v vVar) throws f0 {
        String str = vVar.f1600b;
        if (this.f1520a || TextUtils.isEmpty(str)) {
            str = (String) this.f1522c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            p4.c.k(uri, "The uri must be set.");
            throw new f0(new s4.m(uri, 0L, 1, null, map, 0L, -1L, null, 0), uri, f1.f25977g, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = m4.g.f14212e;
        map2.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : m4.g.f14210c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.f1523d)) {
            map2.putAll((HashMap) this.f1523d);
        }
        return a2.c.G(((s4.o) this.f1521b).q(), str, vVar.f1599a, map2);
    }

    public byte[] j(w wVar) {
        return a2.c.G(((s4.o) this.f1521b).q(), wVar.f1602b + "&signedRequest=" + p4.c0.p(wVar.f1601a), null, Collections.EMPTY_MAP);
    }

    public lh.y k(int i10) {
        lh.y yVar;
        k8.d dVar = (k8.d) this.f1523d;
        synchronized (dVar) {
            if (this.f1520a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f1522c)[i10] = true;
            Object obj = ((k8.a) this.f1521b).f11194d.get(i10);
            k8.c cVar = dVar.f11219p;
            lh.y yVar2 = (lh.y) obj;
            if (!cVar.q(yVar2)) {
                x8.d.a(cVar.G(yVar2));
            }
            yVar = (lh.y) obj;
        }
        return yVar;
    }

    public zg.o l() {
        ah.e eVarI = ((ah.f) this.f1523d).i();
        zg.o oVar = eVarI instanceof zg.o ? (zg.o) eVarI : null;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f1521b) {
            z10 = this.f1520a;
        }
        return z10;
    }

    @Override // r5.q
    public void n() {
        SparseArray sparseArray = (SparseArray) this.f1523d;
        ((r5.q) this.f1521b).n();
        if (this.f1520a) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((o6.m) sparseArray.valueAt(i10)).f16278i = true;
            }
        }
    }

    public lh.f0 o(int i10) {
        xg.g gVar = (xg.g) this.f1523d;
        synchronized (gVar) {
            try {
                if (this.f1520a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!jc.l.a(((xg.c) this.f1521b).f25039g, this)) {
                    return new lh.d();
                }
                if (!((xg.c) this.f1521b).f25037e) {
                    boolean[] zArr = (boolean[]) this.f1522c;
                    jc.l.b(zArr);
                    zArr[i10] = true;
                }
                lh.y yVar = (lh.y) ((xg.c) this.f1521b).f25036d.get(i10);
                try {
                    xg.f fVar = gVar.f25055b;
                    fVar.getClass();
                    jc.l.e(yVar, "file");
                    return new k8.e(fVar.G(yVar), new q0(22, gVar, this));
                } catch (FileNotFoundException unused) {
                    return new lh.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(hf.d1 r5, ac.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i7.m2
            if (r0 == 0) goto L13
            r0 = r6
            i7.m2 r0 = (i7.m2) r0
            int r1 = r0.f9212i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9212i = r1
            goto L18
        L13:
            i7.m2 r0 = new i7.m2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9210g
            int r1 = r0.f9212i
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            rf.c r5 = r0.f9209f
            hf.d1 r1 = r0.f9208e
            b5.d0 r0 = r0.f9207d
            ub.a.f(r6)
            r6 = r5
            r5 = r1
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            ub.a.f(r6)
            java.lang.Object r6 = r4.f1522c
            rf.c r6 = (rf.c) r6
            r0.f9207d = r4
            r0.f9208e = r5
            r0.f9209f = r6
            r0.f9212i = r2
            java.lang.Object r0 = r6.g(r0)
            zb.a r1 = zb.a.f26667a
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            r1 = 0
            java.lang.Object r2 = r0.f1523d     // Catch: java.lang.Throwable -> L58
            hf.d1 r2 = (hf.d1) r2     // Catch: java.lang.Throwable -> L58
            if (r5 != r2) goto L5a
            r0.f1523d = r1     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r5 = move-exception
            goto L60
        L5a:
            r6.b(r1)
            ub.a0 r5 = ub.a0.f21526a
            return r5
        L60:
            r6.b(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.d0.p(hf.d1, ac.c):java.lang.Object");
    }

    public boolean q(int[] iArr) {
        jc.l.e(iArr, "tableIds");
        ReentrantLock reentrantLock = (ReentrantLock) this.f1521b;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : iArr) {
                long[] jArr = (long[]) this.f1522c;
                long j10 = jArr[i10];
                jArr[i10] = 1 + j10;
                if (j10 == 0) {
                    z10 = true;
                    this.f1520a = true;
                }
            }
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    public ug.c0 r(boolean z10) throws IOException {
        try {
            ug.c0 c0VarD = ((ah.f) this.f1523d).d(z10);
            if (c0VarD == null) {
                return c0VarD;
            }
            c0VarD.f21742n = this;
            return c0VarD;
        } catch (IOException e10) {
            s(e10);
            throw e10;
        }
    }

    public void s(IOException iOException) {
        this.f1520a = true;
        ((ah.f) this.f1523d).i().e((zg.n) this.f1521b, iOException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [hf.d1] */
    /* JADX WARN: Type inference failed for: r10v1, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4, types: [rf.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [hf.d1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(hf.d1 r10, ac.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof i7.n2
            if (r0 == 0) goto L13
            r0 = r11
            i7.n2 r0 = (i7.n2) r0
            int r1 = r0.f9229i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9229i = r1
            goto L18
        L13:
            i7.n2 r0 = new i7.n2
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f9227g
            int r1 = r0.f9229i
            r2 = 2
            r3 = 1
            r4 = 0
            zb.a r5 = zb.a.f26667a
            if (r1 == 0) goto L46
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            rf.a r10 = r0.f9226f
            hf.d1 r1 = r0.f9225e
            b5.d0 r0 = r0.f9224d
            ub.a.f(r11)     // Catch: java.lang.Throwable -> L31
            goto L92
        L31:
            r11 = move-exception
            goto L9d
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            rf.a r10 = r0.f9226f
            hf.d1 r1 = r0.f9225e
            b5.d0 r6 = r0.f9224d
            ub.a.f(r11)
            goto L5f
        L46:
            ub.a.f(r11)
            java.lang.Object r11 = r9.f1522c
            rf.c r11 = (rf.c) r11
            r0.f9224d = r9
            r0.f9225e = r10
            r0.f9226f = r11
            r0.f9229i = r3
            java.lang.Object r1 = r11.g(r0)
            if (r1 != r5) goto L5c
            goto L90
        L5c:
            r6 = r9
            r1 = r10
            r10 = r11
        L5f:
            java.lang.Object r11 = r6.f1523d     // Catch: java.lang.Throwable -> L31
            hf.d1 r11 = (hf.d1) r11     // Catch: java.lang.Throwable -> L31
            if (r11 == 0) goto L72
            boolean r7 = r11.b()     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L72
            boolean r7 = r6.f1520a     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L70
            goto L72
        L70:
            r3 = 0
            goto L95
        L72:
            if (r11 == 0) goto L80
            i7.l2 r7 = new i7.l2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r6.f1521b     // Catch: java.lang.Throwable -> L31
            i7.p2 r8 = (i7.p2) r8     // Catch: java.lang.Throwable -> L31
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L31
            r11.g(r7)     // Catch: java.lang.Throwable -> L31
        L80:
            if (r11 == 0) goto L93
            r0.f9224d = r6     // Catch: java.lang.Throwable -> L31
            r0.f9225e = r1     // Catch: java.lang.Throwable -> L31
            r0.f9226f = r10     // Catch: java.lang.Throwable -> L31
            r0.f9229i = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r11 = r11.Y(r0)     // Catch: java.lang.Throwable -> L31
            if (r11 != r5) goto L91
        L90:
            return r5
        L91:
            r0 = r6
        L92:
            r6 = r0
        L93:
            r6.f1523d = r1     // Catch: java.lang.Throwable -> L31
        L95:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L31
            r10.b(r4)
            return r11
        L9d:
            r10.b(r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.d0.t(hf.d1, ac.c):java.lang.Object");
    }

    @Override // r5.q
    public h0 u(int i10, int i11) {
        SparseArray sparseArray = (SparseArray) this.f1523d;
        r5.q qVar = (r5.q) this.f1521b;
        if (i11 != 3) {
            this.f1520a = true;
            return qVar.u(i10, i11);
        }
        o6.m mVar = (o6.m) sparseArray.get(i10);
        if (mVar != null) {
            return mVar;
        }
        o6.m mVar2 = new o6.m(qVar.u(i10, i11), (o6.j) this.f1522c);
        sparseArray.put(i10, mVar2);
        return mVar2;
    }

    public v2.e v() throws SocketException {
        zg.n nVar = (zg.n) this.f1521b;
        if (nVar.f26876i) {
            throw new IllegalStateException("Check failed.");
        }
        nVar.f26876i = true;
        nVar.f26871d.i();
        synchronized (nVar) {
            if (nVar.f26884q == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (nVar.f26880m || nVar.f26881n) {
                throw new IllegalStateException("Check failed.");
            }
            if (nVar.f26878k) {
                throw new IllegalStateException("Check failed.");
            }
            if (!nVar.f26879l) {
                throw new IllegalStateException("Check failed.");
            }
            nVar.f26879l = false;
            nVar.f26880m = true;
            nVar.f26881n = true;
        }
        ah.e eVarI = ((ah.f) this.f1523d).i();
        jc.l.c(eVarI, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        zg.o oVar = (zg.o) eVarI;
        oVar.f26889e.setSoTimeout(0);
        oVar.f();
        return new v2.e(this);
    }

    public d0(zg.n nVar, zg.h hVar, ah.f fVar) {
        jc.l.e(hVar, "finder");
        this.f1521b = nVar;
        this.f1522c = hVar;
        this.f1523d = fVar;
    }

    public d0(r5.q qVar, o6.j jVar) {
        this.f1521b = qVar;
        this.f1522c = jVar;
        this.f1523d = new SparseArray();
    }

    public d0(String str, boolean z10, s4.o oVar) {
        p4.c.c((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f1521b = oVar;
        this.f1522c = str;
        this.f1520a = z10;
        this.f1523d = new HashMap();
    }

    public d0(p2 p2Var, boolean z10) {
        this.f1521b = p2Var;
        this.f1520a = z10;
        this.f1522c = new rf.c();
    }

    public d0(int i10) {
        this.f1521b = new ReentrantLock();
        this.f1522c = new long[i10];
        this.f1523d = new boolean[i10];
    }

    public d0(k8.d dVar, k8.a aVar) {
        this.f1523d = dVar;
        this.f1521b = aVar;
        this.f1522c = new boolean[2];
    }

    public d0(xg.g gVar, xg.c cVar) {
        boolean[] zArr;
        this.f1523d = gVar;
        this.f1521b = cVar;
        if (cVar.f25037e) {
            zArr = null;
        } else {
            gVar.getClass();
            zArr = new boolean[2];
        }
        this.f1522c = zArr;
    }

    public d0(Spatializer spatializer) {
        this.f1521b = spatializer;
        this.f1520a = spatializer.getImmersiveAudioLevel() != 0;
    }
}
