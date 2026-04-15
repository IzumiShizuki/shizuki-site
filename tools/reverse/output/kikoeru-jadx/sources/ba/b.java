package ba;

import m0.a5;
import m0.j1;
import m0.v7;
import m0.w1;
import x0.o2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2300a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2304e;

    public /* synthetic */ b(hg.b bVar, ic.k kVar, boolean z10, x0.w0 w0Var) {
        this.f2303d = bVar;
        this.f2304e = kVar;
        this.f2301b = z10;
        this.f2302c = w0Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f2300a) {
            case 0:
                ((Integer) obj2).getClass();
                z.b((j7.b) this.f2303d, (ic.k) this.f2304e, (x0.w0) this.f2302c, this.f2301b, (x0.o) obj, x0.v.D(393));
                break;
            case 1:
                ((Integer) obj2).getClass();
                la.l.g(this.f2301b, (String) this.f2303d, (lf.f) this.f2304e, (x0.w0) this.f2302c, (x0.o) obj, x0.v.D(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                a2.c.f(this.f2301b, (ic.k) this.f2304e, (j1.q) this.f2303d, (f1.f) this.f2302c, (x0.o) obj, x0.v.D(3121));
                break;
            case 3:
                ic.k kVar = (ic.k) this.f2304e;
                x0.w0 w0Var = (x0.w0) this.f2302c;
                String str = (String) this.f2303d;
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str2 = (String) w0Var.getValue();
                    j1.q qVarC = androidx.compose.foundation.layout.c.c(j1.n.f9689a, 1.0f);
                    boolean zF = oVar.f(kVar);
                    Object objK = oVar.K();
                    if (zF || objK == x0.k.f24334a) {
                        objK = new ea.e(kVar, w0Var, 1);
                        oVar.h0(objK);
                    }
                    a5.a(str2, (ic.k) objK, qVarC, false, false, null, f1.g.f(1099440053, new p(14, str), oVar), null, null, null, false, null, null, null, this.f2301b, 0, 0, null, null, oVar, 1573248, 0, 1032120);
                } else {
                    oVar.Q();
                }
                return ub.a0.f21526a;
            default:
                hg.b bVar = (hg.b) this.f2303d;
                ic.k kVar2 = (ic.k) this.f2304e;
                x0.w0 w0Var2 = (x0.w0) this.f2302c;
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) w0Var2.getValue()).booleanValue();
                    long jF = ((m0.b1) oVar2.j(m0.c1.f12773a)).f();
                    if ((1022 & 1) != 0) {
                        jF = ((q1.q) ((m0.b1) oVar2.j(m0.c1.f12773a)).f12708d.getValue()).f17577a;
                    }
                    long j10 = jF;
                    o2 o2Var = m0.c1.f12773a;
                    long jI = ((m0.b1) oVar2.j(o2Var)).i();
                    long jE = ((m0.b1) oVar2.j(o2Var)).e();
                    x0.z zVar = j1.f13125a;
                    long j11 = ((q1.q) oVar2.j(zVar)).f17577a;
                    if (((m0.b1) oVar2.j(o2Var)).j()) {
                        q1.h0.r(j11);
                    } else {
                        q1.h0.r(j11);
                    }
                    long jL = q1.h0.l(q1.q.b(0.38f, j10), ((m0.b1) oVar2.j(o2Var)).i());
                    long j12 = ((q1.q) oVar2.j(zVar)).f17577a;
                    if (((m0.b1) oVar2.j(o2Var)).j()) {
                        q1.h0.r(j12);
                    } else {
                        q1.h0.r(j12);
                    }
                    long jL2 = q1.h0.l(q1.q.b(0.38f, j10), ((m0.b1) oVar2.j(o2Var)).i());
                    long j13 = ((q1.q) oVar2.j(zVar)).f17577a;
                    if (((m0.b1) oVar2.j(o2Var)).j()) {
                        q1.h0.r(j13);
                    } else {
                        q1.h0.r(j13);
                    }
                    long jL3 = q1.h0.l(q1.q.b(0.38f, jI), ((m0.b1) oVar2.j(o2Var)).i());
                    long j14 = ((q1.q) oVar2.j(zVar)).f17577a;
                    if (((m0.b1) oVar2.j(o2Var)).j()) {
                        q1.h0.r(j14);
                    } else {
                        q1.h0.r(j14);
                    }
                    w1 w1Var = new w1(j10, q1.q.b(0.54f, j10), jI, q1.q.b(0.38f, jE), jL, q1.q.b(0.54f, jL2), jL3, q1.q.b(0.38f, q1.h0.l(q1.q.b(0.38f, jE), ((m0.b1) oVar2.j(o2Var)).i())));
                    boolean zH = oVar2.h(bVar) | oVar2.f(kVar2);
                    Object objK2 = oVar2.K();
                    if (zH || objK2 == x0.k.f24334a) {
                        objK2 = new i(kVar2, w0Var2, bVar);
                        oVar2.h0(objK2);
                    }
                    v7.a(zBooleanValue, (ic.k) objK2, null, this.f2301b, w1Var, oVar2, 0);
                } else {
                    oVar2.Q();
                }
                return ub.a0.f21526a;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ b(ic.k kVar, boolean z10, x0.w0 w0Var, String str) {
        this.f2304e = kVar;
        this.f2301b = z10;
        this.f2302c = w0Var;
        this.f2303d = str;
    }

    public /* synthetic */ b(j7.b bVar, ic.k kVar, x0.w0 w0Var, boolean z10, int i10) {
        this.f2303d = bVar;
        this.f2304e = kVar;
        this.f2302c = w0Var;
        this.f2301b = z10;
    }

    public /* synthetic */ b(boolean z10, ic.k kVar, j1.q qVar, f1.f fVar, int i10) {
        this.f2301b = z10;
        this.f2304e = kVar;
        this.f2303d = qVar;
        this.f2302c = fVar;
    }

    public /* synthetic */ b(boolean z10, String str, lf.f fVar, x0.w0 w0Var, int i10) {
        this.f2301b = z10;
        this.f2303d = str;
        this.f2304e = fVar;
        this.f2302c = w0Var;
    }
}
