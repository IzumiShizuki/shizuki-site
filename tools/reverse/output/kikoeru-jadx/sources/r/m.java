package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18479b;

    public m(float f10, float f11) {
        this.f18478a = f10;
        this.f18479b = f11;
    }

    @Override // r.p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f18478a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f18479b;
    }

    @Override // r.p
    public final int b() {
        return 2;
    }

    @Override // r.p
    public final p c() {
        return new m(0.0f, 0.0f);
    }

    @Override // r.p
    public final void d() {
        this.f18478a = 0.0f;
        this.f18479b = 0.0f;
    }

    @Override // r.p
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f18478a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f18479b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f18478a == this.f18478a && mVar.f18479b == this.f18479b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18479b) + (Float.floatToIntBits(this.f18478a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f18478a + ", v2 = " + this.f18479b;
    }
}
