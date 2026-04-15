package r1;

import q1.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float[] f18692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f18693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f18694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f18695g;

    static {
        float[] fArrG = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(a.f18643b.f18644a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f18692d = fArrG;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f18693e = fArr;
        f18694f = j.f(fArrG);
        f18695g = j.f(fArr);
    }

    @Override // r1.c
    public final float a(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // r1.c
    public final float b(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // r1.c
    public final long d(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f18695g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f18694f;
        float f20 = (fArr2[6] * f19) + (fArr2[3] * f18) + (fArr2[0] * f17);
        return (((long) Float.floatToRawIntBits((fArr2[7] * f19) + (fArr2[4] * f18) + (fArr2[1] * f17))) & 4294967295L) | (((long) Float.floatToRawIntBits(f20)) << 32);
    }

    @Override // r1.c
    public final float e(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f18695g;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f18694f;
        return (fArr2[8] * f19) + (fArr2[5] * f18) + (fArr2[2] * f17);
    }

    @Override // r1.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        float[] fArr = f18692d;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        float fD = android.support.v4.media.session.b.D(f14);
        float fD2 = android.support.v4.media.session.b.D(f15);
        float fD3 = android.support.v4.media.session.b.D(f16);
        float[] fArr2 = f18693e;
        return h0.b((fArr2[6] * fD3) + (fArr2[3] * fD2) + (fArr2[0] * fD), (fArr2[7] * fD3) + (fArr2[4] * fD2) + (fArr2[1] * fD), (fArr2[8] * fD3) + (fArr2[5] * fD2) + (fArr2[2] * fD), f13, cVar);
    }
}
