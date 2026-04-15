package m0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g2.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f13037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f13038b;

    public h(float f10, float f11) {
        this.f13037a = f10;
        this.f13038b = f11;
    }

    public static final void a(ArrayList arrayList, jc.w wVar, g2.x0 x0Var, float f10, ArrayList arrayList2, ArrayList arrayList3, jc.w wVar2, ArrayList arrayList4, jc.w wVar3, jc.w wVar4) {
        if (!arrayList.isEmpty()) {
            wVar.f10836a = x0Var.a0(f10) + wVar.f10836a;
        }
        arrayList.add(0, vb.m.G0(arrayList2));
        arrayList3.add(Integer.valueOf(wVar2.f10836a));
        arrayList4.add(Integer.valueOf(wVar.f10836a));
        wVar.f10836a += wVar2.f10836a;
        wVar3.f10836a = Math.max(wVar3.f10836a, wVar4.f10836a);
        arrayList2.clear();
        wVar4.f10836a = 0;
        wVar2.f10836a = 0;
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
        int i10;
        g2.g1 g1Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jc.w wVar = new jc.w();
        jc.w wVar2 = new jc.w();
        ArrayList arrayList4 = new ArrayList();
        jc.w wVar3 = new jc.w();
        jc.w wVar4 = new jc.w();
        int i11 = 0;
        long jB = f3.b.b(f3.a.h(j10), 0, 13);
        for (int size = list2.size(); i11 < size; size = i10) {
            g2.g1 g1VarV = ((g2.u0) list2.get(i11)).v(jB);
            boolean zIsEmpty = arrayList4.isEmpty();
            float f10 = this.f13037a;
            if (zIsEmpty) {
                i10 = size;
                g1Var = g1VarV;
            } else {
                ArrayList arrayList5 = arrayList;
                jc.w wVar5 = wVar2;
                if (x0Var.a0(f10) + wVar3.f10836a + g1VarV.f7180a <= f3.a.h(j10)) {
                    arrayList = arrayList5;
                    wVar2 = wVar5;
                    i10 = size;
                    g1Var = g1VarV;
                } else {
                    i10 = size;
                    wVar2 = wVar5;
                    g1Var = g1VarV;
                    arrayList = arrayList5;
                    a(arrayList, wVar2, x0Var, this.f13038b, arrayList4, arrayList2, wVar4, arrayList3, wVar, wVar3);
                }
            }
            if (!arrayList4.isEmpty()) {
                wVar3.f10836a = x0Var.a0(f10) + wVar3.f10836a;
            }
            arrayList4.add(g1Var);
            wVar3.f10836a += g1Var.f7180a;
            wVar4.f10836a = Math.max(wVar4.f10836a, g1Var.f7181b);
            i11++;
            list2 = list;
        }
        if (!arrayList4.isEmpty()) {
            a(arrayList, wVar2, x0Var, this.f13038b, arrayList4, arrayList2, wVar4, arrayList3, wVar, wVar3);
        }
        int iH = f3.a.h(j10) != Integer.MAX_VALUE ? f3.a.h(j10) : Math.max(wVar.f10836a, f3.a.j(j10));
        return x0Var.b0(iH, Math.max(wVar2.f10836a, f3.a.i(j10)), vb.s.f22820a, new g(arrayList, x0Var, this.f13037a, iH, arrayList3));
    }

    @Override // g2.v0
    public final /* synthetic */ int i(g2.y yVar, List list, int i10) {
        return a0.c.c(this, yVar, list, i10);
    }
}
