package ag;

import bg.e2;
import java.util.List;
import wf.b1;
import wf.c0;
import wf.k0;
import wf.n1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b1 f360b;

    static {
        v vVar = new v();
        f359a = vVar;
        b1 b1Var = new b1("loli.ball.asmr.AsmrOneApi.WorksV2Params", vVar, 7);
        b1Var.b("page", false);
        b1Var.b("order", false);
        b1Var.b("sort", false);
        b1Var.b("seed", false);
        b1Var.b("subtitle", false);
        b1Var.b("localSubtitledWorks", false);
        b1Var.b("includeTranslationWorks", true);
        f360b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f360b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        b1 b1Var = f360b;
        vf.a aVarI = bVar.i(b1Var);
        Object objG = null;
        Object objG2 = null;
        Object objG3 = null;
        boolean z10 = true;
        int i10 = 0;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        boolean zO = false;
        while (z10) {
            int iB = aVarI.b(b1Var);
            switch (iB) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    iT = aVarI.t(b1Var, 0);
                    i10 |= 1;
                    break;
                case 1:
                    objG = aVarI.g(b1Var, 1, new wf.y("loli.ball.asmr.bean.WorksOrder", e2.values()), objG);
                    i10 |= 2;
                    break;
                case 2:
                    objG2 = aVarI.g(b1Var, 2, new wf.y("loli.ball.asmr.bean.QuerySort", bg.u.values()), objG2);
                    i10 |= 4;
                    break;
                case 3:
                    iT2 = aVarI.t(b1Var, 3);
                    i10 |= 8;
                    break;
                case 4:
                    iT3 = aVarI.t(b1Var, 4);
                    i10 |= 16;
                    break;
                case 5:
                    objG3 = aVarI.g(b1Var, 5, new wf.d(n1.f24152a, 0), objG3);
                    i10 |= 32;
                    break;
                case 6:
                    zO = aVarI.o(b1Var, 6);
                    i10 |= 64;
                    break;
                default:
                    throw new sf.l(iB);
            }
        }
        aVarI.j(b1Var);
        return new x(i10, iT, (e2) objG, (bg.u) objG2, iT2, iT3, (List) objG3, zO);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.y yVar = new wf.y("loli.ball.asmr.bean.WorksOrder", e2.values());
        wf.y yVar2 = new wf.y("loli.ball.asmr.bean.QuerySort", bg.u.values());
        wf.d dVar = new wf.d(n1.f24152a, 0);
        k0 k0Var = k0.f24138a;
        return new sf.a[]{k0Var, yVar, yVar2, k0Var, k0Var, dVar, wf.g.f24118a};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        x xVar = (x) obj;
        jc.l.e(xVar, "value");
        b1 b1Var = f360b;
        yf.t tVarA = tVar.a(b1Var);
        boolean z10 = xVar.f367g;
        tVarA.m(0, xVar.f361a, b1Var);
        tVarA.r(b1Var, 1, new wf.y("loli.ball.asmr.bean.WorksOrder", e2.values()), xVar.f362b);
        tVarA.r(b1Var, 2, new wf.y("loli.ball.asmr.bean.QuerySort", bg.u.values()), xVar.f363c);
        tVarA.m(3, xVar.f364d, b1Var);
        tVarA.m(4, xVar.f365e, b1Var);
        tVarA.r(b1Var, 5, new wf.d(n1.f24152a, 0), xVar.f366f);
        if (tVarA.x(b1Var) || z10) {
            tVarA.c(b1Var, 6, z10);
        }
        tVarA.w(b1Var);
    }
}
