package m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements lf.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1.s f13225b;

    public /* synthetic */ l1(h1.s sVar, int i10) {
        this.f13224a = i10;
        this.f13225b = sVar;
    }

    @Override // lf.g
    public final Object n(Object obj, yb.c cVar) {
        switch (this.f13224a) {
            case 0:
                w.j jVar = (w.j) obj;
                boolean z10 = jVar instanceof w.h;
                h1.s sVar = this.f13225b;
                if (z10) {
                    sVar.add(jVar);
                } else if (jVar instanceof w.i) {
                    sVar.remove(((w.i) jVar).f22977a);
                } else if (jVar instanceof w.f) {
                    sVar.add(jVar);
                } else if (jVar instanceof w.g) {
                    sVar.remove(((w.g) jVar).f22976a);
                } else if (jVar instanceof w.m) {
                    sVar.add(jVar);
                } else if (jVar instanceof w.n) {
                    sVar.remove(((w.n) jVar).f22981a);
                } else if (jVar instanceof w.l) {
                    sVar.remove(((w.l) jVar).f22979a);
                }
                break;
            case 1:
                w.j jVar2 = (w.j) obj;
                boolean z11 = jVar2 instanceof w.m;
                h1.s sVar2 = this.f13225b;
                if (z11) {
                    sVar2.add(jVar2);
                } else if (jVar2 instanceof w.n) {
                    sVar2.remove(((w.n) jVar2).f22981a);
                } else if (jVar2 instanceof w.l) {
                    sVar2.remove(((w.l) jVar2).f22979a);
                } else if (jVar2 instanceof w.b) {
                    sVar2.add(jVar2);
                } else if (jVar2 instanceof w.c) {
                    sVar2.remove(((w.c) jVar2).f22968a);
                } else if (jVar2 instanceof w.a) {
                    sVar2.remove(((w.a) jVar2).f22967a);
                }
                break;
            case 2:
                w.j jVar3 = (w.j) obj;
                boolean z12 = jVar3 instanceof w.m;
                h1.s sVar3 = this.f13225b;
                if (z12) {
                    sVar3.add(jVar3);
                } else if (jVar3 instanceof w.n) {
                    sVar3.remove(((w.n) jVar3).f22981a);
                } else if (jVar3 instanceof w.l) {
                    sVar3.remove(((w.l) jVar3).f22979a);
                } else if (jVar3 instanceof w.b) {
                    sVar3.add(jVar3);
                } else if (jVar3 instanceof w.c) {
                    sVar3.remove(((w.c) jVar3).f22968a);
                } else if (jVar3 instanceof w.a) {
                    sVar3.remove(((w.a) jVar3).f22967a);
                }
                break;
            default:
                w.j jVar4 = (w.j) obj;
                boolean z13 = jVar4 instanceof w.m;
                h1.s sVar4 = this.f13225b;
                if (z13) {
                    sVar4.add(jVar4);
                } else if (jVar4 instanceof w.n) {
                    sVar4.remove(((w.n) jVar4).f22981a);
                } else if (jVar4 instanceof w.l) {
                    sVar4.remove(((w.l) jVar4).f22979a);
                } else if (jVar4 instanceof w.b) {
                    sVar4.add(jVar4);
                } else if (jVar4 instanceof w.c) {
                    sVar4.remove(((w.c) jVar4).f22968a);
                } else if (jVar4 instanceof w.a) {
                    sVar4.remove(((w.a) jVar4).f22967a);
                }
                break;
        }
        return ub.a0.f21526a;
    }
}
