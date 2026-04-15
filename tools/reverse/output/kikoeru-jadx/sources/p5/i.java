package p5;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Surface;
import i7.j1;
import j5.d0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m4.f1;
import m4.i1;
import m4.o0;
import m4.u1;
import n7.b0;
import p4.c0;
import q.t0;
import v4.z0;
import ya.a1;
import ya.f0;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends g5.q {
    public static final int[] C1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean D1;
    public static boolean E1;
    public long A1;
    public boolean B1;
    public final Context S0;
    public final boolean T0;
    public final y U0;
    public final int V0;
    public final boolean W0;
    public final r X0;
    public final mh.f Y0;
    public j1 Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f16659a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f16660b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public l f16661c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f16662d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public List f16663e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Surface f16664f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public k f16665g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public p4.u f16666h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f16667i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f16668j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f16669k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public long f16670l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f16671m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f16672n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f16673o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public long f16674p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f16675q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public long f16676r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public u1 f16677s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public u1 f16678t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public int f16679u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f16680v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public int f16681w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public h f16682x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public q f16683y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public long f16684z1;

    public i(Context context, g5.j jVar, Handler handler, v4.s sVar) {
        super(2, jVar, g5.r.f7422d0, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.S0 = applicationContext;
        this.V0 = 50;
        this.f16661c1 = null;
        this.U0 = new y(handler, sVar, 0);
        this.T0 = true;
        this.X0 = new r(applicationContext, this);
        this.Y0 = new mh.f();
        this.W0 = "NVIDIA".equals(c0.f16550c);
        this.f16666h1 = p4.u.f16621c;
        this.f16668j1 = 1;
        this.f16669k1 = 0;
        this.f16677s1 = u1.f14594d;
        this.f16681w1 = 0;
        this.f16678t1 = null;
        this.f16679u1 = -1000;
        this.f16684z1 = -9223372036854775807L;
        this.A1 = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean u0(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 3210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.i.u0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int v0(g5.n r11, m4.q r12) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.i.v0(g5.n, m4.q):int");
    }

    public static List w0(Context context, g5.r rVar, m4.q qVar, boolean z10, boolean z11) {
        String str = qVar.f14544n;
        if (str == null) {
            return a1.f25946e;
        }
        if (c0.f16548a >= 26 && "video/dolby-vision".equals(str) && !b0.i(context)) {
            String strB = g5.y.b(qVar);
            List listA = strB == null ? a1.f25946e : rVar.a(strB, z10, z11);
            if (!listA.isEmpty()) {
                return listA;
            }
        }
        return g5.y.g(rVar, qVar, z10, z11);
    }

    public static int x0(g5.n nVar, m4.q qVar) {
        int i10 = qVar.f14545o;
        List list = qVar.f14547q;
        if (i10 == -1) {
            return v0(nVar, qVar);
        }
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return qVar.f14545o + length;
    }

    public final void A0() {
        if (this.f16671m1 > 0) {
            this.f22456g.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f16670l1;
            int i10 = this.f16671m1;
            y yVar = this.U0;
            Handler handler = yVar.f16767b;
            if (handler != null) {
                handler.post(new w(yVar, i10, j10));
            }
            this.f16671m1 = 0;
            this.f16670l1 = jElapsedRealtime;
        }
    }

    @Override // g5.q
    public final v4.g B(g5.n nVar, m4.q qVar, m4.q qVar2) {
        v4.g gVarB = nVar.b(qVar, qVar2);
        int i10 = gVarB.f22489e;
        j1 j1Var = this.Z0;
        j1Var.getClass();
        if (qVar2.f14551u > j1Var.f9176a || qVar2.f14552v > j1Var.f9177b) {
            i10 |= 256;
        }
        if (x0(nVar, qVar2) > j1Var.f9178c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new v4.g(nVar.f7385a, qVar, qVar2, i11 != 0 ? 0 : gVarB.f22488d, i11);
    }

    public final void B0() {
        int i10;
        g5.k kVar;
        if (!this.f16680v1 || (i10 = c0.f16548a) < 23 || (kVar = this.K) == null) {
            return;
        }
        this.f16682x1 = new h(this, kVar);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            kVar.c(bundle);
        }
    }

    @Override // g5.q
    public final g5.m C(IllegalStateException illegalStateException, g5.n nVar) {
        Surface surface = this.f16664f1;
        f fVar = new f(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return fVar;
    }

    public final void C0(g5.k kVar, int i10, long j10) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        kVar.N(i10, j10);
        Trace.endSection();
        this.N0.f22474e++;
        this.f16672n1 = 0;
        if (this.f16661c1 == null) {
            u1 u1Var = this.f16677s1;
            boolean zEquals = u1Var.equals(u1.f14594d);
            y yVar = this.U0;
            if (!zEquals && !u1Var.equals(this.f16678t1)) {
                this.f16678t1 = u1Var;
                yVar.c(u1Var);
            }
            r rVar = this.X0;
            boolean z10 = rVar.f16720d != 3;
            rVar.f16720d = 3;
            rVar.f16727k.getClass();
            rVar.f16722f = c0.N(SystemClock.elapsedRealtime());
            if (!z10 || (surface = this.f16664f1) == null) {
                return;
            }
            Handler handler = yVar.f16767b;
            if (handler != null) {
                handler.post(new x(yVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f16667i1 = true;
        }
    }

    public final void D0(Object obj) throws v4.m {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f16664f1;
        y yVar = this.U0;
        if (surface2 == surface) {
            if (surface != null) {
                u1 u1Var = this.f16678t1;
                if (u1Var != null) {
                    yVar.c(u1Var);
                }
                Surface surface3 = this.f16664f1;
                if (surface3 == null || !this.f16667i1 || (handler = yVar.f16767b) == null) {
                    return;
                }
                handler.post(new x(yVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f16664f1 = surface;
        l lVar = this.f16661c1;
        r rVar = this.X0;
        if (lVar == null) {
            u uVar = rVar.f16718b;
            if (uVar.f16739e != surface) {
                uVar.b();
                uVar.f16739e = surface;
                uVar.d(true);
            }
            rVar.d(1);
        }
        this.f16667i1 = false;
        int i10 = this.f22457h;
        g5.k kVar = this.K;
        if (kVar != null && this.f16661c1 == null) {
            g5.n nVar = this.R;
            nVar.getClass();
            boolean zZ0 = z0(nVar);
            int i11 = c0.f16548a;
            if (i11 < 23 || !zZ0 || this.f16659a1) {
                h0();
                S();
            } else {
                Surface surfaceY0 = y0(nVar);
                if (i11 >= 23 && surfaceY0 != null) {
                    kVar.y0(surfaceY0);
                } else {
                    if (i11 < 35) {
                        throw new IllegalStateException();
                    }
                    kVar.B();
                }
            }
        }
        if (surface != null) {
            u1 u1Var2 = this.f16678t1;
            if (u1Var2 != null) {
                yVar.c(u1Var2);
            }
            if (i10 == 2) {
                l lVar2 = this.f16661c1;
                if (lVar2 != null) {
                    lVar2.c(true);
                } else {
                    rVar.c(true);
                }
            }
        } else {
            this.f16678t1 = null;
            l lVar3 = this.f16661c1;
            if (lVar3 != null) {
                p pVar = lVar3.f16700f;
                int i12 = p4.u.f16621c.f16622a;
                pVar.f16712j = null;
            }
        }
        B0();
    }

    public final boolean E0(g5.n nVar) {
        if (c0.f16548a < 23 || this.f16680v1 || u0(nVar.f7385a)) {
            return false;
        }
        return !nVar.f7390f || k.a(this.S0);
    }

    public final void F0(g5.k kVar, int i10) {
        Trace.beginSection("skipVideoBuffer");
        kVar.i(i10);
        Trace.endSection();
        this.N0.f22475f++;
    }

    public final void G0(int i10, int i11) {
        v4.f fVar = this.N0;
        fVar.f22477h += i10;
        int i12 = i10 + i11;
        fVar.f22476g += i12;
        this.f16671m1 += i12;
        int i13 = this.f16672n1 + i12;
        this.f16672n1 = i13;
        fVar.f22478i = Math.max(i13, fVar.f22478i);
        int i14 = this.V0;
        if (i14 <= 0 || this.f16671m1 < i14) {
            return;
        }
        A0();
    }

    public final void H0(long j10) {
        v4.f fVar = this.N0;
        fVar.f22480k += j10;
        fVar.f22481l++;
        this.f16674p1 += j10;
        this.f16675q1++;
    }

    @Override // g5.q
    public final int K(u4.f fVar) {
        return (c0.f16548a < 34 || !this.f16680v1 || fVar.f21384g >= this.f22461l) ? 0 : 32;
    }

    @Override // g5.q
    public final boolean L() {
        return this.f16680v1 && c0.f16548a < 23;
    }

    @Override // g5.q
    public final float M(float f10, m4.q[] qVarArr) {
        float fMax = -1.0f;
        for (m4.q qVar : qVarArr) {
            float f11 = qVar.f14553w;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // g5.q
    public final ArrayList N(g5.r rVar, m4.q qVar, boolean z10) {
        List listW0 = w0(this.S0, rVar, qVar, z10, this.f16680v1);
        HashMap map = g5.y.f7430a;
        ArrayList arrayList = new ArrayList(listW0);
        Collections.sort(arrayList, new g5.s(0, new androidx.media3.exoplayer.offline.g(12, qVar)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0138, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013b, code lost:
    
        r15 = r9;
     */
    @Override // g5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b7.b1 O(g5.n r25, m4.q r26, android.media.MediaCrypto r27, float r28) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.i.O(g5.n, m4.q, android.media.MediaCrypto, float):b7.b1");
    }

    @Override // g5.q
    public final void P(u4.f fVar) {
        if (this.f16660b1) {
            ByteBuffer byteBuffer = fVar.f21385h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        g5.k kVar = this.K;
                        kVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        kVar.c(bundle);
                    }
                }
            }
        }
    }

    @Override // g5.q
    public final boolean U(m4.q qVar) throws v4.m {
        l lVar = this.f16661c1;
        if (lVar == null) {
            return true;
        }
        try {
            lVar.b(qVar);
            throw null;
        } catch (a0 e10) {
            throw f(e10, qVar, false, 7000);
        }
    }

    @Override // g5.q
    public final void V(Exception exc) {
        p4.c.o("MediaCodecVideoRenderer", "Video codec error", exc);
        y yVar = this.U0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            handler.post(new w(yVar, exc, 1));
        }
    }

    @Override // g5.q
    public final void W(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        y yVar = this.U0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            str2 = str;
            handler.post(new w(yVar, str2, j10, j11));
        } else {
            str2 = str;
        }
        this.f16659a1 = u0(str2);
        g5.n nVar = this.R;
        nVar.getClass();
        boolean z10 = false;
        if (c0.f16548a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f7386b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f7388d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.f16660b1 = z10;
        B0();
    }

    @Override // g5.q
    public final void X(String str) {
        y yVar = this.U0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            handler.post(new w(yVar, str, 2));
        }
    }

    @Override // g5.q
    public final v4.g Y(v2.e eVar) throws v4.m {
        v4.g gVarY = super.Y(eVar);
        m4.q qVar = (m4.q) eVar.f22365c;
        qVar.getClass();
        y yVar = this.U0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            handler.post(new w(yVar, qVar, gVarY));
        }
        return gVarY;
    }

    @Override // g5.q
    public final void Z(m4.q qVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        g5.k kVar = this.K;
        if (kVar != null) {
            kVar.o0(this.f16668j1);
        }
        if (this.f16680v1) {
            i10 = qVar.f14551u;
            integer = qVar.f14552v;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = qVar.f14555y;
        int i11 = qVar.f14554x;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f16677s1 = new u1(f10, i10, integer);
        l lVar = this.f16661c1;
        if (lVar == null || !this.B1) {
            float f11 = qVar.f14553w;
            u uVar = this.X0.f16718b;
            uVar.f16740f = f11;
            e eVar = uVar.f16735a;
            eVar.f16652a.c();
            eVar.f16653b.c();
            eVar.f16654c = false;
            eVar.f16655d = -9223372036854775807L;
            eVar.f16656e = 0;
            uVar.c();
            this.B1 = false;
            return;
        }
        m4.p pVarA = qVar.a();
        pVarA.f14495t = i10;
        pVarA.f14496u = integer;
        pVarA.f14499x = f10;
        m4.q qVar2 = new m4.q(pVarA);
        Iterable iterable = this.f16663e1;
        if (iterable == null) {
            g0 g0Var = i0.f25998b;
            iterable = a1.f25946e;
        }
        p4.c.i(false);
        p pVar = lVar.f16700f;
        pVar.f16705c.getClass();
        f0 f0Var = new f0(4);
        f0Var.c(iterable);
        f0Var.c(pVar.f16707e);
        lVar.f16695a = f0Var.f();
        lVar.f16696b = qVar2;
        m4.p pVarA2 = qVar2.a();
        m4.h hVar = qVar2.B;
        if (hVar == null || !hVar.d()) {
            hVar = m4.h.f14224h;
        }
        pVarA2.A = hVar;
        pVarA2.a();
        p4.c.j(null);
        throw null;
    }

    @Override // g5.q
    public final void b0(long j10) {
        super.b0(j10);
        if (this.f16680v1) {
            return;
        }
        this.f16673o1--;
    }

    @Override // g5.q
    public final void c0() {
        l lVar = this.f16661c1;
        if (lVar != null) {
            lVar.j();
            this.f16661c1.g(this.O0.f7402b, -this.f16684z1, this.f22461l);
        } else {
            this.X0.d(2);
        }
        this.B1 = true;
        B0();
    }

    @Override // v4.e, v4.w0
    public final void d(int i10, Object obj) throws v4.m {
        if (i10 == 1) {
            D0(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            q qVar = (q) obj;
            this.f16683y1 = qVar;
            l lVar = this.f16661c1;
            if (lVar != null) {
                lVar.i(qVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f16681w1 != iIntValue) {
                this.f16681w1 = iIntValue;
                if (this.f16680v1) {
                    h0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f16668j1 = iIntValue2;
            g5.k kVar = this.K;
            if (kVar != null) {
                kVar.o0(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f16669k1 = iIntValue3;
            l lVar2 = this.f16661c1;
            if (lVar2 != null) {
                lVar2.d(iIntValue3);
                return;
            }
            u uVar = this.X0.f16718b;
            if (uVar.f16744j == iIntValue3) {
                return;
            }
            uVar.f16744j = iIntValue3;
            uVar.d(true);
            return;
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f16663e1 = list;
            l lVar3 = this.f16661c1;
            if (lVar3 != null) {
                lVar3.h(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            p4.u uVar2 = (p4.u) obj;
            if (uVar2.f16622a == 0 || uVar2.f16623b == 0) {
                return;
            }
            this.f16666h1 = uVar2;
            l lVar4 = this.f16661c1;
            if (lVar4 != null) {
                Surface surface = this.f16664f1;
                p4.c.j(surface);
                lVar4.e(surface, uVar2);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.f16679u1 = ((Integer) obj).intValue();
            g5.k kVar2 = this.K;
            if (kVar2 != null && c0.f16548a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f16679u1));
                kVar2.c(bundle);
                return;
            }
            return;
        }
        if (i10 == 17) {
            Surface surface2 = this.f16664f1;
            D0(null);
            obj.getClass();
            ((i) obj).d(1, surface2);
            return;
        }
        if (i10 == 11) {
            v4.w wVar = (v4.w) obj;
            wVar.getClass();
            this.F = wVar;
        }
    }

    @Override // g5.q
    public final void d0(u4.f fVar) {
        Surface surface;
        boolean z10 = this.f16680v1;
        if (!z10) {
            this.f16673o1++;
        }
        if (c0.f16548a >= 23 || !z10) {
            return;
        }
        long j10 = fVar.f21384g;
        t0(j10);
        u1 u1Var = this.f16677s1;
        boolean zEquals = u1Var.equals(u1.f14594d);
        y yVar = this.U0;
        if (!zEquals && !u1Var.equals(this.f16678t1)) {
            this.f16678t1 = u1Var;
            yVar.c(u1Var);
        }
        this.N0.f22474e++;
        r rVar = this.X0;
        boolean z11 = rVar.f16720d != 3;
        rVar.f16720d = 3;
        rVar.f16727k.getClass();
        rVar.f16722f = c0.N(SystemClock.elapsedRealtime());
        if (z11 && (surface = this.f16664f1) != null) {
            Handler handler = yVar.f16767b;
            if (handler != null) {
                handler.post(new x(yVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f16667i1 = true;
        }
        b0(j10);
    }

    @Override // g5.q
    public final boolean f0(long j10, long j11, g5.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, m4.q qVar) {
        kVar.getClass();
        g5.p pVar = this.O0;
        long j13 = j12 - pVar.f7403c;
        l lVar = this.f16661c1;
        if (lVar != null) {
            long j14 = j12 + (-this.f16684z1);
            p4.c.i(false);
            int i13 = lVar.f16700f.f16716n;
            if (i13 == -1 || i13 != 0) {
                return false;
            }
            if (j14 - lVar.f16697c >= lVar.f16698d || z11) {
                p4.c.j(null);
                throw null;
            }
            F0(kVar, i10);
            return true;
        }
        int iA = this.X0.a(j12, j10, j11, pVar.f7402b, z11, this.Y0);
        if (iA != 4) {
            if (z10 && !z11) {
                F0(kVar, i10);
                return true;
            }
            Surface surface = this.f16664f1;
            mh.f fVar = this.Y0;
            if (surface == null) {
                long j15 = fVar.f15178a;
                if (j15 < 0 || (j15 < 30000 && iA != 5)) {
                    F0(kVar, i10);
                    H0(fVar.f15178a);
                    return true;
                }
            } else {
                if (iA == 0) {
                    this.f22456g.getClass();
                    long jNanoTime = System.nanoTime();
                    q qVar2 = this.f16683y1;
                    if (qVar2 != null) {
                        qVar2.c(j13, jNanoTime, qVar, this.M);
                    }
                    C0(kVar, i10, jNanoTime);
                    H0(fVar.f15178a);
                    return true;
                }
                if (iA == 1) {
                    long j16 = fVar.f15179b;
                    long j17 = fVar.f15178a;
                    if (j16 == this.f16676r1) {
                        F0(kVar, i10);
                    } else {
                        q qVar3 = this.f16683y1;
                        if (qVar3 != null) {
                            qVar3.c(j13, j16, qVar, this.M);
                        }
                        C0(kVar, i10, j16);
                    }
                    H0(j17);
                    this.f16676r1 = j16;
                    return true;
                }
                if (iA == 2) {
                    Trace.beginSection("dropVideoBuffer");
                    kVar.i(i10);
                    Trace.endSection();
                    G0(0, 1);
                    H0(fVar.f15178a);
                    return true;
                }
                if (iA == 3) {
                    F0(kVar, i10);
                    H0(fVar.f15178a);
                    return true;
                }
                if (iA != 5) {
                    throw new IllegalStateException(String.valueOf(iA));
                }
            }
        }
        return false;
    }

    @Override // v4.e
    public final void g() {
        l lVar = this.f16661c1;
        if (lVar != null) {
            r rVar = lVar.f16700f.f16708f.f16635a;
            if (rVar.f16720d == 0) {
                rVar.f16720d = 1;
                return;
            }
            return;
        }
        r rVar2 = this.X0;
        if (rVar2.f16720d == 0) {
            rVar2.f16720d = 1;
        }
    }

    @Override // v4.e
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // g5.q
    public final void i0() {
        l lVar = this.f16661c1;
        if (lVar != null) {
            lVar.j();
        }
    }

    @Override // g5.q
    public final void j0() {
        super.j0();
        this.f16673o1 = 0;
    }

    @Override // v4.e
    public final boolean k() {
        return this.J0 && this.f16661c1 == null;
    }

    @Override // g5.q, v4.e
    public final boolean l() {
        boolean zL = super.l();
        l lVar = this.f16661c1;
        if (lVar != null) {
            return lVar.f16700f.f16708f.f16635a.b(false);
        }
        if (zL && (this.K == null || this.f16664f1 == null || this.f16680v1)) {
            return true;
        }
        return this.X0.b(zL);
    }

    @Override // g5.q, v4.e
    public final void m() {
        y yVar = this.U0;
        this.f16678t1 = null;
        this.A1 = -9223372036854775807L;
        l lVar = this.f16661c1;
        if (lVar != null) {
            lVar.f16700f.f16708f.f16635a.d(0);
        } else {
            this.X0.d(0);
        }
        B0();
        this.f16667i1 = false;
        this.f16682x1 = null;
        try {
            super.m();
            v4.f fVar = this.N0;
            yVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = yVar.f16767b;
            if (handler != null) {
                handler.post(new b5.h(23, yVar, fVar));
            }
            yVar.c(u1.f14594d);
        } catch (Throwable th2) {
            yVar.a(this.N0);
            yVar.c(u1.f14594d);
            throw th2;
        }
    }

    @Override // v4.e
    public final void n(boolean z10, boolean z11) {
        this.N0 = new v4.f();
        z0 z0Var = this.f22453d;
        z0Var.getClass();
        boolean z12 = z0Var.f22733b;
        p4.c.i((z12 && this.f16681w1 == 0) ? false : true);
        if (this.f16680v1 != z12) {
            this.f16680v1 = z12;
            h0();
        }
        v4.f fVar = this.N0;
        y yVar = this.U0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            handler.post(new w(yVar, fVar, 5));
        }
        boolean z13 = this.f16662d1;
        r rVar = this.X0;
        if (!z13) {
            if (this.f16663e1 != null && this.f16661c1 == null) {
                c0.s sVar = new c0.s(this.S0, rVar);
                p4.v vVar = this.f22456g;
                vVar.getClass();
                sVar.f3162h = vVar;
                p4.c.i(!sVar.f3155a);
                if (((o) sVar.f3159e) == null) {
                    if (((n) sVar.f3158d) == null) {
                        sVar.f3158d = new n();
                    }
                    sVar.f3159e = new o((n) sVar.f3158d);
                }
                p pVar = new p(sVar);
                sVar.f3155a = true;
                pVar.f16716n = 1;
                SparseArray sparseArray = pVar.f16706d;
                p4.c.i(!c0.k(sparseArray, 0));
                l lVar = new l(pVar, pVar.f16703a);
                pVar.f16710h.add(lVar);
                sparseArray.put(0, lVar);
                this.f16661c1 = lVar;
            }
            this.f16662d1 = true;
        }
        l lVar2 = this.f16661c1;
        if (lVar2 == null) {
            p4.v vVar2 = this.f22456g;
            vVar2.getClass();
            rVar.f16727k = vVar2;
            rVar.f16720d = z11 ? 1 : 0;
            return;
        }
        q qVar = this.f16683y1;
        if (qVar != null) {
            lVar2.i(qVar);
        }
        if (this.f16664f1 != null && !this.f16666h1.equals(p4.u.f16621c)) {
            this.f16661c1.e(this.f16664f1, this.f16666h1);
        }
        this.f16661c1.d(this.f16669k1);
        this.f16661c1.f(this.I);
        List list = this.f16663e1;
        if (list != null) {
            this.f16661c1.h(list);
        }
        l lVar3 = this.f16661c1;
        lVar3.f16700f.f16708f.f16635a.f16720d = z11 ? 1 : 0;
        if (this.F != null) {
            lVar3.getClass();
        }
    }

    @Override // g5.q
    public final boolean n0(g5.n nVar) {
        return z0(nVar);
    }

    @Override // g5.q, v4.e
    public final void o(long j10, boolean z10) throws v4.m {
        l lVar = this.f16661c1;
        if (lVar != null) {
            if (!z10) {
                lVar.a(true);
            }
            this.f16661c1.g(this.O0.f7402b, -this.f16684z1, this.f22461l);
            this.B1 = true;
        }
        super.o(j10, z10);
        l lVar2 = this.f16661c1;
        r rVar = this.X0;
        if (lVar2 == null) {
            u uVar = rVar.f16718b;
            uVar.f16747m = 0L;
            uVar.f16750p = -1L;
            uVar.f16748n = -1L;
            rVar.f16723g = -9223372036854775807L;
            rVar.f16721e = -9223372036854775807L;
            rVar.d(1);
            rVar.f16724h = -9223372036854775807L;
        }
        if (z10) {
            l lVar3 = this.f16661c1;
            if (lVar3 != null) {
                lVar3.c(false);
            } else {
                rVar.c(false);
            }
        }
        B0();
        this.f16672n1 = 0;
    }

    @Override // g5.q
    public final boolean o0(u4.f fVar) {
        if (fVar.d(67108864) && !j() && !fVar.d(536870912)) {
            long j10 = this.A1;
            if (j10 != -9223372036854775807L && j10 - (fVar.f21384g - this.O0.f7403c) > 100000 && !fVar.d(1073741824) && fVar.f21384g < this.f22461l) {
                return true;
            }
        }
        return false;
    }

    @Override // v4.e
    public final void p() {
        l lVar = this.f16661c1;
        if (lVar == null || !this.T0) {
            return;
        }
        p pVar = lVar.f16700f;
        if (pVar.f16713k == 2) {
            return;
        }
        p4.x xVar = pVar.f16711i;
        if (xVar != null) {
            xVar.f16627a.removeCallbacksAndMessages(null);
        }
        pVar.f16712j = null;
        pVar.f16713k = 2;
    }

    @Override // v4.e
    public final void q() {
        try {
            try {
                D();
                h0();
                b5.l lVar = this.E;
                if (lVar != null) {
                    lVar.c(null);
                }
                this.E = null;
            } catch (Throwable th2) {
                b5.l lVar2 = this.E;
                if (lVar2 != null) {
                    lVar2.c(null);
                }
                this.E = null;
                throw th2;
            }
        } finally {
            this.f16662d1 = false;
            this.f16684z1 = -9223372036854775807L;
            k kVar = this.f16665g1;
            if (kVar != null) {
                kVar.release();
                this.f16665g1 = null;
            }
        }
    }

    @Override // g5.q
    public final int q0(g5.r rVar, m4.q qVar) {
        boolean z10;
        int i10 = 0;
        if (!o0.o(qVar.f14544n)) {
            return t0.g(0, 0, 0, 0);
        }
        boolean z11 = qVar.f14548r != null;
        Context context = this.S0;
        List listW0 = w0(context, rVar, qVar, z11, false);
        if (z11 && listW0.isEmpty()) {
            listW0 = w0(context, rVar, qVar, false, false);
        }
        if (listW0.isEmpty()) {
            return t0.g(1, 0, 0, 0);
        }
        int i11 = qVar.M;
        if (i11 != 0 && i11 != 2) {
            return t0.g(2, 0, 0, 0);
        }
        g5.n nVar = (g5.n) listW0.get(0);
        boolean zD = nVar.d(qVar);
        if (zD) {
            z10 = true;
        } else {
            for (int i12 = 1; i12 < listW0.size(); i12++) {
                g5.n nVar2 = (g5.n) listW0.get(i12);
                if (nVar2.d(qVar)) {
                    nVar = nVar2;
                    z10 = false;
                    zD = true;
                    break;
                }
            }
            z10 = true;
        }
        int i13 = zD ? 4 : 3;
        int i14 = nVar.e(qVar) ? 16 : 8;
        int i15 = nVar.f7391g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (c0.f16548a >= 26 && "video/dolby-vision".equals(qVar.f14544n) && !b0.i(context)) {
            i16 = 256;
        }
        if (zD) {
            List listW02 = w0(context, rVar, qVar, z11, true);
            if (!listW02.isEmpty()) {
                HashMap map = g5.y.f7430a;
                ArrayList arrayList = new ArrayList(listW02);
                Collections.sort(arrayList, new g5.s(i10, new androidx.media3.exoplayer.offline.g(12, qVar)));
                g5.n nVar3 = (g5.n) arrayList.get(0);
                if (nVar3.d(qVar) && nVar3.e(qVar)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    @Override // v4.e
    public final void r() {
        this.f16671m1 = 0;
        this.f22456g.getClass();
        this.f16670l1 = SystemClock.elapsedRealtime();
        this.f16674p1 = 0L;
        this.f16675q1 = 0;
        l lVar = this.f16661c1;
        if (lVar != null) {
            lVar.f16700f.f16708f.f16635a.e();
        } else {
            this.X0.e();
        }
    }

    @Override // v4.e
    public final void s() {
        A0();
        int i10 = this.f16675q1;
        if (i10 != 0) {
            long j10 = this.f16674p1;
            y yVar = this.U0;
            Handler handler = yVar.f16767b;
            if (handler != null) {
                handler.post(new w(yVar, j10, i10));
            }
            this.f16674p1 = 0L;
            this.f16675q1 = 0;
        }
        l lVar = this.f16661c1;
        if (lVar != null) {
            lVar.f16700f.f16708f.f16635a.f();
        } else {
            this.X0.f();
        }
    }

    @Override // g5.q, v4.e
    public final void t(m4.q[] qVarArr, long j10, long j11, d0 d0Var) {
        super.t(qVarArr, j10, j11, d0Var);
        if (this.f16684z1 == -9223372036854775807L) {
            this.f16684z1 = j10;
        }
        i1 i1Var = this.f22465p;
        if (i1Var.p()) {
            this.A1 = -9223372036854775807L;
        } else {
            d0Var.getClass();
            this.A1 = i1Var.g(d0Var.f10245a, new f1()).f14204d;
        }
    }

    @Override // g5.q, v4.e
    public final void v(long j10, long j11) throws v4.m {
        l lVar = this.f16661c1;
        if (lVar != null) {
            try {
                c cVar = lVar.f16700f.f16708f;
                cVar.getClass();
                try {
                    cVar.f16637c.a(j10, j11);
                } catch (v4.m e10) {
                    throw new a0(e10, cVar.f16639e);
                }
            } catch (a0 e11) {
                throw f(e11, e11.f16632a, false, 7001);
            }
        }
        super.v(j10, j11);
    }

    @Override // g5.q, v4.e
    public final void x(float f10, float f11) throws v4.m {
        super.x(f10, f11);
        l lVar = this.f16661c1;
        if (lVar != null) {
            lVar.f(f10);
        } else {
            this.X0.g(f10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface y0(g5.n r6) {
        /*
            r5 = this;
            p5.l r0 = r5.f16661c1
            r1 = 0
            r2 = 0
            if (r0 != 0) goto La9
            android.view.Surface r0 = r5.f16664f1
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r0 = p4.c0.f16548a
            r3 = 35
            if (r0 < r3) goto L16
            boolean r0 = r6.f7394j
            if (r0 == 0) goto L16
            return r2
        L16:
            boolean r0 = r5.E0(r6)
            p4.c.i(r0)
            p5.k r0 = r5.f16665g1
            if (r0 == 0) goto L2e
            boolean r3 = r0.f16692a
            boolean r4 = r6.f7390f
            if (r3 == r4) goto L2e
            if (r0 == 0) goto L2e
            r0.release()
            r5.f16665g1 = r2
        L2e:
            p5.k r0 = r5.f16665g1
            if (r0 != 0) goto La6
            android.content.Context r0 = r5.S0
            boolean r6 = r6.f7390f
            r2 = 1
            if (r6 == 0) goto L42
            boolean r0 = p5.k.a(r0)
            if (r0 == 0) goto L40
            goto L44
        L40:
            r0 = 0
            goto L45
        L42:
            int r0 = p5.k.f16690d
        L44:
            r0 = 1
        L45:
            p4.c.i(r0)
            p5.j r0 = new p5.j
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3)
            if (r6 == 0) goto L54
            int r6 = p5.k.f16690d
            goto L55
        L54:
            r6 = 0
        L55:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.f16686b = r3
            p4.i r4 = new p4.i
            r4.<init>(r3)
            r0.f16685a = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.f16686b     // Catch: java.lang.Throwable -> L84
            android.os.Message r6 = r3.obtainMessage(r2, r6, r1)     // Catch: java.lang.Throwable -> L84
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L84
        L74:
            p5.k r6 = r0.f16689e     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L88
            java.lang.RuntimeException r6 = r0.f16688d     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L88
            java.lang.Error r6 = r0.f16687c     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L88
            r0.wait()     // Catch: java.lang.Throwable -> L84 java.lang.InterruptedException -> L86
            goto L74
        L84:
            r6 = move-exception
            goto La4
        L86:
            r1 = 1
            goto L74
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L92
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L92:
            java.lang.RuntimeException r6 = r0.f16688d
            if (r6 != 0) goto La3
            java.lang.Error r6 = r0.f16687c
            if (r6 != 0) goto La2
            p5.k r6 = r0.f16689e
            r6.getClass()
            r5.f16665g1 = r6
            goto La6
        La2:
            throw r6
        La3:
            throw r6
        La4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r6
        La6:
            p5.k r6 = r5.f16665g1
            return r6
        La9:
            p4.c.i(r1)
            p4.c.j(r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.i.y0(g5.n):android.view.Surface");
    }

    public final boolean z0(g5.n nVar) {
        if (this.f16661c1 != null) {
            return true;
        }
        Surface surface = this.f16664f1;
        if (surface == null || !surface.isValid()) {
            return (c0.f16548a >= 35 && nVar.f7394j) || E0(nVar);
        }
        return true;
    }
}
