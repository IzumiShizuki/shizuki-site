package n7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e0 f15454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f15455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f15456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e0 f15457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15458h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, yb.c cVar) {
        super(cVar);
        this.f15457g = e0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f15456f = obj;
        this.f15458h |= Integer.MIN_VALUE;
        return this.f15457g.n(null, this);
    }
}
