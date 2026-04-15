package hd;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f8486a;

    public x(double d10) {
        this.f8486a = d10;
    }

    @Override // hd.c0
    public final Object a() {
        return Double.valueOf(this.f8486a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Double.compare(this.f8486a, ((x) obj).f8486a) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f8486a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
