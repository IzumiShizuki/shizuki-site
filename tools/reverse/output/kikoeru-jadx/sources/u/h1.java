package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i1 f20934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f20935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1 f20936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20937g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, ac.c cVar) {
        super(cVar);
        this.f20936f = i1Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f20935e = obj;
        this.f20937g |= Integer.MIN_VALUE;
        return this.f20936f.g(this);
    }
}
