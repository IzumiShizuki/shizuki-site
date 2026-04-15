package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f2994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2995b;

    static {
        y0 y0Var = new y0();
        f2994a = y0Var;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.Tag.I18n", y0Var, 3);
        b1Var.b("en-us", true);
        b1Var.b("ja-jp", true);
        b1Var.b("zh-cn", true);
        f2995b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2995b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2995b;
        vf.a aVarI = bVar.i(b1Var);
        Object objA = null;
        Object objA2 = null;
        Object objA3 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                objA = aVarI.a(b1Var, 0, b1.f2846a, objA);
                i10 |= 1;
            } else if (iB == 1) {
                objA2 = aVarI.a(b1Var, 1, b1.f2846a, objA2);
                i10 |= 2;
            } else {
                if (iB != 2) {
                    throw new sf.l(iB);
                }
                objA3 = aVarI.a(b1Var, 2, b1.f2846a, objA3);
                i10 |= 4;
            }
        }
        aVarI.j(b1Var);
        return new a1(i10, (d1) objA, (d1) objA2, (d1) objA3);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        b1 b1Var = b1.f2846a;
        return new sf.a[]{n7.b0.o(b1Var), n7.b0.o(b1Var), n7.b0.o(b1Var)};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        a1 a1Var = (a1) obj;
        jc.l.e(a1Var, "value");
        wf.b1 b1Var = f2995b;
        yf.t tVarA = tVar.a(b1Var);
        d1 d1Var = a1Var.f2817c;
        d1 d1Var2 = a1Var.f2816b;
        d1 d1Var3 = a1Var.f2815a;
        if (tVarA.x(b1Var) || d1Var3 != null) {
            tVarA.q(b1Var, 0, b1.f2846a, d1Var3);
        }
        if (tVarA.x(b1Var) || d1Var2 != null) {
            tVarA.q(b1Var, 1, b1.f2846a, d1Var2);
        }
        if (tVarA.x(b1Var) || d1Var != null) {
            tVarA.q(b1Var, 2, b1.f2846a, d1Var);
        }
        tVarA.w(b1Var);
    }
}
