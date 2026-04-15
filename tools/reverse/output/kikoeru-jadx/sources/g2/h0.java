package g2;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements r1, x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f7192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f7193b;

    public h0(p0 p0Var) {
        this.f7193b = p0Var;
        this.f7192a = p0Var.f7260h;
    }

    @Override // f3.c
    public final long E(float f10) {
        return this.f7192a.E(f10);
    }

    @Override // f3.c
    public final float I(int i10) {
        return this.f7192a.I(i10);
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / this.f7192a.a();
    }

    @Override // f3.c
    public final float M() {
        return this.f7192a.f7223c;
    }

    @Override // g2.y
    public final boolean O() {
        return this.f7192a.O();
    }

    @Override // g2.r1
    public final List P(ic.n nVar, Object obj) {
        p0 p0Var = this.f7193b;
        i2.j0 j0Var = p0Var.f7253a;
        i2.j0 j0Var2 = (i2.j0) p0Var.f7259g.g(obj);
        if (j0Var2 != null && ((z0.b) j0Var.o()).f26366a.i(j0Var2) < p0Var.f7256d) {
            return j0Var2.m();
        }
        o.k0 k0Var = p0Var.f7262j;
        z0.e eVar = p0Var.f7265m;
        if (eVar.f26374c < p0Var.f7257e) {
            f2.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i10 = eVar.f26374c;
        int i11 = p0Var.f7257e;
        if (i10 == i11) {
            eVar.b(obj);
        } else {
            Object[] objArr = eVar.f26372a;
            Object obj2 = objArr[i11];
            objArr[i11] = obj;
        }
        p0Var.f7257e++;
        if (k0Var.b(obj)) {
            i2.j0 j0Var3 = (i2.j0) k0Var.g(obj);
            i0 i0Var = j0Var3 != null ? (i0) p0Var.f7258f.g(j0Var3) : null;
            if (i0Var != null && i0Var.f7203d) {
                p0Var.h(j0Var3, obj, nVar);
            }
        } else {
            p0Var.f7264l.m(obj, p0Var.f(nVar, obj));
            if (j0Var.G.f8793d == i2.f0.f8691c) {
                j0Var.V(true);
            } else {
                i2.j0.W(j0Var, true, 6);
            }
        }
        i2.j0 j0Var4 = (i2.j0) k0Var.g(obj);
        if (j0Var4 == null) {
            return vb.r.f22819a;
        }
        List listL0 = j0Var4.G.f8805p.l0();
        int size = listL0.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((i2.z0) ((z0.b) listL0).get(i12)).f8908f.f8791b = true;
        }
        return listL0;
    }

    @Override // f3.c
    public final float Q(float f10) {
        return this.f7192a.a() * f10;
    }

    @Override // f3.c
    public final int U(long j10) {
        return this.f7192a.U(j10);
    }

    @Override // f3.c
    public final float a() {
        return this.f7192a.f7222b;
    }

    @Override // f3.c
    public final int a0(float f10) {
        k0 k0Var = this.f7192a;
        k0Var.getClass();
        return a0.c.q(f10, k0Var);
    }

    @Override // g2.x0
    public final w0 b0(int i10, int i11, Map map, ic.k kVar) {
        return this.f7192a.y(i10, i11, map, null, kVar);
    }

    @Override // f3.c
    public final long f0(long j10) {
        k0 k0Var = this.f7192a;
        k0Var.getClass();
        return a0.c.v(j10, k0Var);
    }

    @Override // g2.y
    public final f3.m getLayoutDirection() {
        return this.f7192a.f7221a;
    }

    @Override // f3.c
    public final float i0(long j10) {
        k0 k0Var = this.f7192a;
        k0Var.getClass();
        return a0.c.u(j10, k0Var);
    }

    @Override // f3.c
    public final long n(long j10) {
        k0 k0Var = this.f7192a;
        k0Var.getClass();
        return a0.c.t(j10, k0Var);
    }

    @Override // f3.c
    public final float r(long j10) {
        k0 k0Var = this.f7192a;
        k0Var.getClass();
        return a0.c.s(j10, k0Var);
    }

    @Override // g2.x0
    public final w0 y(int i10, int i11, Map map, ic.k kVar, ic.k kVar2) {
        return this.f7192a.y(i10, i11, map, kVar, kVar2);
    }
}
