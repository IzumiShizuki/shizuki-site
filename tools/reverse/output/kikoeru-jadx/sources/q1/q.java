package q1;

import com.tencent.bugly.beta.tinker.TinkerReport;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f17569b = h0.e(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f17570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f17571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f17572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f17573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f17574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f17575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f17576i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17577a;

    static {
        h0.e(4282664004L);
        f17570c = h0.e(4287137928L);
        h0.e(4291611852L);
        f17571d = h0.e(4294967295L);
        f17572e = h0.e(4294901760L);
        h0.e(4278255360L);
        f17573f = h0.e(4278190335L);
        h0.e(4294967040L);
        h0.e(4278255615L);
        h0.e(4294902015L);
        f17574g = h0.c(0);
        f17575h = h0.b(0.0f, 0.0f, 0.0f, 0.0f, r1.d.f18673u);
    }

    public /* synthetic */ q(long j10) {
        this.f17577a = j10;
    }

    public static final long a(long j10, r1.c cVar) {
        r1.g gVarE;
        r1.c cVarF = f(j10);
        int i10 = cVarF.f18652c;
        int i11 = cVar.f18652c;
        if ((i10 | i11) < 0) {
            gVarE = r1.j.e(cVarF, cVar);
        } else {
            o.y yVar = r1.h.f18685a;
            int i12 = i10 | (i11 << 6);
            Object objB = yVar.b(i12);
            if (objB == null) {
                objB = r1.j.e(cVarF, cVar);
                yVar.h(i12, objB);
            }
            gVarE = (r1.g) objB;
        }
        return gVarE.a(j10);
    }

    public static long b(float f10, long j10) {
        return h0.b(h(j10), g(j10), e(j10), f10, f(j10));
    }

    public static final boolean c(long j10, long j11) {
        return j10 == j11;
    }

    public static final float d(long j10) {
        float fG;
        float f10;
        if ((63 & j10) == 0) {
            fG = (float) ub.a.g((j10 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            fG = (float) ub.a.g((j10 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return fG / f10;
    }

    public static final float e(long j10) {
        int i10;
        int i11;
        if ((63 & j10) == 0) {
            return ((float) ub.a.g((j10 >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 16) & 65535);
        int i12 = Short.MIN_VALUE & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                if (i15 != 0) {
                    i15 |= 4194304;
                }
                i10 = i15;
                i11 = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
            } else {
                int i16 = i13 + 112;
                i10 = i15;
                i11 = i16;
            }
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - u.f17580a;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final r1.c f(long j10) {
        float[] fArr = r1.d.f18653a;
        return r1.d.f18677y[(int) (j10 & 63)];
    }

    public static final float g(long j10) {
        int i10;
        int i11;
        if ((63 & j10) == 0) {
            return ((float) ub.a.g((j10 >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 32) & 65535);
        int i12 = Short.MIN_VALUE & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                if (i15 != 0) {
                    i15 |= 4194304;
                }
                i10 = i15;
                i11 = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
            } else {
                int i16 = i13 + 112;
                i10 = i15;
                i11 = i16;
            }
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - u.f17580a;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final float h(long j10) {
        int i10;
        int i11;
        if ((63 & j10) == 0) {
            return ((float) ub.a.g((j10 >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 48) & 65535);
        int i12 = Short.MIN_VALUE & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 != 0) {
            int i15 = i14 << 13;
            if (i13 == 31) {
                if (i15 != 0) {
                    i15 |= 4194304;
                }
                i10 = i15;
                i11 = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
            } else {
                int i16 = i13 + 112;
                i10 = i15;
                i11 = i16;
            }
        } else {
            if (i14 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - u.f17580a;
                return i12 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static String i(long j10) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j10));
        sb.append(", ");
        sb.append(g(j10));
        sb.append(", ");
        sb.append(e(j10));
        sb.append(", ");
        sb.append(d(j10));
        sb.append(", ");
        return t0.E(sb, f(j10).f18650a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f17577a == ((q) obj).f17577a;
        }
        return false;
    }

    public final int hashCode() {
        return ub.v.a(this.f17577a);
    }

    public final String toString() {
        return i(this.f17577a);
    }
}
