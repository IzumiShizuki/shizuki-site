package q1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17582a;

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f17582a == ((x) obj).f17582a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17582a;
    }

    public final String toString() {
        int i10 = this.f17582a;
        return i10 == 0 ? "Argb8888" : i10 == 1 ? "Alpha8" : i10 == 2 ? "Rgb565" : i10 == 3 ? "F16" : i10 == 4 ? "Gpu" : "Unknown";
    }
}
