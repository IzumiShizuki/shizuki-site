package x0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends r {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final lf.b1 f24465x = lf.p0.c(d1.b.f5438d);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicReference f24466y = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f24467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hf.d1 f24469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f24470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f24472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o.l0 f24473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0.e f24474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f24475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f24476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o.k0 f24477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v2.e f24478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o.k0 f24479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o.k0 f24480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f24481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinkedHashSet f24482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public hf.k f24483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r.y1 f24484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lf.b1 f24486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final hf.f1 f24487u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final yb.h f24488v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r0 f24489w;

    public t1(yb.h hVar) {
        e eVar = new e(new t9.f(7, this));
        this.f24467a = eVar;
        this.f24468b = new Object();
        this.f24471e = new ArrayList();
        this.f24473g = new o.l0();
        this.f24474h = new z0.e(new u[16]);
        this.f24475i = new ArrayList();
        this.f24476j = new ArrayList();
        this.f24477k = new o.k0();
        this.f24478l = new v2.e(7);
        this.f24479m = new o.k0();
        this.f24480n = new o.k0();
        this.f24486t = lf.p0.c(q1.f24429c);
        new c7.e1(12);
        hf.f1 f1Var = new hf.f1((hf.d1) hVar.R(hf.v.f8599b));
        f1Var.B(new e7.y(22, this));
        this.f24487u = f1Var;
        this.f24488v = hVar.G(eVar).G(f1Var);
        this.f24489w = new r0(8);
    }

    public static final void E(ArrayList arrayList, t1 t1Var, u uVar) {
        arrayList.clear();
        synchronized (t1Var.f24468b) {
            Iterator it = t1Var.f24476j.iterator();
            if (it.hasNext()) {
                ((v0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static final Object r(t1 t1Var, s1 s1Var) {
        hf.k kVar;
        if (t1Var.A()) {
            return ub.a0.f21526a;
        }
        hf.k kVar2 = new hf.k(1, ud.s.p(s1Var));
        kVar2.r();
        synchronized (t1Var.f24468b) {
            if (t1Var.A()) {
                kVar = kVar2;
            } else {
                t1Var.f24483q = kVar2;
                kVar = null;
            }
        }
        if (kVar != null) {
            kVar.h(ub.a0.f21526a);
        }
        Object objQ = kVar2.q();
        return objQ == zb.a.f26667a ? objQ : ub.a0.f21526a;
    }

    public static final void s(t1 t1Var) {
        int i10;
        o.g0 g0Var;
        synchronized (t1Var.f24468b) {
            try {
                if (t1Var.f24477k.j()) {
                    o.g0 g0VarB = z0.a.b(t1Var.f24477k);
                    t1Var.f24477k.a();
                    v2.e eVar = t1Var.f24478l;
                    ((o.k0) eVar.f22364b).a();
                    ((o.k0) eVar.f22365c).a();
                    t1Var.f24480n.a();
                    g0Var = new o.g0(g0VarB.f15971b);
                    Object[] objArr = g0VarB.f15970a;
                    int i11 = g0VarB.f15971b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        v0 v0Var = (v0) objArr[i12];
                        g0Var.a(new ub.k(v0Var, t1Var.f24479m.g(v0Var)));
                    }
                    t1Var.f24479m.a();
                } else {
                    g0Var = o.q0.f16033b;
                    jc.l.c(g0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object[] objArr2 = g0Var.f15970a;
        int i13 = g0Var.f15971b;
        for (i10 = 0; i10 < i13; i10++) {
            ub.k kVar = (ub.k) objArr2[i10];
        }
    }

    public static final boolean t(t1 t1Var) {
        boolean z10;
        synchronized (t1Var.f24468b) {
            z10 = t1Var.z();
        }
        return z10;
    }

    public static final List u(t1 t1Var) {
        List listB;
        synchronized (t1Var.f24468b) {
            listB = t1Var.B();
        }
        return listB;
    }

    public static final void v(t1 t1Var, hf.d1 d1Var) {
        synchronized (t1Var.f24468b) {
            Throwable th2 = t1Var.f24470d;
            if (th2 != null) {
                throw th2;
            }
            if (((q1) t1Var.f24486t.getValue()).compareTo(q1.f24428b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (t1Var.f24469c != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            t1Var.f24469c = d1Var;
            t1Var.y();
        }
    }

    public static void w(h1.c cVar) {
        try {
            if (cVar.w() instanceof h1.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cVar.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f24468b
            monitor-enter(r0)
            o.l0 r1 = r2.f24473g     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            z0.e r1 = r2.f24474h     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.f26374c     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L12
            goto L1d
        L12:
            boolean r1 = r2.z()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L19
            goto L1d
        L19:
            r1 = 0
            goto L1e
        L1b:
            r1 = move-exception
            goto L20
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.t1.A():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List B() {
        ?? r0 = this.f24472f;
        if (r0 != 0) {
            return r0;
        }
        ArrayList arrayList = this.f24471e;
        List arrayList2 = arrayList.isEmpty() ? vb.r.f22819a : new ArrayList(arrayList);
        this.f24472f = arrayList2;
        return arrayList2;
    }

    public final void C() {
        synchronized (this.f24468b) {
            this.f24485s = true;
        }
    }

    public final void D(u uVar) {
        synchronized (this.f24468b) {
            ArrayList arrayList = this.f24476j;
            if (arrayList.size() > 0) {
                ((v0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0144, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        if (r4 >= r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0153, code lost:
    
        if (((ub.k) r10.get(r4)).f21544b == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0155, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0158, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        if (r8 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
    
        r11 = (ub.k) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0170, code lost:
    
        if (r11.f21544b != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0172, code lost:
    
        r11 = (x0.v0) r11.f21543a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0179, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017c, code lost:
    
        r4 = r17.f24468b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017e, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017f, code lost:
    
        vb.m.P(r17.f24476j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0184, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0185, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
    
        if (r8 >= r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019e, code lost:
    
        if (((ub.k) r11).f21544b == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a0, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a3, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a6, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List F(java.util.List r18, o.l0 r19) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.t1.F(java.util.List, o.l0):java.util.List");
    }

    public final u G(u uVar, o.l0 l0Var) {
        h1.c cVarD;
        if (uVar.f24509t.F || uVar.f24510u == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f24482p;
        if (linkedHashSet == null || !linkedHashSet.contains(uVar)) {
            e7.y yVar = new e7.y(21, uVar);
            ba.q0 q0Var = new ba.q0(20, uVar, l0Var);
            h1.g gVarK = h1.n.k();
            h1.c cVar = gVarK instanceof h1.c ? (h1.c) gVarK : null;
            if (cVar == null || (cVarD = cVar.D(yVar, q0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                h1.g gVarJ = cVarD.j();
                if (l0Var != null) {
                    try {
                        if (l0Var.h()) {
                            a9.d dVar = new a9.d(28, l0Var, uVar);
                            o oVar = uVar.f24509t;
                            if (oVar.F) {
                                p.c("Preparing a composition while composing is not supported");
                            }
                            oVar.F = true;
                            try {
                                dVar.b();
                                oVar.F = false;
                            } catch (Throwable th2) {
                                oVar.F = false;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        h1.g.q(gVarJ);
                        throw th3;
                    }
                }
                boolean zW = uVar.w();
                h1.g.q(gVarJ);
                if (zW) {
                    return uVar;
                }
            } finally {
                w(cVarD);
            }
        }
        return null;
    }

    public final void H(Throwable th2, u uVar) throws Throwable {
        if (!((Boolean) f24466y.get()).booleanValue() || (th2 instanceof j)) {
            synchronized (this.f24468b) {
                r.y1 y1Var = this.f24484r;
                if (y1Var != null) {
                    throw ((Throwable) y1Var.f18634b);
                }
                this.f24484r = new r.y1(25, th2);
            }
            throw th2;
        }
        synchronized (this.f24468b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th2);
                this.f24475i.clear();
                this.f24474h.g();
                this.f24473g = new o.l0();
                this.f24476j.clear();
                this.f24477k.a();
                this.f24479m.a();
                this.f24484r = new r.y1(25, th2);
                if (uVar != null) {
                    J(uVar);
                }
                y();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean I() {
        synchronized (this.f24468b) {
            boolean z10 = true;
            if (this.f24473g.g()) {
                if (this.f24474h.f26374c == 0 && !z() && !this.f24477k.j()) {
                    z10 = false;
                }
                return z10;
            }
            List listB = B();
            z0.g gVar = new z0.g(this.f24473g);
            this.f24473g = new o.l0();
            try {
                int size = listB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u) listB.get(i10)).x(gVar);
                    if (((q1) this.f24486t.getValue()).compareTo(q1.f24428b) <= 0) {
                        break;
                    }
                }
                synchronized (this.f24468b) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.f24474h.f26374c == 0 && !z() && !this.f24477k.j()) {
                        z10 = false;
                    }
                }
                return z10;
            } catch (Throwable th2) {
                synchronized (this.f24468b) {
                    o.l0 l0Var = this.f24473g;
                    l0Var.getClass();
                    Iterator<E> it = gVar.iterator();
                    while (it.hasNext()) {
                        l0Var.j(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    public final void J(u uVar) {
        ArrayList arrayList = this.f24481o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f24481o = arrayList;
        }
        if (!arrayList.contains(uVar)) {
            arrayList.add(uVar);
        }
        if (this.f24471e.remove(uVar)) {
            this.f24472f = null;
        }
    }

    public final void K() {
        hf.j jVarY;
        synchronized (this.f24468b) {
            if (this.f24485s) {
                this.f24485s = false;
                jVarY = y();
            } else {
                jVarY = null;
            }
        }
        if (jVarY != null) {
            ((hf.k) jVarY).h(ub.a0.f21526a);
        }
    }

    public final Object L(ac.i iVar) throws Throwable {
        s1 s1Var = new s1(this, null);
        yb.h hVar = iVar.f302b;
        jc.l.b(hVar);
        Object objH = hf.a0.H(this.f24467a, new f7.w(this, s1Var, v.s(hVar), (yb.c) null), iVar);
        ub.a0 a0Var = ub.a0.f21526a;
        zb.a aVar = zb.a.f26667a;
        if (objH != aVar) {
            objH = a0Var;
        }
        return objH == aVar ? objH : a0Var;
    }

    @Override // x0.r
    public final void a(u uVar, ic.n nVar) throws Throwable {
        q1 q1Var;
        boolean zContains;
        h1.c cVarD;
        boolean z10 = uVar.f24509t.F;
        synchronized (this.f24468b) {
            q1 q1Var2 = (q1) this.f24486t.getValue();
            q1Var = q1.f24428b;
            zContains = q1Var2.compareTo(q1Var) > 0 ? true ^ B().contains(uVar) : true;
        }
        try {
            e7.y yVar = new e7.y(21, uVar);
            ba.q0 q0Var = new ba.q0(20, uVar, null);
            h1.g gVarK = h1.n.k();
            h1.c cVar = gVarK instanceof h1.c ? (h1.c) gVarK : null;
            if (cVar == null || (cVarD = cVar.D(yVar, q0Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                h1.g gVarJ = cVarD.j();
                try {
                    uVar.j(nVar);
                    synchronized (this.f24468b) {
                        if (((q1) this.f24486t.getValue()).compareTo(q1Var) > 0 && !B().contains(uVar)) {
                            this.f24471e.add(uVar);
                            this.f24472f = null;
                        }
                    }
                    if (!z10) {
                        h1.n.k().m();
                    }
                    try {
                        D(uVar);
                        try {
                            uVar.d();
                            uVar.f();
                            if (z10) {
                                return;
                            }
                            h1.n.k().m();
                        } catch (Throwable th2) {
                            H(th2, null);
                        }
                    } catch (Throwable th3) {
                        H(th3, uVar);
                    }
                } finally {
                    h1.g.q(gVarJ);
                }
            } finally {
                w(cVarD);
            }
        } catch (Throwable th4) {
            if (zContains) {
                synchronized (this.f24468b) {
                }
            }
            H(th4, uVar);
        }
    }

    @Override // x0.r
    public final boolean c() {
        return ((Boolean) f24466y.get()).booleanValue();
    }

    @Override // x0.r
    public final boolean d() {
        return false;
    }

    @Override // x0.r
    public final boolean e() {
        return false;
    }

    @Override // x0.r
    public final long f() {
        return 1000;
    }

    @Override // x0.r
    public final q g() {
        return null;
    }

    @Override // x0.r
    public final yb.h i() {
        return this.f24488v;
    }

    @Override // x0.r
    public final void j(u uVar) {
        hf.j jVarY;
        synchronized (this.f24468b) {
            if (this.f24474h.h(uVar)) {
                jVarY = null;
            } else {
                this.f24474h.b(uVar);
                jVarY = y();
            }
        }
        if (jVarY != null) {
            ((hf.k) jVarY).h(ub.a0.f21526a);
        }
    }

    @Override // x0.r
    public final u0 k(v0 v0Var) {
        u0 u0Var;
        synchronized (this.f24468b) {
            u0Var = (u0) this.f24479m.k(v0Var);
        }
        return u0Var;
    }

    @Override // x0.r
    public final void n(u uVar) {
        synchronized (this.f24468b) {
            try {
                LinkedHashSet linkedHashSet = this.f24482p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f24482p = linkedHashSet;
                }
                linkedHashSet.add(uVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x0.r
    public final void q(u uVar) {
        synchronized (this.f24468b) {
            if (this.f24471e.remove(uVar)) {
                this.f24472f = null;
            }
            this.f24474h.j(uVar);
            this.f24475i.remove(uVar);
        }
    }

    public final void x() {
        synchronized (this.f24468b) {
            if (((q1) this.f24486t.getValue()).compareTo(q1.f24431e) >= 0) {
                lf.b1 b1Var = this.f24486t;
                q1 q1Var = q1.f24428b;
                b1Var.getClass();
                b1Var.m(null, q1Var);
            }
        }
        this.f24487u.g(null);
    }

    public final hf.j y() {
        lf.b1 b1Var = this.f24486t;
        int iCompareTo = ((q1) b1Var.getValue()).compareTo(q1.f24428b);
        ArrayList arrayList = this.f24476j;
        ArrayList arrayList2 = this.f24475i;
        z0.e eVar = this.f24474h;
        if (iCompareTo <= 0) {
            for (u uVar : B()) {
            }
            this.f24471e.clear();
            this.f24472f = vb.r.f22819a;
            this.f24473g = new o.l0();
            eVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f24481o = null;
            hf.k kVar = this.f24483q;
            if (kVar != null) {
                kVar.t(null);
            }
            this.f24483q = null;
            this.f24484r = null;
            return null;
        }
        r.y1 y1Var = this.f24484r;
        q1 q1Var = q1.f24432f;
        q1 q1Var2 = q1.f24429c;
        if (y1Var == null) {
            if (this.f24469c == null) {
                this.f24473g = new o.l0();
                eVar.g();
                if (z()) {
                    q1Var2 = q1.f24430d;
                }
            } else {
                q1Var2 = (eVar.f26374c == 0 && !this.f24473g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !z() && !this.f24477k.j()) ? q1.f24431e : q1Var;
            }
        }
        b1Var.getClass();
        b1Var.m(null, q1Var2);
        if (q1Var2 != q1Var) {
            return null;
        }
        hf.k kVar2 = this.f24483q;
        this.f24483q = null;
        return kVar2;
    }

    public final boolean z() {
        return !this.f24485s && (this.f24467a.f24292d.get() & 134217727) > 0;
    }

    @Override // x0.r
    public final void l(Set set) {
    }
}
