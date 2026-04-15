package r;

import x0.g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f18500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f18501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(q1 q1Var, float f10) {
        super(1);
        this.f18500b = q1Var;
        this.f18501c = f10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        q1 q1Var = this.f18500b;
        boolean zG = q1Var.g();
        x0.c1 c1Var = q1Var.f18545g;
        if (!zG) {
            if (((g2) h1.n.u(c1Var.f24260b, c1Var)).f24312c == Long.MIN_VALUE) {
                c1Var.e(jLongValue);
                ((x0.e1) q1Var.f18539a.f801a).setValue(Boolean.TRUE);
            }
            long jS = jLongValue - ((g2) h1.n.u(c1Var.f24260b, c1Var)).f24312c;
            float f10 = this.f18501c;
            if (f10 != 0.0f) {
                jS = lc.b.S(jS / ((double) f10));
            }
            q1Var.n(jS);
            q1Var.h(jS, f10 == 0.0f);
        }
        return ub.a0.f21526a;
    }
}
