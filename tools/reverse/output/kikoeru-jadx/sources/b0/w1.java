package b0;

import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.Pair;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import b7.c2;
import b7.d4;
import b7.e4;
import b7.f4;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i7.p2;
import i7.s2;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import r.b2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class w1 implements k1.e, lh.g0, oe.e, b2, o6.l, ud.q, ud.o, ud.p, ug.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1397e;

    public /* synthetic */ w1(int i10, Object obj) {
        this.f1393a = i10;
        this.f1395c = obj;
    }

    public static void Z(w1 w1Var, zg.k kVar, zg.n nVar, zg.k kVar2, int i10) {
        bd.f0 f0Var;
        if ((i10 & 1) != 0) {
            kVar = null;
        }
        if ((i10 & 2) != 0) {
            nVar = null;
        }
        if ((i10 & 4) != 0) {
            kVar2 = null;
        }
        w1Var.getClass();
        TimeZone timeZone = wg.g.f24231a;
        boolean zIsShutdown = ((ThreadPoolExecutor) w1Var.B()).isShutdown();
        synchronized (w1Var) {
            if (nVar != null) {
                try {
                    if (!((ArrayDeque) w1Var.f1394b).remove(nVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (kVar2 != null) {
                kVar2.f26864b.decrementAndGet();
                if (!((ArrayDeque) w1Var.f1397e).remove(kVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (kVar != null) {
                ((ArrayDeque) w1Var.f1396d).add(kVar);
                zg.k kVarC = w1Var.C(((ug.t) kVar.f26865c.f26869b.f1650b).f21872d);
                if (kVarC != null) {
                    kVar.f26864b = kVarC.f26864b;
                }
            }
            if ((nVar != null || kVar2 != null) && (zIsShutdown || ((ArrayDeque) w1Var.f1397e).isEmpty())) {
                ((ArrayDeque) w1Var.f1394b).isEmpty();
            }
            if (zIsShutdown) {
                List listG0 = vb.m.G0((ArrayDeque) w1Var.f1396d);
                ((ArrayDeque) w1Var.f1396d).clear();
                f0Var = new bd.f0(listG0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) w1Var.f1396d).iterator();
                jc.l.d(it, "iterator(...)");
                while (it.hasNext()) {
                    zg.k kVar3 = (zg.k) it.next();
                    if (((ArrayDeque) w1Var.f1397e).size() >= 64) {
                        break;
                    }
                    if (kVar3.f26864b.get() < 5) {
                        it.remove();
                        kVar3.f26864b.incrementAndGet();
                        arrayList.add(kVar3);
                        ((ArrayDeque) w1Var.f1397e).add(kVar3);
                    }
                }
                f0Var = new bd.f0(arrayList);
            }
        }
        int size = f0Var.f2567a.size();
        for (int i11 = 0; i11 < size; i11++) {
            zg.k kVar4 = (zg.k) f0Var.f2567a.get(i11);
            if (kVar4 != kVar) {
                zg.n nVar2 = kVar4.f26865c;
            }
            if (zIsShutdown) {
                kVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                zg.n nVar3 = kVar4.f26865c;
                nVar3.j(interruptedIOException);
                kVar4.f26863a.r(nVar3, interruptedIOException);
            } else {
                ExecutorService executorServiceB = w1Var.B();
                kVar4.getClass();
                zg.n nVar4 = kVar4.f26865c;
                jc.l.e(nVar4.f26868a.f21907a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceB).execute(kVar4);
                    } catch (Throwable th3) {
                        w1 w1Var2 = nVar4.f26868a.f21907a;
                        w1Var2.getClass();
                        Z(w1Var2, null, null, kVar4, 3);
                        throw th3;
                    }
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e10);
                    zg.n nVar5 = kVar4.f26865c;
                    nVar5.j(interruptedIOException2);
                    kVar4.f26863a.r(nVar5, interruptedIOException2);
                    w1 w1Var3 = nVar4.f26868a.f21907a;
                    w1Var3.getClass();
                    Z(w1Var3, null, null, kVar4, 3);
                }
            }
        }
    }

    public static void b0(long j10, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public void A(c2.l lVar, boolean z10) {
        c2.z zVar = (c2.z) this.f1394b;
        ?? r12 = lVar.f3309a;
        Collection collection = (Collection) r12;
        int size = collection.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((c2.t) r12.get(i10)).b()) {
                f0(lVar);
                return;
            }
        }
        g2.c0 c0Var = (g2.c0) this.f1395c;
        if (c0Var == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        c2.s.g(lVar, c0Var.H(0L), new o1(2, this, zVar), false);
        if (((c2.y) this.f1396d) == c2.y.f3352b) {
            if (z10) {
                int size2 = collection.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((c2.t) r12.get(i11)).a();
                }
            }
            b7.n nVar = lVar.f3310b;
            if (nVar != null) {
                nVar.f1984b = !zVar.f3357c;
            }
        }
    }

    public synchronized ExecutorService B() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f1395c) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = wg.g.f24232b + " Dispatcher";
                jc.l.e(str, "name");
                this.f1395c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new wg.f(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f1395c;
            jc.l.b(threadPoolExecutor);
        } catch (Throwable th2) {
            throw th2;
        }
        return threadPoolExecutor;
    }

    public zg.k C(String str) {
        Iterator it = ((ArrayDeque) this.f1397e).iterator();
        jc.l.d(it, "iterator(...)");
        while (it.hasNext()) {
            zg.k kVar = (zg.k) it.next();
            if (jc.l.a(((ug.t) kVar.f26865c.f26869b.f1650b).f21872d, str)) {
                return kVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f1396d).iterator();
        jc.l.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            zg.k kVar2 = (zg.k) it2.next();
            if (jc.l.a(((ug.t) kVar2.f26865c.f26869b.f1650b).f21872d, str)) {
                return kVar2;
            }
        }
        return null;
    }

    public void E(b7.h hVar) {
        c2 c2Var = (c2) ((WeakReference) this.f1397e).get();
        if (c2Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            b7.g gVar = (b7.g) hVar.f1802c.poll();
            if (gVar == null) {
                hVar.f1805f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            b7.h hVar2 = hVar;
            p4.c0.R(c2Var.f1685l, new b5.h(c2Var, M(hVar.f1800a), new b7.e(this, gVar, atomicBoolean2, hVar2, atomicBoolean)));
            atomicBoolean2.set(false);
            hVar = hVar2;
        }
    }

    public void F(final b7.t1 t1Var) {
        synchronized (this.f1394b) {
            try {
                b7.h hVar = (b7.h) ((o.e) this.f1396d).get(t1Var);
                if (hVar == null) {
                    return;
                }
                final m4.u0 u0Var = hVar.f1806g;
                hVar.f1806g = m4.u0.f14591b;
                hVar.f1802c.add(new b7.g(t1Var, u0Var) { // from class: b7.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ t1 f1703b;

                    @Override // b7.g
                    public final cb.y run() {
                        c2 c2Var = (c2) ((WeakReference) this.f1702a.f1397e).get();
                        if (c2Var != null) {
                            c2Var.o(this.f1703b);
                        }
                        return cb.v.f3880b;
                    }
                });
                if (hVar.f1805f) {
                    return;
                }
                hVar.f1805f = true;
                E(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m4.u0 G(b7.t1 t1Var) {
        synchronized (this.f1394b) {
            try {
                b7.h hVar = (b7.h) ((o.e) this.f1396d).get(t1Var);
                if (hVar == null) {
                    return null;
                }
                return hVar.f1804e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // r.x1
    public r.p H(long j10, r.p pVar, r.p pVar2, r.p pVar3) {
        if (((r.p) this.f1397e) == null) {
            this.f1397e = pVar3.c();
        }
        r.p pVar4 = (r.p) this.f1397e;
        if (pVar4 == null) {
            jc.l.k("velocityVector");
            throw null;
        }
        int iB = pVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            r.p pVar5 = (r.p) this.f1397e;
            if (pVar5 == null) {
                jc.l.k("velocityVector");
                throw null;
            }
            pVar5.e(((r.y1) this.f1395c).V(i10).b(j10, pVar.a(i10), pVar2.a(i10), pVar3.a(i10)), i10);
        }
        r.p pVar6 = (r.p) this.f1397e;
        if (pVar6 != null) {
            return pVar6;
        }
        jc.l.k("velocityVector");
        throw null;
    }

    public c J(Object obj) {
        c cVar = (c) this.f1396d;
        if (this.f1394b == obj && cVar != null) {
            return cVar;
        }
        o.k0 k0Var = (o.k0) this.f1397e;
        Object objG = k0Var.g(obj);
        if (objG == null) {
            c cVar2 = (c) this.f1395c;
            c cVar3 = new c();
            cVar3.f1204a = cVar2.f1204a;
            cVar3.f1205b = cVar2.f1205b;
            k0Var.m(obj, cVar3);
            objG = cVar3;
        }
        c cVar4 = (c) objG;
        this.f1394b = obj;
        this.f1396d = cVar4;
        return cVar4;
    }

    public yc.e K(be.b bVar, List list) {
        jc.l.e(bVar, "classId");
        return (yc.e) ((re.e) this.f1394b).a(new yc.b0(bVar, list));
    }

    public ya.i0 L() {
        ya.i0 i0VarQ;
        synchronized (this.f1394b) {
            i0VarQ = ya.i0.q(((o.e) this.f1395c).values());
        }
        return i0VarQ;
    }

    public b7.t1 M(Object obj) {
        b7.t1 t1Var;
        synchronized (this.f1394b) {
            t1Var = (b7.t1) ((o.e) this.f1395c).get(obj);
        }
        return t1Var;
    }

    public c7.k1 N() {
        c7.s sVar = ((c7.f0) this.f1394b).f3627f;
        if (sVar != null) {
            return sVar.f3722d;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }

    public d4 O(b7.t1 t1Var) {
        b7.h hVar;
        synchronized (this.f1394b) {
            hVar = (b7.h) ((o.e) this.f1396d).get(t1Var);
        }
        if (hVar != null) {
            return hVar.f1801b;
        }
        return null;
    }

    public r.p P(r.p pVar, r.p pVar2) {
        if (((r.p) this.f1394b) == null) {
            this.f1394b = pVar.c();
        }
        r.p pVar3 = (r.p) this.f1394b;
        if (pVar3 == null) {
            jc.l.k("targetVector");
            throw null;
        }
        int i10 = 0;
        for (int iB = pVar3.b(); i10 < iB; iB = iB) {
            r.p pVar4 = (r.p) this.f1394b;
            if (pVar4 == null) {
                jc.l.k("targetVector");
                throw null;
            }
            p2 p2Var = (p2) this.f1395c;
            float fA = pVar.a(i10);
            float fA2 = pVar2.a(i10);
            q.v0 v0Var = (q.v0) p2Var.f9258a;
            double dB = v0Var.b(fA2);
            double d10 = q.w0.f17468a;
            float f10 = v0Var.f17464a * v0Var.f17465b;
            pVar4.e((Math.signum(fA2) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dB) * ((double) f10)))) + fA, i10);
            i10++;
        }
        r.p pVar5 = (r.p) this.f1394b;
        if (pVar5 != null) {
            return pVar5;
        }
        jc.l.k("targetVector");
        throw null;
    }

    public r.p Q(long j10, r.p pVar, r.p pVar2) {
        if (((r.p) this.f1397e) == null) {
            this.f1397e = pVar.c();
        }
        r.p pVar3 = (r.p) this.f1397e;
        if (pVar3 == null) {
            jc.l.k("velocityVector");
            throw null;
        }
        int iB = pVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            r.p pVar4 = (r.p) this.f1397e;
            if (pVar4 == null) {
                jc.l.k("velocityVector");
                throw null;
            }
            p2 p2Var = (p2) this.f1395c;
            pVar.getClass();
            long j11 = j10 / 1000000;
            q.u0 u0VarA = ((q.v0) p2Var.f9258a).a(pVar2.a(i10));
            long j12 = u0VarA.f17460c;
            pVar4.e((((Math.signum(u0VarA.f17458a) * q.b.a(j12 > 0 ? j11 / j12 : 1.0f).f17229b) * u0VarA.f17459b) / j12) * 1000.0f, i10);
        }
        r.p pVar5 = (r.p) this.f1397e;
        if (pVar5 != null) {
            return pVar5;
        }
        jc.l.k("velocityVector");
        throw null;
    }

    public androidx.lifecycle.s0 R(String str, pc.c cVar) {
        androidx.lifecycle.s0 s0Var;
        androidx.lifecycle.s0 s0VarA;
        jc.l.e(cVar, "modelClass");
        jc.l.e(str, "key");
        synchronized (((k4.c) this.f1394b)) {
            try {
                androidx.lifecycle.w0 w0Var = (androidx.lifecycle.w0) this.f1395c;
                w0Var.getClass();
                s0Var = (androidx.lifecycle.s0) w0Var.f821a.get(str);
                if (cVar.z(s0Var)) {
                    androidx.lifecycle.u0 u0Var = (androidx.lifecycle.u0) this.f1396d;
                    if (u0Var instanceof androidx.lifecycle.q0) {
                        androidx.lifecycle.q0 q0Var = (androidx.lifecycle.q0) u0Var;
                        jc.l.b(s0Var);
                        androidx.lifecycle.q qVar = q0Var.f805d;
                        if (qVar != null) {
                            v2.e eVar = q0Var.f806e;
                            jc.l.b(eVar);
                            androidx.lifecycle.m0.a(s0Var, eVar, qVar);
                        }
                    }
                    jc.l.c(s0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    i4.e eVar2 = new i4.e((i4.b) this.f1397e);
                    eVar2.f9002a.put(androidx.lifecycle.v0.f819b, str);
                    androidx.lifecycle.u0 u0Var2 = (androidx.lifecycle.u0) this.f1396d;
                    jc.l.e(u0Var2, "factory");
                    try {
                        try {
                            s0VarA = u0Var2.b(cVar, eVar2);
                        } catch (AbstractMethodError unused) {
                            s0VarA = u0Var2.a(g8.a.D(cVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        s0VarA = u0Var2.c(g8.a.D(cVar), eVar2);
                    }
                    s0Var = s0VarA;
                    androidx.lifecycle.w0 w0Var2 = (androidx.lifecycle.w0) this.f1395c;
                    w0Var2.getClass();
                    jc.l.e(s0Var, "viewModel");
                    androidx.lifecycle.s0 s0Var2 = (androidx.lifecycle.s0) w0Var2.f821a.put(str, s0Var);
                    if (s0Var2 != null) {
                        s0Var2.k();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s0Var;
    }

    public boolean S(b7.t1 t1Var) {
        boolean z10;
        synchronized (this.f1394b) {
            z10 = ((o.e) this.f1396d).get(t1Var) != null;
        }
        return z10;
    }

    public boolean T(b7.t1 t1Var, int i10) {
        b7.h hVar;
        synchronized (this.f1394b) {
            hVar = (b7.h) ((o.e) this.f1396d).get(t1Var);
        }
        c2 c2Var = (c2) ((WeakReference) this.f1397e).get();
        return hVar != null && hVar.f1804e.a(i10) && c2Var != null && c2Var.f1693t.m().a(i10);
    }

    public boolean U(yc.p0 p0Var) {
        if (((yc.p0) this.f1396d).equals(p0Var)) {
            return true;
        }
        w1 w1Var = (w1) this.f1395c;
        return w1Var != null ? w1Var.U(p0Var) : false;
    }

    public boolean V(b7.t1 t1Var, int i10) {
        b7.h hVar;
        synchronized (this.f1394b) {
            hVar = (b7.h) ((o.e) this.f1396d).get(t1Var);
        }
        if (hVar == null) {
            return false;
        }
        f4 f4Var = hVar.f1803d;
        f4Var.getClass();
        boolean z10 = false;
        p4.c.b("Use contains(Command) for custom command", i10 != 0);
        Iterator<E> it = f4Var.f1778a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((e4) it.next()).f1761a == i10) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    public boolean W(b7.t1 t1Var, e4 e4Var) {
        b7.h hVar;
        synchronized (this.f1394b) {
            hVar = (b7.h) ((o.e) this.f1396d).get(t1Var);
        }
        if (hVar == null) {
            return false;
        }
        ya.m0 m0Var = hVar.f1803d.f1778a;
        e4Var.getClass();
        return m0Var.contains(e4Var);
    }

    public void X(s2 s2Var, ic.n nVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f1394b;
        try {
            reentrantLock.lock();
            if (s2Var != null) {
                this.f1397e = s2Var;
            }
            nVar.q((i7.w) this.f1395c, (i7.w) this.f1396d);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void Y() {
        c7.t tVar = new c7.t(this, (c7.f0) this.f1394b);
        this.f1396d = tVar;
        tVar.onCreate();
    }

    @Override // r.x1
    public /* synthetic */ boolean a() {
        return false;
    }

    public void a0(b7.t1 t1Var) {
        synchronized (this.f1394b) {
            try {
                b7.h hVar = (b7.h) ((o.e) this.f1396d).remove(t1Var);
                if (hVar == null) {
                    return;
                }
                ((o.e) this.f1395c).remove(hVar.f1800a);
                hVar.f1801b.a();
                c2 c2Var = (c2) ((WeakReference) this.f1397e).get();
                if (c2Var == null || c2Var.h()) {
                    return;
                }
                p4.c0.R(c2Var.f1685l, new b7.c(c2Var, t1Var, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ud.o, ud.p
    public void b() {
        switch (this.f1393a) {
            case 19:
                ArrayList arrayList = (ArrayList) this.f1396d;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((m0.w) this.f1397e).f13783c).put((ud.t) this.f1395c, arrayList);
                }
                break;
            case 20:
                ((id.h) this.f1396d).b();
                ((ArrayList) ((w1) this.f1397e).f1395c).add(new ge.a((zc.b) vb.m.x0((ArrayList) this.f1394b)));
                break;
            default:
                id.h hVar = (id.h) this.f1394b;
                be.e eVar = (be.e) this.f1397e;
                ArrayList arrayList2 = (ArrayList) this.f1395c;
                hVar.getClass();
                jc.l.e(arrayList2, "elements");
                if (eVar != null) {
                    bd.y0 y0VarJ = a2.c.J(eVar, (yc.e) hVar.f9508e);
                    if (y0VarJ != null) {
                        HashMap map = (HashMap) hVar.f9506c;
                        List listD = bf.m.d(arrayList2);
                        se.w wVarB = y0VarJ.b();
                        jc.l.d(wVarB, "getType(...)");
                        map.put(eVar, new ge.x(listD, wVarB));
                        break;
                    } else if (((b7.b1) hVar.f9507d).z((be.b) hVar.f9510g) && jc.l.a(eVar.b(), "value")) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            if (obj instanceof ge.a) {
                                arrayList3.add(obj);
                            }
                        }
                        List list = (List) hVar.f9509f;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            list.add((zc.b) ((ge.a) it.next()).f7527a);
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // ud.p
    public void c(ge.f fVar) {
        ((ArrayList) this.f1395c).add(new ge.s(new ge.q(fVar)));
    }

    @Override // ud.o
    public void d(be.e eVar, Object obj) {
        ((id.h) this.f1395c).d(eVar, obj);
    }

    @Override // ud.q
    public ud.o e(be.b bVar, dd.a aVar) {
        return ((b7.b1) ((m0.w) this.f1397e).f13782b).D(bVar, aVar, (ArrayList) this.f1396d);
    }

    public z4.b e0(List list) {
        z4.b bVar;
        HashMap map = (HashMap) this.f1397e;
        ArrayList arrayListZ = z(list);
        if (arrayListZ.size() < 2) {
            return (z4.b) ya.q.j(arrayListZ, null);
        }
        Collections.sort(arrayListZ, new androidx.media3.exoplayer.offline.i(23));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((z4.b) arrayListZ.get(0)).f26387c;
        int i12 = 0;
        while (true) {
            if (i12 >= arrayListZ.size()) {
                break;
            }
            z4.b bVar2 = (z4.b) arrayListZ.get(i12);
            if (i11 == bVar2.f26387c) {
                arrayList.add(new Pair(bVar2.f26386b, Integer.valueOf(bVar2.f26388d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (z4.b) arrayListZ.get(0);
            }
        }
        z4.b bVar3 = (z4.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListZ.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < listSubList.size(); i14++) {
            i13 += ((z4.b) listSubList.get(i14)).f26388d;
        }
        int iNextInt = ((Random) this.f1394b).nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= listSubList.size()) {
                bVar = (z4.b) ya.q.k(listSubList);
                break;
            }
            bVar = (z4.b) listSubList.get(i10);
            i15 += bVar.f26388d;
            if (iNextInt < i15) {
                break;
            }
            i10++;
        }
        map.put(arrayList, bVar);
        return bVar;
    }

    @Override // o6.l
    public /* synthetic */ o6.d f(byte[] bArr, int i10, int i11) {
        int i12 = this.f1393a;
        return j2.h0.a(this, bArr, i11);
    }

    public void f0(c2.l lVar) {
        if (((c2.y) this.f1396d) == c2.y.f3352b) {
            g2.c0 c0Var = (g2.c0) this.f1395c;
            if (c0Var == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            c2.s.g(lVar, c0Var.H(0L), new a0.f0(6, (c2.z) this.f1394b), true);
        }
        this.f1396d = c2.y.f3353c;
    }

    @Override // r.x1
    public r.p g(long j10, r.p pVar, r.p pVar2, r.p pVar3) {
        if (((r.p) this.f1396d) == null) {
            this.f1396d = pVar.c();
        }
        r.p pVar4 = (r.p) this.f1396d;
        if (pVar4 == null) {
            jc.l.k("valueVector");
            throw null;
        }
        int iB = pVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            r.p pVar5 = (r.p) this.f1396d;
            if (pVar5 == null) {
                jc.l.k("valueVector");
                throw null;
            }
            pVar5.e(((r.y1) this.f1395c).V(i10).e(j10, pVar.a(i10), pVar2.a(i10), pVar3.a(i10)), i10);
        }
        r.p pVar6 = (r.p) this.f1396d;
        if (pVar6 != null) {
            return pVar6;
        }
        jc.l.k("valueVector");
        throw null;
    }

    public id.h g0(int i10, be.b bVar, dd.a aVar) {
        ud.t tVar = new ud.t(((ud.t) this.f1395c).f21602a + '@' + i10);
        m0.w wVar = (m0.w) this.f1394b;
        HashMap map = (HashMap) wVar.f13783c;
        List arrayList = (List) map.get(tVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(tVar, arrayList);
        }
        return ((b7.b1) wVar.f13782b).D(bVar, aVar, arrayList);
    }

    @Override // ud.o
    public void h(be.e eVar, ge.f fVar) {
        ((id.h) this.f1395c).h(eVar, fVar);
    }

    @Override // ud.p
    public ud.o i(be.b bVar) {
        ArrayList arrayList = new ArrayList();
        return new w1(((b7.b1) this.f1396d).C(bVar, yc.m0.p0, arrayList), this, arrayList);
    }

    @Override // ud.p
    public void j(be.b bVar, be.e eVar) {
        ((ArrayList) this.f1395c).add(new ge.i(bVar, eVar));
    }

    @Override // ud.o
    public void k(be.e eVar, be.b bVar, be.e eVar2) {
        ((id.h) this.f1395c).k(eVar, bVar, eVar2);
    }

    @Override // ud.o
    public ud.p l(be.e eVar) {
        return ((id.h) this.f1395c).l(eVar);
    }

    @Override // lh.g0
    public lh.h0 m() {
        return (mh.e) this.f1397e;
    }

    @Override // r.x1
    public long n(r.p pVar, r.p pVar2, r.p pVar3) {
        int iB = pVar.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, ((r.y1) this.f1395c).V(i10).c(pVar.a(i10), pVar2.a(i10), pVar3.a(i10)));
        }
        return jMax;
    }

    @Override // ud.p
    public void o(Object obj) {
        ((ArrayList) this.f1395c).add(b7.b1.d((b7.b1) this.f1396d, (be.e) this.f1397e, obj));
    }

    @Override // oe.e
    public oe.d p(be.b bVar) {
        jc.l.e(bVar, "classId");
        wd.k kVar = (wd.k) ((LinkedHashMap) this.f1394b).get(bVar);
        if (kVar == null) {
            return null;
        }
        yd.g gVar = (yd.g) this.f1395c;
        xd.a aVar = (xd.a) this.f1396d;
        ((oe.b0) this.f1397e).a(bVar);
        return new oe.d(gVar, kVar, aVar, yc.m0.p0);
    }

    @Override // ud.o
    public ud.o q(be.b bVar, be.e eVar) {
        return ((id.h) this.f1395c).q(bVar, eVar);
    }

    @Override // ug.i
    public void r(zg.n nVar, IOException iOException) {
        ArrayList arrayList = (ArrayList) this.f1395c;
        synchronized (arrayList) {
            arrayList.add(iOException);
        }
        ((CountDownLatch) this.f1396d).countDown();
    }

    @Override // o6.l
    public /* synthetic */ void reset() {
        int i10 = this.f1393a;
    }

    @Override // ug.i
    public void s(zg.n nVar, ug.d0 d0Var) {
        String str = (String) this.f1397e;
        ArrayList arrayList = (ArrayList) this.f1394b;
        ArrayList arrayList2 = (ArrayList) this.f1395c;
        try {
            ArrayList arrayListC = vg.a.c(str, d0Var);
            synchronized (arrayList) {
                arrayList.addAll(arrayListC);
            }
        } catch (Exception e10) {
            synchronized (arrayList2) {
                arrayList2.add(e10);
            }
        }
        ((CountDownLatch) this.f1396d).countDown();
    }

    @Override // r.x1
    public r.p t(r.p pVar, r.p pVar2, r.p pVar3) {
        if (((r.p) this.f1394b) == null) {
            this.f1394b = pVar3.c();
        }
        r.p pVar4 = (r.p) this.f1394b;
        if (pVar4 == null) {
            jc.l.k("endVelocityVector");
            throw null;
        }
        int iB = pVar4.b();
        for (int i10 = 0; i10 < iB; i10++) {
            r.p pVar5 = (r.p) this.f1394b;
            if (pVar5 == null) {
                jc.l.k("endVelocityVector");
                throw null;
            }
            pVar5.e(((r.y1) this.f1395c).V(i10).d(pVar.a(i10), pVar2.a(i10), pVar3.a(i10)), i10);
        }
        r.p pVar6 = (r.p) this.f1394b;
        if (pVar6 != null) {
            return pVar6;
        }
        jc.l.k("endVelocityVector");
        throw null;
    }

    public String toString() {
        switch (this.f1393a) {
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                String string = ((Socket) this.f1395c).toString();
                jc.l.d(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    @Override // o6.l
    public int u() {
        switch (this.f1393a) {
        }
        return 2;
    }

    @Override // lh.g0
    public lh.f0 v() {
        return (mh.d) this.f1394b;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x020d  */
    @Override // o6.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(byte[] r43, int r44, int r45, o6.k r46, p4.g r47) {
        /*
            Method dump skipped, instruction units count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.w1.w(byte[], int, int, o6.k, p4.g):void");
    }

    public void x(Object obj, b7.t1 t1Var, f4 f4Var, m4.u0 u0Var) {
        synchronized (this.f1394b) {
            try {
                b7.t1 t1VarM = M(obj);
                if (t1VarM == null) {
                    ((o.e) this.f1395c).put(obj, t1Var);
                    ((o.e) this.f1396d).put(t1Var, new b7.h(obj, new d4(), f4Var, u0Var));
                } else {
                    b7.h hVar = (b7.h) ((o.e) this.f1396d).get(t1VarM);
                    p4.c.j(hVar);
                    hVar.f1803d = f4Var;
                    hVar.f1804e = u0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void y(b7.t1 t1Var, int i10, b7.g gVar) {
        synchronized (this.f1394b) {
            try {
                b7.h hVar = (b7.h) ((o.e) this.f1396d).get(t1Var);
                if (hVar != null) {
                    m4.u0 u0Var = hVar.f1806g;
                    u0Var.getClass();
                    k5.d dVar = new k5.d();
                    dVar.b(u0Var.f14593a);
                    dVar.a(i10);
                    hVar.f1806g = new m4.u0(dVar.d());
                    hVar.f1802c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList z(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f1395c;
        b0(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f1396d;
        b0(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            z4.b bVar = (z4.b) list.get(i10);
            if (!map.containsKey(bVar.f26386b) && !map2.containsKey(Integer.valueOf(bVar.f26387c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1393a = i10;
        this.f1395c = obj;
        this.f1396d = obj2;
        this.f1397e = obj3;
        this.f1394b = obj4;
    }

    public w1(re.l lVar, yc.y yVar) {
        this.f1393a = 26;
        jc.l.e(yVar, "module");
        this.f1395c = lVar;
        this.f1396d = yVar;
        this.f1397e = lVar.b(new yc.a0(this, 0));
        this.f1394b = lVar.b(new yc.a0(this, 1));
    }

    public w1(wd.h0 h0Var, yd.g gVar, xd.a aVar, oe.b0 b0Var) {
        this.f1393a = 12;
        this.f1395c = gVar;
        this.f1396d = aVar;
        this.f1397e = b0Var;
        List list = h0Var.f23719g;
        jc.l.d(list, "getClass_List(...)");
        List list2 = list;
        int iT = vb.w.t(vb.n.K(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iT < 16 ? 16 : iT);
        for (Object obj : list2) {
            linkedHashMap.put(u3.x0.m((yd.g) this.f1395c, ((wd.k) obj).f23805e), obj);
        }
        this.f1394b = linkedHashMap;
    }

    public w1(androidx.lifecycle.w0 w0Var, androidx.lifecycle.u0 u0Var, i4.b bVar) {
        this.f1393a = 6;
        jc.l.e(w0Var, "store");
        jc.l.e(u0Var, "factory");
        jc.l.e(bVar, "defaultExtras");
        this.f1395c = w0Var;
        this.f1396d = u0Var;
        this.f1397e = bVar;
        this.f1394b = new k4.c();
    }

    public w1(Socket socket) {
        this.f1393a = 10;
        this.f1395c = socket;
        this.f1396d = new AtomicInteger();
        this.f1397e = new mh.e(this);
        this.f1394b = new mh.d(this);
    }

    private final /* synthetic */ void c0() {
    }

    private final /* synthetic */ void d0() {
    }

    public w1(j2.v vVar, k1.k kVar) {
        this.f1393a = 9;
        this.f1395c = vVar;
        this.f1396d = kVar;
        AutofillManager autofillManagerI = b7.l.i(vVar.getContext().getSystemService(b7.l.m()));
        if (autofillManagerI != null) {
            this.f1397e = autofillManagerI;
            vVar.setImportantForAutofill(1);
            b1.e eVarK = a2.c.K(vVar);
            AutofillId autofillIdK = eVarK != null ? k1.g.k(eVarK.f1425a) : null;
            if (autofillIdK != null) {
                this.f1394b = autofillIdK;
                return;
            }
            throw j2.h0.g("Required value was null.");
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }

    public w1(c2.z zVar) {
        this.f1393a = 2;
        this.f1394b = zVar;
        this.f1396d = c2.y.f3351a;
    }

    public w1(List list) {
        int i10;
        this.f1393a = 24;
        this.f1395c = new p4.s();
        this.f1396d = new p4.s();
        w6.a aVar = new w6.a();
        this.f1397e = aVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        int i11 = p4.c0.f16548a;
        for (String str : strTrim.split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] strArrSplit = str.substring(9).split(",", -1);
                aVar.f23425d = new int[strArrSplit.length];
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    int[] iArr = aVar.f23425d;
                    try {
                        i10 = Integer.parseInt(strArrSplit[i12].trim(), 16);
                    } catch (RuntimeException unused) {
                        i10 = 0;
                    }
                    iArr[i12] = i10;
                }
            } else if (str.startsWith("size: ")) {
                String[] strArrSplit2 = str.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        aVar.f23426e = Integer.parseInt(strArrSplit2[0]);
                        aVar.f23427f = Integer.parseInt(strArrSplit2[1]);
                        aVar.f23423b = true;
                    } catch (RuntimeException e10) {
                        p4.c.C("VobsubParser", "Parsing IDX failed", e10);
                    }
                }
            }
        }
    }

    public w1(c2 c2Var) {
        this.f1393a = 1;
        this.f1395c = new o.e(0);
        this.f1396d = new o.e(0);
        this.f1394b = new Object();
        this.f1397e = new WeakReference(c2Var);
    }

    public w1(Typeface typeface, d4.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f1393a = 3;
        this.f1394b = typeface;
        this.f1395c = bVar;
        this.f1397e = new c4.v(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i14 = iA + bVar.f5470a;
            i10 = ((ByteBuffer) bVar.f5473d).getInt(((ByteBuffer) bVar.f5473d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f1396d = new char[i10 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i15 = iA2 + bVar.f5470a;
            i11 = ((ByteBuffer) bVar.f5473d).getInt(((ByteBuffer) bVar.f5473d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            c4.w wVar = new c4.w(this, i16);
            d4.a aVarB = wVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f5473d).getInt(iA3 + aVarB.f5470a) : 0, (char[]) this.f1396d, i16 * 2);
            d4.a aVarB2 = wVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i17 = iA4 + aVarB2.f5470a;
                i12 = ((ByteBuffer) aVarB2.f5473d).getInt(((ByteBuffer) aVarB2.f5473d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                c4.v vVar = (c4.v) this.f1397e;
                d4.a aVarB3 = wVar.b();
                int iA5 = aVarB3.a(16);
                if (iA5 != 0) {
                    int i18 = iA5 + aVarB3.f5470a;
                    i13 = ((ByteBuffer) aVarB3.f5473d).getInt(((ByteBuffer) aVarB3.f5473d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                vVar.a(wVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public w1(c1 c1Var) {
        this.f1393a = 7;
        this.f1395c = new i7.w();
        this.f1396d = new i7.w();
        this.f1394b = new ReentrantLock();
    }

    public w1(ArrayList arrayList, CountDownLatch countDownLatch, vg.a aVar, String str, ArrayList arrayList2) {
        this.f1393a = 23;
        this.f1395c = arrayList;
        this.f1396d = countDownLatch;
        this.f1397e = str;
        this.f1394b = arrayList2;
    }

    public w1(m0.w wVar, ud.t tVar) {
        this.f1393a = 19;
        this.f1394b = wVar;
        this.f1393a = 19;
        this.f1397e = wVar;
        this.f1395c = tVar;
        this.f1396d = new ArrayList();
    }

    public w1(od.a aVar, od.e eVar, ub.h hVar) {
        this.f1393a = 11;
        jc.l.e(eVar, "typeParameterResolver");
        this.f1395c = aVar;
        this.f1396d = eVar;
        this.f1394b = hVar;
        this.f1397e = new c7.e1(this, eVar);
    }

    public w1(int i10) {
        this.f1393a = i10;
        switch (i10) {
            case 17:
                this.f1395c = new p4.s();
                this.f1396d = new p4.s();
                this.f1397e = new r6.a();
                break;
            case 22:
                this.f1396d = new ArrayDeque();
                this.f1397e = new ArrayDeque();
                this.f1394b = new ArrayDeque();
                break;
            case 25:
                Random random = new Random();
                this.f1397e = new HashMap();
                this.f1394b = random;
                this.f1395c = new HashMap();
                this.f1396d = new HashMap();
                break;
            default:
                this.f1395c = new c();
                long[] jArr = o.s0.f16040a;
                this.f1397e = new o.k0();
                break;
        }
    }

    public w1(b7.b1 b1Var, be.e eVar, id.h hVar) {
        this.f1393a = 21;
        this.f1396d = b1Var;
        this.f1397e = eVar;
        this.f1394b = hVar;
        this.f1395c = new ArrayList();
    }

    public w1(id.h hVar, w1 w1Var, ArrayList arrayList) {
        this.f1393a = 20;
        this.f1396d = hVar;
        this.f1397e = w1Var;
        this.f1394b = arrayList;
        this.f1395c = hVar;
    }

    public w1(c7.f0 f0Var) {
        this.f1393a = 4;
        this.f1394b = f0Var;
        this.f1395c = new ArrayList();
    }

    public w1(ya.a1 a1Var, q4.i iVar, q4.i iVar2, q4.i iVar3) {
        Object objQ;
        this.f1393a = 13;
        if (a1Var != null) {
            objQ = ya.i0.q(a1Var);
        } else {
            ya.g0 g0Var = ya.i0.f25998b;
            objQ = ya.a1.f25946e;
        }
        this.f1395c = objQ;
        this.f1396d = iVar;
        this.f1397e = iVar2;
        this.f1394b = iVar3;
    }

    public w1(qe.h hVar) {
        this.f1393a = 14;
        this.f1394b = hVar;
        List list = hVar.f18170e.f23820t;
        jc.l.d(list, "getEnumEntryList(...)");
        List list2 = list;
        int iT = vb.w.t(vb.n.K(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iT < 16 ? 16 : iT);
        for (Object obj : list2) {
            linkedHashMap.put(u3.x0.r(hVar.f18177l.f16391b, ((wd.w) obj).f24012d), obj);
        }
        this.f1395c = linkedHashMap;
        qe.h hVar2 = (qe.h) this.f1394b;
        this.f1396d = hVar2.f18177l.f16390a.f16364a.c(new ee.j(5, this, hVar2));
        re.l lVar = ((qe.h) this.f1394b).f18177l.f16390a.f16364a;
        bd.e eVar = new bd.e(14, this);
        lVar.getClass();
        this.f1397e = new re.i(lVar, eVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w1(r.y yVar) {
        this(15, new r.y1(2, yVar));
        this.f1393a = 15;
    }

    public w1(j5.o1 o1Var, boolean[] zArr) {
        this.f1393a = 8;
        this.f1395c = o1Var;
        this.f1396d = zArr;
        int i10 = o1Var.f10379a;
        this.f1397e = new boolean[i10];
        this.f1394b = new boolean[i10];
    }
}
