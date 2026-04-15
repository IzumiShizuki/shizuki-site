package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r.q1 f17244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.k f17246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f17247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h1.s f17248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.f f17249g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r.q1 q1Var, Object obj, ic.k kVar, m mVar, h1.s sVar, f1.f fVar) {
        super(2);
        this.f17244b = q1Var;
        this.f17245c = obj;
        this.f17246d = kVar;
        this.f17247e = mVar;
        this.f17248f = sVar;
        this.f17249g = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        x0.o oVar = (x0.o) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objK = oVar.K();
            ic.k kVar = this.f17246d;
            m mVar = this.f17247e;
            x0.r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = (b0) kVar.a(mVar);
                oVar.h0(objK);
            }
            b0 b0Var = (b0) objK;
            r.q1 q1Var = this.f17244b;
            r.k1 k1VarF = q1Var.f();
            x0.e1 e1Var = q1Var.f18542d;
            Object objC = k1VarF.c();
            Object obj3 = this.f17245c;
            boolean zG = oVar.g(jc.l.a(objC, obj3));
            Object objK2 = oVar.K();
            if (zG || objK2 == r0Var) {
                objK2 = jc.l.a(q1Var.f().c(), obj3) ? r0.f17434b : ((b0) kVar.a(mVar)).f17236b;
                oVar.h0(objK2);
            }
            r0 r0Var2 = (r0) objK2;
            Object objK3 = oVar.K();
            if (objK3 == r0Var) {
                objK3 = new i(jc.l.a(obj3, e1Var.getValue()));
                oVar.h0(objK3);
            }
            i iVar = (i) objK3;
            q0 q0Var = b0Var.f17235a;
            boolean zH = oVar.h(b0Var);
            Object objK4 = oVar.K();
            if (zH || objK4 == r0Var) {
                objK4 = new cg.m0(7, b0Var);
                oVar.h0(objK4);
            }
            j1.q qVarB = androidx.compose.ui.layout.a.b(j1.n.f9689a, (ic.o) objK4);
            iVar.f17328a.setValue(Boolean.valueOf(jc.l.a(obj3, e1Var.getValue())));
            j1.q qVarE = qVarB.e(iVar);
            boolean zH2 = oVar.h(obj3);
            Object objK5 = oVar.K();
            if (zH2 || objK5 == r0Var) {
                objK5 = new a0.f0(28, obj3);
                oVar.h0(objK5);
            }
            ic.k kVar2 = (ic.k) objK5;
            boolean zF = oVar.f(r0Var2);
            Object objK6 = oVar.K();
            if (zF || objK6 == r0Var) {
                objK6 = new cg.d(15, r0Var2);
                oVar.h0(objK6);
            }
            androidx.compose.animation.b.a(this.f17244b, kVar2, qVarE, q0Var, r0Var2, (ic.n) objK6, f1.g.f(-616195562, new h0.e1(this.f17248f, obj3, mVar, this.f17249g, 1), oVar), oVar, 12582912);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
