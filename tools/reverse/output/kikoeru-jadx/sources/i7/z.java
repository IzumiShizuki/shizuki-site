package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f9388b = new z(false);

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f9048a == ((z) obj).f9048a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9048a ? 1231 : 1237;
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.f9048a + ')';
    }
}
