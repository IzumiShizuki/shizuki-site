package rf;

import ba.l;
import hf.c2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nf.r;
import q.t0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19020c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19021d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f19022e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f19023f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19024g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f19026b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i10) {
        this.f19025a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(t0.B(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(t0.B(i10, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i10;
        this.f19026b = new l(12, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.m(r3, r4.f19026b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ac.c r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = rf.h.f19024g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f19025a
            if (r1 > r2) goto L0
            ub.a0 r3 = ub.a0.f21526a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            yb.c r5 = ud.s.p(r5)
            hf.k r5 = hf.a0.s(r5)
            boolean r1 = r4.c(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            ba.l r0 = r4.f19026b     // Catch: java.lang.Throwable -> L3f
            r5.m(r3, r0)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.c(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r5 = r5.q()
            zb.a r0 = zb.a.f26667a
            if (r5 != r0) goto L3a
            goto L3b
        L3a:
            r5 = r3
        L3b:
            if (r5 != r0) goto L3e
            return r5
        L3e:
            return r3
        L3f:
            r0 = move-exception
            r5.C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.h.a(ac.c):java.lang.Object");
    }

    public final boolean c(c2 c2Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19022e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f19023f.getAndIncrement(this);
        f fVar = f.f19018i;
        long j10 = andIncrement / ((long) j.f19032f);
        loop0: while (true) {
            objB = nf.b.b(kVar, j10, fVar);
            if (!nf.b.e(objB)) {
                r rVarC = nf.b.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f15854c >= rVarC.f15854c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) nf.b.c(objB);
        AtomicReferenceArray atomicReferenceArray = kVar2.f19033e;
        int i10 = (int) (andIncrement % ((long) j.f19032f));
        while (!atomicReferenceArray.compareAndSet(i10, null, c2Var)) {
            if (atomicReferenceArray.get(i10) != null) {
                app.nekogram.translator.r rVar2 = j.f19028b;
                app.nekogram.translator.r rVar3 = j.f19029c;
                while (!atomicReferenceArray.compareAndSet(i10, rVar2, rVar3)) {
                    if (atomicReferenceArray.get(i10) != rVar2) {
                        return false;
                    }
                }
                ((hf.j) c2Var).m(a0.f21526a, this.f19026b);
                return true;
            }
        }
        c2Var.a(kVar2, i10);
        return true;
    }

    public final void d() {
        int i10;
        Object objB;
        boolean z10;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19024g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f19025a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19020c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f19021d.getAndIncrement(this);
            long j10 = andIncrement2 / ((long) j.f19032f);
            g gVar = g.f19019i;
            while (true) {
                objB = nf.b.b(kVar, j10, gVar);
                if (nf.b.e(objB)) {
                    break;
                }
                r rVarC = nf.b.c(objB);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f15854c >= rVarC.f15854c) {
                        break;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            }
            k kVar2 = (k) nf.b.c(objB);
            AtomicReferenceArray atomicReferenceArray = kVar2.f19033e;
            kVar2.a();
            long j11 = kVar2.f15854c;
            z10 = false;
            if (j11 <= j10) {
                int i12 = (int) (andIncrement2 % ((long) j.f19032f));
                Object andSet = atomicReferenceArray.getAndSet(i12, j.f19028b);
                if (andSet == null) {
                    int i13 = j.f19027a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (atomicReferenceArray.get(i12) == j.f19029c) {
                            z10 = true;
                            break;
                        }
                    }
                    app.nekogram.translator.r rVar2 = j.f19028b;
                    app.nekogram.translator.r rVar3 = j.f19030d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i12, rVar2, rVar3)) {
                            if (atomicReferenceArray.get(i12) != rVar2) {
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    z10 = !z10;
                } else if (andSet != j.f19031e) {
                    boolean z11 = andSet instanceof hf.j;
                    a0 a0Var = a0.f21526a;
                    if (!z11) {
                        if (!(andSet instanceof qf.f)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((qf.e) ((qf.f) andSet)).g(this, a0Var) == 0) {
                            z10 = true;
                            break;
                            break;
                        }
                    } else {
                        hf.j jVar = (hf.j) andSet;
                        app.nekogram.translator.r rVarV = jVar.v(a0Var, this.f19026b);
                        if (rVarV != null) {
                            jVar.z(rVarV);
                            z10 = true;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (!z10);
    }
}
