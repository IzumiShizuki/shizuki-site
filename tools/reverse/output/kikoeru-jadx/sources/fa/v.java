package fa;

import androidx.lifecycle.n0;
import e7.y;
import i7.p2;
import java.util.Timer;
import m0.i4;
import m0.l3;
import m0.r4;
import m0.x;
import r.u1;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f7039a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f7040b = x0.v.v(0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f7041c = x0.v.v(0L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p2 f7042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e1 f7043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f7044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e1 f7045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e1 f7046h;

    static {
        f3.e eVarC = lc.b.c(a9.i.a());
        l3 l3Var = new l3(1);
        u1 u1Var = i4.f13094b;
        p2 p2Var = new p2();
        p2Var.f9258a = new x(r4.f13548a, new y(11, eVarC), new n0(18, eVarC), u1Var, l3Var);
        f7042d = p2Var;
        Boolean bool = Boolean.FALSE;
        f7043e = x0.v.v(bool);
        f7045g = x0.v.v(null);
        f7046h = x0.v.v(bool);
    }

    public static void a(long j10) {
        e1 e1Var = f7045g;
        f7044f = ff.a.d(j10) + System.currentTimeMillis();
        try {
            Timer timer = (Timer) e1Var.getValue();
            if (timer != null) {
                timer.cancel();
            }
            e1Var.setValue(null);
        } catch (Throwable th2) {
            ub.a.b(th2);
        }
        int i10 = ff.a.f7057d;
        if (j10 == 0) {
            return;
        }
        try {
            e1Var.setValue(new Timer());
            Timer timer2 = (Timer) e1Var.getValue();
            if (timer2 != null) {
                timer2.schedule(new u(), ff.a.d(j10));
            }
        } catch (Throwable th3) {
            ub.a.b(th3);
        }
    }
}
