package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l8 implements ic.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13253a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Float f13255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.n f13256d;

    public l8(long j10, Float f10, ic.n nVar) {
        this.f13254b = j10;
        this.f13255c = f10;
        this.f13256d = nVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f13253a) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ic.n nVar = this.f13256d;
                    Float f10 = this.f13255c;
                    if (f10 != null) {
                        oVar.W(1484860324);
                        x0.v.a(h1.f13043a.a(f10), nVar, oVar, 8);
                        oVar.p(false);
                    } else {
                        oVar.W(1485059902);
                        x0.v.a(h1.f13043a.a(Float.valueOf(q1.q.d(this.f13254b))), nVar, oVar, 8);
                        oVar.p(false);
                    }
                } else {
                    oVar.Q();
                }
                break;
            default:
                x0.o oVar2 = (x0.o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x0.z zVar = j1.f13125a;
                    long j10 = this.f13254b;
                    x0.v.a(zVar.a(new q1.q(j10)), f1.g.f(-1624601445, new l8(this.f13255c, this.f13256d, j10), oVar2), oVar2, 56);
                } else {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }

    public l8(Float f10, ic.n nVar, long j10) {
        this.f13255c = f10;
        this.f13256d = nVar;
        this.f13254b = j10;
    }
}
