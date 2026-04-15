package sa;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f19734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f19735e;

    static {
        q qVar = r.f19737a;
    }

    public p(float f10, float f11, float f12, float f13, q qVar) {
        this.f19731a = f10;
        this.f19732b = f11;
        this.f19733c = f12;
        this.f19734d = f13;
        this.f19735e = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.valueOf(this.f19731a).equals(Float.valueOf(pVar.f19731a)) && Float.valueOf(this.f19732b).equals(Float.valueOf(pVar.f19732b)) && Float.valueOf(this.f19733c).equals(Float.valueOf(pVar.f19733c)) && Float.valueOf(this.f19734d).equals(Float.valueOf(pVar.f19734d)) && this.f19735e.equals(pVar.f19735e);
    }

    public final int hashCode() {
        return this.f19735e.f19736a.hashCode() + t0.x(this.f19734d, t0.x(this.f19733c, t0.x(this.f19732b, Float.floatToIntBits(this.f19731a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "XYZ(x=" + this.f19731a + ", y=" + this.f19732b + ", z=" + this.f19733c + ", alpha=" + this.f19734d + ", space=" + this.f19735e + ')';
    }
}
