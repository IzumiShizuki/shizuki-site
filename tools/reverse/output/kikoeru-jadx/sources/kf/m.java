package kf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f11379b = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11380a;

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return jc.l.a(this.f11380a, ((m) obj).f11380a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f11380a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f11380a;
        if (obj instanceof k) {
            return ((k) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
