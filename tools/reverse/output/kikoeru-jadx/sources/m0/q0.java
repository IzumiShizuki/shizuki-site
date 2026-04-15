package m0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic.n f13482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f13483b;

    public q0(float f10, ic.n nVar) {
        this.f13482a = nVar;
        this.f13483b = f10;
    }

    @Override // g2.v0
    public final /* synthetic */ int c(g2.y yVar, List list, int i10) {
        return a0.c.f(this, yVar, list, i10);
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
        long j11;
        g2.g1 g1VarV;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2.u0 u0Var = (g2.u0) list.get(i10);
            if (jc.l.a(androidx.compose.ui.layout.a.a(u0Var), "icon")) {
                final g2.g1 g1VarV2 = u0Var.v(j10);
                ic.n nVar = this.f13482a;
                if (nVar != null) {
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        g2.u0 u0Var2 = (g2.u0) list.get(i11);
                        if (jc.l.a(androidx.compose.ui.layout.a.a(u0Var2), "label")) {
                            j11 = j10;
                            g1VarV = u0Var2.v(f3.a.a(j10, 0, 0, 0, 0, 11));
                        }
                    }
                    h3.a.c("Collection contains no element matching the predicate.");
                    throw new ce.j0();
                }
                j11 = j10;
                g1VarV = null;
                vb.s sVar = vb.s.f22820a;
                if (nVar == null) {
                    int iF = f3.b.f(x0Var.a0(r0.f13540b), j11);
                    return x0Var.b0(g1VarV2.f7180a, iF, sVar, new o0((iF - g1VarV2.f7181b) / 2, 0, g1VarV2));
                }
                jc.l.b(g1VarV);
                int iA0 = x0Var.a0(r0.f13542d) - g1VarV.R(g2.c.f7162a);
                int i12 = g1VarV2.f7181b + g1VarV.f7181b + iA0;
                int iF2 = f3.b.f(Math.max(i12, x0Var.a0(r0.f13540b)), j11);
                int i13 = (iF2 - i12) / 2;
                final int i14 = i13 < 0 ? 0 : i13;
                int i15 = g1VarV2.f7181b;
                int i16 = (iF2 - i15) / 2;
                final int i17 = i14 + i15 + iA0;
                int iMax = Math.max(g1VarV.f7180a, g1VarV2.f7180a);
                final int i18 = (iMax - g1VarV.f7180a) / 2;
                final int i19 = (iMax - g1VarV2.f7180a) / 2;
                final float f10 = this.f13483b;
                final int iR = lc.b.R((1 - f10) * (i16 - i14));
                final g2.g1 g1Var = g1VarV;
                return x0Var.b0(iMax, iF2, sVar, new ic.k() { // from class: m0.n0
                    @Override // ic.k
                    public final Object a(Object obj) {
                        g2.f1 f1Var = (g2.f1) obj;
                        float f11 = f10;
                        int i20 = iR;
                        if (f11 != 0.0f) {
                            g2.f1.k(f1Var, g1Var, i18, i17 + i20);
                        }
                        g2.f1.k(f1Var, g1VarV2, i19, i14 + i20);
                        return ub.a0.f21526a;
                    }
                });
            }
        }
        h3.a.c("Collection contains no element matching the predicate.");
        throw new ce.j0();
    }

    @Override // g2.v0
    public final /* synthetic */ int i(g2.y yVar, List list, int i10) {
        return a0.c.c(this, yVar, list, i10);
    }
}
