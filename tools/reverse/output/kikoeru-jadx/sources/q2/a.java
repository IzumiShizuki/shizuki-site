package q2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ub.e f17587b;

    public a(String str, ub.e eVar) {
        this.f17586a = str;
        this.f17587b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jc.l.a(this.f17586a, aVar.f17586a) && jc.l.a(this.f17587b, aVar.f17587b);
    }

    public final int hashCode() {
        String str = this.f17586a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ub.e eVar = this.f17587b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f17586a + ", action=" + this.f17587b + ')';
    }
}
