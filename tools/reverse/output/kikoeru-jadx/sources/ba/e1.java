package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f2342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1 f2344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2345h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, ac.c cVar) {
        super(cVar);
        this.f2344g = f1Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f2343f = obj;
        this.f2345h |= Integer.MIN_VALUE;
        return this.f2344g.c(null, null, this);
    }
}
