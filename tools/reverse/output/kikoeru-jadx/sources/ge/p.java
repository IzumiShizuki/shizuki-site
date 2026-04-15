package ge;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se.w f7534a;

    public p(se.w wVar) {
        this.f7534a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && jc.l.a(this.f7534a, ((p) obj).f7534a);
    }

    public final int hashCode() {
        return this.f7534a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f7534a + ')';
    }
}
