package r5;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f18903g;

    public boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f18897a = i11;
        this.f18903g = b.f18770s[3 - i12];
        int i15 = b.f18771t[i14];
        this.f18899c = i15;
        if (i11 == 2) {
            this.f18899c = i15 / 2;
        } else if (i11 == 0) {
            this.f18899c = i15 / 4;
        }
        int i16 = (i10 >>> 9) & 1;
        int i17 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException();
                }
                i17 = 384;
            }
        } else if (i11 != 3) {
            i17 = 576;
        }
        this.f18902f = i17;
        if (i12 == 3) {
            int i18 = i11 == 3 ? b.f18772u[i13 - 1] : b.f18773v[i13 - 1];
            this.f18901e = i18;
            this.f18898b = (((i18 * 12) / this.f18899c) + i16) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? b.f18774w[i13 - 1] : b.f18775x[i13 - 1];
                this.f18901e = i19;
                this.f18898b = ((i19 * 144) / this.f18899c) + i16;
            } else {
                int i20 = b.f18776y[i13 - 1];
                this.f18901e = i20;
                this.f18898b = (((i12 == 1 ? 72 : 144) * i20) / this.f18899c) + i16;
            }
        }
        this.f18900d = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
