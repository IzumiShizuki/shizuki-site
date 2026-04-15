package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.l1 f7586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(l0.l1 l1Var, boolean z10, int i10) {
        super(2);
        this.f7586b = l1Var;
        this.f7587c = z10;
        this.f7588d = i10;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iD = x0.v.D(this.f7588d | 1);
        q0.h(this.f7586b, this.f7587c, (x0.o) obj, iD);
        return ub.a0.f21526a;
    }
}
