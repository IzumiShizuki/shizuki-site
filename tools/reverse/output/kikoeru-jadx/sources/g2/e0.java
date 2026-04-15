package g2;

import androidx.compose.ui.CompositionLocalMapInjectionElement;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends jc.m implements ic.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f7174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(j1.q qVar, int i10) {
        super(3);
        this.f7173b = i10;
        this.f7174c = qVar;
    }

    @Override // ic.o
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f7173b) {
            case 0:
                x0.o oVar = ((x0.y1) obj).f24525a;
                x0.o oVar2 = (x0.o) obj2;
                ((Number) obj3).intValue();
                long j10 = oVar2.T;
                int i10 = (int) (j10 ^ (j10 >>> 32));
                j1.q qVarC = j1.a.c(this.f7174c, oVar2);
                oVar.X(509942095);
                i2.k.f8771g0.getClass();
                x0.v.A(i2.j.f8735d, qVarC, oVar);
                i2.h hVar = i2.j.f8741j;
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(i10))) {
                    j2.h0.s(i10, oVar, i10, hVar);
                }
                oVar.p(false);
                break;
            default:
                x0.o oVar3 = ((x0.y1) obj).f24525a;
                x0.o oVar4 = (x0.o) obj2;
                ((Number) obj3).intValue();
                int iQ = x0.v.q(oVar4);
                j1.n nVar = j1.n.f9689a;
                j1.q qVarC2 = this.f7174c;
                if (qVarC2 != nVar) {
                    qVarC2 = j1.a.c(a0.c.r(new CompositionLocalMapInjectionElement(oVar4.l()), qVarC2), oVar4);
                }
                oVar3.X(509942095);
                i2.k.f8771g0.getClass();
                x0.v.A(i2.j.f8735d, qVarC2, oVar3);
                i2.h hVar2 = i2.j.f8741j;
                if (oVar3.S || !jc.l.a(oVar3.K(), Integer.valueOf(iQ))) {
                    j2.h0.s(iQ, oVar3, iQ, hVar2);
                }
                oVar3.p(false);
                break;
        }
        return ub.a0.f21526a;
    }
}
