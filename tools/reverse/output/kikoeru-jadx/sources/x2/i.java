package x2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24558a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f24558a == ((i) obj).f24558a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24558a;
    }

    public final String toString() {
        int i10 = this.f24558a;
        return i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid";
    }
}
