package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8361a;

    public b0(String str) {
        jc.l.e(str, "className");
        this.f8361a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && jc.l.a(this.f8361a, ((b0) obj).f8361a);
    }

    public final int hashCode() {
        return this.f8361a.hashCode();
    }

    public final String toString() {
        return q.t0.E(new StringBuilder("KClassValue("), this.f8361a, ')');
    }
}
