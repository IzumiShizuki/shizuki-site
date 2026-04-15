package m0;

import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g7 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f13030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.k f13031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f13032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.f f13033d;

    public g7(Set set, ic.k kVar, c2 c2Var, f1.f fVar) {
        this.f13030a = set;
        this.f13031b = kVar;
        this.f13032c = c2Var;
        this.f13033d = fVar;
    }

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
    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        int i10;
        y.t tVar = (y.t) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.f(tVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fH = f3.a.h(tVar.f25258b);
            boolean z10 = oVar.j(j2.l1.f9872n) == f3.m.f6668b;
            Float fValueOf = Float.valueOf(0.0f);
            d2 d2Var = d2.f12847a;
            ub.k[] kVarArr = {new ub.k(fValueOf, d2Var)};
            LinkedHashMap linkedHashMap = new LinkedHashMap(vb.w.t(1));
            vb.w.y(linkedHashMap, kVarArr);
            Set set = this.f13030a;
            b2 b2Var = b2.f12718a;
            if (set.contains(b2Var)) {
                linkedHashMap.put(Float.valueOf(fH), d2.f12848b);
            }
            b2 b2Var2 = b2.f12719b;
            if (set.contains(b2Var2)) {
                linkedHashMap.put(Float.valueOf(-fH), d2.f12849c);
            }
            ic.k kVar = this.f13031b;
            boolean zF = oVar.f(kVar);
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (zF || objK == r0Var) {
                objK = new a9.r(12, kVar);
                oVar.h0(objK);
            }
            ic.n nVar = (ic.n) objK;
            float f10 = set.contains(b2Var2) ? 10.0f : 20.0f;
            float f11 = set.contains(b2Var) ? 10.0f : 20.0f;
            c2 c2Var = this.f13032c;
            k7 k7Var = new k7(linkedHashMap, this.f13032c, new j5(fH, f10, f11), nVar, i7.f13109b, c2Var.f12776c.getValue() == d2Var, z10);
            j1.n nVar2 = j1.n.f9689a;
            j1.q qVarA = j1.a.a(nVar2, k7Var);
            f1.f fVar = ka.b.f11242d;
            g2.v0 v0VarD = y.p.d(j1.c.f9662a, false);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarA, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            i2.h hVar = i2.j.f8738g;
            x0.v.A(hVar, v0VarD, oVar);
            i2.h hVar2 = i2.j.f8737f;
            x0.v.A(hVar2, j1VarL, oVar);
            i2.h hVar3 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar3);
            }
            i2.h hVar4 = i2.j.f8735d;
            x0.v.A(hVar4, qVarC, oVar);
            j1.q qVarB = androidx.compose.foundation.layout.b.f554a.b();
            y.o0 o0Var = y.k.f25156a;
            j1.g gVar = j1.c.f9671j;
            y.j1 j1VarA = y.i1.a(o0Var, gVar, oVar, 0);
            int iQ2 = x0.v.q(oVar);
            x0.j1 j1VarL2 = oVar.l();
            j1.q qVarC2 = j1.a.c(qVarB, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar, j1VarA, oVar);
            x0.v.A(hVar2, j1VarL2, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                j2.h0.s(iQ2, oVar, iQ2, hVar3);
            }
            x0.v.A(hVar4, qVarC2, oVar);
            y.l1 l1Var = y.l1.f25167a;
            fVar.g(l1Var, oVar, 6);
            oVar.p(true);
            boolean zF2 = oVar.f(c2Var);
            Object objK2 = oVar.K();
            if (zF2 || objK2 == r0Var) {
                i10 = 0;
                objK2 = new f7(c2Var, 0);
                oVar.h0(objK2);
            } else {
                i10 = 0;
            }
            j1.q qVarG = androidx.compose.foundation.layout.a.g(nVar2, (ic.k) objK2);
            y.j1 j1VarA2 = y.i1.a(o0Var, gVar, oVar, i10);
            int iQ3 = x0.v.q(oVar);
            x0.j1 j1VarL3 = oVar.l();
            j1.q qVarC3 = j1.a.c(qVarG, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar, j1VarA2, oVar);
            x0.v.A(hVar2, j1VarL3, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ3))) {
                j2.h0.s(iQ3, oVar, iQ3, hVar3);
            }
            x0.v.A(hVar4, qVarC3, oVar);
            this.f13033d.g(l1Var, oVar, 6);
            oVar.p(true);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
