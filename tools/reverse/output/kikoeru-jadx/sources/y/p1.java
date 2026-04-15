package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f25212b;

    public p1(u0 u0Var, String str) {
        this.f25211a = str;
        this.f25212b = x0.v.v(u0Var);
    }

    @Override // y.r1
    public final int a(f3.c cVar, f3.m mVar) {
        return e().f25263a;
    }

    @Override // y.r1
    public final int b(f3.c cVar) {
        return e().f25264b;
    }

    @Override // y.r1
    public final int c(f3.c cVar) {
        return e().f25266d;
    }

    @Override // y.r1
    public final int d(f3.c cVar, f3.m mVar) {
        return e().f25265c;
    }

    public final u0 e() {
        return (u0) this.f25212b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            return jc.l.a(e(), ((p1) obj).e());
        }
        return false;
    }

    public final void f(u0 u0Var) {
        this.f25212b.setValue(u0Var);
    }

    public final int hashCode() {
        return this.f25211a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25211a);
        sb.append("(left=");
        sb.append(e().f25263a);
        sb.append(", top=");
        sb.append(e().f25264b);
        sb.append(", right=");
        sb.append(e().f25265c);
        sb.append(", bottom=");
        return j2.h0.m(sb, e().f25266d, ')');
    }
}
