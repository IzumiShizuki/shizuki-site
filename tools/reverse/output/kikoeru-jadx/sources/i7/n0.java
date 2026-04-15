package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f9215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h2 f9216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f9217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f9218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9219h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, ac.c cVar) {
        super(cVar);
        this.f9218g = o0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f9217f = obj;
        this.f9219h |= Integer.MIN_VALUE;
        return o0.a(this.f9218g, null, this);
    }
}
