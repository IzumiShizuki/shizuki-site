package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f2897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2898b;

    static {
        h0 h0Var = new h0();
        f2897a = h0Var;
        wf.b1 b1Var = new wf.b1("text", h0Var, 5);
        b1Var.b("title", false);
        b1Var.b("hash", false);
        b1Var.b("workTitle", false);
        b1Var.b("mediaStreamUrl", false);
        b1Var.b("mediaDownloadUrl", false);
        f2898b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2898b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2898b;
        vf.a aVarI = bVar.i(b1Var);
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        String strQ4 = null;
        String strQ5 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                strQ = aVarI.q(b1Var, 0);
                i10 |= 1;
            } else if (iB == 1) {
                strQ2 = aVarI.q(b1Var, 1);
                i10 |= 2;
            } else if (iB == 2) {
                strQ3 = aVarI.q(b1Var, 2);
                i10 |= 4;
            } else if (iB == 3) {
                strQ4 = aVarI.q(b1Var, 3);
                i10 |= 8;
            } else {
                if (iB != 4) {
                    throw new sf.l(iB);
                }
                strQ5 = aVarI.q(b1Var, 4);
                i10 |= 16;
            }
        }
        aVarI.j(b1Var);
        return new j0(i10, strQ, strQ2, strQ3, strQ4, strQ5);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.n1 n1Var = wf.n1.f24152a;
        return new sf.a[]{n1Var, n1Var, n1Var, n1Var, n1Var};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        j0 j0Var = (j0) obj;
        jc.l.e(j0Var, "value");
        wf.b1 b1Var = f2898b;
        yf.t tVarA = tVar.a(b1Var);
        i0 i0Var = j0.Companion;
        k0.e(j0Var, tVarA, b1Var);
        tVarA.v(b1Var, 0, j0Var.f2909d);
        tVarA.v(b1Var, 1, j0Var.f2910e);
        tVarA.v(b1Var, 2, j0Var.f2911f);
        tVarA.v(b1Var, 3, j0Var.f2912g);
        tVarA.v(b1Var, 4, j0Var.f2913h);
        tVarA.w(b1Var);
    }
}
