package q;

import androidx.compose.animation.SharedBoundsNodeElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f17384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r.q1 f17385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1 f17386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f17387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f17388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(l1 l1Var, r.q1 q1Var, q1 q1Var2, s1 s1Var, r1 r1Var) {
        super(3);
        this.f17384b = l1Var;
        this.f17385c = q1Var;
        this.f17386d = q1Var2;
        this.f17387e = s1Var;
        this.f17388f = r1Var;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        r.q1 q1VarE;
        j1.q qVar = (j1.q) obj;
        x0.o oVar = (x0.o) obj2;
        ((Number) obj3).intValue();
        r rVar = r.f17432l;
        oVar.W(-1843478929);
        l1 l1Var = this.f17384b;
        Object obj4 = l1Var.f17358a;
        oVar.U(-359689844, obj4);
        Object objK = oVar.K();
        q1 q1Var = this.f17386d;
        x0.r0 r0Var = x0.k.f24334a;
        if (objK == r0Var) {
            o.k0 k0Var = q1Var.f17422j;
            g1 g1Var = (g1) k0Var.g(obj4);
            if (g1Var == null) {
                g1Var = new g1(obj4, q1Var);
                k0Var.m(obj4, g1Var);
            }
            objK = g1Var;
            oVar.h0(objK);
        }
        g1 g1Var2 = (g1) objK;
        r.q1 q1Var2 = this.f17385c;
        oVar.U(-359686031, q1Var2);
        if (q1Var2 != null) {
            androidx.lifecycle.q qVar2 = q1Var2.f18539a;
            oVar.W(1734686048);
            String string = obj4.toString();
            boolean zF = oVar.f(q1Var2);
            Object objK2 = oVar.K();
            if (zF || objK2 == r0Var) {
                objK2 = qVar2.b1();
                oVar.h0(objK2);
            }
            if (q1Var2.g()) {
                objK2 = qVar2.b1();
            }
            oVar.W(1329676753);
            Boolean bool = (Boolean) rVar.a(objK2);
            oVar.p(false);
            Object value = q1Var2.f18542d.getValue();
            oVar.W(1329676753);
            Boolean bool2 = (Boolean) rVar.a(value);
            oVar.p(false);
            q1VarE = r.t1.b(q1Var2, bool, bool2, string, oVar, 0);
            oVar = oVar;
            oVar.p(false);
        } else {
            oVar.W(1734936683);
            boolean z10 = true;
            jc.c0.c(1, rVar);
            Boolean bool3 = (Boolean) rVar.a(ub.a0.f21526a);
            boolean zBooleanValue = bool3.booleanValue();
            Object objK3 = oVar.K();
            if (objK3 == r0Var) {
                if (g1Var2.a() == null) {
                    z10 = zBooleanValue;
                } else if (zBooleanValue) {
                    z10 = false;
                }
                objK3 = new r.i0(Boolean.valueOf(z10));
                oVar.h0(objK3);
            }
            r.i0 i0Var = (r.i0) objK3;
            i0Var.f18457c.setValue(bool3);
            q1VarE = r.t1.e(i0Var, null, oVar, 0, 2);
            oVar.p(false);
        }
        r.q1 q1Var3 = q1VarE;
        oVar.U(-359623378, Boolean.valueOf(q1Var.g()));
        r.j1 j1VarC = r.t1.c(q1Var3, r.w1.f18628i, null, oVar, 0, 2);
        oVar.p(false);
        boolean zF2 = oVar.f(q1Var3);
        Object objK4 = oVar.K();
        r1 r1Var = this.f17388f;
        if (zF2 || objK4 == r0Var) {
            objK4 = new x(q1Var, q1Var3, j1VarC, r1Var);
            oVar.h0(objK4);
        }
        x xVar = (x) objK4;
        if (!jc.l.a((r.j1) xVar.f17473c.getValue(), j1VarC)) {
            xVar.f17473c.setValue(j1VarC);
            xVar.f17476f.setValue(null);
            xVar.f17475e = y.f17478a;
        }
        xVar.f17474d.setValue(r1Var);
        oVar.p(false);
        Object objK5 = oVar.K();
        s1 s1Var = this.f17387e;
        if (objK5 == r0Var) {
            objK5 = new h1(g1Var2, xVar, s1Var, l1Var);
            oVar.h0(objK5);
        }
        h1 h1Var = (h1) objK5;
        l1Var.f17359b.setValue(h1Var);
        h1Var.f17318d.setValue(g1Var2);
        x0.e1 e1Var = h1Var.f17321g;
        Boolean bool4 = Boolean.TRUE;
        e1Var.setValue(bool4);
        h1Var.f17319e.setValue(xVar);
        h1Var.f17320f.setValue(i1.f17335b);
        h1Var.f17322h.setValue(s1Var);
        h1Var.f17316b.f(0.0f);
        h1Var.f17317c.setValue(bool4);
        h1Var.f17323i.setValue(l1Var);
        oVar.p(false);
        j1.q qVarE = qVar.e(new SharedBoundsNodeElement(h1Var));
        oVar.p(false);
        return qVarE;
    }
}
