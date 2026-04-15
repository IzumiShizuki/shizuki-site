package t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f20116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ac.c cVar) {
        super(cVar);
        this.f20116e = hVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f20115d = obj;
        this.f20117f |= Integer.MIN_VALUE;
        return this.f20116e.V(0L, this);
    }
}
