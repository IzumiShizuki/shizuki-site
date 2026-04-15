package mf;

import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ac.c implements lf.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lf.g f15154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yb.h f15155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public yb.h f15157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public yb.c f15158h;

    public p(lf.g gVar, yb.h hVar) {
        super(n.f15152a, yb.i.f26088a);
        this.f15154d = gVar;
        this.f15155e = hVar;
        this.f15156f = ((Number) hVar.y(new m9.d(2), 0)).intValue();
    }

    @Override // ac.a, ac.d
    public final ac.d f() {
        yb.c cVar = this.f15158h;
        if (cVar instanceof ac.d) {
            return (ac.d) cVar;
        }
        return null;
    }

    @Override // lf.g
    public final Object n(Object obj, yb.c cVar) {
        try {
            Object objX = x(cVar, obj);
            return objX == zb.a.f26667a ? objX : a0.f21526a;
        } catch (Throwable th2) {
            this.f15157g = new l(th2, cVar.s());
            throw th2;
        }
    }

    @Override // ac.a
    public final StackTraceElement r() {
        return null;
    }

    @Override // ac.c, yb.c
    public final yb.h s() {
        yb.h hVar = this.f15157g;
        return hVar == null ? yb.i.f26088a : hVar;
    }

    @Override // ac.a
    public final Object u(Object obj) {
        Throwable thA = ub.n.a(obj);
        if (thA != null) {
            this.f15157g = new l(thA, s());
        }
        yb.c cVar = this.f15158h;
        if (cVar != null) {
            cVar.h(obj);
        }
        return zb.a.f26667a;
    }

    public final Object x(yb.c cVar, Object obj) {
        yb.h hVarS = cVar.s();
        hf.a0.m(hVarS);
        yb.h hVar = this.f15157g;
        if (hVar != hVarS) {
            if (hVar instanceof l) {
                throw new IllegalStateException(ef.o.Z("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((l) hVar).f15151b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) hVarS.y(new a9.r(13, this), 0)).intValue() != this.f15156f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f15155e + ",\n\t\tbut emission happened in " + hVarS + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f15157g = hVarS;
        }
        this.f15158h = cVar;
        ic.o oVar = r.f15160a;
        lf.g gVar = this.f15154d;
        jc.l.c(gVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objG = oVar.g(gVar, obj, this);
        if (!jc.l.a(objG, zb.a.f26667a)) {
            this.f15158h = null;
        }
        return objG;
    }
}
