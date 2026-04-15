package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p2 f9244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2 f9246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9247g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p2 p2Var, ac.c cVar) {
        super(cVar);
        this.f9246f = p2Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f9245e = obj;
        this.f9247g |= Integer.MIN_VALUE;
        return this.f9246f.E(null, this);
    }
}
