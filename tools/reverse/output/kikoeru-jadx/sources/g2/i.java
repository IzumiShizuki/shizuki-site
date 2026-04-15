package g2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g, x0, s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.c0 f7197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q.e1 f7198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7199c;

    public i(i2.c0 c0Var, q.e1 e1Var) {
        this.f7197a = c0Var;
        this.f7198b = e1Var;
    }

    @Override // f3.c
    public final long E(float f10) {
        return this.f7197a.E(f10);
    }

    @Override // f3.c
    public final float I(int i10) {
        return this.f7197a.I(i10);
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / this.f7197a.a();
    }

    @Override // f3.c
    public final float M() {
        return this.f7197a.M();
    }

    @Override // g2.y
    public final boolean O() {
        return false;
    }

    @Override // f3.c
    public final float Q(float f10) {
        return this.f7197a.a() * f10;
    }

    @Override // f3.c
    public final int U(long j10) {
        return this.f7197a.U(j10);
    }

    @Override // f3.c
    public final float a() {
        return this.f7197a.a();
    }

    @Override // f3.c
    public final int a0(float f10) {
        i2.c0 c0Var = this.f7197a;
        c0Var.getClass();
        return a0.c.q(f10, c0Var);
    }

    @Override // g2.x0
    public final w0 b0(int i10, int i11, Map map, ic.k kVar) {
        return this.f7197a.y(i10, i11, map, null, kVar);
    }

    @Override // g2.s0
    public final c0 f(i2.g1 g1Var) {
        r0 r0Var;
        i2.r0 r0VarK0 = g1Var.K0();
        return (r0VarK0 == null || (r0Var = r0VarK0.f8834r) == null) ? g1Var : r0Var;
    }

    @Override // f3.c
    public final long f0(long j10) {
        i2.c0 c0Var = this.f7197a;
        c0Var.getClass();
        return a0.c.v(j10, c0Var);
    }

    @Override // g2.y
    public final f3.m getLayoutDirection() {
        return this.f7197a.f8700o.f8767z;
    }

    @Override // f3.c
    public final float i0(long j10) {
        i2.c0 c0Var = this.f7197a;
        c0Var.getClass();
        return a0.c.u(j10, c0Var);
    }

    @Override // f3.c
    public final long n(long j10) {
        i2.c0 c0Var = this.f7197a;
        c0Var.getClass();
        return a0.c.t(j10, c0Var);
    }

    @Override // f3.c
    public final float r(long j10) {
        i2.c0 c0Var = this.f7197a;
        c0Var.getClass();
        return a0.c.s(j10, c0Var);
    }

    @Override // g2.x0
    public final w0 y(int i10, int i11, Map map, ic.k kVar, ic.k kVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            f2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new h(i10, i11, map, kVar, (b0.p) kVar2, this, 0);
    }
}
