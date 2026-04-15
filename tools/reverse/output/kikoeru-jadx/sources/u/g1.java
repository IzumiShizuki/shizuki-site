package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i1 f20914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f20915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1 f20916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(i1 i1Var, ac.c cVar) {
        super(cVar);
        this.f20916f = i1Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f20915e = obj;
        this.f20917g |= Integer.MIN_VALUE;
        return this.f20916f.f(this);
    }
}
