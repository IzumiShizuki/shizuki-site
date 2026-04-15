package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.l1 f7823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(l0.l1 l1Var, int i10) {
        super(1);
        this.f7822b = i10;
        this.f7823c = l1Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f7822b) {
            case 0:
                return new b0.h0(8, this.f7823c);
            default:
                long j10 = ((p1.b) obj).f16481a;
                this.f7823c.p();
                return ub.a0.f21526a;
        }
    }
}
