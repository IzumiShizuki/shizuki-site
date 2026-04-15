package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends q implements j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var, a0 a0Var2) {
        super(a0Var, a0Var2);
        jc.l.e(a0Var, "lowerBound");
        jc.l.e(a0Var2, "upperBound");
    }

    @Override // se.w0
    /* JADX INFO: renamed from: B */
    public final w0 v(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        a0 a0Var = this.f19978b;
        jc.l.e(a0Var, "type");
        a0 a0Var2 = this.f19979c;
        jc.l.e(a0Var2, "type");
        return new r(a0Var, a0Var2);
    }

    @Override // se.w0
    public final w0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return c.g(this.f19978b.C(h0Var), this.f19979c.C(h0Var));
    }

    @Override // se.q
    public final a0 D() {
        return this.f19978b;
    }

    @Override // se.q
    public final String F(de.i iVar, de.i iVar2) {
        boolean zL = iVar2.f5909a.l();
        a0 a0Var = this.f19979c;
        a0 a0Var2 = this.f19978b;
        if (!zL) {
            return iVar.D(iVar.V(a0Var2), iVar.V(a0Var), ud.e.w(this));
        }
        return "(" + iVar.V(a0Var2) + ".." + iVar.V(a0Var) + ')';
    }

    @Override // se.j
    public final w0 i(w wVar) {
        w0 w0VarG;
        jc.l.e(wVar, "replacement");
        w0 w0VarX = wVar.x();
        if (w0VarX instanceof q) {
            w0VarG = w0VarX;
        } else {
            if (!(w0VarX instanceof a0)) {
                throw new ce.j0();
            }
            a0 a0Var = (a0) w0VarX;
            w0VarG = c.g(a0Var, a0Var.z(true));
        }
        return c.j(w0VarG, w0VarX);
    }

    @Override // se.j
    public final boolean k() {
        a0 a0Var = this.f19978b;
        return (a0Var.t().h() instanceof yc.q0) && jc.l.a(a0Var.t(), this.f19979c.t());
    }

    @Override // se.q
    public final String toString() {
        return "(" + this.f19978b + ".." + this.f19979c + ')';
    }

    @Override // se.w
    public final w v(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        a0 a0Var = this.f19978b;
        jc.l.e(a0Var, "type");
        a0 a0Var2 = this.f19979c;
        jc.l.e(a0Var2, "type");
        return new r(a0Var, a0Var2);
    }

    @Override // se.w0
    public final w0 z(boolean z10) {
        return c.g(this.f19978b.z(z10), this.f19979c.z(z10));
    }
}
