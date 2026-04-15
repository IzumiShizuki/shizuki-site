package ef;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc.d f6568b;

    public h(String str, oc.d dVar) {
        this.f6567a = str;
        this.f6568b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return jc.l.a(this.f6567a, hVar.f6567a) && jc.l.a(this.f6568b, hVar.f6568b);
    }

    public final int hashCode() {
        return this.f6568b.hashCode() + (this.f6567a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f6567a + ", range=" + this.f6568b + ')';
    }
}
