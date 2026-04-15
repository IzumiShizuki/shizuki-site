package ja;

import android.app.Activity;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cg.t;
import gh.g;
import ic.n;
import jc.l;
import jc.z;
import m0.b1;
import m0.c1;
import pc.f0;
import q1.h0;
import q1.q;
import ub.a0;
import x0.k;
import x0.o;
import x0.o2;
import x0.p1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f10798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f10799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p1 f10800c;

    static {
        long j10 = a.f10785b;
        long j11 = a.f10787d;
        long j12 = a.f10788e;
        o2 o2Var = c1.f12773a;
        long jE = h0.e(4279374354L);
        long jE2 = h0.e(4279374354L);
        long jE3 = h0.e(4291782265L);
        long j13 = q.f17569b;
        long j14 = q.f17571d;
        f10798a = new b1(j10, j11, j12, j12, jE, jE2, jE3, j13, j13, j14, j14, j13, false);
        f10799b = c1.d(a.f10786c, j11, j12, 4088);
    }

    public static final void a(boolean z10, o oVar, int i10) {
        oVar.Y(2089869396);
        int i11 = i10 | 2;
        boolean z11 = false;
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            oVar.S();
            if ((i10 & 1) == 0 || oVar.x()) {
                z10 = (((Configuration) oVar.j(AndroidCompositionLocals_androidKt.f720a)).uiMode & 48) == 32;
            } else {
                oVar.Q();
            }
            oVar.q();
            String str = (String) f0.P(gg.c.a(), "darkTheme", "auto", z.a(String.class)).a();
            f10800c = v.r(oVar);
            if (l.a(str, "day") || (!l.a(str, "night") && !z10)) {
                z11 = true;
            }
            b1 b1Var = z11 ? f10799b : f10798a;
            Object objJ = oVar.j(AndroidCompositionLocals_androidKt.f721b);
            l.c(objJ, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) objJ;
            boolean zH = oVar.h(activity) | oVar.g(z11);
            Object objK = oVar.K();
            if (zH || objK == k.f24334a) {
                objK = new t(activity, z11, null, 2);
                oVar.h0(objK);
            }
            v.e((n) objK, a0.f21526a, oVar);
            g.e(b1Var, e.f10801a, b.f10795a, oVar, 3504);
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new c(i10, z10);
        }
    }
}
