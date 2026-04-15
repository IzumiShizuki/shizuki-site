package b7;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o2 f1754b;

    public /* synthetic */ e2(o2 o2Var, int i10) {
        this.f1753a = i10;
        this.f1754b = o2Var;
    }

    @Override // b7.n2
    public final void b(t1 t1Var) {
        switch (this.f1753a) {
            case 0:
                z3 z3Var = this.f1754b.f2008g.f1693t;
                if (z3Var != null && z3Var.B0(1)) {
                    z3Var.X();
                    break;
                }
                break;
            case 1:
                c2 c2Var = this.f1754b.f2008g;
                z3 z3Var2 = c2Var.f1693t;
                if (!p4.c0.Y(z3Var2, c2Var.f1689p)) {
                    if (z3Var2 != null && z3Var2.B0(1)) {
                        z3Var2.X();
                        break;
                    }
                } else {
                    p4.c0.F(z3Var2);
                    break;
                }
                break;
            case 2:
                c2 c2Var2 = this.f1754b.f2008g;
                if (c2Var2.f1693t.w() != null) {
                    pe.d dVar = c2Var2.f1678e;
                    c2Var2.r(t1Var);
                    dVar.getClass();
                    g8.a.Q(new i4(-6));
                    break;
                }
                break;
            case 3:
                this.f1754b.f2008g.f1693t.g0();
                break;
            case 4:
                this.f1754b.f2008g.f1693t.h0();
                break;
            case 5:
                this.f1754b.f2008g.f1693t.a0();
                break;
            case 6:
                this.f1754b.f2008g.f1693t.c();
                break;
            case 7:
                this.f1754b.f2008g.f1693t.p0();
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                this.f1754b.f2008g.f1693t.e0();
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                this.f1754b.f2008g.f1693t.f0();
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                this.f1754b.f2008g.f1693t.b0();
                break;
            default:
                this.f1754b.f2008g.f(t1Var, true);
                break;
        }
    }

    public /* synthetic */ e2(o2 o2Var, m4.z0 z0Var) {
        this.f1753a = 2;
        this.f1754b = o2Var;
    }
}
