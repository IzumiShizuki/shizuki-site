package t2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f20401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f20402b;

    public w(v vVar, u uVar) {
        this.f20401a = vVar;
        this.f20402b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return jc.l.a(this.f20402b, wVar.f20402b) && jc.l.a(this.f20401a, wVar.f20401a);
    }

    public final int hashCode() {
        v vVar = this.f20401a;
        int iHashCode = (vVar != null ? vVar.hashCode() : 0) * 31;
        u uVar = this.f20402b;
        return iHashCode + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f20401a + ", paragraphSyle=" + this.f20402b + ')';
    }

    public w() {
        this(null, new u());
    }
}
