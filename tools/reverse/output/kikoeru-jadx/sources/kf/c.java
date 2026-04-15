package kf;

import hf.a0;
import hf.c2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11340a = h.f11371p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hf.k f11341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f11342c;

    public c(f fVar) {
        this.f11342c = fVar;
    }

    @Override // hf.c2
    public final void a(nf.r rVar, int i10) {
        hf.k kVar = this.f11341b;
        if (kVar != null) {
            kVar.a(rVar, i10);
        }
    }

    public final Object b(ac.c cVar) throws Throwable {
        n nVarQ;
        Object obj = this.f11340a;
        boolean z10 = true;
        if (obj == h.f11371p || obj == h.f11367l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f.f11350g;
            f fVar = this.f11342c;
            n nVar = (n) atomicReferenceFieldUpdater.get(fVar);
            while (true) {
                if (fVar.x()) {
                    this.f11340a = h.f11367l;
                    Throwable thR = fVar.r();
                    if (thR != null) {
                        int i10 = nf.s.f15855a;
                        throw thR;
                    }
                    z10 = false;
                } else {
                    long andIncrement = f.f11346c.getAndIncrement(fVar);
                    long j10 = h.f11357b;
                    long j11 = andIncrement / j10;
                    int i11 = (int) (andIncrement % j10);
                    if (nVar.f15854c != j11) {
                        nVarQ = fVar.q(j11, nVar);
                        if (nVarQ == null) {
                            continue;
                        }
                    } else {
                        nVarQ = nVar;
                    }
                    Object objF = fVar.F(nVarQ, i11, andIncrement, null);
                    app.nekogram.translator.r rVar = h.f11368m;
                    if (objF == rVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    app.nekogram.translator.r rVar2 = h.f11370o;
                    if (objF == rVar2) {
                        if (andIncrement < fVar.u()) {
                            nVarQ.a();
                        }
                        nVar = nVarQ;
                    } else {
                        if (objF == h.f11369n) {
                            f fVar2 = this.f11342c;
                            hf.k kVarS = a0.s(ud.s.p(cVar));
                            try {
                                this.f11341b = kVarS;
                                Object objF2 = fVar2.F(nVarQ, i11, andIncrement, this);
                                if (objF2 == rVar) {
                                    a(nVarQ, i11);
                                } else {
                                    if (objF2 == rVar2) {
                                        if (andIncrement < fVar2.u()) {
                                            nVarQ.a();
                                        }
                                        n nVar2 = (n) f.f11350g.get(fVar2);
                                        while (true) {
                                            if (fVar2.x()) {
                                                hf.k kVar = this.f11341b;
                                                jc.l.b(kVar);
                                                this.f11341b = null;
                                                this.f11340a = h.f11367l;
                                                Throwable thR2 = fVar.r();
                                                if (thR2 == null) {
                                                    kVar.h(Boolean.FALSE);
                                                } else {
                                                    kVar.h(ub.a.b(thR2));
                                                }
                                            } else {
                                                long andIncrement2 = f.f11346c.getAndIncrement(fVar2);
                                                long j12 = h.f11357b;
                                                long j13 = andIncrement2 / j12;
                                                int i12 = (int) (andIncrement2 % j12);
                                                if (nVar2.f15854c != j13) {
                                                    n nVarQ2 = fVar2.q(j13, nVar2);
                                                    if (nVarQ2 != null) {
                                                        nVar2 = nVarQ2;
                                                    }
                                                }
                                                Object objF3 = fVar2.F(nVar2, i12, andIncrement2, this);
                                                if (objF3 == h.f11368m) {
                                                    a(nVar2, i12);
                                                    break;
                                                }
                                                if (objF3 == h.f11370o) {
                                                    if (andIncrement2 < fVar2.u()) {
                                                        nVar2.a();
                                                    }
                                                } else {
                                                    if (objF3 == h.f11369n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    nVar2.a();
                                                    this.f11340a = objF3;
                                                    this.f11341b = null;
                                                }
                                            }
                                        }
                                    } else {
                                        nVarQ.a();
                                        this.f11340a = objF2;
                                        this.f11341b = null;
                                    }
                                    kVarS.m(Boolean.TRUE, null);
                                }
                                return kVarS.q();
                            } catch (Throwable th2) {
                                kVarS.C();
                                throw th2;
                            }
                        }
                        nVarQ.a();
                        this.f11340a = objF;
                    }
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    public final Object c() throws Throwable {
        Object obj = this.f11340a;
        app.nekogram.translator.r rVar = h.f11371p;
        if (obj == rVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f11340a = rVar;
        if (obj != h.f11367l) {
            return obj;
        }
        Throwable thS = this.f11342c.s();
        int i10 = nf.s.f15855a;
        throw thS;
    }
}
