package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i7.e f12424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i7.e eVar, yb.c cVar) {
        super(cVar);
        this.f12424e = eVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f12423d = obj;
        this.f12425f |= Integer.MIN_VALUE;
        return this.f12424e.n(null, this);
    }
}
