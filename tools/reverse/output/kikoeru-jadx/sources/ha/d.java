package ha;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f8262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f8264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8265g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, ac.c cVar) {
        super(cVar);
        this.f8264f = gVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f8263e = obj;
        this.f8265g |= Integer.MIN_VALUE;
        return this.f8264f.w(null, this);
    }
}
