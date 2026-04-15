package sc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class u implements pc.b, x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f19878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f19879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f19880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19881d;

    public u() {
        nd.h.r(null, new r(this, 0));
        this.f19878a = nd.h.r(null, new r(this, 2));
        this.f19879b = nd.h.r(null, new r(this, 3));
        this.f19880c = nd.h.r(null, new r(this, 4));
        nd.h.r(null, new r(this, 5));
        nd.h.r(null, new r(this, 6));
        this.f19881d = ub.a.c(ub.i.f21540a, new r(this, 7));
    }

    public final Object h(Object... objArr) throws qc.a {
        try {
            return i().d(objArr);
        } catch (IllegalAccessException e10) {
            throw new qc.a(e10);
        }
    }

    public abstract tc.g i();

    public abstract i0 j();

    public abstract tc.g m();

    @Override // pc.b
    public final pc.v n() {
        Object objB = this.f19880c.b();
        jc.l.d(objB, "invoke(...)");
        return (pc.v) objB;
    }

    @Override // pc.b
    public final List o() {
        Object objB = this.f19879b.b();
        jc.l.d(objB, "invoke(...)");
        return (List) objB;
    }

    public abstract yc.c r();

    public final boolean s() {
        return jc.l.a(getName(), "<init>") && j().b().isAnnotation();
    }

    public abstract boolean t();
}
