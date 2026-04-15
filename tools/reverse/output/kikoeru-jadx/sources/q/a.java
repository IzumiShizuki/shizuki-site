package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17229b;

    public a(float f10, float f11) {
        this.f17228a = f10;
        this.f17229b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f17228a, aVar.f17228a) == 0 && Float.compare(this.f17229b, aVar.f17229b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17229b) + (Float.floatToIntBits(this.f17228a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f17228a);
        sb.append(", velocityCoefficient=");
        return j2.h0.l(sb, this.f17229b, ')');
    }
}
