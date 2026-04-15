package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i7.c f12405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i7.c cVar, yb.c cVar2) {
        super(cVar2);
        this.f12405e = cVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f12404d = obj;
        this.f12406f |= Integer.MIN_VALUE;
        return this.f12405e.n(null, this);
    }
}
