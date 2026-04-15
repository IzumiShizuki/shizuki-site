package e3;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f6088c = new p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6090b;

    public p(float f10, float f11) {
        this.f6089a = f10;
        this.f6090b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f6089a == pVar.f6089a && this.f6090b == pVar.f6090b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6090b) + (Float.floatToIntBits(this.f6089a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.f6089a);
        sb.append(", skewX=");
        return h0.l(sb, this.f6090b, ')');
    }
}
