package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f24367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24368b;

    public n0(Integer num, Object obj) {
        this.f24367a = num;
        this.f24368b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f24367a.equals(n0Var.f24367a) && jc.l.a(this.f24368b, n0Var.f24368b);
    }

    public final int hashCode() {
        int iHashCode = this.f24367a.hashCode() * 31;
        Object obj = this.f24368b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f24367a + ", right=" + this.f24368b + ')';
    }
}
