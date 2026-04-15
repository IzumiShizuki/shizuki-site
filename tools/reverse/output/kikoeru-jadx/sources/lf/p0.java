package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final app.nekogram.translator.r f12473a = new app.nekogram.translator.r(7, "NO_VALUE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final app.nekogram.translator.r f12474b = new app.nekogram.translator.r(7, "NONE");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final app.nekogram.translator.r f12475c = new app.nekogram.translator.r(7, "PENDING");

    public static final o0 a(int i10, int i11, kf.a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(q.t0.B(i10, "replay cannot be negative, but was ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(q.t0.B(i11, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i10 <= 0 && i11 <= 0 && aVar != kf.a.f11336a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        return new o0(i10, i12, aVar);
    }

    public static final b1 c(Object obj) {
        if (obj == null) {
            obj = mf.c.f15133b;
        }
        return new b1(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(lf.g r4, java.lang.Object r5, java.lang.Object r6, ac.c r7) {
        /*
            boolean r0 = r7 instanceof lf.u
            if (r0 == 0) goto L13
            r0 = r7
            lf.u r0 = (lf.u) r0
            int r1 = r0.f12500f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12500f = r1
            goto L18
        L13:
            lf.u r0 = new lf.u
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f12499e
            int r1 = r0.f12500f
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            java.lang.Object r6 = r0.f12498d
            ub.a.f(r7)
            goto L3f
        L2f:
            ub.a.f(r7)
            r0.f12498d = r6
            r0.f12500f = r2
            java.lang.Object r4 = r4.n(r5, r0)
            zb.a r5 = zb.a.f26667a
            if (r4 != r5) goto L3f
            return
        L3f:
            mf.a r4 = new mf.a
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.p0.d(lf.g, java.lang.Object, java.lang.Object, ac.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(lf.h1 r4, ic.o r5, java.lang.Throwable r6, ac.c r7) {
        /*
            boolean r0 = r7 instanceof lf.l
            if (r0 == 0) goto L13
            r0 = r7
            lf.l r0 = (lf.l) r0
            int r1 = r0.f12437f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12437f = r1
            goto L18
        L13:
            lf.l r0 = new lf.l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f12436e
            int r1 = r0.f12437f
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.f12435d
            ub.a.f(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r4 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ub.a.f(r7)
            r0.f12435d = r6     // Catch: java.lang.Throwable -> L27
            r0.f12437f = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.g(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            zb.a r5 = zb.a.f26667a
            if (r4 != r5) goto L41
            return r5
        L41:
            ub.a0 r4 = ub.a0.f21526a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            ub.a.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.p0.e(lf.h1, ic.o, java.lang.Throwable, ac.c):java.lang.Object");
    }

    public static final void f(Object[] objArr, long j10, Object obj) {
        objArr[(objArr.length - 1) & ((int) j10)] = obj;
    }

    public static f g(f fVar, int i10) {
        kf.a aVar;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(q.t0.B(i10, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i10 == -1) {
            i10 = 0;
            aVar = kf.a.f11337b;
        } else {
            aVar = kf.a.f11336a;
        }
        boolean z10 = fVar instanceof mf.m;
        yb.i iVar = yb.i.f26088a;
        return z10 ? ((mf.m) fVar).c(iVar, i10, aVar) : new mf.g(i10, aVar, fVar, iVar);
    }

    public static final Object h(f fVar, ic.n nVar, ac.i iVar) {
        int i10 = a0.f12352a;
        Object objB = g(new mf.j(new i7.i(nVar, (yb.c) null), fVar, yb.i.f26088a, -2, kf.a.f11336a), 0).b(mf.o.f15153a, iVar);
        ub.a0 a0Var = ub.a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        if (objB != aVar) {
            objB = a0Var;
        }
        return objB == aVar ? objB : a0Var;
    }

    public static final k9.c i(f fVar) {
        kf.j.f11377i0.getClass();
        int i10 = kf.i.f11376b;
        if (1 >= i10) {
            i10 = 1;
        }
        int i11 = i10 - 1;
        boolean z10 = fVar instanceof mf.e;
        kf.a aVar = kf.a.f11336a;
        if (z10) {
            mf.e eVar = (mf.e) fVar;
            kf.a aVar2 = eVar.f15137c;
            f fVarG = eVar.g();
            if (fVarG != null) {
                int i12 = eVar.f15136b;
                if (i12 != -3 && i12 != -2 && i12 != 0) {
                    i11 = i12;
                } else if (aVar2 != aVar || i12 == 0) {
                    i11 = 0;
                }
                return new k9.c(i11, aVar2, fVarG, eVar.f15135a);
            }
        }
        return new k9.c(i11, aVar, fVar, yb.i.f26088a);
    }

    public static final b j(kf.f fVar) {
        return new b(fVar, true);
    }

    public static final f k(f fVar) {
        return ((fVar instanceof z0) || (fVar instanceof d)) ? fVar : new d(fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r1.n(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(lf.g r7, kf.t r8, boolean r9, yb.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof lf.i
            if (r0 == 0) goto L13
            r0 = r10
            lf.i r0 = (lf.i) r0
            int r1 = r0.f12422i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12422i = r1
            goto L18
        L13:
            lf.i r0 = new lf.i
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f12421h
            int r1 = r0.f12422i
            r2 = 0
            r3 = 2
            r4 = 1
            zb.a r5 = zb.a.f26667a
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L37
            boolean r9 = r0.f12420g
            kf.c r7 = r0.f12419f
            kf.t r8 = r0.f12418e
            lf.g r1 = r0.f12417d
            ub.a.f(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f12420g
            kf.c r7 = r0.f12419f
            kf.t r8 = r0.f12418e
            lf.g r1 = r0.f12417d
            ub.a.f(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            ub.a.f(r10)
            boolean r10 = r7 instanceof lf.h1
            if (r10 != 0) goto Lab
            kf.c r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f12417d = r7     // Catch: java.lang.Throwable -> L35
            r0.f12418e = r8     // Catch: java.lang.Throwable -> L35
            r0.f12419f = r10     // Catch: java.lang.Throwable -> L35
            r0.f12420g = r9     // Catch: java.lang.Throwable -> L35
            r0.f12422i = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L67
            goto L87
        L67:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f12417d = r1     // Catch: java.lang.Throwable -> L35
            r0.f12418e = r8     // Catch: java.lang.Throwable -> L35
            r0.f12419f = r7     // Catch: java.lang.Throwable -> L35
            r0.f12420g = r9     // Catch: java.lang.Throwable -> L35
            r0.f12422i = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.n(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L87:
            return r5
        L88:
            if (r9 == 0) goto L8d
            r8.g(r2)
        L8d:
            ub.a0 r7 = ub.a0.f21526a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L9b:
            if (r2 != 0) goto La7
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La7:
            r8.g(r2)
        Laa:
            throw r10
        Lab:
            lf.h1 r7 = (lf.h1) r7
            java.lang.Throwable r7 = r7.f12416a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.p0.l(lf.g, kf.t, boolean, yb.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(lf.f r6, ac.c r7) {
        /*
            app.nekogram.translator.r r0 = mf.c.f15133b
            boolean r1 = r7 instanceof lf.c0
            if (r1 == 0) goto L15
            r1 = r7
            lf.c0 r1 = (lf.c0) r1
            int r2 = r1.f12377g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f12377g = r2
            goto L1a
        L15:
            lf.c0 r1 = new lf.c0
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f12376f
            int r2 = r1.f12377g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            i7.e r6 = r1.f12375e
            jc.y r2 = r1.f12374d
            ub.a.f(r7)     // Catch: mf.a -> L2b
            goto L65
        L2b:
            r7 = move-exception
            goto L59
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            ub.a.f(r7)
            jc.y r2 = new jc.y
            r2.<init>()
            r2.f10838a = r0
            i7.e r7 = new i7.e
            r4 = 8
            r7.<init>(r4, r2)
            r1.f12374d = r2     // Catch: mf.a -> L55
            r1.f12375e = r7     // Catch: mf.a -> L55
            r1.f12377g = r3     // Catch: mf.a -> L55
            java.lang.Object r6 = r6.b(r7, r1)     // Catch: mf.a -> L55
            zb.a r7 = zb.a.f26667a
            if (r6 != r7) goto L65
            return r7
        L55:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L59:
            java.lang.Object r3 = r7.f15127a
            if (r3 != r6) goto L72
            yb.h r6 = r1.f302b
            jc.l.b(r6)
            hf.a0.m(r6)
        L65:
            java.lang.Object r6 = r2.f10838a
            if (r6 == r0) goto L6a
            return r6
        L6a:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.p0.m(lf.f, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(lf.f r5, ic.n r6, ac.c r7) {
        /*
            app.nekogram.translator.r r0 = mf.c.f15133b
            boolean r1 = r7 instanceof lf.d0
            if (r1 == 0) goto L15
            r1 = r7
            lf.d0 r1 = (lf.d0) r1
            int r2 = r1.f12383g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f12383g = r2
            goto L1a
        L15:
            lf.d0 r1 = new lf.d0
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.f12382f
            int r2 = r1.f12383g
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            i7.s0 r5 = r1.f12381e
            jc.y r6 = r1.f12380d
            ub.a.f(r7)     // Catch: mf.a -> L2b
            goto L66
        L2b:
            r7 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            ub.a.f(r7)
            jc.y r7 = new jc.y
            r7.<init>()
            r7.f10838a = r0
            i7.s0 r2 = new i7.s0
            r4 = 5
            r2.<init>(r4, r6, r7)
            r1.f12380d = r7     // Catch: mf.a -> L56
            r1.f12381e = r2     // Catch: mf.a -> L56
            r1.f12383g = r3     // Catch: mf.a -> L56
            java.lang.Object r5 = r5.b(r2, r1)     // Catch: mf.a -> L56
            zb.a r6 = zb.a.f26667a
            if (r5 != r6) goto L54
            return r6
        L54:
            r6 = r7
            goto L66
        L56:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L5a:
            java.lang.Object r2 = r7.f15127a
            if (r2 != r5) goto L73
            yb.h r5 = r1.f302b
            jc.l.b(r5)
            hf.a0.m(r5)
        L66:
            java.lang.Object r5 = r6.f10838a
            if (r5 == r0) goto L6b
            return r5
        L6b:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element matching the predicate"
            r5.<init>(r6)
            throw r5
        L73:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.p0.n(lf.f, ic.n, ac.c):java.lang.Object");
    }

    public static final f o(l0 l0Var, yb.h hVar, int i10, kf.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == kf.a.f11336a) ? l0Var : new mf.g(i10, aVar, l0Var, hVar);
    }

    public static final p p(f fVar, int i10) {
        if (i10 > 0) {
            return new p(fVar, i10, 1);
        }
        throw new IllegalArgumentException(q.t0.C(i10, "Requested element count ", " should be positive").toString());
    }
}
