package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j0 f19157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w.h f19158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f19159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f19160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19161h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, ac.c cVar) {
        super(cVar);
        this.f19160g = j0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f19159f = obj;
        this.f19161h |= Integer.MIN_VALUE;
        return j0.B0(this.f19160g, this);
    }
}
