package g2;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f3.m f7221a = f3.m.f6668b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f7223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f7224d;

    public k0(p0 p0Var) {
        this.f7224d = p0Var;
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
    public final float M() {
        return this.f7223c;
    }

    @Override // g2.y
    public final boolean O() {
        i2.f0 f0Var = this.f7224d.f7253a.G.f8793d;
        return f0Var == i2.f0.f8692d || f0Var == i2.f0.f8690b;
    }

    @Override // g2.r1
    public final List P(ic.n nVar, Object obj) {
        p0 p0Var = this.f7224d;
        p0Var.d();
        i2.j0 j0Var = p0Var.f7253a;
        i2.f0 f0Var = j0Var.G.f8793d;
        i2.f0 f0Var2 = i2.f0.f8691c;
        i2.f0 f0Var3 = i2.f0.f8689a;
        if (f0Var != f0Var3 && f0Var != f0Var2 && f0Var != i2.f0.f8690b && f0Var != i2.f0.f8692d) {
            f2.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        o.k0 k0Var = p0Var.f7259g;
        Object objG = k0Var.g(obj);
        if (objG == null) {
            objG = (i2.j0) p0Var.f7262j.k(obj);
            if (objG != null) {
                if (p0Var.f7267o <= 0) {
                    f2.a.b("Check failed.");
                }
                p0Var.f7267o--;
            } else {
                objG = p0Var.i(obj);
                if (objG == null) {
                    int i10 = p0Var.f7256d;
                    i2.j0 j0Var2 = new i2.j0(2);
                    j0Var.f8758q = true;
                    j0Var.B(i10, j0Var2);
                    j0Var.f8758q = false;
                    objG = j0Var2;
                }
            }
            k0Var.m(obj, objG);
        }
        i2.j0 j0Var3 = (i2.j0) objG;
        if (vb.m.b0(p0Var.f7256d, j0Var.o()) != j0Var3) {
            int i11 = ((z0.b) j0Var.o()).f26366a.i(j0Var3);
            if (i11 < p0Var.f7256d) {
                f2.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i12 = p0Var.f7256d;
            if (i12 != i11) {
                j0Var.f8758q = true;
                j0Var.M(i11, i12, 1);
                j0Var.f8758q = false;
            }
        }
        p0Var.f7256d++;
        p0Var.h(j0Var3, obj, nVar);
        return (f0Var == f0Var3 || f0Var == f0Var2) ? j0Var3.m() : j0Var3.l();
    }

    @Override // f3.c
    public final float Q(float f10) {
        return a() * f10;
    }

    @Override // f3.c
    public final int U(long j10) {
        return Math.round(i0(j10));
    }

    @Override // f3.c
    public final float a() {
        return this.f7222b;
    }

    @Override // f3.c
    public final /* synthetic */ int a0(float f10) {
        return a0.c.q(f10, this);
    }

    @Override // g2.x0
    public final w0 b0(int i10, int i11, Map map, ic.k kVar) {
        return y(i10, i11, map, null, kVar);
    }

    @Override // f3.c
    public final /* synthetic */ long f0(long j10) {
        return a0.c.v(j10, this);
    }

    @Override // g2.y
    public final f3.m getLayoutDirection() {
        return this.f7221a;
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

    @Override // g2.x0
    public final w0 y(int i10, int i11, Map map, ic.k kVar, ic.k kVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            f2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new j0(i10, i11, map, kVar, this, this.f7224d, kVar2);
    }
}
