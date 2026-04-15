package xe;

import jc.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24977b;

    public a(Object obj, Object obj2) {
        this.f24976a = obj;
        this.f24977b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f24976a, aVar.f24976a) && l.a(this.f24977b, aVar.f24977b);
    }

    public final int hashCode() {
        Object obj = this.f24976a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f24977b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f24976a + ", upper=" + this.f24977b + ')';
    }
}
