package se;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f19928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final le.o f19931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.k f19932f;

    public b0(k0 k0Var, List list, boolean z10, le.o oVar, ic.k kVar) {
        jc.l.e(k0Var, "constructor");
        jc.l.e(list, "arguments");
        jc.l.e(oVar, "memberScope");
        this.f19928b = k0Var;
        this.f19929c = list;
        this.f19930d = z10;
        this.f19931e = oVar;
        this.f19932f = kVar;
        if (!(oVar instanceof ue.g) || (oVar instanceof ue.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + oVar + '\n' + k0Var);
    }

    @Override // se.w0
    public final w0 B(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        a0 a0Var = (a0) this.f19932f.a(fVar);
        return a0Var == null ? this : a0Var;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: D */
    public final a0 z(boolean z10) {
        return z10 == this.f19930d ? this : z10 ? new z(this, 1) : new z(this, 0);
    }

    @Override // se.a0
    /* JADX INFO: renamed from: F */
    public final a0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return h0Var.isEmpty() ? this : new c0(this, h0Var);
    }

    @Override // se.w
    public final le.o n0() {
        return this.f19931e;
    }

    @Override // se.w
    public final List q() {
        return this.f19929c;
    }

    @Override // se.w
    public final h0 r() {
        h0.f19950b.getClass();
        return h0.f19951c;
    }

    @Override // se.w
    public final k0 t() {
        return this.f19928b;
    }

    @Override // se.w
    public final boolean u() {
        return this.f19930d;
    }

    @Override // se.w
    public final w v(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        a0 a0Var = (a0) this.f19932f.a(fVar);
        return a0Var == null ? this : a0Var;
    }
}
