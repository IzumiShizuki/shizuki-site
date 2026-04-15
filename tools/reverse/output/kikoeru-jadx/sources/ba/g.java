package ba;

import bg.e2;
import com.cnl.kikoeru.R;
import java.util.ArrayList;
import java.util.Iterator;
import m0.i5;
import m0.n3;
import m0.z8;
import y.j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ic.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.a f2360b;

    public /* synthetic */ g(int i10, ic.a aVar) {
        this.f2359a = i10;
        this.f2360b = aVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        i2.i iVar;
        i2.h hVar;
        g gVar = this;
        switch (gVar.f2359a) {
            case 0:
                x0.o oVar = (x0.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j1.g gVar2 = j1.c.f9672k;
                j1.f fVar = j1.c.f9674m;
                jc.l.e((y.w) obj, "$this$DropdownMenu");
                if (oVar.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    j1 j1VarA = y.i1.a(y.k.f25156a, j1.c.f9671j, oVar, 0);
                    int iQ = x0.v.q(oVar);
                    x0.j1 j1VarL = oVar.l();
                    j1.n nVar = j1.n.f9689a;
                    j1.q qVarC = j1.a.c(nVar, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar2 = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar2);
                    } else {
                        oVar.k0();
                    }
                    i2.h hVar2 = i2.j.f8738g;
                    x0.v.A(hVar2, j1VarA, oVar);
                    i2.h hVar3 = i2.j.f8737f;
                    x0.v.A(hVar3, j1VarL, oVar);
                    i2.h hVar4 = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar, iQ, hVar4);
                    }
                    i2.h hVar5 = i2.j.f8735d;
                    x0.v.A(hVar5, qVarC, oVar);
                    y.v vVarA = y.u.a(y.k.f25158c, fVar, oVar, 0);
                    int iQ2 = x0.v.q(oVar);
                    x0.j1 j1VarL2 = oVar.l();
                    j1.q qVarC2 = j1.a.c(nVar, oVar);
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar2);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(hVar2, vVarA, oVar);
                    x0.v.A(hVar3, j1VarL2, oVar);
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                        j2.h0.s(iQ2, oVar, iQ2, hVar4);
                    }
                    x0.v.A(hVar5, qVarC2, oVar);
                    oVar.W(1759061135);
                    Iterator it = na.o.f15728a.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        ic.a aVar = gVar.f2360b;
                        x0.r0 r0Var = x0.k.f24334a;
                        if (zHasNext) {
                            ub.k kVar = (ub.k) it.next();
                            bg.u uVar = (bg.u) kVar.f21543a;
                            String str = (String) kVar.f21544b;
                            y.g gVarG = y.k.g(5);
                            boolean z10 = b0.b() == uVar;
                            q2.h hVar6 = new q2.h(3);
                            boolean zD = oVar.d(uVar.ordinal()) | oVar.f(aVar);
                            Object objK = oVar.K();
                            if (zD || objK == r0Var) {
                                objK = new a9.d(1, uVar, aVar);
                                oVar.h0(objK);
                            }
                            j1.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.selection.c.b(z10, hVar6, (ic.a) objK), 13);
                            j1 j1VarA2 = y.i1.a(gVarG, gVar2, oVar, 54);
                            int iQ3 = x0.v.q(oVar);
                            x0.j1 j1VarL3 = oVar.l();
                            j1.q qVarC3 = j1.a.c(qVarJ, oVar);
                            i2.k.f8771g0.getClass();
                            i2.i iVar3 = i2.j.f8733b;
                            oVar.a0();
                            if (oVar.S) {
                                oVar.k(iVar3);
                            } else {
                                oVar.k0();
                            }
                            x0.v.A(i2.j.f8738g, j1VarA2, oVar);
                            x0.v.A(i2.j.f8737f, j1VarL3, oVar);
                            i2.h hVar7 = i2.j.f8741j;
                            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ3))) {
                                j2.h0.s(iQ3, oVar, iQ3, hVar7);
                            }
                            x0.v.A(i2.j.f8735d, qVarC3, oVar);
                            x0.o oVar2 = oVar;
                            i5.a(b0.b() == uVar, null, false, null, oVar2, 48, 60);
                            z8.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar2, 0, 0, 131070);
                            oVar = oVar2;
                            oVar.p(true);
                            gVar = this;
                            it = it;
                            fVar = fVar;
                            gVar2 = gVar2;
                            nVar = nVar;
                        } else {
                            j1.g gVar3 = gVar2;
                            j1.f fVar2 = fVar;
                            j1.n nVar2 = nVar;
                            oVar.p(false);
                            float f10 = 5;
                            y.g gVarG2 = y.k.g(f10);
                            boolean zC = b0.c();
                            q2.h hVar8 = new q2.h(1);
                            boolean zF = oVar.f(aVar);
                            Object objK2 = oVar.K();
                            if (zF || objK2 == r0Var) {
                                objK2 = new j(0, aVar);
                                oVar.h0(objK2);
                            }
                            float f11 = 16;
                            j1.q qVarJ2 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.selection.c.b(zC, hVar8, (ic.a) objK2), f11);
                            j1 j1VarA3 = y.i1.a(gVarG2, gVar3, oVar, 54);
                            int iQ4 = x0.v.q(oVar);
                            x0.j1 j1VarL4 = oVar.l();
                            j1.q qVarC4 = j1.a.c(qVarJ2, oVar);
                            i2.k.f8771g0.getClass();
                            i2.i iVar4 = i2.j.f8733b;
                            oVar.a0();
                            if (oVar.S) {
                                oVar.k(iVar4);
                            } else {
                                oVar.k0();
                            }
                            i2.h hVar9 = i2.j.f8738g;
                            x0.v.A(hVar9, j1VarA3, oVar);
                            i2.h hVar10 = i2.j.f8737f;
                            x0.v.A(hVar10, j1VarL4, oVar);
                            i2.h hVar11 = i2.j.f8741j;
                            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ4))) {
                                j2.h0.s(iQ4, oVar, iQ4, hVar11);
                            }
                            i2.h hVar12 = i2.j.f8735d;
                            x0.v.A(hVar12, qVarC4, oVar);
                            m0.z0.a(b0.c(), null, null, false, null, oVar, 48, 60);
                            x0.o oVar3 = oVar;
                            z8.b(na.q.g(R.string.subtitle), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar3, 0, 0, 131070);
                            oVar3.p(true);
                            y.g gVarG3 = y.k.g(f10);
                            fg.f fVar3 = b0.f2308d;
                            boolean zBooleanValue = ((Boolean) fVar3.getValue()).booleanValue();
                            q2.h hVar13 = new q2.h(1);
                            boolean zF2 = oVar3.f(aVar);
                            Object objK3 = oVar3.K();
                            if (zF2 || objK3 == r0Var) {
                                objK3 = new j(1, aVar);
                                oVar3.h0(objK3);
                            }
                            j1.q qVarJ3 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.selection.c.b(zBooleanValue, hVar13, (ic.a) objK3), f11);
                            j1 j1VarA4 = y.i1.a(gVarG3, gVar3, oVar3, 54);
                            int iQ5 = x0.v.q(oVar3);
                            x0.j1 j1VarL5 = oVar3.l();
                            j1.q qVarC5 = j1.a.c(qVarJ3, oVar3);
                            oVar3.a0();
                            if (oVar3.S) {
                                iVar = iVar4;
                                oVar3.k(iVar);
                            } else {
                                iVar = iVar4;
                                oVar3.k0();
                            }
                            x0.v.A(hVar9, j1VarA4, oVar3);
                            x0.v.A(hVar10, j1VarL5, oVar3);
                            if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ5))) {
                                hVar = hVar11;
                                j2.h0.s(iQ5, oVar3, iQ5, hVar);
                            } else {
                                hVar = hVar11;
                            }
                            x0.v.A(hVar12, qVarC5, oVar3);
                            m0.z0.a(((Boolean) fVar3.getValue()).booleanValue(), null, null, false, null, oVar3, 48, 60);
                            i2.i iVar5 = iVar;
                            i2.h hVar14 = hVar;
                            ic.a aVar2 = aVar;
                            x0.r0 r0Var2 = r0Var;
                            z8.b(na.q.g(R.string.translate), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar3, 0, 0, 131070);
                            oVar3.p(true);
                            oVar3.p(true);
                            y.v vVarA2 = y.u.a(y.k.f25158c, fVar2, oVar3, 0);
                            int iQ6 = x0.v.q(oVar3);
                            x0.j1 j1VarL6 = oVar3.l();
                            j1.q qVarC6 = j1.a.c(nVar2, oVar3);
                            oVar3.a0();
                            if (oVar3.S) {
                                oVar3.k(iVar5);
                            } else {
                                oVar3.k0();
                            }
                            x0.v.A(hVar9, vVarA2, oVar3);
                            x0.v.A(hVar10, j1VarL6, oVar3);
                            if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ6))) {
                                j2.h0.s(iQ6, oVar3, iQ6, hVar14);
                            }
                            x0.v.A(hVar12, qVarC6, oVar3);
                            oVar3.W(-1466572517);
                            ArrayList arrayList = na.o.f15729b;
                            ArrayList<ub.k> arrayList2 = new ArrayList();
                            for (Object obj4 : arrayList) {
                                e2 e2Var = (e2) ((ub.k) obj4).f21543a;
                                if (g9.a.b()) {
                                    if (e2Var != e2.f2878c) {
                                        arrayList2.add(obj4);
                                    }
                                } else if (e2Var != e2.f2877b) {
                                    arrayList2.add(obj4);
                                }
                            }
                            for (ub.k kVar2 : arrayList2) {
                                e2 e2Var2 = (e2) kVar2.f21543a;
                                String str2 = (String) kVar2.f21544b;
                                ic.a aVar3 = aVar2;
                                boolean zD2 = oVar3.d(e2Var2.ordinal()) | oVar3.f(aVar3);
                                Object objK4 = oVar3.K();
                                x0.r0 r0Var3 = r0Var2;
                                if (zD2 || objK4 == r0Var3) {
                                    objK4 = new a9.d(2, e2Var2, aVar3);
                                    oVar3.h0(objK4);
                                }
                                m0.b0.b((ic.a) objK4, null, false, null, f1.g.f(765768677, new k(0, e2Var2, str2), oVar3), oVar3, 196608, 30);
                                aVar2 = aVar3;
                                r0Var2 = r0Var3;
                            }
                            oVar3.p(false);
                            oVar3.p(true);
                            oVar3.p(true);
                        }
                    }
                } else {
                    oVar.Q();
                }
                break;
            default:
                x0.o oVar4 = (x0.o) obj2;
                ((Integer) obj3).getClass();
                jc.l.e((q.u) obj, "$this$AnimatedVisibility");
                n3.a(gVar.f2360b, null, null, ((m0.b1) oVar4.j(m0.c1.f12773a)).f(), 0L, null, ka.b.f11240b, oVar4, 12582912, 110);
                break;
        }
        return ub.a0.f21526a;
    }
}
