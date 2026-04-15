package oc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f16314d = new d(1, 0, 1);

    @Override // oc.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f16307a == dVar.f16307a && this.f16308b == dVar.f16308b;
    }

    @Override // oc.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f16307a * 31) + this.f16308b;
    }

    @Override // oc.b
    public final boolean isEmpty() {
        return this.f16307a > this.f16308b;
    }

    @Override // oc.b
    public final String toString() {
        return this.f16307a + ".." + this.f16308b;
    }
}
