package e3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6063a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.compare(this.f6063a, ((a) obj).f6063a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6063a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f6063a + ')';
    }
}
