package s1;

import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19355d;

    public h(float f10, float f11, int i10, int i11, int i12) {
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f19352a = f10;
        this.f19353b = f11;
        this.f19354c = i10;
        this.f19355d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f19352a == hVar.f19352a && this.f19353b == hVar.f19353b && this.f19354c == hVar.f19354c && this.f19355d == hVar.f19355d;
    }

    public final int hashCode() {
        return (((t0.x(this.f19353b, Float.floatToIntBits(this.f19352a) * 31, 31) + this.f19354c) * 31) + this.f19355d) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f19352a);
        sb.append(", miter=");
        sb.append(this.f19353b);
        sb.append(", cap=");
        String str = "Unknown";
        int i10 = this.f19354c;
        sb.append((Object) (i10 == 0 ? "Butt" : i10 == 1 ? "Round" : i10 == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i11 = this.f19355d;
        if (i11 == 0) {
            str = "Miter";
        } else if (i11 == 1) {
            str = "Round";
        } else if (i11 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
