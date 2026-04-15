package m9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f14985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f14986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14987f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ac.c cVar2) {
        super(cVar2);
        this.f14986e = cVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f14985d = obj;
        this.f14987f |= Integer.MIN_VALUE;
        Object objX = this.f14986e.x(null, this);
        return objX == zb.a.f26667a ? objX : new ub.n(objX);
    }
}
