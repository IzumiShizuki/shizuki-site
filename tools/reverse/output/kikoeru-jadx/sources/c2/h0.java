package c2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f3274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3275f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, ac.a aVar) {
        super(aVar);
        this.f3274e = i0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f3273d = obj;
        this.f3275f |= Integer.MIN_VALUE;
        return this.f3274e.g(0L, null, this);
    }
}
