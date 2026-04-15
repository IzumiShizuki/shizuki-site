package uh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g0 f21989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f21990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f21991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21992g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, ac.c cVar) {
        super(cVar);
        this.f21991f = g0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f21990e = obj;
        this.f21992g |= Integer.MIN_VALUE;
        return this.f21991f.c(this);
    }
}
