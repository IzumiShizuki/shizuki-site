package d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0 f5363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0 f5365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5366g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, ac.c cVar) {
        super(cVar);
        this.f5365f = l0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f5364e = obj;
        this.f5366g |= Integer.MIN_VALUE;
        return this.f5365f.a(null, 0.0f, this);
    }
}
