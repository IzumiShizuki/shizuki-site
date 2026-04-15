package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3.c f25257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25258b;

    public t(g2.r1 r1Var, long j10) {
        this.f25257a = r1Var;
        this.f25258b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return jc.l.a(this.f25257a, tVar.f25257a) && f3.a.b(this.f25258b, tVar.f25258b);
    }

    public final int hashCode() {
        int iHashCode = this.f25257a.hashCode() * 31;
        long j10 = this.f25258b;
        return ((int) (j10 ^ (j10 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f25257a + ", constraints=" + ((Object) f3.a.l(this.f25258b)) + ')';
    }
}
