package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f24525a;

    public /* synthetic */ y1(o oVar) {
        this.f24525a = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y1) {
            return jc.l.a(this.f24525a, ((y1) obj).f24525a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24525a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f24525a + ')';
    }
}
