package q;

import r.f2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r.z0 f17454a = r.d.q(1, f2.f18406a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1 f17455b = new s1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f17456c = e.f17274e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r1 f17457d = new r1();

    static {
        new o.k0();
    }

    public static final void a(j1.q qVar, f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(2043053727);
        int i11 = i10 | 6;
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            b(f1.g.f(-130587847, new a0.h(fVar, 2), oVar), oVar, 6);
            qVar = j1.n.f9689a;
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new l0.d1(qVar, fVar, i10, 1);
        }
    }

    public static final void b(f1.f fVar, x0.o oVar, int i10) {
        oVar.Y(-2093217917);
        if (oVar.N(i10 & 1, (i10 & 3) != 2)) {
            g2.n1.a(f1.g.f(-863967934, new cg.m0(9, fVar), oVar), oVar, 6);
        } else {
            oVar.Q();
        }
        x0.p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new b0.r1(fVar, i10, 3);
        }
    }
}
