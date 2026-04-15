package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends q implements v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f19982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f19983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, w wVar) {
        super(qVar.f19978b, qVar.f19979c);
        jc.l.e(qVar, "origin");
        jc.l.e(wVar, "enhancement");
        this.f19982d = qVar;
        this.f19983e = wVar;
    }

    @Override // se.w0
    public final w0 B(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        q qVar = this.f19982d;
        jc.l.e(qVar, "type");
        w wVar = this.f19983e;
        jc.l.e(wVar, "type");
        return new s(qVar, wVar);
    }

    @Override // se.w0
    public final w0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return c.I(this.f19982d.C(h0Var), this.f19983e);
    }

    @Override // se.q
    public final a0 D() {
        return this.f19982d.D();
    }

    @Override // se.q
    public final String F(de.i iVar, de.i iVar2) {
        de.m mVar = iVar2.f5909a;
        return ((Boolean) mVar.f5943m.a(mVar, de.m.Y[11])).booleanValue() ? iVar.V(this.f19983e) : this.f19982d.F(iVar, iVar2);
    }

    @Override // se.v0
    public final w c() {
        return this.f19983e;
    }

    @Override // se.v0
    public final w0 o() {
        return this.f19982d;
    }

    @Override // se.q
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f19983e + ")] " + this.f19982d;
    }

    @Override // se.w
    public final w v(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        q qVar = this.f19982d;
        jc.l.e(qVar, "type");
        w wVar = this.f19983e;
        jc.l.e(wVar, "type");
        return new s(qVar, wVar);
    }

    @Override // se.w0
    public final w0 z(boolean z10) {
        return c.I(this.f19982d.z(z10), this.f19983e.x().z(z10));
    }
}
