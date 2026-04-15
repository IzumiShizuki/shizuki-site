package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18474a;

    public l(float f10) {
        this.f18474a = f10;
    }

    @Override // r.p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f18474a;
        }
        return 0.0f;
    }

    @Override // r.p
    public final int b() {
        return 1;
    }

    @Override // r.p
    public final p c() {
        return new l(0.0f);
    }

    @Override // r.p
    public final void d() {
        this.f18474a = 0.0f;
    }

    @Override // r.p
    public final void e(float f10, int i10) {
        if (i10 == 0) {
            this.f18474a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && ((l) obj).f18474a == this.f18474a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f18474a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f18474a;
    }
}
