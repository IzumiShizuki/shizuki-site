package u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f20942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f20943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f20944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0 f20945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20946h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, ac.c cVar) {
        super(cVar);
        this.f20945g = k0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f20944f = obj;
        this.f20946h |= Integer.MIN_VALUE;
        return k0.G0(this.f20945g, null, this);
    }
}
