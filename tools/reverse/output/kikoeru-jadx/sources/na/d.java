package na;

import com.tencent.bugly.beta.tinker.TinkerReport;
import wf.b1;
import wf.c0;
import wf.k0;
import wf.n1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f15680a;
    private static final uf.g descriptor;

    static {
        d dVar = new d();
        f15680a = dVar;
        b1 b1Var = new b1("com.cnl.kikoeru.utils.Asset", dVar, 12);
        b1Var.b("url", false);
        b1Var.b("id", false);
        b1Var.b("node_id", false);
        b1Var.b("name", false);
        b1Var.b("uploader", false);
        b1Var.b("content_type", false);
        b1Var.b("state", false);
        b1Var.b("size", false);
        b1Var.b("download_count", false);
        b1Var.b("created_at", false);
        b1Var.b("updated_at", false);
        b1Var.b("browser_download_url", false);
        descriptor = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return descriptor;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        uf.g gVar = descriptor;
        vf.a aVarI = bVar.i(gVar);
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        z zVar = null;
        String strQ4 = null;
        String strQ5 = null;
        String strQ6 = null;
        String strQ7 = null;
        String strQ8 = null;
        boolean z10 = true;
        int i10 = 0;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        while (z10) {
            int iB = aVarI.b(gVar);
            switch (iB) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    strQ = aVarI.q(gVar, 0);
                    i10 |= 1;
                    break;
                case 1:
                    iT = aVarI.t(gVar, 1);
                    i10 |= 2;
                    break;
                case 2:
                    strQ2 = aVarI.q(gVar, 2);
                    i10 |= 4;
                    break;
                case 3:
                    strQ3 = aVarI.q(gVar, 3);
                    i10 |= 8;
                    break;
                case 4:
                    zVar = (z) aVarI.g(gVar, 4, x.f15768a, zVar);
                    i10 |= 16;
                    break;
                case 5:
                    strQ4 = aVarI.q(gVar, 5);
                    i10 |= 32;
                    break;
                case 6:
                    strQ5 = aVarI.q(gVar, 6);
                    i10 |= 64;
                    break;
                case 7:
                    iT2 = aVarI.t(gVar, 7);
                    i10 |= 128;
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    iT3 = aVarI.t(gVar, 8);
                    i10 |= 256;
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                    strQ6 = aVarI.q(gVar, 9);
                    i10 |= 512;
                    break;
                case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                    strQ7 = aVarI.q(gVar, 10);
                    i10 |= 1024;
                    break;
                case 11:
                    strQ8 = aVarI.q(gVar, 11);
                    i10 |= 2048;
                    break;
                default:
                    throw new sf.l(iB);
            }
        }
        aVarI.j(gVar);
        return new f(i10, strQ, iT, strQ2, strQ3, zVar, strQ4, strQ5, iT2, iT3, strQ6, strQ7, strQ8);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        n1 n1Var = n1.f24152a;
        k0 k0Var = k0.f24138a;
        return new sf.a[]{n1Var, k0Var, n1Var, n1Var, x.f15768a, n1Var, n1Var, k0Var, k0Var, n1Var, n1Var, n1Var};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        f fVar = (f) obj;
        jc.l.e(fVar, "value");
        uf.g gVar = descriptor;
        yf.t tVarA = tVar.a(gVar);
        tVarA.v(gVar, 0, fVar.f15681a);
        tVarA.m(1, fVar.f15682b, gVar);
        tVarA.v(gVar, 2, fVar.f15683c);
        tVarA.v(gVar, 3, fVar.f15684d);
        tVarA.r(gVar, 4, x.f15768a, fVar.f15685e);
        tVarA.v(gVar, 5, fVar.f15686f);
        tVarA.v(gVar, 6, fVar.f15687g);
        tVarA.m(7, fVar.f15688h, gVar);
        tVarA.m(8, fVar.f15689i, gVar);
        tVarA.v(gVar, 9, fVar.f15690j);
        tVarA.v(gVar, 10, fVar.f15691k);
        tVarA.v(gVar, 11, fVar.f15692l);
        tVarA.w(gVar);
    }
}
