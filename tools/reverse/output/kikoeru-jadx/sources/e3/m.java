package e3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6086a;

    public static String a(int i10) {
        return i10 == 1 ? "Ltr" : i10 == 2 ? "Rtl" : i10 == 3 ? "Content" : i10 == 4 ? "ContentOrLtr" : i10 == 5 ? "ContentOrRtl" : i10 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f6086a == ((m) obj).f6086a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6086a;
    }

    public final String toString() {
        return a(this.f6086a);
    }
}
