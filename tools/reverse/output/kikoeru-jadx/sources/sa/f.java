package sa;

import j2.h0;
import java.util.ArrayList;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    static {
        ArrayList arrayList = new ArrayList(3);
        int i10 = 0;
        while (i10 < 3) {
            char cCharAt = "HSV".charAt(i10);
            i10++;
            arrayList.add(new m3.l(String.valueOf(cCharAt)));
        }
        vb.m.r0(arrayList, new m3.l(27));
    }

    public static final float a(double d10, double d11, double d12, int i10) {
        double d13 = (((double) i10) + d10) % ((double) 6);
        double d14 = d12 * d11;
        double dMin = Math.min(d13, Math.min(((double) 4) - d13, 1.0d));
        if (dMin < 0.0d) {
            dMin = 0.0d;
        }
        return (float) (d11 - (d14 * dMin));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.valueOf(0.0f).equals(Float.valueOf(0.0f)) && Float.valueOf(0.0f).equals(Float.valueOf(0.0f)) && Float.valueOf(0.0f).equals(Float.valueOf(0.0f)) && Float.valueOf(0.0f).equals(Float.valueOf(0.0f));
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + t0.x(0.0f, t0.x(0.0f, Float.floatToIntBits(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HSV(h=");
        sb.append(0.0f);
        sb.append(", s=");
        sb.append(0.0f);
        sb.append(", v=");
        sb.append(0.0f);
        sb.append(", alpha=");
        return h0.l(sb, 0.0f, ')');
    }
}
