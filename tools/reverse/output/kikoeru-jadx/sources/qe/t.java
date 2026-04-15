package qe;

import ce.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import se.x0;
import wd.t0;
import wd.y0;
import yc.n0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends bd.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final oe.k f18223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f18224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f18225m;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(oe.k kVar, y0 y0Var, int i10) {
        x0 x0Var;
        oe.i iVar = kVar.f16390a;
        re.l lVar = iVar.f16364a;
        yc.k kVar2 = kVar.f16392c;
        be.e eVarR = u3.x0.r(kVar.f16391b, y0Var.f24046e);
        wd.x0 x0Var2 = y0Var.f24048g;
        jc.l.d(x0Var2, "getVariance(...)");
        int iOrdinal = x0Var2.ordinal();
        if (iOrdinal == 0) {
            x0Var = x0.IN_VARIANCE;
        } else if (iOrdinal == 1) {
            x0Var = x0.OUT_VARIANCE;
        } else {
            if (iOrdinal != 2) {
                throw new j0();
            }
            x0Var = x0.INVARIANT;
        }
        x0 x0Var3 = x0Var;
        super(lVar, kVar2, zc.g.f26696a, eVarR, x0Var3, y0Var.f24047f, i10, n0.f26123c);
        this.f18223k = kVar;
        this.f18224l = y0Var;
        this.f18225m = new a(iVar.f16364a, new bd.e(16, this));
    }

    @Override // bd.k
    public final List E1() {
        oe.k kVar = this.f18223k;
        List listH0 = ud.e.h0(this.f18224l, kVar.f16393d);
        if (listH0.isEmpty()) {
            return ud.b.w(ie.d.e(this).o());
        }
        List list = listH0;
        id.h hVar = kVar.f16397h;
        ArrayList arrayList = new ArrayList(vb.n.K(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(hVar.s((t0) it.next()));
        }
        return arrayList;
    }

    @Override // androidx.lifecycle.q, zc.a
    public final zc.h getAnnotations() {
        return this.f18225m;
    }
}
