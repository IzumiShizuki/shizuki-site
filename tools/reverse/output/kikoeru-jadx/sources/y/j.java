package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.f f25151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(j1.f fVar, int i10) {
        super(2);
        this.f25150b = i10;
        this.f25151c = fVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f25150b) {
            case 0:
                return Integer.valueOf(this.f25151c.a(0, ((Number) obj).intValue(), (f3.m) obj2));
            default:
                int i10 = (int) (((f3.l) obj).f6666a >> 32);
                return new f3.j((((long) this.f25151c.a(0, i10, (f3.m) obj2)) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
