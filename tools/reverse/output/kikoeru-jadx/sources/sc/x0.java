package sc;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f19911d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f19912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f19913c;

    public x0(Class cls) {
        jc.l.e(cls, "jClass");
        this.f19912b = cls;
        this.f19913c = ub.a.c(ub.i.f21540a, new t0(this, 0));
    }

    @Override // jc.e
    public final Class b() {
        return this.f19912b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x0) {
            return jc.l.a(this.f19912b, ((x0) obj).f19912b);
        }
        return false;
    }

    @Override // sc.i0
    public final Collection f() {
        return vb.r.f22819a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // sc.i0
    public final Collection g(be.e eVar) {
        z1 z1Var = ((w0) this.f19913c.getValue()).f19902d;
        pc.u uVar = w0.f19900g[1];
        Object objB = z1Var.b();
        jc.l.d(objB, "getValue(...)");
        return ((le.o) objB).f(eVar, gd.b.f7515b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ub.h] */
    @Override // sc.i0
    public final yc.k0 h(int i10) {
        ub.q qVar = (ub.q) ((w0) this.f19913c.getValue()).f19904f.getValue();
        if (qVar == null) {
            return null;
        }
        ae.f fVar = (ae.f) qVar.f21553a;
        wd.f0 f0Var = (wd.f0) qVar.f21554b;
        yd.e eVar = (yd.e) qVar.f21555c;
        ce.o oVar = zd.j.f26816n;
        jc.l.d(oVar, "packageLocalVariable");
        wd.j0 j0Var = (wd.j0) vb.w.n(f0Var, oVar, i10);
        if (j0Var == null) {
            return null;
        }
        wd.z0 z0Var = f0Var.f23673g;
        jc.l.d(z0Var, "getTypeTable(...)");
        return (yc.k0) f2.f(this.f19912b, j0Var, fVar, new bd.f0(z0Var), eVar, w.f19898c);
    }

    public final int hashCode() {
        return this.f19912b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ub.h] */
    @Override // sc.i0
    public final Class j() {
        Class cls = (Class) ((w0) this.f19913c.getValue()).f19903e.getValue();
        return cls == null ? this.f19912b : cls;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // sc.i0
    public final Collection k(be.e eVar) {
        z1 z1Var = ((w0) this.f19913c.getValue()).f19902d;
        pc.u uVar = w0.f19900g[1];
        Object objB = z1Var.b();
        jc.l.d(objB, "getValue(...)");
        return ((le.o) objB).b(eVar, gd.b.f7515b);
    }

    public final String toString() {
        return "file class " + ed.d.a(this.f19912b).a();
    }
}
