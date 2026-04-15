package w1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f23284i;

    public r(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(3);
        this.f23278c = f10;
        this.f23279d = f11;
        this.f23280e = f12;
        this.f23281f = z10;
        this.f23282g = z11;
        this.f23283h = f13;
        this.f23284i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f23278c, rVar.f23278c) == 0 && Float.compare(this.f23279d, rVar.f23279d) == 0 && Float.compare(this.f23280e, rVar.f23280e) == 0 && this.f23281f == rVar.f23281f && this.f23282g == rVar.f23282g && Float.compare(this.f23283h, rVar.f23283h) == 0 && Float.compare(this.f23284i, rVar.f23284i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23284i) + t0.x(this.f23283h, (((t0.x(this.f23280e, t0.x(this.f23279d, Float.floatToIntBits(this.f23278c) * 31, 31), 31) + (this.f23281f ? 1231 : 1237)) * 31) + (this.f23282g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f23278c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f23279d);
        sb.append(", theta=");
        sb.append(this.f23280e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f23281f);
        sb.append(", isPositiveArc=");
        sb.append(this.f23282g);
        sb.append(", arcStartDx=");
        sb.append(this.f23283h);
        sb.append(", arcStartDy=");
        return j2.h0.l(sb, this.f23284i, ')');
    }
}
