package v4;

import m4.i1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22451b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0 f22453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w4.k f22455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p4.v f22456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j5.c1 f22458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m4.q[] f22459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f22461l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22464o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public m5.p f22466q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22450a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2.e f22452c = new v2.e(1, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22462m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i1 f22465p = i1.f14291a;

    public e(int i10) {
        this.f22451b = i10;
    }

    public final m f(Exception exc, m4.q qVar, boolean z10, int i10) {
        int iY;
        if (qVar == null || this.f22464o) {
            iY = 4;
        } else {
            this.f22464o = true;
            try {
                iY = y(qVar) & 7;
            } catch (m unused) {
                iY = 4;
            } finally {
                this.f22464o = false;
            }
        }
        return new m(1, exc, i10, i(), this.f22454e, qVar, qVar == null ? 4 : iY, z10);
    }

    public g0 h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        return this.f22462m == Long.MIN_VALUE;
    }

    public abstract boolean k();

    public abstract boolean l();

    public abstract void m();

    public abstract void o(long j10, boolean z10);

    public final int u(v2.e eVar, u4.f fVar, int i10) {
        j5.c1 c1Var = this.f22458i;
        c1Var.getClass();
        int iN = c1Var.n(eVar, fVar, i10);
        if (iN == -4) {
            if (fVar.d(4)) {
                this.f22462m = Long.MIN_VALUE;
                return this.f22463n ? -4 : -3;
            }
            long j10 = fVar.f21384g + this.f22460k;
            fVar.f21384g = j10;
            this.f22462m = Math.max(this.f22462m, j10);
            return iN;
        }
        if (iN == -5) {
            m4.q qVar = (m4.q) eVar.f22365c;
            qVar.getClass();
            long j11 = qVar.f14549s;
            if (j11 != Long.MAX_VALUE) {
                m4.p pVarA = qVar.a();
                pVarA.f14493r = j11 + this.f22460k;
                eVar.f22365c = new m4.q(pVarA);
            }
        }
        return iN;
    }

    public abstract void v(long j10, long j11);

    public final void w(m4.q[] qVarArr, j5.c1 c1Var, long j10, long j11, j5.d0 d0Var) {
        p4.c.i(!this.f22463n);
        this.f22458i = c1Var;
        if (this.f22462m == Long.MIN_VALUE) {
            this.f22462m = j10;
        }
        this.f22459j = qVarArr;
        this.f22460k = j11;
        t(qVarArr, j10, j11, d0Var);
    }

    public abstract int y(m4.q qVar);

    public int z() {
        return 0;
    }

    public void g() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    @Override // v4.w0
    public void d(int i10, Object obj) {
    }

    public void n(boolean z10, boolean z11) {
    }

    public void x(float f10, float f11) {
    }

    public void t(m4.q[] qVarArr, long j10, long j11, j5.d0 d0Var) {
    }
}
