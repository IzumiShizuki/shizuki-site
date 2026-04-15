package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends u2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9312f;

    public s2(int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i12, i13, i14, i15);
        this.f9311e = i10;
        this.f9312f = i11;
    }

    @Override // i7.u2
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return this.f9311e == s2Var.f9311e && this.f9312f == s2Var.f9312f && this.f9331a == s2Var.f9331a && this.f9332b == s2Var.f9332b && this.f9333c == s2Var.f9333c && this.f9334d == s2Var.f9334d;
    }

    @Override // i7.u2
    public final int hashCode() {
        return super.hashCode() + this.f9311e + this.f9312f;
    }

    public final String toString() {
        return ef.o.a0("ViewportHint.Access(\n            |    pageOffset=" + this.f9311e + ",\n            |    indexInPage=" + this.f9312f + ",\n            |    presentedItemsBefore=" + this.f9331a + ",\n            |    presentedItemsAfter=" + this.f9332b + ",\n            |    originalPageOffsetFirst=" + this.f9333c + ",\n            |    originalPageOffsetLast=" + this.f9334d + ",\n            |)");
    }
}
