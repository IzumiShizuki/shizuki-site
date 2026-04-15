package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f7.v f13480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13481g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(f7.v vVar, yb.c cVar) {
        super(cVar);
        this.f13480f = vVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f13479e = obj;
        this.f13481g |= Integer.MIN_VALUE;
        return this.f13480f.n(null, this);
    }
}
