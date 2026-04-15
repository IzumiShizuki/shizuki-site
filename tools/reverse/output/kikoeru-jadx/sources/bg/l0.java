package bg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f2920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2921b;

    static {
        l0 l0Var = new l0();
        f2920a = l0Var;
        wf.b1 b1Var = new wf.b1("folder", l0Var, 2);
        b1Var.b("title", false);
        b1Var.b("children", false);
        f2921b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2921b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2921b;
        vf.a aVarI = bVar.i(b1Var);
        String strQ = null;
        Object objG = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                strQ = aVarI.q(b1Var, 0);
                i10 |= 1;
            } else {
                if (iB != 1) {
                    throw new sf.l(iB);
                }
                objG = aVarI.g(b1Var, 1, new wf.d(o0.Companion.serializer(), 0), objG);
                i10 |= 2;
            }
        }
        aVarI.j(b1Var);
        return new n0(i10, strQ, (List) objG);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        return new sf.a[]{wf.n1.f24152a, new wf.d(o0.Companion.serializer(), 0)};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        n0 n0Var = (n0) obj;
        jc.l.e(n0Var, "value");
        wf.b1 b1Var = f2921b;
        yf.t tVarA = tVar.a(b1Var);
        m0 m0Var = n0.Companion;
        tVarA.v(b1Var, 0, n0Var.f2931b);
        tVarA.r(b1Var, 1, new wf.d(o0.Companion.serializer(), 0), n0Var.f2932c);
        tVarA.w(b1Var);
    }
}
