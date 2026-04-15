package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v[] f7290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(v[] vVarArr, int i10) {
        super(2);
        this.f7289b = i10;
        this.f7290c = vVarArr;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f7289b) {
            case 0:
                return Float.valueOf(n1.e((f1) obj, true, this.f7290c, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(n1.e((f1) obj, false, this.f7290c, ((Number) obj2).floatValue()));
        }
    }
}
