package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f9320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, yb.c cVar) {
        super(cVar);
        this.f9320f = u0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f9318d = obj;
        this.f9319e |= Integer.MIN_VALUE;
        return this.f9320f.n(null, this);
    }
}
