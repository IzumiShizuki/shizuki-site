package xc;

import bd.c0;
import java.util.ArrayList;
import java.util.List;
import n7.b0;
import yc.y;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f24920b = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24921a = 0;

    public /* synthetic */ f() {
    }

    @Override // ic.k
    public final Object a(Object obj) {
        boolean z10 = false;
        switch (this.f24921a) {
            case 0:
                y yVar = (y) obj;
                e eVar = g.f24922d;
                jc.l.e(yVar, "module");
                List list = (List) b0.r(((c0) yVar.K0(g.f24924f)).f2556e, c0.f2553h[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof pe.c) {
                        arrayList.add(obj2);
                    }
                }
                return (pe.c) vb.m.Y(arrayList);
            default:
                yc.c cVar = (yc.c) obj;
                if (cVar.j() == 1) {
                    yc.k kVarY = cVar.y();
                    jc.l.c(kVarY, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str = d.f24905a;
                    if (d.f24914j.containsKey(ee.e.g((yc.e) kVarY))) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    public f(l lVar) {
    }
}
