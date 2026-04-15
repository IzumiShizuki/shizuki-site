package na;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.List;
import wf.b1;
import wf.c0;
import wf.k0;
import wf.n1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f15741a;
    private static final uf.g descriptor;

    static {
        s sVar = new s();
        f15741a = sVar;
        b1 b1Var = new b1("com.cnl.kikoeru.utils.GithubBean", sVar, 18);
        b1Var.b("url", false);
        b1Var.b("assets_url", false);
        b1Var.b("upload_url", false);
        b1Var.b("html_url", false);
        b1Var.b("id", false);
        b1Var.b("author", false);
        b1Var.b("node_id", false);
        b1Var.b("tag_name", false);
        b1Var.b("target_commitish", false);
        b1Var.b("name", false);
        b1Var.b("draft", false);
        b1Var.b("prerelease", false);
        b1Var.b("created_at", false);
        b1Var.b("published_at", false);
        b1Var.b("assets", false);
        b1Var.b("tarball_url", false);
        b1Var.b("zipball_url", false);
        b1Var.b("body", false);
        descriptor = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return descriptor;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        int i10;
        uf.g gVar = descriptor;
        vf.a aVarI = bVar.i(gVar);
        ub.h[] hVarArr = u.f15742s;
        List list = null;
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        String strQ4 = null;
        i iVar = null;
        String strQ5 = null;
        String strQ6 = null;
        String strQ7 = null;
        String strQ8 = null;
        String strQ9 = null;
        String strQ10 = null;
        String strQ11 = null;
        String strQ12 = null;
        String strQ13 = null;
        boolean z10 = true;
        int i11 = 0;
        int iT = 0;
        boolean zO = false;
        boolean zO2 = false;
        while (z10) {
            int iB = aVarI.b(gVar);
            switch (iB) {
                case -1:
                    z10 = false;
                    continue;
                case 0:
                    strQ = aVarI.q(gVar, 0);
                    i11 |= 1;
                    continue;
                case 1:
                    strQ2 = aVarI.q(gVar, 1);
                    i11 |= 2;
                    continue;
                case 2:
                    strQ3 = aVarI.q(gVar, 2);
                    i11 |= 4;
                    continue;
                case 3:
                    strQ4 = aVarI.q(gVar, 3);
                    i11 |= 8;
                    continue;
                case 4:
                    iT = aVarI.t(gVar, 4);
                    i11 |= 16;
                    continue;
                case 5:
                    iVar = (i) aVarI.g(gVar, 5, g.f15693a, iVar);
                    i11 |= 32;
                    continue;
                case 6:
                    strQ5 = aVarI.q(gVar, 6);
                    i11 |= 64;
                    continue;
                case 7:
                    strQ6 = aVarI.q(gVar, 7);
                    i11 |= 128;
                    continue;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    strQ7 = aVarI.q(gVar, 8);
                    i11 |= 256;
                    continue;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                    strQ8 = aVarI.q(gVar, 9);
                    i11 |= 512;
                    continue;
                case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                    zO = aVarI.o(gVar, 10);
                    i11 |= 1024;
                    continue;
                case 11:
                    zO2 = aVarI.o(gVar, 11);
                    i11 |= 2048;
                    continue;
                case 12:
                    strQ9 = aVarI.q(gVar, 12);
                    i11 |= 4096;
                    continue;
                case 13:
                    strQ10 = aVarI.q(gVar, 13);
                    i11 |= 8192;
                    continue;
                case 14:
                    list = (List) aVarI.g(gVar, 14, (sf.a) hVarArr[14].getValue(), list);
                    i11 |= 16384;
                    continue;
                case 15:
                    strQ11 = aVarI.q(gVar, 15);
                    i10 = 32768;
                    break;
                case 16:
                    strQ12 = aVarI.q(gVar, 16);
                    i10 = 65536;
                    break;
                case 17:
                    strQ13 = aVarI.q(gVar, 17);
                    i10 = 131072;
                    break;
                default:
                    throw new sf.l(iB);
            }
            i11 |= i10;
        }
        aVarI.j(gVar);
        return new u(i11, strQ, strQ2, strQ3, strQ4, iT, iVar, strQ5, strQ6, strQ7, strQ8, zO, zO2, strQ9, strQ10, list, strQ11, strQ12, strQ13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wf.c0
    public final sf.a[] c() {
        ub.h[] hVarArr = u.f15742s;
        n1 n1Var = n1.f24152a;
        wf.g gVar = wf.g.f24118a;
        return new sf.a[]{n1Var, n1Var, n1Var, n1Var, k0.f24138a, g.f15693a, n1Var, n1Var, n1Var, n1Var, gVar, gVar, n1Var, n1Var, hVarArr[14].getValue(), n1Var, n1Var, n1Var};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        u uVar = (u) obj;
        jc.l.e(uVar, "value");
        uf.g gVar = descriptor;
        yf.t tVarA = tVar.a(gVar);
        ub.h[] hVarArr = u.f15742s;
        tVarA.v(gVar, 0, uVar.f15743a);
        tVarA.v(gVar, 1, uVar.f15744b);
        tVarA.v(gVar, 2, uVar.f15745c);
        tVarA.v(gVar, 3, uVar.f15746d);
        tVarA.m(4, uVar.f15747e, gVar);
        tVarA.r(gVar, 5, g.f15693a, uVar.f15748f);
        tVarA.v(gVar, 6, uVar.f15749g);
        tVarA.v(gVar, 7, uVar.f15750h);
        tVarA.v(gVar, 8, uVar.f15751i);
        tVarA.v(gVar, 9, uVar.f15752j);
        tVarA.c(gVar, 10, uVar.f15753k);
        tVarA.c(gVar, 11, uVar.f15754l);
        tVarA.v(gVar, 12, uVar.f15755m);
        tVarA.v(gVar, 13, uVar.f15756n);
        tVarA.r(gVar, 14, (sf.a) hVarArr[14].getValue(), uVar.f15757o);
        tVarA.v(gVar, 15, uVar.f15758p);
        tVarA.v(gVar, 16, uVar.f15759q);
        tVarA.v(gVar, 17, uVar.f15760r);
        tVarA.w(gVar);
    }
}
