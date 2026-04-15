package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v[] f7288c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v[] vVarArr, int i10) {
        super(2);
        this.f7287b = i10;
        this.f7288c = vVarArr;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f7287b) {
            case 0:
                return Float.valueOf(n1.e((f1) obj, true, this.f7288c, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(n1.e((f1) obj, false, this.f7288c, ((Number) obj2).floatValue()));
        }
    }
}
