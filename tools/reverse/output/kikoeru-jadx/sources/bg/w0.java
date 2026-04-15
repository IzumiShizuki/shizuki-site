package bg;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements wf.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f2984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wf.b1 f2985b;

    static {
        w0 w0Var = new w0();
        f2984a = w0Var;
        wf.b1 b1Var = new wf.b1("loli.ball.asmr.bean.Tag", w0Var, 9);
        b1Var.b("count", true);
        b1Var.b("id", false);
        b1Var.b("name", false);
        b1Var.b("i18n", true);
        b1Var.b("upvote", true);
        b1Var.b("downvote", true);
        b1Var.b("voteRank", true);
        b1Var.b("voteStatus", true);
        b1Var.b("myVote", true);
        f2985b = b1Var;
    }

    @Override // sf.a
    public final uf.g a() {
        return f2985b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        wf.b1 b1Var = f2985b;
        vf.a aVarI = bVar.i(b1Var);
        Object objA = null;
        Object objA2 = null;
        Object objA3 = null;
        Object objA4 = null;
        boolean z10 = true;
        int i10 = 0;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = 0;
        while (z10) {
            int iB = aVarI.b(b1Var);
            switch (iB) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    objA = aVarI.a(b1Var, 0, wf.k0.f24138a, objA);
                    i10 |= 1;
                    break;
                case 1:
                    objA2 = aVarI.a(b1Var, 1, wf.k0.f24138a, objA2);
                    i10 |= 2;
                    break;
                case 2:
                    objA3 = aVarI.a(b1Var, 2, wf.n1.f24152a, objA3);
                    i10 |= 4;
                    break;
                case 3:
                    objA4 = aVarI.a(b1Var, 3, y0.f2994a, objA4);
                    i10 |= 8;
                    break;
                case 4:
                    iT = aVarI.t(b1Var, 4);
                    i10 |= 16;
                    break;
                case 5:
                    iT2 = aVarI.t(b1Var, 5);
                    i10 |= 32;
                    break;
                case 6:
                    iT3 = aVarI.t(b1Var, 6);
                    i10 |= 64;
                    break;
                case 7:
                    iT4 = aVarI.t(b1Var, 7);
                    i10 |= 128;
                    break;
                case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                    iT5 = aVarI.t(b1Var, 8);
                    i10 |= 256;
                    break;
                default:
                    throw new sf.l(iB);
            }
        }
        aVarI.j(b1Var);
        return new e1(i10, (Integer) objA, (Integer) objA2, (String) objA3, (a1) objA4, iT, iT2, iT3, iT4, iT5);
    }

    @Override // wf.c0
    public final sf.a[] c() {
        wf.k0 k0Var = wf.k0.f24138a;
        return new sf.a[]{n7.b0.o(k0Var), n7.b0.o(k0Var), n7.b0.o(wf.n1.f24152a), n7.b0.o(y0.f2994a), k0Var, k0Var, k0Var, k0Var, k0Var};
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        e1 e1Var = (e1) obj;
        jc.l.e(e1Var, "value");
        wf.b1 b1Var = f2985b;
        yf.t tVarA = tVar.a(b1Var);
        int i10 = e1Var.f2875i;
        int i11 = e1Var.f2874h;
        int i12 = e1Var.f2873g;
        int i13 = e1Var.f2872f;
        int i14 = e1Var.f2871e;
        a1 a1Var = e1Var.f2870d;
        Integer num = e1Var.f2867a;
        if (tVarA.x(b1Var) || num != null) {
            tVarA.q(b1Var, 0, wf.k0.f24138a, num);
        }
        tVarA.q(b1Var, 1, wf.k0.f24138a, e1Var.f2868b);
        tVarA.q(b1Var, 2, wf.n1.f24152a, e1Var.f2869c);
        if (tVarA.x(b1Var) || a1Var != null) {
            tVarA.q(b1Var, 3, y0.f2994a, a1Var);
        }
        if (tVarA.x(b1Var) || i14 != 0) {
            tVarA.m(4, i14, b1Var);
        }
        if (tVarA.x(b1Var) || i13 != 0) {
            tVarA.m(5, i13, b1Var);
        }
        if (tVarA.x(b1Var) || i12 != 0) {
            tVarA.m(6, i12, b1Var);
        }
        if (tVarA.x(b1Var) || i11 != 1) {
            tVarA.m(7, i11, b1Var);
        }
        if (tVarA.x(b1Var) || i10 != 0) {
            tVarA.m(8, i10, b1Var);
        }
        tVarA.w(b1Var);
    }
}
