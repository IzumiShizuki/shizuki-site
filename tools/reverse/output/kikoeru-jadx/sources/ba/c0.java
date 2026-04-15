package ba;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2317b;

    public c0(String str, String str2) {
        this.f2316a = str;
        this.f2317b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return jc.l.a(this.f2316a, c0Var.f2316a) && jc.l.a(this.f2317b, c0Var.f2317b);
    }

    public final int hashCode() {
        return this.f2317b.hashCode() + (this.f2316a.hashCode() * 31);
    }

    public final String toString() {
        return "MainPageData(name=" + this.f2316a + ", displayName=" + this.f2317b + ")";
    }
}
