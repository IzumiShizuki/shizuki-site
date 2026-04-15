package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends gh.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8426b;

    public n0(String str) {
        jc.l.e(str, "name");
        this.f8426b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && jc.l.a(this.f8426b, ((n0) obj).f8426b);
    }

    public final int hashCode() {
        return this.f8426b.hashCode();
    }

    public final String toString() {
        return q.t0.E(new StringBuilder("TypeAlias(name="), this.f8426b, ')');
    }
}
