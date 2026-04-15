package i8;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i7.g f9423f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i7.g gVar, yb.c cVar) {
        super(cVar);
        this.f9423f = gVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f9421d = obj;
        this.f9422e |= Integer.MIN_VALUE;
        return this.f9423f.n(null, this);
    }
}
