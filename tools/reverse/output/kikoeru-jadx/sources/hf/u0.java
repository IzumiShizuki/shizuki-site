package hf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends v0 implements f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8594g = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8595h = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8596i = AtomicIntegerFieldUpdater.newUpdater(u0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public n0 O(long j10, Runnable runnable, yb.h hVar) {
        return c0.f8528a.O(j10, runnable, hVar);
    }

    @Override // hf.f0
    public final void X(long j10, k kVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            q0 q0Var = new q0(this, j11 + jNanoTime, kVar);
            t0(jNanoTime, q0Var);
            kVar.x(new h(2, q0Var));
        }
    }

    @Override // hf.u
    public final void e0(yb.h hVar, Runnable runnable) {
        p0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // hf.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m0() {
        /*
            r10 = this;
            app.nekogram.translator.r r0 = hf.a0.f8510c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = hf.u0.f8594g
            boolean r2 = r10.n0()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.q0()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof nf.m
            if (r6 == 0) goto L3e
            r6 = r2
            nf.m r6 = (nf.m) r6
            java.lang.Object r7 = r6.d()
            app.nekogram.translator.r r8 = nf.m.f15845g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            nf.m r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            vb.j r2 = r10.f8603e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof nf.m
            if (r2 == 0) goto L8d
            nf.m r1 = (nf.m) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = nf.m.f15844f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r1 = (int) r0
            if (r2 != r1) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = hf.u0.f8595h
            java.lang.Object r0 = r0.get(r10)
            hf.t0 r0 = (hf.t0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            hf.s0[] r1 = r0.f15862a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f8587a
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.u0.m0():long");
    }

    public void p0(Runnable runnable) {
        q0();
        if (!r0(runnable)) {
            b0.f8520j.p0(runnable);
            return;
        }
        Thread threadK0 = k0();
        if (Thread.currentThread() != threadK0) {
            LockSupport.unpark(threadK0);
        }
    }

    public final void q0() {
        s0 s0VarC;
        t0 t0Var = (t0) f8595h.get(this);
        if (t0Var == null || nf.w.f15861b.get(t0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (t0Var) {
                try {
                    s0[] s0VarArr = t0Var.f15862a;
                    s0 s0Var = s0VarArr != null ? s0VarArr[0] : null;
                    if (s0Var != null) {
                        s0VarC = ((jNanoTime - s0Var.f8587a) > 0L ? 1 : ((jNanoTime - s0Var.f8587a) == 0L ? 0 : -1)) >= 0 ? r0(s0Var) : false ? t0Var.c(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (s0VarC != null);
    }

    public final boolean r0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8594g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f8596i.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof nf.m)) {
                        if (obj != a0.f8510c) {
                            nf.m mVar = new nf.m(8, true);
                            mVar.a((Runnable) obj);
                            mVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    nf.m mVar2 = (nf.m) obj;
                    int iA = mVar2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        nf.m mVarC = mVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s0() {
        /*
            r7 = this;
            vb.j r0 = r7.f8603e
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = 1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = hf.u0.f8595h
            java.lang.Object r0 = r0.get(r7)
            hf.t0 r0 = (hf.t0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = nf.w.f15861b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = hf.u0.f8594g
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof nf.m
            if (r3 == 0) goto L4f
            nf.m r0 = (nf.m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = nf.m.f15844f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r4 = (int) r3
            if (r0 != r4) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            app.nekogram.translator.r r3 = hf.a0.f8510c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.u0.s0():boolean");
    }

    @Override // hf.v0
    public void shutdown() {
        s0 s0VarC;
        u1.f8597a.set(null);
        f8596i.set(this, 1);
        app.nekogram.translator.r rVar = a0.f8510c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8594g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof nf.m)) {
                    if (obj != rVar) {
                        nf.m mVar = new nf.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((nf.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, rVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (m0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            t0 t0Var = (t0) f8595h.get(this);
            if (t0Var == null) {
                return;
            }
            synchronized (t0Var) {
                s0VarC = nf.w.f15861b.get(t0Var) > 0 ? t0Var.c(0) : null;
            }
            if (s0VarC == null) {
                return;
            } else {
                o0(jNanoTime, s0VarC);
            }
        }
    }

    public final void t0(long j10, s0 s0Var) {
        int iD;
        Thread threadK0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8595h;
        if (f8596i.get(this) == 1) {
            iD = 1;
        } else {
            t0 t0Var = (t0) atomicReferenceFieldUpdater.get(this);
            if (t0Var == null) {
                t0 t0Var2 = new t0();
                t0Var2.f8592c = j10;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, t0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                jc.l.b(obj);
                t0Var = (t0) obj;
            }
            iD = s0Var.d(j10, t0Var, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                o0(j10, s0Var);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        t0 t0Var3 = (t0) atomicReferenceFieldUpdater.get(this);
        if (t0Var3 != null) {
            synchronized (t0Var3) {
                s0[] s0VarArr = t0Var3.f15862a;
                s0Var = s0VarArr != null ? s0VarArr[0] : null;
            }
        }
        if (s0Var != s0Var || Thread.currentThread() == (threadK0 = k0())) {
            return;
        }
        LockSupport.unpark(threadK0);
    }
}
