package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m5 implements s.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13285c;

    public m5(boolean z10, float f10, long j10) {
        this.f13283a = z10;
        this.f13284b = f10;
        this.f13285c = j10;
    }

    @Override // s.m0
    public final s.n0 a(w.k kVar, x0.o oVar) {
        oVar.W(1257603829);
        oVar.p(false);
        return s.z0.f19317a;
    }

    @Override // s.r0
    public final i2.m b(w.k kVar) {
        return new a2(kVar, this.f13283a, this.f13284b, new z1(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        if (this.f13283a == m5Var.f13283a && f3.f.a(this.f13284b, m5Var.f13284b)) {
            return q1.q.c(this.f13285c, m5Var.f13285c);
        }
        return false;
    }

    @Override // s.r0
    public final int hashCode() {
        int iX = q.t0.x(this.f13284b, (this.f13283a ? 1231 : 1237) * 31, 961);
        int i10 = q1.q.f17576i;
        return ub.v.a(this.f13285c) + iX;
    }
}
