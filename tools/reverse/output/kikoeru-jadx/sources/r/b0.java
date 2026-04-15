package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f18327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18328b;

    public b0(u uVar, long j10) {
        this.f18327a = uVar;
        this.f18328b = j10;
    }

    @Override // r.j
    public final x1 a(v1 v1Var) {
        a2 a2VarA = this.f18327a.a(v1Var);
        c2 c2Var = new c2();
        c2Var.f18358c = a2VarA;
        c2Var.f18356a = ((long) (a2VarA.I() + a2VarA.D())) * 1000000;
        c2Var.f18357b = this.f18328b * 1000000;
        return c2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return b0Var.f18327a.equals(this.f18327a) && b0Var.f18328b == this.f18328b;
    }

    public final int hashCode() {
        int iHashCode = (o0.f18506a.hashCode() + (this.f18327a.hashCode() * 31)) * 31;
        long j10 = this.f18328b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }
}
