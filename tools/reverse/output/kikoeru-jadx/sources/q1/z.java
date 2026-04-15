package q1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17585e;

    public z(long j10, long j11, List list) {
        this.f17583c = list;
        this.f17584d = j10;
        this.f17585e = j11;
    }

    @Override // q1.j0
    public final Shader b(long j10) {
        long j11 = this.f17584d;
        int i10 = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j10 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j10 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11);
        long j12 = this.f17585e;
        int i12 = (int) (j12 >> 32);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j10 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i12);
        int i13 = (int) (j12 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j10 & 4294967295L)) : Float.intBitsToFloat(i13);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f17583c;
        h0.H(list);
        int iM = h0.m(list);
        return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), h0.s(iM, list), h0.t(iM, list), Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f17583c.equals(zVar.f17583c) && p1.b.c(this.f17584d, zVar.f17584d) && p1.b.c(this.f17585e, zVar.f17585e);
    }

    public final int hashCode() {
        return (p1.b.g(this.f17585e) + ((p1.b.g(this.f17584d) + (this.f17583c.hashCode() * 961)) * 31)) * 31;
    }

    public final String toString() {
        String str;
        long j10 = this.f17584d;
        String str2 = "";
        if (((((j10 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) p1.b.k(j10)) + ", ";
        } else {
            str = "";
        }
        long j11 = this.f17585e;
        if ((((9187343241974906880L ^ (j11 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) p1.b.k(j11)) + ", ";
        }
        return "LinearGradient(colors=" + this.f17583c + ", stops=null, " + str + str2 + "tileMode=Clamp)";
    }
}
