package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f17251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r.x f17252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f17253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.f f17254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17256h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Object obj, j1.q qVar, r.x xVar, String str, f1.f fVar, int i10, int i11) {
        super(2);
        this.f17250b = obj;
        this.f17251c = qVar;
        this.f17252d = xVar;
        this.f17253e = str;
        this.f17254f = fVar;
        this.f17255g = i10;
        this.f17256h = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        n7.b0.c(this.f17250b, this.f17251c, this.f17252d, this.f17253e, this.f17254f, (x0.o) obj, x0.v.D(this.f17255g | 1), this.f17256h);
        return ub.a0.f21526a;
    }
}
