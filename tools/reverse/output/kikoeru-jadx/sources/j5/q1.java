package j5;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 extends k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f10407k;

    public q1(a aVar) {
        this.f10407k = aVar;
    }

    public abstract void A(m4.i1 i1Var);

    public void B() {
        y(null, this.f10407k);
    }

    @Override // j5.a
    public final m4.i1 h() {
        return this.f10407k.h();
    }

    @Override // j5.a
    public final m4.i0 i() {
        return this.f10407k.i();
    }

    @Override // j5.a
    public final boolean j() {
        return this.f10407k.j();
    }

    @Override // j5.a
    public final void m(s4.f0 f0Var) {
        this.f10327j = f0Var;
        this.f10326i = p4.c0.n(null);
        B();
    }

    @Override // j5.a
    public void t(m4.i0 i0Var) {
        this.f10407k.t(i0Var);
    }

    @Override // j5.k
    public final d0 u(Object obj, d0 d0Var) {
        return z(d0Var);
    }

    @Override // j5.k
    public final long v(long j10, Object obj) {
        return j10;
    }

    @Override // j5.k
    public final int w(int i10, Object obj) {
        return i10;
    }

    @Override // j5.k
    public final void x(Object obj, a aVar, m4.i1 i1Var) {
        A(i1Var);
    }

    public d0 z(d0 d0Var) {
        return d0Var;
    }
}
