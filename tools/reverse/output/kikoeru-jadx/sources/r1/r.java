package r1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f18719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f18720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f18721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f18722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f18723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f18724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f18725g;

    public /* synthetic */ r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f18719a, rVar.f18719a) == 0 && Double.compare(this.f18720b, rVar.f18720b) == 0 && Double.compare(this.f18721c, rVar.f18721c) == 0 && Double.compare(this.f18722d, rVar.f18722d) == 0 && Double.compare(this.f18723e, rVar.f18723e) == 0 && Double.compare(this.f18724f, rVar.f18724f) == 0 && Double.compare(this.f18725g, rVar.f18725g) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f18719a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f18720b);
        int i10 = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f18721c);
        int i11 = (i10 + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f18722d);
        int i12 = (i11 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f18723e);
        int i13 = (i12 + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 31;
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f18724f);
        int i14 = (i13 + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 31;
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f18725g);
        return i14 + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f18719a + ", a=" + this.f18720b + ", b=" + this.f18721c + ", c=" + this.f18722d + ", d=" + this.f18723e + ", e=" + this.f18724f + ", f=" + this.f18725g + ')';
    }

    public r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f18719a = d10;
        this.f18720b = d11;
        this.f18721c = d12;
        this.f18722d = d13;
        this.f18723e = d14;
        this.f18724f = d15;
        this.f18725g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
