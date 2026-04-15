package j1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9678a;

    public e(float f10) {
        this.f9678a = f10;
    }

    @Override // j1.d
    public final long a(long j10, long j11, f3.m mVar) {
        long j12 = (((long) (((int) (j11 >> 32)) - ((int) (j10 >> 32)))) << 32) | (((long) (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L)))) & 4294967295L);
        float f10 = 1;
        float f11 = (this.f9678a + f10) * (((int) (j12 >> 32)) / 2.0f);
        return (((long) Math.round((f10 - 1.0f) * (((int) (j12 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f11)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f9678a, ((e) obj).f9678a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(this.f9678a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f9678a + ", verticalBias=-1.0)";
    }
}
