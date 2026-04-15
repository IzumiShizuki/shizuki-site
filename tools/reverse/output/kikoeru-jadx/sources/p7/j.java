package p7;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f16887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f16888c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f[] f16891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rf.i f16892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m4.j f16893h;

    public j(int i10, ic.a aVar) {
        this.f16886a = i10;
        this.f16887b = aVar;
        this.f16891f = new f[i10];
        int i11 = rf.j.f19027a;
        this.f16892g = new rf.i(i10);
        m4.j jVar = new m4.j((byte) 0, 1);
        if (i10 < 1) {
            p.a.c("capacity must be >= 1");
            throw null;
        }
        if (i10 > 1073741824) {
            p.a.c("capacity must be <= 2^30");
            throw null;
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        jVar.f14298d = i10 - 1;
        jVar.f14299e = new Object[i10];
        this.f16893h = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ac.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p7.h
            if (r0 == 0) goto L13
            r0 = r9
            p7.h r0 = (p7.h) r0
            int r1 = r0.f16878g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16878g = r1
            goto L18
        L13:
            p7.h r0 = new p7.h
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f16876e
            int r1 = r0.f16878g
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            p7.j r0 = r0.f16875d
            ub.a.f(r9)
            goto L42
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            ub.a.f(r9)
            r0.f16875d = r8
            r0.f16878g = r2
            rf.i r9 = r8.f16892g
            java.lang.Object r9 = r9.a(r0)
            zb.a r0 = zb.a.f26667a
            if (r9 != r0) goto L41
            return r0
        L41:
            r0 = r8
        L42:
            java.util.concurrent.locks.ReentrantLock r9 = r0.f16888c     // Catch: java.lang.Throwable -> L8f
            m4.j r1 = r0.f16893h     // Catch: java.lang.Throwable -> L8f
            r9.lock()     // Catch: java.lang.Throwable -> L8f
            boolean r3 = r0.f16890e     // Catch: java.lang.Throwable -> L91
            r4 = 0
            if (r3 != 0) goto L99
            int r3 = r1.f14296b     // Catch: java.lang.Throwable -> L91
            int r5 = r1.f14297c     // Catch: java.lang.Throwable -> L91
            if (r3 != r5) goto L75
            int r3 = r0.f16889d     // Catch: java.lang.Throwable -> L91
            int r5 = r0.f16886a     // Catch: java.lang.Throwable -> L91
            if (r3 < r5) goto L5b
            goto L75
        L5b:
            p7.f r3 = new p7.f     // Catch: java.lang.Throwable -> L91
            ic.a r5 = r0.f16887b     // Catch: java.lang.Throwable -> L91
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L91
            z7.a r5 = (z7.a) r5     // Catch: java.lang.Throwable -> L91
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L91
            p7.f[] r5 = r0.f16891f     // Catch: java.lang.Throwable -> L91
            int r6 = r0.f16889d     // Catch: java.lang.Throwable -> L91
            int r7 = r6 + 1
            r0.f16889d = r7     // Catch: java.lang.Throwable -> L91
            r5[r6] = r3     // Catch: java.lang.Throwable -> L91
            r1.b(r3)     // Catch: java.lang.Throwable -> L91
        L75:
            int r3 = r1.f14296b     // Catch: java.lang.Throwable -> L91
            int r5 = r1.f14297c     // Catch: java.lang.Throwable -> L91
            if (r3 == r5) goto L93
            java.lang.Object r5 = r1.f14299e     // Catch: java.lang.Throwable -> L91
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L91
            r6 = r5[r3]     // Catch: java.lang.Throwable -> L91
            r5[r3] = r4     // Catch: java.lang.Throwable -> L91
            int r3 = r3 + r2
            int r2 = r1.f14298d     // Catch: java.lang.Throwable -> L91
            r2 = r2 & r3
            r1.f14296b = r2     // Catch: java.lang.Throwable -> L91
            p7.f r6 = (p7.f) r6     // Catch: java.lang.Throwable -> L91
            r9.unlock()     // Catch: java.lang.Throwable -> L8f
            return r6
        L8f:
            r9 = move-exception
            goto La5
        L91:
            r1 = move-exception
            goto La1
        L93:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            throw r1     // Catch: java.lang.Throwable -> L91
        L99:
            java.lang.String r1 = "Connection pool is closed"
            r2 = 21
            ud.n.D(r2, r1)     // Catch: java.lang.Throwable -> L91
            throw r4     // Catch: java.lang.Throwable -> L91
        La1:
            r9.unlock()     // Catch: java.lang.Throwable -> L8f
            throw r1     // Catch: java.lang.Throwable -> L8f
        La5:
            rf.i r0 = r0.f16892g
            r0.d()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j.a(ac.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:11|(2:62|12)|35|59|44|(1:(1:54)(2:50|(1:52)))(1:46)|53|19|61|20|(1:22)(1:23)|(1:(1:27)(2:38|39))(1:25)|28|(3:30|31|(1:33)(13:34|35|59|44|(0)(0)|53|19|61|20|(0)(0)|(0)(0)|28|(2:36|37)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        r15 = r15;
        r14 = r14;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[Catch: all -> 0x00a1, TryCatch #1 {all -> 0x00a1, blocks: (B:20:0x0042, B:25:0x0060, B:30:0x0079, B:36:0x008e, B:37:0x0095, B:38:0x0096, B:39:0x009b), top: B:61:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #1 {all -> 0x00a1, blocks: (B:20:0x0042, B:25:0x0060, B:30:0x0079, B:36:0x008e, B:37:0x0095, B:38:0x0096, B:39:0x009b), top: B:61:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[Catch: all -> 0x00a1, TRY_ENTER, TryCatch #1 {all -> 0x00a1, blocks: (B:20:0x0042, B:25:0x0060, B:30:0x0079, B:36:0x008e, B:37:0x0095, B:38:0x0096, B:39:0x009b), top: B:61:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:44:0x00a8, B:46:0x00ac, B:50:0x00b4, B:54:0x00bb), top: B:59:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:35:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r12, ba.s r14, ac.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof p7.i
            if (r0 == 0) goto L13
            r0 = r15
            p7.i r0 = (p7.i) r0
            int r1 = r0.f16885j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16885j = r1
            goto L18
        L13:
            p7.i r0 = new p7.i
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f16883h
            int r1 = r0.f16885j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            long r12 = r0.f16882g
            jc.y r14 = r0.f16881f
            ic.a r1 = r0.f16880e
            p7.j r4 = r0.f16879d
            ub.a.f(r15)     // Catch: java.lang.Throwable -> L2e
            goto L89
        L2e:
            r15 = move-exception
            goto La3
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            ub.a.f(r15)
            r4 = r11
        L3d:
            jc.y r15 = new jc.y
            r15.<init>()
            b0.x r1 = new b0.x     // Catch: java.lang.Throwable -> La1
            r5 = 28
            r1.<init>(r15, r4, r3, r5)     // Catch: java.lang.Throwable -> La1
            r0.f16879d = r4     // Catch: java.lang.Throwable -> La1
            r0.f16880e = r14     // Catch: java.lang.Throwable -> La1
            r0.f16881f = r15     // Catch: java.lang.Throwable -> La1
            r0.f16882g = r12     // Catch: java.lang.Throwable -> La1
            r0.f16885j = r2     // Catch: java.lang.Throwable -> La1
            int r5 = ff.a.f7057d     // Catch: java.lang.Throwable -> La1
            r5 = 0
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 <= 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            if (r7 != r2) goto L72
            ff.c r7 = ff.c.NANOSECONDS     // Catch: java.lang.Throwable -> La1
            r8 = 999999(0xf423f, double:4.94065E-318)
            long r7 = ff.f.n(r8, r7)     // Catch: java.lang.Throwable -> La1
            long r7 = ff.a.g(r12, r7)     // Catch: java.lang.Throwable -> La1
            long r7 = ff.a.d(r7)     // Catch: java.lang.Throwable -> La1
            goto L75
        L72:
            if (r7 != 0) goto L96
            r7 = r5
        L75:
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L8e
            hf.x1 r5 = new hf.x1     // Catch: java.lang.Throwable -> La1
            r5.<init>(r7, r0)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r1 = hf.a0.D(r5, r1)     // Catch: java.lang.Throwable -> La1
            zb.a r5 = zb.a.f26667a
            if (r1 != r5) goto L87
            return r5
        L87:
            r1 = r14
            r14 = r15
        L89:
            r15 = r14
            r14 = r1
            r1 = r0
            r0 = r3
            goto La8
        L8e:
            hf.w1 r1 = new hf.w1     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = "Timed out immediately"
            r1.<init>(r5, r3)     // Catch: java.lang.Throwable -> La1
            throw r1     // Catch: java.lang.Throwable -> La1
        L96:
            ce.j0 r1 = new ce.j0     // Catch: java.lang.Throwable -> La1
            r1.<init>()     // Catch: java.lang.Throwable -> La1
            throw r1     // Catch: java.lang.Throwable -> La1
        L9c:
            r10 = r1
            r1 = r14
            r14 = r15
            r15 = r10
            goto La3
        La1:
            r1 = move-exception
            goto L9c
        La3:
            r10 = r15
            r15 = r14
            r14 = r1
            r1 = r0
            r0 = r10
        La8:
            boolean r5 = r0 instanceof hf.w1     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto Lb2
            r14.b()     // Catch: java.lang.Throwable -> Lb0
            goto Lb9
        Lb0:
            r12 = move-exception
            goto Lbc
        Lb2:
            if (r0 != 0) goto Lbb
            java.lang.Object r15 = r15.f10838a     // Catch: java.lang.Throwable -> Lb0
            if (r15 == 0) goto Lb9
            return r15
        Lb9:
            r0 = r1
            goto L3d
        Lbb:
            throw r0     // Catch: java.lang.Throwable -> Lb0
        Lbc:
            java.lang.Object r13 = r15.f10838a
            p7.f r13 = (p7.f) r13
            if (r13 == 0) goto Lc5
            r4.e(r13)
        Lc5:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j.b(long, ba.s, ac.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f16888c;
        reentrantLock.lock();
        try {
            this.f16890e = true;
            for (f fVar : this.f16891f) {
                if (fVar != null) {
                    fVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        m4.j jVar = this.f16893h;
        ReentrantLock reentrantLock = this.f16888c;
        reentrantLock.lock();
        try {
            wb.b bVarL = ud.b.l();
            int i10 = (jVar.f14297c - jVar.f14296b) & jVar.f14298d;
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 >= 0) {
                    int i12 = jVar.f14297c;
                    int i13 = jVar.f14296b;
                    int i14 = jVar.f14298d;
                    if (i11 < ((i12 - i13) & i14)) {
                        Object obj = ((Object[]) jVar.f14299e)[(i13 + i11) & i14];
                        jc.l.b(obj);
                        bVarL.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            wb.b bVarG = ud.b.g(bVarL);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f16886a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            rf.i iVar = this.f16892g;
            iVar.getClass();
            sb2.append(Math.max(rf.h.f19024g.get(iVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + bVarG.a() + ")[" + vb.m.f0(bVarG, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            f[] fVarArr = this.f16891f;
            int length = fVarArr.length;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                f fVar = fVarArr[i16];
                i15++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i15);
                sb3.append("] - ");
                sb3.append(fVar != null ? fVar.f16867a.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (fVar != null) {
                    fVar.i(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e(f fVar) {
        jc.l.e(fVar, "connection");
        ReentrantLock reentrantLock = this.f16888c;
        reentrantLock.lock();
        try {
            this.f16893h.b(fVar);
            reentrantLock.unlock();
            this.f16892g.d();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
