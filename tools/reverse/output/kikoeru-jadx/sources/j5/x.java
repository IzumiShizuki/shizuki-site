package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends m4.i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m4.i0 f10473e;

    public x(m4.i0 i0Var) {
        this.f10473e = i0Var;
    }

    @Override // m4.i1
    public final int b(Object obj) {
        return obj == w.f10458h ? 0 : -1;
    }

    @Override // m4.i1
    public final m4.f1 f(int i10, m4.f1 f1Var, boolean z10) {
        f1Var.i(z10 ? 0 : null, z10 ? w.f10458h : null, 0, -9223372036854775807L, 0L, m4.b.f14121f, true);
        return f1Var;
    }

    @Override // m4.i1
    public final int h() {
        return 1;
    }

    @Override // m4.i1
    public final Object l(int i10) {
        return w.f10458h;
    }

    @Override // m4.i1
    public final m4.h1 m(int i10, m4.h1 h1Var, long j10) {
        h1Var.b(m4.h1.f14252q, this.f10473e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        h1Var.f14272k = true;
        return h1Var;
    }

    @Override // m4.i1
    public final int o() {
        return 1;
    }
}
