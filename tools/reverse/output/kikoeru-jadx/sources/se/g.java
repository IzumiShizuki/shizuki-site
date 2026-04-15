package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.h f19945a;

    public g(zc.h hVar) {
        jc.l.e(hVar, "annotations");
        this.f19945a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return jc.l.a(((g) obj).f19945a, this.f19945a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19945a.hashCode();
    }
}
