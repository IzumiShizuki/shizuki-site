package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 implements f3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7178a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(f1 f1Var, g1 g1Var) {
        f1Var.getClass();
        if (g1Var instanceof i2.b1) {
            ((i2.b1) g1Var).C(f1Var.f7178a);
        }
    }

    public static void j(f1 f1Var, g1 g1Var, long j10) {
        f1Var.getClass();
        b(f1Var, g1Var);
        g1Var.Y(f3.j.d(j10, g1Var.f7184e), 0.0f, null);
    }

    public static void k(f1 f1Var, g1 g1Var, int i10, int i11) {
        long j10 = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        if (f1Var.f() == f3.m.f6667a || f1Var.g() == 0) {
            b(f1Var, g1Var);
            g1Var.Y(f3.j.d(j10, g1Var.f7184e), 0.0f, null);
        } else {
            int iG = (f1Var.g() - g1Var.f7180a) - ((int) (j10 >> 32));
            b(f1Var, g1Var);
            g1Var.Y(f3.j.d((((long) iG) << 32) | (((long) ((int) (j10 & 4294967295L))) & 4294967295L), g1Var.f7184e), 0.0f, null);
        }
    }

    public static void l(f1 f1Var, g1 g1Var, int i10, int i11) {
        int i12 = i1.f7208b;
        h1 h1Var = h1.f7194c;
        long j10 = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        if (f1Var.f() == f3.m.f6667a || f1Var.g() == 0) {
            b(f1Var, g1Var);
            g1Var.Y(f3.j.d(j10, g1Var.f7184e), 0.0f, h1Var);
        } else {
            int iG = (f1Var.g() - g1Var.f7180a) - ((int) (j10 >> 32));
            b(f1Var, g1Var);
            g1Var.Y(f3.j.d((((long) iG) << 32) | (((long) ((int) (j10 & 4294967295L))) & 4294967295L), g1Var.f7184e), 0.0f, h1Var);
        }
    }

    public static void m(f1 f1Var, g1 g1Var, long j10) {
        int i10 = i1.f7208b;
        h1 h1Var = h1.f7194c;
        if (f1Var.f() == f3.m.f6667a || f1Var.g() == 0) {
            b(f1Var, g1Var);
            g1Var.Y(f3.j.d(j10, g1Var.f7184e), 0.0f, h1Var);
        } else {
            int iG = (f1Var.g() - g1Var.f7180a) - ((int) (j10 >> 32));
            b(f1Var, g1Var);
            g1Var.Y(f3.j.d((((long) ((int) (j10 & 4294967295L))) & 4294967295L) | (((long) iG) << 32), g1Var.f7184e), 0.0f, h1Var);
        }
    }

    public static void o(f1 f1Var, g1 g1Var, int i10, int i11, ic.k kVar, int i12) {
        if ((i12 & 8) != 0) {
            int i13 = i1.f7208b;
            kVar = h1.f7194c;
        }
        f1Var.getClass();
        b(f1Var, g1Var);
        g1Var.Y(f3.j.d((((long) i11) & 4294967295L) | (((long) i10) << 32), g1Var.f7184e), 0.0f, kVar);
    }

    public static void q(f1 f1Var, g1 g1Var, long j10) {
        int i10 = i1.f7208b;
        h1 h1Var = h1.f7194c;
        f1Var.getClass();
        b(f1Var, g1Var);
        g1Var.Y(f3.j.d(j10, g1Var.f7184e), 0.0f, h1Var);
    }

    @Override // f3.c
    public final long E(float f10) {
        return a0.c.w(J(f10), this);
    }

    @Override // f3.c
    public final float I(int i10) {
        return i10 / a();
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / a();
    }

    @Override // f3.c
    public final float Q(float f10) {
        return a() * f10;
    }

    @Override // f3.c
    public final /* synthetic */ int a0(float f10) {
        return a0.c.q(f10, this);
    }

    public float c(v vVar) {
        return Float.NaN;
    }

    public abstract c0 d();

    public abstract f3.m f();

    @Override // f3.c
    public final /* synthetic */ long f0(long j10) {
        return a0.c.v(j10, this);
    }

    public abstract int g();

    public final void h(g1 g1Var, int i10, int i11, float f10) {
        b(this, g1Var);
        g1Var.Y(f3.j.d((((long) i11) & 4294967295L) | (((long) i10) << 32), g1Var.f7184e), f10, null);
    }

    @Override // f3.c
    public final /* synthetic */ float i0(long j10) {
        return a0.c.u(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ long n(long j10) {
        return a0.c.t(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ float r(long j10) {
        return a0.c.s(j10, this);
    }
}
