package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends k0 {
    public boolean A;
    public ic.o B;
    public ic.o C;
    public boolean D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o0 f21013y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e1 f21014z;

    @Override // u.k0
    public final Object I0(j0 j0Var, j0 j0Var2) {
        Object objD = this.f21013y.d(s.v0.f19293b, new q.q(j0Var, this, (yb.c) null, 11), j0Var2);
        return objD == zb.a.f26667a ? objD : ub.a0.f21526a;
    }

    @Override // u.k0
    public final void J0(long j10) {
        if (!this.f9703n || jc.l.a(this.B, l0.f20995a)) {
            return;
        }
        hf.a0.y(n0(), null, hf.z.f8619d, new m0(this, j10, null, 0), 1);
    }

    @Override // u.k0
    public final void K0(long j10) {
        if (!this.f9703n || jc.l.a(this.C, l0.f20996b)) {
            return;
        }
        hf.a0.y(n0(), null, hf.z.f8619d, new m0(this, j10, null, 1), 1);
    }

    @Override // u.k0
    public final boolean L0() {
        return this.A;
    }
}
