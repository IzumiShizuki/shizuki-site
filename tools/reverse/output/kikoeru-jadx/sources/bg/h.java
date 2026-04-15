package bg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f2895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2896b;

    static {
        h hVar = new h();
        f2895a = hVar;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.LrcResult", hVar, 5);
        b1Var.b("result", true);
        b1Var.b("message", true);
        b1Var.b("hash", false);
        b1Var.b("lyricExtension", true);
        b1Var.b("lrc", true);
        f2896b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2896b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2896b;
        vf.a aVarI = bVar.i(b1Var);
        Object objA = null;
        Object objA2 = null;
        Object objA3 = null;
        Object objA4 = null;
        String strQ = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                objA = aVarI.a(b1Var, 0, wf.g.f24118a, objA);
                i10 |= 1;
            } else if (iB == 1) {
                objA2 = aVarI.a(b1Var, 1, wf.n1.f24152a, objA2);
                i10 |= 2;
            } else if (iB == 2) {
                strQ = aVarI.q(b1Var, 2);
                i10 |= 4;
            } else if (iB == 3) {
                objA3 = aVarI.a(b1Var, 3, wf.n1.f24152a, objA3);
                i10 |= 8;
            } else {
                if (iB != 4) {
                    throw new sf.l(iB);
                }
                objA4 = aVarI.a(b1Var, 4, new wf.d(e.f2863a, 0), objA4);
                i10 |= 16;
            }
        }
        aVarI.j(b1Var);
        return new j(i10, (Boolean) objA, (String) objA2, strQ, (String) objA3, (List) objA4);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        sf.a aVarO = n7.b0.o(wf.g.f24118a);
        wf.n1 n1Var = wf.n1.f24152a;
        return new sf.a[]{aVarO, n7.b0.o(n1Var), n1Var, n7.b0.o(n1Var), n7.b0.o(new wf.d(e.f2863a, 0))};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        j jVar = (j) obj;
        jc.l.e(jVar, "value");
        wf.b1 b1Var = f2896b;
        yf.t tVarA = tVar.a(b1Var);
        List list = jVar.f2908e;
        String str = jVar.f2907d;
        String str2 = jVar.f2905b;
        Boolean bool = jVar.f2904a;
        if (tVarA.x(b1Var) || !jc.l.a(bool, Boolean.TRUE)) {
            tVarA.q(b1Var, 0, wf.g.f24118a, bool);
        }
        if (tVarA.x(b1Var) || str2 != null) {
            tVarA.q(b1Var, 1, wf.n1.f24152a, str2);
        }
        tVarA.v(b1Var, 2, jVar.f2906c);
        if (tVarA.x(b1Var) || str != null) {
            tVarA.q(b1Var, 3, wf.n1.f24152a, str);
        }
        if (tVarA.x(b1Var) || list != null) {
            tVarA.q(b1Var, 4, new wf.d(e.f2863a, 0), list);
        }
        tVarA.w(b1Var);
    }
}
