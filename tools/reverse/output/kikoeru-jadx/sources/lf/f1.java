package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f12402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, yb.c cVar) {
        super(cVar);
        this.f12402e = g1Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f12401d = obj;
        this.f12403f |= Integer.MIN_VALUE;
        this.f12402e.b(null, this);
        return zb.a.f26667a;
    }
}
