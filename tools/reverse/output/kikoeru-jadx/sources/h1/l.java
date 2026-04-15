package h1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.k f8045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.k f8046c;

    public /* synthetic */ l(ic.k kVar, ic.k kVar2, int i10) {
        this.f8044a = i10;
        this.f8045b = kVar;
        this.f8046c = kVar2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        int i10 = this.f8044a;
        ub.a0 a0Var = ub.a0.f21526a;
        ic.k kVar = this.f8046c;
        ic.k kVar2 = this.f8045b;
        switch (i10) {
            case 0:
                kVar2.a(obj);
                kVar.a(obj);
                break;
            case 1:
                kVar2.a(obj);
                kVar.a(obj);
                break;
            default:
                q2.k kVar3 = (q2.k) obj;
                jc.l.e(kVar3, "$this$semantics");
                la.c cVar = new la.c(kVar, 0);
                pc.u[] uVarArr = q2.v.f17698a;
                kVar3.l(q2.j.f17605b, new q2.a(null, cVar));
                if (kVar2 != null) {
                    kVar3.l(q2.j.f17606c, new q2.a(null, new la.c(kVar2, 1)));
                }
                break;
        }
        return a0Var;
    }
}
