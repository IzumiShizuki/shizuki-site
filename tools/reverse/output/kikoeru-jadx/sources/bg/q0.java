package bg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f2956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2957b;

    static {
        q0 q0Var = new q0();
        f2956a = q0Var;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.Subtitle", q0Var, 6);
        b1Var.b("title", false);
        b1Var.b("subPath", false);
        b1Var.b("hash", false);
        b1Var.b("ext", false);
        b1Var.b("duration", false);
        b1Var.b("confidence", false);
        f2957b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2957b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2957b;
        vf.a aVarI = bVar.i(b1Var);
        Object objG = null;
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        double dC = 0.0d;
        boolean z10 = true;
        int i10 = 0;
        float fC = 0.0f;
        while (z10) {
            int iB = aVarI.b(b1Var);
            switch (iB) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    strQ = aVarI.q(b1Var, 0);
                    i10 |= 1;
                    break;
                case 1:
                    objG = aVarI.g(b1Var, 1, new wf.d(wf.n1.f24152a, 0), objG);
                    i10 |= 2;
                    break;
                case 2:
                    strQ2 = aVarI.q(b1Var, 2);
                    i10 |= 4;
                    break;
                case 3:
                    strQ3 = aVarI.q(b1Var, 3);
                    i10 |= 8;
                    break;
                case 4:
                    fC = aVarI.C(b1Var, 4);
                    i10 |= 16;
                    break;
                case 5:
                    dC = aVarI.c(b1Var, 5);
                    i10 |= 32;
                    break;
                default:
                    throw new sf.l(iB);
            }
        }
        aVarI.j(b1Var);
        return new s0(i10, strQ, (List) objG, strQ2, strQ3, fC, dC);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.n1 n1Var = wf.n1.f24152a;
        return new sf.a[]{n1Var, new wf.d(n1Var, 0), n1Var, n1Var, wf.b0.f24083a, wf.u.f24186a};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        s0 s0Var = (s0) obj;
        jc.l.e(s0Var, "value");
        wf.b1 b1Var = f2957b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.v(b1Var, 0, s0Var.f2962a);
        tVarA.r(b1Var, 1, new wf.d(wf.n1.f24152a, 0), s0Var.f2963b);
        tVarA.v(b1Var, 2, s0Var.f2964c);
        tVarA.v(b1Var, 3, s0Var.f2965d);
        tVarA.i(b1Var, 4, s0Var.f2966e);
        double d10 = s0Var.f2967f;
        tVarA.g(b1Var, 5);
        tVarA.f(d10);
        tVarA.w(b1Var);
    }
}
