package k0;

import ce.j0;
import g2.u0;
import g2.w0;
import g2.x0;
import i2.g1;
import i2.q;
import i2.q0;
import i2.z;
import l0.a1;
import l0.y0;
import q1.r;
import t2.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i2.n implements z, i2.p, q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f10927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f10928r;

    public f(t2.g gVar, l0 l0Var, x2.d dVar, ic.k kVar, int i10, boolean z10, int i11, int i12, h hVar, r rVar) {
        this.f10927q = hVar;
        m mVar = new m(gVar, l0Var, dVar, kVar, i10, z10, i11, i12, hVar, rVar);
        B0(mVar);
        this.f10928r = mVar;
        if (this.f10927q != null) {
            return;
        }
        x.a.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new j0();
    }

    @Override // i2.p
    public final void R(i2.l0 l0Var) throws Throwable {
        this.f10928r.R(l0Var);
    }

    @Override // i2.z
    public final int b(q0 q0Var, u0 u0Var, int i10) {
        return this.f10928r.b(q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final int c(q0 q0Var, u0 u0Var, int i10) {
        return this.f10928r.c(q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final int d(q0 q0Var, u0 u0Var, int i10) {
        return this.f10928r.d(q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final int f(q0 q0Var, u0 u0Var, int i10) {
        return this.f10928r.f(q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final w0 g(x0 x0Var, u0 u0Var, long j10) {
        return this.f10928r.g(x0Var, u0Var, j10);
    }

    @Override // j1.p
    public final boolean o0() {
        return false;
    }

    @Override // i2.q
    public final void u(g1 g1Var) {
        h hVar = this.f10927q;
        if (hVar != null) {
            hVar.f10934d = j.a(hVar.f10934d, g1Var, null, 2);
            y0 y0Var = hVar.f10932b;
            long j10 = hVar.f10931a;
            a1 a1Var = (a1) y0Var;
            a1Var.f11410a = false;
            l0.z zVar = a1Var.f11414e;
            if (zVar != null) {
                zVar.a(Long.valueOf(j10));
            }
        }
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
    }
}
