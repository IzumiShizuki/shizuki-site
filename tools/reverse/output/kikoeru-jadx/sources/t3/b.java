package t3;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20407b;

    public b(Object obj, Object obj2) {
        this.f20406a = obj;
        this.f20407b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f20406a, this.f20406a) && Objects.equals(bVar.f20407b, this.f20407b);
    }

    public final int hashCode() {
        Object obj = this.f20406a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f20407b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f20406a + " " + this.f20407b + "}";
    }
}
