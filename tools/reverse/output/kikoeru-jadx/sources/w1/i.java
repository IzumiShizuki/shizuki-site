package w1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f23232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f23234i;

    public i(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(3);
        this.f23228c = f10;
        this.f23229d = f11;
        this.f23230e = f12;
        this.f23231f = z10;
        this.f23232g = z11;
        this.f23233h = f13;
        this.f23234i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f23228c, iVar.f23228c) == 0 && Float.compare(this.f23229d, iVar.f23229d) == 0 && Float.compare(this.f23230e, iVar.f23230e) == 0 && this.f23231f == iVar.f23231f && this.f23232g == iVar.f23232g && Float.compare(this.f23233h, iVar.f23233h) == 0 && Float.compare(this.f23234i, iVar.f23234i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23234i) + t0.x(this.f23233h, (((t0.x(this.f23230e, t0.x(this.f23229d, Float.floatToIntBits(this.f23228c) * 31, 31), 31) + (this.f23231f ? 1231 : 1237)) * 31) + (this.f23232g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f23228c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f23229d);
        sb.append(", theta=");
        sb.append(this.f23230e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f23231f);
        sb.append(", isPositiveArc=");
        sb.append(this.f23232g);
        sb.append(", arcStartX=");
        sb.append(this.f23233h);
        sb.append(", arcStartY=");
        return j2.h0.l(sb, this.f23234i, ')');
    }
}
