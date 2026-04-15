package hf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class k1 implements d1, q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8563a = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8564b = AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public k1(boolean z10) {
        this._state$volatile = z10 ? a0.f8517j : a0.f8516i;
    }

    public static o a0(nf.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nf.j.f15839b;
            nf.j jVarF = jVar.f();
            if (jVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (nf.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarF;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof o) {
                    return (o) jVar;
                }
                if (jVar instanceof m1) {
                    return null;
                }
            }
        }
    }

    public static String i0(Object obj) {
        if (!(obj instanceof j1)) {
            return obj instanceof a1 ? ((a1) obj).b() ? "Active" : "New" : obj instanceof s ? "Cancelled" : "Completed";
        }
        j1 j1Var = (j1) obj;
        return j1Var.e() ? "Cancelling" : j1.f8553b.get(j1Var) == 1 ? "Completing" : "Active";
    }

    public final boolean A(Throwable th2) {
        if (V()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        n nVar = (n) f8564b.get(this);
        return (nVar == null || nVar == o1.f8575a) ? z10 : nVar.c(th2) || z10;
    }

    @Override // hf.d1
    public final n0 B(ic.k kVar) {
        return U(true, new o0(1, kVar));
    }

    public String C() {
        return "Job was cancelled";
    }

    public boolean E(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return w(th2) && M();
    }

    public final void F(a1 a1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8564b;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        if (nVar != null) {
            nVar.a();
            atomicReferenceFieldUpdater.set(this, o1.f8575a);
        }
        ce.j0 j0Var = null;
        s sVar = obj instanceof s ? (s) obj : null;
        Throwable th2 = sVar != null ? sVar.f8586a : null;
        if (a1Var instanceof g1) {
            try {
                ((g1) a1Var).l(th2);
                return;
            } catch (Throwable th3) {
                S(new ce.j0("Exception in completion handler " + a1Var + " for " + this, th3));
                return;
            }
        }
        m1 m1VarD = a1Var.d();
        if (m1VarD != null) {
            m1VarD.e(new nf.i(1), 1);
            Object obj2 = nf.j.f15838a.get(m1VarD);
            jc.l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (nf.j jVarH = (nf.j) obj2; !jVarH.equals(m1VarD); jVarH = jVarH.h()) {
                if (jVarH instanceof g1) {
                    try {
                        ((g1) jVarH).l(th2);
                    } catch (Throwable th4) {
                        if (j0Var != null) {
                            ub.a.a(j0Var, th4);
                        } else {
                            j0Var = new ce.j0("Exception in completion handler " + jVarH + " for " + this, th4);
                        }
                    }
                }
            }
            if (j0Var != null) {
                S(j0Var);
            }
        }
    }

    @Override // yb.h
    public final yb.h G(yb.h hVar) {
        return ud.b.C(this, hVar);
    }

    public final Throwable H(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        k1 k1Var = (k1) ((q1) obj);
        Object obj2 = f8563a.get(k1Var);
        if (obj2 instanceof j1) {
            thC = ((j1) obj2).c();
        } else if (obj2 instanceof s) {
            thC = ((s) obj2).f8586a;
        } else {
            if (obj2 instanceof a1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new e1("Parent job is ".concat(i0(obj2)), thC, k1Var) : cancellationException;
    }

    public final Object I(j1 j1Var, Object obj) {
        Throwable thK;
        s sVar = obj instanceof s ? (s) obj : null;
        Throwable th2 = sVar != null ? sVar.f8586a : null;
        synchronized (j1Var) {
            j1Var.e();
            ArrayList<Throwable> arrayListF = j1Var.f(th2);
            thK = K(j1Var, arrayListF);
            if (thK != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th3 : arrayListF) {
                    if (th3 != thK && th3 != thK && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        ub.a.a(thK, th3);
                    }
                }
            }
        }
        if (thK != null && thK != th2) {
            obj = new s(thK, false);
        }
        if (thK != null && (A(thK) || Q(thK))) {
            jc.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            s.f8585b.compareAndSet((s) obj, 0, 1);
        }
        d0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8563a;
        Object b1Var = obj instanceof a1 ? new b1((a1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, j1Var, b1Var) && atomicReferenceFieldUpdater.get(this) == j1Var) {
        }
        F(j1Var, obj);
        return obj;
    }

    public final Object J() throws Throwable {
        Object obj = f8563a.get(this);
        if (obj instanceof a1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof s) {
            throw ((s) obj).f8586a;
        }
        return a0.F(obj);
    }

    public final Throwable K(j1 j1Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (j1Var.e()) {
                return new e1(C(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof w1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof w1)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // yb.h
    public final yb.h L(yb.g gVar) {
        return ud.b.z(this, gVar);
    }

    public boolean M() {
        return true;
    }

    public boolean N() {
        return this instanceof q;
    }

    public final m1 P(a1 a1Var) {
        m1 m1VarD = a1Var.d();
        if (m1VarD != null) {
            return m1VarD;
        }
        if (a1Var instanceof p0) {
            return new m1();
        }
        if (a1Var instanceof g1) {
            g0((g1) a1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + a1Var).toString());
    }

    public boolean Q(Throwable th2) {
        return false;
    }

    @Override // yb.h
    public final yb.f R(yb.g gVar) {
        return ud.b.o(this, gVar);
    }

    public final void T(d1 d1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8564b;
        o1 o1Var = o1.f8575a;
        if (d1Var == null) {
            atomicReferenceFieldUpdater.set(this, o1Var);
            return;
        }
        d1Var.start();
        n nVarC0 = d1Var.c0(this);
        atomicReferenceFieldUpdater.set(this, nVarC0);
        if (f8563a.get(this) instanceof a1) {
            return;
        }
        nVarC0.a();
        atomicReferenceFieldUpdater.set(this, o1Var);
    }

    public final n0 U(boolean z10, g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o1 o1Var;
        boolean z11;
        boolean zE;
        g1Var.f8542d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f8563a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z12 = obj instanceof p0;
            o1Var = o1.f8575a;
            z11 = true;
            if (!z12) {
                if (!(obj instanceof a1)) {
                    z11 = false;
                    break;
                }
                a1 a1Var = (a1) obj;
                m1 m1VarD = a1Var.d();
                if (m1VarD == null) {
                    g0((g1) obj);
                } else {
                    if (g1Var.k()) {
                        j1 j1Var = a1Var instanceof j1 ? (j1) a1Var : null;
                        Throwable thC = j1Var != null ? j1Var.c() : null;
                        if (thC == null) {
                            zE = m1VarD.e(g1Var, 5);
                        } else if (z10) {
                            g1Var.l(thC);
                            return o1Var;
                        }
                    } else {
                        zE = m1VarD.e(g1Var, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                p0 p0Var = (p0) obj;
                if (p0Var.f8576a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                f0(p0Var);
            }
        }
        if (z11) {
            return g1Var;
        }
        if (z10) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            s sVar = obj2 instanceof s ? (s) obj2 : null;
            g1Var.l(sVar != null ? sVar.f8586a : null);
        }
        return o1Var;
    }

    public boolean V() {
        return this instanceof f;
    }

    public final boolean W(Object obj) {
        Object objJ0;
        do {
            objJ0 = j0(f8563a.get(this), obj);
            if (objJ0 == a0.f8511d) {
                return false;
            }
            if (objJ0 == a0.f8512e) {
                return true;
            }
        } while (objJ0 == a0.f8513f);
        l(objJ0);
        return true;
    }

    public final Object X(Object obj) {
        Object objJ0;
        do {
            objJ0 = j0(f8563a.get(this), obj);
            if (objJ0 == a0.f8511d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                s sVar = obj instanceof s ? (s) obj : null;
                throw new IllegalStateException(str, sVar != null ? sVar.f8586a : null);
            }
        } while (objJ0 == a0.f8513f);
        return objJ0;
    }

    @Override // hf.d1
    public final Object Y(ac.c cVar) {
        Object obj;
        ub.a0 a0Var;
        do {
            obj = f8563a.get(this);
            boolean z10 = obj instanceof a1;
            a0Var = ub.a0.f21526a;
            if (!z10) {
                a0.m(cVar.s());
                return a0Var;
            }
        } while (h0(obj) < 0);
        k kVar = new k(1, ud.s.p(cVar));
        kVar.r();
        kVar.x(new h(2, a0.u(this, true, new m(kVar, 1))));
        Object objQ = kVar.q();
        zb.a aVar = zb.a.f26667a;
        if (objQ != aVar) {
            objQ = a0Var;
        }
        return objQ == aVar ? objQ : a0Var;
    }

    public String Z() {
        return getClass().getSimpleName();
    }

    @Override // hf.d1
    public boolean b() {
        Object obj = f8563a.get(this);
        return (obj instanceof a1) && ((a1) obj).b();
    }

    public final void b0(m1 m1Var, Throwable th2) {
        m1Var.e(new nf.i(4), 4);
        Object obj = nf.j.f15838a.get(m1Var);
        jc.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        ce.j0 j0Var = null;
        for (nf.j jVarH = (nf.j) obj; !jVarH.equals(m1Var); jVarH = jVarH.h()) {
            if ((jVarH instanceof g1) && ((g1) jVarH).k()) {
                try {
                    ((g1) jVarH).l(th2);
                } catch (Throwable th3) {
                    if (j0Var != null) {
                        ub.a.a(j0Var, th3);
                    } else {
                        j0Var = new ce.j0("Exception in completion handler " + jVarH + " for " + this, th3);
                    }
                }
            }
        }
        if (j0Var != null) {
            S(j0Var);
        }
        A(th2);
    }

    @Override // hf.d1
    public final n c0(k1 k1Var) {
        o oVar = new o(k1Var);
        oVar.f8542d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8563a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                if (p0Var.f8576a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                f0(p0Var);
            } else {
                boolean z10 = obj instanceof a1;
                o1 o1Var = o1.f8575a;
                if (!z10) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    s sVar = obj2 instanceof s ? (s) obj2 : null;
                    oVar.l(sVar != null ? sVar.f8586a : null);
                    return o1Var;
                }
                m1 m1VarD = ((a1) obj).d();
                if (m1VarD == null) {
                    g0((g1) obj);
                } else if (!m1VarD.e(oVar, 7)) {
                    boolean zE = m1VarD.e(oVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof j1) {
                        thC = ((j1) obj3).c();
                    } else {
                        s sVar2 = obj3 instanceof s ? (s) obj3 : null;
                        if (sVar2 != null) {
                            thC = sVar2.f8586a;
                        }
                    }
                    oVar.l(thC);
                    if (zE) {
                        break loop0;
                    }
                    return o1Var;
                }
            }
        }
        return oVar;
    }

    public final void f0(p0 p0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m1 m1Var = new m1();
        Object z0Var = m1Var;
        if (!p0Var.f8576a) {
            z0Var = new z0(m1Var);
        }
        do {
            atomicReferenceFieldUpdater = f8563a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, p0Var, z0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == p0Var);
    }

    @Override // hf.d1
    public void g(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new e1(C(), null, this);
        }
        x(cancellationException);
    }

    public final void g0(g1 g1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m1 m1Var = new m1();
        g1Var.getClass();
        nf.j.f15839b.set(m1Var, g1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = nf.j.f15838a;
        atomicReferenceFieldUpdater2.set(m1Var, g1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(g1Var) == g1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(g1Var, g1Var, m1Var)) {
                    if (atomicReferenceFieldUpdater2.get(g1Var) != g1Var) {
                        break;
                    }
                }
                m1Var.g(g1Var);
                break loop0;
            }
            break;
        }
        nf.j jVarH = g1Var.h();
        do {
            atomicReferenceFieldUpdater = f8563a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, g1Var, jVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == g1Var);
    }

    @Override // yb.f
    public final yb.g getKey() {
        return v.f8599b;
    }

    public final int h0(Object obj) {
        boolean z10 = obj instanceof p0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8563a;
        if (z10) {
            if (((p0) obj).f8576a) {
                return 0;
            }
            p0 p0Var = a0.f8517j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            e0();
            return 1;
        }
        if (!(obj instanceof z0)) {
            return 0;
        }
        m1 m1Var = ((z0) obj).f8621a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        e0();
        return 1;
    }

    public Object i() {
        return J();
    }

    public final Object j0(Object obj, Object obj2) {
        if (!(obj instanceof a1)) {
            return a0.f8511d;
        }
        if (((obj instanceof p0) || (obj instanceof g1)) && !(obj instanceof o) && !(obj2 instanceof s)) {
            a1 a1Var = (a1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8563a;
            Object b1Var = obj2 instanceof a1 ? new b1((a1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, a1Var, b1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != a1Var) {
                    return a0.f8513f;
                }
            }
            d0(obj2);
            F(a1Var, obj2);
            return obj2;
        }
        a1 a1Var2 = (a1) obj;
        m1 m1VarP = P(a1Var2);
        if (m1VarP == null) {
            return a0.f8513f;
        }
        j1 j1Var = a1Var2 instanceof j1 ? (j1) a1Var2 : null;
        if (j1Var == null) {
            j1Var = new j1(m1VarP, null);
        }
        synchronized (j1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j1.f8553b;
            if (atomicIntegerFieldUpdater.get(j1Var) == 1) {
                return a0.f8511d;
            }
            atomicIntegerFieldUpdater.set(j1Var, 1);
            if (j1Var != a1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8563a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, a1Var2, j1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != a1Var2) {
                        return a0.f8513f;
                    }
                }
            }
            boolean zE = j1Var.e();
            s sVar = obj2 instanceof s ? (s) obj2 : null;
            if (sVar != null) {
                j1Var.a(sVar.f8586a);
            }
            Throwable thC = zE ? null : j1Var.c();
            if (thC != null) {
                b0(m1VarP, thC);
            }
            o oVarA0 = a0(m1VarP);
            if (oVarA0 != null && k0(j1Var, oVarA0, obj2)) {
                return a0.f8512e;
            }
            m1VarP.e(new nf.i(2), 2);
            o oVarA02 = a0(m1VarP);
            return (oVarA02 == null || !k0(j1Var, oVarA02, obj2)) ? I(j1Var, obj2) : a0.f8512e;
        }
    }

    public final boolean k0(j1 j1Var, o oVar, Object obj) {
        while (a0.u(oVar.f8572e, false, new i1(this, j1Var, oVar, obj)) == o1.f8575a) {
            oVar = a0(oVar);
            if (oVar == null) {
                return false;
            }
        }
        return true;
    }

    public Object n(ac.i iVar) {
        return r(iVar);
    }

    public void p(Object obj) {
        l(obj);
    }

    @Override // hf.d1
    public final n0 q(boolean z10, boolean z11, de.h hVar) {
        return U(z11, z10 ? new c1(hVar) : new o0(1, hVar));
    }

    public final Object r(ac.c cVar) throws Throwable {
        Object obj;
        do {
            obj = f8563a.get(this);
            if (!(obj instanceof a1)) {
                if (obj instanceof s) {
                    throw ((s) obj).f8586a;
                }
                return a0.F(obj);
            }
        } while (h0(obj) < 0);
        h1 h1Var = new h1(ud.s.p(cVar), this);
        h1Var.r();
        h1Var.x(new h(2, a0.u(this, true, new o0(2, h1Var))));
        return h1Var.q();
    }

    @Override // hf.d1
    public final boolean start() {
        int iH0;
        do {
            iH0 = h0(f8563a.get(this));
            if (iH0 == 0) {
                return false;
            }
        } while (iH0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Z() + '{' + i0(f8563a.get(this)) + '}');
        sb.append('@');
        sb.append(a0.q(this));
        return sb.toString();
    }

    @Override // hf.d1
    public final CancellationException u() {
        CancellationException cancellationException;
        Object obj = f8563a.get(this);
        if (!(obj instanceof j1)) {
            if (obj instanceof a1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof s)) {
                return new e1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((s) obj).f8586a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new e1(C(), th2, this) : cancellationException;
        }
        Throwable thC = ((j1) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = C();
        }
        return new e1(strConcat, thC, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.k1.w(java.lang.Object):boolean");
    }

    public void x(CancellationException cancellationException) {
        w(cancellationException);
    }

    @Override // yb.h
    public final Object y(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }

    public void e0() {
    }

    public void S(ce.j0 j0Var) {
        throw j0Var;
    }

    public void d0(Object obj) {
    }

    public void l(Object obj) {
    }
}
