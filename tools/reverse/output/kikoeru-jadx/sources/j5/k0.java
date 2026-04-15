package j5;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements m5.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.r f10328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m4.j1 f10329b;

    public k0(m5.r rVar, m4.j1 j1Var) {
        this.f10328a = rVar;
        this.f10329b = j1Var;
    }

    @Override // m5.r
    public final boolean a(int i10, long j10) {
        return this.f10328a.a(i10, j10);
    }

    @Override // m5.r
    public final m4.j1 b() {
        return this.f10329b;
    }

    @Override // m5.r
    public final int c() {
        return this.f10328a.c();
    }

    @Override // m5.r
    public final boolean d(long j10, k5.f fVar, List list) {
        return this.f10328a.d(j10, fVar, list);
    }

    @Override // m5.r
    public final void e(boolean z10) {
        this.f10328a.e(z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f10328a.equals(k0Var.f10328a) && this.f10329b.equals(k0Var.f10329b);
    }

    @Override // m5.r
    public final void f(long j10, long j11, long j12, List list, k5.m[] mVarArr) {
        this.f10328a.f(j10, j11, j12, list, mVarArr);
    }

    @Override // m5.r
    public final m4.q g(int i10) {
        return this.f10329b.f14307d[this.f10328a.i(i10)];
    }

    @Override // m5.r
    public final void h() {
        this.f10328a.h();
    }

    public final int hashCode() {
        return this.f10328a.hashCode() + ((this.f10329b.hashCode() + 527) * 31);
    }

    @Override // m5.r
    public final int i(int i10) {
        return this.f10328a.i(i10);
    }

    @Override // m5.r
    public final int j(long j10, List list) {
        return this.f10328a.j(j10, list);
    }

    @Override // m5.r
    public final void k() {
        this.f10328a.k();
    }

    @Override // m5.r
    public final int l() {
        return this.f10328a.l();
    }

    @Override // m5.r
    public final int length() {
        return this.f10328a.length();
    }

    @Override // m5.r
    public final m4.q m() {
        return this.f10329b.f14307d[this.f10328a.l()];
    }

    @Override // m5.r
    public final int n() {
        return this.f10328a.n();
    }

    @Override // m5.r
    public final boolean o(int i10, long j10) {
        return this.f10328a.o(i10, j10);
    }

    @Override // m5.r
    public final void p(float f10) {
        this.f10328a.p(f10);
    }

    @Override // m5.r
    public final Object q() {
        return this.f10328a.q();
    }

    @Override // m5.r
    public final void r() {
        this.f10328a.r();
    }

    @Override // m5.r
    public final int s(m4.q qVar) {
        return this.f10328a.u(this.f10329b.b(qVar));
    }

    @Override // m5.r
    public final void t() {
        this.f10328a.t();
    }

    @Override // m5.r
    public final int u(int i10) {
        return this.f10328a.u(i10);
    }
}
