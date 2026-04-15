package ce;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3936b;

    public h(int i10, Object obj) {
        this.f3935a = obj;
        this.f3936b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3935a == hVar.f3935a && this.f3936b == hVar.f3936b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f3935a) * 65535) + this.f3936b;
    }
}
