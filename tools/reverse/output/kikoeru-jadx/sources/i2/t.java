package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends r0 {
    @Override // i2.r0
    public final void D0() {
        v0 v0Var = this.f8831o.f8700o.G.f8806q;
        jc.l.b(v0Var);
        v0Var.q0();
    }

    @Override // g2.u0
    public final int L(int i10) {
        androidx.media3.exoplayer.offline.u uVarU = this.f8831o.f8700o.u();
        g2.v0 v0VarV0 = uVarU.V0();
        j0 j0Var = (j0) uVarU.f968b;
        return v0VarV0.g(j0Var.F.f8665d, j0Var.l(), i10);
    }

    @Override // g2.u0
    public final int b(int i10) {
        androidx.media3.exoplayer.offline.u uVarU = this.f8831o.f8700o.u();
        g2.v0 v0VarV0 = uVarU.V0();
        j0 j0Var = (j0) uVarU.f968b;
        return v0VarV0.i(j0Var.F.f8665d, j0Var.l(), i10);
    }

    @Override // g2.u0
    public final int m(int i10) {
        androidx.media3.exoplayer.offline.u uVarU = this.f8831o.f8700o.u();
        g2.v0 v0VarV0 = uVarU.V0();
        j0 j0Var = (j0) uVarU.f968b;
        return v0VarV0.f(j0Var.F.f8665d, j0Var.l(), i10);
    }

    @Override // i2.q0
    public final int n0(g2.t tVar) {
        v0 v0Var = this.f8831o.f8700o.G.f8806q;
        jc.l.b(v0Var);
        k0 k0Var = v0Var.f8874s;
        if (!v0Var.f8866k) {
            n0 n0Var = v0Var.f8861f;
            if (n0Var.f8793d == f0.f8690b) {
                k0Var.f8777f = true;
                if (k0Var.f8773b) {
                    n0Var.f8795f = true;
                    n0Var.f8796g = true;
                }
            } else {
                k0Var.f8778g = true;
            }
        }
        t tVar2 = v0Var.d().S;
        if (tVar2 != null) {
            tVar2.f8824k = true;
        }
        v0Var.D();
        t tVar3 = v0Var.d().S;
        if (tVar3 != null) {
            tVar3.f8824k = false;
        }
        Integer num = (Integer) k0Var.f8780i.get(tVar);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f8836t.h(iIntValue, tVar);
        return iIntValue;
    }

    @Override // g2.u0
    public final int t(int i10) {
        androidx.media3.exoplayer.offline.u uVarU = this.f8831o.f8700o.u();
        g2.v0 v0VarV0 = uVarU.V0();
        j0 j0Var = (j0) uVarU.f968b;
        return v0VarV0.c(j0Var.F.f8665d, j0Var.l(), i10);
    }

    @Override // g2.u0
    public final g2.g1 v(long j10) {
        k0(j10);
        g1 g1Var = this.f8831o;
        z0.e eVarZ = g1Var.f8700o.z();
        Object[] objArr = eVarZ.f26372a;
        int i10 = eVarZ.f26374c;
        for (int i11 = 0; i11 < i10; i11++) {
            v0 v0Var = ((j0) objArr[i11]).G.f8806q;
            jc.l.b(v0Var);
            v0Var.f8865j = h0.f8722c;
        }
        j0 j0Var = g1Var.f8700o;
        r0.B0(this, j0Var.f8764w.h(this, j0Var.l(), j10));
        return this;
    }
}
