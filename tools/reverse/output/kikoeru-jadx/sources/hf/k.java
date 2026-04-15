package hf;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class k extends j0 implements j, ac.d, c2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8557f = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8558g = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8559h = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yb.c f8560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yb.h f8561e;

    public k(int i10, yb.c cVar) {
        super(i10);
        this.f8560d = cVar;
        this.f8561e = cVar.s();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f8519a;
    }

    public static void A(p1 p1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + p1Var + ", already has " + obj).toString());
    }

    public static Object F(p1 p1Var, Object obj, int i10, ic.o oVar) {
        if (obj instanceof s) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (oVar != null || (p1Var instanceof i)) {
            return new r(obj, p1Var instanceof i ? (i) p1Var : null, oVar, (Throwable) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        yb.c cVar = this.f8560d;
        Throwable th2 = null;
        nf.g gVar = cVar instanceof nf.g ? (nf.g) cVar : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nf.g.f15826h;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                app.nekogram.translator.r rVar = nf.b.f15816c;
                if (obj == rVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, rVar, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != rVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            n();
            t(th2);
        }
    }

    public final void D(Object obj, int i10, ic.o oVar) throws h0 {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8558g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p1) {
                Object objF = F((p1) obj2, obj, i10, oVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    n();
                }
                o(i10);
                return;
            }
            if (obj2 instanceof l) {
                l lVar = (l) obj2;
                if (l.f8565c.compareAndSet(lVar, 0, 1)) {
                    if (oVar != null) {
                        k(oVar, lVar.f8586a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void E(u uVar) throws h0 {
        yb.c cVar = this.f8560d;
        nf.g gVar = cVar instanceof nf.g ? (nf.g) cVar : null;
        D(ub.a0.f21526a, (gVar != null ? gVar.f15827d : null) == uVar ? 4 : this.f8552c, null);
    }

    public final app.nekogram.translator.r G(Object obj, ic.o oVar) {
        app.nekogram.translator.r rVar = a0.f8508a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8558g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof p1)) {
                return null;
            }
            Object objF = F((p1) obj2, obj, this.f8552c, oVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!y()) {
                n();
            }
            return rVar;
        }
    }

    @Override // hf.c2
    public final void a(nf.r rVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f8557f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        x(rVar);
    }

    @Override // hf.j0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8558g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof p1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof s) {
                return;
            }
            if (!(obj instanceof r)) {
                cancellationException2 = cancellationException;
                r rVar = new r(obj, (i) null, (ic.o) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            r rVar2 = (r) obj;
            if (rVar2.f8583e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            r rVarA = r.a(rVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            i iVar = rVar2.f8580b;
            if (iVar != null) {
                j(iVar, cancellationException);
            }
            ic.o oVar = rVar2.f8581c;
            if (oVar != null) {
                k(oVar, cancellationException, rVar2.f8579a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // hf.j0
    public final yb.c c() {
        return this.f8560d;
    }

    @Override // hf.j0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // hf.j0
    public final Object e(Object obj) {
        return obj instanceof r ? ((r) obj).f8579a : obj;
    }

    @Override // ac.d
    public final ac.d f() {
        yb.c cVar = this.f8560d;
        if (cVar instanceof ac.d) {
            return (ac.d) cVar;
        }
        return null;
    }

    @Override // yb.c
    public final void h(Object obj) {
        Throwable thA = ub.n.a(obj);
        if (thA != null) {
            obj = new s(thA, false);
        }
        D(obj, this.f8552c, null);
    }

    @Override // hf.j0
    public final Object i() {
        return f8558g.get(this);
    }

    public final void j(i iVar, Throwable th2) {
        try {
            iVar.b(th2);
        } catch (Throwable th3) {
            a0.t(new ce.j0("Exception in invokeOnCancellation handler for " + this, th3), this.f8561e);
        }
    }

    public final void k(ic.o oVar, Throwable th2, Object obj) {
        yb.h hVar = this.f8561e;
        try {
            oVar.g(th2, obj, hVar);
        } catch (Throwable th3) {
            a0.t(new ce.j0("Exception in resume onCancellation handler for " + this, th3), hVar);
        }
    }

    public final void l(nf.r rVar, Throwable th2) {
        yb.h hVar = this.f8561e;
        int i10 = f8557f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.h(i10, hVar);
        } catch (Throwable th3) {
            a0.t(new ce.j0("Exception in invokeOnCancellation handler for " + this, th3), hVar);
        }
    }

    @Override // hf.j
    public final void m(Object obj, ic.o oVar) throws h0 {
        D(obj, this.f8552c, oVar);
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8559h;
        n0 n0Var = (n0) atomicReferenceFieldUpdater.get(this);
        if (n0Var == null) {
            return;
        }
        n0Var.a();
        atomicReferenceFieldUpdater.set(this, o1.f8575a);
    }

    public final void o(int i10) throws h0 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f8557f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                yb.c cVar = this.f8560d;
                if (!z10 && (cVar instanceof nf.g)) {
                    boolean z11 = i10 == 1 || i10 == 2;
                    int i13 = this.f8552c;
                    if (z11 == (i13 == 1 || i13 == 2)) {
                        nf.g gVar = (nf.g) cVar;
                        u uVar = gVar.f15827d;
                        yb.h hVarS = gVar.f15828e.s();
                        if (nf.b.j(uVar, hVarS)) {
                            nf.b.i(uVar, hVarS, this);
                            return;
                        }
                        v0 v0VarA = u1.a();
                        if (v0VarA.f8601c >= 4294967296L) {
                            v0VarA.j0(this);
                            return;
                        }
                        v0VarA.l0(true);
                        try {
                            a0.B(this, cVar, true);
                            do {
                            } while (v0VarA.n0());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                a0.B(this, cVar, z10);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable p(k1 k1Var) {
        return k1Var.u();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        d1 d1Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f8557f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zY) {
                    C();
                }
                Object obj = f8558g.get(this);
                if (obj instanceof s) {
                    throw ((s) obj).f8586a;
                }
                int i12 = this.f8552c;
                if ((i12 != 1 && i12 != 2) || (d1Var = (d1) this.f8561e.R(v.f8599b)) == null || d1Var.b()) {
                    return e(obj);
                }
                CancellationException cancellationExceptionU = d1Var.u();
                b(cancellationExceptionU);
                throw cancellationExceptionU;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((n0) f8559h.get(this)) == null) {
            u();
        }
        if (zY) {
            C();
        }
        return zb.a.f26667a;
    }

    public final void r() {
        n0 n0VarU = u();
        if (n0VarU == null || (f8558g.get(this) instanceof p1)) {
            return;
        }
        n0VarU.a();
        f8559h.set(this, o1.f8575a);
    }

    @Override // yb.c
    public final yb.h s() {
        return this.f8561e;
    }

    @Override // hf.j
    public final boolean t(Throwable th2) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8558g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof p1)) {
                return false;
            }
            boolean z10 = (obj instanceof i) || (obj instanceof nf.r);
            if (th2 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th2;
            }
            l lVar = new l(cancellationException, z10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            p1 p1Var = (p1) obj;
            if (p1Var instanceof i) {
                j((i) obj, th2);
            } else if (p1Var instanceof nf.r) {
                l((nf.r) obj, th2);
            }
            if (!y()) {
                n();
            }
            o(this.f8552c);
            return true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(a0.E(this.f8560d));
        sb.append("){");
        Object obj = f8558g.get(this);
        sb.append(obj instanceof p1 ? "Active" : obj instanceof l ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(a0.q(this));
        return sb.toString();
    }

    public final n0 u() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d1 d1Var = (d1) this.f8561e.R(v.f8599b);
        if (d1Var == null) {
            return null;
        }
        n0 n0VarU = a0.u(d1Var, true, new m(this, 0));
        do {
            atomicReferenceFieldUpdater = f8559h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, n0VarU)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return n0VarU;
    }

    @Override // hf.j
    public final app.nekogram.translator.r v(Object obj, ic.o oVar) {
        return G(obj, oVar);
    }

    public final void w(ic.k kVar) {
        x(new h(1, kVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        A(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(hf.p1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = hf.k.f8558g
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof hf.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof hf.i
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof nf.r
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof hf.s
            if (r1 == 0) goto L4d
            r0 = r2
            hf.s r0 = (hf.s) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = hf.s.f8585b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof hf.l
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.f8586a
            boolean r1 = r8 instanceof hf.i
            if (r1 == 0) goto L43
            hf.i r8 = (hf.i) r8
            r7.j(r8, r0)
            return
        L43:
            nf.r r8 = (nf.r) r8
            r7.l(r8, r0)
            return
        L49:
            A(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof hf.r
            if (r1 == 0) goto L80
            r1 = r2
            hf.r r1 = (hf.r) r1
            hf.i r4 = r1.f8580b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof nf.r
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            hf.i r4 = (hf.i) r4
            java.lang.Throwable r5 = r1.f8583e
            if (r5 == 0) goto L68
            r7.j(r4, r5)
            return
        L68:
            r5 = 29
            hf.r r1 = hf.r.a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            A(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof nf.r
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            hf.i r3 = (hf.i) r3
            hf.r r1 = new hf.r
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            A(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.k.x(hf.p1):void");
    }

    public final boolean y() {
        if (this.f8552c != 2) {
            return false;
        }
        yb.c cVar = this.f8560d;
        jc.l.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return nf.g.f15826h.get((nf.g) cVar) != null;
    }

    @Override // hf.j
    public final void z(Object obj) throws h0 {
        o(this.f8552c);
    }
}
