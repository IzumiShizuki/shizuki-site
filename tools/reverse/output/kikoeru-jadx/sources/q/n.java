package q;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f17369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17370b;

    public n(v vVar) {
        this.f17369a = vVar;
    }

    @Override // g2.v0
    public final int c(g2.y yVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iT = ((g2.u0) list.get(0)).t(i10);
        int iR = ud.b.r(list);
        int i11 = 1;
        if (1 <= iR) {
            while (true) {
                int iT2 = ((g2.u0) list.get(i11)).t(i10);
                if (iT2 > iT) {
                    iT = iT2;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
            }
        }
        return iT;
    }

    @Override // g2.v0
    public final int f(g2.y yVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iM = ((g2.u0) list.get(0)).m(i10);
        int iR = ud.b.r(list);
        int i11 = 1;
        if (1 <= iR) {
            while (true) {
                int iM2 = ((g2.u0) list.get(i11)).m(i10);
                if (iM2 > iM) {
                    iM = iM2;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
            }
        }
        return iM;
    }

    @Override // g2.v0
    public final int g(g2.y yVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iL = ((g2.u0) list.get(0)).L(i10);
        int iR = ud.b.r(list);
        int i11 = 1;
        if (1 <= iR) {
            while (true) {
                int iL2 = ((g2.u0) list.get(i11)).L(i10);
                if (iL2 > iL) {
                    iL = iL2;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
            }
        }
        return iL;
    }

    @Override // g2.v0
    public final g2.w0 h(g2.x0 x0Var, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            g2.g1 g1VarV = ((g2.u0) list.get(i10)).v(j10);
            iMax = Math.max(iMax, g1VarV.f7180a);
            iMax2 = Math.max(iMax2, g1VarV.f7181b);
            arrayList.add(g1VarV);
        }
        boolean zO = x0Var.O();
        v vVar = this.f17369a;
        if (zO) {
            this.f17370b = true;
            vVar.f17463b.setValue(new f3.l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f17370b) {
            vVar.f17463b.setValue(new f3.l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return x0Var.b0(iMax, iMax2, vb.s.f22820a, new d0.u(5, arrayList));
    }

    @Override // g2.v0
    public final int i(g2.y yVar, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB = ((g2.u0) list.get(0)).b(i10);
        int iR = ud.b.r(list);
        int i11 = 1;
        if (1 <= iR) {
            while (true) {
                int iB2 = ((g2.u0) list.get(i11)).b(i10);
                if (iB2 > iB) {
                    iB = iB2;
                }
                if (i11 == iR) {
                    break;
                }
                i11++;
            }
        }
        return iB;
    }
}
