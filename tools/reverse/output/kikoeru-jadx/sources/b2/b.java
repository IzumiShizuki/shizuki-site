package b2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f1450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1451f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ac.c cVar) {
        super(cVar);
        this.f1450e = dVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f1449d = obj;
        this.f1451f |= Integer.MIN_VALUE;
        return this.f1450e.a(0L, 0L, this);
    }
}
