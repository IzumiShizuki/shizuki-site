package wf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements uf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uf.g f24104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uf.g f24105c;

    public d0(String str, uf.g gVar, uf.g gVar2) {
        this.f24103a = str;
        this.f24104b = gVar;
        this.f24105c = gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return jc.l.a(this.f24103a, d0Var.f24103a) && jc.l.a(this.f24104b, d0Var.f24104b) && jc.l.a(this.f24105c, d0Var.f24105c);
    }

    @Override // uf.g
    public final List getAnnotations() {
        return vb.r.f22819a;
    }

    public final int hashCode() {
        return this.f24105c.hashCode() + ((this.f24104b.hashCode() + (this.f24103a.hashCode() * 31)) * 31);
    }

    @Override // uf.g
    public final ud.n j() {
        return uf.k.f21707d;
    }

    @Override // uf.g
    public final boolean l() {
        return false;
    }

    @Override // uf.g
    public final String m() {
        return this.f24103a;
    }

    @Override // uf.g
    public final boolean n() {
        return false;
    }

    @Override // uf.g
    public final int o(String str) {
        jc.l.e(str, "name");
        Integer numL0 = ef.u.l0(str);
        if (numL0 != null) {
            return numL0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // uf.g
    public final int p() {
        return 2;
    }

    @Override // uf.g
    public final String q(int i10) {
        return String.valueOf(i10);
    }

    @Override // uf.g
    public final List r(int i10) {
        if (i10 >= 0) {
            return vb.r.f22819a;
        }
        throw new IllegalArgumentException(j2.h0.n(j2.h0.o(i10, "Illegal index ", ", "), this.f24103a, " expects only non-negative indices").toString());
    }

    @Override // uf.g
    public final uf.g s(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(j2.h0.n(j2.h0.o(i10, "Illegal index ", ", "), this.f24103a, " expects only non-negative indices").toString());
        }
        int i11 = i10 % 2;
        if (i11 == 0) {
            return this.f24104b;
        }
        if (i11 == 1) {
            return this.f24105c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // uf.g
    public final boolean t(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(j2.h0.n(j2.h0.o(i10, "Illegal index ", ", "), this.f24103a, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.f24103a + '(' + this.f24104b + ", " + this.f24105c + ')';
    }
}
