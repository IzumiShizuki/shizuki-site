package x0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f24490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7.e1 f24491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f24492c = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f24493d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o.n0 f24494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f24495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o.k0 f24496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o.l0 f24497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o.l0 f24498i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o.k0 f24499j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0.a f24500k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0.a f24501l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o.k0 f24502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o.k0 f24503n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24504o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u f24505p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f24506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r.y1 f24507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f1.m f24508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f24509t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f24510u;

    public u(r rVar, c7.e1 e1Var) {
        this.f24490a = rVar;
        this.f24491b = e1Var;
        o.n0 n0Var = new o.n0(new o.l0());
        this.f24494e = n0Var;
        a2 a2Var = new a2();
        if (rVar.c()) {
            a2Var.f24246k = new o.y();
        }
        if (rVar.e()) {
            a2Var.i();
        }
        this.f24495f = a2Var;
        this.f24496g = ud.b.k();
        this.f24497h = new o.l0();
        this.f24498i = new o.l0();
        this.f24499j = ud.b.k();
        y0.a aVar = new y0.a();
        this.f24500k = aVar;
        y0.a aVar2 = new y0.a();
        this.f24501l = aVar2;
        this.f24502m = ud.b.k();
        this.f24503n = ud.b.k();
        r.y1 y1Var = new r.y1(24, rVar);
        this.f24507r = y1Var;
        this.f24508s = new f1.m();
        o oVar = new o(e1Var, rVar, a2Var, n0Var, aVar, aVar2, y1Var, this);
        rVar.m(oVar);
        this.f24509t = oVar;
        int i10 = h.f24313a;
    }

    public final void A(ic.n nVar) {
        boolean zI = i();
        p();
        r rVar = this.f24490a;
        if (!zI) {
            rVar.a(this, nVar);
            return;
        }
        o oVar = this.f24509t;
        oVar.f24400z = 100;
        oVar.f24399y = true;
        rVar.a(this, nVar);
        oVar.s();
    }

    public final void a() {
        this.f24492c.set(null);
        this.f24500k.f25294a.F();
        this.f24501l.f25294a.F();
        o.n0 n0Var = this.f24494e;
        if (n0Var.f16025a.g()) {
            return;
        }
        f1.m mVar = this.f24508s;
        try {
            mVar.e(n0Var, this.f24509t.y());
            mVar.b();
        } finally {
            mVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r22, boolean r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            o.k0 r2 = r0.f24496g
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L9d
            boolean r3 = r2 instanceof o.l0
            x0.m0 r4 = x0.m0.f24351a
            o.l0 r5 = r0.f24497h
            o.l0 r6 = r0.f24498i
            o.k0 r7 = r0.f24502m
            if (r3 == 0) goto L82
            o.l0 r2 = (o.l0) r2
            java.lang.Object[] r3 = r2.f16003b
            long[] r2 = r2.f16002a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9d
            r10 = 0
        L24:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L7d
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3e:
            if (r15 >= r13) goto L79
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto L70
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r9 = r16
            x0.p1 r9 = (x0.p1) r9
            boolean r16 = ud.b.E(r7, r1, r9)
            if (r16 != 0) goto L70
            r16 = 8
            x0.m0 r14 = r9.d(r1)
            if (r14 == r4) goto L72
            o.k0 r14 = r9.f24424g
            if (r14 == 0) goto L6c
            if (r23 != 0) goto L6c
            r6.a(r9)
            goto L72
        L6c:
            r5.a(r9)
            goto L72
        L70:
            r16 = 8
        L72:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = 8
            goto L3e
        L79:
            r9 = 8
            if (r13 != r9) goto L9d
        L7d:
            if (r10 == r8) goto L9d
            int r10 = r10 + 1
            goto L24
        L82:
            x0.p1 r2 = (x0.p1) r2
            boolean r3 = ud.b.E(r7, r1, r2)
            if (r3 != 0) goto L9d
            x0.m0 r1 = r2.d(r1)
            if (r1 == r4) goto L9d
            o.k0 r1 = r2.f24424g
            if (r1 == 0) goto L9a
            if (r23 != 0) goto L9a
            r6.a(r2)
            return
        L9a:
            r5.a(r2)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.u.b(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182 A[EDGE_INSN: B:73:0x0182->B:222:0x0121 BREAK  A[LOOP:13: B:63:0x0150->B:74:0x0184]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.Set r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.u.c(java.util.Set, boolean):void");
    }

    public final void d() {
        synchronized (this.f24493d) {
            try {
                e(this.f24500k);
                n();
            } catch (Throwable th2) {
                try {
                    if (!this.f24494e.f16025a.g()) {
                        f1.m mVar = this.f24508s;
                        try {
                            mVar.e(this.f24494e, this.f24509t.y());
                            mVar.b();
                            mVar.a();
                        } catch (Throwable th3) {
                            mVar.a();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(y0.a r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.u.e(y0.a):void");
    }

    public final void f() {
        synchronized (this.f24493d) {
            try {
                if (this.f24501l.f25294a.I()) {
                    e(this.f24501l);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f24494e.f16025a.g()) {
                        f1.m mVar = this.f24508s;
                        try {
                            mVar.e(this.f24494e, this.f24509t.y());
                            mVar.b();
                            mVar.a();
                        } catch (Throwable th3) {
                            mVar.a();
                            throw th3;
                        }
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    public final void g() {
        f1.m mVar;
        synchronized (this.f24493d) {
            try {
                this.f24509t.f24396v = null;
                if (!this.f24494e.f16025a.g()) {
                    mVar = this.f24508s;
                    try {
                        mVar.e(this.f24494e, this.f24509t.y());
                        mVar.b();
                        mVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f24494e.f16025a.g()) {
                        mVar = this.f24508s;
                        try {
                            mVar.e(this.f24494e, this.f24509t.y());
                            mVar.b();
                            mVar.a();
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.u.h():void");
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f24493d) {
            z10 = true;
            if (this.f24510u != 1) {
                z10 = false;
            }
            if (z10) {
                this.f24510u = 0;
            }
        }
        return z10;
    }

    public final void j(ic.n nVar) {
        try {
            synchronized (this.f24493d) {
                m();
                o.k0 k0Var = this.f24503n;
                this.f24503n = ud.b.k();
                try {
                    o oVar = this.f24509t;
                    if (!oVar.f24379e.f25294a.H()) {
                        p.c("Expected applyChanges() to have been called");
                    }
                    oVar.P = null;
                    try {
                        oVar.n(k0Var, nVar);
                    } finally {
                        oVar.P = null;
                    }
                } catch (Throwable th2) {
                    this.f24503n = k0Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f24494e.f16025a.g()) {
                    f1.m mVar = this.f24508s;
                    try {
                        mVar.e(this.f24494e, this.f24509t.y());
                        mVar.b();
                        mVar.a();
                    } catch (Throwable th4) {
                        mVar.a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                a();
                throw th5;
            }
        }
    }

    public final void k() {
        synchronized (this.f24493d) {
            try {
                boolean z10 = this.f24495f.f24237b > 0;
                if (z10 || !this.f24494e.f16025a.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        f1.m mVar = this.f24508s;
                        try {
                            mVar.e(this.f24494e, this.f24509t.y());
                            if (z10) {
                                d2 d2VarK = this.f24495f.k();
                                try {
                                    d2VarK.n(d2VarK.f24284t, new ba.h0(23, this.f24508s, d2VarK));
                                    d2VarK.e(true);
                                    this.f24491b.l();
                                    mVar.c();
                                } catch (Throwable th2) {
                                    d2VarK.e(false);
                                    throw th2;
                                }
                            }
                            mVar.b();
                            mVar.a();
                        } catch (Throwable th3) {
                            mVar.a();
                            throw th3;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f24496g.a();
                this.f24499j.a();
                this.f24503n.a();
                this.f24500k.f25294a.F();
                this.f24501l.f25294a.F();
                o oVar = this.f24509t;
                oVar.E.clear();
                oVar.f24393s.clear();
                oVar.f24379e.f25294a.F();
                oVar.f24396v = null;
                this.f24510u = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void l() {
        synchronized (this.f24493d) {
            try {
                if (this.f24509t.F) {
                    k1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f24510u != 3) {
                    this.f24510u = 3;
                    int i10 = h.f24313a;
                    y0.a aVar = this.f24509t.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    boolean z10 = this.f24495f.f24237b > 0;
                    if (z10 || !this.f24494e.f16025a.g()) {
                        f1.m mVar = this.f24508s;
                        try {
                            mVar.e(this.f24494e, this.f24509t.y());
                            if (z10) {
                                d2 d2VarK = this.f24495f.k();
                                try {
                                    d2VarK.n(d2VarK.f24284t, new a9.r(21, this.f24508s));
                                    d2VarK.G();
                                    d2VarK.e(true);
                                    this.f24491b.m();
                                    this.f24491b.l();
                                    mVar.c();
                                } catch (Throwable th2) {
                                    d2VarK.e(false);
                                    throw th2;
                                }
                            }
                            mVar.b();
                            mVar.a();
                        } catch (Throwable th3) {
                            mVar.a();
                            throw th3;
                        }
                    }
                    o oVar = this.f24509t;
                    oVar.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        oVar.f24376b.p(oVar);
                        oVar.E.clear();
                        oVar.f24393s.clear();
                        oVar.f24379e.f25294a.F();
                        oVar.f24396v = null;
                        oVar.f24375a.m();
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.f24490a.q(this);
    }

    public final void m() {
        Object obj = v.f24511a;
        AtomicReference atomicReference = this.f24492c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                p.d("pending composition has not been applied");
                throw new ce.j0();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                p.d("corrupt pendingModifications drain: " + atomicReference);
                throw new ce.j0();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f24492c;
        Object andSet = atomicReference.getAndSet(null);
        if (jc.l.a(andSet, v.f24511a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            p.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new ce.j0();
        }
        p.d("corrupt pendingModifications drain: " + atomicReference);
        throw new ce.j0();
    }

    public final void o() {
        vb.t tVar = vb.t.f22821a;
        AtomicReference atomicReference = this.f24492c;
        Object andSet = atomicReference.getAndSet(tVar);
        if (jc.l.a(andSet, v.f24511a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            p.d("corrupt pendingModifications drain: " + atomicReference);
            throw new ce.j0();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void p() {
        int i10 = this.f24510u;
        if (i10 == 0) {
            return;
        }
        k1.b(i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
    }

    public final void q(ArrayList arrayList) {
        o.n0 n0Var = this.f24494e;
        o oVar = this.f24509t;
        if (arrayList.size() > 0) {
            ((v0) ((ub.k) arrayList.get(0)).f21543a).getClass();
            throw null;
        }
        try {
            oVar.getClass();
            try {
                oVar.A(arrayList);
                oVar.i();
            } catch (Throwable th2) {
                oVar.a();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!n0Var.f16025a.g()) {
                    f1.m mVar = this.f24508s;
                    try {
                        mVar.e(n0Var, oVar.y());
                        mVar.b();
                        mVar.a();
                    } catch (Throwable th4) {
                        mVar.a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                a();
                throw th5;
            }
        }
    }

    public final m0 r(p1 p1Var, Object obj) {
        u uVar;
        int i10 = p1Var.f24419b;
        if ((i10 & 2) != 0) {
            p1Var.f24419b = i10 | 4;
        }
        a aVar = p1Var.f24420c;
        if (aVar == null || !aVar.a()) {
            return m0.f24351a;
        }
        if (this.f24495f.l(aVar)) {
            if (p1Var.f24421d == null) {
                return m0.f24351a;
            }
            m0 m0VarT = t(p1Var, aVar, obj);
            if (m0VarT != m0.f24351a) {
                this.f24507r.Q();
            }
            return m0VarT;
        }
        synchronized (this.f24493d) {
            uVar = this.f24505p;
        }
        if (uVar != null) {
            o oVar = uVar.f24509t;
            if (oVar.F && oVar.c0(p1Var, obj)) {
                return m0.f24354d;
            }
        }
        return m0.f24351a;
    }

    public final void s() {
        synchronized (this.f24493d) {
            try {
                for (Object obj : this.f24495f.f24238c) {
                    p1 p1Var = obj instanceof p1 ? (p1) obj : null;
                    if (p1Var != null) {
                        p1Var.c();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:80:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008b->B:61:0x00cd], EDGE_INSN: B:81:0x00d5->B:65:0x00d5 BREAK  A[LOOP:0: B:47:0x008b->B:61:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0073, B:42:0x007b, B:44:0x007f, B:47:0x008b, B:49:0x009b, B:51:0x00a7, B:53:0x00b1, B:57:0x00c0, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x0.m0 t(x0.p1 r22, x0.a r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.u.t(x0.p1, x0.a, java.lang.Object):x0.m0");
    }

    public final void u(Object obj) {
        Object objG = this.f24496g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z10 = objG instanceof o.l0;
        o.k0 k0Var = this.f24502m;
        if (!z10) {
            p1 p1Var = (p1) objG;
            if (p1Var.d(obj) == m0.f24354d) {
                ud.b.b(k0Var, obj, p1Var);
                return;
            }
            return;
        }
        o.l0 l0Var = (o.l0) objG;
        Object[] objArr = l0Var.f16003b;
        long[] jArr = l0Var.f16002a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        p1 p1Var2 = (p1) objArr[(i10 << 3) + i12];
                        if (p1Var2.d(obj) == m0.f24354d) {
                            ud.b.b(k0Var, obj, p1Var2);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(java.util.Set r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof z0.g
            o.k0 r3 = r0.f24499j
            o.k0 r4 = r0.f24496g
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            z0.g r1 = (z0.g) r1
            o.l0 r1 = r1.f26375a
            java.lang.Object[] r2 = r1.f16003b
            long[] r1 = r1.f16002a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = 0
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.u.v(java.util.Set):boolean");
    }

    public final boolean w() {
        boolean zI;
        synchronized (this.f24493d) {
            m();
            try {
                o.k0 k0Var = this.f24503n;
                this.f24503n = ud.b.k();
                try {
                    o oVar = this.f24509t;
                    y0.k0 k0Var2 = oVar.f24379e.f25294a;
                    if (!k0Var2.H()) {
                        p.c("Expected applyChanges() to have been called");
                    }
                    if (k0Var.f15999e > 0 || !oVar.f24393s.isEmpty()) {
                        oVar.P = null;
                        try {
                            oVar.n(k0Var, null);
                            oVar.P = null;
                            zI = k0Var2.I();
                        } catch (Throwable th2) {
                            oVar.P = null;
                            throw th2;
                        }
                    } else {
                        zI = false;
                    }
                    if (!zI) {
                        n();
                    }
                } catch (Throwable th3) {
                    this.f24503n = k0Var;
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    if (!this.f24494e.f16025a.g()) {
                        f1.m mVar = this.f24508s;
                        try {
                            mVar.e(this.f24494e, this.f24509t.y());
                            mVar.b();
                            mVar.a();
                        } catch (Throwable th5) {
                            mVar.a();
                            throw th5;
                        }
                    }
                    throw th4;
                } catch (Throwable th6) {
                    a();
                    throw th6;
                }
            }
        }
        return zI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(z0.g gVar) {
        Object obj;
        while (true) {
            Object obj2 = this.f24492c.get();
            if (obj2 == null || obj2.equals(v.f24511a)) {
                obj = gVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, gVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f24492c).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = gVar;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f24492c;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f24493d) {
                    n();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.u.y(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.Object r2 = r1.f24493d
            monitor-enter(r2)
            r17.u(r18)     // Catch: java.lang.Throwable -> L53
            o.k0 r0 = r1.f24499j     // Catch: java.lang.Throwable -> L53
            r3 = r18
            java.lang.Object r0 = r0.g(r3)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L65
            boolean r3 = r0 instanceof o.l0     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L60
            o.l0 r0 = (o.l0) r0     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r3 = r0.f16003b     // Catch: java.lang.Throwable -> L53
            long[] r0 = r0.f16002a     // Catch: java.lang.Throwable -> L53
            int r4 = r0.length     // Catch: java.lang.Throwable -> L53
            int r4 = r4 + (-2)
            if (r4 < 0) goto L65
            r5 = 0
            r6 = 0
        L23:
            r7 = r0[r6]     // Catch: java.lang.Throwable -> L53
            long r9 = ~r7     // Catch: java.lang.Throwable -> L53
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L5b
            int r9 = r6 - r4
            int r9 = ~r9     // Catch: java.lang.Throwable -> L53
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L3d:
            if (r11 >= r9) goto L59
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L55
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]     // Catch: java.lang.Throwable -> L53
            x0.c0 r12 = (x0.c0) r12     // Catch: java.lang.Throwable -> L53
            r1.u(r12)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r0 = move-exception
            goto L67
        L55:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L3d
        L59:
            if (r9 != r10) goto L65
        L5b:
            if (r6 == r4) goto L65
            int r6 = r6 + 1
            goto L23
        L60:
            x0.c0 r0 = (x0.c0) r0     // Catch: java.lang.Throwable -> L53
            r1.u(r0)     // Catch: java.lang.Throwable -> L53
        L65:
            monitor-exit(r2)
            return
        L67:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.u.z(java.lang.Object):void");
    }
}
