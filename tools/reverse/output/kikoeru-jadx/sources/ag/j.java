package ag;

import wf.b1;
import wf.c0;
import wf.n1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b1 f339b;

    static {
        j jVar = new j();
        f338a = jVar;
        b1 b1Var = new b1("loli.ball.asmr.AsmrOneApi.PlaylistBean", jVar, 2);
        b1Var.b("id", false);
        b1Var.b("liked", true);
        f339b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f339b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        b1 b1Var = f339b;
        vf.a aVarI = bVar.i(b1Var);
        String strQ = null;
        boolean z10 = true;
        int i10 = 0;
        boolean zO = false;
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
                zO = aVarI.o(b1Var, 1);
                i10 |= 2;
            }
        }
        aVarI.j(b1Var);
        return new l(strQ, zO, i10);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        return new sf.a[]{n1.f24152a, wf.g.f24118a};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        l lVar = (l) obj;
        jc.l.e(lVar, "value");
        b1 b1Var = f339b;
        yf.t tVarA = tVar.a(b1Var);
        boolean z10 = lVar.f341b;
        tVarA.v(b1Var, 0, lVar.f340a);
        if (tVarA.x(b1Var) || z10) {
            tVarA.c(b1Var, 1, z10);
        }
        tVarA.w(b1Var);
    }
}
