package ca;

import ic.n;
import m0.h1;
import m0.j1;
import m0.r3;
import n7.b0;
import q1.q;
import ub.a0;
import w1.f;
import x0.n2;
import x0.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f3831b;

    public /* synthetic */ c(n2 n2Var, int i10) {
        this.f3830a = i10;
        this.f3831b = n2Var;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        long jB;
        switch (this.f3830a) {
            case 0:
                o oVar = (o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r3.b((f) this.f3831b.getValue(), "Play/Pause", null, 0L, oVar, 48, 12);
                } else {
                    oVar.Q();
                }
                break;
            default:
                o oVar2 = (o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    f fVarM = b0.m();
                    if (((Boolean) this.f3831b.getValue()).booleanValue()) {
                        oVar2.W(-479445813);
                        oVar2.p(false);
                        jB = q.f17572e;
                    } else {
                        oVar2.W(-479443563);
                        jB = q.b(((Number) oVar2.j(h1.f13043a)).floatValue(), ((q) oVar2.j(j1.f13125a)).f17577a);
                        oVar2.p(false);
                    }
                    r3.b(fVarM, "Favorite", null, jB, oVar2, 48, 4);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
