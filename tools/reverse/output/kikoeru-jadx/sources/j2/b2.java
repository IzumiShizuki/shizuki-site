package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements j1.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.a1 f9731a = new x0.a1(1.0f);

    @Override // j1.r
    public final float D() {
        return this.f9731a.e();
    }

    @Override // yb.h
    public final yb.h G(yb.h hVar) {
        return ud.b.C(this, hVar);
    }

    @Override // yb.h
    public final yb.h L(yb.g gVar) {
        return ud.b.z(this, gVar);
    }

    @Override // yb.h
    public final yb.f R(yb.g gVar) {
        return ud.b.o(this, gVar);
    }

    @Override // yb.f
    public final yb.g getKey() {
        return j1.c.f9677p;
    }

    @Override // yb.h
    public final Object y(ic.n nVar, Object obj) {
        return nVar.q(obj, this);
    }
}
