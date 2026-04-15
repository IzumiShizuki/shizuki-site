package j2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements i2.o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f9931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ic.n f9932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ic.a f9933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9934d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p4.p f9938h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o1 f9942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9943m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f9935e = new e2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c2.d f9939i = new c2.d(i1.f9828d);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q1.p f9940j = new q1.p();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9941k = q1.p0.f17566b;

    public o2(v vVar, ic.n nVar, ic.a aVar) {
        this.f9931a = vVar;
        this.f9932b = nVar;
        this.f9933c = aVar;
        o1 m2Var = Build.VERSION.SDK_INT >= 29 ? new m2() : new k2(vVar);
        m2Var.D();
        m2Var.w(false);
        this.f9942l = m2Var;
    }

    @Override // i2.o1
    public final void a(float[] fArr) {
        q1.a0.e(fArr, this.f9939i.c(this.f9942l));
    }

    @Override // i2.o1
    public final void b(q1.o oVar, t1.b bVar) {
        Canvas canvasA = q1.c.a(oVar);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        o1 o1Var = this.f9942l;
        if (zIsHardwareAccelerated) {
            j();
            boolean z10 = o1Var.N() > 0.0f;
            this.f9937g = z10;
            if (z10) {
                oVar.u();
            }
            o1Var.t(canvasA);
            if (this.f9937g) {
                oVar.h();
                return;
            }
            return;
        }
        float fU = o1Var.u();
        float F = o1Var.F();
        float fI = o1Var.I();
        float fR = o1Var.r();
        if (o1Var.a() < 1.0f) {
            p4.p pVarH = this.f9938h;
            if (pVarH == null) {
                pVarH = q1.h0.h();
                this.f9938h = pVarH;
            }
            pVarH.g(o1Var.a());
            canvasA.saveLayer(fU, F, fI, fR, (Paint) pVarH.f16600b);
        } else {
            oVar.f();
        }
        oVar.p(fU, F);
        oVar.k(this.f9939i.c(o1Var));
        if (o1Var.J() || o1Var.E()) {
            this.f9935e.a(oVar);
        }
        ic.n nVar = this.f9932b;
        if (nVar != null) {
            nVar.q(oVar, null);
        }
        oVar.r();
        l(false);
    }

    @Override // i2.o1
    public final boolean c(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j10));
        o1 o1Var = this.f9942l;
        if (o1Var.E()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) o1Var.h()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) o1Var.b());
        }
        if (o1Var.J()) {
            return this.f9935e.c(j10);
        }
        return true;
    }

    @Override // i2.o1
    public final long d(long j10, boolean z10) {
        o1 o1Var = this.f9942l;
        c2.d dVar = this.f9939i;
        if (!z10) {
            return !dVar.f3253d ? q1.a0.b(j10, dVar.c(o1Var)) : j10;
        }
        float[] fArrB = dVar.b(o1Var);
        if (fArrB == null) {
            return 9187343241974906880L;
        }
        return !dVar.f3253d ? q1.a0.b(j10, fArrB) : j10;
    }

    @Override // i2.o1
    public final void destroy() {
        o1 o1Var = this.f9942l;
        if (o1Var.i()) {
            o1Var.f();
        }
        this.f9932b = null;
        this.f9933c = null;
        this.f9936f = true;
        l(false);
        v vVar = this.f9931a;
        vVar.G = true;
        vVar.I(this);
    }

    @Override // i2.o1
    public final void e(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        float fB = q1.p0.b(this.f9941k) * i10;
        o1 o1Var = this.f9942l;
        o1Var.v(fB);
        o1Var.y(q1.p0.c(this.f9941k) * i11);
        if (o1Var.x(o1Var.u(), o1Var.F(), o1Var.u() + i10, o1Var.F() + i11)) {
            o1Var.C(this.f9935e.b());
            if (!this.f9934d && !this.f9936f) {
                this.f9931a.invalidate();
                l(true);
            }
            this.f9939i.e();
        }
    }

    @Override // i2.o1
    public final void f(ic.n nVar, ic.a aVar) {
        c2.d dVar = this.f9939i;
        dVar.f3250a = false;
        dVar.f3251b = false;
        dVar.f3253d = true;
        dVar.f3252c = true;
        q1.a0.d((float[]) dVar.f3256g);
        q1.a0.d((float[]) dVar.f3257h);
        l(false);
        this.f9936f = false;
        this.f9937g = false;
        this.f9941k = q1.p0.f17566b;
        this.f9932b = nVar;
        this.f9933c = aVar;
    }

    @Override // i2.o1
    public final void g(float[] fArr) {
        float[] fArrB = this.f9939i.b(this.f9942l);
        if (fArrB != null) {
            q1.a0.e(fArr, fArrB);
        }
    }

    @Override // i2.o1
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return this.f9939i.c(this.f9942l);
    }

    @Override // i2.o1
    public final void h(q1.i0 i0Var) {
        ic.a aVar;
        int i10 = i0Var.f17520a | this.f9943m;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f9941k = i0Var.f17531l;
        }
        o1 o1Var = this.f9942l;
        boolean zJ = o1Var.J();
        e2 e2Var = this.f9935e;
        boolean z10 = false;
        boolean z11 = zJ && e2Var.f9804g;
        if ((i10 & 1) != 0) {
            o1Var.n(i0Var.f17521b);
        }
        if ((i10 & 2) != 0) {
            o1Var.g(i0Var.f17522c);
        }
        if ((i10 & 4) != 0) {
            o1Var.k(i0Var.f17523d);
        }
        if ((i10 & 8) != 0) {
            o1Var.o(i0Var.f17524e);
        }
        if ((i10 & 16) != 0) {
            o1Var.d(i0Var.f17525f);
        }
        if ((i10 & 32) != 0) {
            o1Var.z(i0Var.f17526g);
        }
        if ((i10 & 64) != 0) {
            o1Var.H(q1.h0.B(i0Var.f17527h));
        }
        if ((i10 & 128) != 0) {
            o1Var.L(q1.h0.B(i0Var.f17528i));
        }
        if ((i10 & 1024) != 0) {
            o1Var.c(i0Var.f17529j);
        }
        if ((i10 & 256) != 0) {
            o1Var.j();
        }
        if ((i10 & 512) != 0) {
            o1Var.l();
        }
        if ((i10 & 2048) != 0) {
            o1Var.p(i0Var.f17530k);
        }
        if (i11 != 0) {
            o1Var.v(q1.p0.b(this.f9941k) * o1Var.h());
            o1Var.y(q1.p0.c(this.f9941k) * o1Var.b());
        }
        boolean z12 = i0Var.f17533n;
        q1.g0 g0Var = q1.h0.f17515a;
        boolean z13 = z12 && i0Var.f17532m != g0Var;
        if ((i10 & 24576) != 0) {
            o1Var.K(z13);
            o1Var.w(i0Var.f17533n && i0Var.f17532m == g0Var);
        }
        if ((131072 & i10) != 0) {
            o1Var.s();
        }
        if ((262144 & i10) != 0) {
            o1Var.m();
        }
        if ((524288 & i10) != 0) {
            o1Var.e(i0Var.f17537r);
        }
        if ((32768 & i10) != 0) {
            o1Var.G();
        }
        boolean zD = this.f9935e.d(i0Var.f17538s, i0Var.f17523d, z13, i0Var.f17526g, i0Var.f17534o);
        if (e2Var.f9803f) {
            o1Var.C(e2Var.b());
        }
        if (z13 && e2Var.f9804g) {
            z10 = true;
        }
        v vVar = this.f9931a;
        if (z11 != z10 || (z10 && zD)) {
            if (!this.f9934d && !this.f9936f) {
                vVar.invalidate();
                l(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = vVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(vVar, vVar);
            }
        } else {
            vVar.invalidate();
        }
        if (!this.f9937g && o1Var.N() > 0.0f && (aVar = this.f9933c) != null) {
            aVar.b();
        }
        if ((i10 & 7963) != 0) {
            this.f9939i.e();
        }
        this.f9943m = i0Var.f17520a;
    }

    @Override // i2.o1
    public final void i(long j10) {
        o1 o1Var = this.f9942l;
        int iU = o1Var.u();
        int iF = o1Var.F();
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (iU == i10 && iF == i11) {
            return;
        }
        if (iU != i10) {
            o1Var.q(i10 - iU);
        }
        if (iF != i11) {
            o1Var.A(i11 - iF);
        }
        int i12 = Build.VERSION.SDK_INT;
        v vVar = this.f9931a;
        if (i12 >= 26) {
            ViewParent parent = vVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(vVar, vVar);
            }
        } else {
            vVar.invalidate();
        }
        this.f9939i.e();
    }

    @Override // i2.o1
    public final void invalidate() {
        if (this.f9934d || this.f9936f) {
            return;
        }
        this.f9931a.invalidate();
        l(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    @Override // i2.o1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            boolean r0 = r5.f9934d
            j2.o1 r1 = r5.f9942l
            if (r0 != 0) goto Le
            boolean r0 = r1.i()
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            boolean r0 = r1.J()
            if (r0 == 0) goto L20
            j2.e2 r0 = r5.f9935e
            boolean r2 = r0.f9804g
            if (r2 == 0) goto L20
            r0.e()
            q1.e0 r0 = r0.f9802e
            goto L21
        L20:
            r0 = 0
        L21:
            ic.n r2 = r5.f9932b
            if (r2 == 0) goto L30
            j2.n2 r3 = new j2.n2
            r4 = 0
            r3.<init>(r4, r2)
            q1.p r2 = r5.f9940j
            r1.B(r2, r0, r3)
        L30:
            r0 = 0
            r5.l(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.o2.j():void");
    }

    @Override // i2.o1
    public final void k(p1.a aVar, boolean z10) {
        o1 o1Var = this.f9942l;
        c2.d dVar = this.f9939i;
        if (!z10) {
            float[] fArrC = dVar.c(o1Var);
            if (dVar.f3253d) {
                return;
            }
            q1.a0.c(fArrC, aVar);
            return;
        }
        float[] fArrB = dVar.b(o1Var);
        if (fArrB != null) {
            if (dVar.f3253d) {
                return;
            }
            q1.a0.c(fArrB, aVar);
        } else {
            aVar.f16477a = 0.0f;
            aVar.f16478b = 0.0f;
            aVar.f16479c = 0.0f;
            aVar.f16480d = 0.0f;
        }
    }

    public final void l(boolean z10) {
        if (z10 != this.f9934d) {
            this.f9934d = z10;
            this.f9931a.A(this, z10);
        }
    }
}
