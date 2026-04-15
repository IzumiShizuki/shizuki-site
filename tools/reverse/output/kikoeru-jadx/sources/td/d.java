package td;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f20671e = new d(null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f20672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20675d;

    public d(g gVar, e eVar, boolean z10, boolean z11) {
        this.f20672a = gVar;
        this.f20673b = eVar;
        this.f20674c = z10;
        this.f20675d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f20672a == dVar.f20672a && this.f20673b == dVar.f20673b && this.f20674c == dVar.f20674c && this.f20675d == dVar.f20675d;
    }

    public final int hashCode() {
        g gVar = this.f20672a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        e eVar = this.f20673b;
        return ((((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31) + (this.f20674c ? 1231 : 1237)) * 31) + (this.f20675d ? 1231 : 1237);
    }

    public final String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f20672a + ", mutability=" + this.f20673b + ", definitelyNotNull=" + this.f20674c + ", isNullabilityQualifierForWarning=" + this.f20675d + ')';
    }

    public /* synthetic */ d(g gVar, boolean z10) {
        this(gVar, null, z10, false);
    }
}
