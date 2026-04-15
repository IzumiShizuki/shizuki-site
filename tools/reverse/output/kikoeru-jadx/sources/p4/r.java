package p4;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f16606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16607e;

    public r() {
        this.f16603a = 0;
        this.f16606d = c0.f16553f;
    }

    public void a() {
        int i10;
        int i11;
        switch (this.f16603a) {
            case 0:
                int i12 = this.f16604b;
                c.i(i12 >= 0 && (i12 < (i10 = this.f16607e) || (i12 == i10 && this.f16605c == 0)));
                break;
            default:
                int i13 = this.f16605c;
                c.i(i13 >= 0 && (i13 < (i11 = this.f16604b) || (i13 == i11 && this.f16607e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f16607e - this.f16604b) * 8) - this.f16605c;
    }

    public void c() {
        if (this.f16605c == 0) {
            return;
        }
        this.f16605c = 0;
        this.f16604b++;
        a();
    }

    public boolean d(int i10) {
        int i11 = this.f16605c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f16607e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f16604b) {
                break;
            }
            if (r(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f16604b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean e() {
        int i10 = this.f16605c;
        int i11 = this.f16607e;
        int i12 = 0;
        while (this.f16605c < this.f16604b && !h()) {
            i12++;
        }
        boolean z10 = this.f16605c == this.f16604b;
        this.f16605c = i10;
        this.f16607e = i11;
        return !z10 && d((i12 * 2) + 1);
    }

    public int f() {
        c.i(this.f16605c == 0);
        return this.f16604b;
    }

    public int g() {
        return (this.f16604b * 8) + this.f16605c;
    }

    public boolean h() {
        switch (this.f16603a) {
            case 0:
                boolean z10 = (this.f16606d[this.f16604b] & (128 >> this.f16605c)) != 0;
                s();
                return z10;
            case 1:
            default:
                boolean z11 = (((this.f16606d[this.f16605c] & 255) >> this.f16607e) & 1) == 1;
                t(1);
                return z11;
            case 2:
                boolean z12 = (this.f16606d[this.f16605c] & (128 >> this.f16607e)) != 0;
                s();
                return z12;
        }
    }

    public int i(int i10) {
        switch (this.f16603a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                this.f16605c += i10;
                int i11 = 0;
                while (true) {
                    int i12 = this.f16605c;
                    if (i12 <= 8) {
                        byte[] bArr = this.f16606d;
                        int i13 = this.f16604b;
                        int i14 = ((-1) >>> (32 - i10)) & (i11 | ((bArr[i13] & 255) >> (8 - i12)));
                        if (i12 == 8) {
                            this.f16605c = 0;
                            this.f16604b = i13 + 1;
                        }
                        a();
                        return i14;
                    }
                    int i15 = i12 - 8;
                    this.f16605c = i15;
                    byte[] bArr2 = this.f16606d;
                    int i16 = this.f16604b;
                    this.f16604b = i16 + 1;
                    i11 |= (bArr2[i16] & 255) << i15;
                }
                break;
            case 1:
            default:
                int i17 = this.f16605c;
                int iMin = Math.min(i10, 8 - this.f16607e);
                byte[] bArr3 = this.f16606d;
                int i18 = i17 + 1;
                int i19 = ((bArr3[i17] & 255) >> this.f16607e) & (TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK >> (8 - iMin));
                while (iMin < i10) {
                    i19 |= (bArr3[i18] & 255) << iMin;
                    iMin += 8;
                    i18++;
                }
                int i20 = i19 & ((-1) >>> (32 - i10));
                t(i10);
                return i20;
            case 2:
                this.f16607e += i10;
                int i21 = 0;
                while (true) {
                    int i22 = this.f16607e;
                    if (i22 <= 8) {
                        byte[] bArr4 = this.f16606d;
                        int i23 = this.f16605c;
                        int i24 = ((-1) >>> (32 - i10)) & (i21 | ((bArr4[i23] & 255) >> (8 - i22)));
                        if (i22 == 8) {
                            this.f16607e = 0;
                            this.f16605c = i23 + (r(i23 + 1) ? 2 : 1);
                        }
                        a();
                        return i24;
                    }
                    int i25 = i22 - 8;
                    this.f16607e = i25;
                    byte[] bArr5 = this.f16606d;
                    int i26 = this.f16605c;
                    i21 |= (bArr5[i26] & 255) << i25;
                    if (!r(i26 + 1)) {
                        i = 1;
                    }
                    this.f16605c = i26 + i;
                }
                break;
        }
    }

    public void j(byte[] bArr, int i10) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f16606d;
            int i13 = this.f16604b;
            int i14 = i13 + 1;
            this.f16604b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f16605c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK >> i16));
        bArr[i11] = b12;
        int i17 = this.f16605c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f16606d;
            int i18 = this.f16604b;
            this.f16604b = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f16605c = i17 - 8;
        }
        int i19 = this.f16605c + i16;
        this.f16605c = i19;
        byte[] bArr4 = this.f16606d;
        int i20 = this.f16604b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f16605c = 0;
            this.f16604b = i20 + 1;
        }
        a();
    }

    public long k(int i10) {
        if (i10 <= 32) {
            int i11 = i(i10);
            int i12 = c0.f16548a;
            return 4294967295L & ((long) i11);
        }
        int i13 = i(i10 - 32);
        int i14 = i(32);
        int i15 = c0.f16548a;
        return (4294967295L & ((long) i14)) | ((((long) i13) & 4294967295L) << 32);
    }

    public void l(byte[] bArr, int i10) {
        c.i(this.f16605c == 0);
        System.arraycopy(this.f16606d, this.f16604b, bArr, 0, i10);
        this.f16604b += i10;
        a();
    }

    public int m() {
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? i(i10) : 0);
    }

    public int n() {
        int iM = m();
        return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
    }

    public void o(s sVar) {
        p(sVar.f16611a, sVar.f16613c);
        q(sVar.f16612b * 8);
    }

    public void p(byte[] bArr, int i10) {
        this.f16606d = bArr;
        this.f16604b = 0;
        this.f16605c = 0;
        this.f16607e = i10;
    }

    public void q(int i10) {
        int i11 = i10 / 8;
        this.f16604b = i11;
        this.f16605c = i10 - (i11 * 8);
        a();
    }

    public boolean r(int i10) {
        if (2 > i10 || i10 >= this.f16604b) {
            return false;
        }
        byte[] bArr = this.f16606d;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void s() {
        switch (this.f16603a) {
            case 0:
                int i10 = this.f16605c + 1;
                this.f16605c = i10;
                if (i10 == 8) {
                    this.f16605c = 0;
                    this.f16604b++;
                }
                a();
                break;
            default:
                int i11 = this.f16607e + 1;
                this.f16607e = i11;
                if (i11 == 8) {
                    this.f16607e = 0;
                    int i12 = this.f16605c;
                    this.f16605c = i12 + (r(i12 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i10) {
        int i11;
        switch (this.f16603a) {
            case 0:
                int i12 = i10 / 8;
                int i13 = this.f16604b + i12;
                this.f16604b = i13;
                int i14 = (i10 - (i12 * 8)) + this.f16605c;
                this.f16605c = i14;
                if (i14 > 7) {
                    this.f16604b = i13 + 1;
                    this.f16605c = i14 - 8;
                }
                a();
                break;
            case 1:
            default:
                int i15 = i10 / 8;
                int i16 = this.f16605c + i15;
                this.f16605c = i16;
                int i17 = (i10 - (i15 * 8)) + this.f16607e;
                this.f16607e = i17;
                boolean z10 = true;
                if (i17 > 7) {
                    this.f16605c = i16 + 1;
                    this.f16607e = i17 - 8;
                }
                int i18 = this.f16605c;
                if (i18 < 0 || (i18 >= (i11 = this.f16604b) && (i18 != i11 || this.f16607e != 0))) {
                    z10 = false;
                }
                c.i(z10);
                break;
            case 2:
                int i19 = this.f16605c;
                int i20 = i10 / 8;
                int i21 = i19 + i20;
                this.f16605c = i21;
                int i22 = (i10 - (i20 * 8)) + this.f16607e;
                this.f16607e = i22;
                if (i22 > 7) {
                    this.f16605c = i21 + 1;
                    this.f16607e = i22 - 8;
                }
                while (true) {
                    i19++;
                    if (i19 > this.f16605c) {
                        a();
                        break;
                    } else if (r(i19)) {
                        this.f16605c++;
                        i19 += 2;
                    }
                }
                break;
        }
    }

    public void u(int i10) {
        c.i(this.f16605c == 0);
        this.f16604b += i10;
        a();
    }

    public r(byte[] bArr) {
        this.f16603a = 3;
        this.f16606d = bArr;
        this.f16604b = bArr.length;
    }

    public r(byte[] bArr, int i10, int i11) {
        this.f16603a = 2;
        this.f16606d = bArr;
        this.f16605c = i10;
        this.f16604b = i11;
        this.f16607e = 0;
        a();
    }

    public r(byte[] bArr, int i10) {
        this.f16603a = 0;
        this.f16606d = bArr;
        this.f16607e = i10;
    }

    public r(int i10, int i11) {
        this.f16603a = 1;
        this.f16604b = i10;
        this.f16605c = i11;
        this.f16606d = new byte[(i11 * 2) - 1];
        this.f16607e = 0;
    }
}
