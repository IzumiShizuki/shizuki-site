package qd;

import de.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jc.l;
import le.o;
import se.a0;
import se.h0;
import se.n0;
import se.q;
import se.w;
import se.w0;
import ub.k;
import vb.m;
import vb.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a0 a0Var, a0 a0Var2) {
        super(a0Var, a0Var2);
        l.e(a0Var, "lowerBound");
        l.e(a0Var2, "upperBound");
        te.d.f20724a.b(a0Var, a0Var2);
    }

    public static final ArrayList G(i iVar, w wVar) throws IOException {
        List<n0> listQ = wVar.q();
        ArrayList arrayList = new ArrayList(n.K(listQ, 10));
        for (n0 n0Var : listQ) {
            l.e(n0Var, "typeProjection");
            StringBuilder sb = new StringBuilder();
            m.e0(ud.b.w(n0Var), sb, ", ", null, null, new de.g(iVar, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String H(String str, String str2) {
        if (!ef.n.o0(str, '<')) {
            return str;
        }
        return ef.n.S0('<', str) + '<' + str2 + '>' + ef.n.Q0('>', str, str);
    }

    @Override // se.w0
    public final w0 B(te.f fVar) {
        l.e(fVar, "kotlinTypeRefiner");
        a0 a0Var = this.f19978b;
        l.e(a0Var, "type");
        a0 a0Var2 = this.f19979c;
        l.e(a0Var2, "type");
        return new h(a0Var, a0Var2);
    }

    @Override // se.w0
    public final w0 C(h0 h0Var) {
        l.e(h0Var, "newAttributes");
        return new h(this.f19978b.C(h0Var), this.f19979c.C(h0Var));
    }

    @Override // se.q
    public final a0 D() {
        return this.f19978b;
    }

    @Override // se.q
    public final String F(i iVar, i iVar2) throws IOException {
        a0 a0Var = this.f19978b;
        String strV = iVar.V(a0Var);
        a0 a0Var2 = this.f19979c;
        String strV2 = iVar.V(a0Var2);
        if (iVar2.f5909a.l()) {
            return "raw (" + strV + ".." + strV2 + ')';
        }
        if (a0Var2.q().isEmpty()) {
            return iVar.D(strV, strV2, ud.e.w(this));
        }
        ArrayList arrayListG = G(iVar, a0Var);
        ArrayList arrayListG2 = G(iVar, a0Var2);
        String strF0 = m.f0(arrayListG, ", ", null, null, g.f18157a, 30);
        ArrayList<k> arrayListM0 = m.M0(arrayListG, arrayListG2);
        if (arrayListM0.isEmpty()) {
            strV2 = H(strV2, strF0);
        } else {
            for (k kVar : arrayListM0) {
                String str = (String) kVar.f21543a;
                String str2 = (String) kVar.f21544b;
                if (!l.a(str, ef.n.F0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
            strV2 = H(strV2, strF0);
        }
        String strH = H(strV, strF0);
        return l.a(strH, strV2) ? strH : iVar.D(strH, strV2, ud.e.w(this));
    }

    @Override // se.q, se.w
    public final o n0() {
        yc.h hVarH = t().h();
        yc.e eVar = hVarH instanceof yc.e ? (yc.e) hVarH : null;
        if (eVar != null) {
            o oVarF0 = eVar.f0(new f());
            l.d(oVarF0, "getMemberScope(...)");
            return oVarF0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + t().h()).toString());
    }

    @Override // se.w
    public final w v(te.f fVar) {
        l.e(fVar, "kotlinTypeRefiner");
        a0 a0Var = this.f19978b;
        l.e(a0Var, "type");
        a0 a0Var2 = this.f19979c;
        l.e(a0Var2, "type");
        return new h(a0Var, a0Var2);
    }

    @Override // se.w0
    public final w0 z(boolean z10) {
        return new h(this.f19978b.z(z10), this.f19979c.z(z10));
    }
}
