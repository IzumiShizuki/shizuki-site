package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f7272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Enum f7273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Enum f7274d;

    public /* synthetic */ q(u0 u0Var, Enum r22, Enum r32, int i10) {
        this.f7271a = i10;
        this.f7272b = u0Var;
        this.f7273c = r22;
        this.f7274d = r32;
    }

    @Override // g2.u0
    public final Object A() {
        switch (this.f7271a) {
        }
        return this.f7272b.A();
    }

    @Override // g2.u0
    public final int L(int i10) {
        switch (this.f7271a) {
        }
        return this.f7272b.L(i10);
    }

    @Override // g2.u0
    public final int b(int i10) {
        switch (this.f7271a) {
        }
        return this.f7272b.b(i10);
    }

    @Override // g2.u0
    public final int m(int i10) {
        switch (this.f7271a) {
        }
        return this.f7272b.m(i10);
    }

    @Override // g2.u0
    public final int t(int i10) {
        switch (this.f7271a) {
        }
        return this.f7272b.t(i10);
    }

    @Override // g2.u0
    public final g1 v(long j10) {
        switch (this.f7271a) {
            case 0:
                z zVar = (z) this.f7273c;
                a0 a0Var = (a0) this.f7274d;
                a0 a0Var2 = a0.f7153a;
                z zVar2 = z.f7335b;
                u0 u0Var = this.f7272b;
                if (a0Var == a0Var2) {
                    return new s(zVar == zVar2 ? u0Var.t(f3.a.g(j10)) : u0Var.m(f3.a.g(j10)), f3.a.c(j10) ? f3.a.g(j10) : 32767, 0);
                }
                return new s(f3.a.d(j10) ? f3.a.h(j10) : 32767, zVar == zVar2 ? u0Var.b(f3.a.h(j10)) : u0Var.L(f3.a.h(j10)), 0);
            case 1:
                y0 y0Var = (y0) this.f7273c;
                z0 z0Var = (z0) this.f7274d;
                z0 z0Var2 = z0.f7337a;
                y0 y0Var2 = y0.f7321b;
                u0 u0Var2 = this.f7272b;
                if (z0Var == z0Var2) {
                    return new s(y0Var == y0Var2 ? u0Var2.t(f3.a.g(j10)) : u0Var2.m(f3.a.g(j10)), f3.a.c(j10) ? f3.a.g(j10) : 32767, 1);
                }
                return new s(f3.a.d(j10) ? f3.a.h(j10) : 32767, y0Var == y0Var2 ? u0Var2.b(f3.a.h(j10)) : u0Var2.L(f3.a.h(j10)), 1);
            default:
                i2.i1 i1Var = (i2.i1) this.f7273c;
                i2.j1 j1Var = (i2.j1) this.f7274d;
                i2.j1 j1Var2 = i2.j1.f8768a;
                i2.i1 i1Var2 = i2.i1.f8730b;
                u0 u0Var3 = this.f7272b;
                if (j1Var == j1Var2) {
                    return new s(i1Var == i1Var2 ? u0Var3.t(f3.a.g(j10)) : u0Var3.m(f3.a.g(j10)), f3.a.c(j10) ? f3.a.g(j10) : 32767, 2);
                }
                return new s(f3.a.d(j10) ? f3.a.h(j10) : 32767, i1Var == i1Var2 ? u0Var3.b(f3.a.h(j10)) : u0Var3.L(f3.a.h(j10)), 2);
        }
    }
}
