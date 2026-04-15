package m4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f14603a;

    public v0(o oVar) {
        this.f14603a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            return this.f14603a.equals(((v0) obj).f14603a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14603a.hashCode();
    }
}
