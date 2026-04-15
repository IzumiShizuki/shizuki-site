package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y.r1 f12966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y.d1 f12967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.f f12968d;

    public /* synthetic */ f0(y.r1 r1Var, y.d1 d1Var, f1.f fVar, int i10) {
        this.f12965a = i10;
        this.f12966b = r1Var;
        this.f12967c = d1Var;
        this.f12968d = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        int i10 = this.f12965a;
        ub.a0 a0Var = ub.a0.f21526a;
        f1.f fVar = this.f12968d;
        y.d1 d1Var = this.f12967c;
        y.r1 r1Var = this.f12966b;
        switch (i10) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                } else {
                    j1.q qVarC = androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f);
                    h2.g gVar = y.u1.f25267a;
                    j1.q qVarD = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.a.i(j1.a.a(qVarC, new cg.m0(10, r1Var)), d1Var), i0.f13080a);
                    y.j1 j1VarA = y.i1.a(y.k.f25156a, j1.c.f9672k, oVar, 54);
                    int iQ = x0.v.q(oVar);
                    x0.j1 j1VarL = oVar.l();
                    j1.q qVarC2 = j1.a.c(qVarD, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(i2.j.f8738g, j1VarA, oVar);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC2, oVar);
                    fVar.g(y.l1.f25167a, oVar, 6);
                    oVar.p(true);
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                } else {
                    x0.z zVar = h1.f13043a;
                    long j10 = ((q1.q) oVar2.j(j1.f13125a)).f17577a;
                    x0.v.a(zVar.a(Float.valueOf((!((b1) oVar2.j(c1.f12773a)).j() ? ((double) q1.h0.r(j10)) < 0.5d : ((double) q1.h0.r(j10)) > 0.5d) ? 0.6f : 0.74f)), f1.g.f(597057613, new f0(r1Var, d1Var, fVar, null == true ? 1 : 0), oVar2), oVar2, 56);
                }
                break;
        }
        return a0Var;
    }
}
