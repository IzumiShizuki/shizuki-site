package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends m implements v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f19935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f19936c;

    public d0(a0 a0Var, w wVar) {
        jc.l.e(a0Var, "delegate");
        jc.l.e(wVar, "enhancement");
        this.f19935b = a0Var;
        this.f19936c = wVar;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: D */
    public final a0 z(boolean z10) {
        w0 w0VarI = c.I(this.f19935b.z(z10), this.f19936c.x().z(z10));
        jc.l.c(w0VarI, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (a0) w0VarI;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: F */
    public final a0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        w0 w0VarI = c.I(this.f19935b.C(h0Var), this.f19936c);
        jc.l.c(w0VarI, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (a0) w0VarI;
    }

    @Override // se.m
    public final a0 G() {
        return this.f19935b;
    }

    @Override // se.m
    public final m J(a0 a0Var) {
        return new d0(a0Var, this.f19936c);
    }

    @Override // se.m, se.w
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final d0 v(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        a0 a0Var = this.f19935b;
        jc.l.e(a0Var, "type");
        w wVar = this.f19936c;
        jc.l.e(wVar, "type");
        return new d0(a0Var, wVar);
    }

    @Override // se.v0
    public final w c() {
        return this.f19936c;
    }

    @Override // se.v0
    public final w0 o() {
        return this.f19935b;
    }

    @Override // se.a0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f19936c + ")] " + this.f19935b;
    }
}
