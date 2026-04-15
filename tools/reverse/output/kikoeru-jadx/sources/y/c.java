package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f25096c = x0.v.v(p3.b.f16524e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f25097d = x0.v.v(Boolean.TRUE);

    public c(int i10, String str) {
        this.f25094a = i10;
        this.f25095b = str;
    }

    @Override // y.r1
    public final int a(f3.c cVar, f3.m mVar) {
        return e().f16525a;
    }

    @Override // y.r1
    public final int b(f3.c cVar) {
        return e().f16526b;
    }

    @Override // y.r1
    public final int c(f3.c cVar) {
        return e().f16528d;
    }

    @Override // y.r1
    public final int d(f3.c cVar, f3.m mVar) {
        return e().f16527c;
    }

    public final p3.b e() {
        return (p3.b) this.f25096c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f25094a == ((c) obj).f25094a;
        }
        return false;
    }

    public final void f(u3.w0 w0Var, int i10) {
        int i11 = this.f25094a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f25096c.setValue(w0Var.f21343a.g(i11));
            this.f25097d.setValue(Boolean.valueOf(w0Var.f21343a.q(i11)));
        }
    }

    public final int hashCode() {
        return this.f25094a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25095b);
        sb.append('(');
        sb.append(e().f16525a);
        sb.append(", ");
        sb.append(e().f16526b);
        sb.append(", ");
        sb.append(e().f16527c);
        sb.append(", ");
        return j2.h0.m(sb, e().f16528d, ')');
    }
}
