package jg;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10874a = new a();

    public static boolean a(char c3) {
        return ('0' <= c3) & (c3 <= '9');
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0095 A[RETURN] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r17, java.lang.Object r18) {
        /*
            r16 = this;
            r0 = r17
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = r18
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r2 = r0.length()
            int r3 = r1.length()
            r4 = 0
            r5 = 0
            r6 = 0
        L13:
            if (r5 >= r2) goto L8d
            if (r6 >= r3) goto L8d
            int r7 = r5 + 1
            char r5 = r0.charAt(r5)
            int r8 = r6 + 1
            char r6 = r1.charAt(r6)
            boolean r9 = a(r5)
            boolean r10 = a(r6)
            if (r9 == 0) goto L31
            if (r10 != 0) goto L31
            goto L93
        L31:
            if (r9 != 0) goto L36
            if (r10 == 0) goto L36
            goto L8f
        L36:
            if (r9 != 0) goto L49
            if (r10 != 0) goto L49
            char r5 = java.lang.Character.toLowerCase(r5)
            char r6 = java.lang.Character.toLowerCase(r6)
            int r5 = r5 - r6
            if (r5 == 0) goto L46
            return r5
        L46:
            r5 = r7
            r6 = r8
            goto L13
        L49:
            int r5 = r5 + (-48)
            long r9 = (long) r5
        L4c:
            r11 = 10
            if (r7 >= r2) goto L64
            int r5 = r7 + 1
            char r13 = r0.charAt(r7)
            boolean r14 = a(r13)
            if (r14 == 0) goto L64
            long r9 = r9 * r11
            int r13 = r13 + (-48)
            long r11 = (long) r13
            long r9 = r9 + r11
            r7 = r5
            goto L4c
        L64:
            int r6 = r6 + (-48)
            long r5 = (long) r6
        L67:
            if (r8 >= r3) goto L7d
            int r13 = r8 + 1
            char r14 = r1.charAt(r8)
            boolean r15 = a(r14)
            if (r15 == 0) goto L7d
            long r5 = r5 * r11
            int r14 = r14 + (-48)
            long r14 = (long) r14
            long r5 = r5 + r14
            r8 = r13
            goto L67
        L7d:
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 == 0) goto L46
            r0 = -9223372036854775808
            long r9 = r9 + r0
            long r5 = r5 + r0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L8a
            goto L93
        L8a:
            if (r0 != 0) goto L8f
            goto L95
        L8d:
            if (r5 >= r2) goto L91
        L8f:
            r0 = 1
            return r0
        L91:
            if (r6 >= r3) goto L95
        L93:
            r0 = -1
            return r0
        L95:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.a.compare(java.lang.Object, java.lang.Object):int");
    }
}
