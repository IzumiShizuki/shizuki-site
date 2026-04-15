package ld;

import bd.s0;
import j2.h0;
import java.util.List;
import se.r0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements ee.f {
    @Override // ee.f
    public final int a() {
        return 2;
    }

    @Override // ee.f
    public final int b(yc.b bVar, yc.b bVar2, yc.e eVar) {
        jc.l.e(bVar, "superDescriptor");
        jc.l.e(bVar2, "subDescriptor");
        if (!(bVar2 instanceof nd.e)) {
            return 3;
        }
        nd.e eVar2 = (nd.e) bVar2;
        if (!eVar2.getTypeParameters().isEmpty()) {
            return 3;
        }
        ee.k kVarI = ee.l.i(bVar, bVar2);
        if ((kVarI != null ? kVarI.b() : 0) != 0) {
            return 3;
        }
        List listO0 = eVar2.o0();
        jc.l.d(listO0, "getValueParameters(...)");
        df.r rVarE0 = df.m.e0(vb.m.R(listO0), d.f12198e);
        se.w wVar = eVar2.f2717g;
        jc.l.b(wVar);
        df.i iVarZ = df.m.Z(vb.l.d0(new df.k[]{rVarE0, new df.n(1, wVar)}));
        bd.a0 a0Var = eVar2.f2719i;
        df.e eVar3 = new df.e(df.m.Z(vb.l.d0(new df.k[]{iVarZ, vb.m.R(ud.b.y(a0Var != null ? a0Var.b() : null))})));
        while (eVar3.hasNext()) {
            se.w wVar2 = (se.w) eVar3.next();
            if (!wVar2.q().isEmpty() && !(wVar2.x() instanceof qd.h)) {
                return 3;
            }
        }
        yc.b bVarBuild = (yc.b) bVar.h(new r0(new qd.f()));
        if (bVarBuild == null) {
            return 3;
        }
        if (bVarBuild instanceof s0) {
            s0 s0Var = (s0) bVarBuild;
            if (!s0Var.getTypeParameters().isEmpty()) {
                bVarBuild = s0Var.M0().A().build();
                jc.l.b(bVarBuild);
            }
        }
        int iB = ee.l.f6536c.n(bVarBuild, bVar2, false).b();
        h0.y(iB, "getResult(...)");
        return h.f12225a[w0.c.b(iB)] == 1 ? 1 : 3;
    }
}
