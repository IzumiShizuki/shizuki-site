package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends androidx.lifecycle.q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f18602r = new l(0.0f);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f18603s = new l(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.e1 f18604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f18605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q1 f18607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0.d0 f18609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0.a1 f18610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public hf.k f18611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rf.c f18612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m0 f18613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f18614l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o.g0 f18615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p0 f18616n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q0 f18617o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q0 f18619q;

    public w0(e7.j jVar) {
        super(5);
        this.f18604b = x0.v.v(jVar);
        this.f18605c = x0.v.v(jVar);
        this.f18606d = jVar;
        this.f18609g = new b0.d0(29, this);
        this.f18610h = new x0.a1(0.0f);
        this.f18612j = new rf.c();
        this.f18613k = new m0();
        this.f18614l = Long.MIN_VALUE;
        this.f18615m = new o.g0();
        this.f18617o = new q0(this, 1);
        this.f18619q = new q0(this, 0);
    }

    public static final void B1(w0 w0Var) {
        q1 q1Var = w0Var.f18607e;
        x0.a1 a1Var = w0Var.f18610h;
        if (q1Var == null) {
            return;
        }
        p0 p0Var = w0Var.f18616n;
        if (p0Var == null) {
            if (w0Var.f18608f <= 0 || a1Var.e() == 1.0f || jc.l.a(w0Var.f18605c.getValue(), w0Var.f18604b.getValue())) {
                p0Var = null;
            } else {
                p0Var = new p0();
                p0Var.f18511d = a1Var.e();
                long j10 = w0Var.f18608f;
                p0Var.f18514g = j10;
                p0Var.f18515h = lc.b.S((1.0d - ((double) a1Var.e())) * j10);
                p0Var.f18512e.e(a1Var.e(), 0);
            }
        }
        if (p0Var != null) {
            p0Var.f18514g = w0Var.f18608f;
            w0Var.f18615m.a(p0Var);
            q1Var.m(p0Var);
        }
        w0Var.f18616n = null;
    }

    public static final void C1(w0 w0Var, p0 p0Var, long j10) {
        long j11 = p0Var.f18508a;
        l lVar = p0Var.f18512e;
        long j12 = j11 + j10;
        p0Var.f18508a = j12;
        long j13 = p0Var.f18515h;
        if (j12 >= j13) {
            p0Var.f18511d = 1.0f;
            return;
        }
        b2 b2Var = p0Var.f18509b;
        if (b2Var == null) {
            float f10 = j12 / j13;
            p0Var.f18511d = (f10 * 1.0f) + ((1 - f10) * lVar.a(0));
            return;
        }
        l lVar2 = p0Var.f18513f;
        if (lVar2 == null) {
            lVar2 = f18602r;
        }
        p0Var.f18511d = nh.b.j(((l) b2Var.g(j12, lVar, f18603s, lVar2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D1(r.w0 r10, ac.c r11) {
        /*
            r10.getClass()
            boolean r0 = r11 instanceof r.s0
            if (r0 == 0) goto L16
            r0 = r11
            r.s0 r0 = (r.s0) r0
            int r1 = r0.f18572g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f18572g = r1
            goto L1b
        L16:
            r.s0 r0 = new r.s0
            r0.<init>(r10, r11)
        L1b:
            yb.h r11 = r0.f302b
            java.lang.Object r1 = r0.f18570e
            int r2 = r0.f18572g
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            ub.a0 r7 = ub.a0.f21526a
            zb.a r8 = zb.a.f26667a
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            goto L38
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            r.w0 r10 = r0.f18569d
            ub.a.f(r1)
            goto L7a
        L3e:
            ub.a.f(r1)
            o.g0 r1 = r10.f18615m
            boolean r1 = r1.g()
            if (r1 == 0) goto L4e
            r.p0 r1 = r10.f18616n
            if (r1 != 0) goto L4e
            return r7
        L4e:
            jc.l.b(r11)
            float r1 = r.d.n(r11)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L60
            r10.H1()
            r10.f18614l = r5
            return r7
        L60:
            long r1 = r10.f18614l
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 != 0) goto L7a
            r.q0 r1 = r10.f18617o
            r0.f18569d = r10
            r0.f18572g = r4
            jc.l.b(r11)
            x0.s0 r11 = x0.v.s(r11)
            java.lang.Object r11 = r11.k(r1, r0)
            if (r11 != r8) goto L7a
            goto L94
        L7a:
            o.g0 r11 = r10.f18615m
            boolean r11 = r11.h()
            if (r11 != 0) goto L8a
            r.p0 r11 = r10.f18616n
            if (r11 == 0) goto L87
            goto L8a
        L87:
            r10.f18614l = r5
            return r7
        L8a:
            r0.f18569d = r10
            r0.f18572g = r3
            java.lang.Object r11 = r10.G1(r0)
            if (r11 != r8) goto L7a
        L94:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: r.w0.D1(r.w0, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E1(r.w0 r6, ac.c r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof r.u0
            if (r0 == 0) goto L16
            r0 = r7
            r.u0 r0 = (r.u0) r0
            int r1 = r0.f18587h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f18587h = r1
            goto L1b
        L16:
            r.u0 r0 = new r.u0
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f18585f
            int r1 = r0.f18587h
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.f18584e
            r.w0 r0 = r0.f18583d
            ub.a.f(r7)
            goto L80
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            java.lang.Object r6 = r0.f18584e
            r.w0 r1 = r0.f18583d
            ub.a.f(r7)
            r7 = r6
            r6 = r1
            goto L5b
        L43:
            ub.a.f(r7)
            x0.e1 r7 = r6.f18604b
            java.lang.Object r7 = r7.getValue()
            rf.c r1 = r6.f18612j
            r0.f18583d = r6
            r0.f18584e = r7
            r0.f18587h = r3
            java.lang.Object r1 = r1.g(r0)
            if (r1 != r4) goto L5b
            goto L7b
        L5b:
            r0.f18583d = r6
            r0.f18584e = r7
            r0.f18587h = r2
            hf.k r1 = new hf.k
            yb.c r0 = ud.s.p(r0)
            r1.<init>(r3, r0)
            r1.r()
            r6.f18611i = r1
            rf.c r0 = r6.f18612j
            r2 = 0
            r0.b(r2)
            java.lang.Object r0 = r1.q()
            if (r0 != r4) goto L7c
        L7b:
            return r4
        L7c:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            boolean r6 = jc.l.a(r7, r6)
            if (r6 == 0) goto L89
            ub.a0 r6 = ub.a0.f21526a
            return r6
        L89:
            r6 = -9223372036854775808
            r0.f18614l = r6
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            java.lang.String r7 = "targetState while waiting for composition"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r.w0.E1(r.w0, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F1(r.w0 r7, ac.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof r.v0
            if (r0 == 0) goto L16
            r0 = r8
            r.v0 r0 = (r.v0) r0
            int r1 = r0.f18595h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f18595h = r1
            goto L1b
        L16:
            r.v0 r0 = new r.v0
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f18593f
            int r1 = r0.f18595h
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r7 = r0.f18592e
            r.w0 r0 = r0.f18591d
            ub.a.f(r8)
            goto L89
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.f18592e
            r.w0 r1 = r0.f18591d
            ub.a.f(r8)
            goto L5b
        L41:
            ub.a.f(r8)
            x0.e1 r8 = r7.f18604b
            java.lang.Object r8 = r8.getValue()
            rf.c r1 = r7.f18612j
            r0.f18591d = r7
            r0.f18592e = r8
            r0.f18595h = r3
            java.lang.Object r1 = r1.g(r0)
            if (r1 != r4) goto L59
            goto L87
        L59:
            r1 = r7
            r7 = r8
        L5b:
            java.lang.Object r8 = r1.f18606d
            rf.c r5 = r1.f18612j
            boolean r8 = jc.l.a(r7, r8)
            r6 = 0
            if (r8 == 0) goto L6a
            r5.b(r6)
            goto L8f
        L6a:
            r0.f18591d = r1
            r0.f18592e = r7
            r0.f18595h = r2
            hf.k r8 = new hf.k
            yb.c r0 = ud.s.p(r0)
            r8.<init>(r3, r0)
            r8.r()
            r1.f18611i = r8
            r5.b(r6)
            java.lang.Object r8 = r8.q()
            if (r8 != r4) goto L88
        L87:
            return r4
        L88:
            r0 = r1
        L89:
            boolean r1 = jc.l.a(r8, r7)
            if (r1 == 0) goto L92
        L8f:
            ub.a0 r7 = ub.a0.f21526a
            return r7
        L92:
            r1 = -9223372036854775808
            r0.f18614l = r1
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " instead of "
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.w0.F1(r.w0, ac.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ub.h] */
    @Override // androidx.lifecycle.q
    public final void A1() {
        this.f18607e = null;
        ((h1.y) t1.f18582a.getValue()).b(this);
    }

    public final Object G1(ac.c cVar) {
        float fN = d.n(cVar.s());
        ub.a0 a0Var = ub.a0.f21526a;
        if (fN <= 0.0f) {
            H1();
            return a0Var;
        }
        this.f18618p = fN;
        Object objK = x0.v.s(cVar.s()).k(this.f18619q, cVar);
        return objK == zb.a.f26667a ? objK : a0Var;
    }

    public final void H1() {
        q1 q1Var = this.f18607e;
        if (q1Var != null) {
            q1Var.c();
        }
        this.f18615m.c();
        if (this.f18616n != null) {
            this.f18616n = null;
            K1(1.0f);
            J1();
        }
    }

    public final Object I1(float f10, Object obj, ac.i iVar) {
        if (0.0f > f10 || f10 > 1.0f) {
            n0.a("Expecting fraction between 0 and 1. Got " + f10);
        }
        q1 q1Var = this.f18607e;
        if (q1Var != null) {
            Object objA = m0.a(this.f18613k, new t0(obj, this.f18604b.getValue(), this, q1Var, f10, null), iVar);
            if (objA == zb.a.f26667a) {
                return objA;
            }
        }
        return ub.a0.f21526a;
    }

    public final void J1() {
        q1 q1Var = this.f18607e;
        if (q1Var == null) {
            return;
        }
        q1Var.l(lc.b.S(((double) this.f18610h.e()) * ((Number) q1Var.f18550l.getValue()).longValue()));
    }

    public final void K1(float f10) {
        this.f18610h.f(f10);
    }

    @Override // androidx.lifecycle.q
    public final Object b1() {
        return this.f18605c.getValue();
    }

    @Override // androidx.lifecycle.q
    public final Object g1() {
        return this.f18604b.getValue();
    }

    @Override // androidx.lifecycle.q
    public final void x1(Object obj) {
        this.f18605c.setValue(obj);
    }

    @Override // androidx.lifecycle.q
    public final void z1(q1 q1Var) {
        q1 q1Var2 = this.f18607e;
        if (q1Var2 != null && !q1Var.equals(q1Var2)) {
            n0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f18607e + ", new instance: " + q1Var);
        }
        this.f18607e = q1Var;
    }
}
