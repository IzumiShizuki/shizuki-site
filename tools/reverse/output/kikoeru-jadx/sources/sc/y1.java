package sc;

import i7.p2;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f19919a = new ConcurrentHashMap();

    public static final dd.f a(Class cls) {
        re.l lVar;
        ad.b bVarJ;
        ad.d dVarJ;
        oe.j jVar = oe.j.f16387e;
        jc.l.e(cls, "<this>");
        ClassLoader classLoaderD = ed.d.d(cls);
        g2 g2Var = new g2(classLoaderD);
        ConcurrentHashMap concurrentHashMap = f19919a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(g2Var);
        if (weakReference != null) {
            dd.f fVar = (dd.f) weakReference.get();
            if (fVar != null) {
                return fVar;
            }
            concurrentHashMap.remove(g2Var, weakReference);
        }
        dd.b bVar = new dd.b(classLoaderD);
        ClassLoader classLoader = ub.a0.class.getClassLoader();
        jc.l.d(classLoader, "getClassLoader(...)");
        dd.b bVar2 = new dd.b(classLoader);
        dd.b bVar3 = new dd.b(classLoaderD);
        String str = "runtime module for " + classLoaderD;
        dd.e eVar = dd.e.f5869a;
        dd.e eVar2 = dd.e.f5870b;
        jc.l.e(str, "moduleName");
        re.l lVar2 = new re.l("DeserializationComponentsForJava.ModuleData");
        xc.i iVar = new xc.i(lVar2);
        bd.h0 h0Var = new bd.h0(be.e.g("<" + str + '>'), lVar2, iVar, 56);
        re.n nVar = lVar2.f19011a;
        nVar.lock();
        try {
            if (iVar.f22840a == null) {
                iVar.f22840a = h0Var;
                nVar.unlock();
                iVar.f24932f = new bd.g0(h0Var, 2);
                ud.g gVar = new ud.g();
                p2 p2Var = new p2();
                b0.w1 w1Var = new b0.w1(lVar2, h0Var);
                ud.h hVar = ud.h.f21584b;
                int i10 = 9;
                ub.g gVar2 = new ub.g(1, 9, 0);
                ld.s sVar = ld.r.f12245d;
                ub.g gVar3 = sVar.f12248b;
                ld.a0 a0Var = (gVar3 == null || gVar3.f21539d - gVar2.f21539d > 0) ? sVar.f12247a : sVar.f12249c;
                jc.l.e(a0Var, "globalReportLevel");
                b7.n nVar2 = new b7.n(new ld.u(a0Var, a0Var == ld.a0.f12178c ? null : a0Var), new bd.a(i10, gVar2));
                md.h hVar2 = md.h.f15117c;
                md.h hVar3 = md.h.f15115a;
                g5.w wVar = new g5.w(lVar2);
                yc.n0 n0Var = yc.n0.f26123c;
                vc.m mVar = new vc.m(h0Var, w1Var);
                ld.b bVar4 = new ld.b(nVar2);
                od.b bVar5 = od.b.f16339a;
                td.c cVar = new td.c();
                te.k.f20742b.getClass();
                te.l lVar3 = te.j.f20741b;
                od.d dVar = new od.d(new od.a(lVar2, bVar3, bVar, gVar, hVar2, eVar, hVar3, wVar, eVar2, p2Var, hVar, n0Var, gd.a.f7513a, h0Var, mVar, bVar4, cVar, ld.l.f12228a, bVar5, lVar3, nVar2, new ud.h()));
                yd.e eVar3 = yd.e.f26197g;
                jc.l.e(eVar3, "metadataVersion");
                m0.w wVar2 = new m0.w(28, bVar, gVar);
                b7.b1 b1Var = new b7.b1(h0Var, w1Var, lVar2, bVar);
                b1Var.f1655g = eVar3;
                List listW = ud.b.w(se.k.f19967a);
                vc.i iVar2 = h0Var.f2576d;
                xc.i iVar3 = iVar2 instanceof xc.i ? (xc.i) iVar2 : null;
                ud.h hVar4 = ud.h.f21583a;
                if (iVar3 == null || (bVarJ = iVar3.J()) == null) {
                    bVarJ = ad.a.f308b;
                }
                if (iVar3 == null || (dVarJ = iVar3.J()) == null) {
                    dVarJ = ad.a.f310d;
                }
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                g2 g2Var2 = g2Var;
                oe.i iVar4 = new oe.i(lVar2, h0Var, wVar2, b1Var, dVar, eVar, hVar4, vb.r.f22819a, w1Var, bVarJ, dVarJ, ae.g.f324a, lVar3, new g5.w(lVar2), listW, jVar);
                gVar.f21582a = iVar4;
                p2Var.f9258a = new p2(dVar);
                xc.l lVarJ = iVar.J();
                xc.l lVarJ2 = iVar.J();
                g5.w wVar3 = new g5.w(lVar2);
                jc.l.e(lVarJ, "additionalClassPartsProvider");
                jc.l.e(lVarJ2, "platformDependentDeclarationFilter");
                xc.n nVar3 = new xc.n(lVar2, bVar2, h0Var);
                p2 p2Var2 = new p2(nVar3);
                pe.a aVar = pe.a.f17104m;
                nVar3.f24954c = new oe.i(lVar2, h0Var, p2Var2, new m0.w(h0Var, w1Var, aVar), nVar3, ud.b.x(new wc.a(lVar2, h0Var), new xc.g(lVar2, h0Var)), w1Var, lVarJ, lVarJ2, aVar.f15801a, lVar3, wVar3, 262144);
                h0Var.f2579g = new bd.f0(vb.l.M0(new bd.h0[]{h0Var}));
                h0Var.f2580h = new bd.o(ud.b.x(dVar, nVar3), "CompositeProvider@RuntimeModuleData for " + h0Var);
                dd.f fVar2 = new dd.f(iVar4, new c7.e1(gVar, bVar));
                while (true) {
                    g2 g2Var3 = g2Var2;
                    ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                    WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(g2Var3, new WeakReference(fVar2));
                    if (weakReference2 == null) {
                        return fVar2;
                    }
                    dd.f fVar3 = (dd.f) weakReference2.get();
                    if (fVar3 != null) {
                        return fVar3;
                    }
                    concurrentHashMap3.remove(g2Var3, weakReference2);
                    concurrentHashMap2 = concurrentHashMap3;
                    g2Var2 = g2Var3;
                }
            } else {
                lVar = lVar2;
                try {
                    throw new AssertionError("Built-ins module is already set: " + iVar.f22840a + " (attempting to reset to " + h0Var + ")");
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            lVar = lVar2;
        }
        try {
            lVar.f19012b.getClass();
            throw th;
        } catch (Throwable th4) {
            nVar.unlock();
            throw th4;
        }
    }
}
