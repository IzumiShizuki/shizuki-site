package hf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends k1 implements yb.c, y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yb.h f8507c;

    public a(yb.h hVar, boolean z10) {
        super(z10);
        T((d1) hVar.R(v.f8599b));
        this.f8507c = hVar.G(this);
    }

    @Override // hf.k1
    public final String C() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // hf.y
    public final yb.h O() {
        return this.f8507c;
    }

    @Override // hf.k1
    public final void S(ce.j0 j0Var) {
        a0.t(j0Var, this.f8507c);
    }

    @Override // hf.k1
    public final void d0(Object obj) {
        if (!(obj instanceof s)) {
            m0(obj);
        } else {
            s sVar = (s) obj;
            l0(sVar.f8586a, s.f8585b.get(sVar) == 1);
        }
    }

    @Override // yb.c
    public final void h(Object obj) {
        Throwable thA = ub.n.a(obj);
        if (thA != null) {
            obj = new s(thA, false);
        }
        Object objX = X(obj);
        if (objX == a0.f8512e) {
            return;
        }
        p(objX);
    }

    public final void n0(z zVar, a aVar, ic.n nVar) {
        Object objQ;
        int iOrdinal = zVar.ordinal();
        ub.a0 a0Var = ub.a0.f21526a;
        if (iOrdinal == 0) {
            try {
                nf.b.h(a0Var, ud.s.p(ud.s.k(nVar, aVar, this)));
                return;
            } finally {
                th = th;
                if (th instanceof h0) {
                    th = ((h0) th).f8545a;
                }
                h(ub.a.b(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                jc.l.e(nVar, "<this>");
                ud.s.p(ud.s.k(nVar, aVar, this)).h(a0Var);
                return;
            }
            if (iOrdinal != 3) {
                throw new ce.j0();
            }
            try {
                yb.h hVar = this.f8507c;
                Object objN = nf.b.n(hVar, null);
                try {
                    if (nVar instanceof ac.a) {
                        jc.c0.c(2, nVar);
                        objQ = nVar.q(aVar, this);
                    } else {
                        objQ = ud.s.E(nVar, aVar, this);
                    }
                    nf.b.g(hVar, objN);
                    if (objQ != zb.a.f26667a) {
                        h(objQ);
                    }
                } catch (Throwable th2) {
                    nf.b.g(hVar, objN);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // yb.c
    public final yb.h s() {
        return this.f8507c;
    }

    public void m0(Object obj) {
    }

    public void l0(Throwable th2, boolean z10) {
    }
}
