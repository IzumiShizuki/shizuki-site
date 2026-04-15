package w1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f23287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f23288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f23289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23290h;

    public s(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f23285c = f10;
        this.f23286d = f11;
        this.f23287e = f12;
        this.f23288f = f13;
        this.f23289g = f14;
        this.f23290h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f23285c, sVar.f23285c) == 0 && Float.compare(this.f23286d, sVar.f23286d) == 0 && Float.compare(this.f23287e, sVar.f23287e) == 0 && Float.compare(this.f23288f, sVar.f23288f) == 0 && Float.compare(this.f23289g, sVar.f23289g) == 0 && Float.compare(this.f23290h, sVar.f23290h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23290h) + t0.x(this.f23289g, t0.x(this.f23288f, t0.x(this.f23287e, t0.x(this.f23286d, Float.floatToIntBits(this.f23285c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f23285c);
        sb.append(", dy1=");
        sb.append(this.f23286d);
        sb.append(", dx2=");
        sb.append(this.f23287e);
        sb.append(", dy2=");
        sb.append(this.f23288f);
        sb.append(", dx3=");
        sb.append(this.f23289g);
        sb.append(", dy3=");
        return j2.h0.l(sb, this.f23290h, ')');
    }
}
