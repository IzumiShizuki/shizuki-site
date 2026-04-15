package se;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f19933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var, h0 h0Var) {
        super(a0Var);
        jc.l.e(h0Var, "attributes");
        this.f19933c = h0Var;
    }

    @Override // se.m
    public final m J(a0 a0Var) {
        return new c0(a0Var, this.f19933c);
    }

    @Override // se.m, se.w
    public final h0 r() {
        return this.f19933c;
    }
}
