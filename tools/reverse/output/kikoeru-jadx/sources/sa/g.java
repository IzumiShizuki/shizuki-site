package sa;

import q.t0;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y1 f19696f = new y1(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f19701e;

    public g(float f10, float f11, float f12, float f13, k kVar) {
        jc.l.e(kVar, "space");
        this.f19697a = f10;
        this.f19698b = f11;
        this.f19699c = f12;
        this.f19700d = f13;
        this.f19701e = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.valueOf(this.f19697a).equals(Float.valueOf(gVar.f19697a)) && Float.valueOf(this.f19698b).equals(Float.valueOf(gVar.f19698b)) && Float.valueOf(this.f19699c).equals(Float.valueOf(gVar.f19699c)) && Float.valueOf(this.f19700d).equals(Float.valueOf(gVar.f19700d)) && jc.l.a(this.f19701e, gVar.f19701e);
    }

    public final int hashCode() {
        return this.f19701e.hashCode() + t0.x(this.f19700d, t0.x(this.f19699c, t0.x(this.f19698b, Float.floatToIntBits(this.f19697a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "RGB(r=" + this.f19697a + ", g=" + this.f19698b + ", b=" + this.f19699c + ", alpha=" + this.f19700d + ", space=" + this.f19701e + ')';
    }
}
