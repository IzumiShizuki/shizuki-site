package x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ic.k f24299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j2.v0 f24301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(j2.v0 v0Var, yb.c cVar) {
        super(cVar);
        this.f24301f = v0Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f24300e = obj;
        this.f24302g |= Integer.MIN_VALUE;
        return this.f24301f.k(null, this);
    }
}
