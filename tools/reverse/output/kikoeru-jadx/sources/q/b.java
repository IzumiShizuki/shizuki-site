package q;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f17234a;

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float[] fArr = new float[TinkerReport.KEY_APPLIED_UPGRADE_FAIL];
        f17234a = fArr;
        float[] fArr2 = new float[TinkerReport.KEY_APPLIED_UPGRADE_FAIL];
        float f18 = 0.0f;
        float f19 = 0.0f;
        int i10 = 0;
        while (true) {
            float f20 = 1.0f;
            if (i10 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f21 = i10 / 100;
            float f22 = 1.0f;
            while (true) {
                f10 = ((f22 - f18) / 2.0f) + f18;
                f11 = f20 - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f23 = (((f10 * 0.35000002f) + (f11 * 0.175f)) * f12) + f13;
                if (Math.abs(f23 - f21) < 1.0E-5d) {
                    break;
                }
                if (f23 > f21) {
                    f22 = f10;
                } else {
                    f18 = f10;
                }
                f20 = 1.0f;
            }
            float f24 = 0.5f;
            fArr[i10] = (((f11 * 0.5f) + f10) * f12) + f13;
            float f25 = 1.0f;
            while (true) {
                f14 = ((f25 - f19) / 2.0f) + f19;
                f15 = 1.0f - f14;
                f16 = f14 * 3.0f * f15;
                f17 = f14 * f14 * f14;
                float f26 = (((f15 * f24) + f14) * f16) + f17;
                float f27 = f25;
                if (Math.abs(f26 - f21) >= 1.0E-5d) {
                    if (f26 > f21) {
                        f25 = f14;
                    } else {
                        f19 = f14;
                        f25 = f27;
                    }
                    f24 = 0.5f;
                }
            }
            fArr2[i10] = (((f14 * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
            i10++;
        }
    }

    public static a a(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float fJ = nh.b.j(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i10 = (int) (f13 * fJ);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = f17234a;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            float f18 = ((fJ - f14) * f17) + f16;
            f11 = f17;
            f12 = f18;
        }
        return new a(f12, f11);
    }
}
