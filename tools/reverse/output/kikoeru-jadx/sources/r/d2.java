package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f18371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f18372b;

    public d2(p pVar, v vVar) {
        this.f18371a = pVar;
        this.f18372b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return jc.l.a(this.f18371a, d2Var.f18371a) && jc.l.a(this.f18372b, d2Var.f18372b);
    }

    public final int hashCode() {
        return (this.f18372b.hashCode() + (this.f18371a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f18371a + ", easing=" + this.f18372b + ", arcMode=ArcMode(value=0))";
    }
}
