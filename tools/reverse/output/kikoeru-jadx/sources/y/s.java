package y;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.d f25231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25232b;

    public s(j1.d dVar, boolean z10) {
        this.f25231a = dVar;
        this.f25232b = z10;
    }

    @Override // g2.v0
    public final /* synthetic */ int c(g2.y yVar, List list, int i10) {
        return a0.c.f(this, yVar, list, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return jc.l.a(this.f25231a, sVar.f25231a) && this.f25232b == sVar.f25232b;
    }

    @Override // g2.v0
    public final /* synthetic */ int f(g2.y yVar, List list, int i10) {
        return a0.c.m(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int g(g2.y yVar, List list, int i10) {
        return a0.c.j(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final g2.w0 h(g2.x0 x0Var, List list, long j10) {
        int iJ;
        int i10;
        g2.g1 g1VarV;
        boolean zIsEmpty = list.isEmpty();
        vb.s sVar = vb.s.f22820a;
        if (zIsEmpty) {
            return x0Var.b0(f3.a.j(j10), f3.a.i(j10), sVar, n.f25185d);
        }
        long j11 = this.f25232b ? j10 : j10 & (-8589934589L);
        if (list.size() == 1) {
            g2.u0 u0Var = (g2.u0) list.get(0);
            Object objA = u0Var.A();
            m mVar = objA instanceof m ? (m) objA : null;
            if (mVar != null ? mVar.f25169p : false) {
                iJ = f3.a.j(j10);
                i10 = f3.a.i(j10);
                int iJ2 = f3.a.j(j10);
                int i11 = f3.a.i(j10);
                if (!((i11 >= 0) & (iJ2 >= 0))) {
                    f3.i.a("width and height must be >= 0");
                }
                g1VarV = u0Var.v(f3.b.h(iJ2, iJ2, i11, i11));
            } else {
                g1VarV = u0Var.v(j11);
                iJ = Math.max(f3.a.j(j10), g1VarV.f7180a);
                i10 = Math.max(f3.a.i(j10), g1VarV.f7181b);
            }
            int i12 = i10;
            int i13 = iJ;
            return x0Var.b0(i13, i12, sVar, new q(g1VarV, u0Var, x0Var, i13, i12, this));
        }
        g2.g1[] g1VarArr = new g2.g1[list.size()];
        jc.w wVar = new jc.w();
        wVar.f10836a = f3.a.j(j10);
        jc.w wVar2 = new jc.w();
        wVar2.f10836a = f3.a.i(j10);
        List list2 = list;
        int size = list2.size();
        boolean z10 = false;
        for (int i14 = 0; i14 < size; i14++) {
            g2.u0 u0Var2 = (g2.u0) list.get(i14);
            Object objA2 = u0Var2.A();
            m mVar2 = objA2 instanceof m ? (m) objA2 : null;
            if (mVar2 != null ? mVar2.f25169p : false) {
                z10 = true;
            } else {
                g2.g1 g1VarV2 = u0Var2.v(j11);
                g1VarArr[i14] = g1VarV2;
                wVar.f10836a = Math.max(wVar.f10836a, g1VarV2.f7180a);
                wVar2.f10836a = Math.max(wVar2.f10836a, g1VarV2.f7181b);
            }
        }
        if (z10) {
            int i15 = wVar.f10836a;
            int i16 = i15 != Integer.MAX_VALUE ? i15 : 0;
            int i17 = wVar2.f10836a;
            long jA = f3.b.a(i16, i15, i17 != Integer.MAX_VALUE ? i17 : 0, i17);
            int size2 = list2.size();
            for (int i18 = 0; i18 < size2; i18++) {
                g2.u0 u0Var3 = (g2.u0) list.get(i18);
                Object objA3 = u0Var3.A();
                m mVar3 = objA3 instanceof m ? (m) objA3 : null;
                if (mVar3 != null ? mVar3.f25169p : false) {
                    g1VarArr[i18] = u0Var3.v(jA);
                }
            }
        }
        return x0Var.b0(wVar.f10836a, wVar2.f10836a, sVar, new r(g1VarArr, list, x0Var, wVar, wVar2, this));
    }

    public final int hashCode() {
        return (this.f25231a.hashCode() * 31) + (this.f25232b ? 1231 : 1237);
    }

    @Override // g2.v0
    public final /* synthetic */ int i(g2.y yVar, List list, int i10) {
        return a0.c.c(this, yVar, list, i10);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f25231a + ", propagateMinConstraints=" + this.f25232b + ')';
    }
}
