package k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.g f10945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t2.g f10946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10947c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f10948d = null;

    public k(t2.g gVar, t2.g gVar2) {
        this.f10945a = gVar;
        this.f10946b = gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return jc.l.a(this.f10945a, kVar.f10945a) && jc.l.a(this.f10946b, kVar.f10946b) && this.f10947c == kVar.f10947c && jc.l.a(this.f10948d, kVar.f10948d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f10946b.hashCode() + (this.f10945a.hashCode() * 31)) * 31) + (this.f10947c ? 1231 : 1237)) * 31;
        d dVar = this.f10948d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f10945a) + ", substitution=" + ((Object) this.f10946b) + ", isShowingSubstitution=" + this.f10947c + ", layoutCache=" + this.f10948d + ')';
    }
}
