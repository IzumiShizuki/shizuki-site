package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f2927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2928b;

    static {
        m1 m1Var = new m1();
        f2927a = m1Var;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.Va", m1Var, 3);
        b1Var.b("count", true);
        b1Var.b("id", false);
        b1Var.b("name", false);
        f2928b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2928b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2928b;
        vf.a aVarI = bVar.i(b1Var);
        Object objA = null;
        String strQ = null;
        String strQ2 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                objA = aVarI.a(b1Var, 0, wf.k0.f24138a, objA);
                i10 |= 1;
            } else if (iB == 1) {
                strQ = aVarI.q(b1Var, 1);
                i10 |= 2;
            } else {
                if (iB != 2) {
                    throw new sf.l(iB);
                }
                strQ2 = aVarI.q(b1Var, 2);
                i10 |= 4;
            }
        }
        aVarI.j(b1Var);
        return new o1(i10, (Integer) objA, strQ, strQ2);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.n1 n1Var = wf.n1.f24152a;
        return new sf.a[]{n7.b0.o(wf.k0.f24138a), n1Var, n1Var};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        o1 o1Var = (o1) obj;
        jc.l.e(o1Var, "value");
        wf.b1 b1Var = f2928b;
        yf.t tVarA = tVar.a(b1Var);
        Integer num = o1Var.f2934a;
        if (tVarA.x(b1Var) || num != null) {
            tVarA.q(b1Var, 0, wf.k0.f24138a, num);
        }
        tVarA.v(b1Var, 1, o1Var.f2935b);
        tVarA.v(b1Var, 2, o1Var.f2936c);
        tVarA.w(b1Var);
    }
}
