package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f20910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f20911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0 f20912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20913g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, ac.c cVar) {
        super(cVar);
        this.f20912f = k0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f20911e = obj;
        this.f20913g |= Integer.MIN_VALUE;
        return k0.E0(this.f20912f, this);
    }
}
