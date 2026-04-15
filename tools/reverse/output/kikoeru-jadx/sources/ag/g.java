package ag;

import java.util.List;
import wf.b1;
import wf.c0;
import wf.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b1 f334b;

    static {
        g gVar = new g();
        f333a = gVar;
        b1 b1Var = new b1("loli.ball.asmr.AsmrOneApi.NewTagResult", gVar, 3);
        b1Var.b("existingWorkTags", false);
        b1Var.b("newTags", false);
        b1Var.b("unknownTags", false);
        f334b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f334b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        b1 b1Var = f334b;
        vf.a aVarI = bVar.i(b1Var);
        Object objG = null;
        Object objG2 = null;
        Object objG3 = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            if (iB == -1) {
                z10 = false;
            } else if (iB == 0) {
                objG = aVarI.g(b1Var, 0, new wf.d(k0.f24138a, 0), objG);
                i10 |= 1;
            } else if (iB == 1) {
                objG2 = aVarI.g(b1Var, 1, new wf.d(k0.f24138a, 0), objG2);
                i10 |= 2;
            } else {
                if (iB != 2) {
                    throw new sf.l(iB);
                }
                objG3 = aVarI.g(b1Var, 2, new wf.d(k0.f24138a, 0), objG3);
                i10 |= 4;
            }
        }
        aVarI.j(b1Var);
        return new i(i10, (List) objG, (List) objG2, (List) objG3);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        k0 k0Var = k0.f24138a;
        return new sf.a[]{new wf.d(k0Var, 0), new wf.d(k0Var, 0), new wf.d(k0Var, 0)};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        i iVar = (i) obj;
        jc.l.e(iVar, "value");
        b1 b1Var = f334b;
        yf.t tVarA = tVar.a(b1Var);
        k0 k0Var = k0.f24138a;
        tVarA.r(b1Var, 0, new wf.d(k0Var, 0), iVar.f335a);
        tVarA.r(b1Var, 1, new wf.d(k0Var, 0), iVar.f336b);
        tVarA.r(b1Var, 2, new wf.d(k0Var, 0), iVar.f337c);
        tVarA.w(b1Var);
    }
}
