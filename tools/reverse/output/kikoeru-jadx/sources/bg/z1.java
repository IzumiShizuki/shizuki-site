package bg;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@sf.g
public final class z1 {
    public static final y1 Companion = new y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3005c;

    public z1(int i10, int i11, int i12, int i13) {
        if (7 != (i10 & 7)) {
            wf.z0.i(i10, 7, x1.f2993b);
            throw null;
        }
        this.f3003a = i11;
        this.f3004b = i12;
        this.f3005c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f3003a == z1Var.f3003a && this.f3004b == z1Var.f3004b && this.f3005c == z1Var.f3005c;
    }

    public final int hashCode() {
        return (((this.f3003a * 31) + this.f3004b) * 31) + this.f3005c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RateCountDetail(count=");
        sb.append(this.f3003a);
        sb.append(", ratio=");
        sb.append(this.f3004b);
        sb.append(", review_point=");
        return j2.h0.m(sb, this.f3005c, ')');
    }
}
