package wc;

import bd.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import se.k0;
import se.x0;
import ub.a0;
import vb.n;
import vb.r;
import vc.o;
import yc.d0;
import yc.m0;
import yc.r0;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends bd.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final be.b f23494l = new be.b(o.f22908k, be.e.e("Function"));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final be.b f23495m = new be.b(o.f22906i, be.e.e("KFunction"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final re.l f23496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f23497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f23498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f23500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f23501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f23502k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(re.l lVar, pe.c cVar, k kVar, int i10) {
        super(lVar, kVar.a(i10));
        jc.l.e(cVar, "containingDeclaration");
        this.f23496e = lVar;
        this.f23497f = cVar;
        this.f23498g = kVar;
        this.f23499h = i10;
        this.f23500i = new b(this);
        this.f23501j = new e(lVar, this);
        ArrayList arrayList = new ArrayList();
        oc.d dVar = new oc.d(1, i10, 1);
        ArrayList arrayList2 = new ArrayList(n.K(dVar, 10));
        oc.c it = dVar.iterator();
        while (it.f16312c) {
            arrayList.add(w0.G1(this, x0.IN_VARIANCE, be.e.e("P" + it.nextInt()), arrayList.size(), this.f23496e));
            arrayList2.add(a0.f21526a);
        }
        arrayList.add(w0.G1(this, x0.OUT_VARIANCE, be.e.e("R"), arrayList.size(), this.f23496e));
        this.f23502k = vb.m.G0(arrayList);
        k kVar2 = this.f23498g;
        d.f23503a.getClass();
        jc.l.e(kVar2, "functionTypeKind");
        if (kVar2.equals(g.f23505c) || kVar2.equals(j.f23508c) || kVar2.equals(h.f23506c)) {
            return;
        }
        kVar2.equals(i.f23507c);
    }

    @Override // yc.e
    public final r0 J0() {
        return null;
    }

    @Override // yc.e, yc.i
    public final List L() {
        return this.f23502k;
    }

    @Override // yc.w
    public final boolean O0() {
        return false;
    }

    @Override // yc.w
    public final boolean P() {
        return false;
    }

    @Override // yc.h
    public final k0 Q() {
        return this.f23500i;
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
    public final /* bridge */ /* synthetic */ Collection T() {
        return r.f22819a;
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
        return false;
    }

    @Override // yc.e, yc.w, yc.n
    public final ld.o f() {
        ld.o oVar = yc.o.f26129e;
        jc.l.d(oVar, "PUBLIC");
        return oVar;
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        return zc.g.f26696a;
    }

    @Override // bd.e0
    public final le.o i(te.f fVar) {
        return this.f23501j;
    }

    @Override // yc.e
    public final yc.f j() {
        return yc.f.f26110b;
    }

    @Override // yc.e
    public final /* bridge */ /* synthetic */ bd.l j0() {
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

    @Override // yc.l
    public final m0 m() {
        return m0.p0;
    }

    @Override // yc.e, yc.w
    public final x s() {
        return x.f26158e;
    }

    public final String toString() {
        String strB = getName().b();
        jc.l.d(strB, "asString(...)");
        return strB;
    }

    @Override // yc.e
    public final boolean w() {
        return false;
    }

    @Override // yc.k
    public final yc.k y() {
        return this.f23497f;
    }
}
