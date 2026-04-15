package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n4 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o4 f13323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13324g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(o4 o4Var, ac.c cVar) {
        super(cVar);
        this.f13323f = o4Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f13322e = obj;
        this.f13324g |= Integer.MIN_VALUE;
        return this.f13323f.V(0L, this);
    }
}
