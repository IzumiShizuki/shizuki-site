package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2814b;

    static {
        a aVar = new a();
        f2813a = aVar;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.Circle", aVar, 3);
        b1Var.b("count", true);
        b1Var.b("id", false);
        b1Var.b("name", false);
        f2814b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2814b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2814b;
        vf.a aVarI = bVar.i(b1Var);
        Object objA = null;
        String strQ = null;
        boolean z10 = true;
        int i10 = 0;
        int iT = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                objA = aVarI.a(b1Var, 0, wf.k0.f24138a, objA);
                i10 |= 1;
            } else if (iB == 1) {
                iT = aVarI.t(b1Var, 1);
                i10 |= 2;
            } else {
                if (iB != 2) {
                    throw new sf.l(iB);
                }
                strQ = aVarI.q(b1Var, 2);
                i10 |= 4;
            }
        }
        aVarI.j(b1Var);
        return new c(i10, (Integer) objA, iT, strQ);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.k0 k0Var = wf.k0.f24138a;
        return new sf.a[]{n7.b0.o(k0Var), k0Var, wf.n1.f24152a};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        c cVar = (c) obj;
        jc.l.e(cVar, "value");
        wf.b1 b1Var = f2814b;
        yf.t tVarA = tVar.a(b1Var);
        Integer num = cVar.f2850a;
        if (tVarA.x(b1Var) || num != null) {
            tVarA.q(b1Var, 0, wf.k0.f24138a, num);
        }
        tVarA.m(1, cVar.f2851b, b1Var);
        tVarA.v(b1Var, 2, cVar.f2852c);
        tVarA.w(b1Var);
    }
}
