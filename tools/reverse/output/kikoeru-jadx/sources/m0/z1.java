package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements q1.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13987b;

    public /* synthetic */ z1(int i10, Object obj) {
        this.f13986a = i10;
        this.f13987b = obj;
    }

    @Override // q1.r
    public final long a() {
        switch (this.f13986a) {
            case 0:
                a2 a2Var = (a2) this.f13987b;
                long jA = a2Var.f12649t.a();
                if (jA != 16) {
                    return jA;
                }
                k5 k5Var = (k5) i2.f.i(a2Var, l5.f13235a);
                if (k5Var != null) {
                    long j10 = k5Var.f13193a;
                    if (j10 != 16) {
                        return j10;
                    }
                }
                long j11 = ((q1.q) i2.f.i(a2Var, j1.f13125a)).f17577a;
                return (((b1) i2.f.i(a2Var, c1.f12773a)).j() || ((double) q1.h0.r(j11)) >= 0.5d) ? j11 : q1.q.f17571d;
            default:
                return ((m5) this.f13987b).f13285c;
        }
    }
}
