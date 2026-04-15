package ph;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f17199e = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 0, 1, 7, 1, 1, 1, 1, 1, 1, 5, 1, 5, 0, 5, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 0, 7, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 7, 7, 7};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f17200f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 1, 1, 3, 3, 0, 3, 3, 3, 1, 2, 1, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 1, 3, 1, 1, 1, 3, 0, 3, 1, 3, 1, 1, 3, 3};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f17202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f17203d;

    @Override // ph.b
    public final String a() {
        return oh.a.f16456r;
    }

    @Override // ph.b
    public final float b() {
        int[] iArr;
        float f10;
        if (this.f17201b == 3) {
            return 0.01f;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iArr = this.f17203d;
            if (i10 >= iArr.length) {
                break;
            }
            i11 += iArr[i10];
            i10++;
        }
        if (i11 <= 0) {
            f10 = 0.0f;
        } else {
            float f11 = i11;
            f10 = ((iArr[3] * 1.0f) / f11) - ((iArr[1] * 20.0f) / f11);
        }
        return (f10 >= 0.0f ? f10 : 0.0f) * 0.5f;
    }

    @Override // ph.b
    public final int c(byte[] bArr, int i10) {
        int i11;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        while (i13 < i10) {
            byte b10 = bArr[i13];
            if (b10 == 62) {
                z10 = false;
            } else if (b10 == 60) {
                z10 = true;
            }
            if ((b10 & 128) == 0 && ((i11 = b10 & 255) < 65 || ((i11 > 90 && i11 < 97) || i11 > 122))) {
                if (i13 > i14 && !z10) {
                    byteBufferAllocate.put(bArr, i14, i13 - i14);
                    byteBufferAllocate.put((byte) 32);
                }
                i14 = i13 + 1;
            }
            i13++;
        }
        if (!z10 && i13 > i14) {
            byteBufferAllocate.put(bArr, i14, i13 - i14);
        }
        byte[] bArrArray = byteBufferAllocate.array();
        int iPosition = byteBufferAllocate.position();
        while (true) {
            if (i12 >= iPosition) {
                break;
            }
            byte b11 = f17199e[bArrArray[i12] & 255];
            byte b12 = f17200f[(this.f17202c * 8) + b11];
            if (b12 == 0) {
                this.f17201b = 3;
                break;
            }
            int[] iArr = this.f17203d;
            iArr[b12] = iArr[b12] + 1;
            this.f17202c = b11;
            i12++;
        }
        return this.f17201b;
    }

    @Override // ph.b
    public final void d() {
        this.f17201b = 1;
        this.f17202c = (byte) 1;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f17203d;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }
}
