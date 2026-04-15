package sc;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b2 extends jc.a0 {
    public static i0 k(jc.d dVar) {
        pc.e eVarI = dVar.i();
        return eVarI instanceof i0 ? (i0) eVarI : f.f19795b;
    }

    @Override // jc.a0
    public final pc.f a(jc.j jVar) {
        i0 i0VarK = k(jVar);
        String str = jVar.f10821d;
        String str2 = jVar.f10822e;
        Object obj = jVar.f10819b;
        jc.l.e(str, "name");
        jc.l.e(str2, "signature");
        return new k0(i0VarK, str, str2, null, obj);
    }

    @Override // jc.a0
    public final pc.c b(Class cls) {
        return d.a(cls);
    }

    @Override // jc.a0
    public final pc.e c(Class cls) {
        e eVar = d.f19781a;
        jc.l.e(cls, "jClass");
        return (pc.e) d.f19782b.b(cls);
    }

    @Override // jc.a0
    public final pc.i d(jc.n nVar) {
        return new m0(k(nVar), nVar.f10821d, nVar.f10822e, nVar.f10819b);
    }

    @Override // jc.a0
    public final pc.k e(jc.o oVar) {
        return new o0(k(oVar), oVar.f10821d, oVar.f10822e, oVar.f10819b);
    }

    @Override // jc.a0
    public final pc.r f(jc.r rVar) {
        return new d1(k(rVar), rVar.f10821d, rVar.f10822e, rVar.f10819b);
    }

    @Override // jc.a0
    public final pc.t g(jc.s sVar) {
        return new g1(k(sVar), sVar.f10821d, sVar.f10822e, sVar.f10819b);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    @Override // jc.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(jc.i r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.b2.h(jc.i):java.lang.String");
    }

    @Override // jc.a0
    public final String i(jc.m mVar) {
        return h(mVar);
    }

    @Override // jc.a0
    public final pc.v j(pc.c cVar, List list) {
        if (!(cVar instanceof jc.e)) {
            return n7.d.l(cVar, list, false, Collections.EMPTY_LIST);
        }
        Class clsB = ((jc.e) cVar).b();
        e eVar = d.f19781a;
        jc.l.e(clsB, "jClass");
        jc.l.e(list, "arguments");
        if (list.isEmpty()) {
            return (pc.v) d.f19783c.b(clsB);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) d.f19784d.b(clsB);
        ub.k kVar = new ub.k(list, Boolean.FALSE);
        Object obj = concurrentHashMap.get(kVar);
        if (obj == null) {
            v1 v1VarL = n7.d.l(d.a(clsB), list, false, vb.r.f22819a);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(kVar, v1VarL);
            obj = objPutIfAbsent == null ? v1VarL : objPutIfAbsent;
        }
        return (pc.v) obj;
    }
}
