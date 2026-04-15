package y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f25135a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25136b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f25137c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Float.compare(this.f25135a, h1Var.f25135a) == 0 && this.f25136b == h1Var.f25136b && jc.l.a(this.f25137c, h1Var.f25137c);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.f25135a) * 31) + (this.f25136b ? 1231 : 1237)) * 31;
        d dVar = this.f25137c;
        return (iFloatToIntBits + (dVar == null ? 0 : dVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f25135a + ", fill=" + this.f25136b + ", crossAxisAlignment=" + this.f25137c + ", flowLayoutData=null)";
    }
}
