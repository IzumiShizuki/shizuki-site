package j9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f10742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10743g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, yb.c cVar) {
        super(cVar);
        this.f10742f = uVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f10741e = obj;
        this.f10743g |= Integer.MIN_VALUE;
        return u.c(this.f10742f, null, this);
    }
}
