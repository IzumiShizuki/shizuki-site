package ag;

import wf.b1;
import wf.c0;
import wf.k0;
import wf.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b1 f352b;

    static {
        p pVar = new p();
        f351a = pVar;
        b1 b1Var = new b1("loli.ball.asmr.AsmrOneApi.VoteRequest", pVar, 3);
        b1Var.b("workID", false);
        b1Var.b("tagID", false);
        b1Var.b("status", false);
        f352b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f352b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        b1 b1Var = f352b;
        vf.a aVarI = bVar.i(b1Var);
        long jY = 0;
        boolean z10 = true;
        int i10 = 0;
        int iT = 0;
        int iT2 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                jY = aVarI.y(b1Var, 0);
                i10 |= 1;
            } else if (iB == 1) {
                iT = aVarI.t(b1Var, 1);
                i10 |= 2;
            } else {
                if (iB != 2) {
                    throw new sf.l(iB);
                }
                iT2 = aVarI.t(b1Var, 2);
                i10 |= 4;
            }
        }
        aVarI.j(b1Var);
        return new r(i10, iT, iT2, jY);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        k0 k0Var = k0.f24138a;
        return new sf.a[]{p0.f24162a, k0Var, k0Var};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        r rVar = (r) obj;
        jc.l.e(rVar, "value");
        b1 b1Var = f352b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.o(b1Var, 0, rVar.f353a);
        tVarA.m(1, rVar.f354b, b1Var);
        tVarA.m(2, rVar.f355c, b1Var);
        tVarA.w(b1Var);
    }
}
