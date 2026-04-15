package t0;

import androidx.compose.foundation.layout.FillElement;
import g2.v0;
import ic.o;
import j1.n;
import j1.q;
import j2.h0;
import jc.l;
import m0.b1;
import m0.c1;
import m0.g5;
import m0.z8;
import na.w;
import ub.a0;
import x0.j1;
import x0.v;
import y.k1;
import y.p;
import z9.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f20105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20106c;

    public /* synthetic */ e(long j10, Object obj, int i10) {
        this.f20104a = i10;
        this.f20105b = j10;
        this.f20106c = obj;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        x0.o oVar;
        long jC;
        switch (this.f20104a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x0.o oVar2 = (x0.o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= oVar2.g(zBooleanValue) ? 4 : 2;
                }
                if (oVar2.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
                    j1.h hVar = j1.c.f9666e;
                    j jVar = (j) this.f20106c;
                    v0 v0VarD = p.d(hVar, false);
                    int iQ = v.q(oVar2);
                    j1 j1VarL = oVar2.l();
                    q qVarC = j1.a.c(fillElement, oVar2);
                    i2.k.f8771g0.getClass();
                    i2.i iVar = i2.j.f8733b;
                    oVar2.a0();
                    if (oVar2.S) {
                        oVar2.k(iVar);
                    } else {
                        oVar2.k0();
                    }
                    v.A(i2.j.f8738g, v0VarD, oVar2);
                    v.A(i2.j.f8737f, j1VarL, oVar2);
                    i2.h hVar2 = i2.j.f8741j;
                    if (oVar2.S || !l.a(oVar2.K(), Integer.valueOf(iQ))) {
                        h0.s(iQ, oVar2, iQ, hVar2);
                    }
                    v.A(i2.j.f8735d, qVarC, oVar2);
                    float f10 = f.f20109c;
                    float f11 = f.f20110d;
                    float f12 = (f10 + f11) * 2;
                    n nVar = n.f9689a;
                    long j10 = this.f20105b;
                    if (zBooleanValue) {
                        oVar2.W(-1916609863);
                        oVar = oVar2;
                        g5.a(androidx.compose.foundation.layout.c.j(nVar, f12), j10, f11, 0L, 0, oVar, 390, 24);
                        oVar.p(false);
                    } else {
                        oVar = oVar2;
                        oVar.W(-1916362142);
                        f.a(jVar, j10, androidx.compose.foundation.layout.c.j(nVar, f12), oVar, 384);
                        oVar.p(false);
                    }
                    oVar.p(true);
                } else {
                    oVar2.Q();
                }
                break;
            default:
                x0.o oVar3 = (x0.o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                l.e((k1) obj, "$this$TextButton");
                if (oVar3.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    long j11 = this.f20105b;
                    String strA = w.a(j11);
                    if (j11 == ((r) this.f20106c).x()) {
                        oVar3.W(1981681975);
                        jC = ((b1) oVar3.j(c1.f12773a)).f();
                        oVar3.p(false);
                    } else {
                        oVar3.W(1981683964);
                        jC = ((b1) oVar3.j(c1.f12773a)).c();
                        oVar3.p(false);
                    }
                    z8.b(strA, null, jC, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oVar3, 0, 0, 131066);
                } else {
                    oVar3.Q();
                }
                break;
        }
        return a0.f21526a;
    }
}
