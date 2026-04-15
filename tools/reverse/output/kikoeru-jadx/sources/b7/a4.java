package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4.i0 f1628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1630c;

    public a4(m4.i0 i0Var, long j10, long j11) {
        this.f1628a = i0Var;
        this.f1629b = j10;
        this.f1630c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return this.f1629b == a4Var.f1629b && this.f1628a.equals(a4Var.f1628a) && this.f1630c == a4Var.f1630c;
    }

    public final int hashCode() {
        long j10 = this.f1629b;
        int iHashCode = (this.f1628a.hashCode() + ((217 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31;
        long j11 = this.f1630c;
        return iHashCode + ((int) (j11 ^ (j11 >>> 32)));
    }
}
