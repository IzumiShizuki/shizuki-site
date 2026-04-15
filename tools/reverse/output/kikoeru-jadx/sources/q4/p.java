package q4;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.j1;
import java.util.Arrays;
import java.util.Objects;
import m4.o0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f17770a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f17771b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17772c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f17773d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        p4.c.i(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static boolean c(byte[] bArr, int i10, m4.q qVar) {
        int i11;
        if (Objects.equals(qVar.f14544n, "video/avc")) {
            byte b10 = bArr[4];
            if (((b10 & 96) >> 5) == 0 && ((i11 = b10 & 31) == 1 || i11 == 9 || i11 == 14)) {
                return false;
            }
        } else if (Objects.equals(qVar.f14544n, "video/hevc")) {
            j1 j1VarE = e(new p4.r(bArr, 4, i10 + 4));
            int i12 = j1VarE.f9176a;
            if (i12 == 35) {
                return false;
            }
            if (i12 <= 14 && i12 % 2 == 0 && j1VarE.f9178c == qVar.C - 1) {
                return false;
            }
        }
        return true;
    }

    public static int d(m4.q qVar) {
        if (Objects.equals(qVar.f14544n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(qVar.f14544n, "video/hevc") || o0.c(qVar.f14541k, "video/hevc") != null) ? 2 : 0;
    }

    public static j1 e(p4.r rVar) {
        rVar.s();
        return new j1(rVar.i(6), rVar.i(6), rVar.i(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q4.h f(p4.r r19, boolean r20, int r21, q4.h r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.i(r5)
            boolean r8 = r0.h()
            r9 = 5
            int r9 = r0.i(r9)
            r10 = 0
            r11 = 0
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.h()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = 0
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.i(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f17721a
            boolean r8 = r2.f17722b
            int r9 = r2.f17723c
            int r11 = r2.f17724d
            int[] r4 = r2.f17725e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L57:
            int r18 = r0.i(r6)
            r2 = 0
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.h()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.h()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.t(r2)
            if (r1 <= 0) goto L7c
            int r6 = r6 - r1
            int r6 = r6 * 2
            r0.t(r6)
        L7c:
            q4.h r12 = new q4.h
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.p.f(p4.r, boolean, int, q4.h):q4.h");
    }

    public static k g(byte[] bArr, int i10, int i11) {
        byte b10;
        int i12 = i10 + 2;
        do {
            i11--;
            b10 = bArr[i11];
            if (b10 != 0) {
                break;
            }
        } while (i11 > i12);
        if (b10 == 0 || i11 <= i12) {
            return null;
        }
        p4.r rVar = new p4.r(bArr, i12, i11 + 1);
        while (rVar.d(16)) {
            int i13 = rVar.i(8);
            int i14 = 0;
            while (i13 == 255) {
                i14 += TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
                i13 = rVar.i(8);
            }
            int i15 = i14 + i13;
            int i16 = rVar.i(8);
            int i17 = 0;
            while (i16 == 255) {
                i17 += TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
                i16 = rVar.i(8);
            }
            int i18 = i17 + i16;
            if (i18 == 0 || !rVar.d(i18)) {
                return null;
            }
            if (i15 == 176) {
                int iM = rVar.m();
                boolean zH = rVar.h();
                int iM2 = zH ? rVar.m() : 0;
                int iM3 = rVar.m();
                int iM4 = -1;
                for (int i19 = 0; i19 <= iM3; i19++) {
                    iM4 = rVar.m();
                    rVar.m();
                    int i20 = rVar.i(6);
                    if (i20 == 63) {
                        return null;
                    }
                    rVar.i(i20 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i20 + iM) - 31));
                    if (zH) {
                        int i21 = rVar.i(6);
                        if (i21 == 63) {
                            return null;
                        }
                        rVar.i(i21 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i21 + iM2) - 31));
                    }
                    if (rVar.h()) {
                        rVar.t(10);
                    }
                }
                return new k(iM4);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q4.l h(byte[] r30, int r31, int r32, b0.w1 r33) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.p.h(byte[], int, int, b0.w1):q4.l");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b0.w1 i(byte[] r40, int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 2131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.p.i(byte[], int, int):b0.w1");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q4.o j(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.p.j(byte[], int, int):q4.o");
    }

    public static void k(p4.r rVar) {
        int iM = rVar.m() + 1;
        rVar.t(8);
        for (int i10 = 0; i10 < iM; i10++) {
            rVar.m();
            rVar.m();
            rVar.s();
        }
        rVar.t(20);
    }

    public static int l(byte[] bArr, int i10) {
        int i11;
        synchronized (f17772c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f17773d;
                    if (iArr.length <= i13) {
                        f17773d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f17773d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f17773d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
