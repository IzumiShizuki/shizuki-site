package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends jc.m implements ic.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f7234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f7235d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7236b;

    static {
        int i10 = 2;
        f7234c = new m(i10, 0);
        f7235d = new m(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i10, int i11) {
        super(i10);
        this.f7236b = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f7236b) {
            case 0:
                x0.o oVar = (x0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!oVar.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    oVar.Q();
                }
                break;
            default:
                ((t0) obj2).getClass();
                break;
        }
        return ub.a0.f21526a;
    }
}
