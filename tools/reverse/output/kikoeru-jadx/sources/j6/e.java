package j6;

import r5.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f10575d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10576a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10578c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = ((long) bArr[0]) & 255;
        if (z10) {
            j10 &= ~f10575d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public final long b(o oVar, boolean z10, boolean z11, int i10) {
        int i11;
        int i12 = this.f10577b;
        byte[] bArr = this.f10576a;
        if (i12 == 0) {
            if (!oVar.d(bArr, 0, 1, z10)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 >= 8) {
                    i11 = -1;
                    break;
                }
                if ((f10575d[i14] & ((long) i13)) != 0) {
                    i11 = i14 + 1;
                    break;
                }
                i14++;
            }
            this.f10578c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f10577b = 1;
        }
        int i15 = this.f10578c;
        if (i15 > i10) {
            this.f10577b = 0;
            return -2L;
        }
        if (i15 != 1) {
            oVar.readFully(bArr, 1, i15 - 1);
        }
        this.f10577b = 0;
        return a(bArr, this.f10578c, z11);
    }
}
