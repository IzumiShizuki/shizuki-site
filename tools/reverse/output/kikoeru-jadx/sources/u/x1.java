package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f21120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jc.x f21121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f21122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c2 f21123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21124h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(c2 c2Var, ac.c cVar) {
        super(cVar);
        this.f21123g = c2Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f21122f = obj;
        this.f21124h |= Integer.MIN_VALUE;
        return this.f21123g.b(0L, this);
    }
}
