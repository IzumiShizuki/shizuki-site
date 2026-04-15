package re;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f18997b;

    public g(Object obj, ic.a aVar) {
        this.f18996a = obj;
        this.f18997b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && this.f18996a.equals(((g) obj).f18996a);
    }

    public final int hashCode() {
        return this.f18996a.hashCode();
    }
}
