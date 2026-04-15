package b2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f1466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ac.c cVar) {
        super(cVar);
        this.f1466f = gVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f1465e = obj;
        this.f1467g |= Integer.MIN_VALUE;
        return this.f1466f.V(0L, this);
    }
}
