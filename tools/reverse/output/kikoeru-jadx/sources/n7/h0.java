package n7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.a f15490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f15491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f15492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f15493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15494h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, ac.c cVar) {
        super(cVar);
        this.f15493g = m0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f15492f = obj;
        this.f15494h |= Integer.MIN_VALUE;
        return this.f15493g.e(null, null, null, this);
    }
}
