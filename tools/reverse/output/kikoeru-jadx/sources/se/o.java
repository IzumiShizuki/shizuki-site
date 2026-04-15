package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f19974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f19975c;

    public o(p0 p0Var, p0 p0Var2) {
        this.f19974b = p0Var;
        this.f19975c = p0Var2;
    }

    @Override // se.p0
    public final boolean a() {
        return this.f19974b.a() || this.f19975c.a();
    }

    @Override // se.p0
    public final boolean b() {
        return this.f19974b.b() || this.f19975c.b();
    }

    @Override // se.p0
    public final zc.h c(zc.h hVar) {
        jc.l.e(hVar, "annotations");
        return this.f19975c.c(this.f19974b.c(hVar));
    }

    @Override // se.p0
    public final n0 d(w wVar) {
        n0 n0VarD = this.f19974b.d(wVar);
        return n0VarD == null ? this.f19975c.d(wVar) : n0VarD;
    }

    @Override // se.p0
    public final w f(w wVar, x0 x0Var) {
        jc.l.e(wVar, "topLevelType");
        jc.l.e(x0Var, "position");
        return this.f19975c.f(this.f19974b.f(wVar, x0Var), x0Var);
    }
}
