package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f2893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2894b;

    static {
        g1 g1Var = new g1();
        f2893a = g1Var;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.User", g1Var, 5);
        b1Var.b("group", false);
        b1Var.b("loggedIn", false);
        b1Var.b("name", false);
        b1Var.b("recommenderUuid", false);
        b1Var.b("email", true);
        f2894b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2894b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2894b;
        vf.a aVarI = bVar.i(b1Var);
        Object objA = null;
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        boolean z10 = true;
        int i10 = 0;
        boolean zO = false;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                strQ = aVarI.q(b1Var, 0);
                i10 |= 1;
            } else if (iB == 1) {
                zO = aVarI.o(b1Var, 1);
                i10 |= 2;
            } else if (iB == 2) {
                strQ2 = aVarI.q(b1Var, 2);
                i10 |= 4;
            } else if (iB == 3) {
                strQ3 = aVarI.q(b1Var, 3);
                i10 |= 8;
            } else {
                if (iB != 4) {
                    throw new sf.l(iB);
                }
                objA = aVarI.a(b1Var, 4, wf.n1.f24152a, objA);
                i10 |= 16;
            }
        }
        aVarI.j(b1Var);
        return new i1(i10, strQ, zO, strQ2, strQ3, (String) objA);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.n1 n1Var = wf.n1.f24152a;
        return new sf.a[]{n1Var, wf.g.f24118a, n1Var, n1Var, n7.b0.o(n1Var)};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        i1 i1Var = (i1) obj;
        jc.l.e(i1Var, "value");
        wf.b1 b1Var = f2894b;
        yf.t tVarA = tVar.a(b1Var);
        String str = i1Var.f2903e;
        tVarA.v(b1Var, 0, i1Var.f2899a);
        tVarA.c(b1Var, 1, i1Var.f2900b);
        tVarA.v(b1Var, 2, i1Var.f2901c);
        tVarA.v(b1Var, 3, i1Var.f2902d);
        if (tVarA.x(b1Var) || str != null) {
            tVarA.q(b1Var, 4, wf.n1.f24152a, str);
        }
        tVarA.w(b1Var);
    }
}
