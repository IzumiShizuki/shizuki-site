package xf;

import ce.j0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f25013a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uf.h f25014b = ud.e.f("kotlinx.serialization.json.JsonElement", uf.c.f21681c, new uf.g[0], new t9.c(19));

    @Override // sf.a
    public final uf.g a() {
        return f25014b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        return ua.j.e(bVar).l();
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        m mVar = (m) obj;
        jc.l.e(mVar, "value");
        ua.j.d(tVar);
        if (mVar instanceof c0) {
            tVar.s(d0.f24991a, mVar);
        } else if (mVar instanceof y) {
            tVar.s(a0.f24985a, mVar);
        } else {
            if (!(mVar instanceof e)) {
                throw new j0();
            }
            tVar.s(g.f24997a, mVar);
        }
    }
}
