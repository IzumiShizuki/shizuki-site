package oa;

import java.util.List;
import sf.l;
import ub.h;
import wf.b1;
import wf.c0;
import wf.n1;
import yf.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16288a;
    private static final uf.g descriptor;

    static {
        a aVar = new a();
        f16288a = aVar;
        b1 b1Var = new b1("com.cnl.kikoeru.utils.translate.DeepLAPITranslate.RequestBody", aVar, 3);
        b1Var.b("text", false);
        b1Var.b("target_lang", false);
        b1Var.b("source_lang", false);
        descriptor = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return descriptor;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a aVarI = bVar.i(gVar);
        h[] hVarArr = c.f16289d;
        List list = null;
        String strQ = null;
        String strQ2 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(gVar);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                list = (List) aVarI.g(gVar, 0, (sf.a) hVarArr[0].getValue(), list);
                i10 |= 1;
            } else if (iB == 1) {
                strQ = aVarI.q(gVar, 1);
                i10 |= 2;
            } else {
                if (iB != 2) {
                    throw new l(iB);
                }
                strQ2 = aVarI.q(gVar, 2);
                i10 |= 4;
            }
        }
        aVarI.j(gVar);
        return new c(i10, list, strQ, strQ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wf.c0
    public final sf.a[] c() {
        n1 n1Var = n1.f24152a;
        return new sf.a[]{c.f16289d[0].getValue(), n1Var, n1Var};
    }

    @Override // sf.a
    public final void d(t tVar, Object obj) {
        c cVar = (c) obj;
        jc.l.e(cVar, "value");
        uf.g gVar = descriptor;
        t tVarA = tVar.a(gVar);
        tVarA.r(gVar, 0, (sf.a) c.f16289d[0].getValue(), cVar.f16290a);
        tVarA.v(gVar, 1, cVar.f16291b);
        tVarA.v(gVar, 2, cVar.f16292c);
        tVarA.w(gVar);
    }
}
