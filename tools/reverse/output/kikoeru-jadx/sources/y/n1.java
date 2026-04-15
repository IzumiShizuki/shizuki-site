package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f25197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f25198b;

    public n1(r1 r1Var, r1 r1Var2) {
        this.f25197a = r1Var;
        this.f25198b = r1Var2;
    }

    @Override // y.r1
    public final int a(f3.c cVar, f3.m mVar) {
        return Math.max(this.f25197a.a(cVar, mVar), this.f25198b.a(cVar, mVar));
    }

    @Override // y.r1
    public final int b(f3.c cVar) {
        return Math.max(this.f25197a.b(cVar), this.f25198b.b(cVar));
    }

    @Override // y.r1
    public final int c(f3.c cVar) {
        return Math.max(this.f25197a.c(cVar), this.f25198b.c(cVar));
    }

    @Override // y.r1
    public final int d(f3.c cVar, f3.m mVar) {
        return Math.max(this.f25197a.d(cVar, mVar), this.f25198b.d(cVar, mVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return jc.l.a(n1Var.f25197a, this.f25197a) && jc.l.a(n1Var.f25198b, this.f25198b);
    }

    public final int hashCode() {
        return (this.f25198b.hashCode() * 31) + this.f25197a.hashCode();
    }

    public final String toString() {
        return "(" + this.f25197a + " ∪ " + this.f25198b + ')';
    }
}
