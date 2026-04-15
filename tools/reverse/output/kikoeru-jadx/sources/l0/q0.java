package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends jc.m implements ic.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f11599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var) {
        super(6);
        this.f11599b = s0Var;
    }

    @Override // ic.r
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        g2.c0 c0Var = (g2.c0) obj2;
        long j10 = ((p1.b) obj3).f16481a;
        long j11 = ((p1.b) obj4).f16481a;
        s0 s0Var = this.f11599b;
        long jA = s0.a(s0Var, c0Var, j10);
        long jA2 = s0.a(s0Var, c0Var, j11);
        s0Var.l(zBooleanValue);
        return Boolean.valueOf(s0Var.o(jA, jA2, ((Boolean) obj5).booleanValue(), (s) obj6));
    }
}
