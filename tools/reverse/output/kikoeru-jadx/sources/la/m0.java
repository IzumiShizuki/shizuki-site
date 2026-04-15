package la;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12041b;

    public m0(float f10, float f11) {
        this.f12040a = f10;
        this.f12041b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return f3.f.a(this.f12040a, m0Var.f12040a) && f3.f.a(this.f12041b, m0Var.f12041b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f12041b) + (Float.floatToIntBits(this.f12040a) * 31);
    }

    public final String toString() {
        float f10 = this.f12040a;
        String strB = f3.f.b(f10);
        float f11 = this.f12041b;
        String strB2 = f3.f.b(f10 + f11);
        String strB3 = f3.f.b(f11);
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        sb.append(strB);
        sb.append(", right=");
        sb.append(strB2);
        sb.append(", width=");
        return j2.h0.n(sb, strB3, ")");
    }
}
