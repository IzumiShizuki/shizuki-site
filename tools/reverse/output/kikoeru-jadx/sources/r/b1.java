package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f18329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18330b;

    public b1(x1 x1Var, long j10) {
        this.f18329a = x1Var;
        this.f18330b = j10;
    }

    @Override // r.x1
    public final p H(long j10, p pVar, p pVar2, p pVar3) {
        long j11 = this.f18330b;
        return j10 < j11 ? pVar3 : this.f18329a.H(j10 - j11, pVar, pVar2, pVar3);
    }

    @Override // r.x1
    public final boolean a() {
        return this.f18329a.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return b1Var.f18330b == this.f18330b && jc.l.a(b1Var.f18329a, this.f18329a);
    }

    @Override // r.x1
    public final p g(long j10, p pVar, p pVar2, p pVar3) {
        long j11 = this.f18330b;
        return j10 < j11 ? pVar : this.f18329a.g(j10 - j11, pVar, pVar2, pVar3);
    }

    public final int hashCode() {
        int iHashCode = this.f18329a.hashCode() * 31;
        long j10 = this.f18330b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // r.x1
    public final long n(p pVar, p pVar2, p pVar3) {
        return this.f18329a.n(pVar, pVar2, pVar3) + this.f18330b;
    }

    @Override // r.x1
    public final p t(p pVar, p pVar2, p pVar3) {
        return H(n(pVar, pVar2, pVar3), pVar, pVar2, pVar3);
    }
}
