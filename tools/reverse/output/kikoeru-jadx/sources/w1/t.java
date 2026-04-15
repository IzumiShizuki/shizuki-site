package w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23291c;

    public t(float f10) {
        super(3);
        this.f23291c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f23291c, ((t) obj).f23291c) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23291c);
    }

    public final String toString() {
        return j2.h0.l(new StringBuilder("RelativeHorizontalTo(dx="), this.f23291c, ')');
    }
}
