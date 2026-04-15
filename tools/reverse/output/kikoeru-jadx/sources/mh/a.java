package mh;

import java.io.EOFException;
import lh.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f15164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f15165b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(ef.a.f6541a);
        jc.l.d(bytes, "getBytes(...)");
        f15164a = bytes;
        f15165b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final boolean a(c0 c0Var, int i10, byte[] bArr, int i11, int i12) {
        int i13 = c0Var.f12558c;
        byte[] bArr2 = c0Var.f12556a;
        while (i11 < i12) {
            if (i10 == i13) {
                c0Var = c0Var.f12561f;
                jc.l.b(c0Var);
                byte[] bArr3 = c0Var.f12556a;
                bArr2 = bArr3;
                i10 = c0Var.f12557b;
                i13 = c0Var.f12558c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String b(lh.f fVar, long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (fVar.k(j11) == 13) {
                String strG = fVar.G(j11, ef.a.f6541a);
                fVar.skip(2L);
                return strG;
            }
        }
        String strG2 = fVar.G(j10, ef.a.f6541a);
        fVar.skip(1L);
        return strG2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(lh.f r16, lh.w r17, boolean r18) {
        /*
            r0 = r17
            java.lang.String r1 = "options"
            jc.l.e(r0, r1)
            r1 = r16
            lh.c0 r1 = r1.f12570a
            r2 = -1
            if (r1 != 0) goto L12
            if (r18 == 0) goto L11
            goto L5e
        L11:
            return r2
        L12:
            byte[] r3 = r1.f12556a
            int r4 = r1.f12557b
            int r5 = r1.f12558c
            int[] r0 = r0.f12616b
            r6 = 0
            r8 = r1
            r7 = 0
            r9 = -1
        L1e:
            int r10 = r7 + 1
            r11 = r0[r7]
            int r7 = r7 + 2
            r10 = r0[r10]
            if (r10 == r2) goto L29
            r9 = r10
        L29:
            if (r8 != 0) goto L2c
            goto L5c
        L2c:
            r10 = 0
            if (r11 >= 0) goto L74
            int r11 = r11 * (-1)
            int r12 = r11 + r7
        L33:
            int r11 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r13 = r7 + 1
            r7 = r0[r7]
            if (r4 == r7) goto L40
            goto L7e
        L40:
            if (r13 != r12) goto L44
            r4 = 1
            goto L45
        L44:
            r4 = 0
        L45:
            if (r11 != r5) goto L64
            jc.l.b(r8)
            lh.c0 r3 = r8.f12561f
            jc.l.b(r3)
            int r5 = r3.f12557b
            byte[] r7 = r3.f12556a
            int r8 = r3.f12558c
            if (r3 != r1) goto L60
            if (r4 == 0) goto L5c
            r3 = r7
            r7 = r10
            goto L67
        L5c:
            if (r18 == 0) goto L7e
        L5e:
            r0 = -2
            return r0
        L60:
            r15 = r7
            r7 = r3
            r3 = r15
            goto L67
        L64:
            r7 = r8
            r8 = r5
            r5 = r11
        L67:
            if (r4 == 0) goto L6f
            r4 = r0[r13]
            r15 = r8
            r8 = r7
            r7 = r15
            goto La0
        L6f:
            r4 = r5
            r5 = r8
            r8 = r7
            r7 = r13
            goto L33
        L74:
            int r12 = r4 + 1
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r13 = r7 + r11
        L7c:
            if (r7 != r13) goto L7f
        L7e:
            return r9
        L7f:
            r14 = r0[r7]
            if (r4 != r14) goto Laa
            int r7 = r7 + r11
            r4 = r0[r7]
            if (r12 != r5) goto L9e
            lh.c0 r8 = r8.f12561f
            jc.l.b(r8)
            int r3 = r8.f12557b
            byte[] r5 = r8.f12556a
            int r7 = r8.f12558c
            if (r8 != r1) goto L9a
            r8 = r5
            r5 = r3
            r3 = r8
            r8 = r10
            goto La0
        L9a:
            r15 = r5
            r5 = r3
            r3 = r15
            goto La0
        L9e:
            r7 = r5
            r5 = r12
        La0:
            if (r4 < 0) goto La3
            return r4
        La3:
            int r4 = -r4
            r15 = r7
            r7 = r4
            r4 = r5
            r5 = r15
            goto L1e
        Laa:
            int r7 = r7 + 1
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.a.c(lh.f, lh.w, boolean):int");
    }
}
