package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f2968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2969b;

    static {
        t0 t0Var = new t0();
        f2968a = t0Var;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.SubtitleQuery", t0Var, 3);
        b1Var.b("intProductID", false);
        b1Var.b("mediaDuration", false);
        b1Var.b("mediaFileName", false);
        f2969b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2969b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2969b;
        vf.a aVarI = bVar.i(b1Var);
        long jY = 0;
        String strQ = null;
        boolean z10 = true;
        float fC = 0.0f;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                jY = aVarI.y(b1Var, 0);
                i10 |= 1;
            } else if (iB == 1) {
                fC = aVarI.C(b1Var, 1);
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
        return new v0(jY, strQ, fC, i10);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        return new sf.a[]{wf.p0.f24162a, wf.b0.f24083a, wf.n1.f24152a};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        v0 v0Var = (v0) obj;
        jc.l.e(v0Var, "value");
        wf.b1 b1Var = f2969b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.o(b1Var, 0, v0Var.f2981a);
        tVarA.i(b1Var, 1, v0Var.f2982b);
        tVarA.v(b1Var, 2, v0Var.f2983c);
        tVarA.w(b1Var);
    }
}
