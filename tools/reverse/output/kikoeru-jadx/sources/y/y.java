package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j1.f f25288h;

    public y(j1.f fVar) {
        this.f25288h = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && jc.l.a(this.f25288h, ((y) obj).f25288h);
    }

    @Override // y.d
    public final int f(int i10, f3.m mVar) {
        return this.f25288h.a(0, i10, mVar);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f25288h.f9679a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f25288h + ')';
    }
}
