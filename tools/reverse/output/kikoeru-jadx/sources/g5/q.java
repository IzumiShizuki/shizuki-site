package g5;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import b7.b1;
import j5.c1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q extends v4.e {
    public static final byte[] R0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final x4.y A;
    public int A0;
    public m4.q B;
    public int B0;
    public m4.q C;
    public int C0;
    public b5.l D;
    public boolean D0;
    public b5.l E;
    public boolean E0;
    public v4.w F;
    public boolean F0;
    public MediaCrypto G;
    public long G0;
    public final long H;
    public long H0;
    public float I;
    public boolean I0;
    public float J;
    public boolean J0;
    public k K;
    public boolean K0;
    public m4.q L;
    public boolean L0;
    public MediaFormat M;
    public v4.m M0;
    public boolean N;
    public v4.f N0;
    public float O;
    public p O0;
    public ArrayDeque P;
    public long P0;
    public o Q;
    public boolean Q0;
    public n R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public long Z;
    public long q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f7405r;
    public int r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r f7406s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f7407s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f7408t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ByteBuffer f7409t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u4.f f7410u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f7411u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u4.f f7412v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f7413v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u4.f f7414w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f7415w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f7416x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f7417x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final MediaCodec.BufferInfo f7418y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f7419y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayDeque f7420z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f7421z0;

    public q(int i10, j jVar, r rVar, float f10) {
        super(i10);
        this.f7405r = jVar;
        this.f7406s = rVar;
        this.f7408t = f10;
        this.f7410u = new u4.f(0);
        this.f7412v = new u4.f(0);
        this.f7414w = new u4.f(2);
        g gVar = new g(2);
        gVar.f7380l = 32;
        this.f7416x = gVar;
        this.f7418y = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.f7420z = new ArrayDeque();
        this.O0 = p.f7400e;
        gVar.j(0);
        gVar.f21382e.order(ByteOrder.nativeOrder());
        x4.y yVar = new x4.y();
        yVar.f24736a = n4.f.f15271a;
        yVar.f24738c = 0;
        yVar.f24737b = 2;
        this.A = yVar;
        this.O = -1.0f;
        this.S = 0;
        this.A0 = 0;
        this.r0 = -1;
        this.f7407s0 = -1;
        this.q0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.Z = -9223372036854775807L;
        this.B0 = 0;
        this.C0 = 0;
        this.N0 = new v4.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0309  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(long r25, long r27) throws v4.m {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.q.A(long, long):boolean");
    }

    public abstract v4.g B(n nVar, m4.q qVar, m4.q qVar2);

    public m C(IllegalStateException illegalStateException, n nVar) {
        return new m(illegalStateException, nVar);
    }

    public final void D() {
        this.f7419y0 = false;
        this.f7416x.h();
        this.f7414w.h();
        this.f7417x0 = false;
        this.f7415w0 = false;
        x4.y yVar = this.A;
        yVar.getClass();
        yVar.f24736a = n4.f.f15271a;
        yVar.f24738c = 0;
        yVar.f24737b = 2;
    }

    public final boolean E() throws v4.m {
        if (!this.D0) {
            s0();
            return true;
        }
        this.B0 = 1;
        if (this.U) {
            this.C0 = 3;
            return false;
        }
        this.C0 = 2;
        return true;
    }

    public final boolean F(long j10, long j11) throws v4.m {
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        boolean z11;
        boolean zF0;
        int iW;
        k kVar = this.K;
        kVar.getClass();
        int i10 = this.f7407s0;
        MediaCodec.BufferInfo bufferInfo2 = this.f7418y;
        if (i10 < 0) {
            if (this.V && this.E0) {
                try {
                    iW = kVar.W(bufferInfo2);
                } catch (IllegalStateException unused) {
                    e0();
                    if (this.J0) {
                        h0();
                    }
                }
            } else {
                iW = kVar.W(bufferInfo2);
            }
            if (iW < 0) {
                if (iW == -2) {
                    this.F0 = true;
                    k kVar2 = this.K;
                    kVar2.getClass();
                    MediaFormat mediaFormatX = kVar2.x();
                    if (this.S != 0 && mediaFormatX.getInteger("width") == 32 && mediaFormatX.getInteger("height") == 32) {
                        this.X = true;
                        return true;
                    }
                    this.M = mediaFormatX;
                    this.N = true;
                    return true;
                }
                if (this.Y && (this.I0 || this.B0 == 2)) {
                    e0();
                }
                long j12 = this.Z;
                if (j12 != -9223372036854775807L) {
                    long j13 = j12 + 100;
                    this.f22456g.getClass();
                    if (j13 < System.currentTimeMillis()) {
                        e0();
                        return false;
                    }
                }
                return false;
            }
            if (this.X) {
                this.X = false;
                kVar.i(iW);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                e0();
                return false;
            }
            this.f7407s0 = iW;
            ByteBuffer byteBufferE0 = kVar.E0(iW);
            this.f7409t0 = byteBufferE0;
            if (byteBufferE0 != null) {
                byteBufferE0.position(bufferInfo2.offset);
                this.f7409t0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j14 = bufferInfo2.presentationTimeUs;
            this.f7411u0 = j14 < this.f22461l;
            long j15 = this.H0;
            this.f7413v0 = j15 != -9223372036854775807L && j15 <= j14;
            t0(j14);
        }
        if (this.V && this.E0) {
            try {
                ByteBuffer byteBuffer = this.f7409t0;
                int i11 = this.f7407s0;
                int i12 = bufferInfo2.flags;
                long j16 = bufferInfo2.presentationTimeUs;
                boolean z12 = this.f7411u0;
                boolean z13 = this.f7413v0;
                m4.q qVar = this.C;
                qVar.getClass();
                bufferInfo = bufferInfo2;
                z10 = false;
                z11 = true;
                try {
                    zF0 = f0(j10, j11, kVar, byteBuffer, i11, i12, 1, j16, z12, z13, qVar);
                } catch (IllegalStateException unused2) {
                    e0();
                    if (!this.J0) {
                        return z10;
                    }
                    h0();
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            bufferInfo = bufferInfo2;
            z10 = false;
            z11 = true;
            ByteBuffer byteBuffer2 = this.f7409t0;
            int i13 = this.f7407s0;
            int i14 = bufferInfo.flags;
            long j17 = bufferInfo.presentationTimeUs;
            boolean z14 = this.f7411u0;
            boolean z15 = this.f7413v0;
            m4.q qVar2 = this.C;
            qVar2.getClass();
            zF0 = f0(j10, j11, kVar, byteBuffer2, i13, i14, 1, j17, z14, z15, qVar2);
        }
        if (!zF0) {
            return z10;
        }
        b0(bufferInfo.presentationTimeUs);
        boolean z16 = (bufferInfo.flags & 4) != 0;
        if (!z16 && this.E0 && this.f7413v0) {
            this.f22456g.getClass();
            this.Z = System.currentTimeMillis();
        }
        this.f7407s0 = -1;
        this.f7409t0 = null;
        if (!z16) {
            return z11;
        }
        e0();
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G() throws v4.m {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.q.G():boolean");
    }

    public final void H() {
        try {
            k kVar = this.K;
            p4.c.j(kVar);
            kVar.flush();
        } finally {
            j0();
        }
    }

    public final boolean I() {
        if (this.K == null) {
            return false;
        }
        int i10 = this.C0;
        if (i10 == 3 || ((this.T && !this.F0) || (this.U && this.E0))) {
            h0();
            return true;
        }
        if (i10 == 2) {
            int i11 = c0.f16548a;
            p4.c.i(i11 >= 23);
            if (i11 >= 23) {
                try {
                    s0();
                } catch (v4.m e10) {
                    p4.c.C("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    h0();
                    return true;
                }
            }
        }
        H();
        return false;
    }

    public final List J(boolean z10) {
        m4.q qVar = this.B;
        qVar.getClass();
        r rVar = this.f7406s;
        ArrayList arrayListN = N(rVar, qVar, z10);
        if (!arrayListN.isEmpty() || !z10) {
            return arrayListN;
        }
        ArrayList arrayListN2 = N(rVar, qVar, false);
        if (!arrayListN2.isEmpty()) {
            p4.c.B("MediaCodecRenderer", "Drm session requires secure decoder for " + qVar.f14544n + ", but no secure decoder available. Trying to proceed with " + arrayListN2 + ".");
        }
        return arrayListN2;
    }

    public int K(u4.f fVar) {
        return 0;
    }

    public boolean L() {
        return false;
    }

    public abstract float M(float f10, m4.q[] qVarArr);

    public abstract ArrayList N(r rVar, m4.q qVar, boolean z10);

    public abstract b1 O(n nVar, m4.q qVar, MediaCrypto mediaCrypto, float f10);

    public abstract void P(u4.f fVar);

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(g5.n r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.q.Q(g5.n, android.media.MediaCrypto):void");
    }

    public final boolean R(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        m4.q qVar = this.C;
        return qVar == null || !Objects.equals(qVar.f14544n, "audio/opus") || j10 - j11 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() throws v4.m {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.q.S():void");
    }

    public final void T(MediaCrypto mediaCrypto, boolean z10) throws o {
        m4.q qVar = this.B;
        qVar.getClass();
        if (this.P == null) {
            try {
                List listJ = J(z10);
                this.P = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listJ;
                if (!arrayList.isEmpty()) {
                    this.P.add((n) arrayList.get(0));
                }
                this.Q = null;
            } catch (u e10) {
                throw new o(qVar, e10, z10, -49998);
            }
        }
        if (this.P.isEmpty()) {
            throw new o(qVar, null, z10, -49999);
        }
        ArrayDeque arrayDeque = this.P;
        arrayDeque.getClass();
        while (this.K == null) {
            n nVar = (n) arrayDeque.peekFirst();
            nVar.getClass();
            if (!U(qVar) || !n0(nVar)) {
                return;
            }
            try {
                Q(nVar, mediaCrypto);
            } catch (Exception e11) {
                p4.c.C("MediaCodecRenderer", "Failed to initialize decoder: " + nVar, e11);
                arrayDeque.removeFirst();
                o oVar = new o("Decoder init failed: " + nVar.f7385a + ", " + qVar, e11, qVar.f14544n, z10, nVar, e11 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e11).getDiagnosticInfo() : null);
                V(oVar);
                o oVar2 = this.Q;
                if (oVar2 == null) {
                    this.Q = oVar;
                } else {
                    this.Q = new o(oVar2.getMessage(), oVar2.getCause(), oVar2.f7396a, oVar2.f7397b, oVar2.f7398c, oVar2.f7399d);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.Q;
                }
            }
        }
        this.P = null;
    }

    public boolean U(m4.q qVar) {
        return true;
    }

    public abstract void V(Exception exc);

    public abstract void W(long j10, long j11, String str);

    public abstract void X(String str);

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e3, code lost:
    
        if (r4.f(r2) != false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v4.g Y(v2.e r14) throws v4.m {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.q.Y(v2.e):v4.g");
    }

    public abstract void Z(m4.q qVar, MediaFormat mediaFormat);

    public void b0(long j10) {
        this.P0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.f7420z;
            if (arrayDeque.isEmpty() || j10 < ((p) arrayDeque.peek()).f7401a) {
                return;
            }
            p pVar = (p) arrayDeque.poll();
            pVar.getClass();
            m0(pVar);
            c0();
        }
    }

    public abstract void c0();

    public final void e0() throws v4.m {
        int i10 = this.C0;
        if (i10 == 1) {
            H();
            return;
        }
        if (i10 == 2) {
            H();
            s0();
        } else if (i10 != 3) {
            this.J0 = true;
            i0();
        } else {
            h0();
            S();
        }
    }

    public abstract boolean f0(long j10, long j11, k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, m4.q qVar);

    public final boolean g0(int i10) throws v4.m {
        v2.e eVar = this.f22452c;
        eVar.n();
        u4.f fVar = this.f7410u;
        fVar.h();
        int iU = u(eVar, fVar, i10 | 4);
        if (iU == -5) {
            Y(eVar);
            return true;
        }
        if (iU != -4 || !fVar.d(4)) {
            return false;
        }
        this.I0 = true;
        e0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0() {
        try {
            k kVar = this.K;
            if (kVar != null) {
                kVar.a();
                this.N0.f22471b++;
                n nVar = this.R;
                nVar.getClass();
                X(nVar.f7385a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.G;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.G;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public abstract void i0();

    public void j0() {
        this.r0 = -1;
        this.f7412v.f21382e = null;
        this.f7407s0 = -1;
        this.f7409t0 = null;
        this.q0 = -9223372036854775807L;
        this.E0 = false;
        this.Z = -9223372036854775807L;
        this.D0 = false;
        this.W = false;
        this.X = false;
        this.f7411u0 = false;
        this.f7413v0 = false;
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
        this.P0 = -9223372036854775807L;
        this.B0 = 0;
        this.C0 = 0;
        this.A0 = this.f7421z0 ? 1 : 0;
    }

    public final void k0() {
        j0();
        this.M0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.F0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.Y = false;
        this.f7421z0 = false;
        this.A0 = 0;
    }

    @Override // v4.e
    public boolean l() {
        boolean zA;
        if (this.B != null) {
            if (j()) {
                zA = this.f22463n;
            } else {
                c1 c1Var = this.f22458i;
                c1Var.getClass();
                zA = c1Var.a();
            }
            if (!zA) {
                if (!(this.f7407s0 >= 0)) {
                    if (this.q0 != -9223372036854775807L) {
                        this.f22456g.getClass();
                        if (SystemClock.elapsedRealtime() < this.q0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void l0(b5.l lVar) {
        b5.l lVar2 = this.D;
        if (lVar2 != lVar) {
            if (lVar != null) {
                lVar.b(null);
            }
            if (lVar2 != null) {
                lVar2.c(null);
            }
        }
        this.D = lVar;
    }

    @Override // v4.e
    public void m() {
        this.B = null;
        m0(p.f7400e);
        this.f7420z.clear();
        I();
    }

    public final void m0(p pVar) {
        this.O0 = pVar;
        if (pVar.f7403c != -9223372036854775807L) {
            this.Q0 = true;
            a0();
        }
    }

    public boolean n0(n nVar) {
        return true;
    }

    @Override // v4.e
    public void o(long j10, boolean z10) throws v4.m {
        this.I0 = false;
        this.J0 = false;
        this.L0 = false;
        if (this.f7415w0) {
            this.f7416x.h();
            this.f7414w.h();
            this.f7417x0 = false;
            x4.y yVar = this.A;
            yVar.getClass();
            yVar.f24736a = n4.f.f15271a;
            yVar.f24738c = 0;
            yVar.f24737b = 2;
        } else if (I()) {
            S();
        }
        if (this.O0.f7404d.D() > 0) {
            this.K0 = true;
        }
        this.O0.f7404d.c();
        this.f7420z.clear();
    }

    public boolean o0(u4.f fVar) {
        return false;
    }

    public boolean p0(m4.q qVar) {
        return false;
    }

    public abstract int q0(r rVar, m4.q qVar);

    public final boolean r0(m4.q qVar) throws v4.m {
        if (c0.f16548a >= 23 && this.K != null && this.C0 != 3 && this.f22457h != 0) {
            float f10 = this.J;
            qVar.getClass();
            m4.q[] qVarArr = this.f22459j;
            qVarArr.getClass();
            float fM = M(f10, qVarArr);
            float f11 = this.O;
            if (f11 != fM) {
                if (fM == -1.0f) {
                    if (this.D0) {
                        this.B0 = 1;
                        this.C0 = 3;
                        return false;
                    }
                    h0();
                    S();
                    return false;
                }
                if (f11 != -1.0f || fM > this.f7408t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fM);
                    k kVar = this.K;
                    kVar.getClass();
                    kVar.c(bundle);
                    this.O = fM;
                }
            }
        }
        return true;
    }

    public final void s0() throws v4.m {
        b5.l lVar = this.E;
        lVar.getClass();
        u4.a aVarH = lVar.h();
        if (aVarH instanceof b5.y) {
            try {
                MediaCrypto mediaCrypto = this.G;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((b5.y) aVarH).f1605b);
            } catch (MediaCryptoException e10) {
                throw f(e10, this.B, false, 6006);
            }
        }
        l0(this.E);
        this.B0 = 0;
        this.C0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // v4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(m4.q[] r13, long r14, long r16, j5.d0 r18) {
        /*
            r12 = this;
            g5.p r13 = r12.O0
            long r0 = r13.f7403c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            g5.p r4 = new g5.p
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.m0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f7420z
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.G0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.P0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 < 0) goto L52
        L36:
            g5.p r5 = new g5.p
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m0(r5)
            g5.p r13 = r12.O0
            long r0 = r13.f7403c
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.c0()
        L51:
            return
        L52:
            g5.p r5 = new g5.p
            long r6 = r12.G0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.q.t(m4.q[], long, long, j5.d0):void");
    }

    public final void t0(long j10) {
        m4.q qVar = (m4.q) this.O0.f7404d.y(j10);
        if (qVar == null && this.Q0 && this.M != null) {
            qVar = (m4.q) this.O0.f7404d.x();
        }
        if (qVar != null) {
            this.C = qVar;
        } else if (!this.N || this.C == null) {
            return;
        }
        m4.q qVar2 = this.C;
        qVar2.getClass();
        Z(qVar2, this.M);
        this.N = false;
        this.Q0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // v4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(long r12, long r14) throws v4.m {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.q.v(long, long):void");
    }

    @Override // v4.e
    public void x(float f10, float f11) throws v4.m {
        this.I = f10;
        this.J = f11;
        r0(this.L);
    }

    @Override // v4.e
    public final int y(m4.q qVar) throws v4.m {
        try {
            return q0(this.f7406s, qVar);
        } catch (u e10) {
            throw f(e10, qVar, false, 4002);
        }
    }

    @Override // v4.e
    public final int z() {
        return 8;
    }

    public void a0() {
    }

    public void d0(u4.f fVar) {
    }
}
