package t8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends nh.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f20552q;

    public a(int i10) {
        this.f20552q = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f20552q == ((a) obj).f20552q;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20552q;
    }

    public final String toString() {
        return String.valueOf(this.f20552q);
    }
}
