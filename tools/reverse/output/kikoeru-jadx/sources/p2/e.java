package p2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f16514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f16515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ac.c cVar) {
        super(cVar);
        this.f16515e = fVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f16514d = obj;
        this.f16516f |= Integer.MIN_VALUE;
        return this.f16515e.b(0.0f, this);
    }
}
