package se;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends a0 {
    public abstract a0 G();

    @Override // se.w
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a0 v(te.f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        a0 a0VarG = G();
        jc.l.e(a0VarG, "type");
        return J(a0VarG);
    }

    public abstract m J(a0 a0Var);

    @Override // se.w
    public final le.o n0() {
        return G().n0();
    }

    @Override // se.w
    public final List q() {
        return G().q();
    }

    @Override // se.w
    public h0 r() {
        return G().r();
    }

    @Override // se.w
    public final k0 t() {
        return G().t();
    }

    @Override // se.w
    public boolean u() {
        return G().u();
    }
}
