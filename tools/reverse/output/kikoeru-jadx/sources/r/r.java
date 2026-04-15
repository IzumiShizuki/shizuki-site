package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18554d;

    public r(float f10, float f11) {
        int I;
        this.f18551a = f10;
        this.f18552b = f11;
        if (Float.isNaN(f10) || Float.isNaN(0.0f) || Float.isNaN(f11) || Float.isNaN(1.0f)) {
            n0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", 0.0, " + f11 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d10 = 0.0f;
        double d11 = 3.0f;
        double d12 = 0.0f;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            I = d11 == d12 ? 0 : q1.h0.I((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, 0);
        } else {
            double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
            double d16 = (-d10) + d11;
            int I2 = q1.h0.I((float) ((-(d15 + d16)) / d14), fArr, 0);
            I = q1.h0.I((float) ((d15 - d16) / d14), fArr, I2) + I2;
            if (I > 1) {
                float f12 = fArr[0];
                float f13 = fArr[1];
                if (f12 > f13) {
                    fArr[0] = f13;
                    fArr[1] = f12;
                } else if (f12 == f13) {
                    I--;
                }
            }
        }
        int I3 = q1.h0.I(0.5f, fArr, I) + I;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < I3; i10++) {
            float f14 = fArr[i10];
            float f15 = ((((((-2.0f) * f14) + 3.0f) * f14) + 0.0f) * f14) + 0.0f;
            fMin = Math.min(fMin, f15);
            fMax = Math.max(fMax, f15);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f18553c = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f18554d = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[PHI: r3
      0x008f: PHI (r3v24 float) = (r3v5 float), (r3v12 float), (r3v18 float), (r3v28 float), (r3v34 float) binds: [B:123:0x022f, B:113:0x0202, B:89:0x01b8, B:45:0x00e0, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[PHI: r11
      0x00c4: PHI (r11v16 float) = (r11v4 float), (r11v9 float), (r11v21 float) binds: [B:66:0x015e, B:79:0x018f, B:35:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // r.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b(float r28) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.r.b(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f18551a == rVar.f18551a && this.f18552b == rVar.f18552b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + q.t0.x(this.f18552b, q.t0.x(0.0f, Float.floatToIntBits(this.f18551a) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f18551a + ", b=0.0, c=" + this.f18552b + ", d=1.0)";
    }
}
