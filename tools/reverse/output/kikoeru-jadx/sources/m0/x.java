package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.k f13845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a f13846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r.j f13847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.k f13848d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0.e1 f13851g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x0.a1 f13855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x0.e1 f13856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0.e1 f13857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f13858n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v3 f13849e = new v3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f13850f = new w(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0.c0 f13852h = x0.v.o(new r(this, 0));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x0.c0 f13853i = x0.v.o(new r(this, 1));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0.a1 f13854j = new x0.a1(Float.NaN);

    public x(Object obj, ic.k kVar, ic.a aVar, r.j jVar, ic.k kVar2) {
        this.f13845a = kVar;
        this.f13846b = aVar;
        this.f13847c = jVar;
        this.f13848d = kVar2;
        this.f13851g = x0.v.v(obj);
        x0.v.p(new r(this, 2), x0.r0.f24439f);
        this.f13855k = new x0.a1(0.0f);
        this.f13856l = x0.v.v(null);
        this.f13857m = x0.v.v(new a4(vb.s.f22820a));
        this.f13858n = new u(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r9, s.v0 r10, m0.o r11, ac.c r12) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.x.a(java.lang.Object, s.v0, m0.o, ac.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(s.v0 r9, i7.j r10, yb.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof m0.s
            if (r0 == 0) goto L13
            r0 = r11
            m0.s r0 = (m0.s) r0
            int r1 = r0.f13581f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13581f = r1
            goto L18
        L13:
            m0.s r0 = new m0.s
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f13579d
            int r1 = r0.f13581f
            x0.a1 r2 = r8.f13854j
            ic.k r3 = r8.f13848d
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 != r5) goto L2d
            ub.a.f(r11)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L2b:
            r9 = move-exception
            goto L89
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            ub.a.f(r11)
            m0.v3 r11 = r8.f13849e     // Catch: java.lang.Throwable -> L2b
            i7.r1 r1 = new i7.r1     // Catch: java.lang.Throwable -> L2b
            r6 = 2
            r7 = 0
            r1.<init>(r8, r10, r7, r6)     // Catch: java.lang.Throwable -> L2b
            r0.f13581f = r5     // Catch: java.lang.Throwable -> L2b
            r11.getClass()     // Catch: java.lang.Throwable -> L2b
            ea.f r10 = new ea.f     // Catch: java.lang.Throwable -> L2b
            r10.<init>(r9, r11, r1, r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r9 = hf.a0.k(r10, r0)     // Catch: java.lang.Throwable -> L2b
            zb.a r10 = zb.a.f26667a
            if (r9 != r10) goto L54
            return r10
        L54:
            m0.a4 r9 = r8.d()
            float r10 = r2.e()
            java.lang.Object r9 = r9.a(r10)
            if (r9 == 0) goto L86
            float r10 = r2.e()
            m0.a4 r11 = r8.d()
            float r11 = r11.c(r9)
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 > 0) goto L86
            java.lang.Object r10 = r3.a(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L86
            r8.g(r9)
        L86:
            ub.a0 r9 = ub.a0.f21526a
            return r9
        L89:
            m0.a4 r10 = r8.d()
            float r11 = r2.e()
            java.lang.Object r10 = r10.a(r11)
            if (r10 == 0) goto Lbb
            float r11 = r2.e()
            m0.a4 r0 = r8.d()
            float r0 = r0.c(r10)
            float r11 = r11 - r0
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 > 0) goto Lbb
            java.lang.Object r11 = r3.a(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lbb
            r8.g(r10)
        Lbb:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.x.b(s.v0, i7.j, yb.c):java.lang.Object");
    }

    public final Object c(float f10, float f11, Object obj) {
        a4 a4VarD = d();
        float fC = a4VarD.c(obj);
        float fFloatValue = ((Number) this.f13846b.b()).floatValue();
        if (fC != f10 && !Float.isNaN(fC)) {
            ic.k kVar = this.f13845a;
            if (fC < f10) {
                if (f11 >= fFloatValue) {
                    Object objB = a4VarD.b(f10, true);
                    jc.l.b(objB);
                    return objB;
                }
                Object objB2 = a4VarD.b(f10, true);
                jc.l.b(objB2);
                if (f10 >= Math.abs(Math.abs(((Number) kVar.a(Float.valueOf(Math.abs(a4VarD.c(objB2) - fC)))).floatValue()) + fC)) {
                    return objB2;
                }
            } else {
                if (f11 <= (-fFloatValue)) {
                    Object objB3 = a4VarD.b(f10, false);
                    jc.l.b(objB3);
                    return objB3;
                }
                Object objB4 = a4VarD.b(f10, false);
                jc.l.b(objB4);
                float fAbs = Math.abs(fC - Math.abs(((Number) kVar.a(Float.valueOf(Math.abs(fC - a4VarD.c(objB4))))).floatValue()));
                if (f10 >= 0.0f ? f10 <= fAbs : Math.abs(f10) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final a4 d() {
        return (a4) this.f13857m.getValue();
    }

    public final float e(float f10) {
        x0.a1 a1Var = this.f13854j;
        float fE = (Float.isNaN(a1Var.e()) ? 0.0f : a1Var.e()) + f10;
        Float fM0 = vb.m.m0(d().f12652a.values());
        float fFloatValue = fM0 != null ? fM0.floatValue() : Float.NaN;
        Float fK0 = vb.m.k0(d().f12652a.values());
        return nh.b.j(fE, fFloatValue, fK0 != null ? fK0.floatValue() : Float.NaN);
    }

    public final float f() {
        x0.a1 a1Var = this.f13854j;
        if (Float.isNaN(a1Var.e())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return a1Var.e();
    }

    public final void g(Object obj) {
        this.f13851g.setValue(obj);
    }

    public final Object h(float f10, ac.c cVar) {
        Object value = this.f13851g.getValue();
        Object objC = c(f(), f10, value);
        boolean zBooleanValue = ((Boolean) this.f13848d.a(objC)).booleanValue();
        zb.a aVar = zb.a.f26667a;
        if (zBooleanValue) {
            Object objR = a.a.r(this, objC, f10, cVar);
            if (objR == aVar) {
                return objR;
            }
        } else {
            Object objR2 = a.a.r(this, value, f10, cVar);
            if (objR2 == aVar) {
                return objR2;
            }
        }
        return ub.a0.f21526a;
    }

    public final boolean i(Object obj) {
        rf.c cVar = this.f13849e.f13736b;
        boolean zF = cVar.f();
        if (!zF) {
            return zF;
        }
        try {
            u uVar = this.f13858n;
            float fC = d().c(obj);
            if (!Float.isNaN(fC)) {
                x xVar = uVar.f13683a;
                xVar.f13854j.f(fC);
                xVar.f13855k.f(0.0f);
                this.f13856l.setValue(null);
            }
            g(obj);
            return zF;
        } finally {
            cVar.b(null);
        }
    }
}
