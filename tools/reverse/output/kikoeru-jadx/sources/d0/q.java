package d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends jc.m implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f5391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf.y f5392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z10, d dVar, hf.y yVar) {
        super(1);
        this.f5390b = z10;
        this.f5391c = dVar;
        this.f5392d = yVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        q2.k kVar = (q2.k) obj;
        boolean z10 = this.f5390b;
        hf.y yVar = this.f5392d;
        d dVar = this.f5391c;
        if (z10) {
            p pVar = new p(0, dVar, yVar);
            pc.u[] uVarArr = q2.v.f17698a;
            kVar.l(q2.j.f17627x, new q2.a(null, pVar));
            kVar.l(q2.j.f17629z, new q2.a(null, new p(1, dVar, yVar)));
        } else {
            p pVar2 = new p(2, dVar, yVar);
            pc.u[] uVarArr2 = q2.v.f17698a;
            kVar.l(q2.j.f17628y, new q2.a(null, pVar2));
            kVar.l(q2.j.A, new q2.a(null, new p(3, dVar, yVar)));
        }
        return ub.a0.f21526a;
    }
}
