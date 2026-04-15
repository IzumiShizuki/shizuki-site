package sa;

import j2.h0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19741c;

    public s(Double d10, Double d11) {
        Double dValueOf = Double.valueOf(1.0d);
        float fFloatValue = d10.floatValue();
        float fFloatValue2 = d11.floatValue();
        float fFloatValue3 = dValueOf.floatValue();
        this.f19739a = fFloatValue;
        this.f19740b = fFloatValue2;
        this.f19741c = fFloatValue3;
    }

    public final float a() {
        float f10 = 1 - this.f19739a;
        float f11 = this.f19740b;
        return ((f10 - f11) * this.f19741c) / f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.valueOf(this.f19739a).equals(Float.valueOf(sVar.f19739a)) && Float.valueOf(this.f19740b).equals(Float.valueOf(sVar.f19740b)) && Float.valueOf(this.f19741c).equals(Float.valueOf(sVar.f19741c));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19741c) + t0.x(this.f19740b, Float.floatToIntBits(this.f19739a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("xyY(x=");
        sb.append(this.f19739a);
        sb.append(", y=");
        sb.append(this.f19740b);
        sb.append(", Y=");
        return h0.l(sb, this.f19741c, ')');
    }
}
