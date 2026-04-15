package w1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23303f;

    public x(float f10, float f11, float f12, float f13) {
        super(2);
        this.f23300c = f10;
        this.f23301d = f11;
        this.f23302e = f12;
        this.f23303f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f23300c, xVar.f23300c) == 0 && Float.compare(this.f23301d, xVar.f23301d) == 0 && Float.compare(this.f23302e, xVar.f23302e) == 0 && Float.compare(this.f23303f, xVar.f23303f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23303f) + t0.x(this.f23302e, t0.x(this.f23301d, Float.floatToIntBits(this.f23300c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f23300c);
        sb.append(", dy1=");
        sb.append(this.f23301d);
        sb.append(", dx2=");
        sb.append(this.f23302e);
        sb.append(", dy2=");
        return j2.h0.l(sb, this.f23303f, ')');
    }
}
