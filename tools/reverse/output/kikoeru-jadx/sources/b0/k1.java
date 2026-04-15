package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f1285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(m1 m1Var, int i10) {
        super(1);
        this.f1284b = i10;
        this.f1285c = m1Var;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f1284b) {
            case 0:
                n0 n0Var = (n0) this.f1285c.f1303o.b();
                int iA = n0Var.a();
                int i10 = 0;
                while (true) {
                    if (i10 >= iA) {
                        i10 = -1;
                    } else if (!n0Var.b(i10).equals(obj)) {
                        i10++;
                    }
                }
                return Integer.valueOf(i10);
            default:
                int iIntValue = ((Number) obj).intValue();
                m1 m1Var = this.f1285c;
                n0 n0Var2 = (n0) m1Var.f1303o.b();
                if (iIntValue < 0 || iIntValue >= n0Var2.a()) {
                    StringBuilder sbO = j2.h0.o(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbO.append(n0Var2.a());
                    sbO.append(')');
                    x.a.a(sbO.toString());
                }
                hf.a0.y(m1Var.n0(), null, null, new l1(m1Var, iIntValue, (yb.c) null), 3);
                return Boolean.TRUE;
        }
    }
}
