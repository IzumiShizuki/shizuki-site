package sc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f19883b;

    public /* synthetic */ u0(w0 w0Var, int i10) {
        this.f19882a = i10;
        this.f19883b = w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // ic.a
    public final Object b() throws ce.s {
        ?? W;
        switch (this.f19882a) {
            case 0:
                w0 w0Var = this.f19883b;
                z1 z1Var = w0Var.f19901c;
                pc.u uVar = w0.f19900g[0];
                dd.c cVar = (dd.c) z1Var.b();
                if (cVar == null) {
                    return le.n.f12335b;
                }
                z1 z1Var2 = w0Var.f19797a;
                pc.u uVar2 = f0.f19796b[0];
                Object objB = z1Var2.b();
                jc.l.d(objB, "getValue(...)");
                c7.e1 e1Var = ((dd.f) objB).f5872b;
                ud.g gVar = (ud.g) e1Var.f3618b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) e1Var.f3620d;
                Class cls = cVar.f5866a;
                be.b bVarA = ed.d.a(cls);
                Object obj = concurrentHashMap.get(bVarA);
                if (obj == null) {
                    be.c cVar2 = ed.d.a(cls).f2740a;
                    i5.f fVar = cVar.f5867b;
                    vd.a aVar = (vd.a) fVar.f9019c;
                    vd.a aVar2 = vd.a.f22936h;
                    if (aVar == aVar2) {
                        String[] strArr = (String[]) fVar.f9021e;
                        if (aVar != aVar2) {
                            strArr = null;
                        }
                        List listC0 = strArr != null ? vb.l.c0(strArr) : null;
                        if (listC0 == null) {
                            listC0 = vb.r.f22819a;
                        }
                        W = new ArrayList();
                        Iterator it = listC0.iterator();
                        while (it.hasNext()) {
                            be.c cVar3 = new be.c(je.b.c((String) it.next()).f10845a.replace('/', '.'));
                            be.b bVar = new be.b(cVar3.b(), cVar3.f2744a.g());
                            dd.b bVar2 = (dd.b) e1Var.f3619c;
                            gVar.c().f16366c.getClass();
                            dd.c cVarI = ud.n.i(bVar2, bVar, yd.e.f26197g);
                            if (cVarI != null) {
                                W.add(cVarI);
                            }
                        }
                    } else {
                        W = ud.b.w(cVar);
                    }
                    bd.r rVar = new bd.r(gVar.c().f16365b, cVar2, 0);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((Iterable) W).iterator();
                    while (it2.hasNext()) {
                        qe.p pVarA = gVar.a(rVar, (dd.c) it2.next());
                        if (pVarA != null) {
                            arrayList.add(pVarA);
                        }
                    }
                    le.o oVarP = lc.b.p("package " + cVar2 + " (" + cVar + ')', vb.m.G0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, oVarP);
                    obj = objPutIfAbsent == null ? oVarP : objPutIfAbsent;
                }
                jc.l.d(obj, "getOrPut(...)");
                return (le.o) obj;
            default:
                z1 z1Var3 = this.f19883b.f19901c;
                pc.u uVar3 = w0.f19900g[0];
                dd.c cVar4 = (dd.c) z1Var3.b();
                if (cVar4 != null) {
                    i5.f fVar2 = cVar4.f5867b;
                    String[] strArr2 = (String[]) fVar2.f9021e;
                    String[] strArr3 = (String[]) fVar2.f9023g;
                    if (strArr2 != null && strArr3 != null) {
                        ub.k kVarH = ae.g.h(strArr2, strArr3);
                        return new ub.q((ae.f) kVarH.f21543a, (wd.f0) kVarH.f21544b, (yd.e) fVar2.f9020d);
                    }
                }
                return null;
        }
    }
}
