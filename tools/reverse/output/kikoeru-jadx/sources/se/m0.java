package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc.q0 f19971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd.a f19972b;

    public m0(yc.q0 q0Var, qd.a aVar) {
        jc.l.e(q0Var, "typeParameter");
        jc.l.e(aVar, "typeAttr");
        this.f19971a = q0Var;
        this.f19972b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return jc.l.a(m0Var.f19971a, this.f19971a) && jc.l.a(m0Var.f19972b, this.f19972b);
    }

    public final int hashCode() {
        int iHashCode = this.f19971a.hashCode();
        return this.f19972b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f19971a + ", typeAttr=" + this.f19972b + ')';
    }
}
