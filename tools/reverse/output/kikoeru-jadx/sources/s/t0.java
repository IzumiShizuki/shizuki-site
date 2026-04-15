package s;

import android.view.View;
import i2.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends j1.p implements i2.q, i2.p, y1, i2.k1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public jc.m f19273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public jc.m f19274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e1 f19275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f19276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f3.c f19277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d1 f19278t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x0.c0 f19280v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f3.l f19282x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public kf.f f19283y;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x0.e1 f19279u = new x0.e1(null, x0.r0.f24436c);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f19281w = 9205357640488583168L;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(ic.k kVar, ic.k kVar2, e1 e1Var) {
        this.f19273o = (jc.m) kVar;
        this.f19274p = (jc.m) kVar2;
        this.f19275q = e1Var;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean A() {
        return false;
    }

    public final long B0() {
        if (this.f19280v == null) {
            this.f19280v = x0.v.o(new s0(this, 0));
        }
        x0.c0 c0Var = this.f19280v;
        if (c0Var != null) {
            return ((p1.b) c0Var.getValue()).f16481a;
        }
        return 9205357640488583168L;
    }

    public final void C0() {
        d1 d1Var = this.f19278t;
        if (d1Var != null) {
            ((f1) d1Var).b();
        }
        View viewA = this.f19276r;
        if (viewA == null) {
            viewA = i2.f.A(this);
        }
        this.f19276r = viewA;
        f3.c cVar = this.f19277s;
        if (cVar == null) {
            cVar = i2.f.y(this).f8766y;
        }
        this.f19277s = cVar;
        this.f19278t = this.f19275q.b(viewA, cVar);
        E0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ic.k, jc.m] */
    public final void D0() {
        f3.c cVar = this.f19277s;
        if (cVar == null) {
            cVar = i2.f.y(this).f8766y;
            this.f19277s = cVar;
        }
        long j10 = ((p1.b) this.f19273o.a(cVar)).f16481a;
        if ((j10 & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & B0()) == 9205357640488583168L) {
            this.f19281w = 9205357640488583168L;
            d1 d1Var = this.f19278t;
            if (d1Var != null) {
                ((f1) d1Var).b();
                return;
            }
            return;
        }
        this.f19281w = p1.b.i(B0(), j10);
        if (this.f19278t == null) {
            C0();
        }
        d1 d1Var2 = this.f19278t;
        if (d1Var2 != null) {
            d1Var2.a(this.f19281w, 9205357640488583168L);
        }
        E0();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ic.k, jc.m] */
    public final void E0() {
        f3.c cVar;
        d1 d1Var = this.f19278t;
        if (d1Var == null || (cVar = this.f19277s) == null) {
            return;
        }
        f1 f1Var = (f1) d1Var;
        if (f3.l.a(f1Var.c(), this.f19282x)) {
            return;
        }
        this.f19274p.a(new f3.h(cVar.n(gh.g.R(f1Var.c()))));
        this.f19282x = new f3.l(f1Var.c());
    }

    @Override // i2.y1
    public final void L(q2.k kVar) {
        kVar.l(u0.f19286a, new s0(this, 1));
    }

    @Override // i2.p
    public final void R(i2.l0 l0Var) {
        l0Var.b();
        kf.f fVar = this.f19283y;
        if (fVar != null) {
            fVar.e(ub.a0.f21526a);
        }
    }

    @Override // i2.k1
    public final void W() {
        i2.f.t(this, new s0(this, 2));
    }

    @Override // i2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // i2.y1
    public final /* synthetic */ boolean k0() {
        return false;
    }

    @Override // j1.p
    public final void r0() {
        W();
        this.f19283y = g8.a.c(0, 7, null);
        hf.a0.y(n0(), null, hf.z.f8619d, new ba.v0(17, this, null), 1);
    }

    @Override // j1.p
    public final void t0() {
        d1 d1Var = this.f19278t;
        if (d1Var != null) {
            ((f1) d1Var).b();
        }
        this.f19278t = null;
    }

    @Override // i2.q
    public final void u(i2.g1 g1Var) {
        this.f19279u.setValue(g1Var);
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
    }
}
