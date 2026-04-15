package h0;

import j2.a2;
import j2.d3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(3);
        this.f7621b = i10;
        this.f7622c = obj;
        this.f7623d = obj2;
        this.f7624e = obj3;
        this.f7625f = obj4;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        Object objC;
        switch (this.f7621b) {
            case 0:
                j1.q qVar = (j1.q) obj;
                x0.o oVar = (x0.o) obj2;
                ((Number) obj3).intValue();
                u0 u0Var = (u0) this.f7623d;
                q1.n0 n0Var = (q1.n0) this.f7622c;
                y2.y yVar = (y2.y) this.f7624e;
                oVar.W(-84507373);
                boolean zBooleanValue = ((Boolean) oVar.j(j2.l1.f9881w)).booleanValue();
                boolean zG = oVar.g(zBooleanValue);
                Object objK = oVar.K();
                x0.r0 r0Var = x0.k.f24334a;
                if (zG || objK == r0Var) {
                    objK = new j0.h(zBooleanValue);
                    oVar.h0(objK);
                }
                j0.h hVar = (j0.h) objK;
                boolean z10 = n0Var.f17562a != 16;
                if (((Boolean) ((a2) ((d3) oVar.j(j2.l1.f9878t))).f9721a.getValue()).booleanValue() && u0Var.b() && t2.k0.b(yVar.f25435b) && z10) {
                    oVar.W(808460990);
                    t2.g gVar = yVar.f25434a;
                    t2.k0 k0Var = new t2.k0(yVar.f25435b);
                    boolean zH = oVar.h(hVar);
                    Object objK2 = oVar.K();
                    if (zH || objK2 == r0Var) {
                        objK2 = new ba.v0(4, hVar, null);
                        oVar.h0(objK2);
                    }
                    x0.v.f(gVar, k0Var, (ic.n) objK2, oVar);
                    boolean zF = oVar.f(yVar) | oVar.h(hVar) | oVar.h((y2.r) this.f7625f) | oVar.h(u0Var) | oVar.f(n0Var);
                    y2.r rVar = (y2.r) this.f7625f;
                    y2.y yVar2 = (y2.y) this.f7624e;
                    Object objK3 = oVar.K();
                    if (zF || objK3 == r0Var) {
                        d1 d1Var = new d1(hVar, rVar, yVar2, u0Var, n0Var, 0);
                        oVar.h0(d1Var);
                        objK3 = d1Var;
                    }
                    objC = androidx.compose.ui.draw.a.c(qVar, (ic.k) objK3);
                    oVar.p(false);
                } else {
                    oVar.W(810474750);
                    oVar.p(false);
                    objC = j1.n.f9689a;
                }
                oVar.p(false);
                return objC;
            default:
                q.u uVar = (q.u) obj;
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                h1.s sVar = (h1.s) this.f7622c;
                q.m mVar = (q.m) this.f7624e;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? oVar2.f(uVar) : oVar2.h(uVar) ? 4 : 2;
                }
                if (oVar2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zF2 = oVar2.f(sVar);
                    Object obj4 = this.f7623d;
                    boolean zH2 = zF2 | oVar2.h(obj4) | oVar2.h(mVar);
                    Object objK4 = oVar2.K();
                    x0.r0 r0Var2 = x0.k.f24334a;
                    if (zH2 || objK4 == r0Var2) {
                        objK4 = new cg.b(sVar, obj4, mVar, 12);
                        oVar2.h0(objK4);
                    }
                    x0.v.c(uVar, (ic.k) objK4, oVar2);
                    o.k0 k0Var2 = mVar.f17363d;
                    jc.l.c(uVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                    k0Var2.m(obj4, ((q.v) uVar).f17463b);
                    Object objK5 = oVar2.K();
                    if (objK5 == r0Var2) {
                        objK5 = new q.h(uVar);
                        oVar2.h0(objK5);
                    }
                    ((f1.f) this.f7625f).l((q.h) objK5, obj4, oVar2, 0);
                } else {
                    oVar2.Q();
                }
                return ub.a0.f21526a;
        }
    }
}
