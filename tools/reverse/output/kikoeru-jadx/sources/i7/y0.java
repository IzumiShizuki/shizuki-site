package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f9382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9383f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(e eVar, yb.c cVar) {
        super(cVar);
        this.f9382e = eVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f9381d = obj;
        this.f9383f |= Integer.MIN_VALUE;
        return this.f9382e.a(null, this);
    }
}
