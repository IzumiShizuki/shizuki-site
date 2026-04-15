package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o.k0 f25206a = c(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o.k0 f25207b = c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f25208c = new s(j1.c.f9662a, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f25209d = o.f25199b;

    public static final void a(j1.q qVar, x0.o oVar, int i10) {
        oVar.Y(-211209833);
        int i11 = (oVar.f(qVar) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            int iQ = x0.v.q(oVar);
            j1.q qVarC = j1.a.c(qVar, oVar);
            x0.j1 j1VarL = oVar.l();
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, f25209d, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            x0.v.A(i2.j.f8735d, qVarC, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                j2.h0.s(iQ, oVar, iQ, hVar);
            }
            oVar.p(true);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new cg.d(i10, 19, qVar);
        }
    }

    public static final void b(g2.f1 f1Var, g2.g1 g1Var, g2.u0 u0Var, f3.m mVar, int i10, int i11, j1.d dVar) {
        j1.d dVar2;
        Object objA = u0Var.A();
        m mVar2 = objA instanceof m ? (m) objA : null;
        g2.f1.j(f1Var, g1Var, ((mVar2 == null || (dVar2 = mVar2.f25168o) == null) ? dVar : dVar2).a((((long) g1Var.f7180a) << 32) | (((long) g1Var.f7181b) & 4294967295L), (((long) i10) << 32) | (((long) i11) & 4294967295L), mVar));
    }

    public static final o.k0 c(boolean z10) {
        o.k0 k0Var = new o.k0(9);
        j1.h hVar = j1.c.f9662a;
        k0Var.m(hVar, new s(hVar, z10));
        j1.h hVar2 = j1.c.f9663b;
        k0Var.m(hVar2, new s(hVar2, z10));
        j1.h hVar3 = j1.c.f9664c;
        k0Var.m(hVar3, new s(hVar3, z10));
        j1.h hVar4 = j1.c.f9665d;
        k0Var.m(hVar4, new s(hVar4, z10));
        j1.h hVar5 = j1.c.f9666e;
        k0Var.m(hVar5, new s(hVar5, z10));
        j1.h hVar6 = j1.c.f9667f;
        k0Var.m(hVar6, new s(hVar6, z10));
        j1.h hVar7 = j1.c.f9668g;
        k0Var.m(hVar7, new s(hVar7, z10));
        j1.h hVar8 = j1.c.f9669h;
        k0Var.m(hVar8, new s(hVar8, z10));
        j1.h hVar9 = j1.c.f9670i;
        k0Var.m(hVar9, new s(hVar9, z10));
        return k0Var;
    }

    public static final g2.v0 d(j1.h hVar, boolean z10) {
        g2.v0 v0Var = (g2.v0) (z10 ? f25206a : f25207b).g(hVar);
        return v0Var == null ? new s(hVar, z10) : v0Var;
    }

    public static final s e(j1.h hVar, x0.o oVar, int i10) {
        if (hVar.equals(j1.c.f9662a)) {
            oVar.W(-1709785313);
            oVar.p(false);
            return f25208c;
        }
        oVar.W(-1709737635);
        boolean zG = ((((i10 & 14) ^ 6) > 4 && oVar.f(hVar)) || (i10 & 6) == 4) | oVar.g(false);
        Object objK = oVar.K();
        if (zG || objK == x0.k.f24334a) {
            objK = new s(hVar, false);
            oVar.h0(objK);
        }
        s sVar = (s) objK;
        oVar.p(false);
        return sVar;
    }
}
