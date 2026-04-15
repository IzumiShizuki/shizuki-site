package ag;

import wf.b1;
import wf.c0;
import wf.n1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b1 f326b;

    static {
        a aVar = new a();
        f325a = aVar;
        b1 b1Var = new b1("loli.ball.asmr.AsmrOneApi.LoginRequest", aVar, 2);
        b1Var.b("name", false);
        b1Var.b("password", false);
        f326b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f326b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        b1 b1Var = f326b;
        vf.a aVarI = bVar.i(b1Var);
        String strQ = null;
        String strQ2 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                strQ = aVarI.q(b1Var, 0);
                i10 |= 1;
            } else {
                if (iB != 1) {
                    throw new sf.l(iB);
                }
                strQ2 = aVarI.q(b1Var, 1);
                i10 |= 2;
            }
        }
        aVarI.j(b1Var);
        return new c(i10, strQ, strQ2);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        n1 n1Var = n1.f24152a;
        return new sf.a[]{n1Var, n1Var};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        c cVar = (c) obj;
        jc.l.e(cVar, "value");
        b1 b1Var = f326b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.v(b1Var, 0, cVar.f327a);
        tVarA.v(b1Var, 1, cVar.f328b);
        tVarA.w(b1Var);
    }
}
