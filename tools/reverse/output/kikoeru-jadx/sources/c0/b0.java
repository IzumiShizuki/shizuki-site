package c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3048a;

    public b0(float f10) {
        this.f3048a = f10;
        if (Float.compare(f10, 0) > 0) {
            return;
        }
        x.a.a("invalid minSize");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return f3.f.a(this.f3048a, ((b0) obj).f3048a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3048a);
    }
}
