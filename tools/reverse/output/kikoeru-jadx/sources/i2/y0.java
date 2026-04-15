package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f8907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(z0 z0Var, int i10) {
        super(0);
        this.f8906b = i10;
        this.f8907c = z0Var;
    }

    @Override // ic.a
    public final Object b() {
        g2.f1 placementScope;
        switch (this.f8906b) {
            case 0:
                z0 z0Var = this.f8907c;
                n0 n0Var = z0Var.f8908f;
                n0Var.f8798i = 0;
                z0.e eVarZ = n0Var.f8790a.z();
                Object[] objArr = eVarZ.f26372a;
                int i10 = eVarZ.f26374c;
                for (int i11 = 0; i11 < i10; i11++) {
                    z0 z0Var2 = ((j0) objArr[i11]).G.f8805p;
                    z0Var2.f8910h = z0Var2.f8911i;
                    z0Var2.f8911i = Integer.MAX_VALUE;
                    z0Var2.f8923u = false;
                    if (z0Var2.f8914l == h0.f8721b) {
                        z0Var2.f8914l = h0.f8722c;
                    }
                }
                j0 j0Var = n0Var.f8790a;
                j0 j0Var2 = n0Var.f8790a;
                z0.e eVarZ2 = j0Var.z();
                Object[] objArr2 = eVarZ2.f26372a;
                int i12 = eVarZ2.f26374c;
                for (int i13 = 0; i13 < i12; i13++) {
                    ((j0) objArr2[i13]).G.f8805p.f8927y.f8775d = false;
                }
                z0Var.d().u0().j();
                z0.e eVarZ3 = j0Var2.z();
                Object[] objArr3 = eVarZ3.f26372a;
                int i14 = eVarZ3.f26374c;
                for (int i15 = 0; i15 < i14; i15++) {
                    j0 j0Var3 = (j0) objArr3[i15];
                    n0 n0Var2 = j0Var3.G;
                    if (n0Var2.f8805p.f8910h != j0Var3.w()) {
                        j0Var2.P();
                        j0Var2.C();
                        if (j0Var3.w() == Integer.MAX_VALUE) {
                            if (n0Var2.f8792c) {
                                v0 v0Var = n0Var2.f8806q;
                                jc.l.b(v0Var);
                                v0Var.l0(false);
                            }
                            n0Var2.f8805p.o0();
                        }
                    }
                }
                z0.e eVarZ4 = j0Var2.z();
                Object[] objArr4 = eVarZ4.f26372a;
                int i16 = eVarZ4.f26374c;
                for (int i17 = 0; i17 < i16; i17++) {
                    k0 k0Var = ((j0) objArr4[i17]).G.f8805p.f8927y;
                    k0Var.f8776e = k0Var.f8775d;
                }
                break;
            case 1:
                z0 z0Var3 = this.f8907c;
                z0Var3.f8908f.a().v(z0Var3.C);
                break;
            default:
                z0 z0Var4 = this.f8907c;
                n0 n0Var3 = z0Var4.f8908f;
                g1 g1Var = n0Var3.a().f8704s;
                if (g1Var == null || (placementScope = g1Var.f8825l) == null) {
                    placementScope = ((j2.v) m0.a(n0Var3.f8790a)).getPlacementScope();
                }
                ic.k kVar = z0Var4.H;
                t1.b bVar = z0Var4.I;
                if (bVar != null) {
                    g1 g1VarA = n0Var3.a();
                    long j10 = z0Var4.J;
                    float f10 = z0Var4.K;
                    placementScope.getClass();
                    g2.f1.b(placementScope, g1VarA);
                    g1VarA.d0(f3.j.d(j10, g1VarA.f7184e), f10, bVar);
                } else if (kVar == null) {
                    g1 g1VarA2 = n0Var3.a();
                    long j11 = z0Var4.J;
                    float f11 = z0Var4.K;
                    placementScope.getClass();
                    g2.f1.b(placementScope, g1VarA2);
                    g1VarA2.Y(f3.j.d(j11, g1VarA2.f7184e), f11, null);
                } else {
                    g1 g1VarA3 = n0Var3.a();
                    long j12 = z0Var4.J;
                    float f12 = z0Var4.K;
                    placementScope.getClass();
                    g2.f1.b(placementScope, g1VarA3);
                    g1VarA3.Y(f3.j.d(j12, g1VarA3.f7184e), f12, kVar);
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
