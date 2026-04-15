package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f2846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2847b;

    static {
        b1 b1Var = new b1();
        f2846a = b1Var;
        wf.b1 b1Var2 = new wf.b1("loli.ball.asmr.bean.Tag.Language", b1Var, 1);
        b1Var2.b("name", false);
        f2847b = b1Var2;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2847b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2847b;
        vf.a aVarI = bVar.i(b1Var);
        Object objA = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else {
                if (iB != 0) {
                    throw new sf.l(iB);
                }
                objA = aVarI.a(b1Var, 0, wf.n1.f24152a, objA);
                i10 = 1;
            }
        }
        aVarI.j(b1Var);
        return new d1(i10, (String) objA);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        return new sf.a[]{n7.b0.o(wf.n1.f24152a)};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        d1 d1Var = (d1) obj;
        jc.l.e(d1Var, "value");
        wf.b1 b1Var = f2847b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.q(b1Var, 0, wf.n1.f24152a, d1Var.f2860a);
        tVarA.w(b1Var);
    }
}
