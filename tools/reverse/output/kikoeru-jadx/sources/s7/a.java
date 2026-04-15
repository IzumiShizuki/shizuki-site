package s7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f19540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f19541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ac.c cVar) {
        super(cVar);
        this.f19541e = dVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f19540d = obj;
        this.f19542f |= Integer.MIN_VALUE;
        return this.f19541e.a(null, this);
    }
}
