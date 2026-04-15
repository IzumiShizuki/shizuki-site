package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3.j f11596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11598c;

    public q(e3.j jVar, int i10, long j10) {
        this.f11596a = jVar;
        this.f11597b = i10;
        this.f11598c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f11596a == qVar.f11596a && this.f11597b == qVar.f11597b && this.f11598c == qVar.f11598c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f11596a.hashCode() * 31) + this.f11597b) * 31;
        long j10 = this.f11598c;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f11596a + ", offset=" + this.f11597b + ", selectableId=" + this.f11598c + ')';
    }
}
