package uh;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f22025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0 f22026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f22027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f22028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22029h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(y yVar, ac.c cVar) {
        super(cVar);
        this.f22028g = yVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f22027f = obj;
        this.f22029h |= Integer.MIN_VALUE;
        return y.a(this.f22028g, null, this);
    }
}
