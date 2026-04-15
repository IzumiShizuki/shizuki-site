package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.n f12892b;

    public /* synthetic */ e(int i10, ic.n nVar) {
        this.f12891a = i10;
        this.f12892b = nVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f12891a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z8.a(((d9) oVar.j(e9.f12960b)).f12884g, this.f12892b, oVar, 0);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x0.z zVar = h1.f13043a;
                    long j10 = ((q1.q) oVar2.j(j1.f13125a)).f17577a;
                    x0.v.a(zVar.a(Float.valueOf((!((b1) oVar2.j(c1.f12773a)).j() ? ((double) q1.h0.r(j10)) < 0.5d : ((double) q1.h0.r(j10)) > 0.5d) ? 0.87f : 1.0f)), f1.g.f(-1654653485, new e(0, this.f12892b), oVar2), oVar2, 56);
                } else {
                    oVar2.Q();
                }
                break;
            case 2:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z8.a(((d9) oVar3.j(e9.f12960b)).f12887j, this.f12892b, oVar3, 0);
                } else {
                    oVar3.Q();
                }
                break;
            case 3:
                x0.o oVar4 = (x0.o) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (oVar4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x0.z zVar2 = h1.f13043a;
                    long j11 = ((q1.q) oVar4.j(j1.f13125a)).f17577a;
                    x0.v.a(zVar2.a(Float.valueOf((!((b1) oVar4.j(c1.f12773a)).j() ? ((double) q1.h0.r(j11)) < 0.5d : ((double) q1.h0.r(j11)) > 0.5d) ? 0.6f : 0.74f)), f1.g.f(-2126650894, new e(2, this.f12892b), oVar4), oVar4, 56);
                } else {
                    oVar4.Q();
                }
                break;
            default:
                x0.o oVar5 = (x0.o) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (oVar5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    z8.a(t2.l0.a(((d9) oVar5.j(e9.f12960b)).f12889l, 0L, 0L, null, null, null, 0L, null, null, 0L, null, null, 16744447), this.f12892b, oVar5, 0);
                } else {
                    oVar5.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
