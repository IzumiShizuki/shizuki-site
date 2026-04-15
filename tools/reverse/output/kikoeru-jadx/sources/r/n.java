package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18499c;

    public n(float f10, float f11, float f12) {
        this.f18497a = f10;
        this.f18498b = f11;
        this.f18499c = f12;
    }

    @Override // r.p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f18497a;
        }
        if (i10 == 1) {
            return this.f18498b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f18499c;
    }

    @Override // r.p
    public final int b() {
        return 3;
    }

    @Override // r.p
    public final p c() {
        return new n(0.0f, 0.0f, 0.0f);
    }

    @Override // r.p
    public final void d() {
        this.f18497a = 0.0f;
        this.f18498b = 0.0f;
        this.f18499c = 0.0f;
    }

    @Override // r.p
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f18497a = f10;
        } else if (i10 == 1) {
            this.f18498b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f18499c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f18497a == this.f18497a && nVar.f18498b == this.f18498b && nVar.f18499c == this.f18499c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18499c) + q.t0.x(this.f18498b, Float.floatToIntBits(this.f18497a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f18497a + ", v2 = " + this.f18498b + ", v3 = " + this.f18499c;
    }
}
