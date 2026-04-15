package bd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f2570b;

    public /* synthetic */ g0(h0 h0Var, int i10) {
        this.f2569a = i10;
        this.f2570b = h0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f2569a) {
            case 0:
                h0 h0Var = this.f2570b;
                f0 f0Var = h0Var.f2579g;
                if (f0Var == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = h0Var.getName().f2751a;
                    jc.l.d(str, "toString(...)");
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                List list = f0Var.f2567a;
                h0Var.C1();
                list.contains(h0Var);
                List list2 = list;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((h0) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    yc.g0 g0Var = ((h0) it2.next()).f2580h;
                    jc.l.b(g0Var);
                    arrayList.add(g0Var);
                }
                return new o(arrayList, "CompositeProvider@ModuleDescriptor for " + h0Var.getName());
            case 1:
                return ((c0) this.f2570b.K0(vc.o.f22906i)).f2558g;
            default:
                return new xc.h(this.f2570b);
        }
    }
}
