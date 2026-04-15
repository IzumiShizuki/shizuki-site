package b7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends m4.i1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b4 f1659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f1660h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ya.i0 f1661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a4 f1662f;

    static {
        ya.g0 g0Var = ya.i0.f25998b;
        f1659g = new b4(ya.a1.f25946e, null);
        f1660h = new Object();
    }

    public b4(ya.i0 i0Var, a4 a4Var) {
        this.f1661e = i0Var;
        this.f1662f = a4Var;
    }

    @Override // m4.i1
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // m4.i1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return ud.n.f(this.f1661e, b4Var.f1661e) && ud.n.f(this.f1662f, b4Var.f1662f);
    }

    @Override // m4.i1
    public final m4.f1 f(int i10, m4.f1 f1Var, boolean z10) {
        a4 a4VarR = r(i10);
        Long lValueOf = Long.valueOf(a4VarR.f1629b);
        long jN = p4.c0.N(a4VarR.f1630c);
        f1Var.getClass();
        f1Var.i(lValueOf, null, i10, jN, 0L, m4.b.f14121f, false);
        return f1Var;
    }

    @Override // m4.i1
    public final int h() {
        return o();
    }

    @Override // m4.i1
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1661e, this.f1662f});
    }

    @Override // m4.i1
    public final Object l(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // m4.i1
    public final m4.h1 m(int i10, m4.h1 h1Var, long j10) {
        a4 a4VarR = r(i10);
        h1Var.b(f1660h, a4VarR.f1628a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, p4.c0.N(a4VarR.f1630c), i10, i10, 0L);
        return h1Var;
    }

    @Override // m4.i1
    public final int o() {
        return this.f1661e.size() + (this.f1662f == null ? 0 : 1);
    }

    public final long q(int i10) {
        if (i10 < 0) {
            return -1L;
        }
        ya.i0 i0Var = this.f1661e;
        if (i10 < i0Var.size()) {
            return ((a4) i0Var.get(i10)).f1629b;
        }
        return -1L;
    }

    public final a4 r(int i10) {
        a4 a4Var;
        ya.i0 i0Var = this.f1661e;
        return (i10 != i0Var.size() || (a4Var = this.f1662f) == null) ? (a4) i0Var.get(i10) : a4Var;
    }
}
