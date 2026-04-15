package p1;

import nd.h;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f16491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f16492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f16493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f16494h;

    static {
        h.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f16487a = f10;
        this.f16488b = f11;
        this.f16489c = f12;
        this.f16490d = f13;
        this.f16491e = j10;
        this.f16492f = j11;
        this.f16493g = j12;
        this.f16494h = j13;
    }

    public final float a() {
        return this.f16490d - this.f16488b;
    }

    public final float b() {
        return this.f16489c - this.f16487a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f16487a, dVar.f16487a) == 0 && Float.compare(this.f16488b, dVar.f16488b) == 0 && Float.compare(this.f16489c, dVar.f16489c) == 0 && Float.compare(this.f16490d, dVar.f16490d) == 0 && n7.d.n(this.f16491e, dVar.f16491e) && n7.d.n(this.f16492f, dVar.f16492f) && n7.d.n(this.f16493g, dVar.f16493g) && n7.d.n(this.f16494h, dVar.f16494h);
    }

    public final int hashCode() {
        int iX = t0.x(this.f16490d, t0.x(this.f16489c, t0.x(this.f16488b, Float.floatToIntBits(this.f16487a) * 31, 31), 31), 31);
        long j10 = this.f16491e;
        long j11 = this.f16492f;
        int i10 = (((int) (j11 ^ (j11 >>> 32))) + ((((int) (j10 ^ (j10 >>> 32))) + iX) * 31)) * 31;
        long j12 = this.f16493g;
        int i11 = (((int) (j12 ^ (j12 >>> 32))) + i10) * 31;
        long j13 = this.f16494h;
        return ((int) (j13 ^ (j13 >>> 32))) + i11;
    }

    public final String toString() {
        String str = n7.e.I(this.f16487a) + ", " + n7.e.I(this.f16488b) + ", " + n7.e.I(this.f16489c) + ", " + n7.e.I(this.f16490d);
        long j10 = this.f16491e;
        long j11 = this.f16492f;
        boolean zN = n7.d.n(j10, j11);
        long j12 = this.f16493g;
        long j13 = this.f16494h;
        if (!zN || !n7.d.n(j11, j12) || !n7.d.n(j12, j13)) {
            StringBuilder sbK = a0.c.K("RoundRect(rect=", str, ", topLeft=");
            sbK.append((Object) n7.d.A(j10));
            sbK.append(", topRight=");
            sbK.append((Object) n7.d.A(j11));
            sbK.append(", bottomRight=");
            sbK.append((Object) n7.d.A(j12));
            sbK.append(", bottomLeft=");
            sbK.append((Object) n7.d.A(j13));
            sbK.append(')');
            return sbK.toString();
        }
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            StringBuilder sbK2 = a0.c.K("RoundRect(rect=", str, ", radius=");
            sbK2.append(n7.e.I(Float.intBitsToFloat(i10)));
            sbK2.append(')');
            return sbK2.toString();
        }
        StringBuilder sbK3 = a0.c.K("RoundRect(rect=", str, ", x=");
        sbK3.append(n7.e.I(Float.intBitsToFloat(i10)));
        sbK3.append(", y=");
        sbK3.append(n7.e.I(Float.intBitsToFloat(i11)));
        sbK3.append(')');
        return sbK3.toString();
    }
}
