package ag;

import wf.b1;
import wf.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b1 f357b;

    static {
        s sVar = new s();
        f356a = sVar;
        b1 b1Var = new b1("loli.ball.asmr.AsmrOneApi.VoteResult", sVar, 1);
        b1Var.b("success", false);
        f357b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f357b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        b1 b1Var = f357b;
        vf.a aVarI = bVar.i(b1Var);
        boolean z10 = true;
        int i10 = 0;
        boolean zO = false;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else {
                if (iB != 0) {
                    throw new sf.l(iB);
                }
                zO = aVarI.o(b1Var, 0);
                i10 = 1;
            }
        }
        aVarI.j(b1Var);
        return new u(i10, zO);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        return new sf.a[]{wf.g.f24118a};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        u uVar = (u) obj;
        jc.l.e(uVar, "value");
        b1 b1Var = f357b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.c(b1Var, 0, uVar.f358a);
        tVarA.w(b1Var);
    }
}
