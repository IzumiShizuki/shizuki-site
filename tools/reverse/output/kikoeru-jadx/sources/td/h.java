package td;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f20684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20685b;

    public h(g gVar) {
        this.f20684a = gVar;
        this.f20685b = false;
    }

    public static h a(h hVar, g gVar, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            gVar = hVar.f20684a;
        }
        if ((i10 & 2) != 0) {
            z10 = hVar.f20685b;
        }
        hVar.getClass();
        jc.l.e(gVar, "qualifier");
        return new h(gVar, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f20684a == hVar.f20684a && this.f20685b == hVar.f20685b;
    }

    public final int hashCode() {
        return (this.f20684a.hashCode() * 31) + (this.f20685b ? 1231 : 1237);
    }

    public final String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f20684a + ", isForWarningOnly=" + this.f20685b + ')';
    }

    public h(g gVar, boolean z10) {
        this.f20684a = gVar;
        this.f20685b = z10;
    }
}
