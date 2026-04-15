package p7;

import java.util.concurrent.atomic.AtomicBoolean;
import n7.a0;
import n7.z;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements a0, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f16925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vb.j f16927c = new vb.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f16928d = new AtomicBoolean(false);

    public r(f fVar, boolean z10) {
        this.f16925a = fVar;
        this.f16926b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // n7.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, ic.k r7, ac.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p7.q
            if (r0 == 0) goto L13
            r0 = r8
            p7.q r0 = (p7.q) r0
            int r1 = r0.f16924j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16924j = r1
            goto L18
        L13:
            p7.q r0 = new p7.q
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f16922h
            int r1 = r0.f16924j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            p7.f r6 = r0.f16921g
            ic.k r7 = r0.f16920f
            java.lang.String r1 = r0.f16919e
            p7.r r0 = r0.f16918d
            ub.a.f(r8)
            r8 = r6
            r6 = r1
            goto L70
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            ub.a.f(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.f16928d
            boolean r8 = r8.get()
            r1 = 21
            if (r8 != 0) goto L99
            yb.h r8 = r0.f302b
            jc.l.b(r8)
            m3.l r4 = p7.a.f16847b
            yb.f r8 = r8.R(r4)
            p7.a r8 = (p7.a) r8
            if (r8 == 0) goto L93
            p7.r r8 = r8.f16848a
            if (r8 != r5) goto L93
            r0.f16918d = r5
            r0.f16919e = r6
            r0.f16920f = r7
            p7.f r8 = r5.f16925a
            r0.f16921g = r8
            r0.f16924j = r2
            rf.a r1 = r8.f16868b
            java.lang.Object r0 = r1.g(r0)
            zb.a r1 = zb.a.f26667a
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
        L70:
            p7.k r1 = new p7.k     // Catch: java.lang.Throwable -> L86
            p7.f r2 = r0.f16925a     // Catch: java.lang.Throwable -> L86
            z7.c r6 = r2.d0(r6)     // Catch: java.lang.Throwable -> L86
            r1.<init>(r0, r6)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r6 = r7.a(r1)     // Catch: java.lang.Throwable -> L88
            gh.g.m(r1, r3)     // Catch: java.lang.Throwable -> L86
            r8.b(r3)
            return r6
        L86:
            r6 = move-exception
            goto L8f
        L88:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L8a
        L8a:
            r7 = move-exception
            gh.g.m(r1, r6)     // Catch: java.lang.Throwable -> L86
            throw r7     // Catch: java.lang.Throwable -> L86
        L8f:
            r8.b(r3)
            throw r6
        L93:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            ud.n.D(r1, r6)
            throw r3
        L99:
            java.lang.String r6 = "Connection is recycled"
            ud.n.D(r1, r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.r.a(java.lang.String, ic.k, ac.c):java.lang.Object");
    }

    @Override // n7.a0
    public final Object b(ac.i iVar) {
        if (this.f16928d.get()) {
            ud.n.D(21, "Connection is recycled");
            throw null;
        }
        yb.h hVar = iVar.f302b;
        jc.l.b(hVar);
        a aVar = (a) hVar.R(a.f16847b);
        if (aVar != null && aVar.f16848a == this) {
            return Boolean.valueOf(!this.f16927c.isEmpty());
        }
        ud.n.D(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // p7.s
    public final z7.a c() {
        return this.f16925a;
    }

    @Override // n7.a0
    public final Object d(z zVar, ic.n nVar, ac.i iVar) {
        if (this.f16928d.get()) {
            ud.n.D(21, "Connection is recycled");
            throw null;
        }
        yb.h hVar = iVar.f302b;
        jc.l.b(hVar);
        a aVar = (a) hVar.R(a.f16847b);
        if (aVar != null && aVar.f16848a == this) {
            return g(zVar, nVar, iVar);
        }
        ud.n.D(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(n7.z r8, ac.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r9 instanceof p7.n
            if (r1 == 0) goto L15
            r1 = r9
            p7.n r1 = (p7.n) r1
            int r2 = r1.f16905i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f16905i = r2
            goto L1a
        L15:
            p7.n r1 = new p7.n
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f16903g
            int r2 = r1.f16905i
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            p7.f r8 = r1.f16902f
            n7.z r2 = r1.f16901e
            p7.r r1 = r1.f16900d
            ub.a.f(r9)
            r9 = r8
            r8 = r2
            goto L50
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            ub.a.f(r9)
            r1.f16900d = r7
            r1.f16901e = r8
            p7.f r9 = r7.f16925a
            r1.f16902f = r9
            r1.f16905i = r3
            rf.a r2 = r9.f16868b
            java.lang.Object r1 = r2.g(r1)
            zb.a r2 = zb.a.f26667a
            if (r1 != r2) goto L4f
            return r2
        L4f:
            r1 = r7
        L50:
            r2 = 0
            vb.j r4 = r1.f16927c     // Catch: java.lang.Throwable -> L6e
            p7.f r1 = r1.f16925a     // Catch: java.lang.Throwable -> L6e
            int r5 = r4.f22816c     // Catch: java.lang.Throwable -> L6e
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r6 == 0) goto L82
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L7c
            if (r8 == r3) goto L76
            r0 = 2
            if (r8 != r0) goto L70
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            ud.n.g(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L6e:
            r8 = move-exception
            goto La4
        L70:
            ce.j0 r8 = new ce.j0     // Catch: java.lang.Throwable -> L6e
            r8.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r8     // Catch: java.lang.Throwable -> L6e
        L76:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            ud.n.g(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L7c:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            ud.n.g(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L82:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            r8.append(r5)     // Catch: java.lang.Throwable -> L6e
            r0 = 39
            r8.append(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6e
            ud.n.g(r1, r8)     // Catch: java.lang.Throwable -> L6e
        L96:
            p7.m r8 = new p7.m     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L6e
            r4.addLast(r8)     // Catch: java.lang.Throwable -> L6e
            ub.a0 r8 = ub.a0.f21526a     // Catch: java.lang.Throwable -> L6e
            r9.b(r2)
            return r8
        La4:
            r9.b(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.r.e(n7.z, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r8, ac.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r9 instanceof p7.o
            if (r2 == 0) goto L17
            r2 = r9
            p7.o r2 = (p7.o) r2
            int r3 = r2.f16911i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f16911i = r3
            goto L1c
        L17:
            p7.o r2 = new p7.o
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.f16909g
            int r3 = r2.f16911i
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            boolean r8 = r2.f16908f
            p7.f r3 = r2.f16907e
            p7.r r2 = r2.f16906d
            ub.a.f(r9)
            goto L50
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            ub.a.f(r9)
            r2.f16906d = r7
            p7.f r3 = r7.f16925a
            r2.f16907e = r3
            r2.f16908f = r8
            r2.f16911i = r4
            rf.a r9 = r3.f16868b
            java.lang.Object r9 = r9.g(r2)
            zb.a r2 = zb.a.f26667a
            if (r9 != r2) goto L4f
            return r2
        L4f:
            r2 = r7
        L50:
            r9 = 0
            vb.j r4 = r2.f16927c     // Catch: java.lang.Throwable -> L74
            p7.f r2 = r2.f16925a     // Catch: java.lang.Throwable -> L74
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto Lb1
            java.lang.Object r5 = vb.m.u0(r4)     // Catch: java.lang.Throwable -> L74
            p7.m r5 = (p7.m) r5     // Catch: java.lang.Throwable -> L74
            r6 = 39
            if (r8 == 0) goto L8b
            r5.getClass()     // Catch: java.lang.Throwable -> L74
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L76
            java.lang.String r8 = "END TRANSACTION"
            ud.n.g(r2, r8)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L74:
            r8 = move-exception
            goto Lb9
        L76:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L74
            int r0 = r5.f16899a     // Catch: java.lang.Throwable -> L74
            r8.append(r0)     // Catch: java.lang.Throwable -> L74
            r8.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            ud.n.g(r2, r8)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L8b:
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto L97
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            ud.n.g(r2, r8)     // Catch: java.lang.Throwable -> L74
            goto Lab
        L97:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L74
            int r0 = r5.f16899a     // Catch: java.lang.Throwable -> L74
            r8.append(r0)     // Catch: java.lang.Throwable -> L74
            r8.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L74
            ud.n.g(r2, r8)     // Catch: java.lang.Throwable -> L74
        Lab:
            ub.a0 r8 = ub.a0.f21526a     // Catch: java.lang.Throwable -> L74
            r3.b(r9)
            return r8
        Lb1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "Not in a transaction"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L74
            throw r8     // Catch: java.lang.Throwable -> L74
        Lb9:
            r3.b(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.r.f(boolean, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(n7.z r10, ic.n r11, ac.c r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof p7.p
            if (r0 == 0) goto L13
            r0 = r12
            p7.p r0 = (p7.p) r0
            int r1 = r0.f16917i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16917i = r1
            goto L18
        L13:
            p7.p r0 = new p7.p
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f16915g
            int r1 = r0.f16917i
            r2 = 0
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 1
            zb.a r7 = zb.a.f26667a
            if (r1 == 0) goto L6a
            if (r1 == r6) goto L5d
            if (r1 == r5) goto L4e
            if (r1 == r4) goto L48
            r10 = 4
            if (r1 == r10) goto L48
            if (r1 == r3) goto L38
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            java.io.Serializable r10 = r0.f16913e
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            java.lang.Object r11 = r0.f16912d
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            ub.a.f(r12)     // Catch: android.database.SQLException -> L45
            goto Lc4
        L45:
            r12 = move-exception
            goto Lbf
        L48:
            java.lang.Object r10 = r0.f16912d
            ub.a.f(r12)
            return r10
        L4e:
            int r10 = r0.f16914f
            java.lang.Object r11 = r0.f16912d
            p7.r r11 = (p7.r) r11
            ub.a.f(r12)     // Catch: java.lang.Throwable -> L58
            goto L9a
        L58:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto Laa
        L5d:
            java.io.Serializable r10 = r0.f16913e
            r11 = r10
            ic.n r11 = (ic.n) r11
            java.lang.Object r10 = r0.f16912d
            p7.r r10 = (p7.r) r10
            ub.a.f(r12)
            goto L82
        L6a:
            ub.a.f(r12)
            if (r10 != 0) goto L71
            n7.z r10 = n7.z.f15595a
        L71:
            r0.f16912d = r9
            r12 = r11
            java.io.Serializable r12 = (java.io.Serializable) r12
            r0.f16913e = r12
            r0.f16917i = r6
            java.lang.Object r10 = r9.e(r10, r0)
            if (r10 != r7) goto L81
            goto Lb8
        L81:
            r10 = r9
        L82:
            p7.l r12 = new p7.l     // Catch: java.lang.Throwable -> La9
            r1 = 0
            r12.<init>(r1, r10)     // Catch: java.lang.Throwable -> La9
            r0.f16912d = r10     // Catch: java.lang.Throwable -> La9
            r1 = 0
            r0.f16913e = r1     // Catch: java.lang.Throwable -> La9
            r0.f16914f = r6     // Catch: java.lang.Throwable -> La9
            r0.f16917i = r5     // Catch: java.lang.Throwable -> La9
            java.lang.Object r12 = r11.q(r12, r0)     // Catch: java.lang.Throwable -> La9
            if (r12 != r7) goto L98
            goto Lb8
        L98:
            r11 = r10
            r10 = 1
        L9a:
            if (r10 == 0) goto L9d
            r2 = 1
        L9d:
            r0.f16912d = r12
            r0.f16917i = r4
            java.lang.Object r10 = r11.f(r2, r0)
            if (r10 != r7) goto La8
            goto Lb8
        La8:
            return r12
        La9:
            r11 = move-exception
        Laa:
            throw r11     // Catch: java.lang.Throwable -> Lab
        Lab:
            r12 = move-exception
            r0.f16912d = r11     // Catch: android.database.SQLException -> Lbb
            r0.f16913e = r12     // Catch: android.database.SQLException -> Lbb
            r0.f16917i = r3     // Catch: android.database.SQLException -> Lbb
            java.lang.Object r10 = r10.f(r2, r0)     // Catch: android.database.SQLException -> Lbb
            if (r10 != r7) goto Lb9
        Lb8:
            return r7
        Lb9:
            r10 = r12
            goto Lc4
        Lbb:
            r10 = move-exception
            r8 = r12
            r12 = r10
            r10 = r8
        Lbf:
            if (r11 == 0) goto Lc5
            ub.a.a(r11, r12)
        Lc4:
            throw r10
        Lc5:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.r.g(n7.z, ic.n, ac.c):java.lang.Object");
    }
}
