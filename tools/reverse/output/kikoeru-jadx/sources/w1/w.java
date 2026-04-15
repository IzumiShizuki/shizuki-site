package w1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23299f;

    public w(float f10, float f11, float f12, float f13) {
        super(1);
        this.f23296c = f10;
        this.f23297d = f11;
        this.f23298e = f12;
        this.f23299f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f23296c, wVar.f23296c) == 0 && Float.compare(this.f23297d, wVar.f23297d) == 0 && Float.compare(this.f23298e, wVar.f23298e) == 0 && Float.compare(this.f23299f, wVar.f23299f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23299f) + t0.x(this.f23298e, t0.x(this.f23297d, Float.floatToIntBits(this.f23296c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f23296c);
        sb.append(", dy1=");
        sb.append(this.f23297d);
        sb.append(", dx2=");
        sb.append(this.f23298e);
        sb.append(", dy2=");
        return j2.h0.l(sb, this.f23299f, ')');
    }
}
