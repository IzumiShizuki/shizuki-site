package f3;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3.a f6656c;

    public e(float f10, float f11, g3.a aVar) {
        this.f6654a = f10;
        this.f6655b = f11;
        this.f6656c = aVar;
    }

    @Override // f3.c
    public final long E(float f10) {
        return lc.b.H(this.f6656c.a(J(f10)), 4294967296L);
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
        return this.f6655b;
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
        return this.f6654a;
    }

    @Override // f3.c
    public final /* synthetic */ int a0(float f10) {
        return a0.c.q(f10, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f6654a, eVar.f6654a) == 0 && Float.compare(this.f6655b, eVar.f6655b) == 0 && jc.l.a(this.f6656c, eVar.f6656c);
    }

    @Override // f3.c
    public final /* synthetic */ long f0(long j10) {
        return a0.c.v(j10, this);
    }

    public final int hashCode() {
        return this.f6656c.hashCode() + t0.x(this.f6655b, Float.floatToIntBits(this.f6654a) * 31, 31);
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
    public final float r(long j10) {
        if (p.a(o.b(j10), 4294967296L)) {
            return this.f6656c.b(o.c(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f6654a + ", fontScale=" + this.f6655b + ", converter=" + this.f6656c + ')';
    }
}
