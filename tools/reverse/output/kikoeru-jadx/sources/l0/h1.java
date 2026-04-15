package l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements h0.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f11495b;

    public /* synthetic */ h1(l1 l1Var, int i10) {
        this.f11494a = i10;
        this.f11495b = l1Var;
    }

    @Override // h0.c1
    public final void a(long j10) {
        h0.r1 r1VarD;
        l1 l1Var;
        long j11;
        h0.r1 r1VarD2;
        h0.r1 r1VarD3;
        switch (this.f11494a) {
            case 0:
                l1 l1Var2 = this.f11495b;
                long jA = k0.a(l1Var2.j(true));
                h0.u0 u0Var = l1Var2.f11528d;
                if (u0Var != null && (r1VarD = u0Var.d()) != null) {
                    long jE = r1VarD.e(jA);
                    l1Var2.f11539o = jE;
                    l1Var2.f11543s.setValue(new p1.b(jE));
                    l1Var2.f11541q = 0L;
                    l1Var2.f11542r.setValue(h0.h0.f7646a);
                    l1Var2.q(false);
                    break;
                }
                break;
            default:
                l1 l1Var3 = this.f11495b;
                x0.e1 e1Var = l1Var3.f11542r;
                if (l1Var3.i() && ((h0.h0) e1Var.getValue()) == null) {
                    e1Var.setValue(h0.h0.f7648c);
                    l1Var3.f11544t = -1;
                    l1Var3.l();
                    h0.u0 u0Var2 = l1Var3.f11528d;
                    if (u0Var2 == null || (r1VarD3 = u0Var2.d()) == null || !r1VarD3.c(j10)) {
                        l1Var = l1Var3;
                        j11 = j10;
                        h0.u0 u0Var3 = l1Var.f11528d;
                        if (u0Var3 != null && (r1VarD2 = u0Var3.d()) != null) {
                            int i10 = l1Var.f11526b.i(r1VarD2.b(j11, true));
                            y2.y yVarC = l1.c(l1Var.k().f25434a, t2.c0.b(i10, i10));
                            l1Var.f(false);
                            y1.a aVar = l1Var.f11535k;
                            if (aVar != null) {
                                aVar.a(9);
                            }
                            l1Var.f11527c.a(yVarC);
                        }
                    } else if (l1Var3.k().f25434a.f20320b.length() != 0) {
                        l1Var3.f(false);
                        l1Var = l1Var3;
                        j11 = j10;
                        l1Var.f11540p = Integer.valueOf((int) (l1.a(l1Var3, y2.y.a(l1Var3.k(), null, t2.k0.f20356b, 5), j10, true, false, t.f11633e, true) >> 32));
                    }
                    l1Var.o(h0.i0.f7679a);
                    l1Var.f11539o = j11;
                    l1Var.f11543s.setValue(new p1.b(j11));
                    l1Var.f11541q = 0L;
                    break;
                }
                break;
        }
    }

    @Override // h0.c1
    public final void b() {
        switch (this.f11494a) {
            case 0:
                l1 l1Var = this.f11495b;
                l1Var.f11542r.setValue(null);
                l1Var.f11543s.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // h0.c1
    public final void c() {
        switch (this.f11494a) {
            case 0:
                l1 l1Var = this.f11495b;
                l1Var.f11542r.setValue(null);
                l1Var.f11543s.setValue(null);
                break;
        }
    }

    @Override // h0.c1
    public final void d() {
        int i10 = this.f11494a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    @Override // h0.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r21) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.h1.e(long):void");
    }

    public void i() {
        l1 l1Var = this.f11495b;
        l1Var.f11542r.setValue(null);
        l1Var.f11543s.setValue(null);
        l1Var.q(true);
        l1Var.f11540p = null;
        boolean zB = t2.k0.b(l1Var.k().f25435b);
        l1Var.o(zB ? h0.i0.f7681c : h0.i0.f7680b);
        h0.u0 u0Var = l1Var.f11528d;
        if (u0Var != null) {
            u0Var.f7869m.setValue(Boolean.valueOf(!zB && u0.w(l1Var, true)));
        }
        h0.u0 u0Var2 = l1Var.f11528d;
        if (u0Var2 != null) {
            u0Var2.f7870n.setValue(Boolean.valueOf(!zB && u0.w(l1Var, false)));
        }
        h0.u0 u0Var3 = l1Var.f11528d;
        if (u0Var3 == null) {
            return;
        }
        u0Var3.f7871o.setValue(Boolean.valueOf(zB && u0.w(l1Var, true)));
    }

    @Override // h0.c1
    public final void onCancel() {
        switch (this.f11494a) {
            case 0:
                break;
            default:
                i();
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }
}
