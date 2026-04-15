package ue;

import bd.n;
import java.util.List;
import se.p0;
import se.r0;
import vb.r;
import yc.m0;
import yc.o;
import yc.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(be.e eVar) {
        l lVar = l.f21664a;
        e eVar2 = l.f21665b;
        re.b bVar = re.l.f19010e;
        x xVar = x.f26157d;
        yc.f fVar = yc.f.f26109a;
        List list = r.f22819a;
        super(eVar2, eVar, xVar, fVar, list, bVar);
        bd.l lVar2 = new bd.l(this, null, zc.g.f26696a, true, 1, m0.p0);
        lVar2.R1(list, o.f26129e);
        String str = lVar2.getName().f2751a;
        jc.l.d(str, "toString(...)");
        g gVarB = l.b(h.f21625f, str, "");
        k kVar = k.ERROR_CLASS;
        lVar2.f2717g = new i(l.d(kVar, new String[0]), gVarB, kVar, list, false, new String[0]);
        q(gVarB, ud.e.X(lVar2), lVar2);
    }

    @Override // bd.c, bd.e0
    public final le.o c(p0 p0Var, te.f fVar) {
        String str = getName().f2751a;
        jc.l.d(str, "toString(...)");
        return l.b(h.f21625f, str, p0Var.toString());
    }

    @Override // bd.c, yc.o0
    public final yc.l h(r0 r0Var) {
        jc.l.e(r0Var, "substitutor");
        return this;
    }

    @Override // bd.c
    /* JADX INFO: renamed from: o */
    public final yc.e h(r0 r0Var) {
        jc.l.e(r0Var, "substitutor");
        return this;
    }

    @Override // bd.n
    public final String toString() {
        String strB = getName().b();
        jc.l.d(strB, "asString(...)");
        return strB;
    }
}
