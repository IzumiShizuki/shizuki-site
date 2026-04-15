package j2;

import android.os.Build;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements i2.o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t1.b f10067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.v f10068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f10069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.n f10070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ic.a f10071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10073g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f10075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10076j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10080n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q1.h0 f10082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10084r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10086t;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f10074h = q1.a0.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f3.c f10077k = a.a.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f3.m f10078l = f3.m.f6667a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s1.b f10079m = new s1.b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10081o = q1.p0.f17566b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10085s = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a0.f0 f10087u = new a0.f0(23, this);

    public w1(t1.b bVar, q1.v vVar, v vVar2, ic.n nVar, ic.a aVar) {
        this.f10067a = bVar;
        this.f10068b = vVar;
        this.f10069c = vVar2;
        this.f10070d = nVar;
        this.f10071e = aVar;
        long j10 = Integer.MAX_VALUE;
        this.f10072f = (j10 & 4294967295L) | (j10 << 32);
    }

    @Override // i2.o1
    public final void a(float[] fArr) {
        q1.a0.e(fArr, m());
    }

    @Override // i2.o1
    public final void b(q1.o oVar, t1.b bVar) {
        j();
        this.f10086t = this.f10067a.f20139a.L() > 0.0f;
        s1.b bVar2 = this.f10079m;
        c7.e1 e1Var = bVar2.f19346b;
        e1Var.a0(oVar);
        e1Var.f3619c = bVar;
        u3.x0.k(bVar2, this.f10067a);
    }

    @Override // i2.o1
    public final boolean c(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        t1.b bVar = this.f10067a;
        if (bVar.f20161w) {
            return l0.B(bVar.d(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        return true;
    }

    @Override // i2.o1
    public final long d(long j10, boolean z10) {
        float[] fArrM;
        if (z10) {
            fArrM = l();
            if (fArrM == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrM = m();
        }
        return this.f10085s ? j10 : q1.a0.b(j10, fArrM);
    }

    @Override // i2.o1
    public final void destroy() {
        this.f10070d = null;
        this.f10071e = null;
        this.f10073g = true;
        boolean z10 = this.f10076j;
        v vVar = this.f10069c;
        if (z10) {
            this.f10076j = false;
            vVar.A(this, false);
        }
        q1.v vVar2 = this.f10068b;
        if (vVar2 != null) {
            vVar2.a(this.f10067a);
            vVar.I(this);
        }
    }

    @Override // i2.o1
    public final void e(long j10) {
        if (f3.l.b(j10, this.f10072f)) {
            return;
        }
        v vVar = this.f10069c;
        if (vVar.f10032f) {
            vVar.Q(-4.0f);
        }
        this.f10072f = j10;
        if (this.f10076j || this.f10073g) {
            return;
        }
        vVar.invalidate();
        if (true != this.f10076j) {
            this.f10076j = true;
            vVar.A(this, true);
        }
    }

    @Override // i2.o1
    public final void f(ic.n nVar, ic.a aVar) {
        q1.v vVar = this.f10068b;
        if (vVar == null) {
            throw h0.g("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f10067a.f20157s) {
            f2.a.a("layer should have been released before reuse");
        }
        this.f10067a = vVar.b();
        this.f10073g = false;
        this.f10070d = nVar;
        this.f10071e = aVar;
        this.f10083q = false;
        this.f10084r = false;
        this.f10085s = true;
        q1.a0.d(this.f10074h);
        float[] fArr = this.f10075i;
        if (fArr != null) {
            q1.a0.d(fArr);
        }
        this.f10081o = q1.p0.f17566b;
        this.f10086t = false;
        long j10 = Integer.MAX_VALUE;
        this.f10072f = (j10 & 4294967295L) | (j10 << 32);
        this.f10082p = null;
        this.f10080n = 0;
    }

    @Override // i2.o1
    public final void g(float[] fArr) {
        float[] fArrL = l();
        if (fArrL != null) {
            q1.a0.e(fArr, fArrL);
        }
    }

    @Override // i2.o1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // i2.o1
    public final void h(q1.i0 i0Var) {
        ic.a aVar;
        ic.a aVar2;
        int i10 = i0Var.f17520a | this.f10080n;
        this.f10078l = i0Var.f17536q;
        this.f10077k = i0Var.f17535p;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f10081o = i0Var.f17531l;
        }
        if ((i10 & 1) != 0) {
            t1.b bVar = this.f10067a;
            float f10 = i0Var.f17521b;
            t1.d dVar = bVar.f20139a;
            if (dVar.b() != f10) {
                dVar.n(f10);
            }
        }
        if ((i10 & 2) != 0) {
            t1.b bVar2 = this.f10067a;
            float f11 = i0Var.f17522c;
            t1.d dVar2 = bVar2.f20139a;
            if (dVar2.M() != f11) {
                dVar2.g(f11);
            }
        }
        if ((i10 & 4) != 0) {
            this.f10067a.f(i0Var.f17523d);
        }
        if ((i10 & 8) != 0) {
            t1.b bVar3 = this.f10067a;
            float f12 = i0Var.f17524e;
            t1.d dVar3 = bVar3.f20139a;
            if (dVar3.D() != f12) {
                dVar3.o(f12);
            }
        }
        if ((i10 & 16) != 0) {
            t1.b bVar4 = this.f10067a;
            float f13 = i0Var.f17525f;
            t1.d dVar4 = bVar4.f20139a;
            if (dVar4.z() != f13) {
                dVar4.d(f13);
            }
        }
        boolean z10 = true;
        if ((i10 & 32) != 0) {
            t1.b bVar5 = this.f10067a;
            float f14 = i0Var.f17526g;
            t1.d dVar5 = bVar5.f20139a;
            if (dVar5.L() != f14) {
                dVar5.h(f14);
                bVar5.f20145g = true;
                bVar5.a();
            }
            if (i0Var.f17526g > 0.0f && !this.f10086t && (aVar2 = this.f10071e) != null) {
                aVar2.b();
            }
        }
        if ((i10 & 64) != 0) {
            t1.b bVar6 = this.f10067a;
            long j10 = i0Var.f17527h;
            t1.d dVar6 = bVar6.f20139a;
            if (!q1.q.c(j10, dVar6.y())) {
                dVar6.B(j10);
            }
        }
        if ((i10 & 128) != 0) {
            t1.b bVar7 = this.f10067a;
            long j11 = i0Var.f17528i;
            t1.d dVar7 = bVar7.f20139a;
            if (!q1.q.c(j11, dVar7.A())) {
                dVar7.I(j11);
            }
        }
        if ((i10 & 1024) != 0) {
            t1.b bVar8 = this.f10067a;
            float f15 = i0Var.f17529j;
            t1.d dVar8 = bVar8.f20139a;
            if (dVar8.w() != f15) {
                dVar8.c(f15);
            }
        }
        if ((i10 & 256) != 0) {
            t1.d dVar9 = this.f10067a.f20139a;
            if (dVar9.F() != 0.0f) {
                dVar9.j();
            }
        }
        if ((i10 & 512) != 0) {
            t1.d dVar10 = this.f10067a.f20139a;
            if (dVar10.u() != 0.0f) {
                dVar10.l();
            }
        }
        if ((i10 & 2048) != 0) {
            t1.b bVar9 = this.f10067a;
            float f16 = i0Var.f17530k;
            t1.d dVar11 = bVar9.f20139a;
            if (dVar11.C() != f16) {
                dVar11.p(f16);
            }
        }
        if (i11 != 0) {
            if (q1.p0.a(this.f10081o, q1.p0.f17566b)) {
                t1.b bVar10 = this.f10067a;
                if (!p1.b.c(bVar10.f20160v, 9205357640488583168L)) {
                    bVar10.f20160v = 9205357640488583168L;
                    bVar10.f20139a.x(9205357640488583168L);
                }
            } else {
                t1.b bVar11 = this.f10067a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(q1.p0.c(this.f10081o) * ((int) (this.f10072f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(q1.p0.b(this.f10081o) * ((int) (this.f10072f >> 32)))) << 32);
                if (!p1.b.c(bVar11.f20160v, jFloatToRawIntBits)) {
                    bVar11.f20160v = jFloatToRawIntBits;
                    bVar11.f20139a.x(jFloatToRawIntBits);
                }
            }
        }
        if ((i10 & 16384) != 0) {
            t1.b bVar12 = this.f10067a;
            boolean z11 = i0Var.f17533n;
            if (bVar12.f20161w != z11) {
                bVar12.f20161w = z11;
                bVar12.f20145g = true;
                bVar12.a();
            }
        }
        if ((131072 & i10) != 0) {
            t1.d dVar12 = this.f10067a.f20139a;
        }
        if ((262144 & i10) != 0) {
            t1.d dVar13 = this.f10067a.f20139a;
            if (!jc.l.a(dVar13.s(), null)) {
                dVar13.m();
            }
        }
        if ((524288 & i10) != 0) {
            t1.b bVar13 = this.f10067a;
            int i12 = i0Var.f17537r;
            t1.d dVar14 = bVar13.f20139a;
            if (dVar14.N() != i12) {
                dVar14.e(i12);
            }
        }
        if ((32768 & i10) != 0) {
            t1.d dVar15 = this.f10067a.f20139a;
            if (dVar15.r() != 0) {
                dVar15.H(0);
            }
        }
        if ((i10 & 7963) != 0) {
            this.f10083q = true;
            this.f10084r = true;
        }
        if (jc.l.a(this.f10082p, i0Var.f17538s)) {
            z10 = false;
        } else {
            q1.h0 h0Var = i0Var.f17538s;
            this.f10082p = h0Var;
            if (h0Var != null) {
                t1.b bVar14 = this.f10067a;
                if (h0Var instanceof q1.c0) {
                    p1.c cVar = ((q1.c0) h0Var).f17495e;
                    float f17 = cVar.f16483a;
                    float f18 = cVar.f16484b;
                    bVar14.g((((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f18)) & 4294967295L), (((long) Float.floatToRawIntBits(cVar.f16485c - f17)) << 32) | (((long) Float.floatToRawIntBits(cVar.f16486d - f18)) & 4294967295L), 0.0f);
                } else if (h0Var instanceof q1.b0) {
                    q1.e0 e0Var = ((q1.b0) h0Var).f17493e;
                    bVar14.f20149k = null;
                    bVar14.f20147i = 9205357640488583168L;
                    bVar14.f20146h = 0L;
                    bVar14.f20148j = 0.0f;
                    bVar14.f20145g = true;
                    bVar14.f20152n = false;
                    bVar14.f20150l = e0Var;
                    bVar14.a();
                } else {
                    if (!(h0Var instanceof q1.d0)) {
                        throw new ce.j0();
                    }
                    q1.d0 d0Var = (q1.d0) h0Var;
                    q1.h hVar = d0Var.f17498f;
                    if (hVar != null) {
                        bVar14.f20149k = null;
                        bVar14.f20147i = 9205357640488583168L;
                        bVar14.f20146h = 0L;
                        bVar14.f20148j = 0.0f;
                        bVar14.f20145g = true;
                        bVar14.f20152n = false;
                        bVar14.f20150l = hVar;
                        bVar14.a();
                    } else {
                        p1.d dVar16 = d0Var.f17497e;
                        bVar14.g((((long) Float.floatToRawIntBits(dVar16.f16487a)) << 32) | (((long) Float.floatToRawIntBits(dVar16.f16488b)) & 4294967295L), (((long) Float.floatToRawIntBits(dVar16.b())) << 32) | (((long) Float.floatToRawIntBits(dVar16.a())) & 4294967295L), Float.intBitsToFloat((int) (dVar16.f16494h >> 32)));
                    }
                }
                if ((h0Var instanceof q1.b0) && Build.VERSION.SDK_INT < 33 && (aVar = this.f10071e) != null) {
                    aVar.b();
                }
            }
        }
        this.f10080n = i0Var.f17520a;
        if (i10 != 0 || z10) {
            int i13 = Build.VERSION.SDK_INT;
            v vVar = this.f10069c;
            if (i13 >= 26) {
                ViewParent parent = vVar.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(vVar, vVar);
                }
            } else {
                vVar.invalidate();
            }
            if (vVar.f10032f) {
                vVar.Q(0.0f);
            }
        }
    }

    @Override // i2.o1
    public final void i(long j10) {
        v vVar = this.f10069c;
        if (vVar.f10032f) {
            vVar.Q(-4.0f);
        }
        t1.b bVar = this.f10067a;
        if (!f3.j.b(bVar.f20158t, j10)) {
            bVar.f20158t = j10;
            bVar.f20139a.t((int) (j10 >> 32), (int) (j10 & 4294967295L), bVar.f20159u);
        }
        if (Build.VERSION.SDK_INT < 26) {
            vVar.invalidate();
            return;
        }
        ViewParent parent = vVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(vVar, vVar);
        }
    }

    @Override // i2.o1
    public final void invalidate() {
        if (this.f10076j || this.f10073g) {
            return;
        }
        v vVar = this.f10069c;
        vVar.invalidate();
        if (true != this.f10076j) {
            this.f10076j = true;
            vVar.A(this, true);
        }
    }

    @Override // i2.o1
    public final void j() {
        if (this.f10076j) {
            if (!q1.p0.a(this.f10081o, q1.p0.f17566b) && !f3.l.b(this.f10067a.f20159u, this.f10072f)) {
                t1.b bVar = this.f10067a;
                float fB = q1.p0.b(this.f10081o) * ((int) (this.f10072f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(q1.p0.c(this.f10081o) * ((int) (this.f10072f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!p1.b.c(bVar.f20160v, jFloatToRawIntBits)) {
                    bVar.f20160v = jFloatToRawIntBits;
                    bVar.f20139a.x(jFloatToRawIntBits);
                }
            }
            this.f10067a.e(this.f10077k, this.f10078l, this.f10072f, this.f10087u);
            if (this.f10076j) {
                this.f10076j = false;
                this.f10069c.A(this, false);
            }
        }
    }

    @Override // i2.o1
    public final void k(p1.a aVar, boolean z10) {
        float[] fArrL = z10 ? l() : m();
        if (this.f10085s) {
            return;
        }
        if (fArrL != null) {
            q1.a0.c(fArrL, aVar);
            return;
        }
        aVar.f16477a = 0.0f;
        aVar.f16478b = 0.0f;
        aVar.f16479c = 0.0f;
        aVar.f16480d = 0.0f;
    }

    public final float[] l() {
        float[] fArrA = this.f10075i;
        if (fArrA == null) {
            fArrA = q1.a0.a();
            this.f10075i = fArrA;
        }
        if (this.f10084r) {
            this.f10084r = false;
            float[] fArrM = m();
            if (this.f10085s) {
                return fArrM;
            }
            if (!l0.A(fArrM, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] m() {
        boolean z10 = this.f10083q;
        float[] fArr = this.f10074h;
        if (z10) {
            t1.b bVar = this.f10067a;
            long jL = bVar.f20160v;
            t1.d dVar = bVar.f20139a;
            if ((9223372034707292159L & jL) == 9205357640488583168L) {
                jL = nh.a.l(gh.g.R(this.f10072f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
            float fD = dVar.D();
            float fZ = dVar.z();
            float F = dVar.F();
            float fU = dVar.u();
            float fW = dVar.w();
            float fB = dVar.b();
            float fM = dVar.M();
            double d10 = ((double) F) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d10);
            float fCos = (float) Math.cos(d10);
            float f10 = -fSin;
            float f11 = (fZ * fCos) - (1.0f * fSin);
            float f12 = (1.0f * fCos) + (fZ * fSin);
            double d11 = ((double) fU) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d11);
            float fCos2 = (float) Math.cos(d11);
            float f13 = -fSin2;
            float f14 = fSin * fSin2;
            float f15 = fSin * fCos2;
            float f16 = fCos * fSin2;
            float f17 = fCos * fCos2;
            float f18 = (f12 * fSin2) + (fD * fCos2);
            float f19 = (f12 * fCos2) + ((-fD) * fSin2);
            double d12 = ((double) fW) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d12);
            float fCos3 = (float) Math.cos(d12);
            float f20 = -fSin3;
            float f21 = (fCos3 * f14) + (f20 * fCos2);
            float f22 = (f14 * fSin3) + (fCos2 * fCos3);
            float f23 = fSin3 * fCos;
            float f24 = f22 * fB;
            float f25 = f23 * fB;
            float f26 = ((fSin3 * f15) + (fCos3 * f13)) * fB;
            float f27 = f21 * fM;
            float f28 = fCos * fCos3 * fM;
            float f29 = ((fCos3 * f15) + (f20 * f13)) * fM;
            float f30 = f16 * 1.0f;
            float f31 = f10 * 1.0f;
            float f32 = f17 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f24;
                fArr[1] = f25;
                fArr[2] = f26;
                fArr[3] = 0.0f;
                fArr[4] = f27;
                fArr[5] = f28;
                fArr[6] = f29;
                fArr[7] = 0.0f;
                fArr[8] = f30;
                fArr[9] = f31;
                fArr[10] = f32;
                fArr[11] = 0.0f;
                float f33 = -fIntBitsToFloat;
                fArr[12] = ((f24 * f33) - (fIntBitsToFloat2 * f27)) + f18 + fIntBitsToFloat;
                fArr[13] = ((f25 * f33) - (fIntBitsToFloat2 * f28)) + f11 + fIntBitsToFloat2;
                fArr[14] = ((f33 * f26) - (fIntBitsToFloat2 * f29)) + f19;
                fArr[15] = 1.0f;
            }
            this.f10083q = false;
            this.f10085s = q1.h0.p(fArr);
        }
        return fArr;
    }
}
