package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11403b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ub.e f11408g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(j1.q qVar, r rVar, ic.k kVar, f1.f fVar, int i10) {
        super(2);
        this.f11404c = qVar;
        this.f11406e = rVar;
        this.f11407f = kVar;
        this.f11408g = fVar;
        this.f11405d = i10;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [ic.k, jc.m] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ic.k, jc.m] */
    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f11403b) {
            case 0:
                ((Number) obj2).intValue();
                u0.c((j1.q) this.f11404c, (r) this.f11406e, (ic.k) this.f11407f, (f1.f) this.f11408g, (x0.o) obj, x0.v.D(this.f11405d | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                n7.b0.a((t.l) this.f11406e, (ic.a) this.f11407f, (j1.q) this.f11404c, (jc.m) this.f11408g, (x0.o) obj, x0.v.D(this.f11405d | 1));
                break;
            default:
                ((Number) obj2).intValue();
                t.m.d((j3.x) this.f11404c, (ic.a) this.f11406e, (t.c) this.f11407f, (jc.m) this.f11408g, (x0.o) obj, x0.v.D(this.f11405d | 1));
                break;
        }
        return ub.a0.f21526a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(j3.x xVar, ic.a aVar, t.c cVar, ic.k kVar, int i10) {
        super(2);
        this.f11404c = xVar;
        this.f11406e = aVar;
        this.f11407f = cVar;
        this.f11408g = (jc.m) kVar;
        this.f11405d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(t.l lVar, ic.a aVar, j1.q qVar, ic.k kVar, int i10) {
        super(2);
        this.f11406e = lVar;
        this.f11407f = aVar;
        this.f11404c = qVar;
        this.f11408g = (jc.m) kVar;
        this.f11405d = i10;
    }
}
