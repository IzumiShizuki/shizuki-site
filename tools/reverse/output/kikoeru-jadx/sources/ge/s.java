package ge;

import ce.j0;
import se.a0;
import se.f0;
import se.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends g {
    public s(be.b bVar, int i10) {
        super(new q(new f(bVar, i10)));
    }

    @Override // ge.g
    public final se.w a(yc.y yVar) {
        se.w wVarC;
        jc.l.e(yVar, "module");
        h0.f19950b.getClass();
        h0 h0Var = h0.f19951c;
        vc.i iVarG = yVar.g();
        iVarG.getClass();
        yc.e eVarJ = iVarG.j(vc.n.Q.i());
        Object obj = this.f7527a;
        r rVar = (r) obj;
        if (rVar instanceof p) {
            wVarC = ((p) obj).f7534a;
        } else {
            if (!(rVar instanceof q)) {
                throw new j0();
            }
            f fVar = ((q) obj).f7535a;
            be.b bVar = fVar.f7525a;
            int i10 = fVar.f7526b;
            yc.e eVarD = yc.v.d(yVar, bVar);
            if (eVarD == null) {
                wVarC = ue.l.c(ue.k.UNRESOLVED_KCLASS_CONSTANT_VALUE, bVar.toString(), String.valueOf(i10));
            } else {
                a0 a0VarE = eVarD.E();
                jc.l.d(a0VarE, "getDefaultType(...)");
                se.w wVarT = ud.e.T(a0VarE);
                for (int i11 = 0; i11 < i10; i11++) {
                    wVarT = yVar.g().h(wVarT);
                }
                wVarC = wVarT;
            }
        }
        return se.c.u(h0Var, eVarJ, ud.b.w(new f0(wVarC)));
    }
}
