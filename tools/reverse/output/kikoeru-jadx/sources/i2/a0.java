package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends r0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c0 f8645u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var) {
        super(c0Var);
        this.f8645u = c0Var;
    }

    @Override // g2.u0
    public final int L(int i10) {
        c0 c0Var = this.f8645u;
        z zVar = c0Var.R;
        g1 g1Var = c0Var.f8703r;
        jc.l.b(g1Var);
        r0 r0VarK0 = g1Var.K0();
        jc.l.b(r0VarK0);
        return zVar.b(this, r0VarK0, i10);
    }

    @Override // g2.u0
    public final int b(int i10) {
        c0 c0Var = this.f8645u;
        z zVar = c0Var.R;
        g1 g1Var = c0Var.f8703r;
        jc.l.b(g1Var);
        r0 r0VarK0 = g1Var.K0();
        jc.l.b(r0VarK0);
        return zVar.c(this, r0VarK0, i10);
    }

    @Override // g2.u0
    public final int m(int i10) {
        c0 c0Var = this.f8645u;
        z zVar = c0Var.R;
        g1 g1Var = c0Var.f8703r;
        jc.l.b(g1Var);
        r0 r0VarK0 = g1Var.K0();
        jc.l.b(r0VarK0);
        return zVar.f(this, r0VarK0, i10);
    }

    @Override // i2.q0
    public final int n0(g2.t tVar) {
        int iC = f.c(this, tVar);
        this.f8836t.h(iC, tVar);
        return iC;
    }

    @Override // g2.u0
    public final int t(int i10) {
        c0 c0Var = this.f8645u;
        z zVar = c0Var.R;
        g1 g1Var = c0Var.f8703r;
        jc.l.b(g1Var);
        r0 r0VarK0 = g1Var.K0();
        jc.l.b(r0VarK0);
        return zVar.d(this, r0VarK0, i10);
    }

    @Override // g2.u0
    public final g2.g1 v(long j10) {
        k0(j10);
        f3.a aVar = new f3.a(j10);
        c0 c0Var = this.f8645u;
        c0Var.S = aVar;
        z zVar = c0Var.R;
        g1 g1Var = c0Var.f8703r;
        jc.l.b(g1Var);
        r0 r0VarK0 = g1Var.K0();
        jc.l.b(r0VarK0);
        r0.B0(this, zVar.g(this, r0VarK0, j10));
        return this;
    }
}
