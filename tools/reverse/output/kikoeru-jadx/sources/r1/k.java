package r1;

import q1.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(long j10, String str, int i10, int i11) {
        super(j10, str, i10);
        this.f18691d = i11;
    }

    @Override // r1.c
    public final float a(int i10) {
        switch (this.f18691d) {
            case 0:
                return i10 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // r1.c
    public final float b(int i10) {
        switch (this.f18691d) {
            case 0:
                return i10 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // r1.c
    public final long d(float f10, float f11, float f12) {
        switch (this.f18691d) {
            case 0:
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 100.0f) {
                    f10 = 100.0f;
                }
                if (f11 < -128.0f) {
                    f11 = -128.0f;
                }
                if (f11 > 128.0f) {
                    f11 = 128.0f;
                }
                float f13 = (f10 + 16.0f) / 116.0f;
                float f14 = (f11 * 0.002f) + f13;
                float f15 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
                float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
                float[] fArr = j.f18690e;
                float f17 = f15 * fArr[0];
                return (((long) Float.floatToRawIntBits(f16 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f17)) << 32);
            default:
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f)) & 4294967295L);
        }
    }

    @Override // r1.c
    public final float e(float f10, float f11, float f12) {
        switch (this.f18691d) {
            case 0:
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 100.0f) {
                    f10 = 100.0f;
                }
                if (f12 < -128.0f) {
                    f12 = -128.0f;
                }
                if (f12 > 128.0f) {
                    f12 = 128.0f;
                }
                float f13 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
                return (f13 > 0.20689656f ? f13 * f13 * f13 : 0.12841855f * (f13 - 0.13793103f)) * j.f18690e[2];
            default:
                if (f12 < -2.0f) {
                    f12 = -2.0f;
                }
                if (f12 > 2.0f) {
                    return 2.0f;
                }
                return f12;
        }
    }

    @Override // r1.c
    public final long f(float f10, float f11, float f12, float f13, c cVar) {
        switch (this.f18691d) {
            case 0:
                float[] fArr = j.f18690e;
                float f14 = f10 / fArr[0];
                float f15 = f11 / fArr[1];
                float f16 = f12 / fArr[2];
                float fCbrt = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
                float f17 = (116.0f * fCbrt2) - 16.0f;
                float f18 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f17 < 0.0f) {
                    f17 = 0.0f;
                }
                if (f17 > 100.0f) {
                    f17 = 100.0f;
                }
                if (f18 < -128.0f) {
                    f18 = -128.0f;
                }
                if (f18 > 128.0f) {
                    f18 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return h0.b(f17, f18, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f13, cVar);
            default:
                if (f10 < -2.0f) {
                    f10 = -2.0f;
                }
                if (f10 > 2.0f) {
                    f10 = 2.0f;
                }
                if (f11 < -2.0f) {
                    f11 = -2.0f;
                }
                if (f11 > 2.0f) {
                    f11 = 2.0f;
                }
                if (f12 < -2.0f) {
                    f12 = -2.0f;
                }
                return h0.b(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, cVar);
        }
    }
}
