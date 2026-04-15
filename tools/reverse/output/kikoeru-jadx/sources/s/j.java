package s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q1.f f19185a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q1.b f19186b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s1.b f19187c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1.h f19188d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jc.l.a(this.f19185a, jVar.f19185a) && jc.l.a(this.f19186b, jVar.f19186b) && jc.l.a(this.f19187c, jVar.f19187c) && jc.l.a(this.f19188d, jVar.f19188d);
    }

    public final int hashCode() {
        q1.f fVar = this.f19185a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        q1.b bVar = this.f19186b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        s1.b bVar2 = this.f19187c;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        q1.h hVar = this.f19188d;
        return iHashCode3 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f19185a + ", canvas=" + this.f19186b + ", canvasDrawScope=" + this.f19187c + ", borderPath=" + this.f19188d + ')';
    }
}
