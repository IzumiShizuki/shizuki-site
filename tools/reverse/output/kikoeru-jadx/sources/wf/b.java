package wf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements sf.a {
    @Override // sf.a
    public final Object b(vf.b bVar) {
        uf.g gVarA = a();
        vf.a aVarI = bVar.i(gVarA);
        Object objG = null;
        String strQ = null;
        while (true) {
            int iB = aVarI.b(a());
            if (iB == -1) {
                if (objG == null) {
                    throw new IllegalArgumentException(j2.h0.x("Polymorphic value has not been read for class ", strQ).toString());
                }
                aVarI.j(gVarA);
                return objG;
            }
            if (iB == 0) {
                strQ = aVarI.q(a(), iB);
            } else {
                if (iB != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strQ == null) {
                        strQ = "unknown class";
                    }
                    sb.append(strQ);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iB);
                    throw new sf.h(sb.toString());
                }
                if (strQ == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                objG = aVarI.g(a(), iB, n7.d.o(this, aVarI, strQ), null);
            }
        }
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        jc.l.e(obj, "value");
        sf.a aVarP = n7.d.p(this, tVar, obj);
        uf.g gVarA = a();
        yf.t tVarA = tVar.a(gVarA);
        tVarA.v(a(), 0, aVarP.a().m());
        tVarA.r(a(), 1, aVarP, obj);
        tVarA.w(gVarA);
    }

    public sf.a e(vf.a aVar, String str) {
        d0.y yVarP = aVar.p();
        pc.c cVarG = g();
        yVarP.getClass();
        jc.l.e(cVarG, "baseClass");
        Map map = (Map) ((Map) yVarP.f5434e).get(cVarG);
        sf.a aVar2 = map != null ? (sf.a) map.get(str) : null;
        if (!(aVar2 instanceof sf.a)) {
            aVar2 = null;
        }
        if (aVar2 != null) {
            return aVar2;
        }
        Object obj = ((Map) yVarP.f5435f).get(cVarG);
        ic.k kVar = jc.c0.d(1, obj) ? (ic.k) obj : null;
        if (kVar != null) {
            return (sf.a) kVar.a(str);
        }
        return null;
    }

    public sf.a f(yf.t tVar, Object obj) {
        jc.l.e(obj, "value");
        d0.y yVar = tVar.f26327e;
        pc.c cVarG = g();
        yVar.getClass();
        jc.l.e(cVarG, "baseClass");
        if (cVarG.z(obj)) {
            Map map = (Map) ((Map) yVar.f5432c).get(cVarG);
            sf.a aVar = map != null ? (sf.a) map.get(jc.z.f10839a.b(obj.getClass())) : null;
            sf.a aVar2 = aVar instanceof sf.a ? aVar : null;
            if (aVar2 != null) {
                return aVar2;
            }
            Object obj2 = ((Map) yVar.f5433d).get(cVarG);
            ic.k kVar = jc.c0.d(1, obj2) ? (ic.k) obj2 : null;
            if (kVar != null) {
                return (sf.a) kVar.a(obj);
            }
        }
        return null;
    }

    public abstract pc.c g();
}
