package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.o f7583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1.q f7584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l0.o oVar, j1.q qVar, long j10, int i10) {
        super(2);
        this.f7583b = oVar;
        this.f7584c = qVar;
        this.f7585d = j10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iD = x0.v.D(1);
        e.a(this.f7583b, this.f7584c, this.f7585d, (x0.o) obj, iD);
        return ub.a0.f21526a;
    }
}
