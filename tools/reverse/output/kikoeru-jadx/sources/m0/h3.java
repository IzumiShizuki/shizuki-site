package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13056a;

    public h3(float f10) {
        this.f13056a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3) && f3.f.a(this.f13056a, ((h3) obj).f13056a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f13056a);
    }

    public final String toString() {
        return "FixedThreshold(offset=" + ((Object) f3.f.b(this.f13056a)) + ')';
    }
}
