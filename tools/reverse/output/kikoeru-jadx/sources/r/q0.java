package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f18538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(w0 w0Var, int i10) {
        super(1);
        this.f18537b = i10;
        this.f18538c = w0Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f18537b) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                w0 w0Var = this.f18538c;
                long j10 = jLongValue - w0Var.f18614l;
                w0Var.f18614l = jLongValue;
                long jS = lc.b.S(j10 / ((double) w0Var.f18618p));
                o.g0 g0Var = w0Var.f18615m;
                if (g0Var.h()) {
                    Object[] objArr = g0Var.f15970a;
                    int i10 = g0Var.f15971b;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        p0 p0Var = (p0) objArr[i12];
                        w0.C1(w0Var, p0Var, jS);
                        p0Var.f18510c = true;
                    }
                    q1 q1Var = w0Var.f18607e;
                    if (q1Var != null) {
                        q1Var.o();
                    }
                    int i13 = g0Var.f15971b;
                    Object[] objArr2 = g0Var.f15970a;
                    oc.d dVarE = nh.b.E(0, i13);
                    int i14 = dVarE.f16307a;
                    int i15 = dVarE.f16308b;
                    if (i14 <= i15) {
                        while (true) {
                            objArr2[i14 - i11] = objArr2[i14];
                            if (((p0) objArr2[i14]).f18510c) {
                                i11++;
                            }
                            if (i14 != i15) {
                                i14++;
                            }
                        }
                    }
                    vb.l.p0(i13 - i11, i13, objArr2);
                    g0Var.f15971b -= i11;
                }
                p0 p0Var2 = w0Var.f18616n;
                if (p0Var2 != null) {
                    p0Var2.f18514g = w0Var.f18608f;
                    w0.C1(w0Var, p0Var2, jS);
                    w0Var.K1(p0Var2.f18511d);
                    if (p0Var2.f18511d == 1.0f) {
                        w0Var.f18616n = null;
                    }
                    w0Var.J1();
                }
                break;
            default:
                this.f18538c.f18614l = ((Number) obj).longValue();
                break;
        }
        return ub.a0.f21526a;
    }
}
