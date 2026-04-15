package wf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 implements uf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf.g f24145a;

    public m0(uf.g gVar) {
        this.f24145a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return jc.l.a(this.f24145a, m0Var.f24145a) && jc.l.a(m(), m0Var.m());
    }

    @Override // uf.g
    public final List getAnnotations() {
        return vb.r.f22819a;
    }

    public final int hashCode() {
        return m().hashCode() + (this.f24145a.hashCode() * 31);
    }

    @Override // uf.g
    public final ud.n j() {
        return uf.k.f21706c;
    }

    @Override // uf.g
    public final boolean l() {
        return false;
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
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // uf.g
    public final int p() {
        return 1;
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
        StringBuilder sbO = j2.h0.o(i10, "Illegal index ", ", ");
        sbO.append(m());
        sbO.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbO.toString().toString());
    }

    @Override // uf.g
    public final uf.g s(int i10) {
        if (i10 >= 0) {
            return this.f24145a;
        }
        StringBuilder sbO = j2.h0.o(i10, "Illegal index ", ", ");
        sbO.append(m());
        sbO.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbO.toString().toString());
    }

    @Override // uf.g
    public final boolean t(int i10) {
        if (i10 >= 0) {
            return false;
        }
        StringBuilder sbO = j2.h0.o(i10, "Illegal index ", ", ");
        sbO.append(m());
        sbO.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbO.toString().toString());
    }

    public final String toString() {
        return m() + '(' + this.f24145a + ')';
    }
}
