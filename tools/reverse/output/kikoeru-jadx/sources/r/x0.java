package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18629a;

    public x0(int i10) {
        this.f18629a = i10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x0) && ((x0) obj).f18629a == this.f18629a;
    }

    public final int hashCode() {
        return this.f18629a;
    }

    @Override // r.j
    public final a2 a(v1 v1Var) {
        return new q4.k(this.f18629a);
    }
}
