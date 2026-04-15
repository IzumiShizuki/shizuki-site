package z9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f26644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f26645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, ac.c cVar) {
        super(cVar);
        this.f26645e = rVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f26644d = obj;
        this.f26646f |= Integer.MIN_VALUE;
        return this.f26645e.w(this);
    }
}
