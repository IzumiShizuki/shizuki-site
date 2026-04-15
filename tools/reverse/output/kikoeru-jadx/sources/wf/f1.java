package wf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements uf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uf.f f24117b;

    public f1(String str, uf.f fVar) {
        jc.l.e(fVar, "kind");
        this.f24116a = str;
        this.f24117b = fVar;
    }

    public final void a() {
        throw new IllegalStateException(j2.h0.n(new StringBuilder("Primitive descriptor "), this.f24116a, " does not have elements"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return jc.l.a(this.f24116a, f1Var.f24116a) && jc.l.a(this.f24117b, f1Var.f24117b);
    }

    @Override // uf.g
    public final List getAnnotations() {
        return vb.r.f22819a;
    }

    public final int hashCode() {
        return (this.f24117b.hashCode() * 31) + this.f24116a.hashCode();
    }

    @Override // uf.g
    public final ud.n j() {
        return this.f24117b;
    }

    @Override // uf.g
    public final boolean l() {
        return false;
    }

    @Override // uf.g
    public final String m() {
        return this.f24116a;
    }

    @Override // uf.g
    public final boolean n() {
        return false;
    }

    @Override // uf.g
    public final int o(String str) {
        jc.l.e(str, "name");
        a();
        throw null;
    }

    @Override // uf.g
    public final int p() {
        return 0;
    }

    @Override // uf.g
    public final String q(int i10) {
        a();
        throw null;
    }

    @Override // uf.g
    public final List r(int i10) {
        a();
        throw null;
    }

    @Override // uf.g
    public final uf.g s(int i10) {
        a();
        throw null;
    }

    @Override // uf.g
    public final boolean t(int i10) {
        a();
        throw null;
    }

    public final String toString() {
        return q.t0.E(new StringBuilder("PrimitiveDescriptor("), this.f24116a, ')');
    }
}
