package td;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m0.w;
import vb.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20707b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ub.k f20708c = new ub.k("V", null);

    public o(w wVar, String str, String str2) {
        this.f20706a = str2;
    }

    public final void a(String str, d... dVarArr) {
        r rVar;
        jc.l.e(str, "type");
        if (dVarArr.length == 0) {
            rVar = null;
        } else {
            df.o oVarO0 = vb.l.O0(dVarArr);
            int iT = vb.w.t(vb.n.K(oVarO0, 10));
            if (iT < 16) {
                iT = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iT);
            Iterator it = oVarO0.iterator();
            while (true) {
                df.b bVar = (df.b) it;
                if (!bVar.f5974b.hasNext()) {
                    break;
                }
                u uVar = (u) bVar.next();
                linkedHashMap.put(Integer.valueOf(uVar.f22822a), (d) uVar.f22823b);
            }
            rVar = new r(linkedHashMap);
        }
        this.f20707b.add(new ub.k(str, rVar));
    }

    public final void b(String str, d... dVarArr) {
        jc.l.e(str, "type");
        df.o oVarO0 = vb.l.O0(dVarArr);
        int iT = vb.w.t(vb.n.K(oVarO0, 10));
        if (iT < 16) {
            iT = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iT);
        Iterator it = oVarO0.iterator();
        while (true) {
            df.b bVar = (df.b) it;
            if (!bVar.f5974b.hasNext()) {
                this.f20708c = new ub.k(str, new r(linkedHashMap));
                return;
            } else {
                u uVar = (u) bVar.next();
                linkedHashMap.put(Integer.valueOf(uVar.f22822a), (d) uVar.f22823b);
            }
        }
    }

    public final void c(je.c cVar) {
        jc.l.e(cVar, "type");
        String strC = cVar.c();
        jc.l.d(strC, "getDesc(...)");
        this.f20708c = new ub.k(strC, null);
    }
}
