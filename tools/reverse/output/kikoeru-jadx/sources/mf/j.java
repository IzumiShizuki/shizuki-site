package mf;

import hf.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ac.i f15149e;

    /* JADX WARN: Multi-variable type inference failed */
    public j(ic.o oVar, lf.f fVar, yb.h hVar, int i10, kf.a aVar) {
        super(i10, aVar, fVar, hVar);
        this.f15149e = (ac.i) oVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ac.i, ic.o] */
    @Override // mf.e
    public final e f(yb.h hVar, int i10, kf.a aVar) {
        return new j(this.f15149e, this.f15138d, hVar, i10, aVar);
    }

    @Override // mf.f
    public final Object k(lf.g gVar, yb.c cVar) {
        Object objK = a0.k(new h(this, gVar, null), cVar);
        return objK == zb.a.f26667a ? objK : ub.a0.f21526a;
    }
}
