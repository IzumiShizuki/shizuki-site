package hf;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final app.nekogram.translator.r f8508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final app.nekogram.translator.r f8509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final app.nekogram.translator.r f8510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final app.nekogram.translator.r f8511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final app.nekogram.translator.r f8512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final app.nekogram.translator.r f8513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final app.nekogram.translator.r f8514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final app.nekogram.translator.r f8515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p0 f8516i = new p0(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p0 f8517j = new p0(true);

    static {
        int i10 = 7;
        f8508a = new app.nekogram.translator.r(i10, "RESUME_TOKEN");
        f8509b = new app.nekogram.translator.r(i10, "REMOVED_TASK");
        f8510c = new app.nekogram.translator.r(i10, "CLOSED_EMPTY");
        f8511d = new app.nekogram.translator.r(i10, "COMPLETING_ALREADY");
        f8512e = new app.nekogram.translator.r(i10, "COMPLETING_WAITING_CHILDREN");
        f8513f = new app.nekogram.translator.r(i10, "COMPLETING_RETRY");
        f8514g = new app.nekogram.translator.r(i10, "TOO_LATE_TO_CANCEL");
        f8515h = new app.nekogram.translator.r(i10, "SEALED");
    }

    public static final Object A(Object obj) {
        return obj instanceof s ? ub.a.b(((s) obj).f8586a) : obj;
    }

    public static final void B(k kVar, yb.c cVar, boolean z10) {
        Object obj = k.f8558g.get(kVar);
        Throwable thD = kVar.d(obj);
        Object objB = thD != null ? ub.a.b(thD) : kVar.e(obj);
        if (!z10) {
            cVar.h(objB);
            return;
        }
        jc.l.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        nf.g gVar = (nf.g) cVar;
        ac.c cVar2 = gVar.f15828e;
        Object obj2 = gVar.f15830g;
        yb.h hVarS = cVar2.s();
        Object objN = nf.b.n(hVarS, obj2);
        a2 a2VarG = objN != nf.b.f15817d ? G(cVar2, hVarS, objN) : null;
        try {
            cVar2.h(objB);
            if (a2VarG == null || a2VarG.p0()) {
                nf.b.g(hVarS, objN);
            }
        } catch (Throwable th2) {
            if (a2VarG == null || a2VarG.p0()) {
                nf.b.g(hVarS, objN);
            }
            throw th2;
        }
    }

    public static final Object C(yb.h hVar, ic.n nVar) throws Throwable {
        v0 v0VarA;
        yb.h hVarN;
        long jM0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Thread threadCurrentThread = Thread.currentThread();
        yb.g gVar = yb.d.f26087a;
        yb.e eVar = (yb.e) hVar.R(gVar);
        yb.i iVar = yb.i.f26088a;
        if (eVar == null) {
            v0VarA = u1.a();
            hVarN = n(iVar, hVar.G(v0VarA), true);
            pf.e eVar2 = l0.f8566a;
            if (hVarN != eVar2 && hVarN.R(gVar) == null) {
                hVarN = hVarN.G(eVar2);
            }
        } else {
            if (eVar instanceof v0) {
            }
            v0VarA = (v0) u1.f8597a.get();
            hVarN = n(iVar, hVar, true);
            pf.e eVar3 = l0.f8566a;
            if (hVarN != eVar3 && hVarN.R(gVar) == null) {
                hVarN = hVarN.G(eVar3);
            }
        }
        f fVar = new f(hVarN, threadCurrentThread, v0VarA);
        fVar.n0(z.f8616a, fVar, nVar);
        v0 v0Var = fVar.f8537e;
        if (v0Var != null) {
            int i10 = v0.f8600f;
            v0Var.l0(false);
        }
        while (true) {
            if (v0Var != null) {
                try {
                    jM0 = v0Var.m0();
                } catch (Throwable th2) {
                    if (v0Var != null) {
                        int i11 = v0.f8600f;
                        v0Var.i0(false);
                    }
                    throw th2;
                }
            } else {
                jM0 = Long.MAX_VALUE;
            }
            atomicReferenceFieldUpdater = k1.f8563a;
            if (!(atomicReferenceFieldUpdater.get(fVar) instanceof a1)) {
                break;
            }
            LockSupport.parkNanos(fVar, jM0);
            if (Thread.interrupted()) {
                fVar.w(new InterruptedException());
            }
        }
        if (v0Var != null) {
            int i12 = v0.f8600f;
            v0Var.i0(false);
        }
        Object objF = F(atomicReferenceFieldUpdater.get(fVar));
        s sVar = objF instanceof s ? (s) objF : null;
        if (sVar == null) {
            return objF;
        }
        throw sVar.f8586a;
    }

    public static final Object D(x1 x1Var, ic.n nVar) {
        u(x1Var, true, new o0(0, p(x1Var.f15852d.s()).O(x1Var.f8611e, x1Var, x1Var.f8507c)));
        return nd.h.v(x1Var, false, x1Var, nVar);
    }

    public static final String E(yb.c cVar) {
        Object objB;
        if (cVar instanceof nf.g) {
            return ((nf.g) cVar).toString();
        }
        try {
            objB = cVar + '@' + q(cVar);
        } catch (Throwable th2) {
            objB = ub.a.b(th2);
        }
        if (ub.n.a(objB) != null) {
            objB = cVar.getClass().getName() + '@' + q(cVar);
        }
        return (String) objB;
    }

    public static final Object F(Object obj) {
        a1 a1Var;
        b1 b1Var = obj instanceof b1 ? (b1) obj : null;
        return (b1Var == null || (a1Var = b1Var.f8522a) == null) ? obj : a1Var;
    }

    public static final a2 G(yb.c cVar, yb.h hVar, Object obj) {
        a2 a2Var = null;
        if ((cVar instanceof ac.d) && hVar.R(b2.f8523a) != null) {
            ac.d dVarF = (ac.d) cVar;
            while (true) {
                if ((dVarF instanceof i0) || (dVarF = dVarF.f()) == null) {
                    break;
                }
                if (dVarF instanceof a2) {
                    a2Var = (a2) dVarF;
                    break;
                }
            }
            if (a2Var != null) {
                a2Var.r0(hVar, obj);
            }
        }
        return a2Var;
    }

    public static final Object H(yb.h hVar, ic.n nVar, yb.c cVar) throws Throwable {
        yb.h hVarS = cVar.s();
        yb.h hVarG = !((Boolean) hVar.y(new fa.a(22), Boolean.FALSE)).booleanValue() ? hVarS.G(hVar) : n(hVarS, hVar, false);
        m(hVarG);
        if (hVarG == hVarS) {
            nf.q qVar = new nf.q(cVar, hVarG);
            return nd.h.v(qVar, true, qVar, nVar);
        }
        yb.d dVar = yb.d.f26087a;
        if (jc.l.a(hVarG.R(dVar), hVarS.R(dVar))) {
            a2 a2Var = new a2(cVar, hVarG);
            yb.h hVar2 = a2Var.f8507c;
            Object objN = nf.b.n(hVar2, null);
            try {
                return nd.h.v(a2Var, true, a2Var, nVar);
            } finally {
                nf.b.g(hVar2, objN);
            }
        }
        i0 i0Var = new i0(cVar, hVarG);
        try {
            nf.b.h(ub.a0.f21526a, ud.s.p(ud.s.k(nVar, i0Var, i0Var)));
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i0.f8547e;
            do {
                int i10 = atomicIntegerFieldUpdater.get(i0Var);
                if (i10 != 0) {
                    if (i10 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objF = F(k1.f8563a.get(i0Var));
                    if (objF instanceof s) {
                        throw ((s) objF).f8586a;
                    }
                    return objF;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(i0Var, 0, 1));
            return zb.a.f26667a;
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof h0) {
                th = ((h0) th).f8545a;
            }
            i0Var.h(ub.a.b(th));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(long r5, ic.n r7, ac.c r8) {
        /*
            boolean r0 = r8 instanceof hf.y1
            if (r0 == 0) goto L13
            r0 = r8
            hf.y1 r0 = (hf.y1) r0
            int r1 = r0.f8615f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8615f = r1
            goto L18
        L13:
            hf.y1 r0 = new hf.y1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8614e
            int r1 = r0.f8615f
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            jc.y r5 = r0.f8613d
            ub.a.f(r8)     // Catch: hf.w1 -> L27
            return r8
        L27:
            r6 = move-exception
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ub.a.f(r8)
            r3 = 0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L3b
            goto L5d
        L3b:
            jc.y r8 = new jc.y
            r8.<init>()
            r0.f8613d = r8     // Catch: hf.w1 -> L55
            r0.f8615f = r2     // Catch: hf.w1 -> L55
            hf.x1 r1 = new hf.x1     // Catch: hf.w1 -> L55
            r1.<init>(r5, r0)     // Catch: hf.w1 -> L55
            r8.f10838a = r1     // Catch: hf.w1 -> L55
            java.lang.Object r5 = D(r1, r7)     // Catch: hf.w1 -> L55
            zb.a r6 = zb.a.f26667a
            if (r5 != r6) goto L54
            return r6
        L54:
            return r5
        L55:
            r6 = move-exception
            r5 = r8
        L57:
            hf.d1 r7 = r6.f8607a
            java.lang.Object r5 = r5.f10838a
            if (r7 != r5) goto L5f
        L5d:
            r5 = 0
            return r5
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.a0.I(long, ic.n, ac.c):java.lang.Object");
    }

    public static final Object J(ac.c cVar) {
        Object obj;
        yb.h hVarS = cVar.s();
        m(hVarS);
        yb.c cVarP = ud.s.p(cVar);
        nf.g gVar = cVarP instanceof nf.g ? (nf.g) cVarP : null;
        zb.a aVar = zb.a.f26667a;
        ub.a0 a0Var = ub.a0.f21526a;
        if (gVar == null) {
            obj = a0Var;
        } else {
            u uVar = gVar.f15827d;
            if (nf.b.j(uVar, hVarS)) {
                gVar.f15829f = a0Var;
                gVar.f8552c = 1;
                uVar.f0(hVarS, gVar);
            } else {
                yb.h hVarG = hVarS.G(new d2(d2.f8532b));
                gVar.f15829f = a0Var;
                gVar.f8552c = 1;
                uVar.f0(hVarG, gVar);
            }
            obj = aVar;
        }
        return obj == aVar ? obj : a0Var;
    }

    public static q a() {
        q qVar = new q(true);
        qVar.T(null);
        return qVar;
    }

    public static final nf.d b(yb.h hVar) {
        if (hVar.R(v.f8599b) == null) {
            hVar = hVar.G(c());
        }
        return new nf.d(hVar);
    }

    public static f1 c() {
        return new f1(null);
    }

    public static final nf.d d() {
        t1 t1VarE = e();
        pf.e eVar = l0.f8566a;
        return new nf.d(ud.b.C(t1VarE, nf.n.f15850a));
    }

    public static t1 e() {
        return new t1(null);
    }

    public static e0 f(y yVar, jf.d dVar, ic.n nVar, int i10) {
        yb.h hVar = dVar;
        if ((i10 & 1) != 0) {
            hVar = yb.i.f26088a;
        }
        e0 e0Var = new e0(z(yVar, hVar), true);
        e0Var.n0(z.f8616a, e0Var, nVar);
        return e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(ac.c r4) {
        /*
            boolean r0 = r4 instanceof hf.g0
            if (r0 == 0) goto L13
            r0 = r4
            hf.g0 r0 = (hf.g0) r0
            int r1 = r0.f8541e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8541e = r1
            goto L18
        L13:
            hf.g0 r0 = new hf.g0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f8540d
            int r1 = r0.f8541e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L29:
            ub.a.f(r4)
            goto L47
        L2d:
            ub.a.f(r4)
            r0.f8541e = r2
            hf.k r4 = new hf.k
            yb.c r0 = ud.s.p(r0)
            r4.<init>(r2, r0)
            r4.r()
            java.lang.Object r4 = r4.q()
            zb.a r0 = zb.a.f26667a
            if (r4 != r0) goto L47
            return
        L47:
            ce.j0 r4 = new ce.j0
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.a0.g(ac.c):void");
    }

    public static final void h(y yVar, CancellationException cancellationException) {
        d1 d1Var = (d1) yVar.O().R(v.f8599b);
        if (d1Var != null) {
            d1Var.g(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + yVar).toString());
        }
    }

    public static final void i(yb.h hVar, CancellationException cancellationException) {
        d1 d1Var = (d1) hVar.R(v.f8599b);
        if (d1Var != null) {
            d1Var.g(cancellationException);
        }
    }

    public static final Object j(d1 d1Var, ac.c cVar) {
        d1Var.g(null);
        Object objY = d1Var.Y(cVar);
        return objY == zb.a.f26667a ? objY : ub.a0.f21526a;
    }

    public static final Object k(ic.n nVar, yb.c cVar) {
        nf.q qVar = new nf.q(cVar, cVar.s());
        return nd.h.v(qVar, true, qVar, nVar);
    }

    public static final Object l(long j10, yb.c cVar) {
        if (j10 > 0) {
            k kVar = new k(1, ud.s.p(cVar));
            kVar.r();
            if (j10 < Long.MAX_VALUE) {
                p(kVar.f8561e).X(j10, kVar);
            }
            Object objQ = kVar.q();
            if (objQ == zb.a.f26667a) {
                return objQ;
            }
        }
        return ub.a0.f21526a;
    }

    public static final void m(yb.h hVar) {
        d1 d1Var = (d1) hVar.R(v.f8599b);
        if (d1Var != null && !d1Var.b()) {
            throw d1Var.u();
        }
    }

    public static final yb.h n(yb.h hVar, yb.h hVar2, boolean z10) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) hVar.y(new fa.a(22), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.y(new fa.a(22), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.G(hVar2);
        }
        fa.a aVar = new fa.a(20);
        yb.i iVar = yb.i.f26088a;
        yb.h hVar3 = (yb.h) hVar.y(aVar, iVar);
        Object objY = hVar2;
        if (zBooleanValue2) {
            objY = hVar2.y(new fa.a(21), iVar);
        }
        return hVar3.G((yb.h) objY);
    }

    public static final u o(Executor executor) {
        u uVar;
        k0 k0Var = executor instanceof k0 ? (k0) executor : null;
        return (k0Var == null || (uVar = k0Var.f8562a) == null) ? new x0(executor) : uVar;
    }

    public static final f0 p(yb.h hVar) {
        yb.f fVarR = hVar.R(yb.d.f26087a);
        f0 f0Var = fVarR instanceof f0 ? (f0) fVarR : null;
        return f0Var == null ? c0.f8528a : f0Var;
    }

    public static final String q(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final d1 r(yb.h hVar) {
        d1 d1Var = (d1) hVar.R(v.f8599b);
        if (d1Var != null) {
            return d1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final k s(yb.c cVar) {
        k kVar;
        k kVar2;
        if (!(cVar instanceof nf.g)) {
            return new k(1, cVar);
        }
        nf.g gVar = (nf.g) cVar;
        app.nekogram.translator.r rVar = nf.b.f15816c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nf.g.f15826h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            kVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, rVar);
                kVar2 = null;
                break;
            }
            if (obj instanceof k) {
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, rVar)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                        break;
                    }
                }
                kVar2 = (k) obj;
                break loop0;
            }
            if (obj != rVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (kVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f8558g;
            Object obj2 = atomicReferenceFieldUpdater2.get(kVar2);
            if (!(obj2 instanceof r) || ((r) obj2).f8582d == null) {
                k.f8557f.set(kVar2, 536870911);
                atomicReferenceFieldUpdater2.set(kVar2, b.f8519a);
                kVar = kVar2;
            } else {
                kVar2.n();
            }
            if (kVar != null) {
                return kVar;
            }
        }
        return new k(2, cVar);
    }

    public static final void t(Throwable th2, yb.h hVar) {
        if (th2 instanceof h0) {
            th2 = ((h0) th2).f8545a;
        }
        try {
            w wVar = (w) hVar.R(v.f8598a);
            if (wVar != null) {
                wVar.o(th2, hVar);
            } else {
                nf.b.d(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                ub.a.a(runtimeException, th2);
                th2 = runtimeException;
            }
            nf.b.d(th2, hVar);
        }
    }

    public static final n0 u(d1 d1Var, boolean z10, g1 g1Var) {
        if (d1Var instanceof k1) {
            return ((k1) d1Var).U(z10, g1Var);
        }
        return d1Var.q(g1Var.k(), z10, new de.h(1, g1Var, g1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 2));
    }

    public static final boolean v(y yVar) {
        d1 d1Var = (d1) yVar.O().R(v.f8599b);
        if (d1Var != null) {
            return d1Var.b();
        }
        return true;
    }

    public static final boolean w(yb.h hVar) {
        d1 d1Var = (d1) hVar.R(v.f8599b);
        if (d1Var != null) {
            return d1Var.b();
        }
        return true;
    }

    public static final r1 x(y yVar, yb.h hVar, z zVar, ic.n nVar) {
        yb.h hVarZ = z(yVar, hVar);
        zVar.getClass();
        r1 l1Var = zVar == z.f8617b ? new l1(hVarZ, nVar) : new r1(hVarZ, true);
        l1Var.n0(zVar, l1Var, nVar);
        return l1Var;
    }

    public static /* synthetic */ r1 y(y yVar, yb.h hVar, z zVar, ic.n nVar, int i10) {
        if ((i10 & 1) != 0) {
            hVar = yb.i.f26088a;
        }
        if ((i10 & 2) != 0) {
            zVar = z.f8616a;
        }
        return x(yVar, hVar, zVar, nVar);
    }

    public static final yb.h z(y yVar, yb.h hVar) {
        yb.h hVarN = n(yVar.O(), hVar, true);
        pf.e eVar = l0.f8566a;
        return (hVarN == eVar || hVarN.R(yb.d.f26087a) != null) ? hVarN : hVarN.G(eVar);
    }
}
