package c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, String str) {
        super(1);
        this.f3058b = i10;
        this.f3059c = str;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f3058b) {
            case 0:
                ((Number) obj).intValue();
                break;
            case 1:
                q2.v.d((q2.k) obj, this.f3059c);
                break;
            case 2:
                q2.k kVar = (q2.k) obj;
                q2.v.d(kVar, this.f3059c);
                q2.v.e(kVar, 5);
                break;
            default:
                q2.k kVar2 = (q2.k) obj;
                q2.v.d(kVar2, this.f3059c);
                q2.v.e(kVar2, 5);
                break;
        }
        return ub.a0.f21526a;
    }
}
