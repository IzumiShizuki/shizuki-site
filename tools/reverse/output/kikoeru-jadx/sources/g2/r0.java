package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.r0 f7282a;

    public r0(i2.r0 r0Var) {
        this.f7282a = r0Var;
    }

    @Override // g2.c0
    public final c0 B() {
        i2.r0 r0VarK0;
        if (!h()) {
            f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        i2.g1 g1Var = this.f7282a.f8831o.f8700o.F.f8665d.f8704s;
        if (g1Var == null || (r0VarK0 = g1Var.K0()) == null) {
            return null;
        }
        return r0VarK0.f8834r;
    }

    @Override // g2.c0
    public final long G(long j10) {
        return p1.b.i(this.f7282a.f8831o.G(j10), a());
    }

    @Override // g2.c0
    public final long H(long j10) {
        return this.f7282a.f8831o.H(p1.b.i(j10, a()));
    }

    public final long a() {
        i2.r0 r0Var = this.f7282a;
        i2.r0 r0VarJ = n1.j(r0Var);
        return p1.b.h(b(r0VarJ.f8834r, 0L), r0Var.f8831o.V0(r0VarJ.f8831o, 0L));
    }

    public final long b(c0 c0Var, long j10) {
        boolean z10 = c0Var instanceof r0;
        i2.r0 r0Var = this.f7282a;
        if (!z10) {
            i2.r0 r0VarJ = n1.j(r0Var);
            i2.g1 g1Var = r0VarJ.f8831o;
            long jH = p1.b.h(b(r0VarJ.f8834r, j10), (4294967295L & ((long) Float.floatToRawIntBits((int) (r5 & 4294967295L)))) | (Float.floatToRawIntBits((int) (r0VarJ.f8832p >> 32)) << 32));
            if (!g1Var.M0().f9703n) {
                f2.a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            g1Var.W0();
            i2.g1 g1Var2 = g1Var.f8704s;
            if (g1Var2 != null) {
                g1Var = g1Var2;
            }
            return p1.b.i(jH, g1Var.V0(c0Var, 0L));
        }
        i2.r0 r0Var2 = ((r0) c0Var).f7282a;
        i2.g1 g1Var3 = r0Var2.f8831o;
        g1Var3.W0();
        i2.r0 r0VarK0 = r0Var.f8831o.I0(g1Var3).K0();
        if (r0VarK0 != null) {
            return (((long) Float.floatToRawIntBits((int) (f3.j.c(f3.j.d(r0Var2.F0(r0VarK0, false), android.support.v4.media.session.b.X(j10)), r0Var.F0(r0VarK0, false)) >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (r11 & 4294967295L))) & 4294967295L);
        }
        i2.r0 r0VarJ2 = n1.j(r0Var2);
        long jD = f3.j.d(f3.j.d(r0Var2.F0(r0VarJ2, false), r0VarJ2.f8832p), android.support.v4.media.session.b.X(j10));
        i2.r0 r0VarJ3 = n1.j(r0Var);
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (f3.j.c(jD, f3.j.d(r0Var.F0(r0VarJ3, false), r0VarJ3.f8832p)) >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (r11 & 4294967295L))) & 4294967295L;
        i2.g1 g1Var4 = r0VarJ3.f8831o.f8704s;
        jc.l.b(g1Var4);
        i2.g1 g1Var5 = r0VarJ2.f8831o.f8704s;
        jc.l.b(g1Var5);
        return g1Var4.V0(g1Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // g2.c0
    public final long c(long j10) {
        return this.f7282a.f8831o.c(p1.b.i(j10, a()));
    }

    @Override // g2.c0
    public final void f(c0 c0Var, float[] fArr) {
        this.f7282a.f8831o.f(c0Var, fArr);
    }

    @Override // g2.c0
    public final boolean h() {
        return this.f7282a.f8831o.M0().f9703n;
    }

    @Override // g2.c0
    public final void j(float[] fArr) {
        this.f7282a.f8831o.j(fArr);
    }

    @Override // g2.c0
    public final long k() {
        i2.r0 r0Var = this.f7282a;
        return (((long) r0Var.f7180a) << 32) | (((long) r0Var.f7181b) & 4294967295L);
    }

    @Override // g2.c0
    public final long o(c0 c0Var, long j10) {
        return b(c0Var, j10);
    }

    @Override // g2.c0
    public final p1.c s(c0 c0Var, boolean z10) {
        return this.f7282a.f8831o.s(c0Var, z10);
    }

    @Override // g2.c0
    public final long u(long j10) {
        return this.f7282a.f8831o.u(p1.b.i(0L, a()));
    }

    @Override // g2.c0
    public final long z(long j10) {
        return p1.b.i(this.f7282a.f8831o.z(j10), a());
    }
}
