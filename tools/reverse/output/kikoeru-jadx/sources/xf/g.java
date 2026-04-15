package xf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f24997a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f24998b = f.f24994b;

    @Override // sf.a
    public final uf.g a() {
        return f24998b;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        ua.j.e(bVar);
        return new e((List) new wf.d(o.f25013a, 0).b(bVar));
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        e eVar = (e) obj;
        jc.l.e(eVar, "value");
        ua.j.d(tVar);
        new wf.d(o.f25013a, 0).d(tVar, eVar);
    }
}
