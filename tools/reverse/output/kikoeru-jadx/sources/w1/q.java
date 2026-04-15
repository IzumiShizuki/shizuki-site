package w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23277d;

    public q(float f10, float f11) {
        super(1);
        this.f23276c = f10;
        this.f23277d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f23276c, qVar.f23276c) == 0 && Float.compare(this.f23277d, qVar.f23277d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23277d) + (Float.floatToIntBits(this.f23276c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f23276c);
        sb.append(", y=");
        return j2.h0.l(sb, this.f23277d, ')');
    }
}
