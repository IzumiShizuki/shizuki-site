package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f9956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9957f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, ac.c cVar) {
        super(cVar);
        this.f9956e = q0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f9955d = obj;
        this.f9957f |= Integer.MIN_VALUE;
        this.f9956e.a(null, this);
        return zb.a.f26667a;
    }
}
