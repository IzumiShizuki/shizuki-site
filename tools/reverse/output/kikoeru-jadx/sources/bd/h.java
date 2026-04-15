package bd;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends q implements yc.p0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final re.o f2571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ld.o f2572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f2573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f2574h;

    static {
        jc.z.f10839a.g(new jc.s(h.class, "constructors", "getConstructors()Ljava/util/Collection;", 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(re.o oVar, yc.k kVar, zc.h hVar, be.e eVar, ld.o oVar2) {
        super(kVar, hVar, eVar, yc.m0.p0);
        jc.l.e(oVar, "storageManager");
        jc.l.e(kVar, "containingDeclaration");
        jc.l.e(oVar2, "visibilityImpl");
        this.f2571e = oVar;
        this.f2572f = oVar2;
        ((re.l) oVar).a(new e(0, this));
        this.f2574h = new g(this);
    }

    @Override // yc.i
    public final List L() {
        List list = this.f2573g;
        if (list != null) {
            return list;
        }
        jc.l.k("declaredTypeParametersImpl");
        throw null;
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
    public final se.k0 Q() {
        return this.f2574h;
    }

    @Override // bd.q, bd.p, yc.k, yc.b
    public final yc.h a() {
        return this;
    }

    @Override // yc.k
    public final Object a0(yc.m mVar, Object obj) {
        return mVar.B(this, obj);
    }

    @Override // yc.w
    public final boolean c0() {
        return false;
    }

    @Override // yc.i
    public final boolean d0() {
        return se.u0.c(((qe.s) this).F1(), new a(1, this), null);
    }

    @Override // yc.w, yc.n
    public final ld.o f() {
        return this.f2572f;
    }

    @Override // bd.p
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // bd.q, bd.p, yc.k, yc.b
    public final yc.k a() {
        return this;
    }

    @Override // bd.q
    /* JADX INFO: renamed from: C1 */
    public final yc.l a() {
        return this;
    }
}
