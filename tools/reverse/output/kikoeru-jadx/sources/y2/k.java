package y2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25416a;

    public static String a(int i10) {
        return i10 == 0 ? "Unspecified" : i10 == 1 ? "Text" : i10 == 2 ? "Ascii" : i10 == 3 ? "Number" : i10 == 4 ? "Phone" : i10 == 5 ? "Uri" : i10 == 6 ? "Email" : i10 == 7 ? "Password" : i10 == 8 ? "NumberPassword" : i10 == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f25416a == ((k) obj).f25416a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25416a;
    }

    public final String toString() {
        return a(this.f25416a);
    }
}
