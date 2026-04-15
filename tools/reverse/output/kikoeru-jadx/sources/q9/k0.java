package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f18032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m3.l f18033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m3.l lVar, ac.c cVar) {
        super(cVar);
        this.f18033e = lVar;
    }

    @Override // ac.a
    public final Object u(Object obj) throws Throwable {
        this.f18032d = obj;
        this.f18034f |= Integer.MIN_VALUE;
        Object objO = this.f18033e.o(null, null, this);
        return objO == zb.a.f26667a ? objO : new ub.n(objO);
    }
}
