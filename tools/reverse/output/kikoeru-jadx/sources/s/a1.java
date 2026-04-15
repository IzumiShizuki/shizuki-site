package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.e1 f19100b;

    public a1() {
        long jE = q1.h0.e(4284900966L);
        y.e1 e1VarA = androidx.compose.foundation.layout.a.a(0.0f, 0.0f, 3);
        this.f19099a = jE;
        this.f19100b = e1VarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jc.l.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        a1 a1Var = (a1) obj;
        return q1.q.c(this.f19099a, a1Var.f19099a) && jc.l.a(this.f19100b, a1Var.f19100b);
    }

    public final int hashCode() {
        int i10 = q1.q.f17576i;
        return this.f19100b.hashCode() + (ub.v.a(this.f19099a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        q.t0.K(this.f19099a, ", drawPadding=", sb);
        sb.append(this.f19100b);
        sb.append(')');
        return sb.toString();
    }
}
