package pf;

import app.nekogram.translator.r;
import ce.j0;
import hf.a0;
import j2.h0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import nf.p;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f17127h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f17128i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17129j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f17130k = new r(7, "NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17133c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f17135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f17136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f17137g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(long j10, String str, int i10, int i11) {
        this.f17131a = i10;
        this.f17132b = i11;
        this.f17133c = j10;
        this.f17134d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(t0.C(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(a0.c.I("Max pool size ", i11, i10, " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(t0.C(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f17135e = new f();
        this.f17136f = new f();
        this.f17137g = new p((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
    }

    public static /* synthetic */ void i(c cVar, Runnable runnable, int i10) {
        cVar.g(runnable, false, (i10 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f17137g) {
            try {
                if (f17129j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f17128i;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f17131a) {
                    return 0;
                }
                if (i10 >= this.f17132b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f17137g.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i12);
                this.f17137g.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = pf.c.f17129j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof pf.a
            r3 = 0
            if (r1 == 0) goto L17
            pf.a r0 = (pf.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            pf.c r1 = r0.f17120h
            boolean r1 = jc.l.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            nf.p r1 = r8.f17137g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = pf.c.f17128i     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r1)
            if (r2 > r5) goto L78
            r1 = 1
        L36:
            nf.p r4 = r8.f17137g
            java.lang.Object r4 = r4.b(r1)
            jc.l.b(r4)
            pf.a r4 = (pf.a) r4
            if (r4 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r4.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L43
        L54:
            pf.m r4 = r4.f17113a
            pf.f r6 = r8.f17136f
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = pf.m.f17153b
            java.lang.Object r7 = r7.getAndSet(r4, r3)
            pf.i r7 = (pf.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            pf.i r7 = r4.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r5) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            pf.f r1 = r8.f17136f
            r1.b()
            pf.f r1 = r8.f17135e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            pf.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            pf.f r1 = r8.f17135e
            java.lang.Object r1 = r1.d()
            pf.i r1 = (pf.i) r1
            if (r1 != 0) goto Lb2
            pf.f r1 = r8.f17136f
            java.lang.Object r1 = r1.d()
            pf.i r1 = (pf.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            pf.b r1 = pf.b.f17125e
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = pf.c.f17127h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = pf.c.f17128i
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.c.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(this, runnable, 6);
    }

    public final void g(Runnable runnable, boolean z10, boolean z11) {
        i jVar;
        b bVar;
        k.f17151f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f17143a = jNanoTime;
            jVar.f17144b = z10;
        } else {
            jVar = new j(runnable, jNanoTime, z10);
        }
        boolean z12 = jVar.f17144b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17128i;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !jc.l.a(aVar.f17120h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f17115c) != b.f17125e && (jVar.f17144b || bVar != b.f17122b)) {
            aVar.f17119g = true;
            m mVar = aVar.f17113a;
            if (z11) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f17153b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f17144b ? this.f17136f.a(jVar) : this.f17135e.a(jVar))) {
                throw new RejectedExecutionException(h0.n(new StringBuilder(), this.f17134d, " was terminated"));
            }
        }
        if (z12) {
            if (o() || n(jAddAndGet)) {
                return;
            }
            o();
            return;
        }
        if (o() || n(atomicLongFieldUpdater.get(this))) {
            return;
        }
        o();
    }

    public final void k(a aVar, int i10, int i11) {
        while (true) {
            long j10 = f17127h.get(this);
            int iB = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iB == i10) {
                if (i11 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f17130k) {
                            iB = -1;
                            break;
                        }
                        if (objC == null) {
                            iB = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        iB = aVar2.b();
                        if (iB != 0) {
                            break;
                        } else {
                            objC = aVar2.c();
                        }
                    }
                } else {
                    iB = i11;
                }
            }
            if (iB >= 0) {
                if (f17127h.compareAndSet(this, j10, j11 | ((long) iB))) {
                    return;
                }
            }
        }
    }

    public final boolean n(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f17131a;
        if (i10 < i11) {
            int iB = b();
            if (iB == 1 && i11 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        r rVar;
        int iB;
        while (true) {
            long j10 = f17127h.get(this);
            a aVar = (a) this.f17137g.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    rVar = f17130k;
                    if (objC == rVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (f17127h.compareAndSet(this, j10, ((long) iB) | j11)) {
                        aVar.g(rVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f17112i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f17137g;
        int iA = pVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            a aVar = (a) pVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.f17113a;
                mVar.getClass();
                int i16 = m.f17153b.get(mVar) != null ? (m.f17154c.get(mVar) - m.f17155d.get(mVar)) + 1 : m.f17154c.get(mVar) - m.f17155d.get(mVar);
                int iOrdinal = aVar.f17115c.ordinal();
                if (iOrdinal == 0) {
                    i10++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i12++;
                } else if (iOrdinal == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new j0();
                    }
                    i14++;
                }
            }
        }
        long j10 = f17128i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f17134d);
        sb4.append('@');
        sb4.append(a0.q(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f17131a;
        sb4.append(i17);
        sb4.append(", max = ");
        sb4.append(this.f17132b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i10);
        sb4.append(", blocking = ");
        sb4.append(i11);
        sb4.append(", parked = ");
        sb4.append(i12);
        sb4.append(", dormant = ");
        sb4.append(i13);
        sb4.append(", terminated = ");
        sb4.append(i14);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f17135e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f17136f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j10));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j10) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
