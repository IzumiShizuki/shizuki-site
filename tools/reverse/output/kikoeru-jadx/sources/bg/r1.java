package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f2958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2959b;

    static {
        r1 r1Var = new r1();
        f2958a = r1Var;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.Work.OtherWork", r1Var, 4);
        b1Var.b("id", false);
        b1Var.b("lang", false);
        b1Var.b("title", false);
        b1Var.b("is_original", false);
        f2959b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2959b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2959b;
        vf.a aVarI = bVar.i(b1Var);
        long jY = 0;
        String strQ = null;
        String strQ2 = null;
        boolean z10 = true;
        int i10 = 0;
        boolean zO = false;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                jY = aVarI.y(b1Var, 0);
                i10 |= 1;
            } else if (iB == 1) {
                strQ = aVarI.q(b1Var, 1);
                i10 |= 2;
            } else if (iB == 2) {
                strQ2 = aVarI.q(b1Var, 2);
                i10 |= 4;
            } else {
                if (iB != 3) {
                    throw new sf.l(iB);
                }
                zO = aVarI.o(b1Var, 3);
                i10 |= 8;
            }
        }
        aVarI.j(b1Var);
        return new t1(i10, jY, strQ, strQ2, zO);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.n1 n1Var = wf.n1.f24152a;
        return new sf.a[]{wf.p0.f24162a, n1Var, n1Var, wf.g.f24118a};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        t1 t1Var = (t1) obj;
        jc.l.e(t1Var, "value");
        wf.b1 b1Var = f2959b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.o(b1Var, 0, t1Var.f2970a);
        tVarA.v(b1Var, 1, t1Var.f2971b);
        tVarA.v(b1Var, 2, t1Var.f2972c);
        tVarA.c(b1Var, 3, t1Var.f2973d);
        tVarA.w(b1Var);
    }
}
