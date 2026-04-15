package uh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f22016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1.q f22018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f22020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.f f22021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22022h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y yVar, Object obj, j1.q qVar, boolean z10, boolean z11, f1.f fVar, int i10) {
        super(2);
        this.f22016b = yVar;
        this.f22017c = obj;
        this.f22018d = qVar;
        this.f22019e = z10;
        this.f22020f = z11;
        this.f22021g = fVar;
        this.f22022h = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ud.s.a(this.f22016b, this.f22017c, this.f22018d, this.f22019e, this.f22020f, this.f22021g, (x0.o) obj, x0.v.D(this.f22022h | 1));
        return ub.a0.f21526a;
    }
}
