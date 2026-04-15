package hf;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends pf.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8552c;

    public j0(int i10) {
        super(0L, false);
        this.f8552c = i10;
    }

    public abstract yb.c c();

    public Throwable d(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            return sVar.f8586a;
        }
        return null;
    }

    public final void g(Throwable th2) {
        a0.t(new hc.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), c().s());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            yb.c cVarC = c();
            jc.l.c(cVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            nf.g gVar = (nf.g) cVarC;
            ac.c cVar = gVar.f15828e;
            Object obj = gVar.f15830g;
            yb.h hVarS = cVar.s();
            Object objN = nf.b.n(hVarS, obj);
            d1 d1Var = null;
            a2 a2VarG = objN != nf.b.f15817d ? a0.G(cVar, hVarS, objN) : null;
            try {
                yb.h hVarS2 = cVar.s();
                Object objI = i();
                Throwable thD = d(objI);
                if (thD == null) {
                    int i10 = this.f8552c;
                    boolean z10 = true;
                    if (i10 != 1 && i10 != 2) {
                        z10 = false;
                    }
                    if (z10) {
                        d1Var = (d1) hVarS2.R(v.f8599b);
                    }
                }
                if (d1Var != null && !d1Var.b()) {
                    CancellationException cancellationExceptionU = d1Var.u();
                    b(cancellationExceptionU);
                    cVar.h(ub.a.b(cancellationExceptionU));
                } else if (thD != null) {
                    cVar.h(ub.a.b(thD));
                } else {
                    cVar.h(e(objI));
                }
                if (a2VarG == null || a2VarG.p0()) {
                    nf.b.g(hVarS, objN);
                }
            } catch (Throwable th2) {
                if (a2VarG == null || a2VarG.p0()) {
                    nf.b.g(hVarS, objN);
                }
                throw th2;
            }
        } catch (h0 e10) {
            a0.t(e10.f8545a, c().s());
        } catch (Throwable th3) {
            g(th3);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
