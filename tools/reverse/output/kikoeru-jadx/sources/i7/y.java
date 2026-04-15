package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f9380b;

    public y(Throwable th2) {
        super(false);
        this.f9380b = th2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f9048a == yVar.f9048a && this.f9380b.equals(yVar.f9380b);
    }

    public final int hashCode() {
        return this.f9380b.hashCode() + (this.f9048a ? 1231 : 1237);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.f9048a + ", error=" + this.f9380b + ')';
    }
}
