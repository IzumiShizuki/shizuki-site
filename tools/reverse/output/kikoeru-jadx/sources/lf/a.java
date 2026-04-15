package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mf.p f12348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f12349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i7.n f12350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12351g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i7.n nVar, yb.c cVar) {
        super(cVar);
        this.f12350f = nVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f12349e = obj;
        this.f12351g |= Integer.MIN_VALUE;
        return this.f12350f.b(null, this);
    }
}
