package na;

import com.tencent.bugly.beta.tinker.TinkerReport;
import wf.b1;
import wf.c0;
import wf.k0;
import wf.n1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f15693a;
    private static final uf.g descriptor;

    static {
        g gVar = new g();
        f15693a = gVar;
        b1 b1Var = new b1("com.cnl.kikoeru.utils.Author", gVar, 18);
        b1Var.b("login", false);
        b1Var.b("id", false);
        b1Var.b("node_id", false);
        b1Var.b("avatar_url", false);
        b1Var.b("gravatar_id", false);
        b1Var.b("url", false);
        b1Var.b("html_url", false);
        b1Var.b("followers_url", false);
        b1Var.b("following_url", false);
        b1Var.b("gists_url", false);
        b1Var.b("starred_url", false);
        b1Var.b("subscriptions_url", false);
        b1Var.b("organizations_url", false);
        b1Var.b("repos_url", false);
        b1Var.b("events_url", false);
        b1Var.b("received_events_url", false);
        b1Var.b("type", false);
        b1Var.b("site_admin", false);
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
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        String strQ4 = null;
        String strQ5 = null;
        String strQ6 = null;
        String strQ7 = null;
        String strQ8 = null;
        String strQ9 = null;
        String strQ10 = null;
        String strQ11 = null;
        String strQ12 = null;
        String strQ13 = null;
        String strQ14 = null;
        String strQ15 = null;
        String strQ16 = null;
        boolean z10 = true;
        int i11 = 0;
        int iT = 0;
        boolean zO = false;
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
                    iT = aVarI.t(gVar, 1);
                    i11 |= 2;
                    continue;
                case 2:
                    strQ2 = aVarI.q(gVar, 2);
                    i11 |= 4;
                    continue;
                case 3:
                    strQ3 = aVarI.q(gVar, 3);
                    i11 |= 8;
                    continue;
                case 4:
                    strQ4 = aVarI.q(gVar, 4);
                    i11 |= 16;
                    continue;
                case 5:
                    strQ5 = aVarI.q(gVar, 5);
                    i11 |= 32;
                    continue;
                case 6:
                    strQ6 = aVarI.q(gVar, 6);
                    i11 |= 64;
                    continue;
                case 7:
                    strQ7 = aVarI.q(gVar, 7);
                    i11 |= 128;
                    continue;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    strQ8 = aVarI.q(gVar, 8);
                    i11 |= 256;
                    continue;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                    strQ9 = aVarI.q(gVar, 9);
                    i11 |= 512;
                    continue;
                case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                    strQ10 = aVarI.q(gVar, 10);
                    i11 |= 1024;
                    continue;
                case 11:
                    strQ11 = aVarI.q(gVar, 11);
                    i11 |= 2048;
                    continue;
                case 12:
                    strQ12 = aVarI.q(gVar, 12);
                    i11 |= 4096;
                    continue;
                case 13:
                    strQ13 = aVarI.q(gVar, 13);
                    i11 |= 8192;
                    continue;
                case 14:
                    strQ14 = aVarI.q(gVar, 14);
                    i11 |= 16384;
                    continue;
                case 15:
                    strQ15 = aVarI.q(gVar, 15);
                    i10 = 32768;
                    break;
                case 16:
                    strQ16 = aVarI.q(gVar, 16);
                    i10 = 65536;
                    break;
                case 17:
                    zO = aVarI.o(gVar, 17);
                    i10 = 131072;
                    break;
                default:
                    throw new sf.l(iB);
            }
            i11 |= i10;
        }
        aVarI.j(gVar);
        return new i(i11, strQ, iT, strQ2, strQ3, strQ4, strQ5, strQ6, strQ7, strQ8, strQ9, strQ10, strQ11, strQ12, strQ13, strQ14, strQ15, strQ16, zO);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        n1 n1Var = n1.f24152a;
        return new sf.a[]{n1Var, k0.f24138a, n1Var, n1Var, n1Var, n1Var, n1Var, n1Var, n1Var, n1Var, n1Var, n1Var, n1Var, n1Var, n1Var, n1Var, n1Var, wf.g.f24118a};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        i iVar = (i) obj;
        jc.l.e(iVar, "value");
        uf.g gVar = descriptor;
        yf.t tVarA = tVar.a(gVar);
        tVarA.v(gVar, 0, iVar.f15694a);
        tVarA.m(1, iVar.f15695b, gVar);
        tVarA.v(gVar, 2, iVar.f15696c);
        tVarA.v(gVar, 3, iVar.f15697d);
        tVarA.v(gVar, 4, iVar.f15698e);
        tVarA.v(gVar, 5, iVar.f15699f);
        tVarA.v(gVar, 6, iVar.f15700g);
        tVarA.v(gVar, 7, iVar.f15701h);
        tVarA.v(gVar, 8, iVar.f15702i);
        tVarA.v(gVar, 9, iVar.f15703j);
        tVarA.v(gVar, 10, iVar.f15704k);
        tVarA.v(gVar, 11, iVar.f15705l);
        tVarA.v(gVar, 12, iVar.f15706m);
        tVarA.v(gVar, 13, iVar.f15707n);
        tVarA.v(gVar, 14, iVar.f15708o);
        tVarA.v(gVar, 15, iVar.f15709p);
        tVarA.v(gVar, 16, iVar.f15710q);
        tVarA.c(gVar, 17, iVar.f15711r);
        tVarA.w(gVar);
    }
}
