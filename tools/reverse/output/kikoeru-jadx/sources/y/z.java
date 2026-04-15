package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1.g f25291h;

    public z(j1.g gVar) {
        this.f25291h = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && jc.l.a(this.f25291h, ((z) obj).f25291h);
    }

    @Override // y.d
    public final int f(int i10, f3.m mVar) {
        return this.f25291h.a(0, i10);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f25291h.f9680a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f25291h + ')';
    }
}
