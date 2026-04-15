package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f2990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2991b;

    static {
        x xVar = new x();
        f2990a = xVar;
        wf.b1 b1Var = new wf.b1("audio", xVar, 7);
        b1Var.b("title", false);
        b1Var.b("hash", false);
        b1Var.b("workTitle", false);
        b1Var.b("mediaStreamUrl", false);
        b1Var.b("mediaDownloadUrl", false);
        b1Var.b("streamLowQualityUrl", true);
        b1Var.b("duration", true);
        f2991b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2991b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2991b;
        vf.a aVarI = bVar.i(b1Var);
        Object objA = null;
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        String strQ4 = null;
        String strQ5 = null;
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
                    strQ2 = aVarI.q(b1Var, 1);
                    i10 |= 2;
                    break;
                case 2:
                    strQ3 = aVarI.q(b1Var, 2);
                    i10 |= 4;
                    break;
                case 3:
                    strQ4 = aVarI.q(b1Var, 3);
                    i10 |= 8;
                    break;
                case 4:
                    strQ5 = aVarI.q(b1Var, 4);
                    i10 |= 16;
                    break;
                case 5:
                    objA = aVarI.a(b1Var, 5, wf.n1.f24152a, objA);
                    i10 |= 32;
                    break;
                case 6:
                    fC = aVarI.C(b1Var, 6);
                    i10 |= 64;
                    break;
                default:
                    throw new sf.l(iB);
            }
        }
        aVarI.j(b1Var);
        return new z(i10, strQ, strQ2, strQ3, strQ4, strQ5, (String) objA, fC);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.n1 n1Var = wf.n1.f24152a;
        return new sf.a[]{n1Var, n1Var, n1Var, n1Var, n1Var, n7.b0.o(n1Var), wf.b0.f24083a};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        z zVar = (z) obj;
        jc.l.e(zVar, "value");
        wf.b1 b1Var = f2991b;
        yf.t tVarA = tVar.a(b1Var);
        y yVar = z.Companion;
        float f10 = zVar.f3002j;
        String str = zVar.f3001i;
        k0.e(zVar, tVarA, b1Var);
        tVarA.v(b1Var, 0, zVar.f2996d);
        tVarA.v(b1Var, 1, zVar.f2997e);
        tVarA.v(b1Var, 2, zVar.f2998f);
        tVarA.v(b1Var, 3, zVar.f2999g);
        tVarA.v(b1Var, 4, zVar.f3000h);
        if (tVarA.x(b1Var) || str != null) {
            tVarA.q(b1Var, 5, wf.n1.f24152a, str);
        }
        if (tVarA.x(b1Var) || !Float.valueOf(f10).equals(Float.valueOf(0.0f))) {
            tVarA.i(b1Var, 6, f10);
        }
        tVarA.w(b1Var);
    }
}
