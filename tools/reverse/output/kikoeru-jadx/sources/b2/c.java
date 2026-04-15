package b2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f1453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1454f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ac.c cVar) {
        super(cVar);
        this.f1453e = dVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f1452d = obj;
        this.f1454f |= Integer.MIN_VALUE;
        return this.f1453e.b(0L, this);
    }
}
