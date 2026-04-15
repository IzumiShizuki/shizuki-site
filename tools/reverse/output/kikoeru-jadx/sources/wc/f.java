package wc;

import bd.s0;
import bd.y;
import bd.y0;
import bd.z;
import j2.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import se.r0;
import se.w;
import ud.n;
import yc.m0;
import yc.t;
import ye.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends s0 {
    public f(yc.k kVar, f fVar, int i10, boolean z10) {
        super(kVar, fVar, zc.g.f26696a, q.f26251g, i10, m0.p0);
        this.f2723m = true;
        this.f2731u = z10;
        this.f2732v = false;
    }

    @Override // bd.s0, bd.z
    public final z F1(int i10, be.e eVar, yc.k kVar, t tVar, m0 m0Var, zc.h hVar) {
        jc.l.e(kVar, "newOwner");
        h0.q(i10, "kind");
        jc.l.e(hVar, "annotations");
        return new f(kVar, (f) tVar, i10, this.f2731u);
    }

    @Override // bd.z
    public final z G1(y yVar) {
        be.e eVar;
        f fVar = (f) super.G1(yVar);
        if (fVar == null) {
            return null;
        }
        List listO0 = fVar.o0();
        jc.l.d(listO0, "getValueParameters(...)");
        List list = listO0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return fVar;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w wVarB = ((y0) it.next()).b();
            jc.l.d(wVarB, "getType(...)");
            if (n.h(wVarB) != null) {
                List listO02 = fVar.o0();
                jc.l.d(listO02, "getValueParameters(...)");
                List list2 = listO02;
                ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    w wVarB2 = ((y0) it2.next()).b();
                    jc.l.d(wVarB2, "getType(...)");
                    arrayList.add(n.h(wVarB2));
                }
                int size = fVar.o0().size() - arrayList.size();
                boolean z10 = true;
                if (size == 0) {
                    List listO03 = fVar.o0();
                    jc.l.d(listO03, "getValueParameters(...)");
                    ArrayList<ub.k> arrayListM0 = vb.m.M0(arrayList, listO03);
                    if (arrayListM0.isEmpty()) {
                        return fVar;
                    }
                    for (ub.k kVar : arrayListM0) {
                        if (!jc.l.a((be.e) kVar.f21543a, ((y0) kVar.f21544b).getName())) {
                        }
                    }
                    return fVar;
                }
                List listO04 = fVar.o0();
                jc.l.d(listO04, "getValueParameters(...)");
                List<y0> list3 = listO04;
                ArrayList arrayList2 = new ArrayList(vb.n.K(list3, 10));
                for (y0 y0Var : list3) {
                    be.e name = y0Var.getName();
                    jc.l.d(name, "getName(...)");
                    int i10 = y0Var.f2709f;
                    int i11 = i10 - size;
                    if (i11 >= 0 && (eVar = (be.e) arrayList.get(i11)) != null) {
                        name = eVar;
                    }
                    arrayList2.add(y0Var.D1(fVar, name, i10));
                }
                y yVarJ1 = fVar.J1(r0.f19980b);
                if (arrayList.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((be.e) it3.next()) == null) {
                            break;
                        }
                    }
                    z10 = false;
                }
                yVarJ1.f2706v = Boolean.valueOf(z10);
                yVarJ1.f2691g = arrayList2;
                yVarJ1.f2689e = fVar.a();
                z zVarG1 = super.G1(yVarJ1);
                jc.l.b(zVarG1);
                return zVarG1;
            }
        }
        return fVar;
    }

    @Override // bd.z, yc.w
    public final boolean P() {
        return false;
    }

    @Override // bd.z, yc.t
    public final boolean h0() {
        return false;
    }

    @Override // bd.z, yc.t
    public final boolean l() {
        return false;
    }
}
