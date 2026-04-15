package w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23305d;

    public y(float f10, float f11) {
        super(1);
        this.f23304c = f10;
        this.f23305d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f23304c, yVar.f23304c) == 0 && Float.compare(this.f23305d, yVar.f23305d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23305d) + (Float.floatToIntBits(this.f23304c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f23304c);
        sb.append(", dy=");
        return j2.h0.l(sb, this.f23305d, ')');
    }
}
