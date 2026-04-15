package e3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6074a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f6074a == ((h) obj).f6074a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6074a;
    }

    public final String toString() {
        int i10 = this.f6074a;
        return i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
