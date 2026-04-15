package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i2 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ic.a f13088c;

    public /* synthetic */ i2(String str, ic.a aVar, int i10) {
        this.f13086a = i10;
        this.f13087b = str;
        this.f13088c = aVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        q2.k kVar = (q2.k) obj;
        switch (this.f13086a) {
            case 0:
                q2.v.d(kVar, this.f13087b);
                kVar.l(q2.j.f17605b, new q2.a(null, new ba.j(6, this.f13088c)));
                break;
            case 1:
                q2.v.d(kVar, this.f13087b);
                kVar.l(q2.j.f17605b, new q2.a(null, new ba.j(7, this.f13088c)));
                break;
            default:
                q2.v.d(kVar, this.f13087b);
                kVar.l(q2.j.f17605b, new q2.a(null, new ba.j(8, this.f13088c)));
                break;
        }
        return ub.a0.f21526a;
    }
}
