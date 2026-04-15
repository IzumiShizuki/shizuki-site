package n7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m0 f15479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m0.w f15480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f15481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f15482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15483h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(m0 m0Var, ac.c cVar) {
        super(cVar);
        this.f15482g = m0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f15481f = obj;
        this.f15483h |= Integer.MIN_VALUE;
        return this.f15482g.d(this);
    }
}
