package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends h1.g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f24247h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o.f0 f24250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f24251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24252g;

    public b0(long j10) {
        super(j10);
        o.f0 f0Var = o.p0.f16030a;
        jc.l.c(f0Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f24250e = f0Var;
        this.f24251f = f24247h;
    }

    @Override // h1.g0
    public final void a(h1.g0 g0Var) {
        jc.l.c(g0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        b0 b0Var = (b0) g0Var;
        this.f24250e = b0Var.f24250e;
        this.f24251f = b0Var.f24251f;
        this.f24252g = b0Var.f24252g;
    }

    @Override // h1.g0
    public final h1.g0 b() {
        return new b0(h1.n.k().g());
    }

    @Override // h1.g0
    public final h1.g0 c(long j10) {
        return new b0(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(x0.c0 r9, h1.g r10) {
        /*
            r8 = this;
            java.lang.Object r0 = h1.n.f8051c
            monitor-enter(r0)
            long r1 = r8.f24248c     // Catch: java.lang.Throwable -> L1a
            long r3 = r10.g()     // Catch: java.lang.Throwable -> L1a
            r5 = 1
            r6 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L1c
            int r1 = r8.f24249d     // Catch: java.lang.Throwable -> L1a
            int r2 = r10.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r2) goto L18
            goto L1c
        L18:
            r1 = 0
            goto L1d
        L1a:
            r9 = move-exception
            goto L47
        L1c:
            r1 = 1
        L1d:
            monitor-exit(r0)
            java.lang.Object r2 = r8.f24251f
            java.lang.Object r3 = x0.b0.f24247h
            if (r2 == r3) goto L2f
            if (r1 == 0) goto L30
            int r2 = r8.f24252g
            int r9 = r8.e(r9, r10)
            if (r2 != r9) goto L2f
            goto L30
        L2f:
            r5 = 0
        L30:
            if (r5 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r1 = r10.g()     // Catch: java.lang.Throwable -> L43
            r8.f24248c = r1     // Catch: java.lang.Throwable -> L43
            int r9 = r10.h()     // Catch: java.lang.Throwable -> L43
            r8.f24249d = r9     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r5
        L43:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L46:
            return r5
        L47:
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.b0.d(x0.c0, h1.g):boolean");
    }

    public final int e(c0 c0Var, h1.g gVar) throws Throwable {
        o.f0 f0Var;
        int i10;
        int i11;
        long[] jArr;
        long[] jArr2;
        char c3;
        h1.g0 g0VarE;
        synchronized (h1.n.f8051c) {
            f0Var = this.f24250e;
        }
        char c10 = 7;
        if (f0Var.f15957e == 0) {
            return 7;
        }
        z0.e eVarN = v.n();
        Object[] objArr = eVarN.f26372a;
        int i12 = eVarN.f26374c;
        for (int i13 = 0; i13 < i12; i13++) {
            ((h1.w) objArr[i13]).b();
        }
        try {
            Object[] objArr2 = f0Var.f15954b;
            int[] iArr = f0Var.f15955c;
            long[] jArr3 = f0Var.f15953a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                i11 = 7;
                while (true) {
                    long j10 = jArr3[i14];
                    if ((((~j10) << c10) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j10 & 255) < 128) {
                                int i17 = (i14 << 3) + i16;
                                Object obj = objArr2[i17];
                                int i18 = iArr[i17];
                                c3 = '\b';
                                h1.e0 e0Var = (h1.e0) obj;
                                if (i18 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (e0Var instanceof c0) {
                                        try {
                                            c0 c0Var2 = (c0) e0Var;
                                            g0VarE = c0Var2.e((b0) h1.n.j(c0Var2.f24259d, gVar), gVar, false, c0Var2.f24257b);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            Object[] objArr3 = eVarN.f26372a;
                                            int i19 = eVarN.f26374c;
                                            for (int i20 = 0; i20 < i19; i20++) {
                                                ((h1.w) objArr3[i20]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        g0VarE = h1.n.j(e0Var.a(), gVar);
                                    }
                                    int iIdentityHashCode = ((i11 * 31) + System.identityHashCode(g0VarE)) * 31;
                                    jArr2 = jArr3;
                                    long j11 = g0VarE.f8012a;
                                    i11 = iIdentityHashCode + ((int) (j11 ^ (j11 >>> 32)));
                                }
                            } else {
                                jArr2 = jArr3;
                                c3 = '\b';
                            }
                            j10 >>= c3;
                            i16++;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i15 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i14 == length) {
                        i10 = i11;
                        break;
                    }
                    i14++;
                    jArr3 = jArr;
                    c10 = 7;
                }
            } else {
                i10 = 7;
            }
            i11 = i10;
            Object[] objArr4 = eVarN.f26372a;
            int i21 = eVarN.f26374c;
            for (int i22 = 0; i22 < i21; i22++) {
                ((h1.w) objArr4[i22]).a();
            }
            return i11;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
