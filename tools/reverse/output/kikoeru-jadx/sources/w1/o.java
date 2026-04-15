package w1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23271f;

    public o(float f10, float f11, float f12, float f13) {
        super(1);
        this.f23268c = f10;
        this.f23269d = f11;
        this.f23270e = f12;
        this.f23271f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f23268c, oVar.f23268c) == 0 && Float.compare(this.f23269d, oVar.f23269d) == 0 && Float.compare(this.f23270e, oVar.f23270e) == 0 && Float.compare(this.f23271f, oVar.f23271f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23271f) + t0.x(this.f23270e, t0.x(this.f23269d, Float.floatToIntBits(this.f23268c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f23268c);
        sb.append(", y1=");
        sb.append(this.f23269d);
        sb.append(", x2=");
        sb.append(this.f23270e);
        sb.append(", y2=");
        return j2.h0.l(sb, this.f23271f, ')');
    }
}
