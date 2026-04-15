package m0;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x3 implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13886b;

    public /* synthetic */ x3(int i10, Object obj) {
        this.f13885a = i10;
        this.f13886b = obj;
    }

    @Override // g2.v0
    public final /* synthetic */ int c(g2.y yVar, List list, int i10) {
        int i11 = this.f13885a;
        return a0.c.f(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int f(g2.y yVar, List list, int i10) {
        int i11 = this.f13885a;
        return a0.c.m(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int g(g2.y yVar, List list, int i10) {
        int i11 = this.f13885a;
        return a0.c.j(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final g2.w0 h(g2.x0 x0Var, List list, long j10) {
        int iR;
        switch (this.f13885a) {
            case 0:
                long jA = f3.a.a(j10, 0, 0, 0, Integer.MAX_VALUE, 3);
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((g2.u0) list.get(i10)).v(jA));
                }
                Integer numValueOf = 0;
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((g2.g1) arrayList.get(i11)).f7180a));
                }
                int iIntValue = numValueOf.intValue();
                int[] iArr = new int[arrayList.size()];
                List list2 = (List) this.f13886b;
                int size3 = arrayList.size();
                int i12 = 0;
                for (int i13 = 0; i13 < size3; i13++) {
                    g2.g1 g1Var = (g2.g1) arrayList.get(i13);
                    if (i13 > 0) {
                        int i14 = i13 - 1;
                        iR = ((g2.g1) arrayList.get(i14)).f7181b - ((g2.g1) arrayList.get(i14)).R(g2.c.f7163b);
                    } else {
                        iR = 0;
                    }
                    int iMax = Math.max(0, (x0Var.a0(((f3.f) list2.get(i13)).f6657a) - g1Var.R(g2.c.f7162a)) - iR);
                    iArr[i13] = iMax + i12;
                    i12 += iMax + g1Var.f7181b;
                }
                return x0Var.b0(iIntValue, i12, vb.s.f22820a, new ba.q0(11, arrayList, iArr));
            default:
                v0.l0 l0Var = (v0.l0) this.f13886b;
                int size4 = list.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    g2.u0 u0Var = (g2.u0) list.get(i15);
                    if (androidx.compose.ui.layout.a.a(u0Var) == v0.b0.f22173a) {
                        g2.g1 g1VarV = u0Var.v(j10);
                        int size5 = list.size();
                        for (int i16 = 0; i16 < size5; i16++) {
                            g2.u0 u0Var2 = (g2.u0) list.get(i16);
                            if (androidx.compose.ui.layout.a.a(u0Var2) == v0.b0.f22174b) {
                                g2.g1 g1VarV2 = u0Var2.v(f3.a.a(f3.b.i(-g1VarV.f7180a, 0, j10), 0, 0, 0, 0, 11));
                                int i17 = g1VarV.f7180a + g1VarV2.f7180a;
                                int iMax2 = Math.max(g1VarV2.f7181b, g1VarV.f7181b);
                                l0Var.f22263h.f(g1VarV.f7180a);
                                l0Var.f22261f.f(i17);
                                return x0Var.b0(i17, iMax2, vb.s.f22820a, new v0.h0(g1VarV2, g1VarV.f7180a / 2, (iMax2 - g1VarV2.f7181b) / 2, g1VarV, lc.b.R(l0Var.b() * g1VarV2.f7180a), (iMax2 - g1VarV.f7181b) / 2));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // g2.v0
    public final /* synthetic */ int i(g2.y yVar, List list, int i10) {
        int i11 = this.f13885a;
        return a0.c.c(this, yVar, list, i10);
    }
}
