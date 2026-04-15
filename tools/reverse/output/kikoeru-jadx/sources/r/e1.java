package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jc.y f18379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f18381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f18382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f18383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f18384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ic.k f18385h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(jc.y yVar, Object obj, f fVar, p pVar, k kVar, float f10, ic.k kVar2) {
        super(1);
        this.f18379b = yVar;
        this.f18380c = obj;
        this.f18381d = fVar;
        this.f18382e = pVar;
        this.f18383f = kVar;
        this.f18384g = f10;
        this.f18385h = kVar2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        f fVar = this.f18381d;
        i iVar = new i(this.f18380c, fVar.c(), this.f18382e, jLongValue, fVar.g(), jLongValue, new d1(0, this.f18383f));
        d.m(iVar, jLongValue, this.f18384g, this.f18381d, this.f18383f, this.f18385h);
        this.f18379b.f10838a = iVar;
        return ub.a0.f21526a;
    }
}
