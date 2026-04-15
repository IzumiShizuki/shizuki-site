package f3;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n implements g3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6670a;

    public n(float f10) {
        this.f6670a = f10;
    }

    @Override // g3.a
    public final float a(float f10) {
        return f10 / this.f6670a;
    }

    @Override // g3.a
    public final float b(float f10) {
        return f10 * this.f6670a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.f6670a, ((n) obj).f6670a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6670a);
    }

    public final String toString() {
        return h0.l(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f6670a, ')');
    }
}
