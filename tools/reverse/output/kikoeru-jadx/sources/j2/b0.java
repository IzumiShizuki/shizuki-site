package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o.z f9725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kf.c f9726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f9727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f9728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9729h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, ac.c cVar) {
        super(cVar);
        this.f9728g = d0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f9727f = obj;
        this.f9729h |= Integer.MIN_VALUE;
        return this.f9728g.l(this);
    }
}
