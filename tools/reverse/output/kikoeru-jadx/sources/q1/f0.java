package q1;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17508e;

    public f0(List list, long j10, float f10) {
        this.f17506c = list;
        this.f17507d = j10;
        this.f17508e = f10;
    }

    @Override // q1.j0
    public final Shader b(long j10) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j11 = this.f17507d;
        if ((9223372034707292159L & j11) == 9205357640488583168L) {
            long jL = nh.a.l(j10);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL & 4294967295L));
        } else {
            int i10 = (int) (j11 >> 32);
            if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
                i10 = (int) (j10 >> 32);
            }
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            int i11 = (int) (j11 & 4294967295L);
            fIntBitsToFloat = fIntBitsToFloat3;
            fIntBitsToFloat2 = Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j10 & 4294967295L)) : Float.intBitsToFloat(i11);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fC = this.f17508e;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = p1.e.c(j10) / 2;
        }
        float f10 = fC;
        List list = this.f17506c;
        h0.H(list);
        int iM = h0.m(list);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f10, h0.s(iM, list), h0.t(iM, list), Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f17506c.equals(f0Var.f17506c) && p1.b.c(this.f17507d, f0Var.f17507d) && this.f17508e == f0Var.f17508e;
    }

    public final int hashCode() {
        return t0.x(this.f17508e, (p1.b.g(this.f17507d) + (this.f17506c.hashCode() * 961)) * 31, 31);
    }

    public final String toString() {
        String str;
        long j10 = this.f17507d;
        String str2 = "";
        if ((9223372034707292159L & j10) != 9205357640488583168L) {
            str = "center=" + ((Object) p1.b.k(j10)) + ", ";
        } else {
            str = "";
        }
        float f10 = this.f17508e;
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f10 + ", ";
        }
        return "RadialGradient(colors=" + this.f17506c + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
