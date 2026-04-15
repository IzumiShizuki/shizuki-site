package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13590d;

    public s1(float f10, float f11, float f12, float f13) {
        this.f13587a = f10;
        this.f13588b = f11;
        this.f13589c = f12;
        this.f13590d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (f3.f.a(this.f13587a, s1Var.f13587a) && f3.f.a(this.f13588b, s1Var.f13588b) && f3.f.a(this.f13589c, s1Var.f13589c)) {
            return f3.f.a(this.f13590d, s1Var.f13590d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13590d) + q.t0.x(this.f13589c, q.t0.x(this.f13588b, Float.floatToIntBits(this.f13587a) * 31, 31), 31);
    }
}
