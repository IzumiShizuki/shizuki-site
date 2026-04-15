package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends j1.p implements i2.p, h2.e, i2.z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h1 f17283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t1.b f17284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h2.h f17285q;

    public e1(h1 h1Var) {
        this.f17283o = h1Var;
        this.f17284p = (t1.b) h1Var.f17327m.getValue();
        h2.g gVar = f1.f17294a;
        h2.h hVar = new h2.h(gVar);
        hVar.h0(gVar, h1Var);
        this.f17285q = hVar;
    }

    public static final void B0(e1 e1Var, g2.c0 c0Var) {
        g1 g1VarG = e1Var.f17283o.g();
        g2.c0 c0Var2 = e1Var.f17283o.g().f17303b.f17419g;
        if (c0Var2 == null) {
            jc.l.k("root");
            throw null;
        }
        g1VarG.f17306e.setValue(n7.b0.f(c0Var2.o(c0Var, 0L), (((long) Float.floatToRawIntBits((int) (c0Var.k() >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (c0Var.k() & 4294967295L))) & 4294967295L)));
    }

    public final g2.w0 C0(g2.g gVar, g2.u0 u0Var, long j10) {
        if (this.f17283o.g().b()) {
            p1.c cVarC = this.f17283o.f().c();
            if (cVarC == null) {
                cVarC = this.f17283o.g().a();
            }
            if (cVarC != null) {
                long jN = gh.g.N(cVarC.c());
                int i10 = (int) (jN >> 32);
                int i11 = (int) (jN & 4294967295L);
                if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + this.f17283o.f().c() + ", current bounds: " + this.f17283o.g().a()).toString());
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i11 < 0) {
                    i11 = 0;
                }
                if (!((i11 >= 0) & (i10 >= 0))) {
                    f3.i.a("width and height must be >= 0");
                }
                j10 = f3.b.h(i10, i10, i11, i11);
            }
        }
        g2.g1 g1VarV = u0Var.v(j10);
        boolean zB = this.f17283o.g().b();
        vb.s sVar = vb.s.f22820a;
        if (!zB) {
            return gVar.b0(g1VarV.f7180a, g1VarV.f7181b, sVar, new c1(this, g1VarV, 0));
        }
        k1 k1Var = (k1) this.f17283o.f17320f.getValue();
        long jK = D0().k();
        k1Var.a(jK, (((long) g1VarV.f7180a) << 32) | (((long) g1VarV.f7181b) & 4294967295L));
        return gVar.b0((int) (jK >> 32), (int) (4294967295L & jK), sVar, new c1(this, g1VarV, 1));
    }

    public final g2.c0 D0() {
        q1 q1Var = this.f17283o.g().f17303b;
        return q1Var.f17414b.f(i2.f.x(this));
    }

    public final void E0(t1.b bVar) {
        if (bVar == null) {
            t1.b bVar2 = this.f17284p;
            if (bVar2 != null) {
                i2.f.w(this).a(bVar2);
            }
        } else {
            this.f17283o.f17327m.setValue(bVar);
        }
        this.f17284p = bVar;
    }

    @Override // h2.e
    public final a2.c K() {
        return this.f17285q;
    }

    @Override // i2.p
    public final void R(i2.l0 l0Var) {
        h1 h1Var = this.f17283o;
        h1Var.f17315a = true;
        s1 s1Var = (s1) h1Var.f17322h.getValue();
        l1 l1Var = (l1) this.f17283o.f17323i.getValue();
        jc.l.b(this.f17283o.g().a());
        l0Var.getLayoutDirection();
        f3.c cVar = i2.f.y(this).f8766y;
        s1Var.getClass();
        h1 h1Var2 = (h1) l1Var.f17359b.getValue();
        if (h1Var2 == null) {
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
        }
        h1 h1Var3 = h1Var2.f17326l;
        q1.e0 e0Var = null;
        l1 l1Var2 = h1Var3 != null ? (l1) h1Var3.f17323i.getValue() : null;
        if (l1Var2 != null) {
            h1 h1Var4 = (h1) l1Var2.f17359b.getValue();
            if (h1Var4 == null) {
                throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
            }
            e0Var = h1Var4.f17324j;
        }
        h1Var.f17324j = e0Var;
        t1.b bVar = (t1.b) this.f17283o.f17327m.getValue();
        if (bVar == null) {
            throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + this.f17283o.g().f17302a + ",target: " + this.f17283o.f().b() + ", is attached: " + this.f9703n).toString());
        }
        t0.N(l0Var, bVar, new a1(l0Var, 1));
        h1 h1Var5 = this.f17283o;
        if (!h1Var5.g().b() || (!h1Var5.i() && h1Var5.h())) {
            u3.x0.k(l0Var, bVar);
        }
    }

    @Override // i2.z
    public final /* synthetic */ int b(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.k(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int c(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.d(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int d(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.g(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.n(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        g2.g1 g1VarV = u0Var.v(j10);
        float f10 = g1VarV.f7180a;
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new j(g1VarV, this, (((long) Float.floatToRawIntBits(g1VarV.f7181b)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
    }

    @Override // j1.p
    public final void r0() {
        h2.g gVar = f1.f17294a;
        a0.c.p(this, gVar, this.f17283o);
        this.f17283o.f17326l = (h1) a0.c.a(this, gVar);
        E0(i2.f.w(this).b());
        this.f17283o.f17325k = new d1(this, 0);
    }

    @Override // h2.f
    public final /* synthetic */ Object s(h2.g gVar) {
        return a0.c.a(this, gVar);
    }

    @Override // j1.p
    public final void t0() {
        E0(null);
        h1 h1Var = this.f17283o;
        h1Var.f17326l = null;
        h1Var.f17325k = i0.f17330d;
    }

    @Override // j1.p
    public final void v0() {
        t1.b bVar = this.f17284p;
        if (bVar != null) {
            i2.f.w(this).a(bVar);
        }
        E0(i2.f.w(this).b());
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
    }
}
