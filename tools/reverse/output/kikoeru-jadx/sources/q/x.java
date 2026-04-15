package q;

import x0.n2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f17471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.q1 f17472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0.e1 f17473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0.e1 f17474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r.z0 f17475e = y.f17478a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x0.e1 f17476f = x0.v.v(null);

    public x(m1 m1Var, r.q1 q1Var, r.j1 j1Var, r1 r1Var) {
        this.f17471a = m1Var;
        this.f17472b = q1Var;
        this.f17473c = x0.v.v(j1Var);
        this.f17474d = x0.v.v(r1Var);
    }

    public final void a(p1.c cVar, p1.c cVar2) {
        if (this.f17471a.g()) {
            x0.e1 e1Var = this.f17476f;
            if (((n2) e1Var.getValue()) == null) {
                ((r1) this.f17474d.getValue()).getClass();
                this.f17475e = t1.f17454a;
            }
            e1Var.setValue(((r.j1) this.f17473c.getValue()).a(new a0.f0(29, this), new cg.b(this, cVar2, cVar, 13)));
        }
    }

    public final boolean b() {
        return ((Boolean) this.f17472b.f18542d.getValue()).booleanValue();
    }

    public final p1.c c() {
        n2 n2Var;
        if (!this.f17471a.g() || (n2Var = (n2) this.f17476f.getValue()) == null) {
            return null;
        }
        return (p1.c) n2Var.getValue();
    }
}
