package d2;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5447b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5446a == aVar.f5446a && Float.compare(this.f5447b, aVar.f5447b) == 0;
    }

    public final int hashCode() {
        long j10 = this.f5446a;
        return Float.floatToIntBits(this.f5447b) + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f5446a);
        sb.append(", dataPoint=");
        return h0.l(sb, this.f5447b, ')');
    }
}
