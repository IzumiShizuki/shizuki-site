package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8810d;

    public o(float f10, float f11, float f12, float f13) {
        this.f8807a = f10;
        this.f8808b = f11;
        this.f8809c = f12;
        this.f8810d = f13;
        if (f10 < 0.0f) {
            f2.a.a("Left must be non-negative");
        }
        if (f11 < 0.0f) {
            f2.a.a("Top must be non-negative");
        }
        if (f12 < 0.0f) {
            f2.a.a("Right must be non-negative");
        }
        if (f13 >= 0.0f) {
            return;
        }
        f2.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return f3.f.a(this.f8807a, oVar.f8807a) && f3.f.a(this.f8808b, oVar.f8808b) && f3.f.a(this.f8809c, oVar.f8809c) && f3.f.a(this.f8810d, oVar.f8810d);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f8810d) + q.t0.x(this.f8809c, q.t0.x(this.f8808b, Float.floatToIntBits(this.f8807a) * 31, 31), 31)) * 31) + 1231;
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) f3.f.b(this.f8807a)) + ", top=" + ((Object) f3.f.b(this.f8808b)) + ", end=" + ((Object) f3.f.b(this.f8809c)) + ", bottom=" + ((Object) f3.f.b(this.f8810d)) + ", isLayoutDirectionAware=true)";
    }
}
