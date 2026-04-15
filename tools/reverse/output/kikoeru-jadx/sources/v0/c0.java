package v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f22177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w.k f22178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1.q f22179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f22180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f22181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f22182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, w.k kVar, j1.q qVar, a0 a0Var, boolean z10, long j10, int i10) {
        super(2);
        this.f22177b = e0Var;
        this.f22178c = kVar;
        this.f22179d = qVar;
        this.f22180e = a0Var;
        this.f22181f = z10;
        this.f22182g = j10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iD = x0.v.D(196609);
        this.f22177b.a(this.f22178c, this.f22179d, this.f22180e, this.f22181f, this.f22182g, (x0.o) obj, iD);
        return ub.a0.f21526a;
    }
}
