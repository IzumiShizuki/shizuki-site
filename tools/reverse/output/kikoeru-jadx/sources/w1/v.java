package w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23295d;

    public v(float f10, float f11) {
        super(3);
        this.f23294c = f10;
        this.f23295d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f23294c, vVar.f23294c) == 0 && Float.compare(this.f23295d, vVar.f23295d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23295d) + (Float.floatToIntBits(this.f23294c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f23294c);
        sb.append(", dy=");
        return j2.h0.l(sb, this.f23295d, ')');
    }
}
