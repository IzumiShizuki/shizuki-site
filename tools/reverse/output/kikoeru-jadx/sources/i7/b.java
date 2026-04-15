package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f9043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public vb.u f9044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f9045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f9046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9047h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, yb.c cVar2) {
        super(cVar2);
        this.f9046g = cVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f9045f = obj;
        this.f9047h |= Integer.MIN_VALUE;
        return this.f9046g.a(null, this);
    }
}
