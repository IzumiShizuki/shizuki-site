package yc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends bd.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f26098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final se.i f26099i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(re.l lVar, g gVar, be.e eVar, boolean z10, int i10) {
        super(lVar, gVar, eVar, m0.p0);
        jc.l.e(gVar, "container");
        this.f26097g = z10;
        oc.d dVarE = nh.b.E(0, i10);
        ArrayList arrayList = new ArrayList(vb.n.K(dVarE, 10));
        oc.c it = dVarE.iterator();
        while (it.f16312c) {
            int iNextInt = it.nextInt();
            arrayList.add(bd.w0.G1(this, se.x0.INVARIANT, be.e.e("T" + iNextInt), iNextInt, lVar));
        }
        this.f26098h = arrayList;
        this.f26099i = new se.i(this, v.c(this), ud.e.X(ie.d.j(this).g().e()), lVar);
    }

    @Override // yc.e
    public final r0 J0() {
        return null;
    }

    @Override // yc.e, yc.i
    public final List L() {
        return this.f26098h;
    }

    @Override // yc.w
    public final boolean O0() {
        return false;
    }

    @Override // bd.m, yc.w
    public final boolean P() {
        return false;
    }

    @Override // yc.h
    public final se.k0 Q() {
        return this.f26099i;
    }

    @Override // yc.e
    public final boolean R() {
        return false;
    }

    @Override // yc.e
    public final boolean S0() {
        return false;
    }

    @Override // yc.e
    public final Collection T() {
        return vb.t.f22821a;
    }

    @Override // yc.e
    public final boolean W() {
        return false;
    }

    @Override // yc.w
    public final boolean c0() {
        return false;
    }

    @Override // yc.i
    public final boolean d0() {
        return this.f26097g;
    }

    @Override // yc.e, yc.w, yc.n
    public final ld.o f() {
        ld.o oVar = o.f26129e;
        jc.l.d(oVar, "PUBLIC");
        return oVar;
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        return zc.g.f26696a;
    }

    @Override // bd.e0
    public final le.o i(te.f fVar) {
        return le.n.f12335b;
    }

    @Override // yc.e
    public final f j() {
        return f.f26109a;
    }

    @Override // yc.e
    public final bd.l j0() {
        return null;
    }

    @Override // yc.e
    public final /* bridge */ /* synthetic */ le.o k0() {
        return le.n.f12335b;
    }

    @Override // yc.e
    public final boolean l() {
        return false;
    }

    @Override // yc.e, yc.w
    public final x s() {
        return x.f26155b;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // yc.e
    public final boolean w() {
        return false;
    }
}
