package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f8459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8460b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return jc.l.a(this.f8459a, t0Var.f8459a) && jc.l.a(this.f8460b, t0Var.f8460b);
    }

    public final int hashCode() {
        int iHashCode = this.f8459a.hashCode() * 31;
        String str = this.f8460b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.f8459a);
        sb.append(", typeFlexibilityId=");
        return q.t0.E(sb, this.f8460b, ')');
    }
}
