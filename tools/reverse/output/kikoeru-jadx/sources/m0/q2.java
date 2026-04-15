package m0;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t2 f13490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hf.y f13492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1.l0 f13494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f13495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f13496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f13497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f1.f f13498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ic.o f13499j;

    public q2(t2 t2Var, boolean z10, hf.y yVar, long j10, q1.l0 l0Var, long j11, long j12, float f10, f1.f fVar, ic.o oVar) {
        this.f13490a = t2Var;
        this.f13491b = z10;
        this.f13492c = yVar;
        this.f13493d = j10;
        this.f13494e = l0Var;
        this.f13495f = j11;
        this.f13496g = j12;
        this.f13497h = f10;
        this.f13498i = fVar;
        this.f13499j = oVar;
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
        y.t tVar = (y.t) obj;
        x0.o oVar = (x0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= oVar.f(tVar) ? 4 : 2;
        }
        if (oVar.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            long j10 = tVar.f25258b;
            if (!f3.a.d(j10)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            final float f10 = -f3.a.h(j10);
            x0.o2 o2Var = j2.l1.f9866h;
            final f3.c cVar = (f3.c) oVar.j(o2Var);
            final t2 t2Var = this.f13490a;
            boolean zF = oVar.f(t2Var) | oVar.f(cVar) | oVar.c(f10);
            Object objK = oVar.K();
            x0.r0 r0Var = x0.k.f24334a;
            if (zF || objK == r0Var) {
                objK = new ic.a() { // from class: m0.k2
                    @Override // ic.a
                    public final Object b() {
                        Object value;
                        t2 t2Var2 = t2Var;
                        t2Var2.f13650b = cVar;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(u2.f13690a, Float.valueOf(f10));
                        linkedHashMap.put(u2.f13691b, Float.valueOf(0.0f));
                        a4 a4Var = new a4(linkedHashMap);
                        x xVar = t2Var2.f13649a;
                        x0.a1 a1Var = xVar.f13854j;
                        x0.c0 c0Var = xVar.f13852h;
                        if (Float.isNaN(a1Var.e()) || (value = a4Var.a(xVar.f13854j.e())) == null) {
                            value = c0Var.getValue();
                        }
                        if (!jc.l.a(xVar.d(), a4Var)) {
                            xVar.f13857m.setValue(a4Var);
                            if (!xVar.i(value)) {
                                xVar.f13856l.setValue(value);
                            }
                        }
                        return ub.a0.f21526a;
                    }
                };
                oVar.h0(objK);
            }
            x0.v.h((ic.a) objK, oVar);
            boolean z10 = oVar.j(j2.l1.f9872n) == f3.m.f6668b;
            x xVar = t2Var.f13649a;
            boolean z11 = this.f13491b;
            j1.n nVar = j1.n.f9689a;
            j1.q qVarQ = a.a.q(nVar, xVar, u.e1.f20883b, z11, z10, 48);
            j1.h hVar = j1.c.f9662a;
            g2.v0 v0VarD = y.p.d(hVar, false);
            int iQ = x0.v.q(oVar);
            x0.j1 j1VarL = oVar.l();
            j1.q qVarC = j1.a.c(qVarQ, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            i2.h hVar2 = i2.j.f8738g;
            x0.v.A(hVar2, v0VarD, oVar);
            i2.h hVar3 = i2.j.f8737f;
            x0.v.A(hVar3, j1VarL, oVar);
            i2.h hVar4 = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar4);
            }
            i2.h hVar5 = i2.j.f8735d;
            x0.v.A(hVar5, qVarC, oVar);
            g2.v0 v0VarD2 = y.p.d(hVar, false);
            int iQ2 = x0.v.q(oVar);
            x0.j1 j1VarL2 = oVar.l();
            j1.q qVarC2 = j1.a.c(nVar, oVar);
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(hVar2, v0VarD2, oVar);
            x0.v.A(hVar3, j1VarL2, oVar);
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                j2.h0.s(iQ2, oVar, iQ2, hVar4);
            }
            x0.v.A(hVar5, qVarC2, oVar);
            this.f13498i.q(oVar, 0);
            oVar.p(true);
            boolean z12 = ((u2) t2Var.f13649a.f13851g.getValue()) == u2.f13691b;
            boolean z13 = this.f13491b;
            boolean zG = oVar.g(z13) | oVar.f(t2Var);
            hf.y yVar = this.f13492c;
            boolean zH = zG | oVar.h(yVar);
            Object objK2 = oVar.K();
            if (zH || objK2 == r0Var) {
                objK2 = new l2(z13, t2Var, yVar);
                oVar.h0(objK2);
            }
            ic.a aVar = (ic.a) objK2;
            boolean zC = oVar.c(f10) | oVar.f(t2Var);
            Object objK3 = oVar.K();
            if (zC || objK3 == r0Var) {
                objK3 = new ic.a() { // from class: m0.m2
                    @Override // ic.a
                    public final Object b() {
                        float f11 = t2Var.f13649a.f();
                        float f12 = s2.f13591a;
                        float f13 = f10;
                        float f14 = (f11 - f13) / (0.0f - f13);
                        float f15 = f14 >= 0.0f ? f14 : 0.0f;
                        if (f15 > 1.0f) {
                            f15 = 1.0f;
                        }
                        return Float.valueOf(f15);
                    }
                };
                oVar.h0(objK3);
            }
            s2.b(z12, aVar, (ic.a) objK3, this.f13493d, oVar, 0);
            String strN = a2.c.N(0, oVar);
            f3.c cVar2 = (f3.c) oVar.j(o2Var);
            j1.q qVarL = androidx.compose.foundation.layout.c.l(nVar, cVar2.I(f3.a.j(j10)), cVar2.I(f3.a.i(j10)), cVar2.I(f3.a.h(j10)), cVar2.I(f3.a.g(j10)));
            boolean zF2 = oVar.f(t2Var);
            Object objK4 = oVar.K();
            if (zF2 || objK4 == r0Var) {
                objK4 = new n2(t2Var, 0);
                oVar.h0(objK4);
            }
            j1.q qVarN = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.g(qVarL, (ic.k) objK4), 0.0f, 0.0f, s2.f13591a, 0.0f, 11);
            boolean zF3 = oVar.f(strN) | oVar.f(t2Var) | oVar.h(yVar);
            Object objK5 = oVar.K();
            if (zF3 || objK5 == r0Var) {
                objK5 = new ba.i(strN, t2Var, yVar, 6);
                oVar.h0(objK5);
            }
            android.support.v4.media.session.b.m(q2.m.a(qVarN, false, (ic.k) objK5), this.f13494e, this.f13495f, this.f13496g, null, this.f13497h, f1.g.f(1265707871, new p2(this.f13499j, 0), oVar), oVar, 1572864, 16);
            oVar.p(true);
        } else {
            oVar.Q();
        }
        return ub.a0.f21526a;
    }
}
