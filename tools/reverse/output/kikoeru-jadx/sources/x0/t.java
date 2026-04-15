package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f24462a;

    public t(q qVar) {
        this.f24462a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return jc.l.a(this.f24462a, ((t) obj).f24462a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24462a.hashCode() * 31;
    }
}
