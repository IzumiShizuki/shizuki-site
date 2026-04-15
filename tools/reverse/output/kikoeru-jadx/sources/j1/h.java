package j1;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9682b;

    public h(float f10, float f11) {
        this.f9681a = f10;
        this.f9682b = f11;
    }

    @Override // j1.d
    public final long a(long j10, long j11, f3.m mVar) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        f3.m mVar2 = f3.m.f6667a;
        float f12 = this.f9681a;
        if (mVar != mVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        float f14 = (f12 + f13) * f10;
        return (((long) Math.round((f13 + this.f9682b) * f11)) & 4294967295L) | (((long) Math.round(f14)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f9681a, hVar.f9681a) == 0 && Float.compare(this.f9682b, hVar.f9682b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9682b) + (Float.floatToIntBits(this.f9681a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f9681a);
        sb.append(", verticalBias=");
        return h0.l(sb, this.f9682b, ')');
    }
}
