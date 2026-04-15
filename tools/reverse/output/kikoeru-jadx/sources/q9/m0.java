package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f18043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m3.l f18044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(m3.l lVar, ac.c cVar) {
        super(cVar);
        this.f18044e = lVar;
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        this.f18043d = obj;
        this.f18045f |= Integer.MIN_VALUE;
        Object objP = this.f18044e.p(null, this);
        return objP == zb.a.f26667a ? objP : new ub.n(objP);
    }
}
