package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.k f17348c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(ic.k kVar, int i10) {
        super(1);
        this.f17347b = i10;
        this.f17348c = kVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f17347b) {
            case 0:
                return new f3.j((((long) ((Number) this.f17348c.a(Integer.valueOf((int) (((f3.l) obj).f6666a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 1:
                return new f3.j((((long) 0) << 32) | (4294967295L & ((long) ((Number) this.f17348c.a(Integer.valueOf((int) (((f3.l) obj).f6666a & 4294967295L)))).intValue())));
            case 2:
                return new f3.j((((long) ((Number) this.f17348c.a(Integer.valueOf((int) (((f3.l) obj).f6666a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 3:
                return new f3.j((((long) 0) << 32) | (4294967295L & ((long) ((Number) this.f17348c.a(Integer.valueOf((int) (((f3.l) obj).f6666a & 4294967295L)))).intValue())));
            default:
                this.f17348c.a(Float.valueOf(((Number) obj).floatValue()));
                return ub.a0.f21526a;
        }
    }
}
