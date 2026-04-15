package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18324b;

    public a1(x xVar, long j10) {
        this.f18323a = xVar;
        this.f18324b = j10;
    }

    @Override // r.j
    public final x1 a(v1 v1Var) {
        return new b1(this.f18323a.a(v1Var), this.f18324b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return a1Var.f18324b == this.f18324b && jc.l.a(a1Var.f18323a, this.f18323a);
    }

    public final int hashCode() {
        int iHashCode = this.f18323a.hashCode() * 31;
        long j10 = this.f18324b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }
}
