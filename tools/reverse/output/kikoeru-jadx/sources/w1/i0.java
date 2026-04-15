package w1;

import i2.l0;
import q.t0;
import r.y1;
import x0.b1;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends v1.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1 f23235f = x0.v.v(new p1.e(0));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f23236g = x0.v.v(Boolean.FALSE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f23237h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b1 f23238i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f23239j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q1.k f23240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23241l;

    public i0(c cVar) {
        e0 e0Var = new e0(cVar);
        e0Var.f23175f = new r2.a(12, this);
        this.f23237h = e0Var;
        this.f23238i = new b1(0);
        this.f23239j = 1.0f;
        this.f23241l = -1;
    }

    @Override // v1.b
    public final boolean b(float f10) {
        this.f23239j = f10;
        return true;
    }

    @Override // v1.b
    public final boolean e(q1.k kVar) {
        this.f23240k = kVar;
        return true;
    }

    @Override // v1.b
    public final long h() {
        return ((p1.e) this.f23235f.getValue()).f16495a;
    }

    @Override // v1.b
    public final void i(l0 l0Var) {
        s1.b bVar = l0Var.f8782a;
        q1.k kVar = this.f23240k;
        e0 e0Var = this.f23237h;
        if (kVar == null) {
            kVar = (q1.k) e0Var.f23176g.getValue();
        }
        if (((Boolean) this.f23236g.getValue()).booleanValue() && l0Var.getLayoutDirection() == f3.m.f6668b) {
            long jC0 = bVar.c0();
            c7.e1 e1Var = bVar.f19346b;
            long jD = e1Var.D();
            e1Var.z().f();
            try {
                ((y1) e1Var.f3618b).g0(-1.0f, 1.0f, jC0);
                e0Var.e(l0Var, this.f23239j, kVar);
            } finally {
                t0.L(e1Var, jD);
            }
        } else {
            e0Var.e(l0Var, this.f23239j, kVar);
        }
        this.f23241l = this.f23238i.e();
    }
}
