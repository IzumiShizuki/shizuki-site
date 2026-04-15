package b0;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f1323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(g2.g1 g1Var, int i10) {
        super(1);
        this.f1322b = i10;
        this.f1323c = g1Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f1322b) {
            case 0:
                ((g2.f1) obj).h(this.f1323c, 0, 0, 0.0f);
                break;
            case 1:
                g2.f1.l((g2.f1) obj, this.f1323c, 0, 0);
                break;
            case 2:
                ((g2.f1) obj).h(this.f1323c, 0, 0, 0.0f);
                break;
            case 3:
                g2.f1.k((g2.f1) obj, this.f1323c, 0, 0);
                break;
            case 4:
                g2.f1.k((g2.f1) obj, this.f1323c, 0, 0);
                break;
            case 5:
                ((g2.f1) obj).h(this.f1323c, 0, 0, 0.0f);
                break;
            case 6:
                ((g2.f1) obj).h(this.f1323c, 0, 0, 0.0f);
                break;
            case 7:
                g2.f1.k((g2.f1) obj, this.f1323c, 0, 0);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                ((g2.f1) obj).h(this.f1323c, 0, 0, 0.0f);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                ((g2.f1) obj).h(this.f1323c, 0, 0, 0.0f);
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                ((g2.f1) obj).h(this.f1323c, 0, 0, 0.0f);
                break;
            case 11:
                g2.f1.k((g2.f1) obj, this.f1323c, 0, 0);
                break;
            case 12:
                g2.f1.k((g2.f1) obj, this.f1323c, 0, 0);
                break;
            case 13:
                g2.f1.k((g2.f1) obj, this.f1323c, 0, 0);
                break;
            case 14:
                g2.f1 f1Var = (g2.f1) obj;
                f3.m mVarF = f1Var.f();
                f3.m mVar = f3.m.f6667a;
                g2.g1 g1Var = this.f1323c;
                if (mVarF == mVar || f1Var.g() == 0) {
                    g2.f1.b(f1Var, g1Var);
                    g1Var.Y(f3.j.d(0L, g1Var.f7184e), 0.0f, null);
                } else {
                    int i10 = (int) 0;
                    long jG = ((long) ((f1Var.g() - g1Var.f7180a) - i10)) << 32;
                    g2.f1.b(f1Var, g1Var);
                    g1Var.Y(f3.j.d((((long) i10) & 4294967295L) | jG, g1Var.f7184e), 0.0f, null);
                }
                break;
            case 15:
                g2.f1.k((g2.f1) obj, this.f1323c, 0, 0);
                break;
            default:
                g2.f1.k((g2.f1) obj, this.f1323c, 0, 0);
                break;
        }
        return ub.a0.f21526a;
    }
}
