package w1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23265d;

    public m(float f10, float f11) {
        super(3);
        this.f23264c = f10;
        this.f23265d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f23264c, mVar.f23264c) == 0 && Float.compare(this.f23265d, mVar.f23265d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23265d) + (Float.floatToIntBits(this.f23264c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f23264c);
        sb.append(", y=");
        return j2.h0.l(sb, this.f23265d, ')');
    }
}
