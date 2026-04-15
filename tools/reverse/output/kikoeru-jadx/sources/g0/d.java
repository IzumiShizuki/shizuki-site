package g0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7117a;

    public d(float f10) {
        this.f7117a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            x.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // g0.a
    public final float b(long j10, f3.c cVar) {
        return (this.f7117a / 100.0f) * p1.e.c(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f7117a, ((d) obj).f7117a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7117a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f7117a + "%)";
    }
}
