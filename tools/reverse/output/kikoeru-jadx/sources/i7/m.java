package i7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f9200f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, yb.c cVar) {
        super(cVar);
        this.f9200f = gVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f9198d = obj;
        this.f9199e |= Integer.MIN_VALUE;
        return this.f9200f.n(null, this);
    }
}
