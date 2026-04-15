package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc.y f18401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f18402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f18403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f18404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.k f18405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(jc.y yVar, float f10, f fVar, k kVar, ic.k kVar2) {
        super(1);
        this.f18401b = yVar;
        this.f18402c = f10;
        this.f18403d = fVar;
        this.f18404e = kVar;
        this.f18405f = kVar2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f18401b.f10838a;
        jc.l.b(obj2);
        d.m((i) obj2, jLongValue, this.f18402c, this.f18403d, this.f18404e, this.f18405f);
        return ub.a0.f21526a;
    }
}
