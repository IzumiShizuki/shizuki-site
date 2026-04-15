package m7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14916e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m7.l0 b(java.lang.String r9) {
        /*
            java.lang.String r0 = "Format:"
            boolean r0 = r9.startsWith(r0)
            p4.c.c(r0)
            r0 = 7
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r9 = android.text.TextUtils.split(r9, r0)
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = -1
            r4 = -1
            r5 = -1
            r6 = -1
        L1b:
            int r7 = r9.length
            if (r2 >= r7) goto L6d
            r7 = r9[r2]
            java.lang.String r7 = r7.trim()
            java.lang.String r7 = ud.e.c0(r7)
            r7.getClass()
            int r8 = r7.hashCode()
            switch(r8) {
                case 100571: goto L55;
                case 3556653: goto L4a;
                case 109757538: goto L3f;
                case 109780401: goto L34;
                default: goto L32;
            }
        L32:
            r7 = -1
            goto L5f
        L34:
            java.lang.String r8 = "style"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L3d
            goto L32
        L3d:
            r7 = 3
            goto L5f
        L3f:
            java.lang.String r8 = "start"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L48
            goto L32
        L48:
            r7 = 2
            goto L5f
        L4a:
            java.lang.String r8 = "text"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L53
            goto L32
        L53:
            r7 = 1
            goto L5f
        L55:
            java.lang.String r8 = "end"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L5e
            goto L32
        L5e:
            r7 = 0
        L5f:
            switch(r7) {
                case 0: goto L69;
                case 1: goto L67;
                case 2: goto L65;
                case 3: goto L63;
                default: goto L62;
            }
        L62:
            goto L6a
        L63:
            r6 = r2
            goto L6a
        L65:
            r3 = r2
            goto L6a
        L67:
            r5 = r2
            goto L6a
        L69:
            r4 = r2
        L6a:
            int r2 = r2 + 1
            goto L1b
        L6d:
            if (r3 == r0) goto L84
            if (r4 == r0) goto L84
            if (r5 == r0) goto L84
            m7.l0 r0 = new m7.l0
            int r9 = r9.length
            r0.<init>()
            r0.f14912a = r3
            r0.f14913b = r4
            r0.f14914c = r6
            r0.f14915d = r5
            r0.f14916e = r9
            return r0
        L84:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.l0.b(java.lang.String):m7.l0");
    }

    public boolean a() {
        int i10 = this.f14912a;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.f14915d;
            int i13 = this.f14913b;
            if (((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.f14915d;
            int i15 = this.f14914c;
            if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f14916e;
            int i17 = this.f14913b;
            if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f14916e;
            int i19 = this.f14914c;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
