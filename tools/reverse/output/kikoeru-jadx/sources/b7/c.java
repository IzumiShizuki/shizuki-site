package b7;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f1664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f1665c;

    public /* synthetic */ c(c2 c2Var, t1 t1Var, int i10) {
        this.f1663a = i10;
        this.f1664b = c2Var;
        this.f1665c = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1663a) {
            case 0:
                c2 c2Var = this.f1664b;
                if (!c2Var.h()) {
                    if (c2Var.A) {
                        t1 t1Var = this.f1665c;
                        if (!c2.i(t1Var)) {
                            if (c2Var.g(t1Var)) {
                                c2Var.A = false;
                            }
                        }
                    }
                    c2Var.f1678e.getClass();
                    break;
                }
                break;
            case 1:
                this.f1664b.f1680g.G0(this.f1665c, Integer.MIN_VALUE, 12, q3.I0(new b5.a(24)));
                break;
            case 2:
                this.f1664b.f1680g.G0(this.f1665c, Integer.MIN_VALUE, 11, q3.I0(new b5.a(19)));
                break;
            case 3:
                this.f1664b.f1680g.G0(this.f1665c, Integer.MIN_VALUE, 3, q3.I0(new c3(1)));
                break;
            case 4:
                this.f1664b.f1680g.G0(this.f1665c, Integer.MIN_VALUE, 1, q3.I0(new b5.a(16)));
                break;
            case 5:
                q3 q3Var = this.f1664b.f1680g;
                q3Var.getClass();
                t1 t1Var2 = this.f1665c;
                q3Var.G0(t1Var2, Integer.MIN_VALUE, 1, q3.I0(new i0(10, q3Var, t1Var2)));
                break;
            case 6:
                q3 q3Var2 = this.f1664b.f1680g;
                q3Var2.getClass();
                t1 t1Var3 = this.f1665c;
                q3Var2.G0(t1Var3, Integer.MIN_VALUE, 1, q3.I0(new i0(10, q3Var2, t1Var3)));
                break;
            case 7:
                this.f1664b.f1680g.G0(this.f1665c, Integer.MIN_VALUE, 1, q3.I0(new b5.a(16)));
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                this.f1664b.f1680g.G0(this.f1665c, Integer.MIN_VALUE, 9, q3.I0(new b5.a(25)));
                break;
            default:
                this.f1664b.f1680g.G0(this.f1665c, Integer.MIN_VALUE, 7, q3.I0(new b5.a(21)));
                break;
        }
    }
}
