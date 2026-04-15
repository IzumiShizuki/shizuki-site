package x2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24559a;

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f24559a == ((j) obj).f24559a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24559a;
    }

    public final String toString() {
        int i10 = this.f24559a;
        return i10 == 0 ? "None" : i10 == 1 ? "Weight" : i10 == 2 ? "Style" : i10 == 65535 ? "All" : "Invalid";
    }
}
