package m8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f14956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f14957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, ac.c cVar) {
        super(cVar);
        this.f14957e = lVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f14956d = obj;
        this.f14958f |= Integer.MIN_VALUE;
        return this.f14957e.b(null, this);
    }
}
