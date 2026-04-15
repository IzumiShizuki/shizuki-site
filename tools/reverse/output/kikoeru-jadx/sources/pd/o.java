package pd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f17063b;

    public /* synthetic */ o(p pVar, int i10) {
        this.f17062a = i10;
        this.f17063b = pVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f17062a) {
            case 0:
                p pVar = this.f17063b;
                ud.h hVar = ((od.a) pVar.f17066h.f1395c).f16326l;
                String str = pVar.f2596e.f2744a.f2747a;
                hVar.getClass();
                jc.l.e(str, "packageFqName");
                return vb.w.A(new ArrayList());
            case 1:
                this.f17063b.f17065g.getClass();
                return new ArrayList(vb.n.K(vb.r.f22819a, 10));
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) n7.b0.r(this.f17063b.f17067i, p.f17064m[0])).entrySet()) {
                    String str2 = (String) entry.getKey();
                    dd.c cVar = (dd.c) entry.getValue();
                    je.b bVarC = je.b.c(str2);
                    i5.f fVar = cVar.f5867b;
                    vd.a aVar = (vd.a) fVar.f9019c;
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 2) {
                        map.put(bVarC, bVarC);
                    } else if (iOrdinal == 5) {
                        String str3 = (String) fVar.f9024h;
                        if (aVar != vd.a.f22937i) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            map.put(bVarC, je.b.c(str3));
                        }
                    }
                }
                return map;
        }
    }
}
