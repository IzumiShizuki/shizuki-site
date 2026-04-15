package kf;

import hf.c2;
import hf.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jc.c0;
import m0.w;
import q.t0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class f implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11345b = AtomicLongFieldUpdater.newUpdater(f.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11346c = AtomicLongFieldUpdater.newUpdater(f.class, "receivers$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11347d = AtomicLongFieldUpdater.newUpdater(f.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11348e = AtomicLongFieldUpdater.newUpdater(f.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11349f = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11350g = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11351h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11352i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11353j = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11354a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public f(int i10) {
        this.f11354a = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(t0.C(i10, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        n nVar = h.f11356a;
        this.bufferEnd$volatile = i10 != 0 ? i10 != Integer.MAX_VALUE ? i10 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f11347d.get(this);
        n nVar2 = new n(0L, null, this, 3);
        this.sendSegment$volatile = nVar2;
        this.receiveSegment$volatile = nVar2;
        if (z()) {
            nVar2 = h.f11356a;
            jc.l.c(nVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = nVar2;
        this._closeCause$volatile = h.f11374s;
    }

    public static final n b(f fVar, long j10, n nVar) {
        Object objB;
        f fVar2;
        n nVar2 = h.f11356a;
        g gVar = g.f11355i;
        loop0: while (true) {
            objB = nf.b.b(nVar, j10, gVar);
            if (!nf.b.e(objB)) {
                nf.r rVarC = nf.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11349f;
                    nf.r rVar = (nf.r) atomicReferenceFieldUpdater.get(fVar);
                    if (rVar.f15854c >= rVarC.f15854c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != rVar) {
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
        boolean zE = nf.b.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11346c;
        if (zE) {
            fVar.n();
            if (nVar.f15854c * ((long) h.f11357b) < atomicLongFieldUpdater.get(fVar)) {
                nVar.a();
                return null;
            }
        } else {
            n nVar3 = (n) nf.b.c(objB);
            long j11 = nVar3.f15854c;
            if (j11 <= j10) {
                return nVar3;
            }
            long j12 = ((long) h.f11357b) * j11;
            while (true) {
                long j13 = f11345b.get(fVar);
                long j14 = 1152921504606846975L & j13;
                if (j14 >= j12) {
                    fVar2 = fVar;
                    break;
                }
                fVar2 = fVar;
                if (f11345b.compareAndSet(fVar2, j13, (((long) ((int) (j13 >> 60))) << 60) + j14)) {
                    break;
                }
                fVar = fVar2;
            }
            if (j11 * ((long) h.f11357b) < atomicLongFieldUpdater.get(fVar2)) {
                nVar3.a();
            }
        }
        return null;
    }

    public static final void f(f fVar, Object obj, hf.k kVar) {
        kVar.h(ub.a.b(fVar.t()));
    }

    public static final int h(f fVar, n nVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        nVar.n(i10, obj);
        if (z10) {
            return fVar.G(nVar, i10, obj, j10, obj2, z10);
        }
        Object objL = nVar.l(i10);
        if (objL == null) {
            if (fVar.i(j10)) {
                if (nVar.k(i10, null, h.f11359d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (nVar.k(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof c2) {
            nVar.n(i10, null);
            if (fVar.D(objL, obj)) {
                nVar.o(i10, h.f11364i);
                return 0;
            }
            app.nekogram.translator.r rVar = h.f11366k;
            if (nVar.f11382f.getAndSet((i10 * 2) + 1, rVar) == rVar) {
                return 5;
            }
            nVar.m(i10, true);
            return 5;
        }
        return fVar.G(nVar, i10, obj, j10, obj2, z10);
    }

    public static void v(f fVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11348e;
        if ((atomicLongFieldUpdater.addAndGet(fVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(fVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(long r6, kf.n r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.f15854c
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            nf.c r0 = r8.c()
            kf.n r0 = (kf.n) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.d()
            if (r6 == 0) goto L22
            nf.c r6 = r8.c()
            kf.n r6 = (kf.n) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kf.f.f11351h
            java.lang.Object r7 = r6.get(r5)
            nf.r r7 = (nf.r) r7
            long r0 = r7.f15854c
            long r2 = r8.f15854c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r8.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r6.compareAndSet(r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.f()
            if (r6 == 0) goto L49
            r7.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r6.get(r5)
            if (r0 == r7) goto L3a
            boolean r6 = r8.f()
            if (r6 == 0) goto L22
            r8.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f.A(long, kf.n):void");
    }

    public final Object B(Object obj, yb.c cVar) {
        hf.k kVar = new hf.k(1, ud.s.p(cVar));
        kVar.r();
        kVar.h(ub.a.b(t()));
        Object objQ = kVar.q();
        return objQ == zb.a.f26667a ? objQ : a0.f21526a;
    }

    public final void C(c2 c2Var, boolean z10) {
        if (c2Var instanceof hf.j) {
            ((yb.c) c2Var).h(ub.a.b(z10 ? s() : t()));
            return;
        }
        if (!(c2Var instanceof c)) {
            if (c2Var instanceof qf.f) {
                ((qf.e) ((qf.f) c2Var)).g(this, h.f11367l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + c2Var).toString());
            }
        }
        c cVar = (c) c2Var;
        hf.k kVar = cVar.f11341b;
        jc.l.b(kVar);
        cVar.f11341b = null;
        cVar.f11340a = h.f11367l;
        Throwable thR = cVar.f11342c.r();
        if (thR == null) {
            kVar.h(Boolean.FALSE);
        } else {
            kVar.h(ub.a.b(thR));
        }
    }

    public final boolean D(Object obj, Object obj2) throws h0 {
        if (obj instanceof qf.f) {
            return ((qf.e) ((qf.f) obj)).g(this, obj2) == 0;
        }
        if (!(obj instanceof c)) {
            if (!(obj instanceof hf.j)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            hf.j jVar = (hf.j) obj;
            n nVar = h.f11356a;
            app.nekogram.translator.r rVarV = jVar.v(obj2, null);
            if (rVarV == null) {
                return false;
            }
            jVar.z(rVarV);
            return true;
        }
        c cVar = (c) obj;
        hf.k kVar = cVar.f11341b;
        jc.l.b(kVar);
        cVar.f11341b = null;
        cVar.f11340a = obj2;
        Boolean bool = Boolean.TRUE;
        cVar.f11342c.getClass();
        n nVar2 = h.f11356a;
        app.nekogram.translator.r rVarV2 = kVar.v(bool, null);
        if (rVarV2 == null) {
            return false;
        }
        kVar.z(rVarV2);
        return true;
    }

    public final boolean E(Object obj, n nVar, int i10) {
        qf.i iVar;
        boolean z10 = obj instanceof hf.j;
        a0 a0Var = a0.f21526a;
        if (z10) {
            hf.j jVar = (hf.j) obj;
            n nVar2 = h.f11356a;
            app.nekogram.translator.r rVarV = jVar.v(a0Var, null);
            if (rVarV == null) {
                return false;
            }
            jVar.z(rVarV);
            return true;
        }
        if (!(obj instanceof qf.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iG = ((qf.e) obj).g(this, a0Var);
        qf.i iVar2 = qf.i.f18255a;
        qf.i iVar3 = qf.i.f18256b;
        if (iG == 0) {
            iVar = iVar2;
        } else if (iG == 1) {
            iVar = iVar3;
        } else if (iG == 2) {
            iVar = qf.i.f18257c;
        } else {
            if (iG != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iG).toString());
            }
            iVar = qf.i.f18258d;
        }
        if (iVar == iVar3) {
            nVar.n(i10, null);
        }
        return iVar == iVar2;
    }

    public final Object F(n nVar, int i10, long j10, Object obj) {
        AtomicReferenceArray atomicReferenceArray = nVar.f11382f;
        Object objL = nVar.l(i10);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11345b;
        if (objL == null) {
            if (j10 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return h.f11369n;
                }
                if (nVar.k(i10, objL, obj)) {
                    p();
                    return h.f11368m;
                }
            }
        } else if (objL == h.f11359d && nVar.k(i10, objL, h.f11364i)) {
            p();
            Object obj2 = atomicReferenceArray.get(i10 * 2);
            nVar.n(i10, null);
            return obj2;
        }
        while (true) {
            Object objL2 = nVar.l(i10);
            if (objL2 == null || objL2 == h.f11360e) {
                if (j10 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (nVar.k(i10, objL2, h.f11363h)) {
                        p();
                        return h.f11370o;
                    }
                } else {
                    if (obj == null) {
                        return h.f11369n;
                    }
                    if (nVar.k(i10, objL2, obj)) {
                        p();
                        return h.f11368m;
                    }
                }
            } else if (objL2 != h.f11359d) {
                app.nekogram.translator.r rVar = h.f11365j;
                if (objL2 == rVar) {
                    return h.f11370o;
                }
                if (objL2 == h.f11363h) {
                    return h.f11370o;
                }
                if (objL2 == h.f11367l) {
                    p();
                    return h.f11370o;
                }
                if (objL2 != h.f11362g && nVar.k(i10, objL2, h.f11361f)) {
                    boolean z10 = objL2 instanceof v;
                    if (z10) {
                        objL2 = ((v) objL2).f11385a;
                    }
                    if (E(objL2, nVar, i10)) {
                        nVar.o(i10, h.f11364i);
                        p();
                        Object obj3 = atomicReferenceArray.get(i10 * 2);
                        nVar.n(i10, null);
                        return obj3;
                    }
                    nVar.o(i10, rVar);
                    nVar.i();
                    if (z10) {
                        p();
                    }
                    return h.f11370o;
                }
            } else if (nVar.k(i10, objL2, h.f11364i)) {
                p();
                Object obj4 = atomicReferenceArray.get(i10 * 2);
                nVar.n(i10, null);
                return obj4;
            }
        }
    }

    public final int G(n nVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objL = nVar.l(i10);
            if (objL == null) {
                if (!i(j10) || z10) {
                    if (z10) {
                        if (nVar.k(i10, null, h.f11365j)) {
                            nVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (nVar.k(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (nVar.k(i10, null, h.f11359d)) {
                    break;
                }
            } else {
                if (objL != h.f11360e) {
                    app.nekogram.translator.r rVar = h.f11366k;
                    if (objL == rVar) {
                        nVar.n(i10, null);
                        return 5;
                    }
                    if (objL == h.f11363h) {
                        nVar.n(i10, null);
                        return 5;
                    }
                    if (objL == h.f11367l) {
                        nVar.n(i10, null);
                        n();
                        return 4;
                    }
                    nVar.n(i10, null);
                    if (objL instanceof v) {
                        objL = ((v) objL).f11385a;
                    }
                    if (D(objL, obj)) {
                        nVar.o(i10, h.f11364i);
                        return 0;
                    }
                    if (nVar.f11382f.getAndSet((i10 * 2) + 1, rVar) != rVar) {
                        nVar.m(i10, true);
                    }
                    return 5;
                }
                if (nVar.k(i10, objL, h.f11359d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void H(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        f fVar = this;
        if (fVar.z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f11347d;
            if (atomicLongFieldUpdater.get(fVar) > j10) {
                break;
            } else {
                fVar = this;
            }
        }
        int i10 = h.f11358c;
        int i11 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f11348e;
            if (i11 < i10) {
                long j11 = atomicLongFieldUpdater.get(fVar);
                if (j11 == (4611686018427387903L & atomicLongFieldUpdater2.get(fVar)) && j11 == atomicLongFieldUpdater.get(fVar)) {
                    return;
                } else {
                    i11++;
                }
            } else {
                while (true) {
                    long j12 = atomicLongFieldUpdater2.get(fVar);
                    if (atomicLongFieldUpdater2.compareAndSet(fVar, j12, (j12 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        fVar = this;
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater.get(fVar);
                    long j14 = atomicLongFieldUpdater2.get(fVar);
                    long j15 = j14 & 4611686018427387903L;
                    boolean z10 = (j14 & 4611686018427387904L) != 0;
                    if (j13 == j15 && j13 == atomicLongFieldUpdater.get(fVar)) {
                        break;
                    }
                    if (z10) {
                        fVar = this;
                    } else {
                        fVar = this;
                        atomicLongFieldUpdater2.compareAndSet(fVar, j14, 4611686018427387904L + j15);
                    }
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater2.get(fVar);
                    if (atomicLongFieldUpdater2.compareAndSet(fVar, j16, j16 & 4611686018427387903L)) {
                        return;
                    } else {
                        fVar = this;
                    }
                }
            }
        }
    }

    @Override // kf.t
    public final w a() {
        c0.c(3, d.f11343i);
        c0.c(3, e.f11344i);
        return new w(this, (b) null);
    }

    @Override // kf.t
    public final Object c() {
        n nVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11346c;
        long j10 = atomicLongFieldUpdater.get(this);
        long j11 = f11345b.get(this);
        if (w(j11, true)) {
            return new k(r());
        }
        long j12 = j11 & 1152921504606846975L;
        l lVar = m.f11379b;
        if (j10 >= j12) {
            return lVar;
        }
        Object obj = h.f11366k;
        n nVar2 = (n) f11350g.get(this);
        while (!x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = h.f11357b;
            long j14 = andIncrement / j13;
            int i10 = (int) (andIncrement % j13);
            if (nVar2.f15854c != j14) {
                n nVarQ = q(j14, nVar2);
                if (nVarQ == null) {
                    continue;
                } else {
                    nVar = nVarQ;
                }
            } else {
                nVar = nVar2;
            }
            Object objF = F(nVar, i10, andIncrement, obj);
            n nVar3 = nVar;
            if (objF == h.f11368m) {
                c2 c2Var = obj instanceof c2 ? (c2) obj : null;
                if (c2Var != null) {
                    c2Var.a(nVar3, i10);
                }
                H(andIncrement);
                nVar3.i();
                return lVar;
            }
            if (objF != h.f11370o) {
                if (objF == h.f11369n) {
                    throw new IllegalStateException("unexpected");
                }
                nVar3.a();
                return objF;
            }
            if (andIncrement < u()) {
                nVar3.a();
            }
            nVar2 = nVar3;
        }
        return new k(r());
    }

    @Override // kf.t
    public final Object d(ac.i iVar) throws Throwable {
        n nVar;
        Throwable th2;
        n nVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11350g;
        n nVar3 = (n) atomicReferenceFieldUpdater.get(this);
        while (!x()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f11346c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = h.f11357b;
            long j11 = andIncrement / j10;
            int i10 = (int) (andIncrement % j10);
            if (nVar3.f15854c != j11) {
                n nVarQ = q(j11, nVar3);
                if (nVarQ == null) {
                    continue;
                } else {
                    nVar = nVarQ;
                }
            } else {
                nVar = nVar3;
            }
            Object objF = F(nVar, i10, andIncrement, null);
            app.nekogram.translator.r rVar = h.f11368m;
            if (objF == rVar) {
                throw new IllegalStateException("unexpected");
            }
            app.nekogram.translator.r rVar2 = h.f11370o;
            if (objF == rVar2) {
                if (andIncrement < u()) {
                    nVar.a();
                }
                nVar3 = nVar;
            } else {
                if (objF != h.f11369n) {
                    nVar.a();
                    return objF;
                }
                hf.k kVarS = hf.a0.s(ud.s.p(iVar));
                f fVar = this;
                try {
                    Object objF2 = fVar.F(nVar, i10, andIncrement, kVarS);
                    if (objF2 == rVar) {
                        kVarS.a(nVar, i10);
                    } else {
                        if (objF2 == rVar2) {
                            if (andIncrement < u()) {
                                nVar.a();
                            }
                            n nVar4 = (n) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (x()) {
                                    kVarS.h(ub.a.b(s()));
                                    break;
                                }
                                hf.k kVar = kVarS;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j12 = h.f11357b;
                                    long j13 = andIncrement2 / j12;
                                    int i11 = (int) (andIncrement2 % j12);
                                    if (nVar4.f15854c != j13) {
                                        try {
                                            n nVarQ2 = q(j13, nVar4);
                                            if (nVarQ2 == null) {
                                                kVarS = kVar;
                                            } else {
                                                nVar2 = nVarQ2;
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            kVarS = kVar;
                                            kVarS.C();
                                            throw th2;
                                        }
                                    } else {
                                        nVar2 = nVar4;
                                    }
                                    objF2 = fVar.F(nVar2, i11, andIncrement2, kVar);
                                    n nVar5 = nVar2;
                                    kVarS = kVar;
                                    if (objF2 == h.f11368m) {
                                        kVarS.a(nVar5, i11);
                                        break;
                                    }
                                    if (objF2 == h.f11370o) {
                                        if (andIncrement2 < u()) {
                                            nVar5.a();
                                        }
                                        fVar = this;
                                        nVar4 = nVar5;
                                    } else {
                                        if (objF2 == h.f11369n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        nVar5.a();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    kVarS = kVar;
                                    th2 = th;
                                    kVarS.C();
                                    throw th2;
                                }
                            }
                        } else {
                            nVar.a();
                        }
                        kVarS.m(objF2, null);
                    }
                    return kVarS.q();
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        Throwable thS = s();
        int i12 = nf.s.f15855a;
        throw thS;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // kf.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kf.f.f11345b
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.w(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = 0
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.i(r1)
            r1 = r1 ^ r10
        L1b:
            kf.l r13 = kf.m.f11379b
            if (r1 == 0) goto L20
            return r13
        L20:
            app.nekogram.translator.r r6 = kf.h.f11365j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kf.f.f11349f
            java.lang.Object r1 = r1.get(r15)
            kf.n r1 = (kf.n) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.w(r2, r9)
            int r14 = kf.h.f11357b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f15854c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            kf.n r3 = b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.t()
            kf.k r2 = new kf.k
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = h(r0, r1, r2, r3, r4, r6, r7)
            ub.a0 r3 = ub.a0.f21526a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.a()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kf.f.f11346c
            long r2 = r2.get(r15)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L8a
            r1.a()
        L8a:
            java.lang.Throwable r1 = r15.t()
            kf.k r2 = new kf.k
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.i()
            java.lang.Throwable r1 = r15.t()
            kf.k r2 = new kf.k
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof hf.c2
            if (r3 == 0) goto Lb2
            hf.c2 r6 = (hf.c2) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.i()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f.e(java.lang.Object):java.lang.Object");
    }

    @Override // kf.t
    public final void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    public final boolean i(long j10) {
        return j10 < f11347d.get(this) || j10 < f11346c.get(this) + ((long) this.f11354a);
    }

    @Override // kf.t
    public final c iterator() {
        return new c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        f(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168 A[RETURN] */
    @Override // kf.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.Object r25, yb.c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f.j(java.lang.Object, yb.c):java.lang.Object");
    }

    public final boolean k(Throwable th2) {
        return l(th2, false);
    }

    public final boolean l(Throwable th2, boolean z10) {
        f fVar;
        boolean z11;
        long j10;
        long j11;
        long j12;
        Object obj;
        long j13;
        long j14;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11345b;
        if (!z10) {
            fVar = this;
            break;
        }
        do {
            j14 = atomicLongFieldUpdater.get(this);
            if (((int) (j14 >> 60)) != 0) {
                fVar = this;
                break;
            }
            n nVar = h.f11356a;
            fVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(fVar, j14, (j14 & 1152921504606846975L) + (((long) 1) << 60)));
        app.nekogram.translator.r rVar = h.f11374s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11352i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, th2)) {
                z11 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                z11 = false;
                break;
            }
        }
        if (z10) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(fVar, j13, (((long) 3) << 60) + (j13 & 1152921504606846975L)));
        } else {
            do {
                j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 >> 60);
                if (i10 == 0) {
                    j11 = j10 & 1152921504606846975L;
                    j12 = 2;
                } else {
                    if (i10 != 1) {
                        break;
                    }
                    j11 = j10 & 1152921504606846975L;
                    j12 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(fVar, j10, (j12 << 60) + j11));
        }
        n();
        if (z11) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11353j;
                obj = atomicReferenceFieldUpdater2.get(this);
                app.nekogram.translator.r rVar2 = obj == null ? h.f11372q : h.f11373r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, rVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                c0.c(1, obj);
                ((ic.k) obj).a(r());
                return z11;
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        r1 = (kf.n) ((nf.c) nf.c.f15822b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kf.n m(long r14) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f.m(long):kf.n");
    }

    public final void n() {
        w(f11345b.get(this), false);
    }

    public final void o(long j10) {
        n nVar = (n) f11350g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f11346c;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 < Math.max(((long) this.f11354a) + j11, f11347d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j11, 1 + j11)) {
                long j12 = h.f11357b;
                long j13 = j11 / j12;
                int i10 = (int) (j11 % j12);
                if (nVar.f15854c != j13) {
                    n nVarQ = q(j13, nVar);
                    if (nVarQ != null) {
                        nVar = nVarQ;
                    }
                }
                n nVar2 = nVar;
                if (F(nVar2, i10, j11, null) != h.f11370o || j11 < u()) {
                    nVar2.a();
                }
                nVar = nVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0190, code lost:
    
        v(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0193, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f.p():void");
    }

    public final n q(long j10, n nVar) {
        Object objB;
        long j11;
        n nVar2 = h.f11356a;
        g gVar = g.f11355i;
        loop0: while (true) {
            objB = nf.b.b(nVar, j10, gVar);
            if (!nf.b.e(objB)) {
                nf.r rVarC = nf.b.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11350g;
                    nf.r rVar = (nf.r) atomicReferenceFieldUpdater.get(this);
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
        if (nf.b.e(objB)) {
            n();
            if (nVar.f15854c * ((long) h.f11357b) < u()) {
                nVar.a();
                return null;
            }
        } else {
            n nVar3 = (n) nf.b.c(objB);
            long j12 = nVar3.f15854c;
            if (!z() && j10 <= f11347d.get(this) / ((long) h.f11357b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11351h;
                    nf.r rVar2 = (nf.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f15854c >= j12 || !nVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, nVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (nVar3.f()) {
                                nVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j12 <= j10) {
                return nVar3;
            }
            long j13 = j12 * ((long) h.f11357b);
            do {
                j11 = f11346c.get(this);
                if (j11 >= j13) {
                    break;
                }
            } while (!f11346c.compareAndSet(this, j11, j13));
            if (j12 * ((long) h.f11357b) < u()) {
                nVar3.a();
            }
        }
        return null;
    }

    public final Throwable r() {
        return (Throwable) f11352i.get(this);
    }

    public final Throwable s() {
        Throwable thR = r();
        return thR == null ? new o("Channel was closed") : thR;
    }

    public final Throwable t() {
        Throwable thR = r();
        return thR == null ? new p("Channel was closed") : thR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
    
        r3 = (kf.n) r3.c();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f.toString():java.lang.String");
    }

    public final long u() {
        return f11345b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a4, code lost:
    
        r1 = (kf.n) ((nf.c) nf.c.f15822b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(long r15, boolean r17) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(f11345b.get(this), true);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j10 = f11347d.get(this);
        return j10 == 0 || j10 == Long.MAX_VALUE;
    }
}
