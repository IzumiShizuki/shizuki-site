package la;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements ic.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic.n f11972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j7.b f11973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1.q f11974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f11975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ic.a f11976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ic.n f11977g;

    public /* synthetic */ g0(ic.n nVar, j7.b bVar, j1.q qVar, List list, ic.a aVar, ic.n nVar2, int i10) {
        this.f11971a = i10;
        this.f11972b = nVar;
        this.f11973c = bVar;
        this.f11974d = qVar;
        this.f11975e = list;
        this.f11976f = aVar;
        this.f11977g = nVar2;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        c0.f fVar = (c0.f) obj;
        switch (this.f11971a) {
            case 0:
                jc.l.e(fVar, "$this$LazyVerticalStaggeredGrid");
                final int i10 = 1;
                final j7.b bVar = this.f11973c;
                final j1.q qVar = this.f11974d;
                final List list = this.f11975e;
                final ic.a aVar = this.f11976f;
                final ic.n nVar = this.f11977g;
                this.f11972b.q(fVar, new ic.k() { // from class: la.e0
                    @Override // ic.k
                    public final Object a(Object obj2) {
                        c0.f fVar2 = (c0.f) obj2;
                        switch (i10) {
                            case 0:
                                jc.l.e(fVar2, "$this$content");
                                g1.d dVar = new g1.d(21);
                                j7.b bVar2 = bVar;
                                fVar2.f3060c.a(bVar2.c(), new c0.d(null, dVar, null, new f1.f(new i0(bVar2, qVar, list, aVar, nVar, 1), 1724500442, true)));
                                break;
                            default:
                                jc.l.e(fVar2, "$this$content");
                                g1.d dVar2 = new g1.d(20);
                                j7.b bVar3 = bVar;
                                fVar2.f3060c.a(bVar3.c(), new c0.d(null, dVar2, null, new f1.f(new i0(bVar3, qVar, list, aVar, nVar, 0), 1724500442, true)));
                                break;
                        }
                        return ub.a0.f21526a;
                    }
                });
                break;
            default:
                jc.l.e(fVar, "$this$LazyVerticalStaggeredGrid");
                final int i11 = 0;
                final j7.b bVar2 = this.f11973c;
                final j1.q qVar2 = this.f11974d;
                final List list2 = this.f11975e;
                final ic.a aVar2 = this.f11976f;
                final ic.n nVar2 = this.f11977g;
                this.f11972b.q(fVar, new ic.k() { // from class: la.e0
                    @Override // ic.k
                    public final Object a(Object obj2) {
                        c0.f fVar2 = (c0.f) obj2;
                        switch (i11) {
                            case 0:
                                jc.l.e(fVar2, "$this$content");
                                g1.d dVar = new g1.d(21);
                                j7.b bVar22 = bVar2;
                                fVar2.f3060c.a(bVar22.c(), new c0.d(null, dVar, null, new f1.f(new i0(bVar22, qVar2, list2, aVar2, nVar2, 1), 1724500442, true)));
                                break;
                            default:
                                jc.l.e(fVar2, "$this$content");
                                g1.d dVar2 = new g1.d(20);
                                j7.b bVar3 = bVar2;
                                fVar2.f3060c.a(bVar3.c(), new c0.d(null, dVar2, null, new f1.f(new i0(bVar3, qVar2, list2, aVar2, nVar2, 0), 1724500442, true)));
                                break;
                        }
                        return ub.a0.f21526a;
                    }
                });
                break;
        }
        return ub.a0.f21526a;
    }
}
