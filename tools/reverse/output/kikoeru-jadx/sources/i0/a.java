package i0;

import c2.e0;
import c2.j0;
import c2.l;
import c2.m;
import d0.h;
import f3.c;
import i2.b2;
import i2.d;
import i2.f;
import i2.n;
import i2.o;
import i2.u1;
import o1.e;
import o1.s;
import o1.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements u1, e, s {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ic.a f8632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j0 f8634s;

    public a(ic.a aVar) {
        this.f8632q = aVar;
        h hVar = new h(2, this);
        l lVar = e0.f3261a;
        j0 j0Var = new j0(null, null, null, hVar);
        B0(j0Var);
        this.f8634s = j0Var;
    }

    @Override // i2.u1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // i2.u1
    public final void h0() {
        z();
    }

    @Override // i2.u1
    public final void j(l lVar, m mVar, long j10) {
        this.f8634s.j(lVar, mVar, j10);
    }

    @Override // i2.u1
    public final long l() {
        o oVar = androidx.compose.foundation.text.handwriting.a.f623a;
        c cVar = f.y(this).f8766y;
        oVar.getClass();
        int i10 = b2.f8653b;
        return d.c(cVar.a0(oVar.f8807a), cVar.a0(oVar.f8808b), cVar.a0(oVar.f8809c), cVar.a0(oVar.f8810d));
    }

    @Override // o1.e
    public final void o(u uVar) {
        this.f8633r = uVar.b();
    }

    @Override // j1.p
    public final void s0() {
        z();
    }

    @Override // i2.u1
    public final void z() {
        this.f8634s.z();
    }

    @Override // i2.u1
    public final /* synthetic */ void H() {
    }
}
