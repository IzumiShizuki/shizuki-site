package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f2976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2977b;

    static {
        u1 u1Var = new u1();
        f2976a = u1Var;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.Work.Rank", u1Var, 4);
        b1Var.b("category", false);
        b1Var.b("rank", false);
        b1Var.b("rank_date", false);
        b1Var.b("term", false);
        f2977b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2977b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2977b;
        vf.a aVarI = bVar.i(b1Var);
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        boolean z10 = true;
        int i10 = 0;
        int iT = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                strQ = aVarI.q(b1Var, 0);
                i10 |= 1;
            } else if (iB == 1) {
                iT = aVarI.t(b1Var, 1);
                i10 |= 2;
            } else if (iB == 2) {
                strQ2 = aVarI.q(b1Var, 2);
                i10 |= 4;
            } else {
                if (iB != 3) {
                    throw new sf.l(iB);
                }
                strQ3 = aVarI.q(b1Var, 3);
                i10 |= 8;
            }
        }
        aVarI.j(b1Var);
        return new w1(i10, strQ, iT, strQ2, strQ3);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.n1 n1Var = wf.n1.f24152a;
        return new sf.a[]{n1Var, wf.k0.f24138a, n1Var, n1Var};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        w1 w1Var = (w1) obj;
        jc.l.e(w1Var, "value");
        wf.b1 b1Var = f2977b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.v(b1Var, 0, w1Var.f2986a);
        tVarA.m(1, w1Var.f2987b, b1Var);
        tVarA.v(b1Var, 2, w1Var.f2988c);
        tVarA.v(b1Var, 3, w1Var.f2989d);
        tVarA.w(b1Var);
    }
}
