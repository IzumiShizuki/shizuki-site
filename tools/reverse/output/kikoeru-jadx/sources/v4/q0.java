package v4;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements j5.j0, b5.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f22619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f22620b;

    public q0(t0 t0Var, s0 s0Var) {
        this.f22620b = t0Var;
        this.f22619a = s0Var;
    }

    @Override // b5.r
    public final void A(int i10, j5.d0 d0Var) {
        Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new n0(this, pairB, 1));
        }
    }

    @Override // j5.j0
    public final void G(int i10, j5.d0 d0Var, j5.u uVar, j5.z zVar) {
        Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new o0(this, pairB, uVar, zVar, 1));
        }
    }

    @Override // j5.j0
    public final void H(int i10, j5.d0 d0Var, j5.u uVar, j5.z zVar) {
        Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new o0(this, pairB, uVar, zVar, 0));
        }
    }

    @Override // j5.j0
    public final void T(int i10, j5.d0 d0Var, j5.z zVar) {
        Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new m0(this, pairB, zVar, 0));
        }
    }

    @Override // b5.r
    public final void a(int i10, j5.d0 d0Var) {
        Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new n0(this, pairB, 0));
        }
    }

    public final Pair b(int i10, j5.d0 d0Var) {
        j5.d0 d0VarA;
        s0 s0Var = this.f22619a;
        j5.d0 d0Var2 = null;
        if (d0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= s0Var.f22629c.size()) {
                    d0VarA = null;
                    break;
                }
                if (((j5.d0) s0Var.f22629c.get(i11)).f10248d == d0Var.f10248d) {
                    Object obj = d0Var.f10245a;
                    Object obj2 = s0Var.f22628b;
                    int i12 = y0.f22716n;
                    d0VarA = d0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (d0VarA == null) {
                return null;
            }
            d0Var2 = d0VarA;
        }
        return Pair.create(Integer.valueOf(i10 + s0Var.f22630d), d0Var2);
    }

    @Override // j5.j0
    public final void k(int i10, j5.d0 d0Var, j5.u uVar, j5.z zVar, int i11) {
        Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new b7.y0(this, pairB, uVar, zVar, i11, 2));
        }
    }

    @Override // j5.j0
    public final void q(int i10, j5.d0 d0Var, final j5.u uVar, final j5.z zVar, final IOException iOException, final boolean z10) {
        final Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new Runnable() { // from class: v4.p0
                @Override // java.lang.Runnable
                public final void run() {
                    w4.d dVar = this.f22611a.f22620b.f22643h;
                    Pair pair = pairB;
                    dVar.q(((Integer) pair.first).intValue(), (j5.d0) pair.second, uVar, zVar, iOException, z10);
                }
            });
        }
    }

    @Override // b5.r
    public final void v(int i10, j5.d0 d0Var) {
        Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new n0(this, pairB, 2));
        }
    }

    @Override // b5.r
    public final void w(int i10, j5.d0 d0Var, int i11) {
        Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new b5.n(this, pairB, i11, 5));
        }
    }

    @Override // b5.r
    public final void x(int i10, j5.d0 d0Var, Exception exc) {
        Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new b5.m(this, pairB, exc, 10));
        }
    }

    @Override // j5.j0
    public final void z(int i10, j5.d0 d0Var, j5.z zVar) {
        Pair pairB = b(i10, d0Var);
        if (pairB != null) {
            this.f22620b.f22644i.c(new m0(this, pairB, zVar, 1));
        }
    }
}
