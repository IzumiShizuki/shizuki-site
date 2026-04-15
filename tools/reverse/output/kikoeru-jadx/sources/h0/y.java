package h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f7935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f7936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f7937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y2.z f7938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2.y f7939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y2.j f7940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y2.r f7941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l0.l1 f7942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hf.y f7943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e0.b f7944k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u0 u0Var, boolean z10, boolean z11, y2.z zVar, y2.y yVar, y2.j jVar, y2.r rVar, l0.l1 l1Var, hf.y yVar2, e0.b bVar) {
        super(1);
        this.f7935b = u0Var;
        this.f7936c = z10;
        this.f7937d = z11;
        this.f7938e = zVar;
        this.f7939f = yVar;
        this.f7940g = jVar;
        this.f7941h = rVar;
        this.f7942i = l1Var;
        this.f7943j = yVar2;
        this.f7944k = bVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        r1 r1VarD;
        o1.u uVar = (o1.u) obj;
        u0 u0Var = this.f7935b;
        if (u0Var.b() != uVar.b()) {
            u0Var.f7862f.setValue(Boolean.valueOf(uVar.b()));
            if (u0Var.b() && this.f7936c && !this.f7937d) {
                q0.l(this.f7938e, u0Var, this.f7939f, this.f7940g, this.f7941h);
            } else {
                q0.i(u0Var);
            }
            if (uVar.b() && (r1VarD = u0Var.d()) != null) {
                hf.a0.y(this.f7943j, null, null, new f7.w(this.f7944k, this.f7939f, u0Var, r1VarD, this.f7941h, null, 2), 3);
            }
            if (!uVar.b()) {
                this.f7942i.e(null);
            }
        }
        return ub.a0.f21526a;
    }
}
