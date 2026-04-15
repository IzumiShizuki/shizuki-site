package v4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f22731c = new z0(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22733b;

    public z0(int i10, boolean z10) {
        this.f22732a = i10;
        this.f22733b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            z0 z0Var = (z0) obj;
            if (this.f22732a == z0Var.f22732a && this.f22733b == z0Var.f22733b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f22732a << 1) + (this.f22733b ? 1 : 0);
    }
}
