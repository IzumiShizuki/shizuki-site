package q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1.b f17487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f17488b;

    public z0(b1 b1Var, t1.b bVar) {
        this.f17488b = b1Var;
        this.f17487a = bVar;
    }

    @Override // q.x0
    public final void b(i2.l0 l0Var) {
        b1 b1Var = this.f17488b;
        if (((Boolean) b1Var.f17240p.b()).booleanValue()) {
            g2.c0 c0Var = b1Var.f17239o.f17419g;
            if (c0Var == null) {
                jc.l.k("root");
                throw null;
            }
            long jO = c0Var.o(i2.f.x(b1Var), 0L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jO >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jO & 4294967295L));
            ic.n nVar = b1Var.f17241q;
            f3.m layoutDirection = l0Var.getLayoutDirection();
            s1.b bVar = l0Var.f8782a;
            q1.e0 e0Var = (q1.e0) nVar.q(layoutDirection, i2.f.y(b1Var).f8766y);
            t1.b bVar2 = this.f17487a;
            if (e0Var == null) {
                ((r.y1) bVar.f19346b.f3618b).i0(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    u3.x0.k(l0Var, bVar2);
                    return;
                } finally {
                }
            }
            c7.e1 e1Var = bVar.f19346b;
            long jD = e1Var.D();
            e1Var.z().f();
            try {
                ((c7.e1) ((r.y1) e1Var.f3618b).f18634b).z().n(e0Var);
                ((r.y1) bVar.f19346b.f3618b).i0(fIntBitsToFloat, fIntBitsToFloat2);
                try {
                    u3.x0.k(l0Var, bVar2);
                } finally {
                }
            } finally {
                t0.L(e1Var, jD);
            }
        }
    }

    @Override // q.x0
    public final float e() {
        return this.f17488b.f17242r.e();
    }
}
