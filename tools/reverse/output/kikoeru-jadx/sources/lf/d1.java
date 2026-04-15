package lf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends ac.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e1 f12384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mf.p f12385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f12386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1 f12387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12388h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, ac.c cVar) {
        super(cVar);
        this.f12387g = e1Var;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        this.f12386f = obj;
        this.f12388h |= Integer.MIN_VALUE;
        return this.f12387g.a(this);
    }
}
