package ag;

import java.util.List;
import wf.b1;
import wf.c0;
import wf.k0;
import wf.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b1 f330b;

    static {
        d dVar = new d();
        f329a = dVar;
        b1 b1Var = new b1("loli.ball.asmr.AsmrOneApi.NewTagRequest", dVar, 2);
        b1Var.b("workID", false);
        b1Var.b("tagIDs", false);
        f330b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f330b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        b1 b1Var = f330b;
        vf.a aVarI = bVar.i(b1Var);
        long jY = 0;
        Object objG = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                jY = aVarI.y(b1Var, 0);
                i10 |= 1;
            } else {
                if (iB != 1) {
                    throw new sf.l(iB);
                }
                objG = aVarI.g(b1Var, 1, new wf.d(k0.f24138a, 0), objG);
                i10 |= 2;
            }
        }
        aVarI.j(b1Var);
        return new f(i10, jY, (List) objG);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        return new sf.a[]{p0.f24162a, new wf.d(k0.f24138a, 0)};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        f fVar = (f) obj;
        jc.l.e(fVar, "value");
        b1 b1Var = f330b;
        yf.t tVarA = tVar.a(b1Var);
        tVarA.o(b1Var, 0, fVar.f331a);
        tVarA.r(b1Var, 1, new wf.d(k0.f24138a, 0), fVar.f332b);
        tVarA.w(b1Var);
    }
}
