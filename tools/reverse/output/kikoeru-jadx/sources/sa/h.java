package sa;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f19702a;

    public h(double d10) {
        this.f19702a = d10;
    }

    @Override // sa.j
    public final float a(float f10) {
        return (float) nd.h.u(f10, this.f19702a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Double.valueOf(this.f19702a).equals(Double.valueOf(((h) obj).f19702a));
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f19702a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        return "GammaTransferFunctions(gamma=" + this.f19702a + ')';
    }
}
