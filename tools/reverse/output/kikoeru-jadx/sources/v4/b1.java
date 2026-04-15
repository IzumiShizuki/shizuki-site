package v4;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f22404c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22406b;

    static {
        b1 b1Var = new b1(0L, 0L);
        new b1(Long.MAX_VALUE, Long.MAX_VALUE);
        new b1(Long.MAX_VALUE, 0L);
        new b1(0L, Long.MAX_VALUE);
        f22404c = b1Var;
    }

    public b1(long j10, long j11) {
        p4.c.c(j10 >= 0);
        p4.c.c(j11 >= 0);
        this.f22405a = j10;
        this.f22406b = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r11, long r13, long r15) {
        /*
            r10 = this;
            long r0 = r10.f22406b
            long r2 = r10.f22405a
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto Lf
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto Lf
            return r11
        Lf:
            int r6 = p4.c0.f16548a
            long r6 = r11 - r2
            long r2 = r2 ^ r11
            long r8 = r11 ^ r6
            long r2 = r2 & r8
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L1d
            r6 = -9223372036854775808
        L1d:
            long r2 = r11 + r0
            long r8 = r11 ^ r2
            long r0 = r0 ^ r2
            long r0 = r0 & r8
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 >= 0) goto L2c
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2c:
            r0 = 0
            r1 = 1
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 > 0) goto L38
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 > 0) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = 0
        L39:
            int r5 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r5 > 0) goto L42
            int r5 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r5 > 0) goto L42
            r0 = 1
        L42:
            if (r4 == 0) goto L57
            if (r0 == 0) goto L57
            long r0 = r13 - r11
            long r0 = java.lang.Math.abs(r0)
            long r11 = r15 - r11
            long r11 = java.lang.Math.abs(r11)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L5c
            goto L59
        L57:
            if (r4 == 0) goto L5a
        L59:
            return r13
        L5a:
            if (r0 == 0) goto L5d
        L5c:
            return r15
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.b1.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            if (this.f22405a == b1Var.f22405a && this.f22406b == b1Var.f22406b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f22405a) * 31) + ((int) this.f22406b);
    }
}
