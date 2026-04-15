package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements l0.l, m6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10477d;

    public x0(long j10, int i10) {
        p4.c.i(((n5.a) this.f10476c) == null);
        this.f10474a = j10;
        this.f10475b = j10 + ((long) i10);
    }

    @Override // l0.l
    public boolean c(long j10, l0.s sVar) {
        g2.c0 c0Var = (g2.c0) ((k0.g) this.f10476c).b();
        if (c0Var == null) {
            return false;
        }
        l0.y0 y0Var = (l0.y0) this.f10477d;
        long j11 = this.f10475b;
        if (!c0Var.h()) {
            return false;
        }
        l0.a1 a1Var = (l0.a1) y0Var;
        k1.o oVar = a1Var.f11415f;
        if (oVar != null) {
            oVar.l(Boolean.FALSE, c0Var, new p1.b(j10), sVar);
        }
        this.f10474a = j10;
        return l0.b1.a(a1Var, j11);
    }

    @Override // m6.g
    public long d(r5.o oVar) {
        long j10 = this.f10475b;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f10475b = -1L;
        return j11;
    }

    @Override // l0.l
    public void h() {
        l0.x xVar = ((l0.a1) ((l0.y0) this.f10477d)).f11417h;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // l0.l
    public boolean i(long j10, l0.s sVar) {
        g2.c0 c0Var = (g2.c0) ((k0.g) this.f10476c).b();
        if (c0Var == null) {
            return true;
        }
        l0.y0 y0Var = (l0.y0) this.f10477d;
        long j11 = this.f10475b;
        if (!c0Var.h() || !l0.b1.a(y0Var, j11)) {
            return false;
        }
        if (!((l0.a1) y0Var).b(c0Var, j10, this.f10474a, sVar, false)) {
            return true;
        }
        this.f10474a = j10;
        return true;
    }

    @Override // m6.g
    public r5.b0 j() {
        p4.c.i(this.f10474a != -1);
        return new r5.s((r5.t) this.f10476c, this.f10474a, 0);
    }

    @Override // m6.g
    public void m(long j10) {
        long[] jArr = (long[]) ((m0.w) this.f10477d).f13782b;
        this.f10475b = jArr[p4.c0.e(jArr, j10, true)];
    }

    public x0(String str, byte[] bArr, long j10, long j11) {
        this.f10476c = str;
        this.f10477d = bArr;
        this.f10474a = j10;
        this.f10475b = j11;
    }
}
