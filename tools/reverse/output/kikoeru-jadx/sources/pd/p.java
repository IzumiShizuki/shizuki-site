package pd;

import b0.w1;
import bd.j0;
import q.t0;
import r.y1;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f17064m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ed.y f17065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w1 f17066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final re.i f17067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f17068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final re.c f17069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zc.h f17070l;

    static {
        jc.s sVar = new jc.s(p.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f17064m = new pc.u[]{a0Var.g(sVar), t0.H(p.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0, a0Var)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(w1 w1Var, ed.y yVar) {
        jc.l.e(w1Var, "outerContext");
        od.a aVar = (od.a) w1Var.f1395c;
        super(aVar.f16329o, yVar.f6517a);
        this.f17065g = yVar;
        w1 w1VarF = n7.d.f(w1Var, this, null, 6);
        this.f17066h = w1VarF;
        aVar.f16318d.c().f16366c.getClass();
        yd.e eVar = yd.e.f26197g;
        od.a aVar2 = (od.a) w1VarF.f1395c;
        re.o oVar = aVar2.f16315a;
        o oVar2 = new o(this, 0);
        re.l lVar = (re.l) oVar;
        lVar.getClass();
        this.f17067i = new re.i(lVar, oVar2);
        this.f17068j = new d(w1VarF, yVar, this);
        o oVar3 = new o(this, 1);
        re.l lVar2 = (re.l) oVar;
        lVar2.getClass();
        this.f17069k = new re.c(lVar2, oVar3);
        this.f17070l = aVar2.f16336v.f1984b ? zc.g.f26696a : n7.e.z(w1VarF, yVar);
        ((re.l) oVar).a(new o(this, 2));
    }

    @Override // androidx.lifecycle.q, zc.a
    public final zc.h getAnnotations() {
        return this.f17070l;
    }

    @Override // bd.j0, bd.q, yc.l
    public final m0 m() {
        return new y1(15, this);
    }

    @Override // yc.d0
    public final le.o n0() {
        return this.f17068j;
    }

    @Override // bd.j0, bd.p
    public final String toString() {
        return "Lazy Java package fragment: " + this.f2596e + " of module " + ((od.a) this.f17066h.f1395c).f16329o;
    }
}
