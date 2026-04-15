package j3;

import g2.g1;
import g2.u0;
import g2.v0;
import g2.w0;
import g2.x0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f10126b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f10127c = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10128a;

    public /* synthetic */ e(int i10) {
        this.f10128a = i10;
    }

    @Override // g2.v0
    public final /* synthetic */ int c(g2.y yVar, List list, int i10) {
        int i11 = this.f10128a;
        return a0.c.f(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int f(g2.y yVar, List list, int i10) {
        int i11 = this.f10128a;
        return a0.c.m(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int g(g2.y yVar, List list, int i10) {
        int i11 = this.f10128a;
        return a0.c.j(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final w0 h(x0 x0Var, List list, long j10) {
        switch (this.f10128a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    g1 g1VarV = ((u0) list.get(i11)).v(j10);
                    iJ = Math.max(iJ, g1VarV.f7180a);
                    i10 = Math.max(i10, g1VarV.f7181b);
                    arrayList.add(g1VarV);
                }
                if (list.isEmpty()) {
                    iJ = f3.a.j(j10);
                    i10 = f3.a.i(j10);
                }
                return x0Var.b0(iJ, i10, vb.s.f22820a, new d0.u(2, arrayList));
            default:
                int size2 = list.size();
                vb.s sVar = vb.s.f22820a;
                if (size2 == 0) {
                    return x0Var.b0(0, 0, sVar, c.f10119g);
                }
                if (size2 == 1) {
                    g1 g1VarV2 = ((u0) list.get(0)).v(j10);
                    return x0Var.b0(g1VarV2.f7180a, g1VarV2.f7181b, sVar, new b0.p(g1VarV2, 4));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i12 = 0; i12 < size3; i12++) {
                    g1 g1VarV3 = ((u0) list.get(i12)).v(j10);
                    iMax = Math.max(iMax, g1VarV3.f7180a);
                    iMax2 = Math.max(iMax2, g1VarV3.f7181b);
                    arrayList2.add(g1VarV3);
                }
                return x0Var.b0(iMax, iMax2, sVar, new d0.u(3, arrayList2));
        }
    }

    @Override // g2.v0
    public final /* synthetic */ int i(g2.y yVar, List list, int i10) {
        int i11 = this.f10128a;
        return a0.c.c(this, yVar, list, i10);
    }
}
