package ch;

import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lh.i f4186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f4187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f4188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f4189d;

    static {
        lh.i iVar = lh.i.f12572d;
        f4186a = g5.w.t("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f4187b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f4188c = new String[64];
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            jc.l.d(binaryString, "toBinaryString(...)");
            strArr[i10] = ef.u.i0(wg.g.c("%8s", binaryString), ' ', '0');
        }
        f4189d = strArr;
        String[] strArr2 = f4188c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = h0.n(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f4188c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i14]);
            sb.append('|');
            strArr3[i15 | 8] = h0.n(sb, strArr3[i13], "|PADDED");
        }
        int length = f4188c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f4188c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f4189d[i16];
            }
        }
    }

    public static String a(int i10) {
        String[] strArr = f4187b;
        return i10 < strArr.length ? strArr[i10] : wg.g.c("0x%02x", Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            java.lang.String r0 = a(r13)
            r1 = 1
            r2 = 5
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 4
            if (r14 != 0) goto Lf
            java.lang.String r13 = ""
            goto L58
        Lf:
            java.lang.String[] r7 = ch.h.f4189d
            if (r13 == r4) goto L56
            if (r13 == r3) goto L56
            if (r13 == r6) goto L4e
            r8 = 6
            if (r13 == r8) goto L4e
            r8 = 7
            if (r13 == r8) goto L56
            r8 = 8
            if (r13 == r8) goto L56
            java.lang.String[] r8 = ch.h.f4188c
            int r9 = r8.length
            if (r14 >= r9) goto L2c
            r7 = r8[r14]
            jc.l.b(r7)
            goto L2e
        L2c:
            r7 = r7[r14]
        L2e:
            if (r13 != r2) goto L3d
            r8 = r14 & 4
            if (r8 == 0) goto L3d
            java.lang.String r13 = "HEADERS"
            java.lang.String r14 = "PUSH_PROMISE"
            java.lang.String r13 = ef.u.h0(r7, r13, r14, r5)
            goto L58
        L3d:
            if (r13 != 0) goto L4c
            r13 = r14 & 32
            if (r13 == 0) goto L4c
            java.lang.String r13 = "PRIORITY"
            java.lang.String r14 = "COMPRESSED"
            java.lang.String r13 = ef.u.h0(r7, r13, r14, r5)
            goto L58
        L4c:
            r13 = r7
            goto L58
        L4e:
            if (r14 != r1) goto L53
            java.lang.String r13 = "ACK"
            goto L58
        L53:
            r13 = r7[r14]
            goto L58
        L56:
            r13 = r7[r14]
        L58:
            if (r10 == 0) goto L5d
            java.lang.String r10 = "<<"
            goto L5f
        L5d:
            java.lang.String r10 = ">>"
        L5f:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r5] = r10
            r14[r1] = r11
            r14[r4] = r12
            r14[r3] = r0
            r14[r6] = r13
            java.lang.String r10 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = wg.g.c(r10, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.h.b(boolean, int, int, int, int):java.lang.String");
    }

    public static String c(int i10, int i11, long j10, boolean z10) {
        return wg.g.c("%s 0x%08x %5d %-13s %d", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), a(8), Long.valueOf(j10));
    }
}
