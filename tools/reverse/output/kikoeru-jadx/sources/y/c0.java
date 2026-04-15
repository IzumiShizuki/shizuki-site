package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f25098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f25099b;

    public c0(r1 r1Var, r1 r1Var2) {
        this.f25098a = r1Var;
        this.f25099b = r1Var2;
    }

    @Override // y.r1
    public final int a(f3.c cVar, f3.m mVar) {
        int iA = this.f25098a.a(cVar, mVar) - this.f25099b.a(cVar, mVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // y.r1
    public final int b(f3.c cVar) {
        int iB = this.f25098a.b(cVar) - this.f25099b.b(cVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // y.r1
    public final int c(f3.c cVar) {
        int iC = this.f25098a.c(cVar) - this.f25099b.c(cVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // y.r1
    public final int d(f3.c cVar, f3.m mVar) {
        int iD = this.f25098a.d(cVar, mVar) - this.f25099b.d(cVar, mVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return jc.l.a(c0Var.f25098a, this.f25098a) && jc.l.a(c0Var.f25099b, this.f25099b);
    }

    public final int hashCode() {
        return this.f25099b.hashCode() + (this.f25098a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f25098a + " - " + this.f25099b + ')';
    }
}
