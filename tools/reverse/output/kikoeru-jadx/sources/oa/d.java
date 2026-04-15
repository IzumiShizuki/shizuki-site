package oa;

import b7.b1;
import com.cnl.kikoeru.MainApplication;
import ef.n;
import j2.h0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import jc.l;
import jc.z;
import na.w;
import pc.f0;
import ug.b0;
import ug.d0;
import ug.v;
import ug.x;
import xf.m;
import xf.o;
import xf.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f16293a = new d();

    @Override // oa.e
    public final Serializable a(String str, String str2, String str3) {
        l.e(str, "text");
        l.e(str2, "src");
        l.e(str3, "dst");
        return h0.b(this, str, str2, str3, 5000);
    }

    @Override // oa.e
    public final Serializable b(String str, String str2, String str3) {
        l.e(str, "text");
        l.e(str2, "src");
        l.e(str3, "dst");
        try {
            if (str2.equals("zh-CN")) {
                str2 = "zh";
            }
            if (str3.equals("zh-CN")) {
                str3 = "zh";
            }
            String str4 = (String) f0.P(gg.c.a(), "deeplApiKey", "", z.a(String.class)).a();
            c cVar = new c(str3, str2, n.K0(str, new String[]{"\n"}));
            ch.l lVar = new ch.l(10);
            lVar.B("https://api-free.deepl.com/v2/translate");
            ug.z zVar = b0.f21724a;
            r rVar = w.f15765a;
            rVar.getClass();
            String strB = rVar.b(c.Companion.serializer(), cVar);
            ef.l lVar2 = v.f21877c;
            lVar.z(ud.e.q(strB, vb.w.h("application/json")));
            lVar.w("Content-Type", "application/json");
            lVar.w("Authorization", "DeepL-Auth-Key " + str4);
            b1 b1Var = new b1(lVar);
            x xVar = MainApplication.f4296b;
            if (xVar == null) {
                l.k("DEFAULT_OKHTTP_CLIENT");
                throw null;
            }
            d0 d0VarF = xVar.a(b1Var).f();
            xf.b bVar = xf.c.f24987d;
            String strN = d0VarF.f21762g.n();
            bVar.getClass();
            l.e(strN, "string");
            Object obj = xf.n.e((m) bVar.a(strN, o.f25013a)).get("translations");
            l.b(obj);
            m mVar = (m) obj;
            xf.e eVar = mVar instanceof xf.e ? (xf.e) mVar : null;
            if (eVar == null) {
                xf.n.b("JsonArray", mVar);
                throw null;
            }
            ArrayList arrayList = new ArrayList(vb.n.K(eVar, 10));
            Iterator it = eVar.f24993a.iterator();
            while (it.hasNext()) {
                arrayList.add((m) xf.n.e((m) it.next()).get("text"));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (obj2 != null) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(vb.n.K(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(xf.n.f((m) it2.next()).a());
            }
            return vb.m.f0(arrayList3, "\n", null, null, null, 62);
        } catch (Throwable th2) {
            return ub.a.b(th2);
        }
    }
}
