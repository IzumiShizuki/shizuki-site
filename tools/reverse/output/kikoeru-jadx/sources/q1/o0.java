package q1;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17564d;

    public o0(long j10, ArrayList arrayList) {
        this.f17563c = j10;
        this.f17564d = arrayList;
    }

    @Override // q1.j0
    public final Shader b(long j10) {
        long jFloatToRawIntBits;
        long j11 = this.f17563c;
        if ((9223372034707292159L & j11) == 9205357640488583168L) {
            jFloatToRawIntBits = nh.a.l(j10);
        } else {
            int i10 = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
                i10 = (int) (j10 >> 32);
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i10);
            int i11 = (int) (j11 & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j10 & 4294967295L)) : Float.intBitsToFloat(i11);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        }
        ArrayList arrayList = this.f17564d;
        h0.H(arrayList);
        int iM = h0.m(arrayList);
        return new SweepGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), h0.s(iM, arrayList), h0.t(iM, arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return p1.b.c(this.f17563c, o0Var.f17563c) && this.f17564d.equals(o0Var.f17564d);
    }

    public final int hashCode() {
        return (this.f17564d.hashCode() + (p1.b.g(this.f17563c) * 31)) * 31;
    }

    public final String toString() {
        String str;
        long j10 = this.f17563c;
        if ((9223372034707292159L & j10) != 9205357640488583168L) {
            str = "center=" + ((Object) p1.b.k(j10)) + ", ";
        } else {
            str = "";
        }
        StringBuilder sbK = a0.c.K("SweepGradient(", str, "colors=");
        sbK.append(this.f17564d);
        sbK.append(", stops=null)");
        return sbK.toString();
    }
}
