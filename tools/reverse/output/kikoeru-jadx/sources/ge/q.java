package ge;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f7535a;

    public q(f fVar) {
        this.f7535a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && jc.l.a(this.f7535a, ((q) obj).f7535a);
    }

    public final int hashCode() {
        return this.f7535a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f7535a + ')';
    }
}
