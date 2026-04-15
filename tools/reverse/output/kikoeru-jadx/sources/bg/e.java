package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f2863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2864b;

    static {
        e eVar = new e();
        f2863a = eVar;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.LrcItem", eVar, 2);
        b1Var.b("time", false);
        b1Var.b("text", false);
        f2864b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2864b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2864b;
        vf.a aVarI = bVar.i(b1Var);
        String strQ = null;
        boolean z10 = true;
        int i10 = 0;
        int iT = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                iT = aVarI.t(b1Var, 0);
                i10 |= 1;
            } else {
                if (iB != 1) {
                    throw new sf.l(iB);
                }
                strQ = aVarI.q(b1Var, 1);
                i10 |= 2;
            }
        }
        aVarI.j(b1Var);
        return new g(i10, iT, strQ);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        return new sf.a[]{wf.k0.f24138a, wf.n1.f24152a};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        g gVar = (g) obj;
        jc.l.e(gVar, "value");
        wf.b1 b1Var = f2864b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.m(0, gVar.f2886a, b1Var);
        tVarA.v(b1Var, 1, gVar.f2887b);
        tVarA.w(b1Var);
    }
}
