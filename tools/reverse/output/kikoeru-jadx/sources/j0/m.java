package j0;

import h0.u0;
import i2.g1;
import l0.l1;
import x0.e1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends j1.p implements i2.l, i2.q, i2.m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f9612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u0 f9613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l1 f9614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e1 f9615r = v.v(null);

    public m(c cVar, u0 u0Var, l1 l1Var) {
        this.f9612o = cVar;
        this.f9613p = u0Var;
        this.f9614q = l1Var;
    }

    @Override // j1.p
    public final void r0() {
        c cVar = this.f9612o;
        if (cVar.f9586a != null) {
            x.a.c("Expected textInputModifierNode to be null");
        }
        cVar.f9586a = this;
    }

    @Override // j1.p
    public final void t0() {
        this.f9612o.k(this);
    }

    @Override // i2.q
    public final void u(g1 g1Var) {
        this.f9615r.setValue(g1Var);
    }
}
