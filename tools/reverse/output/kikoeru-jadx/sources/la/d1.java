package la;

import com.tencent.bugly.beta.tinker.TinkerReport;
import x0.p1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 {
    static {
        r.d.r(TinkerReport.KEY_LOADED_UNKNOWN_EXCEPTION, 0, r.w.f18598a, 2);
    }

    public static final void a(final int i10, final f1.f fVar, final f1.f fVar2, x0.o oVar, final int i11) {
        int i12;
        oVar.Y(-1766645266);
        if ((i11 & 6) == 0) {
            i12 = (oVar.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i11 & 48;
        j1.n nVar = j1.n.f9689a;
        if (i13 == 0) {
            i12 |= oVar.f(nVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= oVar.h(fVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= oVar.h(fVar2) ? 2048 : 1024;
        }
        if (oVar.N(i12 & 1, (i12 & 1171) != 1170)) {
            g8.a.a(q2.m.a(nVar, false, f0.a.f6605b), g0.g.a(26), 0L, 0.0f, f1.g.f(-377738607, new a1(fVar2, fVar, 0), oVar), oVar, 1572864, 60);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ic.n() { // from class: la.b1
                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = x0.v.D(i11 | 1);
                    d1.a(i10, fVar, fVar2, (x0.o) obj, iD);
                    return ub.a0.f21526a;
                }
            };
        }
    }
}
