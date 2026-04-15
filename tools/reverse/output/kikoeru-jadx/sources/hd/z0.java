package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f8501c = new z0(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f8502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f8503b;

    public z0(b1 b1Var, x0 x0Var) {
        this.f8502a = b1Var;
        this.f8503b = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f8502a == z0Var.f8502a && jc.l.a(this.f8503b, z0Var.f8503b);
    }

    public final int hashCode() {
        b1 b1Var = this.f8502a;
        int iHashCode = (b1Var == null ? 0 : b1Var.hashCode()) * 31;
        x0 x0Var = this.f8503b;
        return iHashCode + (x0Var != null ? x0Var.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.f8502a + ", type=" + this.f8503b + ')';
    }
}
