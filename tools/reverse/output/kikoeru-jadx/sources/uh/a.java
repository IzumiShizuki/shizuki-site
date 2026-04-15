package uh;

import j2.h0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21947d;

    public a(float f10, float f11, float f12, float f13) {
        this.f21944a = f10;
        this.f21945b = f11;
        this.f21946c = f12;
        this.f21947d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f21944a, aVar.f21944a) == 0 && Float.compare(this.f21945b, aVar.f21945b) == 0 && Float.compare(this.f21946c, aVar.f21946c) == 0 && Float.compare(this.f21947d, aVar.f21947d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21947d) + t0.x(this.f21946c, t0.x(this.f21945b, Float.floatToIntBits(this.f21944a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbsolutePixelPadding(start=");
        sb.append(this.f21944a);
        sb.append(", end=");
        sb.append(this.f21945b);
        sb.append(", top=");
        sb.append(this.f21946c);
        sb.append(", bottom=");
        return h0.l(sb, this.f21947d, ')');
    }
}
