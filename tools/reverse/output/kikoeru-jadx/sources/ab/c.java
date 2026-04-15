package ab;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f297a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d10) {
        if (lc.b.D(d10)) {
            return d10 == 0.0d || 52 - Long.numberOfTrailingZeros(lc.b.A(d10)) <= Math.getExponent(d10);
        }
        return false;
    }

    public static boolean b(double d10) {
        if (d10 > 0.0d && lc.b.D(d10)) {
            long jA = lc.b.A(d10);
            if ((jA & (jA - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(double r7) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r1 = 0
            r3 = 0
            r4 = 1
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 <= 0) goto L12
            boolean r1 = lc.b.D(r7)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L83
            int r1 = java.lang.Math.getExponent(r7)
            int r2 = java.lang.Math.getExponent(r7)
            r5 = -1022(0xfffffffffffffc02, float:NaN)
            if (r2 < r5) goto L78
            int[] r2 = ab.b.f296a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            switch(r0) {
                case 1: goto L66;
                case 2: goto L6c;
                case 3: goto L5f;
                case 4: goto L57;
                case 5: goto L4d;
                case 6: goto L32;
                case 7: goto L32;
                case 8: goto L32;
                default: goto L2c;
            }
        L2c:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L32:
            long r7 = java.lang.Double.doubleToRawLongBits(r7)
            r5 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r7 = r7 & r5
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r7 = r7 | r5
            double r7 = java.lang.Double.longBitsToDouble(r7)
            double r7 = r7 * r7
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6c
            r3 = 1
            goto L6c
        L4d:
            if (r1 < 0) goto L50
            r3 = 1
        L50:
            boolean r7 = b(r7)
        L54:
            r7 = r7 ^ r4
            r3 = r3 & r7
            goto L6c
        L57:
            if (r1 >= 0) goto L5a
            r3 = 1
        L5a:
            boolean r7 = b(r7)
            goto L54
        L5f:
            boolean r7 = b(r7)
            r3 = r7 ^ 1
            goto L6c
        L66:
            boolean r7 = b(r7)
            if (r7 == 0) goto L70
        L6c:
            if (r3 == 0) goto L6f
            int r1 = r1 + r4
        L6f:
            return r1
        L70:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "mode was UNNECESSARY, but rounding was necessary"
            r7.<init>(r8)
            throw r7
        L78:
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r7 = r7 * r0
            int r7 = c(r7)
            int r7 = r7 + (-52)
            return r7
        L83:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "x must be positive and finite"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.c.c(double):int");
    }
}
