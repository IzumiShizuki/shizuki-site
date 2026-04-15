package v9;

import a9.t;
import fg.f;
import gg.c;
import ic.n;
import java.io.File;
import jc.y;
import jc.z;
import la.q0;
import q9.j0;
import t2.x;
import ub.a0;
import ub.p;
import x0.k;
import x0.o;
import x0.p1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f22799a = ub.a.d(new j0(15));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f22800b = ub.a.d(new j0(16));

    public static final void a(int i10, o oVar) {
        oVar.Y(-89973294);
        if (oVar.N(i10 & 1, i10 != 0)) {
            Boolean bool = Boolean.TRUE;
            oVar.W(500600386);
            hg.a aVarA = c.a();
            y yVar = new y();
            oVar.W(1849434622);
            Object objK = oVar.K();
            Object obj = k.f24334a;
            if (objK == obj) {
                objK = lc.b.G("databaseModifyWarning", bool, aVarA, true, z.a(Boolean.TYPE));
                oVar.h0(objK);
            }
            f fVar = (f) objK;
            oVar.p(false);
            yVar.f10838a = fVar;
            v.c(fVar, new t(yVar, 6), oVar);
            f fVar2 = (f) yVar.f10838a;
            oVar.p(false);
            boolean zF = oVar.f(fVar2);
            Object objK2 = oVar.K();
            if (zF || objK2 == obj) {
                objK2 = new q0(fVar2, null, 1);
                oVar.h0(objK2);
            }
            v.e((n) objK2, a0.f21526a, oVar);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new x(i10, 29);
        }
    }

    public static final void b(int i10, o oVar) {
        o oVar2;
        oVar.Y(-566612178);
        if (oVar.N(i10 & 1, i10 != 0)) {
            a(0, oVar);
            hg.a aVarA = c.a();
            Object objK = oVar.K();
            if (objK == k.f24334a) {
                objK = new t9.c(4);
                oVar.h0(objK);
            }
            oVar2 = oVar;
            y8.c.c(aVarA, null, 0.0f, 0.0f, (ic.k) objK, oVar2, 24576);
        } else {
            oVar2 = oVar;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new x(i10, 28);
        }
    }

    public static final File c() {
        return (File) f22799a.getValue();
    }
}
