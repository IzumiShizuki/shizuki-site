package r;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f18524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f18525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f18528j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f18529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f18530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f18531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f18532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f18533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f18534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f18535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f18536r;

    public q(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        float f16;
        this.f18519a = f10;
        this.f18520b = f11;
        this.f18521c = f12;
        this.f18522d = f13;
        this.f18523e = f14;
        this.f18524f = f15;
        float f17 = f14 - f12;
        float f18 = f15 - f13;
        boolean z11 = i10 == 1 || (i10 == 4 ? f18 > 0.0f : !(i10 != 5 || f18 >= 0.0f));
        float f19 = z11 ? -1.0f : 1.0f;
        this.f18531m = f19;
        float f20 = 1 / (f11 - f10);
        this.f18529k = f20;
        float[] fArr = new float[TinkerReport.KEY_APPLIED_UPGRADE_FAIL];
        this.f18528j = fArr;
        boolean z12 = i10 == 3;
        if (z12 || Math.abs(f17) < 0.001f || Math.abs(f18) < 0.001f) {
            float fHypot = (float) Math.hypot(f18, f17);
            this.f18525g = fHypot;
            this.f18530l = fHypot * f20;
            this.f18535q = f17 * f20;
            this.f18536r = f18 * f20;
            this.f18532n = Float.NaN;
            this.f18533o = Float.NaN;
            z10 = true;
        } else {
            this.f18532n = f17 * f19;
            this.f18533o = f18 * (-f19);
            this.f18535q = z11 ? f14 : f12;
            this.f18536r = z11 ? f13 : f15;
            float f21 = f14 - f12;
            float f22 = f13 - f15;
            float[] fArr2 = d.f18367i;
            int i11 = 90;
            float f23 = 90;
            float f24 = f22;
            int i12 = 1;
            float fHypot2 = 0.0f;
            float f25 = 0.0f;
            while (true) {
                double radians = (float) Math.toRadians((((double) i12) * 90.0d) / ((double) i11));
                float fSin = ((float) Math.sin(radians)) * f21;
                float fCos = ((float) Math.cos(radians)) * f22;
                float f26 = fSin - f25;
                f16 = f23;
                fHypot2 += (float) Math.hypot(f26, fCos - f24);
                fArr2[i12] = fHypot2;
                i11 = 90;
                if (i12 == 90) {
                    break;
                }
                i12++;
                f24 = fCos;
                f23 = f16;
                f25 = fSin;
            }
            this.f18525g = fHypot2;
            int i13 = 1;
            while (true) {
                fArr2[i13] = fArr2[i13] / fHypot2;
                if (i13 == 90) {
                    break;
                } else {
                    i13++;
                }
            }
            int length = fArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                float f27 = i14 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f27);
                if (iBinarySearch >= 0) {
                    fArr[i14] = iBinarySearch / f16;
                } else if (iBinarySearch == -1) {
                    fArr[i14] = 0.0f;
                } else {
                    int i15 = -iBinarySearch;
                    int i16 = i15 - 2;
                    float f28 = i16;
                    float f29 = fArr2[i16];
                    fArr[i14] = (((f27 - f29) / (fArr2[i15 - 1] - f29)) + f28) / f16;
                }
            }
            this.f18530l = this.f18525g * this.f18529k;
            z10 = z12;
        }
        this.f18534p = z10;
    }

    public final float a() {
        float f10 = this.f18532n * this.f18527i;
        return f10 * this.f18531m * (this.f18530l / ((float) Math.hypot(f10, (-this.f18533o) * this.f18526h)));
    }

    public final float b() {
        float f10 = this.f18532n * this.f18527i;
        float f11 = (-this.f18533o) * this.f18526h;
        return f11 * this.f18531m * (this.f18530l / ((float) Math.hypot(f10, f11)));
    }

    public final void c(float f10) {
        float f11 = (this.f18531m == -1.0f ? this.f18520b - f10 : f10 - this.f18519a) * this.f18529k;
        float f12 = 0.0f;
        if (f11 > 0.0f) {
            f12 = 1.0f;
            if (f11 < 1.0f) {
                float f13 = f11 * 100;
                int i10 = (int) f13;
                float[] fArr = this.f18528j;
                float f14 = fArr[i10];
                f12 = ((fArr[i10 + 1] - f14) * (f13 - i10)) + f14;
            }
        }
        double d10 = f12 * 1.5707964f;
        this.f18526h = (float) Math.sin(d10);
        this.f18527i = (float) Math.cos(d10);
    }
}
