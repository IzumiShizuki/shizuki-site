package l6;

import android.util.Pair;
import com.tencent.bugly.beta.tinker.TinkerReport;
import j5.x0;
import java.nio.charset.StandardCharsets;
import m4.o0;
import m4.p0;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f11741a;

    static {
        int i10 = c0.f16548a;
        f11741a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static x0 a(int i10, p4.s sVar) {
        sVar.G(i10 + 12);
        sVar.H(1);
        b(sVar);
        sVar.H(2);
        int iU = sVar.u();
        if ((iU & 128) != 0) {
            sVar.H(2);
        }
        if ((iU & 64) != 0) {
            sVar.H(sVar.u());
        }
        if ((iU & 32) != 0) {
            sVar.H(2);
        }
        sVar.H(1);
        b(sVar);
        String strF = o0.f(sVar.u());
        if ("audio/mpeg".equals(strF) || "audio/vnd.dts".equals(strF) || "audio/vnd.dts.hd".equals(strF)) {
            return new x0(strF, null, -1L, -1L);
        }
        sVar.H(4);
        long jW = sVar.w();
        long jW2 = sVar.w();
        sVar.H(1);
        int iB = b(sVar);
        long j10 = jW2;
        byte[] bArr = new byte[iB];
        sVar.e(bArr, 0, iB);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new x0(strF, bArr, j10, jW > 0 ? jW : -1L);
    }

    public static int b(p4.s sVar) {
        int iU = sVar.u();
        int i10 = iU & 127;
        while ((iU & 128) == 128) {
            iU = sVar.u();
            i10 = (i10 << 7) | (iU & 127);
        }
        return i10;
    }

    public static int c(int i10) {
        return (i10 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK;
    }

    public static q4.f d(p4.s sVar) {
        long jO;
        long jO2;
        sVar.G(8);
        if (c(sVar.g()) == 0) {
            jO = sVar.w();
            jO2 = sVar.w();
        } else {
            jO = sVar.o();
            jO2 = sVar.o();
        }
        return new q4.f(jO, jO2, sVar.w());
    }

    public static Pair e(p4.s sVar, int i10, int i11) throws p0 {
        Integer num;
        r rVar;
        Pair pairCreate;
        int i12;
        int i13;
        Integer num2;
        boolean z10;
        int i14 = sVar.f16612b;
        while (i14 - i10 < i11) {
            sVar.G(i14);
            int iG = sVar.g();
            r5.b.c("childAtomSize must be positive", iG > 0);
            if (sVar.g() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = -1;
                Integer numValueOf = null;
                String strS = null;
                int i17 = 0;
                while (i15 - i14 < iG) {
                    sVar.G(i15);
                    int iG2 = sVar.g();
                    int iG3 = sVar.g();
                    if (iG3 == 1718775137) {
                        numValueOf = Integer.valueOf(sVar.g());
                    } else if (iG3 == 1935894637) {
                        sVar.H(4);
                        strS = sVar.s(4, StandardCharsets.UTF_8);
                    } else if (iG3 == 1935894633) {
                        i16 = i15;
                        i17 = iG2;
                    }
                    i15 += iG2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strS) || "cbc1".equals(strS) || "cens".equals(strS) || "cbcs".equals(strS)) {
                    r5.b.c("frma atom is mandatory", numValueOf != null);
                    r5.b.c("schi atom is mandatory", i16 != -1);
                    int i18 = i16 + 8;
                    while (true) {
                        if (i18 - i16 >= i17) {
                            num = numValueOf;
                            rVar = null;
                            break;
                        }
                        sVar.G(i18);
                        int iG4 = sVar.g();
                        if (sVar.g() == 1952804451) {
                            int iC = c(sVar.g());
                            sVar.H(1);
                            if (iC == 0) {
                                sVar.H(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iU = sVar.u();
                                i12 = iU & 15;
                                i13 = (iU & 240) >> 4;
                            }
                            if (sVar.u() == 1) {
                                num2 = numValueOf;
                                z10 = true;
                            } else {
                                num2 = numValueOf;
                                z10 = false;
                            }
                            int iU2 = sVar.u();
                            byte[] bArr2 = new byte[16];
                            sVar.e(bArr2, 0, 16);
                            if (z10 && iU2 == 0) {
                                int iU3 = sVar.u();
                                byte[] bArr3 = new byte[iU3];
                                sVar.e(bArr3, 0, iU3);
                                bArr = bArr3;
                            }
                            num = num2;
                            rVar = new r(z10, strS, iU2, bArr2, i13, i12, bArr);
                        } else {
                            i18 += iG4;
                        }
                    }
                    r5.b.c("tenc atom is mandatory", rVar != null);
                    int i19 = c0.f16548a;
                    pairCreate = Pair.create(num, rVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iG;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x09af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ce.g f(p4.s r51, int r52, int r53, java.lang.String r54, m4.n r55, boolean r56) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 3390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.e.f(p4.s, int, int, java.lang.String, m4.n, boolean):ce.g");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
    
        r22 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bd, code lost:
    
        r13 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0601 A[ADDED_TO_REGION, LOOP:14: B:243:0x0601->B:247:0x060b, LOOP_START, PHI: r20
      0x0601: PHI (r20v10 int) = (r20v8 int), (r20v11 int) binds: [B:242:0x05ff, B:247:0x060b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x05f4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList g(q4.b r73, r5.v r74, long r75, m4.n r77, boolean r78, boolean r79, xa.d r80) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 2364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.e.g(q4.b, r5.v, long, m4.n, boolean, boolean, xa.d):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:218:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(p4.s r50, int r51, int r52, int r53, int r54, int r55, m4.n r56, ce.g r57, int r58) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 2451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.e.h(p4.s, int, int, int, int, int, m4.n, ce.g, int):void");
    }
}
