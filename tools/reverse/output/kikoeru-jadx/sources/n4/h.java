package n4;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f15287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f15288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f15290l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15291m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f15292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15298t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15299u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15300v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f15301w;

    public h(float f10, float f11, int i10, int i11, int i12) {
        this.f15279a = i10;
        this.f15280b = i11;
        this.f15281c = f10;
        this.f15282d = f11;
        this.f15283e = i10 / i12;
        this.f15284f = i10 / TinkerReport.KEY_LOADED_SUCC_COST_500_LESS;
        int i13 = i10 / 65;
        this.f15285g = i13;
        int i14 = i13 * 2;
        this.f15286h = i14;
        this.f15287i = new short[i14];
        this.f15288j = new short[i14 * i11];
        this.f15290l = new short[i14 * i11];
        this.f15292n = new short[i14 * i11];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] sArrC = c(this.f15290l, this.f15291m, i11);
        this.f15290l = sArrC;
        int i12 = this.f15280b;
        System.arraycopy(sArr, i10 * i12, sArrC, this.f15291m * i12, i12 * i11);
        this.f15291m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f15286h / i11;
        int i13 = this.f15280b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f15287i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f15280b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f15280b;
        int i14 = TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f15299u = i15 / i16;
        this.f15300v = i17 / i14;
        return i16;
    }

    public final void f() {
        float f10;
        double d10;
        int iD;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        long j11;
        int i17 = this.f15291m;
        float f11 = this.f15281c;
        float f12 = this.f15282d;
        double d11 = f11 / f12;
        float f13 = this.f15283e * f12;
        int i18 = this.f15279a;
        int i19 = 1;
        int i20 = this.f15280b;
        int i21 = 0;
        if (d11 > 1.0000100135803223d || d11 < 0.9999899864196777d) {
            int i22 = this.f15289k;
            int i23 = this.f15286h;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.f15296r;
                    if (i25 > 0) {
                        int iMin = Math.min(i23, i25);
                        a(this.f15288j, i24, iMin);
                        this.f15296r -= iMin;
                        i24 += iMin;
                        f10 = f13;
                        d10 = d11;
                    } else {
                        short[] sArr = this.f15288j;
                        int i26 = i18 > 4000 ? i18 / 4000 : 1;
                        int i27 = this.f15285g;
                        int i28 = this.f15284f;
                        if (i20 == i19 && i26 == i19) {
                            iD = d(sArr, i24, i28, i27);
                            f10 = f13;
                            d10 = d11;
                        } else {
                            b(sArr, i24, i26);
                            f10 = f13;
                            d10 = d11;
                            short[] sArr2 = this.f15287i;
                            int iD2 = d(sArr2, i21, i28 / i26, i27 / i26);
                            if (i26 != 1) {
                                int i29 = iD2 * i26;
                                int i30 = i26 * 4;
                                int i31 = i29 - i30;
                                int i32 = i29 + i30;
                                if (i31 >= i28) {
                                    i28 = i31;
                                }
                                if (i32 <= i27) {
                                    i27 = i32;
                                }
                                if (i20 == 1) {
                                    iD = d(sArr, i24, i28, i27);
                                } else {
                                    b(sArr, i24, 1);
                                    iD = d(sArr2, i21, i28, i27);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i33 = this.f15299u;
                        int i34 = this.f15300v;
                        if (i33 == 0 || (i10 = this.f15297s) == 0 || i34 > i33 * 3 || i33 * 2 <= this.f15298t * 3) {
                            i10 = iD;
                        }
                        this.f15298t = i33;
                        this.f15297s = iD;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.f15288j;
                            if (d10 >= 2.0d) {
                                i12 = i24;
                                double d12 = (((double) i10) / (d10 - 1.0d)) + this.f15301w;
                                int iRound = (int) Math.round(d12);
                                this.f15301w = d12 - ((double) iRound);
                                i13 = iRound;
                            } else {
                                i12 = i24;
                                double d13 = (((2.0d - d10) * ((double) i10)) / (d10 - 1.0d)) + this.f15301w;
                                int iRound2 = (int) Math.round(d13);
                                this.f15296r = iRound2;
                                this.f15301w = d13 - ((double) iRound2);
                                i13 = i10;
                            }
                            short[] sArrC = c(this.f15290l, this.f15291m, i13);
                            this.f15290l = sArrC;
                            int i35 = i12;
                            e(i13, this.f15280b, sArrC, this.f15291m, sArr3, i35, sArr3, i35 + i10);
                            this.f15291m += i13;
                            i24 = i10 + i13 + i35;
                        } else {
                            int i36 = i24;
                            short[] sArr4 = this.f15288j;
                            if (d10 < 0.5d) {
                                double d14 = ((((double) i10) * d10) / (1.0d - d10)) + this.f15301w;
                                int iRound3 = (int) Math.round(d14);
                                this.f15301w = d14 - ((double) iRound3);
                                i11 = iRound3;
                            } else {
                                double d15 = ((((2.0d * d10) - 1.0d) * ((double) i10)) / (1.0d - d10)) + this.f15301w;
                                int iRound4 = (int) Math.round(d15);
                                this.f15296r = iRound4;
                                this.f15301w = d15 - ((double) iRound4);
                                i11 = i10;
                            }
                            int i37 = i10 + i11;
                            short[] sArrC2 = c(this.f15290l, this.f15291m, i37);
                            this.f15290l = sArrC2;
                            System.arraycopy(sArr4, i36 * i20, sArrC2, this.f15291m * i20, i10 * i20);
                            e(i11, this.f15280b, this.f15290l, this.f15291m + i10, sArr4, i36 + i10, sArr4, i36);
                            this.f15291m += i37;
                            i24 = i36 + i11;
                        }
                    }
                    if (i24 + i23 > i22) {
                        break;
                    }
                    f13 = f10;
                    d11 = d10;
                    i19 = 1;
                    i21 = 0;
                }
                int i38 = this.f15289k - i24;
                short[] sArr5 = this.f15288j;
                System.arraycopy(sArr5, i24 * i20, sArr5, 0, i38 * i20);
                this.f15289k = i38;
            }
            if (f10 != 1.0f || this.f15291m == i17) {
            }
            long j12 = (long) (i18 / f10);
            long j13 = i18;
            while (j12 != 0 && j13 != 0 && j12 % 2 == 0 && j13 % 2 == 0) {
                j12 /= 2;
                j13 /= 2;
            }
            int i39 = this.f15291m - i17;
            short[] sArrC3 = c(this.f15292n, this.f15293o, i39);
            this.f15292n = sArrC3;
            System.arraycopy(this.f15290l, i17 * i20, sArrC3, this.f15293o * i20, i39 * i20);
            this.f15291m = i17;
            this.f15293o += i39;
            int i40 = 0;
            while (true) {
                i14 = this.f15293o;
                i15 = i14 - 1;
                if (i40 >= i15) {
                    break;
                }
                while (true) {
                    i16 = this.f15294p + 1;
                    j10 = i16;
                    long j14 = j10 * j12;
                    j11 = this.f15295q;
                    if (j14 <= j11 * j13) {
                        break;
                    }
                    this.f15290l = c(this.f15290l, this.f15291m, 1);
                    int i41 = 0;
                    while (i41 < i20) {
                        short[] sArr6 = this.f15290l;
                        int i42 = (this.f15291m * i20) + i41;
                        short[] sArr7 = this.f15292n;
                        int i43 = (i40 * i20) + i41;
                        short s10 = sArr7[i43];
                        short s11 = sArr7[i43 + i20];
                        long j15 = ((long) this.f15295q) * j13;
                        int i44 = this.f15294p;
                        int i45 = i40;
                        long j16 = ((long) (i44 + 1)) * j12;
                        long j17 = j16 - j15;
                        long j18 = j16 - (((long) i44) * j12);
                        sArr6[i42] = (short) ((((j18 - j17) * ((long) s11)) + (((long) s10) * j17)) / j18);
                        i41++;
                        i40 = i45;
                    }
                    this.f15295q++;
                    this.f15291m++;
                    i40 = i40;
                }
                int i46 = i40;
                this.f15294p = i16;
                if (j10 == j13) {
                    this.f15294p = 0;
                    p4.c.i(j11 == j12);
                    this.f15295q = 0;
                }
                i40 = i46 + 1;
            }
            if (i15 == 0) {
                return;
            }
            short[] sArr8 = this.f15292n;
            System.arraycopy(sArr8, i15 * i20, sArr8, 0, (i14 - i15) * i20);
            this.f15293o -= i15;
            return;
        }
        a(this.f15288j, 0, this.f15289k);
        this.f15289k = 0;
        f10 = f13;
        if (f10 != 1.0f) {
        }
    }
}
