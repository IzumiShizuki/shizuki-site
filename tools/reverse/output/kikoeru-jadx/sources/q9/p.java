package q9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f18065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f18066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18067g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ac.c cVar) {
        super(cVar);
        this.f18066f = qVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f18065e = obj;
        this.f18067g |= Integer.MIN_VALUE;
        return this.f18066f.c(null, this);
    }
}
