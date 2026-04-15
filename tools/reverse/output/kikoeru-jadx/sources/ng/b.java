package ng;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f15876b = new int[256];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f15877a = new int[3];

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 = (i11 & 1) == 1 ? (i11 >>> 1) ^ (-306674912) : i11 >>> 1;
            }
            f15876b[i10] = i11;
        }
    }

    public final byte a() {
        int i10 = this.f15877a[2] | 2;
        return (byte) ((i10 * (i10 ^ 1)) >>> 8);
    }

    public final void b(byte b10) {
        int[] iArr = this.f15877a;
        int i10 = iArr[0];
        int i11 = i10 >>> 8;
        int i12 = (b10 ^ i10) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        int[] iArr2 = f15876b;
        int i13 = iArr2[i12] ^ i11;
        iArr[0] = i13;
        int i14 = iArr[1] + (i13 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        iArr[1] = i14;
        int i15 = (i14 * 134775813) + 1;
        iArr[1] = i15;
        int i16 = iArr[2];
        iArr[2] = iArr2[(i16 ^ ((byte) (i15 >> 24))) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK] ^ (i16 >>> 8);
    }
}
