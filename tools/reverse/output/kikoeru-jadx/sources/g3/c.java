package g3;

import java.util.Arrays;
import jc.l;
import pe.d;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f7343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f7344b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f7343a = fArr;
        this.f7344b = fArr2;
    }

    @Override // g3.a
    public final float a(float f10) {
        return d.y(f10, this.f7344b, this.f7343a);
    }

    @Override // g3.a
    public final float b(float f10) {
        return d.y(f10, this.f7343a, this.f7344b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f7343a, cVar.f7343a) && Arrays.equals(this.f7344b, cVar.f7344b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7344b) + (Arrays.hashCode(this.f7343a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f7343a);
        l.d(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f7344b);
        l.d(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
