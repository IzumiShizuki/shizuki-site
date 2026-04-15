package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f24304b = new g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f24305c = new g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24306a;

    public /* synthetic */ g(int i10) {
        this.f24306a = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f24306a) {
            case 0:
                o oVar = (o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                }
                break;
            default:
                o oVar2 = (o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!oVar2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    oVar2.Q();
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
