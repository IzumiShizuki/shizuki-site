package p7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f16906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f16907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f16910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16911i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, ac.c cVar) {
        super(cVar);
        this.f16910h = rVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f16909g = obj;
        this.f16911i |= Integer.MIN_VALUE;
        return this.f16910h.f(false, this);
    }
}
