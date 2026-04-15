package xf;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f25020a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uf.h f25021b = ud.e.h("kotlinx.serialization.json.JsonNull", uf.j.f21704b, new uf.g[0]);

    @Override // sf.a
    public final uf.g a() {
        return f25021b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        ua.j.e(bVar);
        if (bVar.v()) {
            throw new yf.h("Expected 'null' literal");
        }
        return v.INSTANCE;
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        jc.l.e((v) obj, "value");
        ua.j.d(tVar);
        tVar.p();
    }
}
