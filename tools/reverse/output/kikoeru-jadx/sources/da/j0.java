package da;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f5713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5714g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, ac.c cVar) {
        super(cVar);
        this.f5713f = m0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f5712e = obj;
        this.f5714g |= Integer.MIN_VALUE;
        return this.f5713f.X(this);
    }
}
