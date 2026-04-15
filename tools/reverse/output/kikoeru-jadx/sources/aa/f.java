package aa;

import bg.a2;
import com.tencent.bugly.beta.tinker.TinkerReport;
import fa.v;
import java.util.Timer;
import ub.a0;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f287b;

    public /* synthetic */ f(w0 w0Var) {
        this.f286a = 12;
        v vVar = v.f7039a;
        this.f287b = w0Var;
    }

    @Override // ic.a
    public final Object b() {
        int i10 = this.f286a;
        boolean z10 = true;
        a0 a0Var = a0.f21526a;
        w0 w0Var = this.f287b;
        switch (i10) {
            case 0:
                w0Var.setValue(Boolean.TRUE);
                break;
            case 1:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 2:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 6:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 7:
                w0Var.setValue(Boolean.TRUE);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                w0Var.setValue(Boolean.FALSE);
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                a2 a2Var = (a2) w0Var.getValue();
                if (a2Var == null || (a2Var.f2830m == null && a2Var.f2840w == null && a2Var.f2837t == null)) {
                    z10 = false;
                }
                break;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                w0Var.setValue(Boolean.TRUE);
                break;
            case 11:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 12:
                v vVar = v.f7039a;
                if (((Timer) v.f7045g.getValue()) != null) {
                    int i11 = ff.a.f7057d;
                    v.a(0L);
                } else {
                    int i12 = ff.a.f7057d;
                    v.a(ff.f.m((int) ((Number) w0Var.getValue()).floatValue(), ff.c.MINUTES));
                }
                break;
            case 13:
                w0Var.setValue(Boolean.valueOf(!((Boolean) w0Var.getValue()).booleanValue()));
                break;
            case 14:
                w0Var.setValue(Boolean.TRUE);
                break;
            case 15:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 16:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 17:
                w0Var.setValue(Boolean.TRUE);
                break;
            case 18:
                w0Var.setValue(Boolean.TRUE);
                break;
            case 19:
                w0Var.setValue(Boolean.TRUE);
                break;
            case 20:
                w0Var.setValue(Boolean.TRUE);
                break;
            case 21:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 22:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 23:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 24:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 25:
                w0Var.setValue(Boolean.FALSE);
                break;
            case 26:
                w0Var.setValue(Boolean.valueOf(!((Boolean) w0Var.getValue()).booleanValue()));
                break;
            case 27:
                break;
            case 28:
                w0Var.setValue(Boolean.FALSE);
                break;
            default:
                w0Var.setValue(Boolean.FALSE);
                break;
        }
        return a0Var;
    }

    public /* synthetic */ f(w0 w0Var, int i10) {
        this.f286a = i10;
        this.f287b = w0Var;
    }
}
