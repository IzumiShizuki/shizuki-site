package wf;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements uf.g, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uf.g f24131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f24133c;

    public i1(uf.g gVar) {
        jc.l.e(gVar, "original");
        this.f24131a = gVar;
        this.f24132b = gVar.m() + '?';
        this.f24133c = z0.b(gVar);
    }

    @Override // wf.l
    public final Set a() {
        return this.f24133c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i1) {
            return jc.l.a(this.f24131a, ((i1) obj).f24131a);
        }
        return false;
    }

    @Override // uf.g
    public final List getAnnotations() {
        return this.f24131a.getAnnotations();
    }

    public final int hashCode() {
        return this.f24131a.hashCode() * 31;
    }

    @Override // uf.g
    public final ud.n j() {
        return this.f24131a.j();
    }

    @Override // uf.g
    public final boolean l() {
        return this.f24131a.l();
    }

    @Override // uf.g
    public final String m() {
        return this.f24132b;
    }

    @Override // uf.g
    public final boolean n() {
        return true;
    }

    @Override // uf.g
    public final int o(String str) {
        jc.l.e(str, "name");
        return this.f24131a.o(str);
    }

    @Override // uf.g
    public final int p() {
        return this.f24131a.p();
    }

    @Override // uf.g
    public final String q(int i10) {
        return this.f24131a.q(i10);
    }

    @Override // uf.g
    public final List r(int i10) {
        return this.f24131a.r(i10);
    }

    @Override // uf.g
    public final uf.g s(int i10) {
        return this.f24131a.s(i10);
    }

    @Override // uf.g
    public final boolean t(int i10) {
        return this.f24131a.t(i10);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24131a);
        sb.append('?');
        return sb.toString();
    }
}
