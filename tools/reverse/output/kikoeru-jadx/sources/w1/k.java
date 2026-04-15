package w1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f23261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23262h;

    public k(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f23257c = f10;
        this.f23258d = f11;
        this.f23259e = f12;
        this.f23260f = f13;
        this.f23261g = f14;
        this.f23262h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f23257c, kVar.f23257c) == 0 && Float.compare(this.f23258d, kVar.f23258d) == 0 && Float.compare(this.f23259e, kVar.f23259e) == 0 && Float.compare(this.f23260f, kVar.f23260f) == 0 && Float.compare(this.f23261g, kVar.f23261g) == 0 && Float.compare(this.f23262h, kVar.f23262h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23262h) + t0.x(this.f23261g, t0.x(this.f23260f, t0.x(this.f23259e, t0.x(this.f23258d, Float.floatToIntBits(this.f23257c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f23257c);
        sb.append(", y1=");
        sb.append(this.f23258d);
        sb.append(", x2=");
        sb.append(this.f23259e);
        sb.append(", y2=");
        sb.append(this.f23260f);
        sb.append(", x3=");
        sb.append(this.f23261g);
        sb.append(", y3=");
        return j2.h0.l(sb, this.f23262h, ')');
    }
}
