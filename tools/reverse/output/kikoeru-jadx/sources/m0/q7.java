package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q7 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i7.g f13526f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(i7.g gVar, yb.c cVar) {
        super(cVar);
        this.f13526f = gVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f13524d = obj;
        this.f13525e |= Integer.MIN_VALUE;
        return this.f13526f.n(null, this);
    }
}
