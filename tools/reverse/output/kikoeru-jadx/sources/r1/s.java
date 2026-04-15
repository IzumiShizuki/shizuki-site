package r1;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18727b;

    public s(float f10, float f11) {
        this.f18726a = f10;
        this.f18727b = f11;
    }

    public final float[] a() {
        float f10 = this.f18726a;
        float f11 = this.f18727b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f18726a, sVar.f18726a) == 0 && Float.compare(this.f18727b, sVar.f18727b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18727b) + (Float.floatToIntBits(this.f18726a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f18726a);
        sb.append(", y=");
        return h0.l(sb, this.f18727b, ')');
    }
}
