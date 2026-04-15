package xf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p implements uf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ub.p f25015a;

    public p(ic.a aVar) {
        this.f25015a = ub.a.d(aVar);
    }

    public final uf.g a() {
        return (uf.g) this.f25015a.getValue();
    }

    @Override // uf.g
    public final List getAnnotations() {
        return vb.r.f22819a;
    }

    @Override // uf.g
    public final ud.n j() {
        return a().j();
    }

    @Override // uf.g
    public final boolean l() {
        return false;
    }

    @Override // uf.g
    public final String m() {
        return a().m();
    }

    @Override // uf.g
    public final boolean n() {
        return false;
    }

    @Override // uf.g
    public final int o(String str) {
        jc.l.e(str, "name");
        return a().o(str);
    }

    @Override // uf.g
    public final int p() {
        return a().p();
    }

    @Override // uf.g
    public final String q(int i10) {
        return a().q(i10);
    }

    @Override // uf.g
    public final List r(int i10) {
        return a().r(i10);
    }

    @Override // uf.g
    public final uf.g s(int i10) {
        return a().s(i10);
    }

    @Override // uf.g
    public final boolean t(int i10) {
        return a().t(i10);
    }
}
