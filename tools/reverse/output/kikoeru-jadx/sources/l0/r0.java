package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements h0.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11605a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11607c;

    public r0(l1 l1Var, boolean z10) {
        this.f11607c = l1Var;
        this.f11606b = z10;
    }

    @Override // h0.c1
    public final void a(long j10) {
        switch (this.f11605a) {
            case 0:
                s0 s0Var = (s0) this.f11607c;
                if (s0Var.d() == null) {
                    return;
                }
                r rVarE = s0Var.e();
                jc.l.b(rVarE);
                boolean z10 = this.f11606b;
                Object objE = s0Var.f11611a.f11412c.e((z10 ? rVarE.f11602a : rVarE.f11603b).f11598c);
                if (objE == null) {
                    x.a.d("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new ce.j0();
                }
                n nVar = (n) objE;
                g2.c0 c0VarC = nVar.c();
                if (c0VarC == null) {
                    x.a.d("Current selectable should have layout coordinates.");
                    throw new ce.j0();
                }
                long jA = nVar.a(rVarE, z10);
                if ((9223372034707292159L & jA) == 9205357640488583168L) {
                    return;
                }
                s0Var.f11622l.setValue(new p1.b(s0Var.j().o(c0VarC, k0.a(jA))));
                s0Var.f11623m.setValue(new p1.b(0L));
                return;
            default:
                return;
        }
    }

    @Override // h0.c1
    public final void b() {
        switch (this.f11605a) {
            case 0:
                s0 s0Var = (s0) this.f11607c;
                s0Var.f11629s = true;
                s0Var.p();
                s0Var.f11626p.setValue(null);
                s0Var.f11627q.setValue(null);
                break;
            default:
                l1 l1Var = (l1) this.f11607c;
                l1Var.f11542r.setValue(null);
                l1Var.f11543s.setValue(null);
                l1Var.q(true);
                break;
        }
    }

    @Override // h0.c1
    public final void c() {
        switch (this.f11605a) {
            case 0:
                s0 s0Var = (s0) this.f11607c;
                s0Var.f11629s = true;
                s0Var.p();
                s0Var.f11626p.setValue(null);
                s0Var.f11627q.setValue(null);
                break;
            default:
                l1 l1Var = (l1) this.f11607c;
                l1Var.f11542r.setValue(null);
                l1Var.f11543s.setValue(null);
                l1Var.q(true);
                break;
        }
    }

    @Override // h0.c1
    public final void d() {
        r rVarE;
        g2.c0 c0VarC;
        h0.r1 r1VarD;
        switch (this.f11605a) {
            case 0:
                s0 s0Var = (s0) this.f11607c;
                boolean z10 = this.f11606b;
                if ((z10 ? (p1.b) s0Var.f11624n.getValue() : (p1.b) s0Var.f11625o.getValue()) != null && (rVarE = s0Var.e()) != null) {
                    n nVarC = s0Var.c(z10 ? rVarE.f11602a : rVarE.f11603b);
                    if (nVarC != null && (c0VarC = nVarC.c()) != null) {
                        long jA = nVarC.a(rVarE, z10);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            s0Var.f11627q.setValue(new p1.b(s0Var.j().o(c0VarC, k0.a(jA))));
                            s0Var.f11626p.setValue(z10 ? h0.h0.f7647b : h0.h0.f7648c);
                            s0Var.f11629s = false;
                            s0Var.p();
                            break;
                        }
                    }
                }
                break;
            default:
                l1 l1Var = (l1) this.f11607c;
                boolean z11 = this.f11606b;
                l1Var.f11542r.setValue(z11 ? h0.h0.f7647b : h0.h0.f7648c);
                long jA2 = k0.a(l1Var.j(z11));
                h0.u0 u0Var = l1Var.f11528d;
                if (u0Var != null && (r1VarD = u0Var.d()) != null) {
                    long jE = r1VarD.e(jA2);
                    l1Var.f11539o = jE;
                    l1Var.f11543s.setValue(new p1.b(jE));
                    l1Var.f11541q = 0L;
                    l1Var.f11544t = -1;
                    h0.u0 u0Var2 = l1Var.f11528d;
                    if (u0Var2 != null) {
                        u0Var2.f7873q.setValue(Boolean.TRUE);
                    }
                    l1Var.q(false);
                    break;
                }
                break;
        }
    }

    @Override // h0.c1
    public final void e(long j10) {
        switch (this.f11605a) {
            case 0:
                s0 s0Var = (s0) this.f11607c;
                x0.e1 e1Var = s0Var.f11622l;
                x0.e1 e1Var2 = s0Var.f11623m;
                if (s0Var.d() != null) {
                    e1Var2.setValue(new p1.b(p1.b.i(((p1.b) e1Var2.getValue()).f16481a, j10)));
                    long jI = p1.b.i(((p1.b) e1Var.getValue()).f16481a, ((p1.b) e1Var2.getValue()).f16481a);
                    if (s0Var.o(jI, ((p1.b) e1Var.getValue()).f16481a, this.f11606b, t.f11635g)) {
                        e1Var.setValue(new p1.b(jI));
                        e1Var2.setValue(new p1.b(0L));
                    }
                    break;
                }
                break;
            default:
                l1 l1Var = (l1) this.f11607c;
                long jI2 = p1.b.i(l1Var.f11541q, j10);
                l1Var.f11541q = jI2;
                l1Var.f11543s.setValue(new p1.b(p1.b.i(l1Var.f11539o, jI2)));
                y2.y yVarK = l1Var.k();
                p1.b bVarG = l1Var.g();
                jc.l.b(bVarG);
                l1.a(l1Var, yVarK, bVarG.f16481a, false, this.f11606b, t.f11635g, true);
                l1Var.q(false);
                break;
        }
    }

    @Override // h0.c1
    public final void onCancel() {
        switch (this.f11605a) {
            case 0:
                s0 s0Var = (s0) this.f11607c;
                s0Var.f11629s = true;
                s0Var.p();
                s0Var.f11626p.setValue(null);
                s0Var.f11627q.setValue(null);
                break;
        }
    }

    public r0(boolean z10, s0 s0Var) {
        this.f11606b = z10;
        this.f11607c = s0Var;
    }

    private final void f() {
    }

    private final void g(long j10) {
    }
}
