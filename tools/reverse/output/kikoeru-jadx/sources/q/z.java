package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.d f17484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.k f17485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r.x f17486c;

    public z(j1.d dVar, ic.k kVar, r.x xVar) {
        this.f17484a = dVar;
        this.f17485b = kVar;
        this.f17486c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return jc.l.a(this.f17484a, zVar.f17484a) && jc.l.a(this.f17485b, zVar.f17485b) && jc.l.a(this.f17486c, zVar.f17486c);
    }

    public final int hashCode() {
        return ((this.f17486c.hashCode() + ((this.f17485b.hashCode() + (this.f17484a.hashCode() * 31)) * 31)) * 31) + 1231;
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f17484a + ", size=" + this.f17485b + ", animationSpec=" + this.f17486c + ", clip=true)";
    }
}
