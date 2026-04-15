package ye;

import bd.y0;
import java.util.Collection;
import java.util.List;
import se.a0;
import se.f0;
import se.h0;
import se.u0;
import yc.q0;
import yc.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f26233b = new k(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f26234c = new k(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26235a;

    public /* synthetic */ k(int i10) {
        this.f26235a = i10;
    }

    @Override // ye.e
    public final boolean a(nd.e eVar) {
        a0 a0VarU;
        switch (this.f26235a) {
            case 0:
                y0 y0Var = (y0) eVar.o0().get(1);
                vc.l lVar = vc.m.f22860d;
                jc.l.b(y0Var);
                y yVarJ = ie.d.j(y0Var);
                lVar.getClass();
                yc.e eVarD = yc.v.d(yVarJ, vc.n.R);
                if (eVarD == null) {
                    a0VarU = null;
                } else {
                    h0.f19950b.getClass();
                    h0 h0Var = h0.f19951c;
                    List listO = eVarD.Q().o();
                    jc.l.d(listO, "getParameters(...)");
                    Object objX0 = vb.m.x0(listO);
                    jc.l.d(objX0, "single(...)");
                    a0VarU = se.c.u(h0Var, eVarD, ud.b.w(new f0((q0) objX0)));
                }
                if (a0VarU == null) {
                    return false;
                }
                se.w wVarB = y0Var.b();
                jc.l.d(wVarB, "getType(...)");
                return te.d.f20724a.b(a0VarU, u0.g(wVarB, false));
            default:
                List listO0 = eVar.o0();
                jc.l.d(listO0, "getValueParameters(...)");
                List<y0> list = listO0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (y0 y0Var2 : list) {
                        jc.l.b(y0Var2);
                        if (ie.d.a(y0Var2) || y0Var2.f2713j != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // ye.e
    public final String b() {
        switch (this.f26235a) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }

    @Override // ye.e
    public final /* bridge */ String c(nd.e eVar) {
        switch (this.f26235a) {
        }
        return ua.j.p(this, eVar);
    }
}
