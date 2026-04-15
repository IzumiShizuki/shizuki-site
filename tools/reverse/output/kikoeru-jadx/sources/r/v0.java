package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f18591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18592e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f18593f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f18594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18595h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, ac.c cVar) {
        super(cVar);
        this.f18594g = w0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f18593f = obj;
        this.f18595h |= Integer.MIN_VALUE;
        return w0.F1(this.f18594g, this);
    }
}
