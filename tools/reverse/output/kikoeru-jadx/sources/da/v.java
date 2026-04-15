package da;

import hf.y;
import m0.c1;
import m0.p3;
import ub.a0;
import x0.j1;
import y.k1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5819a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5822d;

    public /* synthetic */ v(long j10, m0 m0Var, ic.a aVar, int i10) {
        this.f5820b = j10;
        this.f5821c = m0Var;
        this.f5822d = aVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f5819a) {
            case 0:
                ((Integer) obj2).getClass();
                a.d(this.f5820b, (m0) this.f5821c, (ic.a) this.f5822d, (x0.o) obj, x0.v.D(1));
                break;
            case 1:
                String str = (String) this.f5821c;
                final hf.y yVar = (hf.y) this.f5822d;
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y.v vVarA = y.u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
                    int iQ = x0.v.q(oVar);
                    j1 j1VarL = oVar.l();
                    j1.q qVarC = j1.a.c(j1.n.f9689a, oVar);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar.a0();
                    if (oVar.S) {
                        oVar.k(iVar);
                    } else {
                        oVar.k0();
                    }
                    x0.v.A(i2.j.f8738g, vVarA, oVar);
                    x0.v.A(i2.j.f8737f, j1VarL, oVar);
                    i2.h hVar = i2.j.f8741j;
                    if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                        j2.h0.s(iQ, oVar, iQ, hVar);
                    }
                    x0.v.A(i2.j.f8735d, qVarC, oVar);
                    ka.b.h(0, oVar);
                    long jC = c1.c((m0.b1) oVar.j(c1.f12773a));
                    f1.f fVarF = f1.g.f(-619654947, new ba.p(4, str), oVar);
                    final long j10 = this.f5820b;
                    m0.i0.c(fVarF, null, fa.b.f6969l, f1.g.f(-1202325166, new ic.o() { // from class: fa.i
                        @Override // ic.o
                        public final Object g(Object obj3, Object obj4, Object obj5) {
                            x0.o oVar2 = (x0.o) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            jc.l.e((k1) obj3, "$this$TopAppBar");
                            if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                y yVar2 = yVar;
                                boolean zH = oVar2.h(yVar2);
                                long j11 = j10;
                                boolean zE = zH | oVar2.e(j11);
                                Object objK = oVar2.K();
                                if (zE || objK == x0.k.f24334a) {
                                    objK = new da.r(yVar2, j11, 1);
                                    oVar2.h0(objK);
                                }
                                p3.a((ic.a) objK, null, false, b.f6970m, oVar2, 24576, 14);
                            } else {
                                oVar2.Q();
                            }
                            return a0.f21526a;
                        }
                    }, oVar), jC, 0L, 0, oVar, 1576326, 34);
                    oVar.p(true);
                } else {
                    oVar.Q();
                }
                return ub.a0.f21526a;
            default:
                ((Integer) obj2).getClass();
                t0.f.a((t0.j) this.f5821c, this.f5820b, (j1.q) this.f5822d, (x0.o) obj, x0.v.D(385));
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ v(String str, hf.y yVar, long j10) {
        this.f5821c = str;
        this.f5822d = yVar;
        this.f5820b = j10;
    }

    public /* synthetic */ v(t0.j jVar, long j10, j1.q qVar, int i10) {
        this.f5821c = jVar;
        this.f5820b = j10;
        this.f5822d = qVar;
    }
}
