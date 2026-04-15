package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13138c;

    public j5(float f10, float f11, float f12) {
        this.f13136a = f10;
        this.f13137b = f11;
        this.f13138c = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return this.f13136a == j5Var.f13136a && this.f13137b == j5Var.f13137b && this.f13138c == j5Var.f13138c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13138c) + q.t0.x(this.f13137b, Float.floatToIntBits(this.f13136a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResistanceConfig(basis=");
        sb.append(this.f13136a);
        sb.append(", factorAtMin=");
        sb.append(this.f13137b);
        sb.append(", factorAtMax=");
        return j2.h0.l(sb, this.f13138c, ')');
    }
}
