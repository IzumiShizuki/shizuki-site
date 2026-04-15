package ma;

import aa.g;
import androidx.lifecycle.x0;
import jc.l;
import jc.z;
import la.k;
import m0.d4;
import x0.e1;
import x0.o;
import x0.p1;
import x0.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.f f15063a = new f1.f(new k(5), 287936869, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.f f15064b = new f1.f(new k(6), -1135151410, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1.f f15065c = new f1.f(new k(7), -1271178707, false);

    public static final void a(w0 w0Var, o oVar, int i10) {
        w0 w0Var2;
        p1 p1VarR;
        g gVar;
        l.e(w0Var, "showDialog");
        oVar.Y(1535066171);
        int i11 = (oVar.f(w0Var) ? 4 : 2) | i10;
        if (oVar.N(i11 & 1, (i11 & 3) != 2)) {
            x0 x0VarA = j4.a.a(oVar);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            e eVar = (e) g8.a.w(x0VarA, z.f10839a.b(e.class), null, x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b);
            if (!((Boolean) w0Var.getValue()).booleanValue()) {
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    gVar = new g(w0Var, i10, 9);
                    p1VarR.f24421d = gVar;
                }
                return;
            }
            e1 e1Var = eVar.f15060b;
            e1 e1Var2 = eVar.f15061c;
            e1 e1Var3 = eVar.f15062d;
            boolean z10 = (i11 & 14) == 4;
            Object objK = oVar.K();
            if (z10 || objK == x0.k.f24334a) {
                objK = new c(w0Var, 0);
                oVar.h0(objK);
            }
            w0Var2 = w0Var;
            a2.c.c((ic.a) objK, f1.g.f(174900467, new d4(e1Var2, e1Var3, e1Var, w0Var, eVar, 2), oVar), null, null, null, null, 0L, 0L, null, oVar, 48, 508);
        } else {
            w0Var2 = w0Var;
            oVar.Q();
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            gVar = new g(w0Var2, i10, 10);
            p1VarR.f24421d = gVar;
        }
    }
}
