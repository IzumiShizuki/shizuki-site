package b7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f2187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f2188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f2189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f2190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f2191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f2192l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j1 f2197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g4 f2198f;

    static {
        int i10 = p4.c0.f16548a;
        f2187g = Integer.toString(0, 36);
        f2188h = Integer.toString(1, 36);
        f2189i = Integer.toString(2, 36);
        f2190j = Integer.toString(3, 36);
        f2191k = Integer.toString(4, 36);
        f2192l = Integer.toString(5, 36);
    }

    public y(int i10, long j10, j1 j1Var, g4 g4Var, Object obj, int i11) {
        this.f2193a = i10;
        this.f2194b = j10;
        this.f2197e = j1Var;
        this.f2198f = g4Var;
        this.f2195c = obj;
        this.f2196d = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b7.y a(android.os.Bundle r10) {
        /*
            java.lang.String r0 = b7.y.f2187g
            r1 = 0
            int r3 = r10.getInt(r0, r1)
            java.lang.String r0 = b7.y.f2188h
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.getLong(r0, r4)
            java.lang.String r0 = b7.y.f2189i
            android.os.Bundle r0 = r10.getBundle(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            r6 = r2
            goto L21
        L1c:
            b7.j1 r0 = b7.j1.a(r0)
            r6 = r0
        L21:
            java.lang.String r0 = b7.y.f2192l
            android.os.Bundle r0 = r10.getBundle(r0)
            if (r0 == 0) goto L2f
            b7.g4 r0 = b7.g4.a(r0)
        L2d:
            r7 = r0
            goto L38
        L2f:
            if (r3 == 0) goto L37
            b7.g4 r0 = new b7.g4
            r0.<init>(r3)
            goto L2d
        L37:
            r7 = r2
        L38:
            java.lang.String r0 = b7.y.f2191k
            int r9 = r10.getInt(r0)
            r0 = 1
            if (r9 == r0) goto L7f
            java.lang.String r0 = b7.y.f2190j
            r8 = 2
            if (r9 == r8) goto L81
            r8 = 3
            if (r9 == r8) goto L53
            r10 = 4
            if (r9 != r10) goto L4d
            goto L7f
        L4d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L53:
            android.os.IBinder r10 = r10.getBinder(r0)
            if (r10 != 0) goto L5a
            goto L7f
        L5a:
            ya.i0 r10 = m4.f.a(r10)
            ya.f0 r0 = ya.i0.p()
        L62:
            int r2 = r10.size()
            if (r1 >= r2) goto L7b
            java.lang.Object r2 = r10.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r2.getClass()
            m4.i0 r2 = m4.i0.a(r2)
            r0.a(r2)
            int r1 = r1 + 1
            goto L62
        L7b:
            ya.a1 r2 = r0.f()
        L7f:
            r8 = r2
            goto L8d
        L81:
            android.os.Bundle r10 = r10.getBundle(r0)
            if (r10 != 0) goto L88
            goto L7f
        L88:
            m4.i0 r2 = m4.i0.a(r10)
            goto L7f
        L8d:
            b7.y r2 = new b7.y
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.y.a(android.os.Bundle):b7.y");
    }
}
