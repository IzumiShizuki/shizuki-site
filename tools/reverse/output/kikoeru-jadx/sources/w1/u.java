package w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23293d;

    public u(float f10, float f11) {
        super(3);
        this.f23292c = f10;
        this.f23293d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f23292c, uVar.f23292c) == 0 && Float.compare(this.f23293d, uVar.f23293d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23293d) + (Float.floatToIntBits(this.f23292c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f23292c);
        sb.append(", dy=");
        return j2.h0.l(sb, this.f23293d, ')');
    }
}
