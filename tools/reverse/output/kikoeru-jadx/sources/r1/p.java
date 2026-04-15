package r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f18703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i10) {
        super(1);
        this.f18702b = i10;
        this.f18703c = qVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f18702b) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f18703c.f18715n.c(nh.b.i(dDoubleValue, r10.f18706e, r10.f18707f)));
            default:
                return Double.valueOf(nh.b.i(this.f18703c.f18712k.c(((Number) obj).doubleValue()), r10.f18706e, r10.f18707f));
        }
    }
}
