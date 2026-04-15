package v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f22101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f22102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22103f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ac.c cVar) {
        super(cVar);
        this.f22102e = fVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f22101d = obj;
        this.f22103f |= Integer.MIN_VALUE;
        return this.f22102e.d(null, 0.0f, null, this);
    }
}
