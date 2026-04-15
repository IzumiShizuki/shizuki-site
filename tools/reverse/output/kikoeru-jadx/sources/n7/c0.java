package n7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f15436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f15437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15438g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(m0 m0Var, ac.c cVar) {
        super(cVar);
        this.f15437f = m0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f15436e = obj;
        this.f15438g |= Integer.MIN_VALUE;
        return m0.a(this.f15437f, null, this);
    }
}
