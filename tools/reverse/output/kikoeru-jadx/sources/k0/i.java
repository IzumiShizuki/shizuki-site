package k0;

import g2.c0;
import h0.c1;
import l0.a1;
import l0.b1;
import l0.s;
import l0.t;
import l0.x;
import l0.y0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10937a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10938b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f10939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0 f10940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f10941e;

    public i(g gVar, y0 y0Var, long j10) {
        this.f10939c = gVar;
        this.f10940d = y0Var;
        this.f10941e = j10;
    }

    @Override // h0.c1
    public final void a(long j10) {
        c0 c0Var = (c0) this.f10939c.b();
        y0 y0Var = this.f10940d;
        if (c0Var != null) {
            if (!c0Var.h()) {
                return;
            }
            s sVar = t.f11633e;
            k1.o oVar = ((a1) y0Var).f11415f;
            if (oVar != null) {
                oVar.l(Boolean.TRUE, c0Var, new p1.b(j10), sVar);
            }
            this.f10937a = j10;
        }
        if (b1.a(y0Var, this.f10941e)) {
            this.f10938b = 0L;
        }
    }

    @Override // h0.c1
    public final void b() {
        x xVar;
        long j10 = this.f10941e;
        y0 y0Var = this.f10940d;
        if (!b1.a(y0Var, j10) || (xVar = ((a1) y0Var).f11417h) == null) {
            return;
        }
        xVar.b();
    }

    @Override // h0.c1
    public final void e(long j10) {
        c0 c0Var = (c0) this.f10939c.b();
        if (c0Var == null || !c0Var.h()) {
            return;
        }
        y0 y0Var = this.f10940d;
        if (b1.a(y0Var, this.f10941e)) {
            long jI = p1.b.i(this.f10938b, j10);
            this.f10938b = jI;
            long jI2 = p1.b.i(this.f10937a, jI);
            if (((a1) y0Var).b(c0Var, jI2, this.f10937a, t.f11633e, true)) {
                this.f10937a = jI2;
                this.f10938b = 0L;
            }
        }
    }

    @Override // h0.c1
    public final void onCancel() {
        x xVar;
        long j10 = this.f10941e;
        y0 y0Var = this.f10940d;
        if (!b1.a(y0Var, j10) || (xVar = ((a1) y0Var).f11417h) == null) {
            return;
        }
        xVar.b();
    }

    @Override // h0.c1
    public final void c() {
    }

    @Override // h0.c1
    public final void d() {
    }
}
