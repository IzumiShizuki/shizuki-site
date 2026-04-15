package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public final void a(g2.u0 u0Var, g2.u0 u0Var2, long j10) {
        long jH = d.h(j10, x0.f25284a);
        if (u0Var != null) {
            int iM = u0Var.m(f3.a.g(jH));
            new o.k(o.k.a(iM, u0Var.L(iM)));
        }
        if (u0Var2 != null) {
            int iM2 = u0Var2.m(f3.a.g(jH));
            new o.k(o.k.a(iM2, u0Var2.L(iM2)));
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l0);
    }

    public final int hashCode() {
        return j0.f25152a.hashCode() * 961;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + j0.f25152a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
