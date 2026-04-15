package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18505d;

    public o(float f10, float f11, float f12, float f13) {
        this.f18502a = f10;
        this.f18503b = f11;
        this.f18504c = f12;
        this.f18505d = f13;
    }

    @Override // r.p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f18502a;
        }
        if (i10 == 1) {
            return this.f18503b;
        }
        if (i10 == 2) {
            return this.f18504c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f18505d;
    }

    @Override // r.p
    public final int b() {
        return 4;
    }

    @Override // r.p
    public final p c() {
        return new o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // r.p
    public final void d() {
        this.f18502a = 0.0f;
        this.f18503b = 0.0f;
        this.f18504c = 0.0f;
        this.f18505d = 0.0f;
    }

    @Override // r.p
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f18502a = f10;
            return;
        }
        if (i10 == 1) {
            this.f18503b = f10;
        } else if (i10 == 2) {
            this.f18504c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f18505d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f18502a == this.f18502a && oVar.f18503b == this.f18503b && oVar.f18504c == this.f18504c && oVar.f18505d == this.f18505d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18505d) + q.t0.x(this.f18504c, q.t0.x(this.f18503b, Float.floatToIntBits(this.f18502a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f18502a + ", v2 = " + this.f18503b + ", v3 = " + this.f18504c + ", v4 = " + this.f18505d;
    }
}
