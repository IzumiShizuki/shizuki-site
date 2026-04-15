package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f18061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m3.l f18062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(m3.l lVar, ac.c cVar) {
        super(cVar);
        this.f18062e = lVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f18061d = obj;
        this.f18063f |= Integer.MIN_VALUE;
        Object objS = this.f18062e.s(null, this);
        return objS == zb.a.f26667a ? objS : new ub.n(objS);
    }
}
