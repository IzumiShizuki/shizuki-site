package s;

import u.u1;
import u.v1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends i2.n implements i2.l, i2.k1 {
    public g A;
    public f B;
    public boolean C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v1 f19255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u.e1 f19256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f19257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public u.p0 f19258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w.k f19259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public u.c f19260v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f f19262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u1 f19263y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i2.m f19264z;

    public final void E0() {
        i2.m mVar = this.f19264z;
        if (mVar != null) {
            if (((j1.p) mVar).f9690a.f9703n) {
                return;
            }
            B0(mVar);
            return;
        }
        if (this.f19261w) {
            i2.f.t(this, new r2.a(4, this));
        }
        f fVar = this.f19261w ? this.B : this.f19262x;
        if (fVar != null) {
            i2.n nVar = fVar.f19148i;
            if (nVar.f9690a.f9703n) {
                return;
            }
            B0(nVar);
            this.f19264z = nVar;
        }
    }

    public final boolean F0() {
        return (this.f9703n ? i2.f.y(this).f8767z : f3.m.f6667a) != f3.m.f6668b || this.f19256r == u.e1.f20882a;
    }

    public final void G0(f fVar, u.c cVar, u.p0 p0Var, u.e1 e1Var, v1 v1Var, w.k kVar, boolean z10, boolean z11) {
        boolean z12;
        this.f19255q = v1Var;
        this.f19256r = e1Var;
        boolean z13 = true;
        if (this.f19261w != z10) {
            this.f19261w = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        if (jc.l.a(this.f19262x, fVar)) {
            z13 = false;
        } else {
            this.f19262x = fVar;
        }
        if (z12 || (z13 && !z10)) {
            i2.m mVar = this.f19264z;
            if (mVar != null) {
                C0(mVar);
            }
            this.f19264z = null;
            E0();
        }
        this.f19257s = z11;
        this.f19258t = p0Var;
        this.f19259u = kVar;
        this.f19260v = cVar;
        boolean zF0 = F0();
        this.C = zF0;
        u1 u1Var = this.f19263y;
        if (u1Var != null) {
            u1Var.N0(this.f19261w ? this.B : this.f19262x, cVar, p0Var, e1Var, v1Var, kVar, z11, zF0);
        }
    }

    @Override // i2.k1
    public final void W() {
        g gVar = (g) i2.f.i(this, c1.f19118a);
        if (jc.l.a(gVar, this.A)) {
            return;
        }
        this.A = gVar;
        this.B = null;
        i2.m mVar = this.f19264z;
        if (mVar != null) {
            C0(mVar);
        }
        this.f19264z = null;
        E0();
        u1 u1Var = this.f19263y;
        if (u1Var != null) {
            v1 v1Var = this.f19255q;
            u.e1 e1Var = this.f19256r;
            f fVar = this.f19261w ? this.B : this.f19262x;
            u1Var.N0(fVar, this.f19260v, this.f19258t, e1Var, v1Var, this.f19259u, this.f19257s, this.C);
        }
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    @Override // j1.p
    public final void r0() {
        this.C = F0();
        E0();
        if (this.f19263y == null) {
            v1 v1Var = this.f19255q;
            f fVar = this.f19261w ? this.B : this.f19262x;
            u1 u1Var = new u1(fVar, this.f19260v, this.f19258t, this.f19256r, v1Var, this.f19259u, this.f19257s, this.C);
            B0(u1Var);
            this.f19263y = u1Var;
        }
    }

    @Override // j1.p
    public final void t0() {
        i2.m mVar = this.f19264z;
        if (mVar != null) {
            C0(mVar);
        }
    }

    @Override // j1.p
    public final void u0() {
        boolean zF0 = F0();
        if (this.C != zF0) {
            this.C = zF0;
            v1 v1Var = this.f19255q;
            u.e1 e1Var = this.f19256r;
            boolean z10 = this.f19261w;
            f fVar = z10 ? this.B : this.f19262x;
            G0(fVar, this.f19260v, this.f19258t, e1Var, v1Var, this.f19259u, z10, this.f19257s);
        }
    }
}
