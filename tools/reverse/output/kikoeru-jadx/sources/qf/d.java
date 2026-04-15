package qf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f18239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f18240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f18241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18242g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ac.c cVar) {
        super(cVar);
        this.f18241f = eVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f18240e = obj;
        this.f18242g |= Integer.MIN_VALUE;
        return this.f18241f.d(this);
    }
}
