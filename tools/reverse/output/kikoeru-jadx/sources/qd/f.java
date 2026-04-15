package qd;

import java.util.ArrayList;
import java.util.List;
import jc.l;
import le.o;
import m0.w;
import se.a0;
import se.f0;
import se.h0;
import se.k0;
import se.n0;
import se.p0;
import se.s0;
import se.x0;
import ub.k;
import vb.n;
import vc.i;
import yc.q0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f18154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f18155d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f18156b = new w(new e());

    static {
        s0 s0Var = s0.f19985b;
        f18154c = a.a(n7.e.F(s0Var, false, null, 5), b.f18146c, false, null, null, 61);
        f18155d = a.a(n7.e.F(s0Var, false, null, 5), b.f18145b, false, null, null, 61);
    }

    @Override // se.p0
    public final n0 d(se.w wVar) {
        return new f0(h(wVar, new a(s0.f19985b, false, false, null, 62)));
    }

    public final k g(a0 a0Var, yc.e eVar, a aVar) {
        if (a0Var.t().o().isEmpty()) {
            return new k(a0Var, Boolean.FALSE);
        }
        if (i.y(a0Var)) {
            n0 n0Var = (n0) a0Var.q().get(0);
            x0 x0VarA = n0Var.a();
            se.w wVarB = n0Var.b();
            l.d(wVarB, "getType(...)");
            return new k(se.c.v(ud.b.w(new f0(h(wVarB, aVar), x0VarA)), a0Var.r(), a0Var.t(), a0Var.u()), Boolean.FALSE);
        }
        if (se.c.l(a0Var)) {
            return new k(ue.l.c(ue.k.ERROR_RAW_TYPE, a0Var.t().toString()), Boolean.FALSE);
        }
        o oVarF0 = eVar.f0(this);
        l.d(oVarF0, "getMemberScope(...)");
        h0 h0VarR = a0Var.r();
        k0 k0VarQ = eVar.Q();
        l.d(k0VarQ, "getTypeConstructor(...)");
        List listO = eVar.Q().o();
        l.d(listO, "getParameters(...)");
        List<q0> list = listO;
        ArrayList arrayList = new ArrayList(n.K(list, 10));
        for (q0 q0Var : list) {
            l.b(q0Var);
            w wVar = this.f18156b;
            arrayList.add(e.a(q0Var, aVar, wVar, wVar.B(q0Var, aVar)));
        }
        return new k(se.c.x(h0VarR, k0VarQ, arrayList, a0Var.u(), oVarF0, new bd.a(eVar, this, a0Var, aVar)), Boolean.TRUE);
    }

    public final se.w h(se.w wVar, a aVar) {
        yc.h hVarH = wVar.t().h();
        if (hVarH instanceof q0) {
            aVar.getClass();
            return h(this.f18156b.B((q0) hVarH, a.a(aVar, null, true, null, null, 59)), aVar);
        }
        if (!(hVarH instanceof yc.e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + hVarH).toString());
        }
        yc.h hVarH2 = se.c.G(wVar).t().h();
        if (hVarH2 instanceof yc.e) {
            k kVarG = g(se.c.n(wVar), (yc.e) hVarH, f18154c);
            a0 a0Var = (a0) kVarG.f21543a;
            boolean zBooleanValue = ((Boolean) kVarG.f21544b).booleanValue();
            k kVarG2 = g(se.c.G(wVar), (yc.e) hVarH2, f18155d);
            a0 a0Var2 = (a0) kVarG2.f21543a;
            return (zBooleanValue || ((Boolean) kVarG2.f21544b).booleanValue()) ? new h(a0Var, a0Var2) : se.c.g(a0Var, a0Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + hVarH2 + "\" while for lower it's \"" + hVarH + '\"').toString());
    }
}
