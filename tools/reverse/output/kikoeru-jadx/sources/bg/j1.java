package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1 f2914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2915b;

    static {
        j1 j1Var = new j1();
        f2914a = j1Var;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.UserBean", j1Var, 2);
        b1Var.b("token", false);
        b1Var.b("user", true);
        f2915b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2915b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2915b;
        vf.a aVarI = bVar.i(b1Var);
        String strQ = null;
        Object objA = null;
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
                objA = aVarI.a(b1Var, 1, g1.f2893a, objA);
                i10 |= 2;
            }
        }
        aVarI.j(b1Var);
        return new l1(i10, strQ, (i1) objA);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        return new sf.a[]{wf.n1.f24152a, n7.b0.o(g1.f2893a)};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        l1 l1Var = (l1) obj;
        jc.l.e(l1Var, "value");
        wf.b1 b1Var = f2915b;
        yf.t tVarA = tVar.a(b1Var);
        i1 i1Var = l1Var.f2923b;
        tVarA.v(b1Var, 0, l1Var.f2922a);
        if (tVarA.x(b1Var) || i1Var != null) {
            tVarA.q(b1Var, 1, g1.f2893a, i1Var);
        }
        tVarA.w(b1Var);
    }
}
