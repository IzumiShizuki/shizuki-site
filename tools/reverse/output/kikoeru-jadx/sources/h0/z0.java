package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7976a;

    public final boolean equals(Object obj) {
        if (obj instanceof z0) {
            return this.f7976a == ((z0) obj).f7976a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7976a;
    }

    public final String toString() {
        return "MenuItemsAvailability(value=" + this.f7976a + ')';
    }
}
