package p1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f16482e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16486d;

    public c(float f10, float f11, float f12, float f13) {
        this.f16483a = f10;
        this.f16484b = f11;
        this.f16485c = f12;
        this.f16486d = f13;
    }

    public static c a(c cVar, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f10 = cVar.f16483a;
        }
        float f13 = (i10 & 2) != 0 ? cVar.f16484b : Float.NEGATIVE_INFINITY;
        if ((i10 & 4) != 0) {
            f11 = cVar.f16485c;
        }
        if ((i10 & 8) != 0) {
            f12 = cVar.f16486d;
        }
        return new c(f10, f13, f11, f12);
    }

    public final long b() {
        float f10 = this.f16485c;
        float f11 = this.f16483a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f16486d;
        float f14 = this.f16484b;
        return (((long) Float.floatToRawIntBits(((f13 - f14) / 2.0f) + f14)) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
    }

    public final long c() {
        float f10 = this.f16485c - this.f16483a;
        return (((long) Float.floatToRawIntBits(this.f16486d - this.f16484b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.f16483a)) << 32) | (((long) Float.floatToRawIntBits(this.f16484b)) & 4294967295L);
    }

    public final c e(c cVar) {
        return new c(Math.max(this.f16483a, cVar.f16483a), Math.max(this.f16484b, cVar.f16484b), Math.min(this.f16485c, cVar.f16485c), Math.min(this.f16486d, cVar.f16486d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f16483a, cVar.f16483a) == 0 && Float.compare(this.f16484b, cVar.f16484b) == 0 && Float.compare(this.f16485c, cVar.f16485c) == 0 && Float.compare(this.f16486d, cVar.f16486d) == 0;
    }

    public final boolean f() {
        return (this.f16483a >= this.f16485c) | (this.f16484b >= this.f16486d);
    }

    public final boolean g(c cVar) {
        return (this.f16483a < cVar.f16485c) & (cVar.f16483a < this.f16485c) & (this.f16484b < cVar.f16486d) & (cVar.f16484b < this.f16486d);
    }

    public final c h(float f10, float f11) {
        return new c(this.f16483a + f10, this.f16484b + f11, this.f16485c + f10, this.f16486d + f11);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16486d) + t0.x(this.f16485c, t0.x(this.f16484b, Float.floatToIntBits(this.f16483a) * 31, 31), 31);
    }

    public final c i(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new c(Float.intBitsToFloat(i10) + this.f16483a, Float.intBitsToFloat(i11) + this.f16484b, Float.intBitsToFloat(i10) + this.f16485c, Float.intBitsToFloat(i11) + this.f16486d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + n7.e.I(this.f16483a) + ", " + n7.e.I(this.f16484b) + ", " + n7.e.I(this.f16485c) + ", " + n7.e.I(this.f16486d) + ')';
    }
}
