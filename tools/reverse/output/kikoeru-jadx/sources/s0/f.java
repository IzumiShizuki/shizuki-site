package s0;

import g2.g1;
import g2.u0;
import g2.v0;
import g2.w0;
import g2.x0;
import g2.y;
import java.util.ArrayList;
import java.util.List;
import vb.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f19323a = new f();

    @Override // g2.v0
    public final /* synthetic */ int c(y yVar, List list, int i10) {
        return a0.c.f(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int f(y yVar, List list, int i10) {
        return a0.c.m(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final /* synthetic */ int g(y yVar, List list, int i10) {
        return a0.c.j(this, yVar, list, i10);
    }

    @Override // g2.v0
    public final w0 h(x0 x0Var, List list, long j10) {
        int iMax;
        int size = list.size();
        s sVar = s.f22820a;
        int i10 = 0;
        if (size == 0) {
            return x0Var.b0(0, 0, sVar, e.f19322a);
        }
        if (size == 1) {
            g1 g1VarV = ((u0) list.get(0)).v(j10);
            return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, sVar, new bd.a(20, g1VarV));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList.add(((u0) list.get(i11)).v(j10));
        }
        int iR = ud.b.r(arrayList);
        if (iR >= 0) {
            int iMax2 = 0;
            iMax = 0;
            while (true) {
                g1 g1Var = (g1) arrayList.get(i10);
                iMax2 = Math.max(iMax2, g1Var.f7180a);
                iMax = Math.max(iMax, g1Var.f7181b);
                if (i10 == iR) {
                    break;
                }
                i10++;
            }
            i10 = iMax2;
        } else {
            iMax = 0;
        }
        return x0Var.b0(i10, iMax, sVar, new bd.a(21, arrayList));
    }

    @Override // g2.v0
    public final /* synthetic */ int i(y yVar, List list, int i10) {
        return a0.c.c(this, yVar, list, i10);
    }
}
