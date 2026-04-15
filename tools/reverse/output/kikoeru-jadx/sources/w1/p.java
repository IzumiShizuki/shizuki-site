package w1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23275f;

    public p(float f10, float f11, float f12, float f13) {
        super(2);
        this.f23272c = f10;
        this.f23273d = f11;
        this.f23274e = f12;
        this.f23275f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f23272c, pVar.f23272c) == 0 && Float.compare(this.f23273d, pVar.f23273d) == 0 && Float.compare(this.f23274e, pVar.f23274e) == 0 && Float.compare(this.f23275f, pVar.f23275f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23275f) + t0.x(this.f23274e, t0.x(this.f23273d, Float.floatToIntBits(this.f23272c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f23272c);
        sb.append(", y1=");
        sb.append(this.f23273d);
        sb.append(", x2=");
        sb.append(this.f23274e);
        sb.append(", y2=");
        return j2.h0.l(sb, this.f23275f, ')');
    }
}
