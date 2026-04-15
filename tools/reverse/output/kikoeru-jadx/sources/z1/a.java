package z1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26376a;

    public /* synthetic */ a(int i10) {
        this.f26376a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f26376a == ((a) obj).f26376a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26376a;
    }

    public final String toString() {
        int i10 = this.f26376a;
        return i10 == 1 ? "Touch" : i10 == 2 ? "Keyboard" : "Error";
    }
}
