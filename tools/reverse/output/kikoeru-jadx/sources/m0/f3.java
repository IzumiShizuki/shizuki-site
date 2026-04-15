package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.f f12975a;

    public f3(f1.f fVar) {
        this.f12975a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3) && this.f12975a.equals(((f3) obj).f12975a);
    }

    public final int hashCode() {
        return this.f12975a.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=null, transition=" + this.f12975a + ')';
    }
}
