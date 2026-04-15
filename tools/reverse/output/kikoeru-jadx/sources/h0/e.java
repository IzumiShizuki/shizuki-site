package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7615b;

    static {
        float f10 = 25;
        f7614a = f10;
        f7615b = (f10 * 2.0f) / 2.4142137f;
    }

    public static final void a(l0.o oVar, j1.q qVar, long j10, x0.o oVar2, int i10) {
        int i11;
        oVar2.Y(1776202187);
        int i12 = (oVar2.f(oVar) ? 4 : 2) | i10 | (oVar2.f(qVar) ? 32 : 16) | 128;
        if (oVar2.N(i12 & 1, (i12 & 147) != 146)) {
            oVar2.S();
            if ((i10 & 1) == 0 || oVar2.x()) {
                i11 = i12 & (-897);
                j10 = 9205357640488583168L;
            } else {
                oVar2.Q();
                i11 = i12 & (-897);
            }
            oVar2.q();
            int i13 = i11 & 14;
            boolean z10 = i13 == 4;
            Object objK = oVar2.K();
            if (z10 || objK == x0.k.f24334a) {
                objK = new a0.f0(11, oVar);
                oVar2.h0(objK);
            }
            l0.u0.a(oVar, j1.c.f9663b, f1.g.f(-1653527038, new a(j10, q2.m.a(qVar, false, (ic.k) objK)), oVar2), oVar2, i13 | 432);
        } else {
            oVar2.Q();
        }
        long j11 = j10;
        x0.p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b(oVar, qVar, j11, i10);
        }
    }

    public static final void b(j1.q qVar, x0.o oVar, int i10, int i11) {
        int i12;
        oVar.Y(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (oVar.f(qVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if (oVar.N(i12 & 1, (i12 & 3) != 2)) {
            if (i13 != 0) {
                qVar = j1.n.f9689a;
            }
            y.d.d(j1.a.a(androidx.compose.foundation.layout.c.k(qVar, f7615b, f7614a), d.f7603b), oVar);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new eg.d(qVar, i10, i11, 1);
        }
    }
}
