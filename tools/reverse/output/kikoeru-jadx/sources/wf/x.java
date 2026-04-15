package wf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends b1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uf.j f24203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ub.p f24204m;

    public x(int i10, String str) {
        super(str, null, i10);
        this.f24203l = uf.j.f21704b;
        this.f24204m = ub.a.d(new ba.d0(i10, str, this));
    }

    @Override // wf.b1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uf.g)) {
            return false;
        }
        uf.g gVar = (uf.g) obj;
        return gVar.j() == uf.j.f21704b && this.f24085a.equals(gVar.m()) && jc.l.a(z0.b(this), z0.b(gVar));
    }

    @Override // wf.b1
    public final int hashCode() {
        int iHashCode = this.f24085a.hashCode();
        jc.b bVar = new jc.b(this);
        int iHashCode2 = 1;
        while (bVar.hasNext()) {
            int i10 = iHashCode2 * 31;
            String str = (String) bVar.next();
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // wf.b1, uf.g
    public final ud.n j() {
        return this.f24203l;
    }

    @Override // wf.b1, uf.g
    public final uf.g s(int i10) {
        return ((uf.g[]) this.f24204m.getValue())[i10];
    }

    @Override // wf.b1
    public final String toString() {
        return vb.m.f0(new df.o(1, this), ", ", this.f24085a.concat("("), ")", null, 56);
    }
}
