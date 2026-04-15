package t2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20318a;

    public /* synthetic */ f0(String str) {
        this.f20318a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            return jc.l.a(this.f20318a, ((f0) obj).f20318a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20318a.hashCode();
    }

    public final String toString() {
        return a0.c.G(')', "StringAnnotation(value=", this.f20318a);
    }
}
