package e3;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f6075c = new i(f.f6071c, 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6077b;

    public i(float f10, int i10) {
        this.f6076a = f10;
        this.f6077b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f10 = iVar.f6076a;
        float f11 = f.f6070b;
        return Float.compare(this.f6076a, f10) == 0 && this.f6077b == iVar.f6077b;
    }

    public final int hashCode() {
        float f10 = f.f6070b;
        return ((Float.floatToIntBits(this.f6076a) * 31) + this.f6077b) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) f.b(this.f6076a));
        sb.append(", trim=");
        int i10 = this.f6077b;
        sb.append((Object) (i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
