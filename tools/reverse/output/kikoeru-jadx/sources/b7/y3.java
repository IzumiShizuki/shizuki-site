package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y3 extends m4.i1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f2211j = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m4.i0 f2212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m4.c0 f2215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f2216i;

    public y3(z3 z3Var) {
        this.f2212e = z3Var.s();
        z3Var.r0();
        this.f2213f = ((androidx.lifecycle.q) z3Var.f2227a).n1();
        z3Var.r0();
        this.f2214g = ((androidx.lifecycle.q) z3Var.f2227a).l1();
        this.f2215h = z3Var.T() ? m4.c0.f14143f : null;
        this.f2216i = p4.c0.N(z3Var.p());
    }

    @Override // m4.i1
    public final int b(Object obj) {
        return f2211j.equals(obj) ? 0 : -1;
    }

    @Override // m4.i1
    public final m4.f1 f(int i10, m4.f1 f1Var, boolean z10) {
        f1Var.getClass();
        m4.b bVar = m4.b.f14121f;
        Object obj = f2211j;
        f1Var.i(obj, obj, 0, this.f2216i, 0L, bVar, false);
        return f1Var;
    }

    @Override // m4.i1
    public final int h() {
        return 1;
    }

    @Override // m4.i1
    public final Object l(int i10) {
        return f2211j;
    }

    @Override // m4.i1
    public final m4.h1 m(int i10, m4.h1 h1Var, long j10) {
        h1Var.b(f2211j, this.f2212e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f2213f, this.f2214g, this.f2215h, 0L, this.f2216i, 0, 0, 0L);
        return h1Var;
    }

    @Override // m4.i1
    public final int o() {
        return 1;
    }
}
