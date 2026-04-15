package r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w0 f18583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f18585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f18586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18587h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, ac.c cVar) {
        super(cVar);
        this.f18586g = w0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f18585f = obj;
        this.f18587h |= Integer.MIN_VALUE;
        return w0.E1(this.f18586g, this);
    }
}
