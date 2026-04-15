package r5;

import android.util.Base64;
import b7.c3;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m4.n0;
import m4.p0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f18752a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f18753b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f18754c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f18755d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f18756e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f18757f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f18758g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f18759h = {69, 87, 104, TinkerReport.KEY_APPLIED_DEXOPT_OTHER, 139, 174, TinkerReport.KEY_APPLIED_FAIL_COST_60S_LESS, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f18760i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, TinkerReport.KEY_LOADED_SUCC_COST_500_LESS, TinkerReport.KEY_LOADED_SUCC_COST_500_LESS, 2048};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f18761j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f18762k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f18763l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f18764m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f18765n = {5, 8, 10, 12};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f18766o = {6, 9, 12, 15};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f18767p = {2, 4, 6, 8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f18768q = {9, 11, 13, 16};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f18769r = {5, 8, 10, 12};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f18770s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f18771t = {44100, 48000, 32000};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f18772u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f18773v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f18774w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f18775x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f18776y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static ArrayList a(byte[] bArr) {
        long j10 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(p4.s r19, r5.t r20, int r21, b0.a r22) {
        /*
            r0 = r19
            r1 = r20
            int r2 = r0.f16612b
            long r3 = r0.w()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r21
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L18
            goto Lc3
        L18:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L22
            r5 = 1
            goto L23
        L22:
            r5 = 0
        L23:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            r17 = r7
            long r7 = r15 & r13
            int r8 = (int) r7
            r7 = 4
            long r15 = r3 >> r7
            long r13 = r13 & r15
            int r7 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r11 = (int) r13
            long r3 = r3 & r17
            int r13 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r13 != 0) goto L47
            r3 = 1
            goto L48
        L47:
            r3 = 0
        L48:
            r4 = 7
            if (r7 > r4) goto L51
            int r4 = r1.f18870g
            int r4 = r4 - r10
            if (r7 != r4) goto Lc3
            goto L5a
        L51:
            r4 = 10
            if (r7 > r4) goto Lc3
            int r4 = r1.f18870g
            r7 = 2
            if (r4 != r7) goto Lc3
        L5a:
            if (r11 != 0) goto L5d
            goto L61
        L5d:
            int r4 = r1.f18872i
            if (r11 != r4) goto Lc3
        L61:
            if (r3 != 0) goto Lc3
            long r3 = r0.B()     // Catch: java.lang.NumberFormatException -> Lc3
            if (r5 == 0) goto L6c
        L69:
            r5 = r22
            goto L72
        L6c:
            int r5 = r1.f18865b
            long r13 = (long) r5
            long r3 = r3 * r13
            goto L69
        L72:
            r5.f1169a = r3
            int r3 = s(r12, r0)
            r4 = -1
            if (r3 == r4) goto Lc3
            int r4 = r1.f18865b
            if (r3 > r4) goto Lc3
            int r3 = r1.f18868e
            if (r8 != 0) goto L84
            goto La6
        L84:
            r4 = 11
            if (r8 > r4) goto L8d
            int r1 = r1.f18869f
            if (r8 != r1) goto Lc3
            goto La6
        L8d:
            if (r8 != r6) goto L98
            int r1 = r0.u()
            int r1 = r1 * 1000
            if (r1 != r3) goto Lc3
            goto La6
        L98:
            r1 = 14
            if (r8 > r1) goto Lc3
            int r4 = r0.A()
            if (r8 != r1) goto La4
            int r4 = r4 * 10
        La4:
            if (r4 != r3) goto Lc3
        La6:
            int r1 = r0.u()
            int r3 = r0.f16612b
            byte[] r0 = r0.f16611a
            int r3 = r3 - r10
            r4 = 0
        Lb0:
            if (r2 >= r3) goto Lbe
            int[] r5 = p4.c0.f16564q
            r6 = r0[r2]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r4 = r4 ^ r6
            r4 = r5[r4]
            int r2 = r2 + 1
            goto Lb0
        Lbe:
            int r0 = p4.c0.f16548a
            if (r1 != r4) goto Lc3
            return r10
        Lc3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.b.b(p4.s, r5.t, int, b0.a):boolean");
    }

    public static void c(String str, boolean z10) throws p0 {
        if (!z10) {
            throw p0.a(null, str);
        }
    }

    public static void d(long j10, p4.s sVar, h0[] h0VarArr) {
        int i10;
        while (true) {
            if (sVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (sVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int iU = sVar.u();
                i11 += iU;
                if (iU != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            while (true) {
                if (sVar.a() == 0) {
                    i12 = -1;
                    break;
                }
                int iU2 = sVar.u();
                i12 += iU2;
                if (iU2 != 255) {
                    break;
                }
            }
            int i13 = sVar.f16612b + i12;
            if (i12 == -1 || i12 > sVar.a()) {
                p4.c.B("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = sVar.f16613c;
            } else if (i10 == 4 && i12 >= 8) {
                int iU3 = sVar.u();
                int iA = sVar.A();
                int iG = iA == 49 ? sVar.g() : 0;
                int iU4 = sVar.u();
                if (iA == 47) {
                    sVar.H(1);
                }
                boolean z10 = iU3 == 181 && (iA == 49 || iA == 47) && iU4 == 3;
                if (iA == 49) {
                    z10 &= iG == 1195456820;
                }
                if (z10) {
                    e(j10, sVar, h0VarArr);
                }
            }
            sVar.G(i13);
        }
    }

    public static void e(long j10, p4.s sVar, h0[] h0VarArr) {
        int iU = sVar.u();
        if ((iU & 64) != 0) {
            sVar.H(1);
            int i10 = (iU & 31) * 3;
            int i11 = sVar.f16612b;
            for (h0 h0Var : h0VarArr) {
                sVar.G(i11);
                h0Var.e(i10, sVar);
                p4.c.i(j10 != -9223372036854775807L);
                h0Var.a(j10, 1, i10, 0, null);
            }
        }
    }

    public static int f(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f18755d[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + f18759h[i12]) * 2;
        }
        int i14 = f18758g[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static void g(int i10, p4.s sVar) {
        sVar.D(7);
        byte[] bArr = sVar.f16611a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        bArr[5] = (byte) ((i10 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        bArr[6] = (byte) (i10 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
    }

    public static int h(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f18771t[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f18772u[i13 - 1] : f18773v[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f18774w[i13 - 1] : f18775x[i13 - 1] : f18776y[i13 - 1];
        if (i11 == 3) {
            return ((i17 * 144) / i15) + i16;
        }
        return (((i12 == 1 ? 72 : 144) * i17) / i15) + i16;
    }

    public static p4.r i(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new p4.r(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        p4.r rVar = new p4.r(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            p4.r rVar2 = new p4.r(bArrCopyOf, bArrCopyOf.length);
            while (rVar2.b() >= 16) {
                rVar2.t(2);
                int i12 = rVar2.i(14) & 16383;
                int iMin = Math.min(8 - rVar.f16605c, 14);
                int i13 = rVar.f16605c;
                int i14 = (8 - i13) - iMin;
                byte[] bArr2 = rVar.f16606d;
                int i15 = rVar.f16604b;
                byte b13 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr2[i15]);
                bArr2[i15] = b13;
                int i16 = 14 - iMin;
                bArr2[i15] = (byte) (b13 | ((i12 >>> i16) << i14));
                int i17 = i15 + 1;
                while (i16 > 8) {
                    rVar.f16606d[i17] = (byte) (i12 >>> (i16 - 8));
                    i16 -= 8;
                    i17++;
                }
                int i18 = 8 - i16;
                byte[] bArr3 = rVar.f16606d;
                byte b14 = (byte) (bArr3[i17] & ((1 << i18) - 1));
                bArr3[i17] = b14;
                bArr3[i17] = (byte) (((i12 & ((1 << i16) - 1)) << i18) | b14);
                rVar.t(14);
                rVar.a();
            }
        }
        rVar.p(bArrCopyOf, bArrCopyOf.length);
        return rVar;
    }

    public static long j(byte b10, byte b11) {
        int i10;
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b11 & 63;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        return ((long) i10) * ((long) (i13 >= 16 ? 2500 << i14 : i13 >= 12 ? 10000 << (i13 & 1) : i14 == 3 ? 60000 : 10000 << i14));
    }

    public static int k(p4.r rVar) throws p0 {
        int i10 = rVar.i(4);
        if (i10 == 15) {
            if (rVar.b() >= 24) {
                return rVar.i(24);
            }
            throw p0.a(null, "AAC header insufficient data");
        }
        if (i10 < 13) {
            return f18752a[i10];
        }
        throw p0.a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i7.j1 l(p4.r r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L57
            r5 = 48000(0xbb80, float:6.7262E-41)
            goto L5a
        L57:
            r5 = 44100(0xac44, float:6.1797E-41)
        L5a:
            int r9 = r9.i(r3)
            int[] r8 = r5.b.f18760i
            if (r5 != r6) goto L69
            r6 = 13
            if (r9 != r6) goto L69
            r9 = r8[r9]
            goto L97
        L69:
            if (r5 != r7) goto L96
            r6 = 14
            if (r9 >= r6) goto L96
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8f
            r8 = 11
            if (r2 == r1) goto L8a
            if (r2 == r4) goto L8f
            if (r2 == r3) goto L81
            goto L94
        L81:
            if (r9 == r4) goto L87
            if (r9 == r7) goto L87
            if (r9 != r8) goto L94
        L87:
            int r9 = r6 + 1
            goto L97
        L8a:
            if (r9 == r7) goto L87
            if (r9 != r8) goto L94
            goto L87
        L8f:
            if (r9 == r4) goto L87
            if (r9 != r7) goto L94
            goto L87
        L94:
            r9 = r6
            goto L97
        L96:
            r9 = 0
        L97:
            i7.j1 r1 = new i7.j1
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.b.l(p4.r):i7.j1");
    }

    public static a m(p4.r rVar, boolean z10) throws p0 {
        int i10 = rVar.i(5);
        if (i10 == 31) {
            i10 = rVar.i(6) + 32;
        }
        int iK = k(rVar);
        int i11 = rVar.i(4);
        String strB = t0.B(i10, "mp4a.40.");
        if (i10 == 5 || i10 == 29) {
            iK = k(rVar);
            int i12 = rVar.i(5);
            if (i12 == 31) {
                i12 = rVar.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = rVar.i(4);
            }
        }
        if (z10) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw p0.c("Unsupported audio object type: " + i10);
                }
            }
            if (rVar.h()) {
                p4.c.B("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (rVar.h()) {
                rVar.t(14);
            }
            boolean zH = rVar.h();
            if (i11 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i10 == 6 || i10 == 20) {
                rVar.t(3);
            }
            if (zH) {
                if (i10 == 22) {
                    rVar.t(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    rVar.t(3);
                }
                rVar.t(1);
            }
            switch (i10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i13 = rVar.i(2);
                    if (i13 == 2 || i13 == 3) {
                        throw p0.c("Unsupported epConfig: " + i13);
                    }
                    break;
            }
        }
        int i14 = f18753b[i11];
        if (i14 != -1) {
            return new a(iK, i14, strB);
        }
        throw p0.a(null, null);
    }

    public static void n(p4.r rVar, c cVar) throws p0 {
        int i10 = rVar.i(5);
        rVar.t(2);
        if (rVar.h()) {
            rVar.t(5);
        }
        if (i10 >= 7 && i10 <= 10) {
            rVar.s();
        }
        if (rVar.h()) {
            int i11 = rVar.i(3);
            if (cVar.f18777a == -1 && i10 >= 0 && i10 <= 15 && (i11 == 0 || i11 == 1)) {
                cVar.f18777a = i10;
            }
            if (rVar.h()) {
                v(rVar);
            }
        }
    }

    public static void o(p4.r rVar, c cVar) throws p0 {
        rVar.t(2);
        boolean zH = rVar.h();
        int i10 = rVar.i(8);
        for (int i11 = 0; i11 < i10; i11++) {
            rVar.t(2);
            if (rVar.h()) {
                rVar.t(5);
            }
            if (zH) {
                rVar.t(24);
            } else {
                if (rVar.h()) {
                    if (!rVar.h()) {
                        rVar.t(4);
                    }
                    cVar.f18778b = rVar.i(6) + 1;
                }
                rVar.t(4);
            }
        }
        if (rVar.h()) {
            rVar.t(3);
            if (rVar.h()) {
                v(rVar);
            }
        }
    }

    public static int p(p4.r rVar, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && rVar.h(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return rVar.i(iArr[i10]) + i12;
    }

    public static n0 q(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = p4.c0.f16548a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                p4.c.B("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(d6.a.d(new p4.s(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    p4.c.C("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new i6.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new n0(arrayList);
    }

    public static n0 r(o oVar, boolean z10) throws Throwable {
        c3 c3Var = z10 ? null : f6.h.f6738c;
        p4.s sVar = new p4.s(10);
        n0 n0VarV = null;
        int i10 = 0;
        while (true) {
            try {
                oVar.z(sVar.f16611a, 0, 10);
                sVar.G(0);
                if (sVar.x() != 4801587) {
                    break;
                }
                sVar.H(3);
                int iT = sVar.t();
                int i11 = iT + 10;
                if (n0VarV == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(sVar.f16611a, 0, bArr, 0, 10);
                    oVar.z(bArr, 10, iT);
                    n0VarV = new f6.h(c3Var).V(bArr, i11);
                } else {
                    oVar.k(iT);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        oVar.q();
        oVar.k(i10);
        if (n0VarV == null || n0VarV.f14409a.length == 0) {
            return null;
        }
        return n0VarV;
    }

    public static int s(int i10, p4.s sVar) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return sVar.u() + 1;
            case 7:
                return sVar.A() + 1;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static m0.w t(p4.s sVar) {
        sVar.H(1);
        int iX = sVar.x();
        long j10 = ((long) sVar.f16612b) + ((long) iX);
        int i10 = iX / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jO = sVar.o();
            if (jO == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jO;
            jArrCopyOf2[i11] = sVar.o();
            sVar.H(2);
            i11++;
        }
        sVar.H((int) (j10 - ((long) sVar.f16612b)));
        return new m0.w(14, jArrCopyOf, jArrCopyOf2);
    }

    public static ba.x u(p4.s sVar, boolean z10, boolean z11) throws p0 {
        if (z10) {
            w(3, sVar, false);
        }
        sVar.s((int) sVar.l(), StandardCharsets.UTF_8);
        long jL = sVar.l();
        String[] strArr = new String[(int) jL];
        for (int i10 = 0; i10 < jL; i10++) {
            strArr[i10] = sVar.s((int) sVar.l(), StandardCharsets.UTF_8);
        }
        if (z11 && (sVar.u() & 1) == 0) {
            throw p0.a(null, "framing bit expected to be set");
        }
        return new ba.x(strArr, 1);
    }

    public static void v(p4.r rVar) throws p0 {
        int i10 = rVar.i(6);
        if (i10 < 2 || i10 > 42) {
            throw p0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i10)));
        }
        rVar.t(i10 * 8);
    }

    public static boolean w(int i10, p4.s sVar, boolean z10) throws p0 {
        if (sVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw p0.a(null, "too short header: " + sVar.a());
        }
        if (sVar.u() != i10) {
            if (z10) {
                return false;
            }
            throw p0.a(null, "expected header type " + Integer.toHexString(i10));
        }
        if (sVar.u() == 118 && sVar.u() == 111 && sVar.u() == 114 && sVar.u() == 98 && sVar.u() == 105 && sVar.u() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw p0.a(null, "expected characters 'vorbis'");
    }
}
