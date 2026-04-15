package z9;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f26651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f26652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, ac.c cVar) {
        super(cVar);
        this.f26652e = rVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f26651d = obj;
        this.f26653f |= Integer.MIN_VALUE;
        return this.f26652e.A(this);
    }
}
