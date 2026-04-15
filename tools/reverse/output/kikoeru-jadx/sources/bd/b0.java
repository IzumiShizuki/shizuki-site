package bd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f2548b;

    public /* synthetic */ b0(c0 c0Var, int i10) {
        this.f2547a = i10;
        this.f2548b = c0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f2547a) {
            case 0:
                c0 c0Var = this.f2548b;
                h0 h0Var = c0Var.f2554c;
                h0Var.C1();
                return yc.v.i((o) h0Var.f2583k.getValue(), c0Var.f2555d);
            case 1:
                c0 c0Var2 = this.f2548b;
                h0 h0Var2 = c0Var2.f2554c;
                h0Var2.C1();
                return Boolean.valueOf(yc.v.h((o) h0Var2.f2583k.getValue(), c0Var2.f2555d));
            default:
                c0 c0Var3 = this.f2548b;
                re.i iVar = c0Var3.f2557f;
                pc.u[] uVarArr = c0.f2553h;
                boolean zBooleanValue = ((Boolean) n7.b0.r(iVar, uVarArr[1])).booleanValue();
                be.c cVar = c0Var3.f2555d;
                h0 h0Var3 = c0Var3.f2554c;
                if (zBooleanValue) {
                    return le.n.f12335b;
                }
                List list = (List) n7.b0.r(c0Var3.f2556e, uVarArr[0]);
                ArrayList arrayList = new ArrayList(vb.n.K(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((yc.d0) it.next()).n0());
                }
                return lc.b.p("package view scope for " + cVar + " in " + h0Var3.getName(), vb.m.r0(arrayList, new t0(h0Var3, cVar)));
        }
    }
}
