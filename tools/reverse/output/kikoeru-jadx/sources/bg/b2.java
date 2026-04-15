package bg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f2848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2849b;

    static {
        b2 b2Var = new b2();
        f2848a = b2Var;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.Works", b2Var, 2);
        b1Var.b("pagination", false);
        b1Var.b("works", false);
        f2849b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2849b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2849b;
        vf.a aVarI = bVar.i(b1Var);
        Object objG = null;
        Object objG2 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                objG = aVarI.g(b1Var, 0, m.Companion.serializer(), objG);
                i10 |= 1;
            } else {
                if (iB != 1) {
                    throw new sf.l(iB);
                }
                objG2 = aVarI.g(b1Var, 1, new wf.d(p1.f2952a, 0), objG2);
                i10 |= 2;
            }
        }
        aVarI.j(b1Var);
        return new d2(i10, (m) objG, (List) objG2);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        return new sf.a[]{m.Companion.serializer(), new wf.d(p1.f2952a, 0)};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        d2 d2Var = (d2) obj;
        jc.l.e(d2Var, "value");
        wf.b1 b1Var = f2849b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.r(b1Var, 0, m.Companion.serializer(), d2Var.f2861a);
        tVarA.r(b1Var, 1, new wf.d(p1.f2952a, 0), d2Var.f2862b);
        tVarA.w(b1Var);
    }
}
