package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i8 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.n f13112c;

    public /* synthetic */ i8(long j10, ic.n nVar, int i10) {
        this.f13110a = i10;
        this.f13111b = j10;
        this.f13112c = nVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f13110a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m8.b(this.f13111b, null, this.f13112c, oVar, 0, 6);
                } else {
                    oVar.Q();
                }
                break;
            case 1:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    m8.b(this.f13111b, null, this.f13112c, oVar2, 0, 6);
                } else {
                    oVar2.Q();
                }
                break;
            default:
                x0.o oVar3 = (x0.o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (oVar3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x0.v.a(h1.f13043a.a(Float.valueOf(q1.q.d(this.f13111b))), f1.g.f(-1072292694, new g0((f1.f) this.f13112c, 3), oVar3), oVar3, 56);
                } else {
                    oVar3.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
