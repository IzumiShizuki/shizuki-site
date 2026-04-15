package bg;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f2929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2930b;

    static {
        n nVar = new n();
        f2929a = nVar;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.PlayList", nVar, 13);
        b1Var.b("id", false);
        b1Var.b("user_name", false);
        b1Var.b("privacy", false);
        b1Var.b("locale", false);
        b1Var.b("playback_count", false);
        b1Var.b("name", false);
        b1Var.b("description", false);
        b1Var.b("created_at", false);
        b1Var.b("updated_at", false);
        b1Var.b("works_count", false);
        b1Var.b("exist", true);
        b1Var.b("latestWorkID", true);
        b1Var.b("mainCoverUrl", true);
        f2930b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2930b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2930b;
        vf.a aVarI = bVar.i(b1Var);
        Object objA = null;
        String strQ = null;
        String strQ2 = null;
        String strQ3 = null;
        String strQ4 = null;
        String strQ5 = null;
        String strQ6 = null;
        String strQ7 = null;
        long jY = 0;
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
                    strQ = aVarI.q(b1Var, 0);
                    i10 |= 1;
                    break;
                case 1:
                    strQ2 = aVarI.q(b1Var, 1);
                    i10 |= 2;
                    break;
                case 2:
                    iT = aVarI.t(b1Var, 2);
                    i10 |= 4;
                    break;
                case 3:
                    strQ3 = aVarI.q(b1Var, 3);
                    i10 |= 8;
                    break;
                case 4:
                    iT2 = aVarI.t(b1Var, 4);
                    i10 |= 16;
                    break;
                case 5:
                    strQ4 = aVarI.q(b1Var, 5);
                    i10 |= 32;
                    break;
                case 6:
                    strQ5 = aVarI.q(b1Var, 6);
                    i10 |= 64;
                    break;
                case 7:
                    strQ6 = aVarI.q(b1Var, 7);
                    i10 |= 128;
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    strQ7 = aVarI.q(b1Var, 8);
                    i10 |= 256;
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                    iT3 = aVarI.t(b1Var, 9);
                    i10 |= 512;
                    break;
                case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                    zO = aVarI.o(b1Var, 10);
                    i10 |= 1024;
                    break;
                case 11:
                    jY = aVarI.y(b1Var, 11);
                    i10 |= 2048;
                    break;
                case 12:
                    objA = aVarI.a(b1Var, 12, wf.n1.f24152a, objA);
                    i10 |= 4096;
                    break;
                default:
                    throw new sf.l(iB);
            }
        }
        aVarI.j(b1Var);
        return new p(i10, strQ, strQ2, iT, strQ3, iT2, strQ4, strQ5, strQ6, strQ7, iT3, zO, jY, (String) objA);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.n1 n1Var = wf.n1.f24152a;
        sf.a aVarO = n7.b0.o(n1Var);
        wf.k0 k0Var = wf.k0.f24138a;
        return new sf.a[]{n1Var, n1Var, k0Var, n1Var, k0Var, n1Var, n1Var, n1Var, n1Var, k0Var, wf.g.f24118a, wf.p0.f24162a, aVarO};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        p pVar = (p) obj;
        jc.l.e(pVar, "value");
        wf.b1 b1Var = f2930b;
        yf.t tVarA = tVar.a(b1Var);
        String str = pVar.f2949m;
        long j10 = pVar.f2948l;
        boolean z10 = pVar.f2947k;
        tVarA.v(b1Var, 0, pVar.f2937a);
        tVarA.v(b1Var, 1, pVar.f2938b);
        tVarA.m(2, pVar.f2939c, b1Var);
        tVarA.v(b1Var, 3, pVar.f2940d);
        tVarA.m(4, pVar.f2941e, b1Var);
        tVarA.v(b1Var, 5, pVar.f2942f);
        tVarA.v(b1Var, 6, pVar.f2943g);
        tVarA.v(b1Var, 7, pVar.f2944h);
        tVarA.v(b1Var, 8, pVar.f2945i);
        tVarA.m(9, pVar.f2946j, b1Var);
        if (tVarA.x(b1Var) || z10) {
            tVarA.c(b1Var, 10, z10);
        }
        if (tVarA.x(b1Var) || j10 != 0) {
            tVarA.o(b1Var, 11, j10);
        }
        if (tVarA.x(b1Var) || str != null) {
            tVarA.q(b1Var, 12, wf.n1.f24152a, str);
        }
        tVarA.w(b1Var);
    }
}
