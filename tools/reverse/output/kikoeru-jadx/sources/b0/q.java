package b0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q extends j1.p implements h2.e, i2.z {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f1332r = new n();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r f1333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f1334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u.e1 f1335q;

    public final boolean B0(l lVar, int i10) {
        if (i10 == 5 || i10 == 6) {
            if (this.f1335q == u.e1.f20883b) {
                return false;
            }
        } else if (i10 == 3 || i10 == 4) {
            if (this.f1335q == u.e1.f20882a) {
                return false;
            }
        } else if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (C0(i10)) {
            if (lVar.f1287b >= this.f1333o.a() - 1) {
                return false;
            }
        } else if (lVar.f1286a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean C0(int i10) {
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 5) {
            return false;
        }
        if (i10 == 6) {
            return true;
        }
        if (i10 == 3) {
            int iOrdinal = i2.f.y(this).f8767z.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new ce.j0();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = i2.f.y(this).f8767z.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new ce.j0();
    }

    @Override // h2.e
    public final a2.c K() {
        h2.g gVar = g2.l.f7227a;
        h2.h hVar = new h2.h(gVar);
        hVar.h0(gVar, this);
        return hVar;
    }

    @Override // i2.z
    public final /* synthetic */ int b(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.k(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int c(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.d(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int d(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.g(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final /* synthetic */ int f(i2.q0 q0Var, g2.u0 u0Var, int i10) {
        return a0.c.n(this, q0Var, u0Var, i10);
    }

    @Override // i2.z
    public final g2.w0 g(g2.x0 x0Var, g2.u0 u0Var, long j10) {
        g2.g1 g1VarV = u0Var.v(j10);
        return x0Var.b0(g1VarV.f7180a, g1VarV.f7181b, vb.s.f22820a, new p(g1VarV, 0));
    }

    @Override // h2.f
    public final /* synthetic */ Object s(h2.g gVar) {
        return a0.c.a(this, gVar);
    }
}
