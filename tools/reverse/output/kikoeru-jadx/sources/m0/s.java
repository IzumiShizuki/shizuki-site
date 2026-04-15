package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f13580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13581f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, yb.c cVar) {
        super(cVar);
        this.f13580e = xVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f13579d = obj;
        this.f13581f |= Integer.MIN_VALUE;
        return this.f13580e.b(null, null, this);
    }
}
