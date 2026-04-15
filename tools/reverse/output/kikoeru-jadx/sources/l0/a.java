package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f11402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(o oVar, int i10) {
        super(0);
        this.f11401b = i10;
        this.f11402c = oVar;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f11401b) {
            case 0:
                return Boolean.valueOf((this.f11402c.b() & 9223372034707292159L) != 9205357640488583168L);
            default:
                return Boolean.valueOf((this.f11402c.b() & 9223372034707292159L) != 9205357640488583168L);
        }
    }
}
