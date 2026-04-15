package f6;

import b7.c3;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import m4.n0;
import m4.o0;
import p4.c0;
import p4.r;
import p4.s;
import ya.a1;
import ya.f0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends gh.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c3 f6738c = new c3(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f6739b;

    public h(c3 c3Var) {
        this.f6739b = c3Var;
    }

    public static a W(s sVar, int i10, int i11) {
        int iO0;
        String strConcat;
        int iU = sVar.u();
        Charset charsetL0 = l0(iU);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        sVar.e(bArr, 0, i12);
        if (i11 == 2) {
            strConcat = "image/" + ud.e.c0(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iO0 = 2;
        } else {
            iO0 = o0(bArr, 0);
            String strC0 = ud.e.c0(new String(bArr, 0, iO0, StandardCharsets.ISO_8859_1));
            strConcat = strC0.indexOf(47) == -1 ? "image/".concat(strC0) : strC0;
        }
        int i13 = bArr[iO0 + 1] & 255;
        int i14 = iO0 + 2;
        int iN0 = n0(bArr, i14, iU);
        String str = new String(bArr, i14, iN0 - i14, charsetL0);
        int iK0 = k0(iU) + iN0;
        return new a(strConcat, str, i13, i12 <= iK0 ? c0.f16553f : Arrays.copyOfRange(bArr, iK0, i12));
    }

    public static c X(s sVar, int i10, int i11, boolean z10, int i12, c3 c3Var) throws Throwable {
        int i13 = sVar.f16612b;
        int iO0 = o0(sVar.f16611a, i13);
        String str = new String(sVar.f16611a, i13, iO0 - i13, StandardCharsets.ISO_8859_1);
        sVar.G(iO0 + 1);
        int iG = sVar.g();
        int iG2 = sVar.g();
        long jW = sVar.w();
        if (jW == 4294967295L) {
            jW = -1;
        }
        long jW2 = sVar.w();
        long j10 = jW2 == 4294967295L ? -1L : jW2;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (sVar.f16612b < i14) {
            i iVarA0 = a0(i11, sVar, z10, i12, c3Var);
            if (iVarA0 != null) {
                arrayList.add(iVarA0);
            }
        }
        return new c(str, iG, iG2, jW, j10, (i[]) arrayList.toArray(new i[0]));
    }

    public static d Y(s sVar, int i10, int i11, boolean z10, int i12, c3 c3Var) throws Throwable {
        int i13 = sVar.f16612b;
        int iO0 = o0(sVar.f16611a, i13);
        String str = new String(sVar.f16611a, i13, iO0 - i13, StandardCharsets.ISO_8859_1);
        sVar.G(iO0 + 1);
        int iU = sVar.u();
        boolean z11 = (iU & 2) != 0;
        boolean z12 = (iU & 1) != 0;
        int iU2 = sVar.u();
        String[] strArr = new String[iU2];
        for (int i14 = 0; i14 < iU2; i14++) {
            int i15 = sVar.f16612b;
            int iO02 = o0(sVar.f16611a, i15);
            strArr[i14] = new String(sVar.f16611a, i15, iO02 - i15, StandardCharsets.ISO_8859_1);
            sVar.G(iO02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (sVar.f16612b < i16) {
            i iVarA0 = a0(i11, sVar, z10, i12, c3Var);
            if (iVarA0 != null) {
                arrayList.add(iVarA0);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e Z(int i10, s sVar) {
        if (i10 < 4) {
            return null;
        }
        int iU = sVar.u();
        Charset charsetL0 = l0(iU);
        byte[] bArr = new byte[3];
        sVar.e(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        sVar.e(bArr2, 0, i11);
        int iN0 = n0(bArr2, 0, iU);
        String str2 = new String(bArr2, 0, iN0, charsetL0);
        int iK0 = k0(iU) + iN0;
        return new e(str, str2, e0(bArr2, iK0, n0(bArr2, iK0, iU), charsetL0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x020d A[Catch: all -> 0x012c, Exception -> 0x012f, OutOfMemoryError -> 0x0132, TRY_LEAVE, TryCatch #3 {Exception -> 0x012f, OutOfMemoryError -> 0x0132, all -> 0x012c, blocks: (B:107:0x0126, B:115:0x0137, B:122:0x014d, B:124:0x0155, B:132:0x016f, B:141:0x0187, B:152:0x01a2, B:159:0x01b4, B:182:0x01f3, B:190:0x0208, B:191:0x020d), top: B:205:0x011c }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x022f  */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f6.i a0(int r19, p4.s r20, boolean r21, int r22, b7.c3 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.h.a0(int, p4.s, boolean, int, b7.c3):f6.i");
    }

    public static f b0(int i10, s sVar) {
        int iU = sVar.u();
        Charset charsetL0 = l0(iU);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        sVar.e(bArr, 0, i11);
        int iO0 = o0(bArr, 0);
        String strP = o0.p(new String(bArr, 0, iO0, StandardCharsets.ISO_8859_1));
        int i12 = iO0 + 1;
        int iN0 = n0(bArr, i12, iU);
        String strE0 = e0(bArr, i12, iN0, charsetL0);
        int iK0 = k0(iU) + iN0;
        int iN02 = n0(bArr, iK0, iU);
        String strE02 = e0(bArr, iK0, iN02, charsetL0);
        int iK02 = k0(iU) + iN02;
        return new f(strP, strE0, strE02, i11 <= iK02 ? c0.f16553f : Arrays.copyOfRange(bArr, iK02, i11));
    }

    public static l c0(int i10, s sVar) {
        int iA = sVar.A();
        int iX = sVar.x();
        int iX2 = sVar.x();
        int iU = sVar.u();
        int iU2 = sVar.u();
        r rVar = new r();
        rVar.o(sVar);
        int i11 = ((i10 - 10) * 8) / (iU + iU2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = rVar.i(iU);
            int i14 = rVar.i(iU2);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new l(iA, iX, iX2, iArr, iArr2);
    }

    public static m d0(int i10, s sVar) {
        byte[] bArr = new byte[i10];
        sVar.e(bArr, 0, i10);
        int iO0 = o0(bArr, 0);
        String str = new String(bArr, 0, iO0, StandardCharsets.ISO_8859_1);
        int i11 = iO0 + 1;
        return new m(i10 <= i11 ? c0.f16553f : Arrays.copyOfRange(bArr, i11, i10), str);
    }

    public static String e0(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    public static n f0(int i10, String str, s sVar) {
        if (i10 < 1) {
            return null;
        }
        int iU = sVar.u();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        sVar.e(bArr, 0, i11);
        return new n(str, null, g0(bArr, iU, 0));
    }

    public static a1 g0(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return i0.u("");
        }
        f0 f0VarP = i0.p();
        int iN0 = n0(bArr, i11, i10);
        while (i11 < iN0) {
            f0VarP.a(new String(bArr, i11, iN0 - i11, l0(i10)));
            i11 = k0(i10) + iN0;
            iN0 = n0(bArr, i11, i10);
        }
        a1 a1VarF = f0VarP.f();
        return a1VarF.isEmpty() ? i0.u("") : a1VarF;
    }

    public static n h0(int i10, s sVar) {
        if (i10 < 1) {
            return null;
        }
        int iU = sVar.u();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        sVar.e(bArr, 0, i11);
        int iN0 = n0(bArr, 0, iU);
        return new n("TXXX", new String(bArr, 0, iN0, l0(iU)), g0(bArr, iU, k0(iU) + iN0));
    }

    public static o i0(int i10, String str, s sVar) {
        byte[] bArr = new byte[i10];
        sVar.e(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, o0(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    public static o j0(int i10, s sVar) {
        if (i10 < 1) {
            return null;
        }
        int iU = sVar.u();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        sVar.e(bArr, 0, i11);
        int iN0 = n0(bArr, 0, iU);
        String str = new String(bArr, 0, iN0, l0(iU));
        int iK0 = k0(iU) + iN0;
        return new o("WXXX", str, e0(bArr, iK0, o0(bArr, iK0), StandardCharsets.ISO_8859_1));
    }

    public static int k0(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static Charset l0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String m0(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static int n0(byte[] bArr, int i10, int i11) {
        int iO0 = o0(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iO0;
        }
        while (iO0 < bArr.length - 1) {
            if ((iO0 - i10) % 2 == 0 && bArr[iO0 + 1] == 0) {
                return iO0;
            }
            iO0 = o0(bArr, iO0 + 1);
        }
        return bArr.length;
    }

    public static int o0(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int p0(int i10, s sVar) {
        byte[] bArr = sVar.f16611a;
        int i11 = sVar.f16612b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    public static boolean q0(s sVar, int i10, int i11, boolean z10) {
        int iX;
        long jX;
        int iA;
        int i12;
        int i13 = sVar.f16612b;
        while (true) {
            try {
                boolean z11 = true;
                if (sVar.a() < i11) {
                    sVar.G(i13);
                    return true;
                }
                if (i10 >= 3) {
                    iX = sVar.g();
                    jX = sVar.w();
                    iA = sVar.A();
                } else {
                    iX = sVar.x();
                    jX = sVar.x();
                    iA = 0;
                }
                if (iX == 0 && jX == 0 && iA == 0) {
                    sVar.G(i13);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jX) != 0) {
                        sVar.G(i13);
                        return false;
                    }
                    jX = (((jX >> 24) & 255) << 21) | (jX & 255) | (((jX >> 8) & 255) << 7) | (((jX >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iA & 64) != 0 ? 1 : 0;
                    if ((iA & 1) == 0) {
                        z11 = false;
                    }
                } else {
                    if (i10 == 3) {
                        i12 = (iA & 32) != 0 ? 1 : 0;
                        if ((iA & 128) == 0) {
                        }
                    } else {
                        i12 = 0;
                    }
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jX < i12) {
                    sVar.G(i13);
                    return false;
                }
                if (sVar.a() < jX) {
                    sVar.G(i13);
                    return false;
                }
                sVar.H((int) jX);
            } catch (Throwable th2) {
                sVar.G(i13);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m4.n0 V(byte[] r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.h.V(byte[], int):m4.n0");
    }

    @Override // gh.g
    public final n0 t(a6.a aVar, ByteBuffer byteBuffer) {
        return V(byteBuffer.array(), byteBuffer.limit());
    }
}
