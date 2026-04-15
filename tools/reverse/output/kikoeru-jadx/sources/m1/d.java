package m1;

import g2.c0;
import i2.d2;
import i2.f;
import i2.y;
import i7.p2;
import j1.p;
import jc.l;
import pc.f0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p implements d2, y {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f14023o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d f14024p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f14025q;

    public final boolean B0(p2 p2Var) {
        d dVar = this.f14023o;
        if (dVar != null) {
            return dVar.B0(p2Var);
        }
        d dVar2 = this.f14024p;
        if (dVar2 != null) {
            return dVar2.B0(p2Var);
        }
        return false;
    }

    public final void C0(p2 p2Var) {
        d dVar = this.f14024p;
        if (dVar != null) {
            dVar.C0(p2Var);
            return;
        }
        d dVar2 = this.f14023o;
        if (dVar2 != null) {
            dVar2.C0(p2Var);
        }
    }

    public final void D0(p2 p2Var) {
        d dVar = this.f14024p;
        if (dVar != null) {
            dVar.D0(p2Var);
        }
        d dVar2 = this.f14023o;
        if (dVar2 != null) {
            dVar2.D0(p2Var);
        }
        this.f14023o = null;
    }

    public final void E0(p2 p2Var) {
        d2 d2Var;
        d dVar;
        d dVar2 = this.f14023o;
        if (dVar2 == null || !f0.d(dVar2, a.a.F(p2Var))) {
            if (this.f9690a.f9703n) {
                jc.y yVar = new jc.y();
                f.C(this, new cg.b(yVar, this, p2Var, 10));
                d2Var = (d2) yVar.f10838a;
            } else {
                d2Var = null;
            }
            dVar = (d) d2Var;
        } else {
            dVar = dVar2;
        }
        if (dVar != null && dVar2 == null) {
            dVar.C0(p2Var);
            dVar.E0(p2Var);
            d dVar3 = this.f14024p;
            if (dVar3 != null) {
                dVar3.D0(p2Var);
            }
        } else if (dVar == null && dVar2 != null) {
            d dVar4 = this.f14024p;
            if (dVar4 != null) {
                dVar4.C0(p2Var);
                dVar4.E0(p2Var);
            }
            dVar2.D0(p2Var);
        } else if (!l.a(dVar, dVar2)) {
            if (dVar != null) {
                dVar.C0(p2Var);
                dVar.E0(p2Var);
            }
            if (dVar2 != null) {
                dVar2.D0(p2Var);
            }
        } else if (dVar != null) {
            dVar.E0(p2Var);
        } else {
            d dVar5 = this.f14024p;
            if (dVar5 != null) {
                dVar5.E0(p2Var);
            }
        }
        this.f14023o = dVar;
    }

    public final void F0(p2 p2Var) {
        d dVar = this.f14024p;
        if (dVar != null) {
            dVar.F0(p2Var);
            return;
        }
        d dVar2 = this.f14023o;
        if (dVar2 != null) {
            dVar2.F0(p2Var);
        }
    }

    @Override // i2.d2
    public final Object k() {
        return c.f14022a;
    }

    @Override // i2.y
    public final void m(long j10) {
        this.f14025q = j10;
    }

    @Override // j1.p
    public final void t0() {
        this.f14024p = null;
        this.f14023o = null;
    }

    @Override // i2.y
    public final /* synthetic */ void B(c0 c0Var) {
    }
}
