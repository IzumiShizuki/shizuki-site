package mf;

import hf.y;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15139e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f15142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ lf.g f15143i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, lf.g gVar, Object obj, yb.c cVar) {
        super(2, cVar);
        this.f15142h = jVar;
        this.f15143i = gVar;
        this.f15141g = obj;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f15139e) {
            case 0:
                return new h(this.f15142h, this.f15143i, this.f15141g, cVar);
            default:
                h hVar = new h(this.f15142h, this.f15143i, cVar);
                hVar.f15141g = obj;
                return hVar;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f15139e) {
        }
        return ((h) o(yVar, cVar)).u(a0.f21526a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [ac.i, ic.o] */
    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f15139e) {
            case 0:
                int i10 = this.f15140f;
                if (i10 == 0) {
                    ub.a.f(obj);
                    ?? r92 = this.f15142h.f15149e;
                    Object obj2 = this.f15141g;
                    this.f15140f = 1;
                    Object objG = r92.g(this.f15143i, obj2, this);
                    zb.a aVar = zb.a.f26667a;
                    if (objG == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
            default:
                int i11 = this.f15140f;
                if (i11 == 0) {
                    ub.a.f(obj);
                    y yVar = (y) this.f15141g;
                    jc.y yVar2 = new jc.y();
                    j jVar = this.f15142h;
                    lf.f fVar = jVar.f15138d;
                    h0.q qVar = new h0.q(yVar2, yVar, jVar, this.f15143i, 1);
                    this.f15140f = 1;
                    Object objB = fVar.b(qVar, this);
                    zb.a aVar2 = zb.a.f26667a;
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ub.a.f(obj);
                }
                return a0.f21526a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, lf.g gVar, yb.c cVar) {
        super(2, cVar);
        this.f15142h = jVar;
        this.f15143i = gVar;
    }
}
