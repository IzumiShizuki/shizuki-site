package f3;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6653b;

    public d(float f10, float f11) {
        this.f6652a = f10;
        this.f6653b = f11;
    }

    @Override // f3.c
    public final long E(float f10) {
        return a0.c.w(J(f10), this);
    }

    @Override // f3.c
    public final float I(int i10) {
        return i10 / a();
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / a();
    }

    @Override // f3.c
    public final float M() {
        return this.f6653b;
    }

    @Override // f3.c
    public final float Q(float f10) {
        return a() * f10;
    }

    @Override // f3.c
    public final int U(long j10) {
        throw null;
    }

    @Override // f3.c
    public final float a() {
        return this.f6652a;
    }

    @Override // f3.c
    public final /* synthetic */ int a0(float f10) {
        return a0.c.q(f10, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f6652a, dVar.f6652a) == 0 && Float.compare(this.f6653b, dVar.f6653b) == 0;
    }

    @Override // f3.c
    public final /* synthetic */ long f0(long j10) {
        return a0.c.v(j10, this);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6653b) + (Float.floatToIntBits(this.f6652a) * 31);
    }

    @Override // f3.c
    public final /* synthetic */ float i0(long j10) {
        return a0.c.u(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ long n(long j10) {
        return a0.c.t(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ float r(long j10) {
        return a0.c.s(j10, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f6652a);
        sb.append(", fontScale=");
        return h0.l(sb, this.f6653b, ')');
    }
}
