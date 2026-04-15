package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1.q f7239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.n f7240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(j1.q qVar, ic.n nVar, int i10, int i11) {
        super(2);
        this.f7239b = qVar;
        this.f7240c = nVar;
        this.f7241d = i10;
        this.f7242e = i11;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iD = x0.v.D(this.f7241d | 1);
        int i10 = this.f7242e;
        n1.c(this.f7239b, this.f7240c, (x0.o) obj, iD, i10);
        return ub.a0.f21526a;
    }
}
