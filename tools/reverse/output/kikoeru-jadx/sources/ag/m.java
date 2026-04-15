package ag;

import java.util.List;
import n7.b0;
import wf.b1;
import wf.c0;
import wf.k0;
import wf.n1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b1 f343b;

    static {
        m mVar = new m();
        f342a = mVar;
        b1 b1Var = new b1("loli.ball.asmr.AsmrOneApi.PopularBean", mVar, 7);
        b1Var.b("keyword", false);
        b1Var.b("localSubtitledWorks", false);
        b1Var.b("page", false);
        b1Var.b("subtitle", false);
        b1Var.b("withPlaylistStatus", true);
        b1Var.b("recommenderUuid", true);
        b1Var.b("itemId", true);
        f343b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f343b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        b1 b1Var = f343b;
        vf.a aVarI = bVar.i(b1Var);
        Object objG = null;
        Object objG2 = null;
        Object objA = null;
        String strQ = null;
        Object objA2 = null;
        boolean z10 = true;
        int i10 = 0;
        int iT = 0;
        int iT2 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            switch (iB) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    strQ = aVarI.q(b1Var, 0);
                    i10 |= 1;
                    break;
                case 1:
                    objG = aVarI.g(b1Var, 1, new wf.d(n1.f24152a, 0), objG);
                    i10 |= 2;
                    break;
                case 2:
                    iT = aVarI.t(b1Var, 2);
                    i10 |= 4;
                    break;
                case 3:
                    iT2 = aVarI.t(b1Var, 3);
                    i10 |= 8;
                    break;
                case 4:
                    objG2 = aVarI.g(b1Var, 4, new wf.d(n1.f24152a, 0), objG2);
                    i10 |= 16;
                    break;
                case 5:
                    objA = aVarI.a(b1Var, 5, n1.f24152a, objA);
                    i10 |= 32;
                    break;
                case 6:
                    objA2 = aVarI.a(b1Var, 6, n1.f24152a, objA2);
                    i10 |= 64;
                    break;
                default:
                    throw new sf.l(iB);
            }
        }
        aVarI.j(b1Var);
        return new o(i10, strQ, (List) objG, iT, iT2, (List) objG2, (String) objA, (String) objA2);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        n1 n1Var = n1.f24152a;
        wf.d dVar = new wf.d(n1Var, 0);
        wf.d dVar2 = new wf.d(n1Var, 0);
        sf.a aVarO = b0.o(n1Var);
        sf.a aVarO2 = b0.o(n1Var);
        k0 k0Var = k0.f24138a;
        return new sf.a[]{n1Var, dVar, k0Var, k0Var, dVar2, aVarO, aVarO2};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        o oVar = (o) obj;
        jc.l.e(oVar, "value");
        b1 b1Var = f343b;
        yf.t tVarA = tVar.a(b1Var);
        String str = oVar.f350g;
        String str2 = oVar.f349f;
        List list = oVar.f348e;
        tVarA.v(b1Var, 0, oVar.f344a);
        n1 n1Var = n1.f24152a;
        tVarA.r(b1Var, 1, new wf.d(n1Var, 0), oVar.f345b);
        tVarA.m(2, oVar.f346c, b1Var);
        tVarA.m(3, oVar.f347d, b1Var);
        if (tVarA.x(b1Var) || !jc.l.a(list, vb.r.f22819a)) {
            tVarA.r(b1Var, 4, new wf.d(n1Var, 0), list);
        }
        if (tVarA.x(b1Var) || str2 != null) {
            tVarA.q(b1Var, 5, n1Var, str2);
        }
        if (tVarA.x(b1Var) || str != null) {
            tVarA.q(b1Var, 6, n1Var, str);
        }
        tVarA.w(b1Var);
    }
}
