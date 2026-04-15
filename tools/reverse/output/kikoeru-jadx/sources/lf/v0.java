package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i7.s0 f12507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(i7.s0 s0Var, yb.c cVar) {
        super(cVar);
        this.f12507e = s0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f12506d = obj;
        this.f12508f |= Integer.MIN_VALUE;
        return this.f12507e.a(0, this);
    }
}
