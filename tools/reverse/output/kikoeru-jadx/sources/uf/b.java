package uf;

import java.util.List;
import ud.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f21677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc.c f21678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21679c;

    public b(h hVar, pc.c cVar) {
        jc.l.e(cVar, "kClass");
        this.f21677a = hVar;
        this.f21678b = cVar;
        this.f21679c = hVar.f21691a + '<' + cVar.y() + '>';
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f21677a.equals(bVar.f21677a) && jc.l.a(bVar.f21678b, this.f21678b);
    }

    @Override // uf.g
    public final List getAnnotations() {
        return this.f21677a.f21694d;
    }

    public final int hashCode() {
        return this.f21679c.hashCode() + (this.f21678b.hashCode() * 31);
    }

    @Override // uf.g
    public final n j() {
        return this.f21677a.f21692b;
    }

    @Override // uf.g
    public final boolean l() {
        return false;
    }

    @Override // uf.g
    public final String m() {
        return this.f21679c;
    }

    @Override // uf.g
    public final boolean n() {
        return false;
    }

    @Override // uf.g
    public final int o(String str) {
        jc.l.e(str, "name");
        return this.f21677a.o(str);
    }

    @Override // uf.g
    public final int p() {
        return this.f21677a.f21693c;
    }

    @Override // uf.g
    public final String q(int i10) {
        return this.f21677a.f21696f[i10];
    }

    @Override // uf.g
    public final List r(int i10) {
        return this.f21677a.f21698h[i10];
    }

    @Override // uf.g
    public final g s(int i10) {
        return this.f21677a.f21697g[i10];
    }

    @Override // uf.g
    public final boolean t(int i10) {
        return this.f21677a.f21699i[i10];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f21678b + ", original: " + this.f21677a + ')';
    }
}
