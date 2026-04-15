package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f9029b = new a0(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f9030c = new a0(false);

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return this.f9048a == ((a0) obj).f9048a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9048a ? 1231 : 1237;
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.f9048a + ')';
    }
}
