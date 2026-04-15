package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f21047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f21048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f21049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21050g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, ac.c cVar) {
        super(cVar);
        this.f21049f = r1Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f21048e = obj;
        this.f21050g |= Integer.MIN_VALUE;
        return this.f21049f.D(0L, 0L, this);
    }
}
