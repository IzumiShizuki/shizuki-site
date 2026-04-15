package w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23267d;

    public n(float f10, float f11) {
        super(3);
        this.f23266c = f10;
        this.f23267d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f23266c, nVar.f23266c) == 0 && Float.compare(this.f23267d, nVar.f23267d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23267d) + (Float.floatToIntBits(this.f23266c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f23266c);
        sb.append(", y=");
        return j2.h0.l(sb, this.f23267d, ')');
    }
}
